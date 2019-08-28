package com.amap.api.mapcore.util;

class c$22 implements Runnable {
   c$22(c var1, boolean var2) {
      this.b = var1;
      this.a = var2;
   }

   public void run() {
      try {
         this.b.g.setLabelEnable(1, this.a);
      } catch (Throwable var2) {
         var2.printStackTrace();
      }

   }
}
