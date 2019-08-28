package com.amap.api.mapcore.util;

class bg$2 implements Runnable {
   bg$2(bg var1, bf var2, boolean var3) {
      this.c = var1;
      this.a = var2;
      this.b = var3;
   }

   public void run() {
      try {
         if (this.a.c().equals(this.a.a)) {
            if (bg.d(this.c) != null) {
               bg.d(this.c).c(this.a);
            }

            return;
         }

         if (this.a.getState() != 7 && this.a.getState() != -1) {
            this.c.g.a(this.a);
            if (bg.d(this.c) != null) {
               bg.d(this.c).c(this.a);
            }
         } else {
            this.c.g.a(this.a);
            if (this.b && bg.d(this.c) != null) {
               bg.d(this.c).c(this.a);
            }
         }
      } catch (Throwable var2) {
         ht.c(var2, "requestDelete", "removeExcecRunnable");
      }

   }
}
