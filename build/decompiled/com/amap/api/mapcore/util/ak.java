package com.amap.api.mapcore.util;

import com.autonavi.ae.gmap.GLMapState;
import com.autonavi.amap.mapcore.AbstractCameraUpdateMessage;

public class ak extends AbstractCameraUpdateMessage {
   public ak() {
   }

   public void runCameraUpdate(GLMapState var1) {
      this.normalChange(var1);
   }

   public void mergeCameraUpdateDelegate(AbstractCameraUpdateMessage var1) {
      var1.geoPoint = this.geoPoint == null ? var1.geoPoint : this.geoPoint;
      var1.zoom = Float.isNaN(this.zoom) ? var1.zoom : this.zoom;
      var1.bearing = Float.isNaN(this.bearing) ? var1.bearing : this.bearing;
      var1.tilt = Float.isNaN(this.tilt) ? var1.tilt : this.tilt;
   }
}
