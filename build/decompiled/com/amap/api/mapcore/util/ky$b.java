package com.amap.api.mapcore.util;

import android.content.Context;

final class ky$b implements kz$a {
   private String a;
   private kp b;
   private Context c;
   private lg d;

   public ky$b(String var1, kp var2, Context var3, lg var4) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = var4;
   }

   public final int a() {
      try {
         kl.b(this.a, this.b.i());
         if (!li.a(this.b.i())) {
            return 1003;
         } else {
            kl.a(this.b.i(), this.b);
            return 1000;
         }
      } catch (Throwable var1) {
         return 1003;
      }
   }

   public final void b() {
      this.d.c(this.b.f());
   }
}
