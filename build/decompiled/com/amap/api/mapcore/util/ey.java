package com.amap.api.mapcore.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

public class ey {
   public static void a(Context var0, String var1, String var2, Object var3) {
      if (var0 != null) {
         SharedPreferences var4 = var0.getSharedPreferences(var1, 0);
         Editor var5 = var4.edit();
         if (var3 instanceof String) {
            var5.putString(var2, (String)var3);
         } else if (var3 instanceof Integer) {
            var5.putInt(var2, ((Integer)var3).intValue());
         } else if (var3 instanceof Boolean) {
            var5.putBoolean(var2, ((Boolean)var3).booleanValue());
         } else if (var3 instanceof Float) {
            var5.putFloat(var2, ((Float)var3).floatValue());
         } else if (var3 instanceof Long) {
            var5.putLong(var2, ((Long)var3).longValue());
         } else {
            var5.putString(var2, var3.toString());
         }

         var5.apply();
      }
   }

   public static String a(Context var0, String var1, String var2, String var3) {
      Object var4 = b(var0, var1, var2, var3);
      return var4 != null ? (String)var4 : var3;
   }

   public static Long a(Context var0, String var1, String var2, Long var3) {
      Object var4 = b(var0, var1, var2, var3);
      return var4 != null ? (Long)var4 : var3;
   }

   private static Object b(Context var0, String var1, String var2, Object var3) {
      if (var0 == null) {
         return null;
      } else {
         SharedPreferences var4 = var0.getSharedPreferences(var1, 0);
         if (var3 instanceof String) {
            return var4.getString(var2, (String)var3);
         } else if (var3 instanceof Integer) {
            return var4.getInt(var2, ((Integer)var3).intValue());
         } else if (var3 instanceof Boolean) {
            return var4.getBoolean(var2, ((Boolean)var3).booleanValue());
         } else if (var3 instanceof Float) {
            return var4.getFloat(var2, ((Float)var3).floatValue());
         } else {
            return var3 instanceof Long ? var4.getLong(var2, ((Long)var3).longValue()) : null;
         }
      }
   }
}
