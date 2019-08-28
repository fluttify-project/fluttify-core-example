package com.amap.api.mapcore.util;

import android.content.Context;
import android.text.TextUtils;

final class jt$2 implements Runnable {
   jt$2(Context var1) {
      this.a = var1;
   }

   public void run() {
      try {
         jn var1 = ju.a(jt.a());
         ju.a(this.a, var1, hr.h, 1000, 307200, "2");
         if (var1.g == null) {
            var1.g = new jv(new jz(this.a, new jw(new ka(new kc()))));
         }

         var1.h = 3600000;
         if (TextUtils.isEmpty(var1.i)) {
            var1.i = "cKey";
         }

         if (var1.f == null) {
            var1.f = new kg(this.a, var1.h, var1.i, new kd(30, var1.a, new ki(this.a, false)));
         }

         jo.a(var1);
      } catch (Throwable var2) {
         ht.c(var2, "stm", "usd");
      }

   }
}
