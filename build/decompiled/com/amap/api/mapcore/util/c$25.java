package com.amap.api.mapcore.util;

class c$25 implements Runnable {
   c$25(c var1) {
      this.a = var1;
   }

   public void run() {
      try {
         this.a.c.setAnchorX(Math.max(0, Math.min(c.o(this.a), this.a.h)));
         this.a.c.setAnchorY(Math.max(0, Math.min(c.p(this.a), this.a.i)));
         this.a.g.setProjectionCenter(1, this.a.c.getAnchorX(), this.a.c.getAnchorY());
         c.c(this.a, true);
      } catch (Throwable var2) {
         var2.printStackTrace();
      }

   }
}
