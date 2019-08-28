package com.amap.api.mapcore.util;

class c$2 extends c$a {
   c$2(c var1) {
      super((c$1)null);
      this.a = var1;
   }

   public void run() {
      super.run();

      try {
         this.a.setIndoorEnabled(this.c);
      } catch (Throwable var2) {
         var2.printStackTrace();
      }

   }
}
