package com.amap.api.maps.model.particle;

import com.autonavi.amap.mapcore.AMapNativeParticleSystem;
import com.autonavi.amap.mapcore.AbstractNativeInstance;

public class ParticleEmissionModule extends AbstractNativeInstance {
   private final int rate;
   private final int rateTime;

   public ParticleEmissionModule(int var1, int var2) {
      this.rate = var1;
      this.rateTime = var2;
      this.createNativeInstace();
   }

   public void createNativeInstace() {
      try {
         this.nativeInstance = AMapNativeParticleSystem.nativeCreateParticleEmissionModule(this.rate, this.rateTime);
      } catch (Throwable var2) {
         ;
      }

   }

   protected void finalize() throws Throwable {
      super.finalize();
      if (this.nativeInstance != 0L) {
         AMapNativeParticleSystem.nativeReleaseParticleEmissonModule(this.nativeInstance);
         this.nativeInstance = 0L;
      }

   }
}
