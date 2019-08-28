package com.amap.api.mapcore.util;

class ft$1 implements Runnable {
   ft$1(ft var1) {
      this.a = var1;
   }

   public void run() {
      int var1 = this.a.getScrollY();
      if (ft.a(this.a) - var1 == 0) {
         if (ft.b(this.a) == 0) {
            return;
         }

         int var2 = ft.a(this.a) % ft.b(this.a);
         int var3 = ft.a(this.a) / ft.b(this.a);
         if (var2 == 0) {
            this.a.b = var3 + ft.c(this.a);
            ft.d(this.a);
         } else {
            byte var4 = 2;
            if (var2 > ft.b(this.a) / var4) {
               this.a.post(new ft$1$1(this, var2, var3));
            } else {
               this.a.post(new ft$1$2(this, var2, var3));
            }
         }
      } else {
         ft.a(this.a, this.a.getScrollY());
         this.a.postDelayed(ft.e(this.a), (long)ft.f(this.a));
      }

   }
}
