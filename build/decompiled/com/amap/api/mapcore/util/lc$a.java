package com.amap.api.mapcore.util;

import java.util.Iterator;
import java.util.List;

final class lc$a {
   private String a;
   private String b;

   public lc$a(String var1, String var2) {
      this.a = var1;
      this.b = var2;
   }

   public static String a(List<lc$a> var0) {
      StringBuffer var1 = new StringBuffer();
      Iterator var3 = var0.iterator();

      while(var3.hasNext()) {
         lc$a var2 = (lc$a)var3.next();
         var1.append("<br /> THREADINFO:" + var2.a);
         var1.append("<br /> STACK:" + var2.b);
         var1.append("<br />");
      }

      return var1.toString();
   }
}
