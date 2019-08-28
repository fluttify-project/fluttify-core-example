package com.amap.api.mapcore.util;

class c$20 implements Runnable {
   c$20(c var1, boolean var2) {
      this.b = var1;
      this.a = var2;
   }

   public void run() {
      if (this.b.g != null) {
         this.b.g.setOfflineDataEnable(1, this.a);
      }

   }
}
