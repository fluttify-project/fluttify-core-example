package com.amap.api.mapcore.util;

import android.content.Context;
import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/** @deprecated */
@Deprecated
public class gw {
   public static int a = -1;
   public static String b = "";
   private static hf c;
   private static String d = "http://apiinit.amap.com/v3/log/init";
   private static String e = null;

   private static boolean a(Context var0, hf var1, boolean var2) {
      c = var1;
      String var3 = null;
      boolean var4 = true;

      try {
         var3 = a();
         HashMap var5 = new HashMap();
         var5.put("Content-Type", "application/x-www-form-urlencoded");
         var5.put("Accept-Encoding", "gzip");
         var5.put("Connection", "Keep-Alive");
         var5.put("User-Agent", c.d());
         var5.put("X-INFO", gx.b(var0));
         var5.put("logversion", "2.1");
         var5.put("platinfo", String.format("platform=Android&sdkversion=%s&product=%s", c.b(), c.a()));
         jd var6 = jd.a();
         hh var7 = new hh();
         var7.setProxy(hd.a(var0));
         var7.a((Map)var5);
         Map var8 = a(var0);
         var7.b(var8);
         var7.a(var3);
         byte[] var9 = var6.b(var7);
         var4 = a(var9);
      } catch (Throwable var10) {
         hq.a(var10, "Auth", "getAuth");
      }

      return var4;
   }

   /** @deprecated */
   @Deprecated
   public static synchronized boolean a(Context var0, hf var1) {
      return a(var0, var1, false);
   }

   private static String a() {
      return d;
   }

   private static boolean a(byte[] var0) {
      String var1 = null;

      try {
         if (var0 == null) {
            return true;
         }

         var1 = hg.a(var0);
         JSONObject var2 = new JSONObject(var1);
         if (var2.has("status")) {
            int var3 = var2.getInt("status");
            if (var3 == 1) {
               a = 1;
            } else if (var3 == 0) {
               a = 0;
            }
         }

         if (var2.has("info")) {
            b = var2.getString("info");
         }

         if (a == 0) {
            Log.i("AuthFailure", b);
         }

         if (a == 1) {
            return true;
         }

         return false;
      } catch (JSONException var4) {
         hq.a((Throwable)var4, "Auth", "lData");
      } catch (Throwable var5) {
         hq.a(var5, "Auth", "lData");
      }

      return false;
   }

   private static Map<String, String> a(Context var0) {
      HashMap var1 = new HashMap();

      try {
         var1.put("resType", "json");
         var1.put("encode", "UTF-8");
         String var2 = gx.a();
         var1.put("ts", var2);
         var1.put("key", gu.f(var0));
         String var3 = "resType=json&encode=UTF-8&key=" + gu.f(var0);
         String var4 = hg.d(var3);
         var1.put("scode", gx.a(var0, var2, var4));
      } catch (Throwable var5) {
         hq.a(var5, "Auth", "gParams");
      }

      return var1;
   }
}
