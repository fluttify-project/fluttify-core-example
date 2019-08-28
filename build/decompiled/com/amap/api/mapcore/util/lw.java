package com.amap.api.mapcore.util;

import com.autonavi.amap.mapcore.Inner_3dMap_location;

public final class lw {
   private static final String[] b = new String[]{"com.amap.api.maps", "com.amap.api.mapcore", "com.autonavi.amap.mapcore", "com.amap.api.3dmap.admic", "com.amap.api.trace", "com.amap.api.trace.core"};
   private static final String[] c = new String[]{"com.amap.api.mapcore2d", "com.amap.api.maps2d"};
   private static final String[] d = new String[]{"com.amap.trace"};
   static hf a = null;

   public static boolean a(ls var0) {
      boolean var1;
      if (var0 == null) {
         var1 = false;
      } else if (var0.d().equals("8")) {
         var1 = false;
      } else if (var0.d().equals("5")) {
         var1 = false;
      } else if (var0.d().equals("6")) {
         var1 = false;
      } else {
         var1 = a((Inner_3dMap_location)var0);
      }

      return var1;
   }

   public static boolean a(Inner_3dMap_location var0) {
      boolean var1 = true;
      double var2 = var0.getLongitude();
      double var4 = var0.getLatitude();
      if (var2 != 0.0D || var4 != 0.0D) {
         if (var2 > 180.0D || var4 > 90.0D) {
            var1 = false;
            return var1;
         }

         if (var2 >= -180.0D && var4 >= -90.0D) {
            return var1;
         }
      }

      var1 = false;
      return var1;
   }

   public static hf a() throws gt {
      Class var0 = null;
      if (a != null) {
         return a;
      } else {
         try {
            var0 = Class.forName("com.amap.api.maps.MapsInitializer");
         } catch (Throwable var7) {
            ;
         }

         String var1;
         String var2;
         if (var0 != null) {
            try {
               var1 = (String)mi.a((Class)var0, (String)"getVersion", (Object[])null, (Class[])null);
               var2 = "AMAP_SDK_Android_Map_" + var1;
               a = (new hf$a("3dmap", var1, var2)).a(b).a();
            } catch (Throwable var6) {
               ;
            }
         } else {
            try {
               var1 = (String)mi.a((Class)(var0 = Class.forName("com.amap.api.maps2d.MapsInitializer")), (String)"getVersion", (Object[])null, (Class[])null);
               var2 = "AMAP_SDK_Android_2DMap_" + var1;
               a = (new hf$a("2dmap", var1, var2)).a(c).a();
            } catch (Throwable var5) {
               ;
            }
         }

         if (var0 == null) {
            var0 = null;

            try {
               var0 = Class.forName("com.amap.trace.AMapTraceClient");
            } catch (Throwable var4) {
               ;
            }

            if (var0 != null) {
               try {
                  var1 = (String)mi.a((Class)var0, (String)"getVersion", (Object[])null, (Class[])null);
                  var2 = "AMAP_TRACE_Android_" + var1;
                  a = (new hf$a("trace", var1, var2)).a(d).a();
               } catch (Throwable var3) {
                  ;
               }
            }
         }

         return a;
      }
   }
}
