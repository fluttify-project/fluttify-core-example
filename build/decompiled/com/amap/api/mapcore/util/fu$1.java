package com.amap.api.mapcore.util;

import android.location.Location;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.amap.api.maps.model.LatLng;

class fu$1 implements OnTouchListener {
   fu$1(fu var1) {
      this.a = var1;
   }

   public boolean onTouch(View var1, MotionEvent var2) {
      if (!this.a.i) {
         return false;
      } else {
         if (var2.getAction() == 0) {
            this.a.g.setImageBitmap(this.a.b);
         } else if (var2.getAction() == 1) {
            try {
               this.a.g.setImageBitmap(this.a.a);
               this.a.h.setMyLocationEnabled(true);
               Location var3 = this.a.h.getMyLocation();
               if (var3 == null) {
                  return false;
               }

               LatLng var4 = new LatLng(var3.getLatitude(), var3.getLongitude());
               this.a.h.a(var3);
               this.a.h.a(an.a(var4, this.a.h.g()));
            } catch (Throwable var5) {
               ht.c(var5, "LocationView", "onTouch");
               var5.printStackTrace();
            }
         }

         return false;
      }
   }
}
