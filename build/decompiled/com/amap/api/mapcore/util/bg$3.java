package com.amap.api.mapcore.util;

import com.amap.api.maps.AMapException;

class bg$3 implements Runnable {
   bg$3(bg var1, bf var2) {
      this.b = var1;
      this.a = var2;
   }

   public void run() {
      try {
         if (bg.e(this.b)) {
            bg.b(this.b);
            bi var1 = new bi(bg.c(this.b), bg.d);
            bh var2 = (bh)var1.c();
            if (var2 != null) {
               bg.a(this.b, false);
               if (var2.a()) {
                  this.b.b();
               }
            }
         }

         this.a.setVersion(bg.d);
         this.a.f();
      } catch (AMapException var3) {
         var3.printStackTrace();
      } catch (Throwable var4) {
         ht.c(var4, "OfflineDownloadManager", "startDownloadRunnable");
      }

   }
}
