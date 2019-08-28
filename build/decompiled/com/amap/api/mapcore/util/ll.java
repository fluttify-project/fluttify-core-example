package com.amap.api.mapcore.util;

import com.amap.api.location.AMapLocation;
import com.amap.api.location.AMapLocationListener;
import com.autonavi.amap.mapcore.Inner_3dMap_location;
import com.autonavi.amap.mapcore.Inner_3dMap_locationListener;

public final class ll implements AMapLocationListener {
   public Inner_3dMap_locationListener a = null;

   public ll() {
   }

   public final void a(Inner_3dMap_locationListener var1) {
      this.a = var1;
   }

   public final void onLocationChanged(AMapLocation var1) {
      try {
         Inner_3dMap_location var3;
         if (lw.a(var3 = ln.a(var1))) {
            ln.a = var3;
         }

         if (this.a != null) {
            this.a.onLocationChanged(var3);
         }

      } catch (Throwable var2) {
         mg.a(var2, "LocationListener", "onLocationChanged");
      }
   }
}
