package com.amap.api.maps.offlinemap;

import com.amap.api.mapcore.util.bf;
import com.amap.api.mapcore.util.bg$a;

class OfflineMapManager$1 implements bg$a {
   OfflineMapManager$1(OfflineMapManager var1) {
      this.a = var1;
   }

   public void a(bf var1) {
      if (OfflineMapManager.a(this.a) != null && var1 != null) {
         OfflineMapManager.b(this.a).post(new OfflineMapManager$1$1(this, var1));
      }

   }

   public void b(bf var1) {
      if (OfflineMapManager.a(this.a) != null && var1 != null) {
         OfflineMapManager.b(this.a).post(new OfflineMapManager$1$2(this, var1));
      }

   }

   public void c(bf var1) {
      if (OfflineMapManager.a(this.a) != null && var1 != null) {
         OfflineMapManager.b(this.a).post(new OfflineMapManager$1$3(this, var1));
      }

   }

   public void a() {
      if (OfflineMapManager.c(this.a) != null) {
         OfflineMapManager.b(this.a).post(new OfflineMapManager$1$4(this));
      }

   }
}
