package com.amap.api.maps.utils.overlay;

import com.autonavi.amap.mapcore.IPoint;

class SmoothMoveMarker$c implements Runnable {
   private SmoothMoveMarker$c(SmoothMoveMarker var1) {
      this.a = var1;
   }

   public void run() {
      try {
         SmoothMoveMarker.access$202(this.a, System.currentTimeMillis());
         SmoothMoveMarker.access$302(this.a, SmoothMoveMarker$a.b);
         this.a.exitFlag.set(false);

         for(; !this.a.exitFlag.get() && SmoothMoveMarker.access$400(this.a) <= SmoothMoveMarker.access$500(this.a).size() - 1; Thread.sleep(SmoothMoveMarker.access$900(this.a))) {
            synchronized(SmoothMoveMarker.access$600(this.a)) {
               if (this.a.exitFlag.get()) {
                  return;
               }

               if (SmoothMoveMarker.access$300(this.a) != SmoothMoveMarker$a.d) {
                  long var2 = System.currentTimeMillis() - SmoothMoveMarker.access$200(this.a);
                  IPoint var4 = SmoothMoveMarker.access$700(this.a, var2);
                  if (SmoothMoveMarker.access$800(this.a) != null) {
                     SmoothMoveMarker.access$800(this.a).setGeoPoint(var4);
                  }

                  SmoothMoveMarker.access$302(this.a, SmoothMoveMarker$a.c);
               }
            }
         }

         SmoothMoveMarker.access$302(this.a, SmoothMoveMarker$a.e);
      } catch (Throwable var7) {
         var7.printStackTrace();
      }

   }
}
