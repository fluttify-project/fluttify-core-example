package com.amap.api.mapcore.util;

class c$19 implements Runnable {
   c$19(c var1, boolean var2) {
      this.b = var1;
      this.a = var2;
   }

   public void run() {
      if (this.a) {
         this.b.b(true);
      } else if (c.d(this.b) != null) {
         c.d(this.b).i(false);
      }

   }
}
