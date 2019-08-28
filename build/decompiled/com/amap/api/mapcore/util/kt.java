package com.amap.api.mapcore.util;

import android.content.Context;
import android.text.TextUtils;
import java.io.Closeable;

public final class kt extends ie {
   private ko f;
   private iu g;
   private kp h;
   private kn i;

   public kt(Context var1, if var2, iu var3, hf var4) {
      super(var1, var2, var4);
      this.g = var3;
      this.f = new ko(var1, var4);
      this.c = this.f.h();
      this.h = new kp(var1, var4);
      this.i = new kn(this.e, var4);
   }

   public final void a() {
      if (kl.g(this.c)) {
         this.onFinish();
      } else if (lh.a(this.e)) {
         super.a();
      }
   }

   public final void onFinish() {
      try {
         if (this.d != null) {
            in.a((Closeable)this.d);
         }

         Context var2 = this.e;
         if (var2 != null) {
            lg var3 = lg.a();
            (new kw(var2, this.a, var3, this.g, this.f, this.i, this.h)).c();
         }

      } catch (Throwable var4) {
         in.a(var4, "dDownLoad", "onFinish()");
      }
   }

   public static boolean a(hf var0) {
      if (var0 == null) {
         return false;
      } else {
         String var1 = var0.b();
         String var2;
         if (TextUtils.isEmpty(var2 = var0.c())) {
            return true;
         } else {
            return lj.a(var2, var1) > 0;
         }
      }
   }
}
