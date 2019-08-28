package com.amap.api.mapcore.util;

class ei$d$1 implements Runnable {
   ei$d$1(ei$d var1, Runnable var2) {
      this.b = var1;
      this.a = var2;
   }

   public void run() {
      try {
         this.a.run();
      } finally {
         this.b.a();
      }

   }
}
