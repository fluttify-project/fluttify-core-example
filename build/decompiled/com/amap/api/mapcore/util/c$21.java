package com.amap.api.mapcore.util;

class c$21 extends c$a {
   c$21(c var1) {
      super((c$1)null);
      this.a = var1;
   }

   public void run() {
      super.run();

      try {
         this.a.setCenterToPixel(com.amap.api.mapcore.util.c.o(this.a), com.amap.api.mapcore.util.c.p(this.a));
      } catch (Throwable var2) {
         var2.printStackTrace();
      }

   }
}
