package com.amap.api.maps.model.particle;

import com.autonavi.amap.mapcore.AMapNativeParticleSystem;
import com.autonavi.amap.mapcore.AbstractNativeInstance;

public abstract class RotationOverLife extends AbstractNativeInstance {
   protected final int TYPE_DEFAULT = -1;
   protected final int TYPE_CONSTANTROTATIONOVERLIFE = 0;
   protected int type = -1;

   public RotationOverLife() {
   }

   protected void finalize() throws Throwable {
      super.finalize();
      if (this.nativeInstance != 0L) {
         AMapNativeParticleSystem.nativeReleaseRotationOverLife(this.nativeInstance);
         this.nativeInstance = 0L;
      }

   }

   public abstract float getRotate();
}
