package com.amap.api.mapcore.util;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.net.Proxy;
import java.util.Map;

public class jh extends jd {
   private static jh c;
   private kj d;
   private Handler e;

   public static jh b() {
      return a(true, 5);
   }

   public static jh a(boolean var0) {
      return a(var0, 5);
   }

   private static synchronized jh a(boolean var0, int var1) {
      try {
         if (c == null) {
            c = new jh(var0, var1);
         } else if (var0 && c.d == null) {
            c.d = kj.b(var1);
         }
      } catch (Throwable var3) {
         var3.printStackTrace();
      }

      return c;
   }

   private jh(boolean var1, int var2) {
      try {
         if (var1) {
            this.d = kj.b(var2);
         }

         if (Looper.myLooper() == null) {
            this.e = new jh$a(Looper.getMainLooper(), (jh$1)null);
         } else {
            this.e = new jh$a();
         }
      } catch (Throwable var4) {
         ht.c(var4, "NetManger", "NetManger1");
         var4.printStackTrace();
      }

   }

   public byte[] b(ji var1) throws gt {
      jk var2 = null;

      try {
         var2 = this.a(var1, false);
      } catch (gt var4) {
         throw var4;
      } catch (Throwable var5) {
         var5.printStackTrace();
         ht.e().b(var5, "NetManager", "makeSyncPostRequest");
         throw new gt("未知的错误");
      }

      return var2 != null ? var2.a : null;
   }

   public byte[] d(ji var1) throws gt {
      jk var2 = null;

      try {
         var2 = this.c(var1, false);
      } catch (gt var4) {
         throw var4;
      } catch (Throwable var5) {
         throw new gt("未知的错误");
      }

      return var2 != null ? var2.a : null;
   }

   public byte[] e(ji var1) throws gt {
      jk var2 = null;

      try {
         var2 = this.c(var1, true);
      } catch (gt var4) {
         throw var4;
      } catch (Throwable var5) {
         throw new gt("未知的错误");
      }

      return var2 != null ? var2.a : null;
   }

   public Map<String, String> b(ji var1, boolean var2) throws gt {
      Map var3 = null;

      try {
         this.c(var1);
         Proxy var4;
         if (var1.c == null) {
            var4 = null;
         } else {
            var4 = var1.c;
         }

         jg var5 = new jg(var1.a, var1.b, var4, var2);
         var3 = var5.a(var1.getURL(), var1.isIPRequest(), var1.getIPDNSName(), var1.getRequestHead(), var1.getParams(), var1.isIgnoreGZip());
         return var3;
      } catch (gt var6) {
         throw var6;
      } catch (Throwable var7) {
         var7.printStackTrace();
         throw new gt("未知的错误");
      }
   }

   public jk c(ji var1, boolean var2) throws gt {
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
         var3 = var5.b(var1.getURL(), var1.isIPRequest(), var1.getIPDNSName(), var1.getRequestHead(), var1.getParams(), var1.isIgnoreGZip());
         return var3;
      } catch (gt var6) {
         throw var6;
      } catch (Throwable var7) {
         var7.printStackTrace();
         throw new gt("未知的错误");
      }
   }

   private void a(gt var1, jj var2) {
      jm var3 = new jm();
      var3.a = var1;
      var3.b = var2;
      Message var4 = Message.obtain();
      var4.obj = var3;
      var4.what = 1;
      this.e.sendMessage(var4);
   }

   private void a(jk var1, jj var2) {
      var2.a(var1.b, var1.a);
      jm var3 = new jm();
      var3.b = var2;
      Message var4 = Message.obtain();
      var4.obj = var3;
      var4.what = 0;
      this.e.sendMessage(var4);
   }
}
