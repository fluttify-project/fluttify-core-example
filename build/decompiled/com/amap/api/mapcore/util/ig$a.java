package com.amap.api.mapcore.util;

import java.util.List;

public class ig$a {
   public static void a(hy var0, ij var1, String var2) {
      var0.a((Object)var1, (String)var2);
   }

   static ij a(hy var0, String var1) {
      List var2 = var0.b(ij.b(var1), ij.class);
      if (var2 != null && var2.size() > 0) {
         ij var3 = (ij)var2.get(0);
         return var3;
      } else {
         return null;
      }
   }

   public static List<ij> a(hy var0, String var1, String var2) {
      List var3 = var0.b(ij.b(var1, var2), ij.class);
      return var3;
   }
}
