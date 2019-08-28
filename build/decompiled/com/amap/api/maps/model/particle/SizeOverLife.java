package com.amap.api.maps.model.particle;

import com.autonavi.amap.mapcore.AMapNativeParticleSystem;
import com.autonavi.amap.mapcore.AbstractNativeInstance;

public abstract class SizeOverLife extends AbstractNativeInstance {
   protected final int TYPE_DEFAULT = -1;
   protected final int TYPE_CURVESIZEOVERLIFE = 0;
   protected int type = -1;
   public final int DEFAULT_SIZE = 0;

   public SizeOverLife() {
   }

   protected void finalize() throws Throwable {
      super.finalize();
      if (this.nativeInstance != 0L) {
         AMapNativeParticleSystem.nativeReleaseSizeOverLife(this.nativeInstance);
         this.nativeInstance = 0L;
      }

   }

   public abstract float getSizeX(float var1);

   public abstract float getSizeY(float var1);

   public abstract float getSizeZ(float var1);
}
