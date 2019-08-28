package com.amap.api.mapcore.util;

import android.text.TextUtils;
import java.net.Proxy;
import java.util.Map;

public abstract class ji {
   int a = 20000;
   int b = 20000;
   Proxy c = null;

   public ji() {
   }

   String b() {
      byte[] var1 = this.getEntityBytes();
      if (var1 != null && var1.length != 0) {
         Map var2 = this.getParams();
         if (var2 == null) {
            return this.getURL();
         } else {
            String var3 = jg.a(var2);
            StringBuffer var4 = new StringBuffer();
            var4.append(this.getURL()).append("?").append(var3);
            return var4.toString();
         }
      } else {
         return this.getURL();
      }
   }

   protected String getIPDNSName() {
      return "";
   }

   protected boolean isIPRequest() {
      return !TextUtils.isEmpty(this.getIPDNSName());
   }

   public boolean isIgnoreGZip() {
      return false;
   }

   byte[] c() {
      Object var1 = null;
      byte[] var4 = this.getEntityBytes();
      if (var4 == null || var4.length == 0) {
         Map var2 = this.getParams();
         String var3 = jg.a(var2);
         if (!TextUtils.isEmpty(var3)) {
            var4 = hg.a(var3);
         }
      }

      return var4;
   }

   public abstract Map<String, String> getRequestHead();

   public abstract Map<String, String> getParams();

   public abstract String getURL();

   public final void setConnectionTimeout(int var1) {
      this.a = var1;
   }

   public final void setSoTimeout(int var1) {
      this.b = var1;
   }

   public byte[] getEntityBytes() {
      return null;
   }

   public final void setProxy(Proxy var1) {
      this.c = var1;
   }
}
