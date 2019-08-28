package com.amap.api.maps.utils.overlay;

import java.util.concurrent.ThreadFactory;

class SmoothMoveMarker$b implements ThreadFactory {
   private SmoothMoveMarker$b() {
   }

   public Thread newThread(Runnable var1) {
      Thread var2 = new Thread(var1, "MoveSmoothThread");
      return var2;
   }
}
