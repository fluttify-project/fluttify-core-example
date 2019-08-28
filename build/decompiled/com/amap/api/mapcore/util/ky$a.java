package com.amap.api.mapcore.util;

import android.content.Context;

final class ky$a implements kz$a {
   private kp a;
   private lg b;
   private iu c;
   private Context d;

   public ky$a(kp var1, lg var2, iu var3, Context var4) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = var4;
   }

   public final int a() {
      kr var1 = this.c.d();
      kl.d(this.a.g());

      for(int var2 = 0; var2 < var1.b().size(); ++var2) {
         String var3 = ((kq)var1.b().get(var2)).a();

         try {
            kl.b(this.a.c(var3), this.a.b(var3));
         } catch (Throwable var4) {
            return 1003;
         }
      }

      this.c.d(true);
      this.c.b(this.d);
      return 1000;
   }

   public final void b() {
      this.b.c(this.a.f());
      iu.c(this.d);
   }
}
