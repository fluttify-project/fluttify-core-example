package com.amap.api.mapcore.util;

import android.content.Context;
import android.text.TextUtils;

public final class ko extends km {
   private String c = "";
   private String d = "";
   private String e = null;

   public ko(Context var1, hf var2) {
      super(var1, var2);
   }

   protected final String a() {
      return "s";
   }

   public final String j() {
      lh var10000 = this.b.a(this.c());
      String var10001;
      if (!TextUtils.isEmpty(this.c)) {
         var10001 = this.c;
      } else {
         this.c = kl.a(this.a, "SoPng");
         var10001 = this.c;
      }

      return var10000.b(var10001).a();
   }

   public final String k() {
      lh var10000 = this.b.a(this.c());
      String var10001;
      if (!TextUtils.isEmpty(this.d)) {
         var10001 = this.d;
      } else {
         this.d = kl.a(this.a, "DexPng");
         var10001 = this.d;
      }

      return var10000.b(var10001).a();
   }

   public static boolean a(String var0) {
      return var0 != null && var0.equalsIgnoreCase("dex.png");
   }

   public final String l() {
      if (!TextUtils.isEmpty(this.e)) {
         return this.e;
      } else if (this.a == null) {
         return "";
      } else {
         this.e = this.b.a(this.g()).b(this.e()).a();
         return this.e;
      }
   }
}
