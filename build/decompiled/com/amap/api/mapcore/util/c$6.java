package com.amap.api.mapcore.util;

class c$6 implements Runnable {
   c$6(c var1, int var2) {
      this.b = var1;
      this.a = var2;
   }

   public void run() {
      try {
         this.b.g.clearAllMessages(this.a);
      } catch (Throwable var2) {
         var2.printStackTrace();
      }

   }
}
