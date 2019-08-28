package com.amap.api.mapcore.util;

import android.content.Context;
import java.util.Hashtable;
import java.util.Locale;
import java.util.Map;

public class dx extends gm<String, dx$a> {
   private String h;
   private boolean i = false;

   public dx(Context var1, String var2) {
      super(var1, var2);
      this.g = "/map/styles";
   }

   public dx(Context var1, String var2, boolean var3) {
      super(var1, var2);
      this.i = var3;
      if (var3) {
         this.g = "/sdk/map/styles";
         this.isPostFlag = false;
      } else {
         this.g = "/map/styles";
      }

   }

   protected dx$a a(byte[] var1) throws gl {
      dx$a var2 = new dx$a();
      var2.a = var1;
      if (this.i && var1 != null) {
         if (var1.length == 0) {
            var2.a = null;
         } else if (var2.a.length <= 1024) {
            try {
               String var3 = new String(var1, "utf-8");
               if (var3.contains("errcode")) {
                  var2.a = null;
               }
            } catch (Exception var4) {
               ht.c(var4, "CustomStyleRequest", "loadData");
            }
         }
      }

      return var2;
   }

   protected dx$a a(String var1) throws gl {
      return null;
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

   public Map<String, String> getParams() {
      Hashtable var1 = new Hashtable(16);
      var1.put("key", gu.f(this.f));
      if (!this.i) {
         var1.put("output", "bin");
      }

      var1.put("styleid", this.h);
      String var2 = gx.a();
      String var3 = gx.a(this.f, var2, hg.c((Map)var1));
      var1.put("ts", var2);
      var1.put("scode", var3);
      return var1;
   }

   public String getURL() {
      return "http://restapi.amap.com/v4" + this.g;
   }

   public void c(String var1) {
      this.h = var1;
   }
}
