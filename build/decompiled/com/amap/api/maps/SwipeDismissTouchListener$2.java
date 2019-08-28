package com.amap.api.maps;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup.LayoutParams;

class SwipeDismissTouchListener$2 extends AnimatorListenerAdapter {
   SwipeDismissTouchListener$2(SwipeDismissTouchListener var1, LayoutParams var2, int var3) {
      this.c = var1;
      this.a = var2;
      this.b = var3;
   }

   public void onAnimationEnd(Animator var1) {
      SwipeDismissTouchListener.b(this.c).setAlpha(0.0F);
      SwipeDismissTouchListener.b(this.c).setTranslationX(0.0F);
      this.a.height = this.b;
      SwipeDismissTouchListener.b(this.c).setLayoutParams(this.a);
   }
}
