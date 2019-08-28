package com.amap.api.mapcore.util;

import android.content.Context;
import android.text.TextUtils;

final class jp$2 implements Runnable {
   jp$2(Context var1) {
      this.a = var1;
   }

   public void run() {
      Class var1 = jp.class;
      synchronized(jp.class) {
         jn var2 = ju.a(jp.a);
         ju.a(this.a, var2, hr.j, 50, 102400, "10");
         if (var2.g == null) {
            String var3 = jp.b(this.a);
            var2.g = new jy(new jx(this.a, new kc(), new hj(new hn(new hl())), "WImFwcG5hbWUiOiIlcyIsInBrZyI6IiVzIiwiZGl1IjoiJXMi", new Object[]{gu.b(this.a), gu.c(this.a), var3}));
         }

         var2.h = 14400000;
         if (TextUtils.isEmpty(var2.i)) {
            var2.i = "eKey";
         }

         if (var2.f == null) {
            var2.f = new kg(this.a, var2.h, var2.i, new kd(5, var2.a, new ki(this.a, false)));
         }

         jo.a(var2);
      }
   }
}
