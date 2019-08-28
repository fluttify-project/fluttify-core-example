package com.amap.api.mapcore.util;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.Build.VERSION;
import com.autonavi.amap.mapcore.Inner_3dMap_location;
import com.autonavi.amap.mapcore.Inner_3dMap_locationOption;
import com.autonavi.amap.mapcore.Inner_3dMap_locationOption$Inner_3dMap_Enum_LocationMode;
import org.json.JSONArray;

public final class lt {
   Context a = null;
   lm b = null;
   lu c = null;
   lt$b d = null;
   Handler e = null;
   Handler f = null;
   boolean g = false;
   boolean h = false;
   private static int m = 200;
   Inner_3dMap_locationOption i = null;
   private static boolean n = true;
   final int j = 500;
   final int k = 30;
   private JSONArray o = null;
   Object l = new Object();

   public lt(Context var1, Handler var2) {
      try {
         if (var1 == null) {
            throw new IllegalArgumentException("Context参数不能为null");
         } else {
            this.a = var1.getApplicationContext();
            this.f = var2;
            this.i = new Inner_3dMap_locationOption();
            this.f();
            this.e();
         }
      } catch (Throwable var3) {
         mg.a(var3, "LocationService", "<init>");
      }
   }

   private void e() {
      this.d = new lt$b("locServiceAction");
      this.d.setPriority(5);
      this.d.start();
      this.e = new lt$a(this, this.d.getLooper());
   }

   public final void a(Inner_3dMap_locationOption var1) {
      this.i = var1;
      if (this.i == null) {
         this.i = new Inner_3dMap_locationOption();
      }

      if (this.c != null) {
         this.c.a(var1);
      }

   }

   private void f() {
      try {
         if (this.i == null) {
            this.i = new Inner_3dMap_locationOption();
         }

         if (!this.h) {
            this.b = new lm(this.a);
            this.c = new lu(this.a);
            this.c.a(this.i);
            this.g();
            this.h = true;
         }
      } catch (Throwable var1) {
         mg.a(var1, "LocationService", "init");
      }
   }

   private void g() {
      try {
         n = mj.b(this.a, "maploc", "ue");
         if ((m = mj.a(this.a, "maploc", "opn")) > 500) {
            m = 500;
         }

         if (m < 30) {
            m = 30;
         }

      } catch (Throwable var1) {
         mg.a(var1, "LocationService", "getSPConfig");
      }
   }

   public final void a() {
      try {
         this.f();
         if (!this.i.getLocationMode().equals(Inner_3dMap_locationOption$Inner_3dMap_Enum_LocationMode.Battery_Saving) && !this.g) {
            this.g = true;
            this.b.a();
         }

         if (this.e != null) {
            this.e.sendEmptyMessage(1);
         }

      } catch (Throwable var1) {
         mg.a(var1, "LocationService", "getLocation");
      }
   }

   final void b() {
      try {
         Inner_3dMap_location var1 = null;
         if (this.i.getLocationMode().equals(Inner_3dMap_locationOption$Inner_3dMap_Enum_LocationMode.Battery_Saving) && this.g) {
            this.b.b();
            this.g = false;
         }

         if (this.b.c()) {
            var1 = this.b.d();
         } else if (!this.i.getLocationMode().equals(Inner_3dMap_locationOption$Inner_3dMap_Enum_LocationMode.Device_Sensors)) {
            var1 = this.c.a();
         }

         if (this.f != null && var1 != null) {
            Message var2;
            (var2 = Message.obtain()).obj = var1;
            var2.what = 1;
            this.f.sendMessage(var2);
         }

         this.a(var1);
      } catch (Throwable var3) {
         mg.a(var3, "LocationService", "doGetLocation");
      }
   }

   private void a(Inner_3dMap_location param1) {
      // $FF: Couldn't be decompiled
   }

   private synchronized void h() {
      try {
         if (this.o != null && this.o.length() > 0) {
            hf var1 = mg.b();
            jr.a(new jq(this.a, var1, this.o.toString()), this.a);
            this.o = null;
         }

      } catch (Throwable var2) {
         mg.a(var2, "LocationService", "writeOfflineLog");
      }
   }

   public final void c() {
      this.g = false;

      try {
         this.j();
         if (this.b != null) {
            this.b.b();
         }

      } catch (Throwable var1) {
         mg.a(var1, "LocationService", "stopLocation");
      }
   }

   public final void d() {
      try {
         this.c();
         this.i();
         if (this.d != null) {
            if (VERSION.SDK_INT >= 18) {
               try {
                  mi.a((Object)this.d, (Class)HandlerThread.class, (String)"quitSafely", (Object[])());
               } catch (Throwable var1) {
                  this.d.quit();
               }
            } else {
               this.d.quit();
            }
         }

         this.d = null;
         this.c.b();
         this.g = false;
         this.h = false;
         this.h();
      } catch (Throwable var2) {
         mg.a(var2, "LocationService", "destroy");
      }
   }

   private void i() {
      Object var1 = this.l;
      synchronized(this.l) {
         if (this.e != null) {
            this.e.removeCallbacksAndMessages((Object)null);
         }

         this.e = null;
      }
   }

   private void j() {
      Object var1 = this.l;
      synchronized(this.l) {
         if (this.e != null) {
            this.e.removeMessages(1);
         }

      }
   }
}
