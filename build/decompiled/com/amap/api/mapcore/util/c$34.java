package com.amap.api.mapcore.util;

class c$34 extends c$a {
   c$34(c var1) {
      super((c$1)null);
      this.a = var1;
   }

   public void run() {
      super.run();

      try {
         this.a.setRoadArrowEnable(this.c);
      } catch (Throwable var2) {
         var2.printStackTrace();
      }

   }
}
