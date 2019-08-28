package com.amap.api.mapcore.util;

import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

public class iu {
   private if a;
   private kr b;
   private String c;
   private boolean d;
   private boolean e;
   private boolean f;
   private boolean g;
   private boolean h = false;
   private static String i = "";
   private static volatile String j = null;

   public iu(if var1, kr var2, String var3, boolean var4, boolean var5, boolean var6, boolean var7) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.g = var4;
      this.d = var5;
      this.e = var6;
      this.f = var7;
   }

   private static String j() {
      return !TextUtils.isEmpty(i) ? i : (i = hc.b("DEX_DOWNLOAD_SO_INFO_SP_KEY"));
   }

   public static iu a(Context var0) {
      if (var0 == null) {
         return null;
      } else if (!TextUtils.isEmpty(j)) {
         return a(j);
      } else {
         String var1;
         j = var1 = kl.a(var0, j(), "INFO_KEY");
         return a(var1);
      }
   }

   public void b(Context var1) {
      if (var1 != null) {
         String var2 = this.b();
         j = null;
         kl.a(var1, j(), "INFO_KEY", var2);
      }
   }

   public static void c(Context var0) {
      if (var0 != null) {
         j = null;
         String var10001 = j();
         String var2 = "INFO_KEY";
         String var1 = var10001;
         if (var0 != null && !TextUtils.isEmpty(var2) && !TextUtils.isEmpty(var1)) {
            Editor var3;
            (var3 = var0.getSharedPreferences(var1, 0).edit()).putString(var2, "");
            var3.commit();
         }
      }
   }

   public static iu a(String var0) {
      if (TextUtils.isEmpty(var0)) {
         return a();
      } else {
         try {
            JSONObject var8;
            String var1 = (var8 = new JSONObject(var0)).optString("fk", "");
            String var2 = var8.optString("fs", "");
            boolean var3 = var8.optBoolean("fh", false);
            boolean var4 = var8.optBoolean("fj", false);
            boolean var5 = var8.optBoolean("fm", false);
            String var6 = var8.optString("fl", "");
            boolean var9 = var8.optBoolean("cck", false);
            if var10 = if.a(var1);
            kr var12 = kr.b(var2);
            iu var11;
            (var11 = new iu(var10, var12, var6, var5, var3, var4, false)).a(var9);
            return var11;
         } catch (Throwable var7) {
            return a();
         }
      }
   }

   public static iu a() {
      return new iu((if)null, (kr)null, (String)null, false, false, false, false);
   }

   public String b() {
      JSONObject var1 = new JSONObject();

      try {
         if (this.a != null) {
            var1.put("fk", this.a.g());
         }

         if (this.b != null) {
            var1.put("fs", this.b.c());
         }

         var1.put("fm", this.g);
         var1.put("fh", this.d);
         var1.put("fj", this.e);
         var1.put("fl", this.c);
         var1.put("cck", this.h);
      } catch (JSONException var2) {
         ;
      }

      return var1.toString();
   }

   public if c() {
      return this.a;
   }

   public kr d() {
      return this.b;
   }

   public boolean d(Context var1) {
      if (this.a != null && this.a.h()) {
         return kr.a(this.b);
      } else {
         return false;
      }
   }

   public static boolean a(iu var0, hf var1) {
      if (var1 != null && var0 != null) {
         return var1.a().equals(var0.a.i()) && var1.b().equals(var0.a.j()) && var1.c().equals(var0.a.k());
      } else {
         return false;
      }
   }

   public static boolean a(Context var0, iu var1, hf var2) {
      if (var1 == null) {
         return true;
      } else {
         if (!var1.d(var0)) {
            c(var0);
         }

         if (!a(var1, var2)) {
            return true;
         } else {
            hf var10001 = var2;
            iu var5 = var1;
            hf var4 = var10001;
            if (var5.b == null) {
               return true;
            } else {
               kp var3 = kp.a(var0, var4);
               return var5.b.b(var3);
            }
         }
      }
   }

   public boolean e() {
      return this.h;
   }

   public void a(boolean var1) {
      this.h = var1;
   }

   public String f() {
      return this.c;
   }

   public void b(boolean var1) {
      this.d = var1;
   }

   public void c(boolean var1) {
      this.e = var1;
   }

   public boolean g() {
      return this.d;
   }

   public boolean h() {
      return this.e;
   }

   public boolean i() {
      return this.g;
   }

   public void d(boolean var1) {
      this.g = var1;
   }
}
