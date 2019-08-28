package com.amap.api.mapcore.util;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ServiceInfo;
import com.amap.api.location.AMapLocationClient;
import com.autonavi.amap.mapcore.Inner_3dMap_locationListener;
import com.autonavi.amap.mapcore.Inner_3dMap_locationManagerBase;
import com.autonavi.amap.mapcore.Inner_3dMap_locationOption;

public class ga {
   Context a;
   Inner_3dMap_locationManagerBase b = null;
   Object c = null;
   boolean d = false;
   ln e = null;
   hf f = null;

   /** @deprecated */
   public ga(Context var1) {
      try {
         this.f = lw.a();
      } catch (Throwable var2) {
         ;
      }

      this.e = new ln();
      this.a(var1);
   }

   private void a(Context var1) {
      try {
         if (var1 == null) {
            throw new IllegalArgumentException("Context参数不能为null");
         } else {
            this.a = var1.getApplicationContext();

            try {
               Class var7 = Class.forName("com.amap.api.location.AMapLocationClient");
               ComponentName var2 = new ComponentName(this.a, "com.amap.api.location.APSService");
               ServiceInfo var3 = null;

               try {
                  var3 = this.a.getPackageManager().getServiceInfo(var2, 128);
               } catch (Throwable var4) {
                  ;
               }

               if (var7 != null && var3 != null) {
                  this.d = true;
               }
            } catch (Throwable var5) {
               this.d = false;
            }

            if (this.d) {
               this.c = new AMapLocationClient(this.a);
            } else {
               this.b = this.b(this.a);
            }
         }
      } catch (Throwable var6) {
         mg.a(var6, "AMapLocationClient", "AMapLocationClient 1");
      }
   }

   private Inner_3dMap_locationManagerBase b(Context var1) {
      Object var2;
      try {
         var2 = (Inner_3dMap_locationManagerBase)ik.a(var1, this.f, hg.c("YY29tLmFtYXAuYXBpLndyYXBwZXIuSW5uZXJfM2RNYXBfbG9jYXRpb25NYW5hZ2VyV3JhcHBlcg=="), lp.class, new Class[]{Context.class}, new Object[]{var1});
      } catch (Throwable var3) {
         var2 = new lp(var1);
      }

      if (var2 == null) {
         var2 = new lp(var1);
      }

      return (Inner_3dMap_locationManagerBase)var2;
   }

   public void a(Inner_3dMap_locationOption var1) {
      try {
         if (var1 == null) {
            throw new IllegalArgumentException("LocationManagerOption参数不能为null");
         } else if (this.d) {
            ln var10000 = this.e;
            ln.a(this.c, var1);
         } else {
            this.b.setLocationOption(var1);
         }
      } catch (Throwable var2) {
         mg.a(var2, "AMapLocationClient", "setLocationOption");
      }
   }

   public void a(Inner_3dMap_locationListener var1) {
      try {
         if (var1 == null) {
            throw new IllegalArgumentException("listener参数不能为null");
         } else if (this.d) {
            this.e.a(this.c, var1);
         } else {
            this.b.setLocationListener(var1);
         }
      } catch (Throwable var2) {
         mg.a(var2, "AMapLocationClient", "setLocationListener");
      }
   }

   public void a() {
      try {
         if (this.d) {
            ((AMapLocationClient)this.c).startLocation();
         } else {
            this.b.startLocation();
         }
      } catch (Throwable var1) {
         mg.a(var1, "AMapLocationClient", "startLocation");
      }
   }

   public void b() {
      try {
         if (this.d) {
            ((AMapLocationClient)this.c).stopLocation();
         } else {
            this.b.stopLocation();
         }
      } catch (Throwable var1) {
         mg.a(var1, "AMapLocationClient", "stopLocation");
      }
   }

   public void c() {
      try {
         if (this.d) {
            ((AMapLocationClient)this.c).onDestroy();
         } else {
            this.b.destroy();
         }

         if (this.e != null) {
            this.e = null;
         }

      } catch (Throwable var1) {
         mg.a(var1, "AMapLocationClient", "onDestroy");
      }
   }
}
