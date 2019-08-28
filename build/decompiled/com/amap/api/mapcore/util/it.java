package com.amap.api.mapcore.util;

import android.content.Context;
import org.json.JSONObject;

public class it {
   private hf a;
   private String b;
   private String c;
   private String d;
   private boolean e;
   private boolean f;
   private boolean g;

   private it(hf var1, String var2, String var3, boolean var4, boolean var5, boolean var6, String var7) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = var7;
      this.e = var4;
      this.f = var5;
      this.g = var6;
   }

   public static it a(hf var0, String var1, String var2, boolean var3, boolean var4, boolean var5, String var6) {
      return new it(var0, var1, var2, var3, var4, var5, var6);
   }

   public hf a() {
      return this.a;
   }

   public String b() {
      return this.b;
   }

   public String c() {
      return this.c;
   }

   public String d() {
      return this.d;
   }

   public boolean e() {
      return this.e;
   }

   public boolean f() {
      return this.f;
   }

   public boolean g() {
      return this.g;
   }

   public String a(Context var1) {
      String var4 = hg.a(var1);

      try {
         return (new JSONObject(this.d)).optJSONObject(var4).optString("dexmd5", "");
      } catch (Throwable var3) {
         return "";
      }
   }

   public String b(Context var1) {
      String var4 = hg.a(var1);

      try {
         return (new JSONObject(this.d)).optJSONObject(var4).optString("so_md5_vals", "");
      } catch (Throwable var3) {
         return "";
      }
   }
}
