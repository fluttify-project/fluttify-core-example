package com.amap.api.maps.model.particle;

import com.autonavi.amap.mapcore.AMapNativeParticleSystem;

public class CurveSizeOverLife extends SizeOverLife {
   private float x;
   private float y;
   private float z;

   public CurveSizeOverLife(float var1, float var2, float var3) {
      this.x = var1;
      this.y = var2;
      this.z = var3;
      this.type = 0;
      this.createNativeInstace();
   }

   public void createNativeInstace() {
      try {
         this.nativeInstance = AMapNativeParticleSystem.nativeCreateCurveSizeOverLife(this.x, this.y, this.z);
      } catch (Throwable var2) {
         ;
      }

   }

   public float getSizeX(float var1) {
      return 0.0F;
   }

   public float getSizeY(float var1) {
      return 0.0F;
   }

   public float getSizeZ(float var1) {
      return 0.0F;
   }
}
