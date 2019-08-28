package com.amap.api.mapcore.util;

import android.content.Context;
import android.text.TextUtils;

public final class kp extends km {
   private static kp c;

   public kp(Context var1, hf var2) {
      super(var1, var2);
   }

   protected final String a() {
      return "j";
   }

   public static kp a(Context var0, hf var1) {
      if (c == null) {
         c = new kp(var0, var1);
      }

      return c;
   }

   private static String a(Context var0, String var1) {
      return kl.a(var0, var1 + gz.v(var0));
   }

   public final String a(String var1) throws lf {
      if (TextUtils.isEmpty(var1 = a(this.a, var1))) {
         throw new lf("Wrong so file name");
      } else {
         return this.b.a(this.f()).b(var1).a();
      }
   }

   public final String b(String var1) {
      var1 = a(this.a, var1);
      return this.b.a(this.g()).b(var1).a();
   }

   public final String c(String var1) {
      var1 = a(this.a, var1);
      return this.b.a(this.f()).b(var1).a();
   }
}
