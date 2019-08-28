package com.amap.api.mapcore.util;

class f$1 implements Runnable {
   f$1(f var1) {
      this.a = var1;
   }

   public void run() {
      try {
         if (f.a(this.a) != null) {
            f.a(this.a).onSurfaceDestory();
         }
      } catch (Throwable var2) {
         var2.printStackTrace();
      }

   }
}
