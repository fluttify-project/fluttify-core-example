package com.amap.api.mapcore.util;

import android.text.TextUtils;
import java.util.regex.Pattern;

public final class lj {
   private static Pattern a = null;

   public static int a(String var0, String var1) {
      try {
         String[] var6 = var0.split("\\.");
         String[] var7 = var1.split("\\.");
         int var2 = 0;
         int var3 = Math.min(var6.length, var7.length);

         int var4;
         for(var4 = 0; var2 < var3 && (var4 = var6[var2].length() - var7[var2].length()) == 0 && (var4 = var6[var2].compareTo(var7[var2])) == 0; ++var2) {
            ;
         }

         return var4 != 0 ? var4 : var6.length - var7.length;
      } catch (Throwable var5) {
         hq.a(var5, "Utils", "compareVersion");
         return -1;
      }
   }

   public static boolean b(String var0, String var1) {
      if (a(var0) && a(var1)) {
         return a(var0, var1) == 0;
      } else {
         return false;
      }
   }

   public static boolean a(String var0) {
      if (TextUtils.isEmpty(var0)) {
         return false;
      } else {
         if (a == null) {
            a = Pattern.compile("[\\d+\\.]+");
         }

         return a.matcher(var0).matches();
      }
   }
}
