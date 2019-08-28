package com.amap.api.maps.model;

import android.util.Log;
import com.amap.api.mapcore.util.ht;

public final class CameraPosition$Builder {
   private LatLng target;
   private float zoom;
   private float tilt;
   private float bearing;

   public CameraPosition$Builder() {
   }

   public CameraPosition$Builder(CameraPosition var1) {
      this.target(var1.target).bearing(var1.bearing).tilt(var1.tilt).zoom(var1.zoom);
   }

   public CameraPosition$Builder target(LatLng var1) {
      this.target = var1;
      return this;
   }

   public CameraPosition$Builder zoom(float var1) {
      this.zoom = var1;
      return this;
   }

   public CameraPosition$Builder tilt(float var1) {
      this.tilt = var1;
      return this;
   }

   public CameraPosition$Builder bearing(float var1) {
      this.bearing = var1;
      return this;
   }

   public CameraPosition build() {
      String var1 = "build";

      try {
         if (this.target == null) {
            Log.w("CameraPosition", "target is null");
            return null;
         } else {
            return new CameraPosition(this.target, this.zoom, this.tilt, this.bearing);
         }
      } catch (Throwable var3) {
         ht.c(var3, "CameraPosition", var1);
         return null;
      }
   }
}
