package com.amap.api.mapcore.util;

import android.content.Context;
import java.util.Hashtable;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

public class j extends gm<String, j$a> {
   private int[] h = new int[]{10000, 0, 10018, 10019, 10020, 10021, 10022, 10023};

   public j(Context var1, String var2) {
      super(var1, var2);
      this.g = "/feedback";
      this.isPostFlag = false;
   }

   public Map<String, String> getRequestHead() {
      hf var1 = fi.e();
      String var2 = null;
      if (var1 != null) {
         var2 = var1.b();
      }

      Hashtable var3 = new Hashtable(16);
      var3.put("User-Agent", n.c);
      var3.put("Accept-Encoding", "gzip");
      var3.put("platinfo", String.format(Locale.US, "platform=Android&sdkversion=%s&product=%s", var2, "3dmap"));
      var3.put("x-INFO", gx.a(this.f));
      var3.put("key", gu.f(this.f));
      var3.put("logversion", "2.1");
      return var3;
   }

   protected j$a a(String var1) throws gl {
      try {
         JSONObject var2 = new JSONObject(var1);
         int var3 = -1;
         String var4 = "";
         String var5 = "";
         String var6 = "errcode";
         if (var2.has(var6)) {
            var3 = var2.optInt("errcode");
            var4 = var2.optString("errmsg");
            var5 = var2.optString("errdetail");
         }

         j$a var7 = new j$a();
         var7.a = var3;
         var7.b = var4;
         var7.c = var5;
         var7.d = false;
         int[] var8 = this.h;
         int var9 = var8.length;

         for(int var10 = 0; var10 < var9; ++var10) {
            int var11 = var8[var10];
            if (var11 == var3) {
               var7.d = true;
               break;
            }
         }

         return var7;
      } catch (Throwable var12) {
         var12.printStackTrace();
         return null;
      }
   }

   public Map<String, String> getParams() {
      Hashtable var1 = new Hashtable(16);
      var1.put("key", gu.f(this.f));
      var1.put("pname", "3dmap");
      String var2 = gx.a();
      String var3 = gx.a(this.f, var2, hg.c((Map)var1));
      var1.put("ts", var2);
      var1.put("scode", var3);
      return var1;
   }

   public String getURL() {
      return "http://restapi.amap.com/v4" + this.g;
   }
}
