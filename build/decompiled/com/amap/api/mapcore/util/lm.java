package com.amap.api.mapcore.util;

import android.content.Context;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.Looper;
import com.autonavi.amap.mapcore.Inner_3dMap_location;

public final class lm {
   Context a;
   LocationManager b;
   volatile long c = 0L;
   volatile boolean d = false;
   boolean e = false;
   volatile Inner_3dMap_location f = null;
   Object g = null;
   boolean h = false;
   boolean i = false;
   LocationListener j = new lm$1(this);

   public lm(Context var1) {
      if (var1 != null) {
         this.a = var1;
         this.e();

         try {
            if (this.g == null && !this.i) {
               if (this.h) {
                  this.g = Class.forName("com.amap.api.maps.CoordinateConverter").getConstructor(Context.class).newInstance(var1);
               } else {
                  this.g = Class.forName("com.amap.api.maps2d.CoordinateConverter").getConstructor().newInstance();
               }

               if (var1 == null) {
                  this.i = true;
               }
            }
         } catch (Throwable var2) {
            ;
         }

         if (this.b == null) {
            this.b = (LocationManager)this.a.getSystemService("location");
         }

      }
   }

   private void e() {
      try {
         if (Class.forName("com.amap.api.maps.CoordinateConverter") != null) {
            this.h = true;
         }

      } catch (Throwable var1) {
         ;
      }
   }

   public final void a() {
      if (!this.e) {
         this.f();
         this.e = true;
      }

   }

   public final void b() {
      this.e = false;
      this.g();
      if (this.b != null) {
         if (this.j != null) {
            this.b.removeUpdates(this.j);
         }

      }
   }

   private void f() {
      try {
         Looper var1;
         if ((var1 = Looper.myLooper()) == null) {
            var1 = this.a.getMainLooper();
         }

         Bundle var2 = new Bundle();

         try {
            this.b.sendExtraCommand("gps", "force_xtra_injection", var2);
         } catch (Throwable var3) {
            ;
         }

         this.b.requestLocationUpdates("gps", 800L, 0.0F, this.j, var1);
      } catch (SecurityException var4) {
         ;
      } catch (Throwable var5) {
         mg.a(var5, "MAPGPSLocation", "requestLocationUpdates");
      }
   }

   private void g() {
      this.d = false;
      this.c = 0L;
      this.f = null;
   }

   public final boolean c() {
      if (this.d) {
         if (mk.b() - this.c <= 10000L) {
            return true;
         }

         this.f = null;
      }

      return false;
   }

   public final Inner_3dMap_location d() {
      if (this.f == null) {
         return null;
      } else {
         Inner_3dMap_location var1;
         if ((var1 = this.f.clone()) != null && var1.getErrorCode() == 0) {
            try {
               if (this.g != null) {
                  if (mg.a(var1.getLatitude(), var1.getLongitude())) {
                     Object[] var2;
                     (var2 = new Object[1])[0] = "GPS";
                     Class[] var3;
                     (var3 = new Class[1])[0] = String.class;
                     Object var9;
                     Object var10;
                     if (this.h) {
                        var10 = mi.a("com.amap.api.maps.CoordinateConverter$CoordType", "valueOf", var2, var3);
                        var9 = Class.forName("com.amap.api.maps.model.LatLng").getConstructor(Double.TYPE, Double.TYPE).newInstance(var1.getLatitude(), var1.getLongitude());
                     } else {
                        var10 = mi.a("com.amap.api.maps2d.CoordinateConverter$CoordType", "valueOf", var2, var3);
                        var9 = Class.forName("com.amap.api.maps2d.model.LatLng").getConstructor(Double.TYPE, Double.TYPE).newInstance(var1.getLatitude(), var1.getLongitude());
                     }

                     mi.a(this.g, "coord", var9);
                     mi.a(this.g, "from", var10);
                     double var4 = ((Double)(var9 = mi.a(this.g, "convert")).getClass().getDeclaredField("latitude").get(var9)).doubleValue();
                     double var6 = ((Double)var9.getClass().getDeclaredField("longitude").get(var9)).doubleValue();
                     var1.setLatitude(var4);
                     var1.setLongitude(var6);
                  }
               } else {
                  double[] var11;
                  if (this.i && mg.a(var1.getLatitude(), var1.getLongitude()) && (var11 = lk.a(var1.getLongitude(), var1.getLatitude())) != null) {
                     var1.setLatitude(var11[1]);
                     var1.setLongitude(var11[0]);
                  }
               }
            } catch (Throwable var8) {
               ;
            }
         }

         return var1;
      }
   }
}
