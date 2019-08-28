package com.amap.api.maps.offlinemap;

import com.amap.api.mapcore.util.bf;

class OfflineMapManager$1$1 implements Runnable {
   OfflineMapManager$1$1(OfflineMapManager$1 var1, bf var2) {
      this.b = var1;
      this.a = var2;
   }

   public void run() {
      try {
         OfflineMapManager.a(this.b.a).onDownload(this.a.c().b(), this.a.getcompleteCode(), this.a.getCity());
      } catch (Throwable var2) {
         var2.printStackTrace();
      }

   }
}
