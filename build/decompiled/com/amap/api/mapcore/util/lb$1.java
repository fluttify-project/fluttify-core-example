package com.amap.api.mapcore.util;

import android.content.Context;

final class lb$1 implements Runnable {
   lb$1(lb var1, Context var2, kp var3, kn var4) {
      this.d = var1;
      this.a = var2;
      this.b = var3;
      this.c = var4;
      super();
   }

   public final void run() {
      try {
         lb.a(this.d, this.a, this.b, this.c);
      } catch (Throwable var2) {
         kl.a(var2, "cfa");
      }
   }
}
