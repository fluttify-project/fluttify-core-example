package com.amap.api.mapcore.util;

import java.util.concurrent.Callable;

class iy$2 implements Callable<Void> {
   iy$2(iy var1) {
      this.a = var1;
   }

   public Void a() throws Exception {
      iy var1 = this.a;
      synchronized(this.a) {
         if (iy.a(this.a) == null) {
            return null;
         } else {
            iy.b(this.a);
            if (iy.c(this.a)) {
               iy.d(this.a);
               iy.a(this.a, 0);
            }

            return null;
         }
      }
   }
}
