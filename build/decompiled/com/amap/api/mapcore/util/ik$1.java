package com.amap.api.mapcore.util;

import android.content.Context;

final class ik$1 implements Runnable {
   ik$1(Context var1, String var2) {
      this.a = var1;
      this.b = var2;
   }

   public void run() {
      try {
         hy var1 = new hy(this.a, ii.a());
         ig.a(var1, this.a, this.b);
      } catch (Throwable var2) {
         in.a(var2, "InstanceFactory", "rollBack");
      }

   }
}
