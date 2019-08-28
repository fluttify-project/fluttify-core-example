package com.amap.api.mapcore.util;

import com.amap.api.maps.model.LatLng;

public class fd {
   private static double a(LatLng var0, LatLng var1) {
      return var0.longitude * var1.latitude - var1.longitude * var0.latitude;
   }

   private static LatLng b(LatLng var0, LatLng var1) {
      LatLng var2 = new LatLng(var1.latitude - var0.latitude, var1.longitude - var0.longitude);
      return var2;
   }

   private static double a(LatLng var0, LatLng var1, LatLng var2) {
      return a(b(var2, var0), b(var1, var0));
   }

   private static boolean b(LatLng var0, LatLng var1, LatLng var2) {
      double var3 = var0.longitude - var1.longitude > 0.0D ? var0.longitude : var1.longitude;
      double var5 = var0.longitude - var1.longitude < 0.0D ? var0.longitude : var1.longitude;
      double var7 = var0.latitude - var1.latitude > 0.0D ? var0.latitude : var1.latitude;
      double var9 = var0.latitude - var1.latitude < 0.0D ? var0.latitude : var1.latitude;
      return var5 <= var2.longitude && var2.longitude <= var3 && var9 <= var2.latitude && var2.latitude <= var7;
   }

   public static boolean a(LatLng var0, LatLng var1, LatLng var2, LatLng var3) {
      double var4 = a(var2, var3, var0);
      double var6 = a(var2, var3, var1);
      double var8 = a(var0, var1, var2);
      double var10 = a(var0, var1, var3);
      boolean var12 = (var4 > 0.0D && var6 < 0.0D || var4 < 0.0D && var6 > 0.0D) && (var8 > 0.0D && var10 < 0.0D || var8 < 0.0D && var10 > 0.0D);
      if (var12) {
         return true;
      } else if (var4 == 0.0D && b(var2, var3, var0)) {
         return true;
      } else if (var6 == 0.0D && b(var2, var3, var1)) {
         return true;
      } else if (var8 == 0.0D && b(var0, var1, var2)) {
         return true;
      } else {
         return var10 == 0.0D && b(var0, var1, var3);
      }
   }
}
