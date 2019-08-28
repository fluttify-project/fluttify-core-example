package com.amap.api.mapcore.util;

public class fo {
   fo$b a;

   public fo(int var1, int var2) {
      this.a = new fo$b(this, new fo$c(0, 0, var1, var2));
   }

   public fo$c a(int var1, int var2, String var3) {
      fo$b var4 = this.a.a(var1, var2, var3);
      if (var4 != null) {
         fo$c var5 = new fo$c(var4.b.a, var4.b.b, var4.b.c, var4.b.d);
         return var5;
      } else {
         return null;
      }
   }

   public boolean a(String var1) {
      return this.a.a(var1);
   }

   public int a() {
      return this.a.b.c;
   }

   public int b() {
      return this.a.b.d;
   }
}
