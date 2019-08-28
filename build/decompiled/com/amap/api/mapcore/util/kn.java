package com.amap.api.mapcore.util;

import android.content.Context;

public final class kn extends km {
   public kn(Context var1, hf var2) {
      super(var1, var2);
   }

   protected final String a() {
      return "h";
   }

   public final String j() {
      Context var2 = this.a;
      String var1 = hc.b("dex" + gz.v(var2) + this.b());
      return this.b.a(this.d()).b(var1).a();
   }

   public final String k() {
      return this.b.a(this.d()).b(hc.b("workopt" + gz.v(this.a))).a();
   }
}
