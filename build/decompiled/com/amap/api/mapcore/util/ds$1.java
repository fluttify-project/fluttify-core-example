package com.amap.api.mapcore.util;

import com.amap.api.maps.model.animation.Animation$AnimationListener;

class ds$1 implements Animation$AnimationListener {
   ds$1(ds var1, boolean var2) {
      this.b = var1;
      this.a = var2;
   }

   public void onAnimationStart() {
   }

   public void onAnimationEnd() {
      if (ds.a(this.b) != null) {
         ds.a(this.b, true);
         ds.a(this.b).startNow();
         ds.b(this.b, this.a);
      }

   }
}
