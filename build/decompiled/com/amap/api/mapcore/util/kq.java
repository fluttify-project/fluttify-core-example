package com.amap.api.mapcore.util;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class kq {
   private String b;
   private String c;
   private String d;
   String a;

   public kq() {
   }

   private kq(String var1, String var2, String var3, String var4) {
      this.b = var1;
      this.c = var2;
      this.a = var3;
      this.d = var4;
   }

   public final void a(String var1) {
      this.c = var1;
   }

   public final String a() {
      return this.d;
   }

   public final void b(String var1) {
      this.b = var1;
   }

   public static kq c(String var0) {
      if (TextUtils.isEmpty(var0)) {
         return new kq();
      } else {
         try {
            JSONObject var3;
            String var1 = (var3 = new JSONObject(var0)).optString("md5", "");
            var0 = var3.optString("so_file_name", "");
            return new kq("", "", var1, var0);
         } catch (Throwable var2) {
            kl.a("SoFile#fromJson json ex " + var2);
            return new kq();
         }
      }
   }

   private static kq e(String var0) {
      if (TextUtils.isEmpty(var0)) {
         return new kq();
      } else {
         try {
            JSONObject var5;
            String var1 = (var5 = new JSONObject(var0)).optString("mk", "");
            String var2 = var5.optString("ek", "");
            String var3 = var5.optString("nk", "");
            var0 = var5.optString("sk", "");
            return new kq(var0, var1, var2, var3);
         } catch (Throwable var4) {
            kl.a("SoFile#fromJson json ex " + var4);
            return new kq();
         }
      }
   }

   public static List<kq> d(String var0) {
      if (TextUtils.isEmpty(var0)) {
         return new ArrayList();
      } else {
         ArrayList var1 = new ArrayList();

         try {
            JSONArray var4 = new JSONArray(var0);

            for(int var2 = 0; var2 < var4.length(); ++var2) {
               var1.add(e(var4.getString(var2)));
            }
         } catch (JSONException var3) {
            var3.printStackTrace();
         }

         return var1;
      }
   }

   private static String a(kq var0) {
      if (var0 == null) {
         return null;
      } else {
         JSONObject var1 = new JSONObject();

         try {
            var1.put("mk", var0.c);
            var1.put("ek", var0.a);
            var1.put("nk", var0.d);
            var1.put("sk", var0.b);
         } catch (JSONException var3) {
            ;
         }

         return var1.toString();
      }
   }

   public static String a(List<kq> var0) {
      if (var0 == null) {
         return "";
      } else {
         JSONArray var1 = new JSONArray();

         for(int var2 = 0; var2 < var0.size(); ++var2) {
            kq var3 = (kq)var0.get(var2);

            try {
               var1.put(var2, a(var3));
            } catch (JSONException var4) {
               var4.printStackTrace();
            }
         }

         return var1.toString();
      }
   }
}
