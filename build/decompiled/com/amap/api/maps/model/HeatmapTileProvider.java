package com.amap.api.maps.model;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap.Config;
import android.support.v4.util.LongSparseArray;
import com.amap.api.mapcore.util.em;
import com.autonavi.amap.mapcore.DPoint;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class HeatmapTileProvider implements TileProvider {
   public static final int DEFAULT_RADIUS = 12;
   public static final double DEFAULT_OPACITY = 0.6D;
   private static final int[] DEFAULT_GRADIENT_COLORS = new int[]{Color.rgb(102, 225, 0), Color.rgb(255, 0, 0)};
   private static final float[] DEFAULT_GRADIENT_START_POINTS = new float[]{0.2F, 1.0F};
   public static final Gradient DEFAULT_GRADIENT;
   private static final int TILE_DIM = 256;
   private static final int SCREEN_SIZE = 1280;
   private static final int DEFAULT_MIN_ZOOM = 5;
   private static final int DEFAULT_MAX_ZOOM = 11;
   private static final int MAX_ZOOM_LEVEL = 21;
   private static final int MIN_RADIUS = 10;
   private static final int MAX_RADIUS = 50;
   private a mTree;
   private Collection<WeightedLatLng> mData;
   private em mBounds;
   private int mRadius;
   private Gradient mGradient;
   private int[] mColorMap;
   private double[] mKernel;
   private double mOpacity;
   private double[] mMaxIntensity;

   private HeatmapTileProvider(HeatmapTileProvider$Builder var1) {
      this.mData = HeatmapTileProvider$Builder.a(var1);
      this.mRadius = HeatmapTileProvider$Builder.b(var1);
      this.mGradient = HeatmapTileProvider$Builder.c(var1);
      if (this.mGradient == null || !this.mGradient.isAvailable()) {
         this.mGradient = DEFAULT_GRADIENT;
      }

      this.mOpacity = HeatmapTileProvider$Builder.d(var1);
      this.mKernel = a(this.mRadius, (double)this.mRadius / 3.0D);
      this.a(this.mGradient);
      this.c(this.mData);
   }

   private void c(Collection<WeightedLatLng> var1) {
      try {
         ArrayList var2 = new ArrayList();
         Iterator var3 = var1.iterator();

         WeightedLatLng var4;
         while(var3.hasNext()) {
            var4 = (WeightedLatLng)var3.next();
            if (var4.latLng.latitude < 85.0D && var4.latLng.latitude > -85.0D) {
               var2.add(var4);
            }
         }

         this.mData = var2;
         this.mBounds = a(this.mData);
         this.mTree = new a(this.mBounds);
         var3 = this.mData.iterator();

         while(var3.hasNext()) {
            var4 = (WeightedLatLng)var3.next();
            this.mTree.a(var4);
         }

         this.mMaxIntensity = this.a(this.mRadius);
      } catch (Throwable var5) {
         var5.printStackTrace();
      }

   }

   private static Collection<WeightedLatLng> d(Collection<LatLng> var0) {
      ArrayList var1 = new ArrayList();
      Iterator var2 = var0.iterator();

      while(var2.hasNext()) {
         LatLng var3 = (LatLng)var2.next();
         var1.add(new WeightedLatLng(var3));
      }

      return var1;
   }

   public Tile getTile(int var1, int var2, int var3) {
      double var4 = 1.0D / Math.pow(2.0D, (double)var3);
      double var6 = var4 * (double)this.mRadius / 256.0D;
      double var8 = var4 + 2.0D * var6;
      double var10 = var8 / (double)(256 + this.mRadius * 2);
      double var12 = (double)var1 * var4 - var6;
      double var14 = (double)(var1 + 1) * var4 + var6;
      double var16 = (double)var2 * var4 - var6;
      double var18 = (double)(var2 + 1) * var4 + var6;
      double var20 = 0.0D;
      Object var22 = new ArrayList();
      em var23;
      if (var12 < 0.0D) {
         var23 = new em(var12 + 1.0D, 1.0D, var16, var18);
         var20 = -1.0D;
         var22 = this.mTree.a(var23);
      } else if (var14 > 1.0D) {
         var23 = new em(0.0D, var14 - 1.0D, var16, var18);
         var20 = 1.0D;
         var22 = this.mTree.a(var23);
      }

      var23 = new em(var12, var14, var16, var18);
      em var24 = new em(this.mBounds.a - var6, this.mBounds.c + var6, this.mBounds.b - var6, this.mBounds.d + var6);
      if (!var23.a(var24)) {
         return TileProvider.NO_TILE;
      } else {
         Collection var25 = this.mTree.a(var23);
         if (var25.isEmpty()) {
            return TileProvider.NO_TILE;
         } else {
            double[][] var26 = new double[256 + this.mRadius * 2][256 + this.mRadius * 2];

            Iterator var27;
            WeightedLatLng var28;
            DPoint var29;
            int var30;
            int var31;
            for(var27 = var25.iterator(); var27.hasNext(); var26[var30][var31] += var28.intensity) {
               var28 = (WeightedLatLng)var27.next();
               var29 = var28.getPoint();
               var30 = (int)((var29.x - var12) / var10);
               var31 = (int)((var29.y - var16) / var10);
            }

            for(var27 = ((Collection)var22).iterator(); var27.hasNext(); var26[var30][var31] += var28.intensity) {
               var28 = (WeightedLatLng)var27.next();
               var29 = var28.getPoint();
               var30 = (int)((var29.x + var20 - var12) / var10);
               var31 = (int)((var29.y - var16) / var10);
            }

            double[][] var32 = a(var26, this.mKernel);
            Bitmap var33 = a(var32, this.mColorMap, this.mMaxIntensity[var3]);
            return a(var33);
         }
      }
   }

   private void a(Gradient var1) {
      this.mGradient = var1;
      this.mColorMap = var1.generateColorMap(this.mOpacity);
   }

   private double[] a(int var1) {
      double[] var2 = new double[21];

      int var3;
      for(var3 = 5; var3 < 11; ++var3) {
         var2[var3] = a(this.mData, this.mBounds, var1, (int)(1280.0D * Math.pow(2.0D, (double)var3)));
         if (var3 == 5) {
            for(int var4 = 0; var4 < var3; ++var4) {
               var2[var4] = var2[var3];
            }
         }
      }

      for(var3 = 11; var3 < 21; ++var3) {
         var2[var3] = var2[10];
      }

      return var2;
   }

   private static Tile a(Bitmap var0) {
      ByteArrayOutputStream var1 = new ByteArrayOutputStream();
      var0.compress(CompressFormat.PNG, 100, var1);
      byte[] var2 = var1.toByteArray();
      return Tile.obtain(256, 256, var2);
   }

   static em a(Collection<WeightedLatLng> var0) {
      Iterator var1 = var0.iterator();
      WeightedLatLng var2 = (WeightedLatLng)var1.next();
      double var3 = var2.getPoint().x;
      double var5 = var2.getPoint().x;
      double var7 = var2.getPoint().y;
      double var9 = var2.getPoint().y;

      while(var1.hasNext()) {
         WeightedLatLng var11 = (WeightedLatLng)var1.next();
         double var12 = var11.getPoint().x;
         double var14 = var11.getPoint().y;
         if (var12 < var3) {
            var3 = var12;
         }

         if (var12 > var5) {
            var5 = var12;
         }

         if (var14 < var7) {
            var7 = var14;
         }

         if (var14 > var9) {
            var9 = var14;
         }
      }

      return new em(var3, var5, var7, var9);
   }

   static double[] a(int var0, double var1) {
      double[] var3 = new double[var0 * 2 + 1];

      for(int var4 = -var0; var4 <= var0; ++var4) {
         var3[var4 + var0] = Math.exp((double)(-var4 * var4) / (2.0D * var1 * var1));
      }

      return var3;
   }

   static double[][] a(double[][] var0, double[] var1) {
      int var2 = (int)Math.floor((double)var1.length / 2.0D);
      int var3 = var0.length;
      int var4 = var3 - 2 * var2;
      int var5 = var2;
      int var6 = var2 + var4 - 1;
      double[][] var7 = new double[var3][var3];

      int var8;
      int var9;
      int var12;
      double var13;
      for(var8 = 0; var8 < var3; ++var8) {
         for(var9 = 0; var9 < var3; ++var9) {
            var13 = var0[var8][var9];
            if (var13 != 0.0D) {
               int var11 = (var6 < var8 + var2 ? var6 : var8 + var2) + 1;
               var12 = var5 > var8 - var2 ? var5 : var8 - var2;

               for(int var10 = var12; var10 < var11; ++var10) {
                  var7[var10][var9] += var13 * var1[var10 - (var8 - var2)];
               }
            }
         }
      }

      double[][] var15 = new double[var4][var4];

      for(var8 = var5; var8 < var6 + 1; ++var8) {
         for(var9 = 0; var9 < var3; ++var9) {
            var13 = var7[var8][var9];
            if (var13 != 0.0D) {
               int var17 = (var6 < var9 + var2 ? var6 : var9 + var2) + 1;
               var12 = var5 > var9 - var2 ? var5 : var9 - var2;

               for(int var16 = var12; var16 < var17; ++var16) {
                  var15[var8 - var2][var16 - var2] += var13 * var1[var16 - (var9 - var2)];
               }
            }
         }
      }

      return var15;
   }

   static Bitmap a(double[][] var0, int[] var1, double var2) {
      int var4 = var1[var1.length - 1];
      double var5 = (double)(var1.length - 1) / var2;
      int var7 = var0.length;
      int[] var14 = new int[var7 * var7];

      for(int var8 = 0; var8 < var7; ++var8) {
         for(int var9 = 0; var9 < var7; ++var9) {
            double var12 = var0[var9][var8];
            int var10 = var8 * var7 + var9;
            int var11 = (int)(var12 * var5);
            if (var12 != 0.0D) {
               if (var11 < var1.length) {
                  var14[var10] = var1[var11];
               } else {
                  var14[var10] = var4;
               }
            } else {
               var14[var10] = 0;
            }
         }
      }

      Bitmap var15 = Bitmap.createBitmap(var7, var7, Config.ARGB_8888);
      var15.setPixels(var14, 0, var7, 0, 0, var7, var7);
      return var15;
   }

   static double a(Collection<WeightedLatLng> var0, em var1, int var2, int var3) {
      double var4 = var1.a;
      double var6 = var1.c;
      double var8 = var1.b;
      double var10 = var1.d;
      double var12 = var6 - var4 > var10 - var8 ? var6 - var4 : var10 - var8;
      int var14 = (int)((double)(var3 / (2 * var2)) + 0.5D);
      double var15 = (double)var14 / var12;
      LongSparseArray var17 = new LongSparseArray();
      double var22 = 0.0D;
      Iterator var24 = var0.iterator();

      while(var24.hasNext()) {
         WeightedLatLng var25 = (WeightedLatLng)var24.next();
         double var18 = var25.getPoint().x;
         double var20 = var25.getPoint().y;
         int var26 = (int)((var18 - var4) * var15);
         int var27 = (int)((var20 - var8) * var15);
         LongSparseArray var28 = (LongSparseArray)var17.get((long)var26);
         if (var28 == null) {
            var28 = new LongSparseArray();
            var17.put((long)var26, var28);
         }

         Double var29 = (Double)var28.get((long)var27);
         if (var29 == null) {
            var29 = 0.0D;
         }

         var29 = var29.doubleValue() + var25.intensity;
         var28.put((long)var27, var29);
         if (var29.doubleValue() > var22) {
            var22 = var29.doubleValue();
         }
      }

      return var22;
   }

   public int getTileHeight() {
      return 256;
   }

   public int getTileWidth() {
      return 256;
   }

   static {
      DEFAULT_GRADIENT = new Gradient(DEFAULT_GRADIENT_COLORS, DEFAULT_GRADIENT_START_POINTS);
   }
}
