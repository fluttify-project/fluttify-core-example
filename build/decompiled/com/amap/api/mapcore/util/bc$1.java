package com.amap.api.mapcore.util;

class bc$1 implements Runnable {
   bc$1(bc var1, ba var2, String var3) {
      this.c = var1;
      this.a = var2;
      this.b = var3;
   }

   public void run() {
      if (!this.a.b()) {
         this.a.a();
         bc.a(this.c).remove(this.b);
      }
   }
}
