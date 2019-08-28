package com.amap.api.maps.model.particle;

import com.autonavi.amap.mapcore.AMapNativeParticleSystem;
import com.autonavi.amap.mapcore.AbstractNativeInstance;

public abstract class ParticleShapeModule extends AbstractNativeInstance {
   protected final int TYPE_DEFAULT = -1;
   protected final int TYPE_SINGLEPOINT = 0;
   protected final int TYPE_RECT = 1;
   protected int type = -1;
   protected boolean isUseRatio = false;

   protected void finalize() throws Throwable {
      super.finalize();
      if (this.nativeInstance != 0L) {
         AMapNativeParticleSystem.nativeReleaseParticleShapeModule(this.nativeInstance);
         this.nativeInstance = 0L;
      }

   }

   public ParticleShapeModule() {
   }

   public boolean isUseRatio() {
      return this.isUseRatio;
   }

   public abstract float[] getPoint();
}
