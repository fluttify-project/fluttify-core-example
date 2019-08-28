package com.amap.api.mapcore.util;

import android.content.Context;

final class kv$a implements kz$a {
   private String a;
   private String b;
   private kn c;
   private lg d;
   private iu e;
   private Context f;

   public kv$a(String var1, String var2, kn var3, lg var4, iu var5, Context var6) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = var4;
      this.e = var5;
      this.f = var6;
   }

   public final int a() {
      String var1 = this.c.i();
      kl.a(this.a, var1);
      if (!kl.g(var1)) {
         return 1003;
      } else if (!li.a(var1)) {
         return 1003;
      } else {
         kl.b(var1, this.c.g());
         if (!kl.d(this.b, var1)) {
            return 1003;
         } else {
            kl.e(this.c.j());
            kl.a(var1, this.c.j());
            return !kl.g(this.c.j()) ? 1003 : 1000;
         }
      }
   }

   public final void b() {
      this.d.b(this.c.i());
      this.d.b(this.a);
      this.d.c(this.c.j());
   }
}
