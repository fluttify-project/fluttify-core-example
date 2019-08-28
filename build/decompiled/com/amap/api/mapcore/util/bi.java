package com.amap.api.mapcore.util;

import android.content.Context;
import com.amap.api.maps.AMapException;
import java.util.Hashtable;
import java.util.Map;
import org.json.JSONObject;

public class bi extends ce<String, bh> {
   public bi(Context var1, String var2) {
      super(var1, var2);
   }

   protected JSONObject a(gv$a var1) {
      return var1 != null && var1.w != null ? var1.w.optJSONObject("016") : null;
   }

   protected String a() {
      StringBuilder var1 = new StringBuilder();
      var1.append("016");
      return var1.toString();
   }

   protected Map<String, String> b() {
      Hashtable var1 = new Hashtable(16);
      var1.put("mapver", this.a);
      return var1;
   }

   protected bh a(JSONObject var1) throws AMapException {
      bh var2 = new bh();

      try {
         String var3 = var1.optString("update", "");
         if (var3.equals("0")) {
            var2.a(false);
         } else if (var3.equals("1")) {
            var2.a(true);
         }

         var2.a(var1.optString("version", ""));
      } catch (Throwable var4) {
         ht.c(var4, "OfflineInitHandlerAbstract", "loadData parseJson");
      }

      return var2;
   }
}
