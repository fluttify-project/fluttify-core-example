package com.amap.api.mapcore.util;

import java.net.Proxy;

public class jd {
   public static int a = 0;
   public static String b = "";
   private static jd c;

   public jd() {
   }

   public static jd a() {
      if (c == null) {
         c = new jd();
      }

      return c;
   }

   public byte[] a(ji var1) throws gt {
      jk var2 = null;

      try {
         var2 = this.a(var1, true);
      } catch (gt var4) {
         throw var4;
      } catch (Throwable var5) {
         throw new gt("未知的错误");
      }

      return var2 != null ? var2.a : null;
   }

   public byte[] b(ji var1) throws gt {
      jk var2 = null;

      try {
         var2 = this.a(var1, false);
      } catch (gt var4) {
         throw var4;
      } catch (Throwable var5) {
         hq.a(var5, "bm", "msp");
         throw new gt("未知的错误");
      }

      return var2 != null ? var2.a : null;
   }

   protected void c(ji var1) throws gt {
      if (var1 == null) {
         throw new gt("requeust is null");
      } else if (var1.getURL() == null || "".equals(var1.getURL())) {
         throw new gt("request url is empty");
      }
   }

   public jk a(ji var1, boolean var2) throws gt {
      jk var3 = null;

      try {
         this.c(var1);
         Proxy var4;
         if (var1.c == null) {
            var4 = null;
         } else {
            var4 = var1.c;
         }

         jg var5 = new jg(var1.a, var1.b, var4, var2);
         var3 = var5.a(var1.b(), var1.isIPRequest(), var1.getIPDNSName(), var1.getRequestHead(), var1.c(), var1.isIgnoreGZip());
         return var3;
      } catch (gt var6) {
         throw var6;
      } catch (Throwable var7) {
         var7.printStackTrace();
         throw new gt("未知的错误");
      }
   }
}
