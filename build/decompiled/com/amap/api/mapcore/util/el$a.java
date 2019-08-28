package com.amap.api.mapcore.util;

import android.text.TextUtils;
import com.amap.api.maps.MapsInitializer;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.Locale;
import java.util.Map;

class el$a extends eh {
   private int e;
   private int f;
   private int g;
   private String h;
   private String i;

   public el$a(el var1, int var2, int var3, int var4, String var5) {
      this.d = var1;
      this.i = "";
      this.e = var2;
      this.f = var3;
      this.g = var4;
      this.h = var5;
      this.i = this.d();
      this.setProxy(hd.a(z.a));
      this.setConnectionTimeout(5000);
      this.setSoTimeout(50000);
   }

   public Map<String, String> getRequestHead() {
      Hashtable var1 = new Hashtable(16);
      var1.put("User-Agent", n.c);
      var1.put("Accept-Encoding", "gzip");
      var1.put("platinfo", String.format(Locale.US, "platform=Android&sdkversion=%s&product=%s", "6.9.2", "3dmap"));
      var1.put("x-INFO", gx.a(z.a));
      var1.put("key", gu.f(z.a));
      var1.put("logversion", "2.1");
      return var1;
   }

   private String a() {
      StringBuffer var1 = new StringBuffer();
      var1.append("key=").append(gu.f(z.a));
      var1.append("&channel=amapapi");
      if (!fb.a(this.e, this.f, this.g) && this.g >= 7) {
         if (MapsInitializer.isLoadWorldGridMap()) {
            var1.append("&x=").append(this.e);
            var1.append("&y=").append(this.f);
            var1.append("&z=").append(this.g);
            var1.append("&ds=0");
            var1.append("&dpitype=webrd");
            var1.append("&lang=").append(this.h);
            var1.append("&scale=2");
         }
      } else {
         var1.append("&z=").append(this.g).append("&x=").append(this.e).append("&y=").append(this.f).append("&lang=en&size=1&scale=1&style=7");
      }

      String var2 = var1.toString();
      String var3 = this.a(var2);
      StringBuffer var4 = new StringBuffer();
      var4.append(var2);
      String var5 = gx.a();
      var4.append("&ts=" + var5);
      var4.append("&scode=" + gx.a(z.a, var5, var3));
      return var4.toString();
   }

   private String a(String var1) {
      String[] var2 = var1.split("&");
      Arrays.sort(var2);
      StringBuffer var3 = new StringBuffer();
      String[] var4 = var2;
      int var5 = var2.length;

      for(int var6 = 0; var6 < var5; ++var6) {
         String var7 = var4[var6];
         String var8 = this.b(var7);
         var3.append(var8);
         var3.append("&");
      }

      String var9 = var3.toString();
      if (var9.length() > 1) {
         var9 = (String)var9.subSequence(0, var9.length() - 1);
         return var9;
      } else {
         return var1;
      }
   }

   private String b(String var1) {
      if (var1 == null) {
         return var1;
      } else {
         try {
            return URLDecoder.decode(var1, "utf-8");
         } catch (UnsupportedEncodingException var3) {
            ht.c(var3, "AbstractProtocalHandler", "strReEncoder");
         } catch (Exception var4) {
            ht.c(var4, "AbstractProtocalHandler", "strReEncoderException");
         }

         return "";
      }
   }

   public Map<String, String> getParams() {
      return null;
   }

   private String d() {
      if (!fb.a(this.e, this.f, this.g) && this.g >= 7) {
         return MapsInitializer.isLoadWorldGridMap() ? "http://restapi.amap.com/v4/gridmap?" : null;
      } else {
         int var1 = this.d.a.nextInt(100000);
         var1 %= 4;
         return String.format(Locale.US, "http://wprd0%d.is.autonavi.com/appmaptile?", var1 + 1);
      }
   }

   public String getURL() {
      return TextUtils.isEmpty(this.i) ? null : this.i + this.a();
   }
}
