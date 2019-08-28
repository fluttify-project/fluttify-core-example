package com.amap.api.maps;

import com.autonavi.amap.mapcore.AbstractCameraUpdateMessage;

public final class CameraUpdate {
   AbstractCameraUpdateMessage a;

   CameraUpdate(AbstractCameraUpdateMessage var1) {
      this.a = var1;
   }

   public AbstractCameraUpdateMessage getCameraUpdateFactoryDelegate() {
      return this.a;
   }
}
