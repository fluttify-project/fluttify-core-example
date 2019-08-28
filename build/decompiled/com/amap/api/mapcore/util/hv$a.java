package com.amap.api.mapcore.util;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

class hv$a {
   private String a;
   private String b;
   private String c;
   private String d;
   private String e;

   public hv$a(String var1, String var2, String var3, String var4, String var5) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = var4;
      this.e = var5;
   }

   public String a() {
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

   public String e() {
      return this.e;
   }

   public hv$a() {
   }

   public static hv$a a(String var0) {
      if (TextUtils.isEmpty(var0)) {
         return new hv$a();
      } else {
         try {
            JSONObject var1 = new JSONObject(var0);
            String var2 = var1.optString("mk", "");
            String var3 = var1.optString("ak", "");
            String var4 = var1.optString("bk", "");
            String var5 = var1.optString("ik", "");
            String var6 = var1.optString("nk", "");
            return new hv$a(var2, var3, var4, var5, var6);
         } catch (Throwable var7) {
            return new hv$a();
         }
      }
   }

   public static List<hv$a> b(String var0) {
      if (TextUtils.isEmpty(var0)) {
         return new ArrayList();
      } else {
         ArrayList var1 = new ArrayList();

         try {
            JSONArray var2 = new JSONArray(var0);

            for(int var3 = 0; var3 < var2.length(); ++var3) {
               var1.add(a(var2.getString(var3)));
            }
         } catch (Throwable var4) {
            var4.printStackTrace();
         }

         return var1;
      }
   }
}
