package com.amap.api.mapcore.util;

import android.content.Context;
import android.os.Build;
import android.os.Build.VERSION;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

class gv$b extends je {
   private String f;
   private Map<String, String> g;
   private boolean h;

   gv$b(Context var1, hf var2, String var3, Map<String, String> var4) {
      super(var1, var2);
      this.f = var3;
      this.g = var4;
      this.h = VERSION.SDK_INT != 19;
   }

   public boolean a() {
      return this.h;
   }

   public Map<String, String> getRequestHead() {
      return null;
   }

   public String getURL() {
      return this.h ? "https://restapi.amap.com/v3/iasdkauth" : "http://restapi.amap.com/v3/iasdkauth";
   }

   public byte[] d() {
      return null;
   }

   public byte[] e() {
      return hg.a(hg.b(this.k()));
   }

   protected String f() {
      return "3.0";
   }

   private Map<String, String> k() {
      String var1 = gz.v(this.d);
      if (TextUtils.isEmpty(var1)) {
         var1 = gz.i(this.d);
      }

      if (!TextUtils.isEmpty(var1)) {
         StringBuilder var2 = new StringBuilder(var1);
         var1 = var2.reverse().toString();
         var1 = hc.b(var1);
      }

      HashMap var4 = new HashMap();
      var4.put("authkey", this.f);
      var4.put("plattype", "android");
      var4.put("product", this.e.a());
      var4.put("version", this.e.b());
      var4.put("output", "json");
      var4.put("androidversion", VERSION.SDK_INT + "");
      var4.put("deviceId", var1);
      var4.put("manufacture", Build.MANUFACTURER);
      if (this.g != null && !this.g.isEmpty()) {
         var4.putAll(this.g);
      }

      String var3 = hg.a(this.d);
      var4.put("abitype", var3);
      var4.put("ext", this.e.e());
      return var4;
   }
}
