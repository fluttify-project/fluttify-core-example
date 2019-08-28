package com.amap.api.mapcore.util;

class e$1 implements Runnable {
   e$1(e var1) {
      this.a = var1;
   }

   public void run() {
      if (e.a(this.a) != null) {
         try {
            e.a(this.a).onSurfaceDestory();
         } catch (Throwable var2) {
            var2.printStackTrace();
         }
      }

   }
}
