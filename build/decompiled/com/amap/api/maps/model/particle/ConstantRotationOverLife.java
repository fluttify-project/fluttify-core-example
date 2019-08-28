package com.amap.api.maps.model.particle;

import com.autonavi.amap.mapcore.AMapNativeParticleSystem;

public class ConstantRotationOverLife extends RotationOverLife {
   private float rotate = 0.0F;

   public ConstantRotationOverLife(float var1) {
      this.rotate = var1;
      this.type = 0;
      this.createNativeInstace();
   }

   public void createNativeInstace() {
      try {
         this.nativeInstance = AMapNativeParticleSystem.nativeCreateConstantRotationOverLife(this.rotate);
      } catch (Throwable var2) {
         ;
      }

   }

   public float getRotate() {
      return this.rotate;
   }
}
