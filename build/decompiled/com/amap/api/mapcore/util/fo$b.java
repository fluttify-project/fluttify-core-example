package com.amap.api.mapcore.util;

class fo$b {
   String a;
   fo$c b;
   fo$b c;
   fo$b d;

   fo$b(fo var1, fo$c var2) {
      this.f = var1;
      this.c = null;
      this.d = null;
      this.b = var2;
   }

   fo$b a(int var1, int var2, String var3) {
      if (!this.a()) {
         fo$b var5 = this.c.a(var1, var2, var3);
         if (var5 == null) {
            var5 = this.d.a(var1, var2, var3);
         }

         return var5;
      } else if (this.a != null) {
         return null;
      } else {
         fo$a var4 = this.b(var1, var2);
         switch(fo$1.a[var4.ordinal()]) {
         case 1:
            return null;
         case 2:
            this.a = var3;
            return this;
         case 3:
            this.a(var1, var2);
         default:
            return this.c.a(var1, var2, var3);
         }
      }
   }

   boolean a() {
      return this.c == null;
   }

   boolean b() {
      return this.a != null || !this.a();
   }

   boolean a(String var1) {
      if (this.a()) {
         if (var1.equals(this.a)) {
            this.a = null;
            return true;
         } else {
            return false;
         }
      } else {
         boolean var2 = this.c.a(var1);
         if (!var2) {
            var2 = this.d.a(var1);
         }

         if (var2 && !this.c.b() && !this.d.b()) {
            this.c = null;
            this.d = null;
         }

         return var2;
      }
   }

   void a(int var1, int var2) {
      int var3 = this.b.c - var1;
      int var4 = this.b.d - var2;
      if (!e && var3 < 0) {
         throw new AssertionError();
      } else if (!e && var4 < 0) {
         throw new AssertionError();
      } else {
         fo$c var5;
         fo$c var6;
         if (var3 > var4) {
            var6 = new fo$c(this.b.a, this.b.b, var1, this.b.d);
            var5 = new fo$c(var6.a + var1, this.b.b, this.b.c - var1, this.b.d);
         } else {
            var6 = new fo$c(this.b.a, this.b.b, this.b.c, var2);
            var5 = new fo$c(this.b.a, var6.b + var2, this.b.c, this.b.d - var2);
         }

         this.c = new fo$b(this.f, var6);
         this.d = new fo$b(this.f, var5);
      }
   }

   fo$a b(int var1, int var2) {
      if (var1 <= this.b.c && var2 <= this.b.d) {
         return var1 == this.b.c && var2 == this.b.d ? fo$a.b : fo$a.c;
      } else {
         return fo$a.a;
      }
   }
}
