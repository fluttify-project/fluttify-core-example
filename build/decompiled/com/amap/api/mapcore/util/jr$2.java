package com.amap.api.mapcore.util;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;

final class jr$2 implements Runnable {
   jr$2(Context var1) {
      this.a = var1;
   }

   public void run() {
      Object var1 = null;

      try {
         jn var2 = ju.a(jr.a());
         ju.a(this.a, var2, hr.i, jr.a, 2097152, "6");
         var2.h = 14400000;
         if (var2.g == null) {
            hj var3 = new hj(new hl(new hn()));
            var2.g = new jy(new jx(this.a, new kc(), var3, new String(ho.a(10)), new Object[]{gu.f(this.a), gz.v(this.a), gz.m(this.a), gz.h(this.a), gz.a(), Build.MANUFACTURER, Build.DEVICE, gz.x(this.a), gu.c(this.a), Build.MODEL, gu.d(this.a), gu.b(this.a)}));
         }

         if (TextUtils.isEmpty(var2.i)) {
            var2.i = "fKey";
         }

         var2.f = new kg(this.a, var2.h, var2.i, new ke(this.a, jr.b, jr.b() * 1024, jr.c * 1024));
         jo.a(var2);
      } catch (Throwable var4) {
         ht.c(var4, "ofm", "uold");
      }

   }
}
