package com.amap.api.mapcore.util;

class aa$2 implements Runnable {
   aa$2(aa var1) {
      this.a = var1;
   }

   public void run() {
      synchronized(aa.a(this.a)) {
         aa.b(this.a);
      }
   }
}
