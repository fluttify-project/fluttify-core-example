package com.amap.api.mapcore.util;

import android.content.Context;

final class jr$1 implements Runnable {
   jr$1(Context var1, jq var2) {
      this.a = var1;
      this.b = var2;
   }

   public void run() {
      try {
         Class var1 = jr.class;
         synchronized(jr.class) {
            String var2 = Long.toString(System.currentTimeMillis());
            jn var3 = ju.a(jr.a());
            ju.a(this.a, var3, hr.i, jr.a, 2097152, "6");
            if (var3.e == null) {
               var3.e = new hj(new hl(new hn(new hl())));
            }

            jo.a(var2, this.b.a(), var3);
         }
      } catch (Throwable var6) {
         ht.c(var6, "ofm", "aple");
      }

   }
}
