package com.amap.api.mapcore.util;

class c$14 implements Runnable {
   c$14(c var1, int var2) {
      this.b = var1;
      this.a = var2;
   }

   public void run() {
      try {
         this.b.g.clearAllMessages(this.a);
         this.b.g.clearAnimations(this.a, true);
      } catch (Throwable var2) {
         var2.printStackTrace();
      }

   }
}
