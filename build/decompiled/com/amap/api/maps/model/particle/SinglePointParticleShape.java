package com.amap.api.maps.model.particle;

import com.autonavi.amap.mapcore.AMapNativeParticleSystem;

public class SinglePointParticleShape extends ParticleShapeModule {
   private float[] point_3;

   public SinglePointParticleShape(float var1, float var2, float var3, boolean var4) {
      this.point_3 = new float[3];
      this.point_3[0] = var1;
      this.point_3[1] = var2;
      this.point_3[2] = var3;
      this.isUseRatio = var4;
      this.createNativeInstace();
      this.type = 0;
   }

   public void createNativeInstace() {
      try {
         this.nativeInstance = AMapNativeParticleSystem.nativeCreateSinglePointParticleShape(this.point_3[0], this.point_3[1], this.point_3[2], this.isUseRatio);
      } catch (Throwable var2) {
         ;
      }

   }

   public SinglePointParticleShape(float var1, float var2, float var3) {
      this(var1, var2, var3, false);
   }

   public float[] getPoint() {
      return this.point_3;
   }
}
