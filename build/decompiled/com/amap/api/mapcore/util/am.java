package com.amap.api.mapcore.util;

import com.autonavi.ae.gmap.GLMapState;
import com.autonavi.amap.mapcore.AbstractCameraUpdateMessage;

public class am extends AbstractCameraUpdateMessage {
   public am() {
   }

   public void runCameraUpdate(GLMapState var1) {
      this.zoom = var1.getMapZoomer() + this.amount;
      this.zoom = fi.a(this.mapConfig, this.zoom);
      this.normalChange(var1);
   }

   public void mergeCameraUpdateDelegate(AbstractCameraUpdateMessage var1) {
      var1.zoom += this.amount;
   }
}
