package com.amap.api.mapcore.util;

class c$16 implements Runnable {
   c$16(c var1, boolean var2, int var3) {
      this.c = var1;
      this.a = var2;
      this.b = var3;
   }

   public void run() {
      if (this.c.g != null) {
         if (this.a) {
            this.c.g.setAllContentEnable(this.b, true);
         } else {
            this.c.g.setAllContentEnable(this.b, false);
         }

         this.c.g.setSimple3DEnable(this.b, false);
      }

   }
}
