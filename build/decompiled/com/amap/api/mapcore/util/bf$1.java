package com.amap.api.mapcore.util;

import java.io.File;

class bf$1 implements bx$a {
   bf$1(bf var1, String var2, File var3) {
      this.c = var1;
      this.a = var2;
      this.b = var3;
   }

   public void a(String var1, String var2, float var3) {
      int var4 = this.c.getcompleteCode();
      int var5 = (int)(60.0D + (double)var3 * 0.39D);
      if (var5 - var4 > 0 && System.currentTimeMillis() - bf.a(this.c) > 1000L) {
         this.c.setCompleteCode(var5);
         bf.a(this.c, System.currentTimeMillis());
      }

   }

   public void a(String var1, String var2) {
   }

   public void b(String var1, String var2) {
      try {
         if (!(new File(this.a)).delete()) {
            return;
         }

         cd.b(this.b);
         this.c.setCompleteCode(100);
         this.c.l.g();
      } catch (Exception var4) {
         this.c.l.a(this.c.k.b());
      }

   }

   public void a(String var1, String var2, int var3) {
      this.c.l.a(this.c.k.b());
   }
}
