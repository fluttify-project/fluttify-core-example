package com.amap.api.maps.utils.overlay;

import java.util.concurrent.ThreadFactory;

class MovingPointOverlay$b implements ThreadFactory {
   private MovingPointOverlay$b(MovingPointOverlay var1) {
      this.a = var1;
   }

   public Thread newThread(Runnable var1) {
      Thread var2 = new Thread(var1, "MoveSmoothThread");
      return var2;
   }
}
