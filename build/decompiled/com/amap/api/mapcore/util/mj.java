package com.amap.api.mapcore.util;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.os.Build.VERSION;
import android.text.TextUtils;

public final class mj {
   @SuppressLint({"NewApi"})
   private static void a(Editor var0) {
      if (var0 != null) {
         if (VERSION.SDK_INT >= 9) {
            var0.apply();
         } else {
            b(var0);
         }
      }
   }

   private static void b(Editor var0) {
      try {
         (new mj$1(var0)).execute(new Void[]{null, null, null});
      } catch (Throwable var1) {
         mg.a(var1, "SpUtil", "commit1");
      }
   }

   public static int a(Context var0, String var1, String var2) {
      int var4;
      try {
         var4 = var0.getSharedPreferences(var1, 0).getInt(var2, 200);
      } catch (Throwable var3) {
         var4 = 200;
         mg.a(var3, "SpUtil", "getPrefsInt");
      }

      return var4;
   }

   public static boolean b(Context var0, String var1, String var2) {
      boolean var4;
      try {
         var4 = var0.getSharedPreferences(var1, 0).getBoolean(var2, true);
      } catch (Throwable var3) {
         var4 = true;
         mg.a(var3, "SpUtil", "getPrefsBoolean");
      }

      return var4;
   }

   private static void a(Context var0, String var1, String var2, String var3) {
      try {
         Editor var5;
         (var5 = var0.getSharedPreferences(var1, 0).edit()).putString(var2, var3);
         a(var5);
      } catch (Throwable var4) {
         mg.a(var4, "SpUtil", "setPrefsStr");
      }
   }

   private static String b(Context var0, String var1, String var2, String var3) {
      String var5;
      try {
         var5 = var0.getSharedPreferences(var1, 0).getString(var2, var3);
      } catch (Throwable var4) {
         var5 = var3;
         mg.a(var4, "SpUtil", "getPrefsInt");
      }

      return var5;
   }

   public static String a(Context var0) {
      String var1 = "00:00:00:00:00:00";
      return var0 == null ? var1 : b(var0, "pref", "smac", var1);
   }

   public static void a(Context var0, String var1) {
      if (var0 != null) {
         if (!TextUtils.isEmpty(var1)) {
            a(var0, "pref", "smac", var1);
         }
      }
   }
}
