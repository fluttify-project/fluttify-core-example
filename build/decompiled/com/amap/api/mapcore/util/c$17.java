package com.amap.api.mapcore.util;

class c$17 implements Runnable {
   c$17(c var1, boolean var2, int var3) {
      this.c = var1;
      this.a = var2;
      this.b = var3;
   }

   public void run() {
      try {
         if (this.a) {
            this.c.g.setBuildingTextureEnable(this.b, true);
         } else {
            this.c.g.setBuildingTextureEnable(this.b, false);
         }
      } catch (Throwable var2) {
         var2.printStackTrace();
      }

   }
}
