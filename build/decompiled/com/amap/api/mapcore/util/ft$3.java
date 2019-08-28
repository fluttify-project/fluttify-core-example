package com.amap.api.mapcore.util;

class ft$3 implements Runnable {
   ft$3(ft var1, int var2) {
      this.b = var1;
      this.a = var2;
   }

   public void run() {
      this.b.smoothScrollTo(0, this.a * ft.b(this.b));
   }
}
