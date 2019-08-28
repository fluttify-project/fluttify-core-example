package com.amap.api.mapcore.util;

import android.content.Context;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class dz extends gm<String, dz$a> {
   public void a(String var1) {
      this.g = var1;
   }

   public dz(Context var1, String var2) {
      super(var1, var2);
      this.g = "/map/styles";
   }

   protected dz$a a(byte[] var1) throws gl {
      dz$a var2 = new dz$a();
      var2.a = var1;
      return var2;
   }

   protected dz$a c(String var1) throws gl {
      return null;
   }

   public Map<String, String> getRequestHead() {
      hf var1 = fi.e();
      String var2 = null;
      if (var1 != null) {
         var2 = var1.b();
      }

      HashMap var3 = new HashMap(16);
      var3.put("User-Agent", n.c);
      var3.put("Accept-Encoding", "gzip");
      var3.put("platinfo", String.format(Locale.US, "platform=Android&sdkversion=%s&product=%s", var2, "3dmap"));
      var3.put("x-INFO", gx.a(this.f));
      var3.put("key", gu.f(this.f));
      var3.put("logversion", "2.1");
      return var3;
   }

   public Map<String, String> getParams() {
      HashMap var1 = new HashMap(16);
      var1.put("key", gu.f(this.f));
      var1.put("output", "bin");
      String var2 = gx.a();
      String var3 = gx.a(this.f, var2, hg.c((Map)var1));
      var1.put("ts", var2);
      var1.put("scode", var3);
      return var1;
   }

   public String getURL() {
      return this.g;
   }
}
