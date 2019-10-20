package com.amap.api.mapcore.util;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.Build.VERSION;
import com.autonavi.amap.mapcore.Inner_3dMap_location;
import com.autonavi.amap.mapcore.Inner_3dMap_locationListener;
import com.autonavi.amap.mapcore.Inner_3dMap_locationManagerBase;
import com.autonavi.amap.mapcore.Inner_3dMap_locationOption;
import com.autonavi.amap.mapcore.Inner_3dMap_locationOption$Inner_3dMap_Enum_LocationMode;
import java.util.ArrayList;
import java.util.Iterator;

public class lp implements Inner_3dMap_locationManagerBase {
   Context a = null;
   ArrayList<Inner_3dMap_locationListener> b = new ArrayList();
   Object c = new Object();
   Handler d = null;
   lp$a e = null;
   Handler f = null;
   Inner_3dMap_locationOption g = new Inner_3dMap_locationOption();
   lt h = null;
   Inner_3dMap_locationOption$Inner_3dMap_Enum_LocationMode i;
   boolean j;

   public lp(Context var1) {
      this.i = Inner_3dMap_locationOption$Inner_3dMap_Enum_LocationMode.Hight_Accuracy;
      this.j = false;
      if (var1 == null) {
         throw new IllegalArgumentException("Context参数不能为null");
      } else {
         this.a = var1.getApplicationContext();
         this.e();
      }
   }

   public void setLocationOption(Inner_3dMap_locationOption var1) {
      try {
         this.a(1001, var1, 0L);
      } catch (Throwable var2) {
         mg.a(var2, "LocationClientManager", "setLocationOption");
      }
   }

   public void setLocationListener(Inner_3dMap_locationListener var1) {
      try {
         this.a(1002, var1, 0L);
      } catch (Throwable var2) {
         mg.a(var2, "MapLocationManager", "setLocationListener");
      }
   }

   public void startLocation() {
      try {
         this.a(1004, (Object)null, 0L);
      } catch (Throwable var1) {
         mg.a(var1, "MapLocationManager", "startLocation");
      }
   }

   public void stopLocation() {
      try {
         this.a(1006, (Object)null, 0L);
      } catch (Throwable var1) {
         mg.a(var1, "MapLocationManager", "stopLocation");
      }
   }

   public void unRegisterLocationListener(Inner_3dMap_locationListener var1) {
      try {
         this.a(1003, var1, 0L);
      } catch (Throwable var2) {
         mg.a(var2, "MapLocationManager", "stopLocation");
      }
   }

   public void destroy() {
      try {
         this.a(1007, (Object)null, 0L);
      } catch (Throwable var1) {
         mg.a(var1, "MapLocationManager", "stopLocation");
      }
   }

   public Inner_3dMap_location getLastKnownLocation() {
      return ln.a;
   }

   private void e() {
      try {
         if (Looper.myLooper() == null) {
            this.d = new lr(this.a.getMainLooper(), this);
         } else {
            this.d = new lr(this);
         }
      } catch (Throwable var2) {
         mg.a(var2, "MapLocationManager", "initResultHandler");
      }

      try {
         this.e = new lp$a("locaitonClientActionThread", this);
         this.e.setPriority(5);
         this.e.start();
         this.f = this.a(this.e.getLooper());
      } catch (Throwable var1) {
         mg.a(var1, "MapLocationManager", "initActionThreadAndActionHandler");
      }
   }

   private Handler a(Looper var1) {
      Object var2 = this.c;
      synchronized(this.c) {
         this.f = new lq(var1, this);
         return this.f;
      }
   }

   private void f() {
      Object var1 = this.c;
      synchronized(this.c) {
         if (this.f != null) {
            this.f.removeCallbacksAndMessages((Object)null);
         }

         this.f = null;
      }
   }

   private void a(int var1) {
      Object var2 = this.c;
      synchronized(this.c) {
         if (this.f != null) {
            this.f.removeMessages(var1);
         }

      }
   }

