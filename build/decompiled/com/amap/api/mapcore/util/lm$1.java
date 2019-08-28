package com.amap.api.mapcore.util;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import com.autonavi.amap.mapcore.Inner_3dMap_location;

final class lm$1 implements LocationListener {
   lm$1(lm var1) {
      this.a = var1;
   }

   public final void onLocationChanged(Location var1) {
      if (var1 != null) {
         try {
            Inner_3dMap_location var2;
            (var2 = new Inner_3dMap_location(var1)).setProvider("gps");
            var2.setLocationType(1);
            Bundle var7 = var1.getExtras();
            int var3 = 0;
            if (var7 != null) {
               var3 = var7.getInt("satellites");
            }

            var2.setSatellites(var3);
            long var4 = mh.a(var2.getTime(), System.currentTimeMillis());
            var2.setTime(var4);
            this.a.f = var2;
            this.a.c = mk.b();
            this.a.d = true;
         } catch (Throwable var6) {
            mg.a(var6, "MAPGPSLocation", "onLocationChanged");
         }
      }
   }

   public final void onProviderDisabled(String var1) {
      try {
         if ("gps".equals(var1)) {
            this.a.d = false;
         }

      } catch (Throwable var2) {
         mg.a(var2, "MAPGPSLocation", "onProviderDisabled");
      }
   }

   public final void onProviderEnabled(String var1) {
   }

   public final void onStatusChanged(String var1, int var2, Bundle var3) {
   }
}
