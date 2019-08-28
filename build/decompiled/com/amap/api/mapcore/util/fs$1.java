package com.amap.api.mapcore.util;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.amap.api.maps.model.CameraPosition;

class fs$1 implements OnTouchListener {
   fs$1(fs var1) {
      this.a = var1;
   }

   public boolean onTouch(View var1, MotionEvent var2) {
      try {
         if (!this.a.e.isMaploaded()) {
            return false;
         }

         if (var2.getAction() == 0) {
            this.a.d.setImageBitmap(this.a.b);
         } else if (var2.getAction() == 1) {
            this.a.d.setImageBitmap(this.a.a);
            CameraPosition var3 = this.a.e.getCameraPosition();
            this.a.e.b(an.a(new CameraPosition(var3.target, var3.zoom, 0.0F, 0.0F)));
         }
      } catch (Throwable var4) {
         ht.c(var4, "CompassView", "onTouch");
         var4.printStackTrace();
      }

      return false;
   }
}
