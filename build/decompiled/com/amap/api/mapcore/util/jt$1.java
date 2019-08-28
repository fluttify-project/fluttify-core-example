package com.amap.api.mapcore.util;

import android.content.Context;

final class jt$1 implements Runnable {
   jt$1(Context var1, js var2) {
      this.a = var1;
      this.b = var2;
   }

   public void run() {
      try {
         Class var1 = jt.class;
         synchronized(jt.class) {
            jt.a(this.a, this.b.a());
         }
      } catch (Throwable var4) {
         ht.c(var4, "stm", "as");
      }

   }
}
