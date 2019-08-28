package com.amap.api.maps;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.Uri;
import com.amap.api.mapcore.util.gu;
import com.amap.api.maps.model.LatLng;
import com.amap.api.maps.model.NaviPara;
import com.amap.api.maps.model.PoiPara;
import com.amap.api.maps.model.RoutePara;
import java.util.List;
import java.util.Locale;

public class AMapUtils {
   public static final int DRIVING_DEFAULT = 0;
   public static final int DRIVING_SAVE_MONEY = 1;
   public static final int DRIVING_SHORT_DISTANCE = 2;
   public static final int DRIVING_NO_HIGHWAY = 3;
   public static final int DRIVING_AVOID_CONGESTION = 4;
   public static final int DRIVING_NO_HIGHWAY_AVOID_SHORT_MONEY = 5;
   public static final int DRIVING_NO_HIGHWAY_AVOID_CONGESTION = 6;
   public static final int DRIVING_SAVE_MONEY_AVOID_CONGESTION = 7;
   public static final int DRIVING_NO_HIGHWAY_SAVE_MONEY_AVOID_CONGESTION = 8;
   public static final int BUS_TIME_FIRST = 0;
   public static final int BUS_MONEY_LITTLE = 1;
   public static final int BUS_TRANSFER_LITTLE = 2;
   public static final int BUS_WALK_LITTLE = 3;
   public static final int BUS_COMFORT = 4;
   public static final int BUS_NO_SUBWAY = 5;

   public AMapUtils() {
   }

   public static float calculateLineDistance(LatLng var0, LatLng var1) {
      if (var0 != null && var1 != null) {
         try {
            double var2 = var0.longitude;
            double var4 = var0.latitude;
            double var6 = var1.longitude;
            double var8 = var1.latitude;
            var2 *= 0.01745329251994329D;
            var4 *= 0.01745329251994329D;
            var6 *= 0.01745329251994329D;
            var8 *= 0.01745329251994329D;
            double var10 = Math.sin(var2);
            double var12 = Math.sin(var4);
            double var14 = Math.cos(var2);
            double var16 = Math.cos(var4);
            double var18 = Math.sin(var6);
            double var20 = Math.sin(var8);
            double var22 = Math.cos(var6);
            double var24 = Math.cos(var8);
            double[] var26 = new double[3];
            double[] var27 = new double[3];
            var26[0] = var16 * var14;
            var26[1] = var16 * var10;
            var26[2] = var12;
            var27[0] = var24 * var22;
            var27[1] = var24 * var18;
            var27[2] = var20;
            double var28 = Math.sqrt((var26[0] - var27[0]) * (var26[0] - var27[0]) + (var26[1] - var27[1]) * (var26[1] - var27[1]) + (var26[2] - var27[2]) * (var26[2] - var27[2]));
            return (float)(Math.asin(var28 / 2.0D) * 1.27420015798544E7D);
         } catch (Throwable var30) {
            var30.printStackTrace();
            return 0.0F;
         }
      } else {
         try {
            throw new AMapException("非法坐标值");
         } catch (AMapException var31) {
            var31.printStackTrace();
            return 0.0F;
         }
      }
   }

   public static float calculateArea(LatLng var0, LatLng var1) {
      if (var0 != null && var1 != null) {
         try {
            double var2 = Math.sin(var0.latitude * 3.141592653589793D / 180.0D) - Math.sin(var1.latitude * 3.141592653589793D / 180.0D);
            double var4 = (var1.longitude - var0.longitude) / 360.0D;
            if (var4 < 0.0D) {
               ++var4;
            }

            return (float)(2.5560394669790553E14D * var2 * var4);
         } catch (Throwable var6) {
            var6.printStackTrace();
            return 0.0F;
         }
      } else {
         try {
            throw new AMapException("非法坐标值");
         } catch (AMapException var7) {
            var7.printStackTrace();
            return 0.0F;
         }
      }
   }

   public static float calculateArea(List<LatLng> var0) {
      byte var1 = 3;
      if (var0 != null && var0.size() >= var1) {
         double var2 = 0.0D;
         double var4 = 111319.49079327357D;
         int var6 = var0.size();

         for(int var7 = 0; var7 < var6; ++var7) {
            LatLng var8 = (LatLng)var0.get(var7);
            LatLng var9 = (LatLng)var0.get((var7 + 1) % var6);
            double var10 = var8.longitude * var4 * Math.cos(var8.latitude * 0.017453292519943295D);
            double var12 = var8.latitude * var4;
            double var14 = var9.longitude * var4 * Math.cos(var9.latitude * 0.017453292519943295D);
            double var16 = var9.latitude * var4;
            var2 += var10 * var16 - var14 * var12;
         }

         return (float)Math.abs(var2 / 2.0D);
      } else {
         return 0.0F;
      }
   }

   public static void getLatestAMapApp(Context var0) {
      try {
         String var1 = "http://wap.amap.com/";
         Intent var2 = new Intent("android.intent.action.VIEW");
         var2.addFlags(276824064);
         var2.addCategory("android.intent.category.DEFAULT");
         var2.setData(Uri.parse(var1));
         AMapUtils$a var3 = new AMapUtils$a("glaa", var0);
         var3.start();
         var0.startActivity(var2);
      } catch (Throwable var4) {
         var4.printStackTrace();
      }

   }

