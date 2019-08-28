package com.amap.api.mapcore.util;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap.Config;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.NetworkInfo.State;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.os.Build.VERSION;
import android.util.Log;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.MeasureSpec;
import android.widget.TextView;
import com.amap.api.maps.AMapUtils;
import com.amap.api.maps.model.BaseHoleOptions;
import com.amap.api.maps.model.CircleHoleOptions;
import com.amap.api.maps.model.LatLng;
import com.amap.api.maps.model.LatLngBounds;
import com.amap.api.maps.model.PolygonHoleOptions;
import com.amap.api.maps.utils.SpatialRelationUtil;
import com.autonavi.ae.gmap.GLMapState;
import com.autonavi.amap.mapcore.AbstractCameraUpdateMessage;
import com.autonavi.amap.mapcore.DPoint;
import com.autonavi.amap.mapcore.FPoint;
import com.autonavi.amap.mapcore.FPoint3;
import com.autonavi.amap.mapcore.FileUtil;
import com.autonavi.amap.mapcore.IPoint;
import com.autonavi.amap.mapcore.MapConfig;
import com.autonavi.amap.mapcore.VirtualEarthProjection;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class fi {
   private static FPoint[] a = new FPoint[]{FPoint.obtain(), FPoint.obtain(), FPoint.obtain(), FPoint.obtain()};
   private static List<Float> b = new ArrayList(4);
   private static List<Float> c = new ArrayList(4);

   public static Bitmap a(Context var0, String var1) {
      try {
         AssetManager var2 = fc.a(var0);
         InputStream var3 = var2.open(var1);
         Bitmap var4 = BitmapFactory.decodeStream(var3);
         var3.close();
         return var4;
      } catch (Throwable var5) {
         ht.c(var5, "Util", "fromAsset");
         return null;
      }
   }

   public static void a(Drawable var0) {
      if (var0 != null) {
         var0.setCallback((Callback)null);
         var0 = null;
      }

   }

   public static String a(String var0, Object var1) {
      return var0 + "=" + var1;
   }

   public static float a(float var0, float var1) {
      float var2 = var0;
      if (var0 > 40.0F) {
         boolean var3 = false;
         byte var4;
         if (var1 <= 15.0F) {
            var4 = 40;
         } else if (var1 <= 16.0F) {
            var4 = 56;
         } else if (var1 <= 17.0F) {
            var4 = 66;
         } else if (var1 <= 18.0F) {
            var4 = 74;
         } else if (var1 <= 18.0F) {
            var4 = 78;
         } else {
            var4 = 80;
         }

         var2 = var0 > (float)var4 ? (float)var4 : var0;
      }

      return var2;
   }

   public static float a(MapConfig var0, float var1) {
      if (var0 != null) {
         if (var1 > var0.maxZoomLevel) {
            var1 = var0.maxZoomLevel;
         } else if (var1 < var0.minZoomLevel) {
            var1 = var0.minZoomLevel;
         }
      } else if (var1 > 20.0F) {
         var1 = 20.0F;
      } else if (var1 < 3.0F) {
         var1 = 3.0F;
      }

      return var1;
   }

   public static FloatBuffer a(float[] var0) {
      try {
         ByteBuffer var1 = ByteBuffer.allocateDirect(var0.length * 4);
         var1.order(ByteOrder.nativeOrder());
         FloatBuffer var2 = var1.asFloatBuffer();
         var2.put(var0);
         var2.position(0);
         return var2;
      } catch (Throwable var3) {
         ht.c(var3, "Util", "makeFloatBuffer1");
         var3.printStackTrace();
         return null;
      }
   }

   public static FloatBuffer a(float[] var0, FloatBuffer var1) {
      try {
         var1.clear();
         var1.put(var0);
         var1.position(0);
         return var1;
      } catch (Throwable var3) {
         ht.c(var3, "Util", "makeFloatBuffer2");
         var3.printStackTrace();
         return null;
      }
   }

   public static int a(int var0, int var1) {
      Bitmap var2 = Bitmap.createBitmap(var0, var1, Config.ARGB_8888);
      return a(0, var2, true);
   }

   public static int a(Bitmap var0) {
      return a(var0, false);
   }

   public static int a(Bitmap var0, boolean var1) {
      return a(0, var0, var1);
   }

   public static int a(int var0, Bitmap var1, boolean var2) {
      var0 = b(var0, var1, var2);
      if (var1 != null) {
         var1.recycle();
      }

      return var0;
   }

   public static int b(int var0, Bitmap var1, boolean var2) {
      if (var1 != null && !var1.isRecycled()) {
         if (var0 == 0) {
            int[] var3 = new int[]{0};
            GLES20.glGenTextures(1, var3, 0);
            var0 = var3[0];
         }

         GLES20.glActiveTexture(33984);
         GLES20.glBindTexture(3553, var0);
         GLES20.glTexParameterf(3553, 10241, 9729.0F);
         GLES20.glTexParameterf(3553, 10240, 9729.0F);
         if (var2) {
            GLES20.glTexParameterf(3553, 10242, 10497.0F);
            GLES20.glTexParameterf(3553, 10243, 10497.0F);
         } else {
            GLES20.glTexParameterf(3553, 10242, 33071.0F);
            GLES20.glTexParameterf(3553, 10243, 33071.0F);
         }

         GLUtils.texImage2D(3553, 0, var1, 0);
         return var0;
      } else {
         return 0;
      }
   }

   public static int a(int var0, Bitmap var1, int var2, int var3) {
      if (var1 != null && !var1.isRecycled()) {
         if (var0 == 0) {
            int[] var4 = new int[]{0};
            GLES20.glGenTextures(1, var4, 0);
            var0 = var4[0];
         }

         GLES20.glActiveTexture(33984);
         GLES20.glBindTexture(3553, var0);
         GLUtils.texSubImage2D(3553, 0, var2, var3, var1);
         return var0;
      } else {
         return 0;
      }
   }

   public static String a(String... var0) {
      StringBuilder var1 = new StringBuilder();
      int var2 = 0;
      String[] var3 = var0;
      int var4 = var0.length;

      for(int var5 = 0; var5 < var4; ++var5) {
         String var6 = var3[var5];
         var1.append(var6);
         if (var2 != var0.length - 1) {
            var1.append(",");
         }

         ++var2;
      }

      return var1.toString();
   }

   public static int a(Object[] var0) {
      return Arrays.hashCode(var0);
   }

   public static Bitmap a(Bitmap var0, float var1) {
      if (var0 == null) {
         return null;
      } else {
         int var2 = (int)((float)var0.getWidth() * var1);
         int var3 = (int)((float)var0.getHeight() * var1);
         Bitmap var4 = Bitmap.createScaledBitmap(var0, var2, var3, true);
         return var4;
      }
   }

   public static String a(Context var0) {
      File var1 = new File(FileUtil.getMapBaseStorage(var0), "data_v6");
      if (!var1.exists()) {
         var1.mkdir();
      }

      String var2 = var1.toString() + File.separator;
      File var3 = new File(var2);
      if (!var3.exists()) {
         var3.mkdir();
      }

      return var1.toString() + File.separator;
   }

   public static String b(Context var0) {
      return FileUtil.getMapBaseStorage(var0) + File.separator + "data" + File.separator;
   }

   public static String c(Context var0) {
      String var1 = a(var0);
      if (var1 == null) {
         return null;
      } else {
         File var2 = new File(var1, "VMAP2");
         if (!var2.exists()) {
            var2.mkdir();
         }

         return var2.toString() + File.separator;
      }
   }

   public static String a(int var0) {
      String var1;
      if (var0 < 1000) {
         var1 = var0 + "m";
      } else {
         var1 = var0 / 1000 + "km";
      }

      return var1;
   }

   public static boolean d(Context var0) {
      if (var0 == null) {
         return false;
      } else {
         ConnectivityManager var1 = (ConnectivityManager)var0.getSystemService("connectivity");
         if (var1 == null) {
            return false;
         } else {
            NetworkInfo var2 = var1.getActiveNetworkInfo();
            if (var2 == null) {
               return false;
            } else {
               State var3 = var2.getState();
               return var3 != null && var3 != State.DISCONNECTED && var3 != State.DISCONNECTING;
            }
         }
      }
   }

   public static boolean a() {
      return VERSION.SDK_INT >= 8;
   }

   public static boolean b() {
      return VERSION.SDK_INT >= 9;
   }

   public static boolean c() {
      return VERSION.SDK_INT >= 11;
   }

   public static boolean d() {
      return VERSION.SDK_INT >= 12;
   }

   public static void b(int var0) {
      GLES20.glDeleteTextures(1, new int[]{var0}, 0);
   }

   public static String a(InputStream var0) {
      String var1 = null;

      try {
         var1 = new String(b(var0), "utf-8");
      } catch (Throwable var3) {
         ht.c(var3, "Util", "decodeAssetResData");
         var3.printStackTrace();
      }

      return var1;
   }

   public static byte[] b(InputStream var0) throws IOException {
      ByteArrayOutputStream var1 = new ByteArrayOutputStream();
      byte[] var2 = new byte[2048];
      boolean var3 = true;

      int var5;
      while((var5 = var0.read(var2, 0, 2048)) != -1) {
         var1.write(var2, 0, var5);
      }

      Object var4 = null;
      return var1.toByteArray();
   }

   public static String a(File var0) {
      StringBuffer var1 = new StringBuffer();
      FileInputStream var2 = null;
      BufferedReader var3 = null;

      try {
         var2 = new FileInputStream(var0);
         var3 = new BufferedReader(new InputStreamReader(var2, "utf-8"));
         String var4 = null;

         while((var4 = var3.readLine()) != null) {
            var1.append(var4);
         }
      } catch (FileNotFoundException var109) {
         ht.c(var109, "Util", "readFile fileNotFound");
         var109.printStackTrace();
      } catch (IOException var110) {
         ht.c(var110, "Util", "readFile io");
         var110.printStackTrace();
      } finally {
         try {
            if (var2 != null) {
               var2.close();
            }
         } catch (IOException var107) {
            var107.printStackTrace();
         } finally {
            if (var3 != null) {
               try {
                  var3.close();
               } catch (IOException var106) {
                  var106.printStackTrace();
               }
            }

         }

      }

      return var1.toString();
   }

   public static boolean a(LatLng var0, List<LatLng> var1) {
      boolean var2 = false;
      int var3 = 0;
      double var8 = 180.0D;
      double var4 = var0.longitude;
      double var6 = var0.latitude;
      double var10 = var0.latitude;
      if (var1.size() < 3) {
         return false;
      } else {
         if (!((LatLng)var1.get(0)).equals(var1.get(var1.size() - 1))) {
            var1.add(var1.get(0));
         }

         for(int var12 = 0; var12 < var1.size() - 1; ++var12) {
            double var13 = ((LatLng)var1.get(var12)).longitude;
            double var15 = ((LatLng)var1.get(var12)).latitude;
            double var17 = ((LatLng)var1.get(var12 + 1)).longitude;
            double var19 = ((LatLng)var1.get(var12 + 1)).latitude;
            if (b(var4, var6, var13, var15, var17, var19)) {
               return true;
            }

            if (Math.abs(var19 - var15) >= 1.0E-9D) {
               if (b(var13, var15, var4, var6, var8, var10)) {
                  if (var15 > var19) {
                     ++var3;
                  }
               } else if (b(var17, var19, var4, var6, var8, var10)) {
                  if (var19 > var15) {
                     ++var3;
                  }
               } else if (a(var13, var15, var17, var19, var4, var6, var8, var10)) {
                  ++var3;
               }
            }
         }

         if (var3 % 2 != 0) {
            var2 = true;
         }

         return var2;
      }
   }

   public static double a(double var0, double var2, double var4, double var6, double var8, double var10) {
      return (var4 - var0) * (var10 - var2) - (var8 - var0) * (var6 - var2);
   }

   public static boolean b(double var0, double var2, double var4, double var6, double var8, double var10) {
      boolean var12 = false;
      if (Math.abs(a(var0, var2, var4, var6, var8, var10)) < 1.0E-9D && (var0 - var4) * (var0 - var8) <= 0.0D && (var2 - var6) * (var2 - var10) <= 0.0D) {
         var12 = true;
      }

      return var12;
   }

   public static boolean a(double var0, double var2, double var4, double var6, double var8, double var10, double var12, double var14) {
      boolean var16 = false;
      double var17 = (var4 - var0) * (var14 - var10) - (var6 - var2) * (var12 - var8);
      if (var17 != 0.0D) {
         double var19 = ((var2 - var10) * (var12 - var8) - (var0 - var8) * (var14 - var10)) / var17;
         double var21 = ((var2 - var10) * (var4 - var0) - (var0 - var8) * (var6 - var2)) / var17;
         if (var19 >= 0.0D && var19 <= 1.0D && var21 >= 0.0D && var21 <= 1.0D) {
            var16 = true;
         }
      }

      return var16;
   }

   public static boolean a(BaseHoleOptions var0, LatLng var1) {
      if (var0 instanceof CircleHoleOptions) {
         CircleHoleOptions var6 = (CircleHoleOptions)var0;
         LatLng var7 = var6.getCenter();
         double var4 = var6.getRadius();
         if (var7 == null) {
            return false;
         } else {
            return (double)AMapUtils.calculateLineDistance(var7, var1) <= var4;
         }
      } else {
         PolygonHoleOptions var2 = (PolygonHoleOptions)var0;
         List var3 = var2.getPoints();
         return var3 != null && var3.size() != 0 ? a(var1, var3) : false;
      }
   }

   public static List<FPoint> a(FPoint[] var0, List<FPoint> var1, boolean var2) {
      ArrayList var3 = new ArrayList();
      ArrayList var4 = new ArrayList(var1);

      for(byte var5 = 0; var5 < 4; ++var5) {
         var3.clear();
         int var6 = var4.size();

         int var7;
         for(var7 = 0; var7 < (var2 ? var6 : var6 - 1); ++var7) {
            FPoint var8 = (FPoint)var4.get(var7 % var6);
            FPoint var9 = (FPoint)var4.get((var7 + 1) % var6);
            if (var7 == 0 && a(var8, var0[var5], var0[(var5 + 1) % var0.length])) {
               var3.add(var8);
            }

            if (a(var8, var0[var5], var0[(var5 + 1) % var0.length])) {
               if (a(var9, var0[var5], var0[(var5 + 1) % var0.length])) {
                  var3.add(var9);
               } else {
                  var3.add(a(var0[var5], var0[(var5 + 1) % var0.length], var8, var9));
               }
            } else if (a(var9, var0[var5], var0[(var5 + 1) % var0.length])) {
               var3.add(a(var0[var5], var0[(var5 + 1) % var0.length], var8, var9));
               var3.add(var9);
            }
         }

         var4.clear();

         for(var7 = 0; var7 < var3.size(); ++var7) {
            var4.add(var3.get(var7));
         }
      }

      return var4;
   }

   public static List<FPoint> b(FPoint[] var0, List<FPoint> var1, boolean var2) {
      ArrayList var3 = new ArrayList();
      ArrayList var4 = new ArrayList(var1);

      for(byte var5 = 0; var5 < 4; ++var5) {
         var3.clear();
         int var6 = var4.size();

         int var7;
         for(var7 = 0; var7 < (var2 ? var6 : var6 - 1); ++var7) {
            FPoint3 var8 = (FPoint3)var4.get(var7 % var6);
            FPoint3 var9 = (FPoint3)var4.get((var7 + 1) % var6);
            if (var7 == 0 && a((FPoint)var8, (FPoint)var0[var5], (FPoint)var0[(var5 + 1) % var0.length])) {
               var3.add(var8);
            }

            if (a((FPoint)var8, (FPoint)var0[var5], (FPoint)var0[(var5 + 1) % var0.length])) {
               if (a((FPoint)var9, (FPoint)var0[var5], (FPoint)var0[(var5 + 1) % var0.length])) {
                  var3.add(var9);
               } else {
                  var3.add(a(var0[var5], var0[(var5 + 1) % var0.length], var8, var9, var9.colorIndex));
               }
            } else if (a((FPoint)var9, (FPoint)var0[var5], (FPoint)var0[(var5 + 1) % var0.length])) {
               var3.add(a(var0[var5], var0[(var5 + 1) % var0.length], var8, var9, var8.colorIndex));
               var3.add(var9);
            }
         }

         var4.clear();

         for(var7 = 0; var7 < var3.size(); ++var7) {
            var4.add(var3.get(var7));
         }
      }

      return var4;
   }

   public static FPoint[] a(u var0, boolean var1) {
      float var2 = var0.getSkyHeight();
      byte var3 = 0;
      byte var4 = 0;
      if (var1) {
         var3 = 100;
         var4 = 10;
      }

      FPoint var5 = FPoint.obtain();
      var0.a(-var3, (int)(var2 - (float)var4), (PointF)var5);
      a[0].set(var5.x, var5.y);
      FPoint var6 = FPoint.obtain();
      var0.a(var0.getMapWidth() + var3, (int)(var2 - (float)var4), (PointF)var6);
      a[1].set(var6.x, var6.y);
      FPoint var7 = FPoint.obtain();
      var0.a(var0.getMapWidth() + var3, var0.getMapHeight() + var3, (PointF)var7);
      a[2].set(var7.x, var7.y);
      FPoint var8 = FPoint.obtain();
      var0.a(-var3, var0.getMapHeight() + var3, (PointF)var8);
      a[3].set(var8.x, var8.y);
      var5.recycle();
      var6.recycle();
      var7.recycle();
      var8.recycle();
      return a;
   }

   private static FPoint3 a(FPoint var0, FPoint var1, FPoint3 var2, FPoint3 var3, int var4) {
      FPoint3 var5 = new FPoint3(0.0F, 0.0F, var4);
      double var6 = (double)((var1.y - var0.y) * (var0.x - var2.x) - (var1.x - var0.x) * (var0.y - var2.y));
      double var8 = (double)((var1.y - var0.y) * (var3.x - var2.x) - (var1.x - var0.x) * (var3.y - var2.y));
      var5.x = (float)((double)var2.x + (double)(var3.x - var2.x) * var6 / var8);
      var5.y = (float)((double)var2.y + (double)(var3.y - var2.y) * var6 / var8);
      return var5;
   }

   private static FPoint a(FPoint var0, FPoint var1, FPoint var2, FPoint var3) {
      FPoint var4 = FPoint.obtain(0.0F, 0.0F);
      double var5 = (double)((var1.y - var0.y) * (var0.x - var2.x) - (var1.x - var0.x) * (var0.y - var2.y));
      double var7 = (double)((var1.y - var0.y) * (var3.x - var2.x) - (var1.x - var0.x) * (var3.y - var2.y));
      var4.x = (float)((double)var2.x + (double)(var3.x - var2.x) * var5 / var7);
      var4.y = (float)((double)var2.y + (double)(var3.y - var2.y) * var5 / var7);
      return var4;
   }

   public static boolean a(FPoint var0, FPoint[] var1) {
      if (var1 == null) {
         return false;
      } else {
         for(byte var2 = 0; var2 < var1.length; ++var2) {
            if (!a(var0, var1[var2], var1[(var2 + 1) % var1.length])) {
               return false;
            }
         }

         return true;
      }
   }

   private static boolean a(FPoint var0, FPoint var1, FPoint var2) {
      double var3 = (double)((var2.x - var1.x) * (var0.y - var1.y) - (var0.x - var1.x) * (var2.y - var1.y));
      return var3 >= 0.0D;
   }

   public static List<IPoint> a(IPoint[] var0, List<IPoint> var1, boolean var2) {
      ArrayList var3 = new ArrayList();
      ArrayList var4 = new ArrayList(var1);

      for(byte var5 = 0; var5 < 4; ++var5) {
         var3.clear();
         int var6 = var4.size();

         int var7;
         for(var7 = 0; var7 < (var2 ? var6 : var6 - 1); ++var7) {
            IPoint var8 = (IPoint)var4.get(var7 % var6);
            IPoint var9 = (IPoint)var4.get((var7 + 1) % var6);
            if (var7 == 0 && a(var8, var0[var5], var0[(var5 + 1) % var0.length])) {
               var3.add(var8);
            }

            if (a(var8, var0[var5], var0[(var5 + 1) % var0.length])) {
               if (a(var9, var0[var5], var0[(var5 + 1) % var0.length])) {
                  var3.add(var9);
               } else {
                  var3.add(a(var0[var5], var0[(var5 + 1) % var0.length], var8, var9));
               }
            } else if (a(var9, var0[var5], var0[(var5 + 1) % var0.length])) {
               var3.add(a(var0[var5], var0[(var5 + 1) % var0.length], var8, var9));
               var3.add(var9);
            }
         }

         var4.clear();

         for(var7 = 0; var7 < var3.size(); ++var7) {
            var4.add(var3.get(var7));
         }
      }

      return var4;
   }

   private static IPoint a(IPoint var0, IPoint var1, IPoint var2, IPoint var3) {
      IPoint var4 = IPoint.obtain(0, 0);
      double var5 = (double)(var1.y - var0.y) * (double)(var0.x - var2.x) - (double)(var1.x - var0.x) * (double)(var0.y - var2.y);
      double var7 = (double)(var1.y - var0.y) * (double)(var3.x - var2.x) - (double)(var1.x - var0.x) * (double)(var3.y - var2.y);
      var4.x = (int)((double)var2.x + (double)(var3.x - var2.x) * var5 / var7);
      var4.y = (int)((double)var2.y + (double)(var3.y - var2.y) * var5 / var7);
      return var4;
   }

   public static boolean a(List<IPoint> var0, int var1, int var2) {
      if (var2 < 3) {
         return false;
      } else {
         double var3 = 1000000.0D;
         double var5 = 0.0D;
         int var9 = var2 - 1;

         for(int var10 = 0; var10 < var2; var9 = var10++) {
            IPoint var7 = (IPoint)var0.get(var9);
            IPoint var8 = (IPoint)var0.get(var10);
            var5 += (double)var7.x / var3 * ((double)var8.y / var3) - (double)var8.x / var3 * ((double)var7.y / var3);
         }

         return var5 < 0.0D;
      }
   }

   private static boolean a(IPoint var0, IPoint var1, IPoint var2) {
      return a(var0.x, var0.y, var1, var2);
   }

   private static boolean a(int var0, int var1, IPoint var2, IPoint var3) {
      double var4 = (double)(var3.x - var2.x);
      double var6 = (double)(var1 - var2.y);
      double var8 = (double)(var0 - var2.x);
      double var10 = (double)(var3.y - var2.y);
      return var4 * var6 - var8 * var10 >= 0.0D;
   }

   public static Bitmap a(int var0, int var1, int var2, int var3) {
      Bitmap var4 = null;

      try {
         int[] var5 = new int[var2 * var3];
         int[] var6 = new int[var2 * var3];
         IntBuffer var7 = IntBuffer.wrap(var5);
         var7.position(0);
         GLES20.glReadPixels(var0, var1, var2, var3, 6408, 5121, var7);

         for(int var8 = 0; var8 < var3; ++var8) {
            for(int var9 = 0; var9 < var2; ++var9) {
               int var10 = var5[var8 * var2 + var9];
               int var11 = var10 >> 16 & 255;
               int var12 = var10 << 16 & 16711680;
               int var13 = var10 & -16711936 | var12 | var11;
               var6[(var3 - var8 - 1) * var2 + var9] = var13;
            }
         }

         var4 = Bitmap.createBitmap(var2, var3, Config.ARGB_8888);
         var4.setPixels(var6, 0, var2, 0, 0, var2, var3);
         return var4;
      } catch (Throwable var14) {
         ht.c(var14, "AMapDelegateImpGLSurfaceView", "SavePixels");
         var14.printStackTrace();
         return null;
      }
   }

   public static hf e() {
      try {
         if (n.e == null) {
            return (new hf$a("3dmap", "6.9.2", n.c)).a(new String[]{"com.amap.api.maps", "com.amap.api.mapcore", "com.autonavi.amap.mapcore", "com.amap.api.3dmap.admic", "com.amap.api.trace", "com.amap.api.trace.core"}).a("6.9.2").a();
         }
      } catch (Throwable var1) {
         return null;
      }

      return n.e;
   }

   private static void b(View var0) {
      if (var0 instanceof ViewGroup) {
         for(int var1 = 0; var1 < ((ViewGroup)var0).getChildCount(); ++var1) {
            b(((ViewGroup)var0).getChildAt(var1));
         }
      } else if (var0 instanceof TextView) {
         ((TextView)var0).setHorizontallyScrolling(false);
      }

   }

   public static Bitmap a(View var0) {
      try {
         b(var0);
         var0.destroyDrawingCache();
         var0.measure(MeasureSpec.makeMeasureSpec(0, 0), MeasureSpec.makeMeasureSpec(0, 0));
         var0.layout(0, 0, var0.getMeasuredWidth(), var0.getMeasuredHeight());
         Bitmap var1 = var0.getDrawingCache();
         return var1 != null ? var1.copy(Config.ARGB_8888, false) : null;
      } catch (Throwable var2) {
         ht.c(var2, "Utils", "getBitmapFromView");
         var2.printStackTrace();
         return null;
      }
   }

   public static DPoint a(LatLng var0) {
      double var1 = var0.longitude / 360.0D + 0.5D;
      double var3 = Math.sin(Math.toRadians(var0.latitude));
      double var5 = 0.5D * Math.log((1.0D + var3) / (1.0D - var3)) / -6.283185307179586D + 0.5D;
      return DPoint.obtain(var1 * 1.0D, var5 * 1.0D);
   }

   public static boolean a(Rect var0, int var1, int var2) {
      return var0.contains(var1, var2);
   }

   public static Pair<Float, IPoint> a(AbstractCameraUpdateMessage var0, GLMapState var1, MapConfig var2) {
      LatLngBounds var3 = var0.bounds;
      int var4 = var0.width;
      int var5 = var0.height;
      int var6 = Math.max(var0.paddingLeft, 1);
      int var7 = Math.max(var0.paddingRight, 1);
      int var8 = Math.max(var0.paddingTop, 1);
      int var9 = Math.max(var0.paddingBottom, 1);
      return a(var2, var6, var7, var8, var9, var3, var4, var5);
   }

   public static Pair<Float, IPoint> a(MapConfig var0, int var1, int var2, int var3, int var4, LatLngBounds var5, int var6, int var7) {
      if (var5 != null && var5.northeast != null && var5.southwest != null) {
         if (var0 == null) {
            return null;
         } else {
            Point var8 = VirtualEarthProjection.latLongToPixels(var5.northeast.latitude, var5.northeast.longitude, 20);
            Point var9 = VirtualEarthProjection.latLongToPixels(var5.southwest.latitude, var5.southwest.longitude, 20);
            int var10 = var8.x - var9.x;
            int var11 = var9.y - var8.y;
            int var12 = var6 - (var1 + var2);
            int var13 = var7 - (var3 + var4);
            if (var10 < 0 && var11 < 0) {
               return null;
            } else {
               var10 = var10 <= 0 ? 1 : var10;
               var11 = var11 <= 0 ? 1 : var11;
               var12 = var12 <= 0 ? 1 : var12;
               var13 = var13 <= 0 ? 1 : var13;
               Pair var14 = a(var0, var8.x, var8.y, var9.x, var9.y, var12, var13);
               float var15 = ((Float)var14.first).floatValue();
               boolean var16 = ((Boolean)var14.second).booleanValue();
               float var17 = a(var0.getMapZoomScale(), var15, (double)var10);
               float var18 = a(var0.getMapZoomScale(), var15, (double)var11);
               int var19;
               int var20;
               if (var15 >= var0.maxZoomLevel) {
                  var19 = (int)((float)var9.x + ((float)(var2 - var1) + var17) * (float)var10 / (2.0F * var17));
                  var20 = (int)((float)var8.y + ((float)(var4 - var3) + var18) * (float)var11 / (2.0F * var18));
               } else if (var16) {
                  var19 = (int)((float)var9.x + (float)(var6 / 2 - var1) / var17 * (float)var10);
                  var20 = (int)((float)var8.y + ((float)(var4 - var3) + var18) * (float)var11 / (2.0F * var18));
               } else {
                  var19 = (int)((float)var9.x + ((float)(var2 - var1) + var17) * (float)var10 / (2.0F * var17));
                  var20 = (int)((float)var8.y + (float)(var7 / 2 - var3) / var18 * (float)var11);
               }

               float var21 = (float)(var0.getAnchorX() - (var0.getMapWidth() >> 1));
               float var22 = (float)(var0.getAnchorY() - (var0.getMapHeight() >> 1));
               var19 = (int)((float)var19 + a(var0.getMapZoomScale(), var15, var21));
               var20 = (int)((float)var20 + a(var0.getMapZoomScale(), var15, var22));
               Pair var23 = new Pair(var15, IPoint.obtain(var19, var20));
               return var23;
            }
         }
      } else {
         return null;
      }
   }

   public static double a(float var0, double var1, double var3) {
      var1 *= (double)var0;
      double var5 = var3 / var1;
      return 20.0D - Math.log(var5) / Math.log(2.0D);
   }

   private static float a(float var0, float var1, double var2) {
      return (float)(var2 / (Math.pow(2.0D, (double)(20.0F - var1)) * (double)var0));
   }

   private static float a(float var0, float var1, float var2) {
      return (float)((double)var2 * Math.pow(2.0D, (double)(20.0F - var1)) * (double)var0);
   }

   public static Pair<Float, Boolean> a(MapConfig var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      float var7 = var0.getSZ();
      boolean var8 = true;
      if (var1 == var3 && var2 == var4) {
         var7 = var0.getMaxZoomLevel();
      } else {
         float var9 = (float)a(var0.getMapZoomScale(), (double)var6, (double)Math.abs(var4 - var2));
         float var10 = (float)a(var0.getMapZoomScale(), (double)var5, (double)Math.abs(var3 - var1));
         var7 = Math.min(var10, var9);
         var8 = var7 == var10;
         var7 = Math.min(var0.getMaxZoomLevel(), Math.max(var0.getMinZoomLevel(), var7));
      }

      return new Pair(var7, var8);
   }

   public static float b(MapConfig var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      float var7 = var0.getSZ();
      if (var1 != var3 && var2 != var4) {
         float var8 = (float)a(var0.getMapZoomScale(), (double)var6, (double)Math.abs(var4 - var2));
         float var9 = (float)a(var0.getMapZoomScale(), (double)var5, (double)Math.abs(var3 - var1));
         var7 = Math.max(var9, var8);
      }

      return var7;
   }

   public static boolean b(int var0, int var1) {
      if (var0 > 0 && var1 > 0) {
         return true;
      } else {
         Log.w("3dmap", "the map must have a size");
         return false;
      }
   }

   public static synchronized int[] a(int var0, int var1, int var2, int var3, MapConfig var4, GLMapState var5, int var6, int var7) {
      int var8 = var4.getMapWidth();
      int var9 = var4.getMapHeight();
      int var10 = var4.getAnchorX();
      int var11 = var4.getAnchorY();
      float var12 = a(var4.getMapZoomScale(), var5.getMapZoomer(), (float)var10);
      float var13 = a(var4.getMapZoomScale(), var5.getMapZoomer(), (float)(var8 - var10));
      float var14 = a(var4.getMapZoomScale(), var5.getMapZoomer(), (float)var11);
      float var15 = a(var4.getMapZoomScale(), var5.getMapZoomer(), (float)(var9 - var11));
      float var16 = (float)var2 + var12;
      float var17 = (float)var0 - var13;
      float var18 = (float)var1 + var14;
      float var19 = (float)var3 - var15;
      int[] var20 = new int[]{(int)Math.max(var16, Math.min((float)var6, var17)), (int)Math.max(var18, Math.min((float)var7, var19))};
      return var20;
   }

   public static void a(Rect var0) {
      if (var0 != null) {
         var0.set(Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
      }

   }

   public static void b(Rect var0, int var1, int var2) {
      if (var0 != null) {
         if (var1 < var0.left) {
            var0.left = var1;
         }

         if (var1 > var0.right) {
            var0.right = var1;
         }

         if (var2 > var0.top) {
            var0.top = var2;
         }

         if (var2 < var0.bottom) {
            var0.bottom = var2;
         }
      }

   }

   public static byte[] a(byte[] var0, int[] var1) {
      Object var2 = null;

      byte[] var18;
      try {
         Bitmap var3 = BitmapFactory.decodeByteArray(var0, 0, var0.length);
         Bitmap var4 = var3.copy(var3.getConfig(), true);
         int var5 = var3.getWidth();
         int var6 = var3.getHeight();
         byte var7 = 8;
         byte var8 = 4;
         byte var9 = 4;
         int var10 = 6;
         int var11 = 0;
         int var12 = var10;
         byte var13 = 72;

         for(int var14 = 1; var14 < var13; ++var14) {
            for(int var15 = var7; var15 < var7 + var8; ++var15) {
               var3.getPixel(var15, var14);
               if (var14 < var9 * var12) {
                  var4.setPixel(var15, var14, var1[var11]);
               } else {
                  ++var11;
                  --var10;
                  var12 += var10;
               }
            }
         }

         var18 = b(var4);
         if (var18 == null) {
            var18 = var0;
         }

         var4.recycle();
         var3.recycle();
      } catch (Throwable var17) {
         var17.printStackTrace();
         var18 = var0;
      }

      return var18;
   }

   public static byte[] a(byte[] var0, int var1) {
      return a(var0, var1, var1, true);
   }

   public static byte[] a(byte[] var0, int var1, int var2, boolean var3) {
      Object var4 = null;

      byte[] var12;
      try {
         Bitmap var5 = BitmapFactory.decodeByteArray(var0, 0, var0.length);
         Bitmap var6 = var5.copy(var5.getConfig(), true);
         int var7 = var5.getWidth();
         int var8 = var5.getHeight();

         for(int var9 = 0; var9 < var7; ++var9) {
            for(int var10 = 0; var10 < var8; ++var10) {
               if (var9 != 0 && var10 != 0) {
                  var6.setPixel(var9, var10, var1);
               } else if (!var3) {
                  var6.setPixel(var9, var10, var2);
               }
            }
         }

         var12 = b(var6);
         if (var12 == null) {
            var12 = var0;
         }

         var6.recycle();
         var5.recycle();
      } catch (Throwable var11) {
         var11.printStackTrace();
         var12 = var0;
      }

      return var12;
   }

   private static byte[] b(Bitmap var0) {
      ByteArrayOutputStream var1 = null;

      try {
         var1 = new ByteArrayOutputStream();
         var0.compress(CompressFormat.PNG, 100, var1);
         byte[] var2 = var1.toByteArray();
         return var2;
      } catch (Throwable var12) {
         ;
      } finally {
         try {
            if (var1 != null) {
               var1.close();
            }
         } catch (Throwable var11) {
            var11.printStackTrace();
         }

      }

      return null;
   }

   public static boolean a(List<BaseHoleOptions> var0, PolygonHoleOptions var1) {
      boolean var2 = false;

      for(int var3 = 0; var3 < var0.size(); ++var3) {
         BaseHoleOptions var4 = (BaseHoleOptions)var0.get(var3);
         if (var4 instanceof PolygonHoleOptions) {
            PolygonHoleOptions var5 = (PolygonHoleOptions)var4;
            var2 = a(var5.getPoints(), var1.getPoints());
            if (var2) {
               return true;
            }
         } else if (var4 instanceof CircleHoleOptions) {
            CircleHoleOptions var6 = (CircleHoleOptions)var4;
            var2 = b(var1.getPoints(), var6);
            if (var2) {
               return true;
            }
         }
      }

      return var2;
   }

   public static boolean a(List<BaseHoleOptions> var0, CircleHoleOptions var1) {
      boolean var2 = false;

      for(int var3 = 0; var3 < var0.size(); ++var3) {
         BaseHoleOptions var4 = (BaseHoleOptions)var0.get(var3);
         if (var4 instanceof PolygonHoleOptions) {
            PolygonHoleOptions var5 = (PolygonHoleOptions)var4;
            var2 = b(var5.getPoints(), var1);
            if (var2) {
               return true;
            }
         } else if (var4 instanceof CircleHoleOptions) {
            CircleHoleOptions var6 = (CircleHoleOptions)var4;
            var2 = a(var1, var6);
            if (var2) {
               return true;
            }
         }
      }

      return var2;
   }

   public static boolean a(CircleHoleOptions var0, CircleHoleOptions var1) {
      try {
         float var2 = AMapUtils.calculateLineDistance(var1.getCenter(), var0.getCenter());
         boolean var3 = (double)var2 < var0.getRadius() + var1.getRadius();
         return var3;
      } catch (Throwable var4) {
         ht.c(var4, "Util", "isPolygon2CircleIntersect");
         var4.printStackTrace();
         return false;
      }
   }

   public static boolean b(List<LatLng> var0, CircleHoleOptions var1) {
      try {
         ArrayList var2 = new ArrayList();

         for(int var3 = 0; var3 < var0.size(); ++var3) {
            var2.add(var0.get(var3));
         }

         var2.add(var0.get(0));
         ArrayList var9 = new ArrayList();

         for(int var4 = 0; var4 < var2.size() && var4 + 1 < var2.size(); ++var4) {
            if (var1.getRadius() >= (double)AMapUtils.calculateLineDistance(var1.getCenter(), (LatLng)var2.get(var4)) || var1.getRadius() >= (double)AMapUtils.calculateLineDistance(var1.getCenter(), (LatLng)var2.get(var4 + 1))) {
               return true;
            }

            var9.clear();
            var9.add(var2.get(var4));
            var9.add(var2.get(var4 + 1));
            Pair var5 = SpatialRelationUtil.calShortestDistancePoint(var9, (LatLng)var1.getCenter());
            float var6 = AMapUtils.calculateLineDistance(var1.getCenter(), (LatLng)var5.second);
            boolean var7 = var1.getRadius() >= (double)var6;
            if (var7) {
               return true;
            }
         }
      } catch (Throwable var8) {
         ht.c(var8, "Util", "isPolygon2CircleIntersect");
         var8.printStackTrace();
      }

      return false;
   }

   public static boolean a(List<LatLng> var0, List<LatLng> var1) {
      try {
         int var2;
         boolean var3;
         for(var2 = 0; var2 < var1.size(); ++var2) {
            var3 = a((LatLng)var1.get(var2), var0);
            if (var3) {
               return true;
            }
         }

         for(var2 = 0; var2 < var0.size(); ++var2) {
            var3 = a((LatLng)var0.get(var2), var1);
            if (var3) {
               return true;
            }
         }

         return b(var0, var1);
      } catch (Throwable var4) {
         ht.c(var4, "Util", "isPolygon2PolygonIntersect");
         var4.printStackTrace();
         return false;
      }
   }

   private static boolean b(List<LatLng> var0, List<LatLng> var1) {
      try {
         for(int var2 = 0; var2 < var0.size() && var2 + 1 < var0.size(); ++var2) {
            for(int var3 = 0; var3 < var1.size() && var3 + 1 < var1.size(); ++var3) {
               boolean var4 = fd.a((LatLng)var0.get(var2), (LatLng)var0.get(var2 + 1), (LatLng)var1.get(var3), (LatLng)var1.get(var3 + 1));
               if (var4) {
                  return var4;
               }
            }
         }
      } catch (Throwable var5) {
         ht.c(var5, "Util", "isSegmentsIntersect");
         var5.printStackTrace();
      }

      return false;
   }

   public static boolean e(Context var0) {
      File var1 = new File(b(var0));
      return !var1.exists() ? true : FileUtil.deleteFile(var1);
   }

   public static float a(DPoint var0, DPoint var1) {
      if (var0 != null && var1 != null) {
         double var2 = var0.x;
         double var4 = var1.x;
         double var6 = var0.y;
         double var8 = var1.y;
         float var10 = (float)(Math.atan2(var8 - var6, var4 - var2) / 3.141592653589793D * 180.0D);
         return var10;
      } else {
         return 0.0F;
      }
   }
}
