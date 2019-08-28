package com.amap.api.mapcore.util;

class c$11 extends c$a {
   c$11(c var1) {
      super((c$1)null);
      this.a = var1;
   }

   public void run() {
      super.run();

      try {
         this.a.setTrafficEnabled(this.c);
      } catch (Throwable var2) {
         var2.printStackTrace();
      }

   }
}
