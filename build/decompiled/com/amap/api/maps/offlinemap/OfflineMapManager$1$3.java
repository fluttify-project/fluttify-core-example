package com.amap.api.maps.offlinemap;

import com.amap.api.mapcore.util.bf;

class OfflineMapManager$1$3 implements Runnable {
   OfflineMapManager$1$3(OfflineMapManager$1 var1, bf var2) {
      this.b = var1;
      this.a = var2;
   }

   public void run() {
      try {
         if (this.a.c().equals(this.a.a)) {
            OfflineMapManager.a(this.b.a).onRemove(true, this.a.getCity(), "");
         } else {
            OfflineMapManager.a(this.b.a).onRemove(false, this.a.getCity(), "");
         }
      } catch (Throwable var2) {
         var2.printStackTrace();
      }

   }
}
