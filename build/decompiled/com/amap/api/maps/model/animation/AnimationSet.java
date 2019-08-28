package com.amap.api.maps.model.animation;

import android.view.animation.Interpolator;
import com.autonavi.amap.mapcore.animation.GLAnimationSet;

public class AnimationSet extends Animation {
   public AnimationSet(boolean var1) {
      this.glAnimation = new GLAnimationSet(var1);
   }

   public void setDuration(long var1) {
      this.glAnimation.setDuration(var1);
   }

   public void setInterpolator(Interpolator var1) {
      this.glAnimation.setInterpolator(var1);
   }

   public void addAnimation(Animation var1) {
      ((GLAnimationSet)this.glAnimation).addAnimation(var1);
   }

   public void cleanAnimation() {
      ((GLAnimationSet)this.glAnimation).cleanAnimation();
   }
}
