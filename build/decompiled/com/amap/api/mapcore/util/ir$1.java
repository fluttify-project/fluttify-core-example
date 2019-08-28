package com.amap.api.mapcore.util;

import android.content.Context;

class ir$1 implements Runnable {
   ir$1(ir var1, Context var2, String var3, String var4) {
      this.d = var1;
      this.a = var2;
      this.b = var3;
      this.c = var4;
   }

   public void run() {
      try {
         this.d.a(this.a, this.b, this.c);
      } catch (Throwable var2) {
         in.a(var2, "dLoader", "run()");
      }

   }
}
