package com.amap.api.mapcore.util;

class c$b$2 implements Runnable {
   c$b$2(c$b var1, ft var2) {
      this.b = var1;
      this.a = var2;
   }

   public void run() {
      try {
         this.a.a(this.b.a.d.floor_names);
         this.a.a(this.b.a.d.activeFloorName);
         if (!this.a.d()) {
            this.a.a(true);
         }
      } catch (Throwable var2) {
         var2.printStackTrace();
      }

   }
}
