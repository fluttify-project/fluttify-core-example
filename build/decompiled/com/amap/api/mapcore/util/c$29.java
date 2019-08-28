package com.amap.api.mapcore.util;

class c$29 implements Runnable {
   c$29(c var1) {
      this.a = var1;
   }

   public void run() {
      try {
         if (c.w(this.a) != null) {
            c.w(this.a).c();
         }

         if (c.x(this.a) != null) {
            c.x(this.a).b();
            c.a((c)this.a, (dw)null);
         }

         if (this.a.g != null) {
            this.a.g.getOverlayBundle(c.y(this.a)).removeAll(true);
            this.a.g.destroyAMapEngine();
            this.a.g = null;
         }

         c.z(this.a).d();
      } catch (Throwable var2) {
         var2.printStackTrace();
      }

   }
}
