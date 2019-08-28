package com.amap.api.mapcore.util;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;

class dn$1 implements AnimatorListener {
   dn$1(dn var1) {
      this.a = var1;
   }

   public void onAnimationStart(Animator var1) {
   }

   public void onAnimationEnd(Animator var1) {
      dn.a(this.a);
   }

   public void onAnimationCancel(Animator var1) {
   }

   public void onAnimationRepeat(Animator var1) {
   }
}
