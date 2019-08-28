package com.amap.api.mapcore.util;

class c$3 implements Runnable {
   c$3(c var1) {
      this.a = var1;
   }

   public void run() {
      if (c.d(this.a) != null) {
         fy var1 = c.d(this.a).i();
         if (var1 != null) {
            var1.d();
         }

         var1 = null;
      }

   }
}
