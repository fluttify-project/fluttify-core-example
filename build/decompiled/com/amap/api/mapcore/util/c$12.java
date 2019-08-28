package com.amap.api.mapcore.util;

class c$12 implements Runnable {
   c$12(c var1, int var2) {
      this.b = var1;
      this.a = var2;
   }

   public void run() {
      if (c.s(this.b) && this.b.g != null) {
         this.b.g.setHighlightSubwayEnable(this.a, false);
      }

   }
}
