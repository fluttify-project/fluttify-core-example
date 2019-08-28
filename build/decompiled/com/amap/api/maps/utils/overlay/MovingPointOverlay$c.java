package com.amap.api.maps.utils.overlay;

import com.autonavi.amap.mapcore.IPoint;

class MovingPointOverlay$c implements Runnable {
   private MovingPointOverlay$c(MovingPointOverlay var1) {
      this.a = var1;
   }

   public void run() {
      try {
         MovingPointOverlay.access$202(this.a, System.currentTimeMillis());
         MovingPointOverlay.access$302(this.a, MovingPointOverlay$a.b);
         this.a.exitFlag.set(false);

         for(; !this.a.exitFlag.get() && MovingPointOverlay.access$400(this.a) <= MovingPointOverlay.access$500(this.a).size() - 1; Thread.sleep(MovingPointOverlay.access$900(this.a))) {
            synchronized(MovingPointOverlay.access$600(this.a)) {
               if (this.a.exitFlag.get()) {
                  return;
               }

               if (MovingPointOverlay.access$300(this.a) != MovingPointOverlay$a.d) {
                  long var2 = System.currentTimeMillis() - MovingPointOverlay.access$200(this.a);
                  IPoint var4 = MovingPointOverlay.access$700(this.a, var2);
                  MovingPointOverlay.access$800(this.a).setGeoPoint(var4);
                  MovingPointOverlay.access$302(this.a, MovingPointOverlay$a.c);
               }
            }
         }

         MovingPointOverlay.access$302(this.a, MovingPointOverlay$a.e);
      } catch (Throwable var7) {
         var7.printStackTrace();
      }

   }
}
