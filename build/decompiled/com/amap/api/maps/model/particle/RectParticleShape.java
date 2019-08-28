package com.amap.api.maps.model.particle;

import com.autonavi.amap.mapcore.AMapNativeParticleSystem;

public class RectParticleShape extends ParticleShapeModule {
   private final float left;
   private final float top;
   private final float right;
   private final float bottom;

   public RectParticleShape(float var1, float var2, float var3, float var4, boolean var5) {
      this.left = var1;
      this.top = var2;
      this.right = var3;
      this.bottom = var4;
      this.isUseRatio = var5;
      this.createNativeInstace();
      this.type = 1;
   }

   public void createNativeInstace() {
      try {
         this.nativeInstance = AMapNativeParticleSystem.nativeCreateRectParticleShape(this.left, this.top, this.right, this.bottom, this.isUseRatio);
      } catch (Throwable var2) {
         ;
      }

   }

   public float[] getPoint() {
      return null;
   }
}
