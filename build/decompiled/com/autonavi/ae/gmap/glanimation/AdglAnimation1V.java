package com.autonavi.ae.gmap.glanimation;

import android.os.SystemClock;

public class AdglAnimation1V extends AbstractAdglAnimation {
   private AbstractAdglAnimationParam1V v1Param = null;
   private float curValue;

   public void reset() {
      this.isOver = false;
      this.duration = 0;
      if (this.v1Param != null) {
         this.v1Param.reset();
      }

   }

   public AdglAnimation1V(int var1) {
      this.reset();
      this.duration = var1;
      this.curValue = 0.0F;
   }

   public void setAnimationValue(float var1, float var2, int var3) {
      if (this.v1Param == null) {
         this.v1Param = new AbstractAdglAnimationParam1V();
      }

      this.v1Param.reset();
      this.v1Param.setInterpolatorType(var3, 1.0F);
      this.v1Param.setFromValue(var1);
      this.v1Param.setToValue(var2);
      this.startTime = SystemClock.uptimeMillis();
      this.isOver = false;
   }

   public float getCurValue() {
      return this.curValue;
   }

   public float getStartValue() {
      return this.v1Param != null ? this.v1Param.getFromValue() : 0.0F;
   }

   public float getEndValue() {
      return this.v1Param != null ? this.v1Param.getToValue() : 0.0F;
   }

   public void doAnimation(Object var1) {
      if (!this.isOver) {
         long var2 = SystemClock.uptimeMillis();
         this.offsetTime = var2 - this.startTime;
         float var4 = (float)this.offsetTime / (float)this.duration;
         if (var4 > 1.0F) {
            var4 = 1.0F;
            this.isOver = true;
         } else if (var4 < 0.0F) {
            this.isOver = true;
            return;
         }

         if (this.v1Param != null) {
            this.v1Param.setNormalizedTime(var4);
            this.curValue = this.v1Param.getCurValue();
         }

      }
   }
}
