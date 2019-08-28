package com.amap.api.mapcore.util;

class c$5 extends c$a {
   c$5(c var1) {
      super((c$1)null);
      this.a = var1;
   }

   public void run() {
      super.run();

      try {
         this.a.setMyTrafficStyle(com.amap.api.mapcore.util.c.q(this.a));
      } catch (Throwable var2) {
         var2.printStackTrace();
      }

   }
}
