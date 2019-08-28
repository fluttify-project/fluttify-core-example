package com.amap.api.maps.offlinemap;

import com.amap.api.mapcore.util.ht;
import com.amap.api.maps.AMapException;

class OfflineMapManager$2 implements Runnable {
   OfflineMapManager$2(OfflineMapManager var1, String var2) {
      this.b = var1;
      this.a = var2;
   }

   public void run() {
      try {
         this.b.b.d(this.a);
      } catch (AMapException var2) {
         ht.c(var2, "OfflineMapManager", "downloadByProvinceName");
      }

   }
}
