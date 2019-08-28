package com.amap.api.maps;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

class SwipeDismissTouchListener$1 extends AnimatorListenerAdapter {
   SwipeDismissTouchListener$1(SwipeDismissTouchListener var1) {
      this.a = var1;
   }

   public void onAnimationEnd(Animator var1) {
      SwipeDismissTouchListener.a(this.a);
   }
}
