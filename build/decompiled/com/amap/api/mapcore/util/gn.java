package com.amap.api.mapcore.util;

import android.content.Context;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public abstract class gn<T, V> extends gm<T, V> {
   public gn(Context var1, T var2) {
      super(var1, var2);
   }

   protected abstract String e();

   public byte[] getEntityBytes() {
      byte[] var1 = null;

      try {
         var1 = this.e().getBytes("utf-8");
      } catch (Throwable var3) {
         var3.printStackTrace();
      }

      return var1;
   }

   public Map<String, String> getParams() {
      return null;
   }

   public Map<String, String> getRequestHead() {
      HashMap var1 = new HashMap(16);
      var1.put("Content-Type", " application/json");
      var1.put("Accept-Encoding", "gzip");
      var1.put("User-Agent", "AMAP SDK Android Trace 6.9.2");
      var1.put("x-INFO", gx.b(this.f));
      var1.put("platinfo", String.format(Locale.US, "platform=Android&sdkversion=%s&product=%s", "6.9.2", "trace"));
      var1.put("logversion", "2.1");
      return var1;
   }

   protected V d() {
      return null;
   }
}
