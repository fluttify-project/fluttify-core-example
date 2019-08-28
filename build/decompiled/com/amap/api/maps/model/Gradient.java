package com.amap.api.maps.model;

import android.graphics.Color;
import android.util.Log;
import com.amap.api.maps.AMapException;
import java.util.HashMap;

public class Gradient {
   private static final int DEFAULT_COLOR_MAP_SIZE = 1000;
   private int mColorMapSize;
   private int[] mColors;
   private float[] mStartPoints;
   private boolean isAvailable;

   public Gradient(int[] var1, float[] var2) {
      this(var1, var2, 1000);
   }

   private Gradient(int[] var1, float[] var2, int var3) {
      this.isAvailable = true;

      try {
         if (var1 == null || var2 == null) {
            throw new AMapException("colors and startPoints should not be null");
         }

         if (var1.length != var2.length) {
            throw new AMapException("colors and startPoints should be same length");
         }

         if (var1.length == 0) {
            throw new AMapException("No colors have been defined");
         }

         for(int var4 = 1; var4 < var2.length; ++var4) {
            if (var2[var4] <= var2[var4 - 1]) {
               throw new AMapException("startPoints should be in increasing order");
            }
         }

         this.mColorMapSize = var3;
         this.mColors = new int[var1.length];
         this.mStartPoints = new float[var2.length];
         System.arraycopy(var1, 0, this.mColors, 0, var1.length);
         System.arraycopy(var2, 0, this.mStartPoints, 0, var2.length);
         this.isAvailable = true;
      } catch (AMapException var5) {
         this.isAvailable = false;
         Log.e("amap", var5.getErrorMessage());
         var5.printStackTrace();
      }

   }

   private HashMap<Integer, Gradient$a> a() {
      HashMap var1 = new HashMap(32);
      int var2;
      if (this.mStartPoints[0] != 0.0F) {
         var2 = Color.argb(0, Color.red(this.mColors[0]), Color.green(this.mColors[0]), Color.blue(this.mColors[0]));
         var1.put(Integer.valueOf(0), new Gradient$a(var2, this.mColors[0], (float)this.mColorMapSize * this.mStartPoints[0], (Gradient$1)null));
      }

      for(var2 = 1; var2 < this.mColors.length; ++var2) {
         var1.put((int)((float)this.mColorMapSize * this.mStartPoints[var2 - 1]), new Gradient$a(this.mColors[var2 - 1], this.mColors[var2], (float)this.mColorMapSize * (this.mStartPoints[var2] - this.mStartPoints[var2 - 1]), (Gradient$1)null));
      }

      if (this.mStartPoints[this.mStartPoints.length - 1] != 1.0F) {
         var2 = this.mStartPoints.length - 1;
         var1.put((int)((float)this.mColorMapSize * this.mStartPoints[var2]), new Gradient$a(this.mColors[var2], this.mColors[var2], (float)this.mColorMapSize * (1.0F - this.mStartPoints[var2]), (Gradient$1)null));
      }

      return var1;
   }

   protected int[] generateColorMap(double var1) {
      HashMap var3 = this.a();
      int[] var4 = new int[this.mColorMapSize];
      Gradient$a var5 = (Gradient$a)var3.get(Integer.valueOf(0));
      int var6 = 0;

      int var7;
      for(var7 = 0; var7 < this.mColorMapSize; ++var7) {
         if (var3.containsKey(var7)) {
            var5 = (Gradient$a)var3.get(var7);
            var6 = var7;
         }

         float var8 = (float)(var7 - var6) / Gradient$a.a(var5);
         var4[var7] = a(Gradient$a.b(var5), Gradient$a.c(var5), var8);
      }

      if (var1 != 1.0D) {
         for(var7 = 0; var7 < this.mColorMapSize; ++var7) {
            int var9 = var4[var7];
            var4[var7] = Color.argb((int)((double)Color.alpha(var9) * var1), Color.red(var9), Color.green(var9), Color.blue(var9));
         }
      }

      return var4;
   }

   static int a(int var0, int var1, float var2) {
      int var3 = (int)((float)(Color.alpha(var1) - Color.alpha(var0)) * var2 + (float)Color.alpha(var0));
      float[] var4 = new float[3];
      Color.RGBToHSV(Color.red(var0), Color.green(var0), Color.blue(var0), var4);
      float[] var5 = new float[3];
      Color.RGBToHSV(Color.red(var1), Color.green(var1), Color.blue(var1), var5);
      short var6 = 180;
      short var7 = 360;
      if (var4[0] - var5[0] > (float)var6) {
         var5[0] += (float)var7;
      } else if (var5[0] - var4[0] > (float)var6) {
         var4[0] += (float)var7;
      }

      float[] var8 = new float[3];
      byte var9 = 3;

      for(int var10 = 0; var10 < var9; ++var10) {
         var8[var10] = (var5[var10] - var4[var10]) * var2 + var4[var10];
      }

      return Color.HSVToColor(var3, var8);
   }

   protected boolean isAvailable() {
      return this.isAvailable;
   }
}
