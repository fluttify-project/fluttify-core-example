package com.amap.api.maps.model.particle;

import com.autonavi.amap.mapcore.AMapNativeParticleSystem;
import java.util.Random;

public class RandomVelocityBetweenTwoConstants extends VelocityGenerate {
   private float x1;
   private float y1;
   private float z1;
   private float x2;
   private float y2;
   private float z2;
   private Random random;

   public RandomVelocityBetweenTwoConstants(float var1, float var2, float var3, float var4, float var5, float var6) {
      this.x1 = var1;
      this.y1 = var2;
      this.z1 = var3;
      this.x2 = var4;
      this.y2 = var5;
      this.z2 = var6;
      this.random = new Random();
      this.createNativeInstace();
      this.type = 0;
   }

   public void createNativeInstace() {
      try {
         this.nativeInstance = AMapNativeParticleSystem.nativeCreateRandomVelocityBetweenTwoConstants(this.x1, this.y1, this.z1, this.x2, this.y2, this.z2);
      } catch (Throwable var2) {
         ;
      }

   }

   public float getX() {
      return this.random.nextFloat() * (this.x2 - this.x1) + this.x1;
   }

   public float getY() {
      return this.random.nextFloat() * (this.y2 - this.y1) + this.y1;
   }

   public float getZ() {
      return this.random.nextFloat() * (this.z2 - this.z1) + this.z1;
   }
}
