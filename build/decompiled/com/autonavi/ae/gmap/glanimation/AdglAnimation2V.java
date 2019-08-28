package com.autonavi.ae.gmap.glanimation;

import android.os.SystemClock;

public class AdglAnimation2V extends AbstractAdglAnimation {
   private AbstractAdglAnimationParam2V v2Param = null;
   private double curValue1;
   private double curValue2;

   public AdglAnimation2V(int var1) {
      this.reset();
      this.duration = var1;
      this.curValue1 = 0.0D;
      this.curValue2 = 0.0D;
   }

   public void reset() {
      this.isOver = false;
      this.duration = 0;
      this.curValue1 = 0.0D;
      this.curValue2 = 0.0D;
      if (this.v2Param != null) {
         this.v2Param.reset();
      }

   }

   public double getCurValue(int var1) {
      return var1 == 0 ? this.curValue1 : this.curValue2;
   }

   public double getStartValue(int var1) {
      if (var1 == 0) {
         return this.v2Param != null ? this.v2Param.getFromXValue() : 0.0D;
      } else {
         return this.v2Param != null ? this.v2Param.getFromYValue() : 0.0D;
      }
   }

   public double getEndValue(int var1) {
      if (var1 == 0) {
         return this.v2Param != null ? this.v2Param.getToXValue() : 0.0D;
      } else {
         return this.v2Param != null ? this.v2Param.getToYValue() : 0.0D;
      }
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

         if (this.v2Param != null) {
            this.v2Param.setNormalizedTime(var4);
            this.curValue1 = this.v2Param.getCurXValue();
            this.curValue2 = this.v2Param.getCurYValue();
         }

      }
   }
}
