package com.amap.api.maps.model.animation;

import android.view.animation.Interpolator;
import com.autonavi.amap.mapcore.animation.GLAlphaAnimation;

public class AlphaAnimation extends Animation {
   public AlphaAnimation(float var1, float var2) {
      this.glAnimation = new GLAlphaAnimation(var1, var2);
   }

   public void setDuration(long var1) {
      this.glAnimation.setDuration(var1);
   }

   public void setInterpolator(Interpolator var1) {
      this.glAnimation.setInterpolator(var1);
   }
}
