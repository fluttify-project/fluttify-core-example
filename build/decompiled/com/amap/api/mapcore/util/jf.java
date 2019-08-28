package com.amap.api.mapcore.util;

import java.net.Proxy;

public class jf {
   private jg a;
   private ji b;

   public jf(ji var1) {
      this(var1, 0L, -1L);
   }

   public jf(ji var1, long var2, long var4) {
      this(var1, var2, var4, false);
   }

   public jf(ji var1, long var2, long var4, boolean var6) {
      this.b = var1;
      Proxy var7;
      if (var1.c == null) {
         var7 = null;
      } else {
         var7 = var1.c;
      }

      this.a = new jg(this.b.a, this.b.b, var7, var6);
      this.a.b(var4);
      this.a.a(var2);
   }

   public void a(jf$a var1) {
      this.a.a(this.b.getURL(), this.b.isIPRequest(), this.b.getIPDNSName(), this.b.getRequestHead(), this.b.getParams(), this.b.getEntityBytes(), var1);
   }

   public void a() {
      this.a.a();
   }
}
