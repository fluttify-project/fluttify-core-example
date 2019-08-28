package com.amap.api.maps.model.particle;

import com.autonavi.amap.mapcore.AMapNativeParticleSystem;
import com.autonavi.amap.mapcore.AbstractNativeInstance;

public abstract class ColorGenerate extends AbstractNativeInstance {
   protected final int TYPE_DEFAULT = -1;
   protected final int TYPE_RANDOMCOLORBETWEENTWOCONSTANTS = 0;
   protected int type = -1;

   public ColorGenerate() {
   }

   public abstract float[] getColor();

   protected void finalize() throws Throwable {
      super.finalize();
      if (this.nativeInstance != 0L) {
         AMapNativeParticleSystem.nativeReleaseColorGenerate(this.nativeInstance);
         this.nativeInstance = 0L;
      }

   }
}
