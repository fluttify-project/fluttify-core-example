package com.amap.api.mapcore.util;

import android.content.Context;
import android.text.TextUtils;
import com.amap.api.maps.model.LatLng;
import com.autonavi.amap.mapcore.CoordUtil;
import com.autonavi.amap.mapcore.DPoint;
import java.io.File;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ao {
   private static boolean d = false;
   static double a = 3.141592653589793D;
   private static final double[] e = new double[]{25.575374D, 120.391111D};
   private static final double[] f = new double[]{21.405235D, 121.649046D};
   private static final List<LatLng> g = new ArrayList(Arrays.asList(new LatLng(23.379947D, 119.757001D), new LatLng(24.983296D, 120.474496D), new LatLng(25.518722D, 121.359866D), new LatLng(25.41329D, 122.443582D), new LatLng(24.862708D, 122.288354D), new LatLng(24.461292D, 122.188319D), new LatLng(21.584761D, 120.968923D), new LatLng(21.830837D, 120.654445D)));
   public static double b = 6378245.0D;
   public static double c = 0.006693421622965943D;

   public static LatLng a(Context var0, LatLng var1) {
      if (null == var0) {
         return null;
      } else if (!fb.a(var1.latitude, var1.longitude)) {
         return var1;
      } else {
         String var2 = gy.a(var0, "libwgs2gcj.so");
         if (!TextUtils.isEmpty(var2)) {
            File var3 = new File(var2);
            if (var3.exists() && !d) {
               try {
                  System.load(var2);
                  d = true;
               } catch (Throwable var5) {
                  he.a(var0, var5);
               }
            }
         }

         DPoint var6 = a(DPoint.obtain(var1.longitude, var1.latitude), d);
         LatLng var4 = new LatLng(var6.y, var6.x, false);
         var6.recycle();
         return var4;
      }
   }

   private static DPoint a(DPoint var0, boolean var1) {
      try {
         if (fb.a(var0.y, var0.x)) {
            double[] var2 = new double[2];
            if (var1) {
               double[] var3 = new double[]{var0.x, var0.y};

               try {
                  int var4 = CoordUtil.convertToGcj(var3, var2);
                  if (var4 != 0) {
                     var2 = lk.a(var0.x, var0.y);
                  }
               } catch (Throwable var5) {
                  var5.printStackTrace();
                  var2 = lk.a(var0.x, var0.y);
               }
            } else {
               var2 = lk.a(var0.x, var0.y);
            }

            var0.recycle();
            DPoint var7 = DPoint.obtain(var2[0], var2[1]);
            return var7;
         } else {
            return var0;
         }
      } catch (Throwable var6) {
         return var0;
      }
   }

   public static LatLng b(Context var0, LatLng var1) {
      try {
         if (!fb.a(var1.latitude, var1.longitude)) {
            return var1;
         } else {
            DPoint var2 = f(var1.longitude, var1.latitude);
            LatLng var3 = a(var0, new LatLng(var2.y, var2.x, false));
            var2.recycle();
            return var3;
         }
      } catch (Throwable var4) {
         var4.printStackTrace();
         return var1;
      }
   }

   public static double a(double var0, double var2) {
      return Math.cos(var2 / 100000.0D) * (var0 / 18000.0D) + Math.sin(var0 / 100000.0D) * (var2 / 9000.0D);
   }

   public static double b(double var0, double var2) {
      return Math.sin(var2 / 100000.0D) * (var0 / 18000.0D) + Math.cos(var0 / 100000.0D) * (var2 / 9000.0D);
   }

   private static DPoint f(double var0, double var2) {
      double var4 = (double)((long)(var0 * 100000.0D) % 36000000L);
      double var6 = (double)((long)(var2 * 100000.0D) % 36000000L);
      int var8 = (int)(-a(var4, var6) + var4);
      int var9 = (int)(-b(var4, var6) + var6);
      var8 = (int)(-a((double)var8, (double)var9) + var4 + (double)(var4 > 0.0D ? 1 : -1));
      var9 = (int)(-b((double)var8, (double)var9) + var6 + (double)(var6 > 0.0D ? 1 : -1));
      var0 = (double)var8 / 100000.0D;
      var2 = (double)var9 / 100000.0D;
      DPoint var10 = DPoint.obtain(var0, var2);
      return var10;
   }

   public static LatLng a(LatLng var0) {
      try {
         if (var0 != null) {
            DPoint var1;
            if (fb.a(var0.latitude, var0.longitude)) {
               var1 = a(var0.longitude, var0.latitude, 2);
               LatLng var2 = new LatLng(var1.y, var1.x, false);
               var1.recycle();
               return var2;
            }

            if (c(var0.latitude, var0.longitude)) {
               var1 = a(var0.longitude, var0.latitude, 2);
               return h(var1.y, var1.x);
            }

            return var0;
         }
      } catch (Throwable var3) {
         var3.printStackTrace();
      }

      return var0;
   }

   private static double a(double var0) {
      return Math.sin(var0 * 3000.0D * (a / 180.0D)) * 2.0E-5D;
   }

   private static double b(double var0) {
      return Math.cos(var0 * 3000.0D * (a / 180.0D)) * 3.0E-6D;
   }

   private static DPoint g(double var0, double var2) {
      DPoint var4 = DPoint.obtain();
      double var5 = Math.cos(b(var0) + Math.atan2(var2, var0)) * (a(var2) + Math.sqrt(var0 * var0 + var2 * var2)) + 0.0065D;
      double var7 = Math.sin(b(var0) + Math.atan2(var2, var0)) * (a(var2) + Math.sqrt(var0 * var0 + var2 * var2)) + 0.006D;
      var4.x = a(var5, 8);
      var4.y = a(var7, 8);
      return var4;
   }

   private static double a(double var0, int var2) {
      BigDecimal var3 = (new BigDecimal(var0)).setScale(var2, 4);
      return var3.doubleValue();
   }

   private static DPoint a(double var0, double var2, int var4) {
      double var5 = 0.006401062D;
      double var7 = 0.0060424805D;
      DPoint var9 = null;

      for(int var10 = 0; var10 < var4; ++var10) {
         var9 = a(var0, var2, var5, var7);
         var5 = var0 - var9.x;
         var7 = var2 - var9.y;
      }

      return var9;
   }

   private static DPoint a(double var0, double var2, double var4, double var6) {
      DPoint var8 = DPoint.obtain();
      double var9 = var0 - var4;
      double var11 = var2 - var6;
      DPoint var13 = g(var9, var11);
      var8.x = a(var0 + var9 - var13.x, 8);
      var8.y = a(var2 + var11 - var13.y, 8);
      return var8;
   }

   public static boolean c(double var0, double var2) {
      LatLng var4 = new LatLng(var0, var2);
      return fi.a(var4, g);
   }

   private static LatLng h(double var0, double var2) {
      LatLng var4 = i(var0, var2);
      double var5 = var2 * 2.0D - var4.longitude;
      double var7 = var0 * 2.0D - var4.latitude;
      return new LatLng(var7, var5);
   }

   private static LatLng i(double var0, double var2) {
      double var4 = d(var2 - 105.0D, var0 - 35.0D);
      double var6 = e(var2 - 105.0D, var0 - 35.0D);
      double var8 = var0 / 180.0D * a;
      double var10 = Math.sin(var8);
      var10 = 1.0D - c * var10 * var10;
      double var12 = Math.sqrt(var10);
      var4 = var4 * 180.0D / (b * (1.0D - c) / (var10 * var12) * a);
      var6 = var6 * 180.0D / (b / var12 * Math.cos(var8) * a);
      double var14 = var0 + var4;
      double var16 = var2 + var6;
      return new LatLng(var14, var16);
   }

   public static double d(double var0, double var2) {
      double var4 = -100.0D + 2.0D * var0 + 3.0D * var2 + 0.2D * var2 * var2 + 0.1D * var0 * var2 + 0.2D * Math.sqrt(Math.abs(var0));
      var4 += (20.0D * Math.sin(6.0D * var0 * a) + 20.0D * Math.sin(2.0D * var0 * a)) * 2.0D / 3.0D;
      var4 += (20.0D * Math.sin(var2 * a) + 40.0D * Math.sin(var2 / 3.0D * a)) * 2.0D / 3.0D;
      var4 += (160.0D * Math.sin(var2 / 12.0D * a) + 320.0D * Math.sin(var2 * a / 30.0D)) * 2.0D / 3.0D;
      return var4;
   }

   public static double e(double var0, double var2) {
      double var4 = 300.0D + var0 + 2.0D * var2 + 0.1D * var0 * var0 + 0.1D * var0 * var2 + 0.1D * Math.sqrt(Math.abs(var0));
      var4 += (20.0D * Math.sin(6.0D * var0 * a) + 20.0D * Math.sin(2.0D * var0 * a)) * 2.0D / 3.0D;
      var4 += (20.0D * Math.sin(var0 * a) + 40.0D * Math.sin(var0 / 3.0D * a)) * 2.0D / 3.0D;
      var4 += (150.0D * Math.sin(var0 / 12.0D * a) + 300.0D * Math.sin(var0 / 30.0D * a)) * 2.0D / 3.0D;
      return var4;
   }
}
