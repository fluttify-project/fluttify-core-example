package com.amap.api.mapcore.util;

class ft$1$1 implements Runnable {
   ft$1$1(ft$1 var1, int var2, int var3) {
      this.c = var1;
      this.a = var2;
      this.b = var3;
   }

   public void run() {
      this.c.a.smoothScrollTo(0, ft.a(this.c.a) - this.a + ft.b(this.c.a));
      this.c.a.b = this.b + ft.c(this.c.a) + 1;
      ft.d(this.c.a);
   }
}
