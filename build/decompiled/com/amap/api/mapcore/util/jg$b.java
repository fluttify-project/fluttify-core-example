package com.amap.api.mapcore.util;

import android.text.TextUtils;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;

class jg$b implements HostnameVerifier {
   private String a;
   private String b;

   private jg$b() {
   }

   public void a(String var1) {
      this.a = var1;
   }

   public void b(String var1) {
      this.b = var1;
   }

   public String a() {
      return this.b;
   }

   public boolean verify(String var1, SSLSession var2) {
      HostnameVerifier var3 = HttpsURLConnection.getDefaultHostnameVerifier();
      if (!TextUtils.isEmpty(this.a)) {
         return this.a.equals(var1);
      } else {
         return !TextUtils.isEmpty(this.b) ? var3.verify(this.b, var2) : var3.verify(var1, var2);
      }
   }
}
