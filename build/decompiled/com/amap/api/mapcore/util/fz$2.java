package com.amap.api.mapcore.util;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

class fz$2 implements OnTouchListener {
   fz$2(fz var1) {
      this.a = var1;
   }

   public boolean onTouch(View var1, MotionEvent var2) {
      try {
         if (fz.a(this.a).g() <= fz.a(this.a).getMinZoomLevel() || !fz.a(this.a).isMaploaded()) {
            return false;
         }

         if (var2.getAction() == 0) {
            fz.f(this.a).setImageBitmap(fz.e(this.a));
         } else if (var2.getAction() == 1) {
            fz.f(this.a).setImageBitmap(fz.g(this.a));
            fz.a(this.a).b(an.b());
         }
      } catch (Throwable var4) {
         ht.c(var4, "ZoomControllerView", "zoomout ontouch");
         var4.printStackTrace();
      }

      return false;
   }
}