   private void a(int var1, Object var2, long var3) {
      Object var5 = this.c;
      synchronized(this.c) {
         if (this.f != null) {
            Message var6;
            (var6 = Message.obtain()).what = var1;
            var6.obj = var2;
            this.f.sendMessageDelayed(var6, var3);
         }

      }
   }

   final void a(Inner_3dMap_locationOption var1) {
      this.g = var1;
      if (this.g == null) {
         this.g = new Inner_3dMap_locationOption();
      }

      if (this.h != null) {
         this.h.a(this.g);
      }

      if (this.j && !this.i.equals(var1.getLocationMode())) {
         this.c();
         this.a();
      }

      this.i = this.g.getLocationMode();
   }

   final void a(Inner_3dMap_locationListener var1) {
      try {
         if (var1 == null) {
            throw new IllegalArgumentException("listener参数不能为null");
         } else {
            if (this.b == null) {
               this.b = new ArrayList();
            }

            if (!this.b.contains(var1)) {
               this.b.add(var1);
            }

         }
      } catch (Throwable var2) {
         mg.a(var2, "MapLocationManager", "doSetLocationListener");
      }
   }

   final void b(Inner_3dMap_locationListener var1) {
      try {
         if (var1 != null && !this.b.isEmpty() && this.b.contains(var1)) {
            this.b.remove(var1);
         }

         if (this.b.isEmpty()) {
            this.c();
         }

      } catch (Throwable var2) {
         mg.a(var2, "MapLocationManager", "doUnregisterListener");
      }
   }

   final void a() {
      try {
         if (!this.j) {
            this.j = true;
            this.a(1005, (Object)null, 0L);
         }
      } catch (Throwable var1) {
         mg.a(var1, "MapLocationManager", "doStartLocation");
      }
   }

   final void b() {
      try {
         if (this.h != null) {
            this.h.a();
         }

         return;
      } catch (Throwable var4) {
         mg.a(var4, "MapLocationManager", "doGetLocation");
      } finally {
         if (!this.g.isOnceLocation()) {
            this.a(1005, (Object)null, this.g.getInterval() < 1000L ? 1000L : this.g.getInterval());
         }

      }

   }

   final void c() {
      try {
         this.j = false;
         this.a(1004);
         this.a(1005);
         if (this.h != null) {
            this.h.c();
         }

      } catch (Throwable var1) {
         mg.a(var1, "MapLocationManager", "doStopLocation");
      }
   }

   final void d() {
      this.c();
      if (this.h != null) {
         this.h.d();
      }

      if (this.b != null) {
         this.b.clear();
         this.b = null;
      }

      this.f();
      if (this.e != null) {
         if (VERSION.SDK_INT >= 18) {
            try {
               mi.a((Object)this.e, (Class)HandlerThread.class, (String)"quitSafely", (Object[])());
            } catch (Throwable var1) {
               this.e.quit();
            }
         } else {
            this.e.quit();
         }
      }

      this.e = null;
      if (this.d != null) {
         this.d.removeCallbacksAndMessages((Object)null);
         this.d = null;
      }

   }

   final void a(Inner_3dMap_location var1) {
      try {
         if (var1 != null && lw.a(var1)) {
            ln.a = var1;
         }

         if (this.j) {
            if (!"gps".equalsIgnoreCase(var1.getProvider())) {
               var1.setProvider("lbs");
            }

            var1.setAltitude(mk.b(var1.getAltitude()));
            var1.setBearing(mk.a(var1.getBearing()));
            var1.setSpeed(mk.a(var1.getSpeed()));
            Iterator var2 = this.b.iterator();

            while(var2.hasNext()) {
               Inner_3dMap_locationListener var3 = (Inner_3dMap_locationListener)var2.next();

               try {
                  var3.onLocationChanged(var1);
               } catch (Throwable var4) {
                  ;
               }
            }
         }

         if (this.g.isOnceLocation()) {
            this.c();
         }

      } catch (Throwable var5) {
         mg.a(var5, "MapLocationManager", "callBackLocation");
      }
   }
}
