package com.amap.api.mapcore.util;

final class iv$1 implements ht$a {
   iv$1(iv var1) {
      this.a = var1;
      super();
   }

   public final void a(Thread var1, Throwable var2) {
      iv var10000 = this.a;
      StringBuffer var4 = new StringBuffer();
      String var10001;
      if (var1 != null && var2 != null) {
         StringBuilder var10002 = new StringBuilder("THREAD:");
         lc var10003 = this.a.a;
         var4.append(var10002.append(lc.a(var1)).toString());
         var4.append("THROWABLE:" + var2);
         var10001 = var4.toString();
      } else {
         var10001 = "";
      }

      var10000.a(var10001);
   }
}
