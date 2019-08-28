package com.amap.api.mapcore.util;

final class kw$d implements kz$a {
   private String a = null;
   private ko b;
   private lg c;

   public kw$d(String var1, ko var2, lg var3) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
   }

   public final int a() {
      String var1 = this.b.l();
      String var2 = this.b.k();
      String var3 = this.b.j();
      kl.c(this.a, var1);
      if (!li.a(var1)) {
         return 1003;
      } else {
         kl.a(var1, var2, var3);
         return 1000;
      }
   }

   public final void b() {
      String var1 = this.b.l();
      String var2 = this.b.g();
      String var3 = this.b.k();
      String var4 = this.b.j();
      lg.a(var3);
      this.c.b(var4);
      this.c.b(var1);
      this.c.c(var2);
   }
}
