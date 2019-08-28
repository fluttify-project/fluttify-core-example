package com.amap.api.mapcore.util;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

public class if {
   protected String a;
   private String i;
   String b;
   String c;
   String d;
   String e;
   String f;
   int g;
   int h;
   private boolean j;
   private boolean k;
   private boolean l;

   public if(String var1, String var2, String var3, boolean var4) {
      this(var1, var2, var3, false, var4);
   }

   public if(String var1, String var2, String var3, boolean var4, boolean var5) {
      this.j = false;
      this.k = false;
      this.l = true;
      this.a = var1;
      this.i = var2;
      this.j = var4;
      this.l = var5;

      try {
         String[] var6 = var1.split("/");
         int var7 = var6.length;
         if (var7 <= 1) {
            return;
         }

         this.b = var6[var7 - 1];
         String[] var8 = this.b.split("_");
         this.c = var8[0];
         this.d = var8[2];
         this.e = var8[1];
         this.g = Integer.parseInt(var8[3]);
         this.h = Integer.parseInt(var8[4].split("\\.")[0]);
      } catch (Throwable var9) {
         in.a(var9, "DexDownloadItem", "DexDownloadItem");
      }

   }

   String a() {
      return this.a;
   }

   public String b() {
      return this.i;
   }

   String c() {
      return this.d;
   }

   public boolean d() {
      return this.j;
   }

   public boolean e() {
      return this.k;
   }

   public void a(boolean var1) {
      this.k = var1;
   }

   public boolean f() {
      return this.l;
   }

   public static if a(String var0) {
      if (TextUtils.isEmpty(var0)) {
         return new if((String)null, (String)null, (String)null, true);
      } else {
         try {
            JSONObject var1 = new JSONObject(var0);
            String var2 = var1.optString("ak", "");
            String var3 = var1.optString("bk", "");
            return new if(var2, var3, "", true);
         } catch (Throwable var4) {
            im.a("DexDownloadItem#fromJson json ex " + var4);
            return new if((String)null, (String)null, (String)null, true);
         }
      }
   }

   public String g() {
      JSONObject var1 = new JSONObject();

      try {
         var1.put("ak", this.a);
         var1.put("bk", this.f);
      } catch (JSONException var3) {
         im.a((Throwable)var3);
      }

      return var1.toString();
   }

   public boolean h() {
      if (TextUtils.isEmpty(this.c)) {
         return false;
      } else if (!io.a(this.e)) {
         return false;
      } else if (!io.a(this.d)) {
         return false;
      } else {
         return this.h > 0 && this.h > 0;
      }
   }

   public String i() {
      return this.c;
   }

   public String j() {
      return this.d;
   }

   public String k() {
      return this.e;
   }
}
