package com.amap.api.mapcore.util;

class c$24 implements Runnable {
   c$24(c var1) {
      this.a = var1;
   }

   public void run() {
      try {
         this.a.g.setTrafficStyle(1, c.q(this.a).getSmoothColor(), c.q(this.a).getSlowColor(), c.q(this.a).getCongestedColor(), c.q(this.a).getSeriousCongestedColor());
      } catch (Throwable var2) {
         var2.printStackTrace();
      }

   }
}
