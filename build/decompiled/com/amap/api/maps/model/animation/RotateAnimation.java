package com.amap.api.maps.model.animation;

import android.view.animation.Interpolator;
import com.autonavi.amap.mapcore.animation.GLRotateAnimation;

public class RotateAnimation extends Animation {
   public RotateAnimation(float var1, float var2, float var3, float var4, float var5) {
      this.glAnimation = new GLRotateAnimation(var1, var2, var3, var4, var5);
   }

   public RotateAnimation(float var1, float var2) {
      this.glAnimation = new GLRotateAnimation(var1, var2, 0.0F, 0.0F, 0.0F);
   }

   public void setDuration(long var1) {
      this.glAnimation.setDuration(var1);
   }

   public void setInterpolator(Interpolator var1) {
      this.glAnimation.setInterpolator(var1);
   }
}
