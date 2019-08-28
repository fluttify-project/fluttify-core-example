package com.amap.api.mapcore.util;

class c$23 implements Runnable {
   c$23(c var1, boolean var2) {
      this.b = var1;
      this.a = var2;
   }

   public void run() {
      try {
         this.b.g.setRoadArrowEnable(1, this.a);
      } catch (Throwable var2) {
         var2.printStackTrace();
      }

   }
}
