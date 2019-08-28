package com.amap.api.mapcore.util;

import android.graphics.drawable.Drawable;
import android.view.View;

class fv$2 implements Runnable {
   fv$2(fv var1) {
      this.a = var1;
   }

   public void run() {
      if (fv.d(this.a) != null) {
         fv.d(this.a).clearFocus();
         this.a.removeView(fv.d(this.a));
         Drawable var1 = fv.d(this.a).getBackground();
         fi.a(var1);
         fi.a(fv.e(this.a));
         fv.a((fv)this.a, (View)null);
      }

   }
}
