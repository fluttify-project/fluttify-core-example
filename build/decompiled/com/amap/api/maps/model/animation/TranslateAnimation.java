package com.amap.api.maps.model.animation;

import android.view.animation.Interpolator;
import com.amap.api.maps.model.LatLng;
import com.autonavi.amap.mapcore.animation.GLTranslateAnimation;

public class TranslateAnimation extends Animation {
   public TranslateAnimation(LatLng var1) {
      this.glAnimation = new GLTranslateAnimation(var1);
   }

   public void setDuration(long var1) {
      this.glAnimation.setDuration(var1);
   }

   public void setInterpolator(Interpolator var1) {
      this.glAnimation.setInterpolator(var1);
   }
}
