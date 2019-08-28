package com.autonavi.ae.gmap.glanimation;

public abstract class AbstractAdglAnimationParam {
   protected int interpolationType = 0;
   protected float factor = 1.0F;
   protected float normalizedTime;
   protected float mult;
   protected boolean hasCheckedParam = false;
   protected boolean needToCaculate = false;
   protected boolean hasFromValue;
   protected boolean hasToValue;

   static float bounce(float var0) {
      return var0 * var0 * 8.0F;
   }

   public void reset() {
      this.hasCheckedParam = false;
      this.needToCaculate = false;
      this.interpolationType = 0;
      this.factor = 1.0F;
      this.hasCheckedParam = false;
      this.needToCaculate = false;
      this.hasFromValue = false;
      this.hasToValue = false;
   }

   public boolean needToCaculate() {
      if (!this.hasCheckedParam) {
         this.checkParam();
      }

      return this.hasCheckedParam && this.needToCaculate;
   }

   public float getCurMult() {
      return this.mult;
   }

   public void setNormalizedTime(float var1) {
      this.normalizedTime = var1;
      float var2 = 0.0F;
      switch(this.interpolationType) {
      case 0:
         var2 = var1;
         break;
      case 1:
         var2 = (float)Math.pow((double)var1, (double)(2.0F * this.factor));
         break;
      case 2:
         if (this.factor == 1.0F) {
            var2 = 1.0F - (1.0F - var1) * (1.0F - var1);
         } else {
            var2 = (float)(1.0D - Math.pow((double)(1.0F - var1), (double)(2.0F * this.factor)));
         }
         break;
      case 3:
         var2 = (float)(Math.cos((double)(var1 + 1.0F) * 3.141592653589793D) / 2.0D + 0.5D);
         break;
      case 4:
         var1 *= 1.1226F;
         if (var1 < 0.3535F) {
            var2 = bounce(var1);
         } else if (var1 < 0.7408F) {
            var2 = bounce(var1 - 0.54719F) + 0.7F;
         } else if (var1 < 0.9644F) {
            var2 = bounce(var1 - 0.8526F) + 0.9F;
         } else {
            var2 = bounce(var1 - 1.0435F) + 0.95F;
         }
         break;
      case 5:
         float var3 = 2.0F;
         --var1;
         var2 = var1 * var1 * ((var3 + 1.0F) * var1 + var3) + 1.0F;
         break;
      case 6:
         if (var1 < 0.0F) {
            var2 = 0.0F;
         } else if (var1 < 0.25F) {
            var2 = var1 * 4.0F;
         } else if (var1 < 0.5F) {
            var2 = 2.0F - 4.0F * var1;
         } else if (var1 < 0.75F) {
            var2 = 4.0F * var1 - 2.0F;
         } else if (var1 <= 1.0F) {
            var2 = 4.0F - 4.0F * var1;
         } else {
            var2 = 0.0F;
         }
      }

      this.mult = var2;
   }

   public void setInterpolatorType(int var1, float var2) {
      this.interpolationType = var1;
      this.factor = var2;
   }

   public int getInterpolatorType() {
      return this.interpolationType;
   }

   public abstract void checkParam();

   public AbstractAdglAnimationParam() {
      this.hasCheckedParam = false;
      this.needToCaculate = false;
      this.hasFromValue = false;
      this.hasToValue = false;
   }
}
