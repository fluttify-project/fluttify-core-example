package com.amap.api.mapcore.util;

import android.content.Context;
import android.os.Build;
import android.os.Build.VERSION;

final class hu$1 implements Runnable {
   hu$1(Context var1, String var2, kh var3) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
   }

   public void run() {
      try {
         Class var1 = hu.class;
         synchronized(hu.class) {
            jn var2 = ju.a(hu.a());
            ju.a(this.a, var2, this.b, 1000, 40960, "1");
            var2.f = this.c;
            if (var2.g == null) {
               var2.g = new jy(new jx(this.a, new kc(), new hj(new hl(new hn())), "EImtleSI6IiVzIiwicGxhdGZvcm0iOiJhbmRyb2lkIiwiZGl1IjoiJXMiLCJwa2ciOiIlcyIsIm1vZGVsIjoiJXMiLCJhcHBuYW1lIjoiJXMiLCJhcHB2ZXJzaW9uIjoiJXMiLCJzeXN2ZXJzaW9uIjoiJXMiLA=", new Object[]{gu.f(this.a), gz.v(this.a), gu.c(this.a), Build.MODEL, gu.b(this.a), gu.d(this.a), VERSION.RELEASE}));
            }

            var2.h = 3600000;
            jo.a(var2);
         }
      } catch (Throwable var5) {
         ht.c(var5, "lg", "pul");
      }

   }
}
