package com.amap.api.mapcore.util;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class kr implements Parcelable {
   private String b;
   private String c;
   private String d;
   List<kq> a = new ArrayList();

   public kr() {
   }

   public kr(String var1, String var2, String var3, String var4) {
      this.b = var1;
      this.c = var2;
      this.d = var3;
      this.a = this.a(var1, var4);
   }

   private kr(String var1, String var2, String var3, List<kq> var4) {
      this.b = var1;
      this.c = var2;
      this.d = var3;
      this.a = var4;
   }

   public final String a() {
      return this.c;
   }

   public final List<kq> b() {
      if (this.a == null) {
         this.a = new ArrayList();
      }

      return this.a;
   }

   public final kq a(String var1) {
      if (this.a != null && !TextUtils.isEmpty(var1)) {
         Iterator var2 = this.a.iterator();

         kq var3;
         do {
            if (!var2.hasNext()) {
               return null;
            }
         } while(!(var3 = (kq)var2.next()).a().equals(var1));

         return var3;
      } else {
         return null;
      }
   }

   public final boolean a(kp var1) {
      if (var1 == null) {
         return false;
      } else if (this.a == null) {
         return false;
      } else {
         Iterator var2 = this.a.iterator();

         String var4;
         String var5;
         do {
            if (!var2.hasNext()) {
               return true;
            }

            kq var3;
            var4 = (var3 = (kq)var2.next()).a();
            var5 = var3.a;
            if (TextUtils.isEmpty(var4) || TextUtils.isEmpty(var5)) {
               return false;
            }

            var4 = var1.c(var4);
         } while(kl.d(var5, var4));

         return false;
      }
   }

   public static boolean a(kr var0) {
      if (var0 == null) {
         return false;
      } else if (TextUtils.isEmpty(var0.b)) {
         return false;
      } else if (!lj.a(var0.d)) {
         return false;
      } else if (!lj.a(var0.c)) {
         return false;
      } else {
         return var0.b() != null && var0.b().size() != 0;
      }
   }

   public final int describeContents() {
      return 0;
   }

   public final void writeToParcel(Parcel var1, int var2) {
      String var3 = this.c();
      var1.writeString(var3);
   }

   private List<kq> a(String var1, String var2) {
      JSONArray var9;
      try {
         var9 = new JSONArray(var2);
      } catch (JSONException var8) {
         return new ArrayList();
      }

      String var3 = UUID.randomUUID().toString();
      ArrayList var4 = new ArrayList();

      for(int var5 = 0; var5 < var9.length(); ++var5) {
         try {
            kq var6;
            (var6 = kq.c(var9.getString(var5))).a(var3);
            var6.b(var1);
            var4.add(var6);
         } catch (JSONException var7) {
            ;
         }
      }

      return var4;
   }

   public static kr b(String var0) {
      if (TextUtils.isEmpty(var0)) {
         return new kr();
      } else {
         try {
            JSONObject var5;
            String var1 = (var5 = new JSONObject(var0)).optString("ak", "");
            String var2 = var5.optString("bk", "");
            String var3 = var5.optString("ik", "");
            List var6 = kq.d(var5.optString("jk", ""));
            return new kr(var1, var2, var3, var6);
         } catch (Throwable var4) {
            kl.a("SoFile#fromJson json ex " + var4);
            return new kr();
         }
      }
   }

   public final String c() {
      JSONObject var1 = new JSONObject();

      try {
         var1.put("ak", this.b);
         var1.put("bk", this.c);
         var1.put("ik", this.d);
         var1.put("jk", kq.a(this.a));
      } catch (JSONException var2) {
         ;
      }

      return var1.toString();
   }

   public final boolean b(kp var1) {
      if (var1 == null) {
         return false;
      } else if (this.a != null && this.a.size() != 0) {
         for(int var2 = 0; var2 < this.a.size() && var2 < 20; ++var2) {
            kq var3 = (kq)this.a.get(var2);

            try {
               String var4;
               if (!kl.g(var4 = var1.b(var3.a()))) {
                  return false;
               }

               if (!kl.d(var3.a, var4)) {
                  return false;
               }
            } catch (Throwable var5) {
               return false;
            }
         }

         return true;
      } else {
         return true;
      }
   }

   static {
      new kr$1();
   }
}
