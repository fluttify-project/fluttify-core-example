package com.amap.api.mapcore.util;

import android.content.Context;
import android.os.Build.VERSION;

class hb$b {
   private int b;
   protected boolean a;
   private final boolean c;
   private boolean d;

   private hb$b() {
      this.b = 0;
      this.a = true;
      this.c = true;
      this.d = false;
   }

   public void a(Context var1) {
      if (var1 != null) {
         if (this.b <= 0 && VERSION.SDK_INT >= 4) {
            this.b = var1.getApplicationContext().getApplicationInfo().targetSdkVersion;
         }

      }
   }

   public void a(boolean var1) {
      this.a = var1;
   }

   public void b(boolean var1) {
      this.d = var1;
   }

   private int b() {
      return this.b <= 0 ? 28 : this.b;
   }

   private boolean c() {
      return this.b() >= 28;
   }

   private boolean d() {
      return VERSION.SDK_INT >= 28;
   }

   private boolean e() {
      boolean var1 = this.d();
      boolean var2 = !this.a || this.c();
      return var1 && var2;
   }

   public boolean a() {
      return this.d || this.e();
   }
}
