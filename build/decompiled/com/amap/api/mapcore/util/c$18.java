package com.amap.api.mapcore.util;

class c$18 implements Runnable {
   c$18(c var1, boolean var2, boolean var3) {
      this.c = var1;
      this.a = var2;
      this.b = var3;
   }

   public void run() {
      try {
         boolean var1 = this.c.c.isTrafficEnabled();
         if (var1 != this.a) {
            this.c.c.setTrafficEnabled(this.b);
            com.amap.api.mapcore.util.c.t(this.c).setTrafficMode(this.a);
            boolean var2 = this.a;
            this.c.g.setTrafficEnable(1, this.a);
            this.c.resetRenderTime();
         }
      } catch (Throwable var3) {
         var3.printStackTrace();
      }

   }
}
