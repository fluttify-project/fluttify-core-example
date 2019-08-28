package com.amap.api.mapcore.util;

import com.amap.api.maps.model.animation.Animation$AnimationListener;

class c$27 implements Animation$AnimationListener {
   c$27(c var1, int var2) {
      this.b = var1;
      this.a = var2;
   }

   public void onAnimationStart() {
   }

   public void onAnimationEnd() {
      this.b.j.post(new c$27$1(this));
   }
}
