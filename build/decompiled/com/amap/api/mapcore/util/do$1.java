package com.amap.api.mapcore.util;

class do$1 implements Runnable {
   do$1(do var1) {
      this.a = var1;
   }

   public void run() {
      if (do.a(this.a) != null && do.a(this.a).a() != null) {
         if (do.b(this.a) != null) {
            do.a(this.a).a().removeNativeOverlay(1, do.b(this.a));
         }

         do.a(this.a, (String)null);
      }

   }
}
