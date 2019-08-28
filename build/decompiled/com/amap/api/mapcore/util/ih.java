package com.amap.api.mapcore.util;

import android.content.Context;
import android.text.TextUtils;
import java.lang.Thread.UncaughtExceptionHandler;

public class ih implements UncaughtExceptionHandler {
   private static ih a;
   private UncaughtExceptionHandler b;
   private Context c;
   private hf d;

   private ih(Context var1, hf var2) {
      this.c = var1.getApplicationContext();
      this.d = var2;
      this.b = Thread.getDefaultUncaughtExceptionHandler();
      Thread.setDefaultUncaughtExceptionHandler(this);
   }

   static synchronized ih a(Context var0, hf var1) {
      if (a == null) {
         a = new ih(var0, var1);
      }

      return a;
   }

   void a(Throwable var1) {
      String var2 = hg.a(var1);

      try {
         if (!TextUtils.isEmpty(var2)) {
            hy var3;
            if ((var2.contains("amapdynamic") || var2.contains("admic")) && var2.contains("com.amap.api")) {
               var3 = new hy(this.c, ii.a());
               if (var2.contains("loc")) {
                  ig.a(var3, this.c, "loc");
               }

               if (var2.contains("navi")) {
                  ig.a(var3, this.c, "navi");
               }

               if (var2.contains("sea")) {
                  ig.a(var3, this.c, "sea");
               }

               if (var2.contains("2dmap")) {
                  ig.a(var3, this.c, "2dmap");
               }

               if (var2.contains("3dmap")) {
                  ig.a(var3, this.c, "3dmap");
               }
            } else if (var2.contains("com.autonavi.aps.amapapi.offline")) {
               var3 = new hy(this.c, ii.a());
               ig.a(var3, this.c, "OfflineLocation");
            } else if (var2.contains("com.data.carrier_v4")) {
               var3 = new hy(this.c, ii.a());
               ig.a(var3, this.c, "Collection");
            } else if (!var2.contains("com.autonavi.aps.amapapi.httpdns") && !var2.contains("com.autonavi.httpdns")) {
               if (var2.contains("com.amap.api.aiunet")) {
                  var3 = new hy(this.c, ii.a());
                  ig.a(var3, this.c, "aiu");
               } else if (var2.contains("com.amap.co") || var2.contains("com.amap.opensdk.co") || var2.contains("com.amap.location")) {
                  var3 = new hy(this.c, ii.a());
                  ig.a(var3, this.c, "co");
               }
            } else {
               var3 = new hy(this.c, ii.a());
               ig.a(var3, this.c, "HttpDNS");
            }
         }
      } catch (Throwable var4) {
         hq.a(var4, "DynamicExceptionHandler", "uncaughtException");
      }

   }

   public void uncaughtException(Thread var1, Throwable var2) {
      this.a(var2);
      if (this.b != null) {
         this.b.uncaughtException(var1, var2);
      }

   }
}
