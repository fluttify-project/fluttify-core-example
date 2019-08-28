package com.amap.api.maps;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.ViewGroup.LayoutParams;

class SwipeDismissTouchListener$3 implements AnimatorUpdateListener {
   SwipeDismissTouchListener$3(SwipeDismissTouchListener var1, LayoutParams var2) {
      this.b = var1;
      this.a = var2;
   }

   public void onAnimationUpdate(ValueAnimator var1) {
      this.a.height = ((Integer)var1.getAnimatedValue()).intValue();
      SwipeDismissTouchListener.b(this.b).setLayoutParams(this.a);
   }
}
