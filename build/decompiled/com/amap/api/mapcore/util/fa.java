package com.amap.api.mapcore.util;

import java.util.Locale;
import java.util.Random;

public class fa {
   private static String a = "0123456789";

   public static String a() {
      Random var0 = new Random();
      int var1 = var0.nextInt(10);
      String var2 = null;
      String var3 = String.format(Locale.US, "%05d", var1);
      int var4 = var0.nextInt(10);
      int var5 = var0.nextInt(100);
      fa$a var6 = new fa$a(a, var5);
      var3 = var6.a(var4, var3);
      var2 = var3 + String.format(Locale.US, "%01d", var4) + String.format(Locale.US, "%02d", var5);
      return var2;
   }
}
