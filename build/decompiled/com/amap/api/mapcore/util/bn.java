package com.amap.api.mapcore.util;

import android.content.Context;
import com.amap.api.maps.AMapException;
import com.amap.api.maps.offlinemap.OfflineMapProvince;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class bn extends ce<String, List<OfflineMapProvince>> {
   private Context d;

   public bn(Context var1, String var2) {
      super(var1, var2);
   }

   public void a(Context var1) {
      this.d = var1;
   }

   protected List<OfflineMapProvince> a(JSONObject var1) throws AMapException {
      List var2 = null;

      try {
         if (this.d != null) {
            cd.c(var1.toString(), this.d);
         }
      } catch (Throwable var5) {
         ht.c(var5, "OfflineUpdateCityHandlerAbstract", "loadData jsonInit");
         var5.printStackTrace();
      }

      try {
         if (this.d != null) {
            var2 = cd.a(var1, this.d);
         }
      } catch (JSONException var4) {
         ht.c(var4, "OfflineUpdateCityHandlerAbstract", "loadData parseJson");
         var4.printStackTrace();
      }

      return var2;
   }

   protected JSONObject a(gv$a var1) {
      if (var1 != null && var1.w != null) {
         JSONObject var2 = var1.w.optJSONObject("015");
         if (!var2.has("result")) {
            JSONObject var3 = new JSONObject();

            try {
               var3.put("result", (new JSONObject()).put("offlinemap_with_province_vfour", var2));
               return var3;
            } catch (JSONException var5) {
               var5.printStackTrace();
            }
         }

         return var2;
      } else {
         return null;
      }
   }

   protected String a() {
      StringBuilder var1 = new StringBuilder();
      var1.append("015");
      return var1.toString();
   }

   protected Map<String, String> b() {
      Hashtable var1 = new Hashtable(16);
      var1.put("mapver", this.a);
      return var1;
   }
}
