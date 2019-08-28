package com.autonavi.ae.gmap.glanimation;

public class AbstractAdglAnimationParam2V extends AbstractAdglAnimationParam {
   public double fromXValue;
   public double toXValue;
   public double fromYValue;
   public double toYValue;

   public AbstractAdglAnimationParam2V() {
      this.reset();
   }

   public void reset() {
      super.reset();
      this.fromXValue = 0.0D;
      this.toXValue = 0.0D;
      this.fromYValue = 0.0D;
      this.toYValue = 0.0D;
   }

   public void setFromValue(double var1, double var3) {
      this.fromXValue = var1;
      this.fromYValue = var3;
      this.hasFromValue = true;
      this.hasCheckedParam = false;
   }

   public void setToValue(double var1, double var3) {
      this.toXValue = var1;
      this.toYValue = var3;
      this.hasToValue = true;
      this.hasCheckedParam = false;
   }

   public double getFromXValue() {
      return this.fromXValue;
   }

   public double getFromYValue() {
      return this.fromYValue;
   }

   public double getToXValue() {
      return this.toXValue;
   }

   public double getToYValue() {
      return this.toYValue;
   }

   public double getCurXValue() {
      return this.fromXValue + (this.toXValue - this.fromXValue) * (double)this.mult;
   }

   public double getCurYValue() {
      return this.fromYValue + (this.toYValue - this.fromYValue) * (double)this.mult;
   }

   public void checkParam() {
      this.needToCaculate = false;
      if (this.hasFromValue && this.hasToValue) {
         double var1 = this.toXValue - this.fromXValue;
         double var3 = this.toYValue - this.fromYValue;
         if (Math.abs(var1) > 1.0E-4D || Math.abs(var3) > 1.0E-4D) {
            this.needToCaculate = true;
         }
      }

      this.hasCheckedParam = true;
   }
}
