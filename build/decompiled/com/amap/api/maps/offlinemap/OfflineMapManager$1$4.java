package com.amap.api.maps.offlinemap;

class OfflineMapManager$1$4 implements Runnable {
   OfflineMapManager$1$4(OfflineMapManager$1 var1) {
      this.a = var1;
   }

   public void run() {
      try {
         OfflineMapManager.c(this.a.a).onVerifyComplete();
      } catch (Throwable var2) {
         var2.printStackTrace();
      }

   }
}
