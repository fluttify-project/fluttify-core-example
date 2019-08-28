package com.amap.api.mapcore.util;

import com.amap.api.maps.model.LatLngBounds$Builder;

class aa$1 implements Runnable {
   aa$1(aa var1, LatLngBounds$Builder var2) {
      this.b = var1;
      this.a = var2;
   }

   public void run() {
      try {
         this.b.a.a(an.a(this.a.build(), 50));
      } catch (Throwable var2) {
         ;
      }

   }
}
