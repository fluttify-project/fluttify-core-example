package com.amap.api.mapcore.util;

class c$15 implements Runnable {
   c$15(c var1, int var2, boolean var3) {
      this.c = var1;
      this.a = var2;
      this.b = var3;
   }

   public void run() {
      try {
         this.c.g.setBuildingEnable(this.a, this.b);
      } catch (Throwable var2) {
         var2.printStackTrace();
      }

   }
}
