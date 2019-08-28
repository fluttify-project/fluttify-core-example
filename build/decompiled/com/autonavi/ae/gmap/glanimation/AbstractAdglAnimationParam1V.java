package com.autonavi.ae.gmap.glanimation;

public class AbstractAdglAnimationParam1V extends AbstractAdglAnimationParam {
   private float fromValue;
   private float toValue;

   public AbstractAdglAnimationParam1V() {
      this.reset();
   }

   public void reset() {
      super.reset();
      this.fromValue = 0.0F;
      this.toValue = 0.0F;
   }

   public void setFromValue(float var1) {
      this.fromValue = var1;
      this.hasFromValue = true;
      this.hasCheckedParam = false;
   }

   public void setToValue(float var1) {
      this.toValue = var1;
      this.hasToValue = true;
      this.hasCheckedParam = false;
   }

   public float getFromValue() {
      return this.fromValue;
   }

   public float getToValue() {
      return this.toValue;
   }

   public float getCurValue() {
      return this.fromValue + (this.toValue - this.fromValue) * this.mult;
   }

   public void checkParam() {
      this.needToCaculate = false;
      if (this.hasFromValue && this.hasToValue) {
         float var1 = this.toValue - this.fromValue;
         if ((double)Math.abs(var1) > 1.0E-4D) {
            this.needToCaculate = true;
         }
      }

      this.hasCheckedParam = true;
   }
}
