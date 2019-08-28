package com.amap.api.mapcore.util;

final class lg$1 implements Runnable {
   lg$1(lg var1, String var2) {
      this.b = var1;
      this.a = var2;
      super();
   }

   public final void run() {
      try {
         kl.e(this.a);
      } catch (Throwable var2) {
         kl.a(var2, "cfa");
      }
   }
}
