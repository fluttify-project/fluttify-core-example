package com.amap.api.mapcore.util;

import java.util.Calendar;
import java.util.Date;

public final class mh {
   public static long a(long var0, long var2) {
      try {
         return Math.abs(var0 - var2) > 31536000000L ? b(var0, var2) : var0;
      } catch (Throwable var4) {
         return var0;
      }
   }

   private static long b(long var0, long var2) {
      long var4 = a(var0);
      long var6;
      long var8 = Math.abs((var6 = b(var2) + var4) - var2);
      Calendar var10;
      (var10 = Calendar.getInstance()).setTime(new Date(var6));
      int var11;
      if ((var11 = var10.get(11)) == 23 && var8 >= 82800000L) {
         var6 -= 86400000L;
      }

      if (var11 == 0 && var8 >= 82800000L) {
         var6 += 86400000L;
      }

      return var6;
   }

   private static long a(long var0) {
      long var2 = b(var0);
      return var0 - var2;
   }

   private static long b(long var0) {
      Calendar var2;
      (var2 = Calendar.getInstance()).setTime(new Date(var0));
      var2.set(11, 0);
      var2.set(12, 0);
      var2.set(13, 0);
      var2.set(14, 0);
      return var2.getTimeInMillis();
   }
}
