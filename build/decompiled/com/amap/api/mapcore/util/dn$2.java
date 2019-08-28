package com.amap.api.mapcore.util;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import com.amap.api.maps.model.LatLng;

class dn$2 implements AnimatorUpdateListener {
   dn$2(dn var1) {
      this.a = var1;
   }

   public void onAnimationUpdate(ValueAnimator var1) {
      try {
         if (dn.b(this.a) != null) {
            LatLng var2 = (LatLng)var1.getAnimatedValue();
            dn.b(this.a).setCenter(var2);
            dn.c(this.a).setPosition(var2);
         }
      } catch (Throwable var3) {
         var3.printStackTrace();
      }

   }
}
