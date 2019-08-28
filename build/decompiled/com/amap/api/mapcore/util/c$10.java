package com.amap.api.mapcore.util;

class c$10 implements Runnable {
   c$10(c var1, fr var2) {
      this.b = var1;
      this.a = var2;
   }

   public void run() {
      if (!c.r(this.b)) {
         try {
            if (this.b.d != null) {
               this.b.setIndoorBuildingInfo(this.b.d);
            }
         } catch (Throwable var2) {
            var2.printStackTrace();
         }

         this.a.a(false);
      }
   }
}