   public static void openAMapNavi(NaviPara var0, Context var1) throws AMapException {
      if (a(var1)) {
         if (var0.getTargetPoint() != null) {
            try {
               Intent var2 = new Intent("android.intent.action.VIEW");
               var2.addFlags(276824064);
               var2.addCategory("android.intent.category.DEFAULT");
               var2.setData(Uri.parse(a(var0, var1)));
               var2.setPackage("com.autonavi.minimap");
               AMapUtils$a var3 = new AMapUtils$a("oan", var1);
               var3.start();
               var1.startActivity(var2);
            } catch (Throwable var4) {
               throw new AMapException("移动设备上未安装高德地图或高德地图版本较旧");
            }
         } else {
            throw new AMapException("非法参数");
         }
      } else {
         throw new AMapException("移动设备上未安装高德地图或高德地图版本较旧");
      }
   }

   public static void openAMapPoiNearbySearch(PoiPara var0, Context var1) throws AMapException {
      if (a(var1)) {
         if (var0.getKeywords() != null && var0.getKeywords().trim().length() > 0) {
            try {
               Intent var2 = new Intent("android.intent.action.VIEW");
               var2.addFlags(276824064);
               var2.addCategory("android.intent.category.DEFAULT");
               var2.setData(Uri.parse(a(var0, var1)));
               var2.setPackage("com.autonavi.minimap");
               AMapUtils$a var3 = new AMapUtils$a("oan", var1);
               var3.start();
               var1.startActivity(var2);
            } catch (Throwable var4) {
               throw new AMapException("移动设备上未安装高德地图或高德地图版本较旧");
            }
         } else {
            throw new AMapException("非法参数");
         }
      } else {
         throw new AMapException("移动设备上未安装高德地图或高德地图版本较旧");
      }
   }

   public static void openAMapDrivingRoute(RoutePara var0, Context var1) throws AMapException {
      a(var0, var1, 2);
   }

   public static void openAMapTransitRoute(RoutePara var0, Context var1) throws AMapException {
      a(var0, var1, 1);
   }

   public static void openAMapWalkingRoute(RoutePara var0, Context var1) throws AMapException {
      a(var0, var1, 4);
   }

   private static void a(RoutePara var0, Context var1, int var2) throws AMapException {
      if (a(var1)) {
         if (a(var0)) {
            try {
               Intent var3 = new Intent("android.intent.action.VIEW");
               var3.addFlags(276824064);
               var3.addCategory("android.intent.category.DEFAULT");
               var3.setData(Uri.parse(b(var0, var1, var2)));
               var3.setPackage("com.autonavi.minimap");
               AMapUtils$a var4 = new AMapUtils$a("oan", var1);
               var4.start();
               var1.startActivity(var3);
            } catch (Throwable var5) {
               throw new AMapException("移动设备上未安装高德地图或高德地图版本较旧");
            }
         } else {
            throw new AMapException("非法参数");
         }
      } else {
         throw new AMapException("移动设备上未安装高德地图或高德地图版本较旧");
      }
   }

   private static boolean a(RoutePara var0) {
      return var0.getStartPoint() != null && var0.getEndPoint() != null && var0.getStartName() != null && var0.getStartName().trim().length() > 0 && var0.getEndName() != null && var0.getEndName().trim().length() > 0;
   }

   private static String a(NaviPara var0, Context var1) {
      return String.format(Locale.US, "androidamap://navi?sourceApplication=%s&lat=%f&lon=%f&dev=0&style=%d", gu.b(var1), var0.getTargetPoint().latitude, var0.getTargetPoint().longitude, var0.getNaviStyle());
   }

   private static String b(RoutePara var0, Context var1, int var2) {
      String var3 = String.format(Locale.US, "androidamap://route?sourceApplication=%s&slat=%f&slon=%f&sname=%s&dlat=%f&dlon=%f&dname=%s&dev=0&t=%d", gu.b(var1), var0.getStartPoint().latitude, var0.getStartPoint().longitude, var0.getStartName(), var0.getEndPoint().latitude, var0.getEndPoint().longitude, var0.getEndName(), var2);
      if (var2 == 1) {
         var3 = var3 + "&m=" + var0.getTransitRouteStyle();
      } else if (var2 == 2) {
         var3 = var3 + "&m=" + var0.getDrivingRouteStyle();
      }

      return var3;
   }

   private static String a(PoiPara var0, Context var1) {
      String var2 = String.format(Locale.US, "androidamap://arroundpoi?sourceApplication=%s&keywords=%s&dev=0", gu.b(var1), var0.getKeywords());
      if (var0.getCenter() != null) {
         var2 = var2 + "&lat=" + var0.getCenter().latitude + "&lon=" + var0.getCenter().longitude;
      }

      return var2;
   }

   private static boolean a(Context var0) {
      PackageInfo var1 = null;

      try {
         var1 = var0.getPackageManager().getPackageInfo("com.autonavi.minimap", 0);
      } catch (NameNotFoundException var3) {
         var1 = null;
         return false;
      }

      return var1 != null;
   }
}
