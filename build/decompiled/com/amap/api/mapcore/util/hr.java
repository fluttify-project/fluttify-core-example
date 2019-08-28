package com.amap.api.mapcore.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Looper;
import android.text.TextUtils;
import java.util.List;
import java.util.concurrent.ExecutorService;

public class hr {
   public static final String a = "/a/";
   static final String b = "b";
   static final String c = "c";
   static final String d = "d";
   static final String e = "i";
   public static final String f = "g";
   public static final String g = "h";
   public static final String h = "e";
   public static final String i = "f";
   public static final String j = "j";

   public static String a(Context var0, String var1) {
      SharedPreferences var2 = var0.getSharedPreferences("AMSKLG_CFG", 0);
      return var2.getString(var1, "");
   }

   @TargetApi(9)
   public static void a(Context var0, String var1, String var2) {
      SharedPreferences var3 = var0.getSharedPreferences("AMSKLG_CFG", 0);
      Editor var4 = var3.edit();
      var4.putString(var1, var2);
      var4.apply();
   }

   public static void b(Context var0, String var1) {
      SharedPreferences var2 = var0.getSharedPreferences("AMSKLG_CFG", 0);
      Editor var3 = var2.edit();
      var3.remove(var1);
      var3.apply();
   }

   public static String a(Context var0) {
      return c(var0, e);
   }

   public static String c(Context var0, String var1) {
      StringBuilder var2 = new StringBuilder();
      String var3 = var0.getFilesDir().getAbsolutePath();
      var2.append(var3);
      var2.append(a);
      var2.append(var1);
      String var4 = var2.toString();
      return var4;
   }

   public static void b(Context var0) {
      try {
         ExecutorService var1 = ht.d();
         if (var1 == null || var1.isShutdown()) {
            return;
         }

         var1.submit(new hr$1(var0));
      } catch (Throwable var2) {
         ht.c(var2, "Lg", "proL");
      }

   }

   static List<hf> c(Context var0) {
      List var1 = null;

      try {
         synchronized(Looper.getMainLooper()) {
            id var3 = new id(var0, false);
            var1 = var3.a();
         }
      } catch (Throwable var6) {
         var6.printStackTrace();
      }

      return var1;
   }

   static boolean a(String[] var0, String var1) {
      boolean var2 = false;

      try {
         if (var0 == null || var1 == null) {
            return var2;
         }

         String[] var3 = var1.split("\n");
         String[] var4 = var3;
         int var5 = var3.length;

         for(int var6 = 0; var6 < var5; ++var6) {
            String var7 = var4[var6];
            var7 = var7.trim();
            if (a(var7)) {
               return false;
            }

            if (b(var0, var7)) {
               return true;
            }
         }
      } catch (Throwable var8) {
         var8.printStackTrace();
      }

      return var2;
   }

   static boolean a(String var0) {
      if (TextUtils.isEmpty(var0)) {
         return false;
      } else {
         return var0.contains("uncaughtException");
      }
   }

   static boolean b(String[] var0, String var1) {
      boolean var2 = false;

      try {
         if (var0 == null || var1 == null) {
            return var2;
         }

         String[] var3 = var0;
         int var4 = var0.length;

         for(int var5 = 0; var5 < var4; ++var5) {
            String var6 = var3[var5];
            var1 = var1.trim();
            if (var1.startsWith("at ") && var1.contains(var6 + ".") && var1.endsWith(")") && !var1.contains("uncaughtException")) {
               var2 = true;
               return var2;
            }
         }
      } catch (Throwable var7) {
         var7.printStackTrace();
      }

      return var2;
   }
}
