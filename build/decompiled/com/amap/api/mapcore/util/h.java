package com.amap.api.mapcore.util;

import android.location.Location;
import com.amap.api.maps.LocationSource$OnLocationChangedListener;

class h implements LocationSource$OnLocationChangedListener {
   private u b;
   Location a;

   h(u var1) {
      this.b = var1;
   }

   public void onLocationChanged(Location var1) {
      this.a = var1;

      try {
         if (this.b.isMyLocationEnabled()) {
            this.b.a(var1);
         }
      } catch (Throwable var3) {
         ht.c(var3, "AMapOnLocationChangedListener", "onLocationChanged");
         var3.printStackTrace();
      }

   }
}
