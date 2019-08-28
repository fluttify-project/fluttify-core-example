package com.amap.api.maps.model.particle;

import com.autonavi.amap.mapcore.AMapNativeParticleSystem;
import java.util.Random;

public class RandomColorBetWeenTwoConstants extends ColorGenerate {
   private float r;
   private float g;
   private float b;
   private float a;
   private float r1;
   private float g1;
   private float b1;
   private float a1;
   private float[] color = new float[]{1.0F, 1.0F, 1.0F, 1.0F};
   private Random random = new Random();

   public RandomColorBetWeenTwoConstants(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      this.r = var1 / 255.0F;
      this.g = var2 / 255.0F;
      this.b = var3 / 255.0F;
      this.a = var4 / 255.0F;
      this.r1 = var5 / 255.0F;
      this.g1 = var6 / 255.0F;
      this.b1 = var7 / 255.0F;
      this.a1 = var8 / 255.0F;
      this.createNativeInstace();
      this.type = 0;
   }

   public void createNativeInstace() {
      try {
         this.nativeInstance = AMapNativeParticleSystem.nativeCreateRandomColorBetWeenTwoConstants(this.r, this.g, this.b, this.a, this.r1, this.g1, this.b1, this.a1);
      } catch (Throwable var2) {
         ;
      }

   }

   public float[] getColor() {
      this.color[0] = this.random.nextFloat() * (this.r1 - this.r) + this.r;
      this.color[1] = this.random.nextFloat() * (this.g1 - this.g) + this.g;
      this.color[2] = this.random.nextFloat() * (this.b1 - this.b) + this.b;
      this.color[3] = this.random.nextFloat() * (this.a1 - this.a) + this.a;
      return this.color;
   }
}
