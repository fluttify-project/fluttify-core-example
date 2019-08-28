package com.amap.api.mapcore.util;

import android.content.Context;

final class ky$c implements kz$a {
   private Context a;
   private kr b;
   private kp c;
   private lg d;

   public ky$c(Context var1, kr var2, kp var3, lg var4) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = var4;
   }

   public final int a() {
      return this.b.a(this.c) ? 1000 : 1003;
   }

   public final void b() {
      this.d.c(this.c.f());
   }
}
