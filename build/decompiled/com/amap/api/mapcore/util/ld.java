package com.amap.api.mapcore.util;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class ld {
   private List<ld$a> a = new ArrayList();

   public ld() {
   }

   public final List<ld$a> a() {
      return this.a;
   }

   public static ld a(String var0) {
      if (TextUtils.isEmpty(var0)) {
         return new ld();
      } else {
         ld var1 = new ld();

         try {
            JSONArray var5 = new JSONArray(var0);

            for(int var2 = 0; var2 < var5.length(); ++var2) {
               JSONObject var3 = var5.getJSONObject(var2);
               ld$a var6 = new ld$a(var3.optString("sk", ""), var3.optString("dk", ""));
               var1.a.add(var6);
            }

            return var1;
         } catch (Throwable var4) {
            return var1;
         }
      }
   }

   public final String b() {
      if (this.a != null && this.a.size() != 0) {
         JSONArray var1 = new JSONArray();

         for(int var2 = 0; var2 < this.a.size(); ++var2) {
            ld$a var3 = (ld$a)this.a.get(var2);

            try {
               JSONObject var4;
               (var4 = new JSONObject()).put("sk", var3.a());
               var4.put("dk", var3.b());
               var1.put(var4);
            } catch (JSONException var5) {
               ;
            }
         }

         return var1.toString();
      } else {
         return "";
      }
   }

   public final void a(String var1, String var2) {
      if (!TextUtils.isEmpty(var1) && !TextUtils.isEmpty(var2)) {
         this.a.add(new ld$a(var1, var2));
      }
   }
}
