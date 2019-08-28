package com.amap.api.mapcore.util;

import android.content.Context;
import android.os.Handler;
import com.amap.api.maps.model.LatLng;
import com.amap.api.trace.TraceLocation;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class gp extends gn<List<TraceLocation>, List<LatLng>> implements Runnable {
   private List<TraceLocation> h;
   private Handler i = null;
   private int j = 0;
   private int k = 0;
   private String l;

   public gp(Context var1, Handler var2, List<TraceLocation> var3, int var4, String var5, int var6, int var7) {
      super(var1, var3);
      this.h = var3;
      this.i = var2;
      this.k = var6;
      this.j = var7;
      this.l = var5;
   }

   protected String e() {
      JSONArray var1 = new JSONArray();
      long var2 = 0L;

      for(int var4 = 0; var4 < this.h.size(); ++var4) {
         TraceLocation var5 = (TraceLocation)this.h.get(var4);
         JSONObject var6 = new JSONObject();

         try {
            var6.put("x", var5.getLongitude());
            var6.put("y", var5.getLatitude());
            var6.put("ag", (int)var5.getBearing());
            long var7 = var5.getTime();
            if (var4 == 0) {
               if (var7 == 0L) {
                  var7 = (System.currentTimeMillis() - 10000L) / 1000L;
               }

               var6.put("tm", var7 / 1000L);
            } else if (var7 != 0L && var7 - var2 >= 1000L) {
               var6.put("tm", (var7 - var2) / 1000L);
            } else {
               var6.put("tm", 1);
            }

            var2 = var7;
            var6.put("sp", (int)var5.getSpeed());
         } catch (JSONException var9) {
            var9.printStackTrace();
         }

         var1.put(var6);
      }

      this.g = this.getURL() + "&" + var1.toString();
      return var1.toString();
   }

   protected List<LatLng> a(String var1) throws gl {
      ArrayList var2 = new ArrayList();

      try {
         JSONObject var3 = new JSONObject(var1);
         if (!var3.has("data")) {
            return var2;
         }

         JSONObject var4 = var3.optJSONObject("data");
         JSONArray var5 = var4.optJSONArray("points");
         if (var5 == null || var5.length() == 0) {
            return var2;
         }

         for(int var6 = 0; var6 < var5.length(); ++var6) {
            JSONObject var7 = var5.optJSONObject(var6);
            double var8 = Double.parseDouble(var7.optString("y"));
            double var10 = Double.parseDouble(var7.optString("x"));
            LatLng var12 = new LatLng(var8, var10);
            var2.add(var12);
         }
      } catch (JSONException var13) {
         var13.printStackTrace();
      } catch (Throwable var14) {
         var14.printStackTrace();
      }

      return var2;
   }

   public void run() {
      new ArrayList();

      try {
         List var1;
         try {
            var1 = (List)this.a();
         } catch (gl var3) {
            gr.a().a(this.i, this.k, var3.a());
            return;
         }

         gr.a().a(this.l, this.j, var1);
         gr.a().a(this.l).a(this.i);
      } catch (Throwable var4) {
         var4.printStackTrace();
      }

   }

   public String getURL() {
      String var1 = "key=" + gu.f(this.f);
      String var2 = gx.a();
      String var3 = "&ts=" + var2;
      String var4 = gx.a(this.f, var2, var1);
      String var5 = "&scode=" + var4;
      return "http://restapi.amap.com/v4/grasproad/driving?" + var1 + var3 + var5;
   }
}
