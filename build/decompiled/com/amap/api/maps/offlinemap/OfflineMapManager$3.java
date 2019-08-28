package com.amap.api.maps.offlinemap;

class OfflineMapManager$3 implements Runnable {
   OfflineMapManager$3(OfflineMapManager var1, String var2) {
      this.b = var1;
      this.a = var2;
   }

   public void run() {
      this.b.b.c(this.a);
   }
}
