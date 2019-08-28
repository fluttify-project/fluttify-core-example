package com.amap.api.mapcore.util;

import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

class fz$1 implements OnTouchListener {
   fz$1(fz var1) {
      this.a = var1;
   }

   public boolean onTouch(View var1, MotionEvent var2) {
      try {
         if (fz.a(this.a).g() >= fz.a(this.a).getMaxZoomLevel() || !fz.a(this.a).isMaploaded()) {
            return false;
         }

         if (var2.getAction() == 0) {
            fz.c(this.a).setImageBitmap(fz.b(this.a));
         } else if (var2.getAction() == 1) {
            fz.c(this.a).setImageBitmap(fz.d(this.a));

            try {
               fz.a(this.a).b(an.a());
            } catch (RemoteException var4) {
               ht.c(var4, "ZoomControllerView", "zoomin ontouch");
               var4.printStackTrace();
            }
         }
      } catch (Throwable var5) {
         var5.printStackTrace();
      }

      return false;
   }
}
