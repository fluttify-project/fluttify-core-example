package com.amap.api.mapcore.util;

import android.content.Context;

public class jq {
   private Context a;
   private hf b;
   private String c;

   public jq(Context var1, hf var2, String var3) {
      this.a = var1.getApplicationContext();
      this.b = var2;
      this.c = var3;
   }

   byte[] a() {
      return hg.a(a(this.a, this.b, this.c));
   }

   private static String a(Context var0, hf var1, String var2) {
      StringBuilder var3 = new StringBuilder();

      try {
         var3.append("\"sdkversion\":\"").append(var1.c()).append("\",\"product\":\"").append(var1.a()).append("\",\"nt\":\"").append(gz.e(var0)).append("\",\"details\":").append(var2);
      } catch (Throwable var5) {
         var5.printStackTrace();
      }

      return var3.toString();
   }
}
