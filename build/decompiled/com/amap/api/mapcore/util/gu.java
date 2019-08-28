package com.amap.api.mapcore.util;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.text.TextUtils;
import java.io.File;
import java.io.FileInputStream;
import java.security.MessageDigest;
import java.util.Locale;

public class gu {
   private static String c = "";
   private static String d = "";
   private static String e = "";
   private static String f = "";
   static String a = null;
   static boolean b = false;

   private static boolean a(String var0) {
      if (TextUtils.isEmpty(var0)) {
         return false;
      } else {
         char[] var1 = var0.toCharArray();
         char[] var2 = var0.toCharArray();
         int var3 = var2.length;

         for(int var4 = 0; var4 < var3; ++var4) {
            char var5 = var2[var4];
            if (('A' > var5 || var5 > 'z') && ('0' > var5 || var5 > ':') && var5 != '.') {
               try {
                  ht.b(hg.a(), var0, "errorPackage");
               } catch (Throwable var7) {
                  ;
               }

               return false;
            }
         }

         return true;
      }
   }

   static boolean a() {
      try {
         if (b) {
            return true;
         } else if (a(a)) {
            b = true;
            return true;
         } else if (!TextUtils.isEmpty(a)) {
            b = false;
            a = null;
            return false;
         } else if (a(d)) {
            b = true;
            return true;
         } else if (!TextUtils.isEmpty(d)) {
            b = false;
            d = null;
            return false;
         } else {
            return true;
         }
      } catch (Throwable var1) {
         return true;
      }
   }

   public static String a(Context var0) {
      try {
         return h(var0);
      } catch (Throwable var2) {
         var2.printStackTrace();
         return f;
      }
   }

   public static String b(Context var0) {
      PackageManager var1 = null;
      ApplicationInfo var2 = null;

      try {
         if (!"".equals(c)) {
            return c;
         }

         var1 = var0.getPackageManager();
         var2 = var1.getApplicationInfo(var0.getPackageName(), 0);
         c = (String)var1.getApplicationLabel(var2);
      } catch (Throwable var4) {
         hq.a(var4, "AI", "gAN");
      }

      return c;
   }

   public static String c(Context var0) {
      try {
         if (d != null && !"".equals(d)) {
            return d;
         }

         d = var0.getPackageName();
         if (!a(d)) {
            d = var0.getPackageName();
         }
      } catch (Throwable var2) {
         hq.a(var2, "AI", "gpck");
      }

      return d;
   }

   public static String d(Context var0) {
      PackageInfo var1 = null;

      try {
         if (!"".equals(e)) {
            return e;
         }

         PackageManager var2 = var0.getPackageManager();
         var1 = var2.getPackageInfo(var0.getPackageName(), 0);
         e = var1.versionName;
      } catch (Throwable var3) {
         hq.a(var3, "AI", "gAV");
      }

      return e == null ? "" : e;
   }

   public static String e(Context var0) {
      try {
         PackageInfo var1 = var0.getPackageManager().getPackageInfo(var0.getPackageName(), 64);
         byte[] var2 = var1.signatures[0].toByteArray();
         MessageDigest var3 = MessageDigest.getInstance("SHA1");
         byte[] var4 = var3.digest(var2);
         StringBuffer var5 = new StringBuffer();

         for(int var6 = 0; var6 < var4.length; ++var6) {
            String var7 = Integer.toHexString(255 & var4[var6]).toUpperCase(Locale.US);
            if (var7.length() == 1) {
               var5.append("0");
            }

            var5.append(var7);
            var5.append(":");
         }

         String var9 = var1.packageName;
         if (a(var9)) {
            var9 = var1.packageName;
         }

         var5.append(TextUtils.isEmpty(d) ? var9 : c(var0));
         a = var5.toString();
         return a;
      } catch (Throwable var8) {
         hq.a(var8, "AI", "gsp");
         return a;
      }
   }

   static void a(Context var0, String var1) {
      if (!TextUtils.isEmpty(var1)) {
         f = var1;
         if (var0 != null) {
            b(var0, var1);
         }

      }
   }

   public static String f(Context var0) {
      try {
         return h(var0);
      } catch (Throwable var2) {
         hq.a(var2, "AI", "gKy");
         return f;
      }
   }

   private static void b(Context var0, String var1) {
      ht.d().submit(new gu$1(var0, var1));
   }

   private static String g(Context var0) {
      String var1 = hr.c(var0, "k.store");
      File var2 = new File(var1);
      if (!var2.exists()) {
         return "";
      } else {
         FileInputStream var3 = null;

         try {
            var3 = new FileInputStream(var2);
            int var4 = var3.available();
            byte[] var5 = new byte[var4];
            var3.read(var5);
            String var6 = hg.a(var5);
            String var7 = var6.length() == 32 ? var6 : "";
            return var7;
         } catch (Throwable var19) {
            hq.a(var19, "AI", "gKe");

            try {
               if (var2 != null && var2.exists()) {
                  var2.delete();
               }
            } catch (Throwable var18) {
               var18.printStackTrace();
            }
         } finally {
            if (var3 != null) {
               try {
                  var3.close();
               } catch (Throwable var17) {
                  var17.printStackTrace();
               }
            }

         }

         return "";
      }
   }

   private static String h(Context var0) throws NameNotFoundException {
      if (f == null || f.equals("")) {
         ApplicationInfo var1 = var0.getPackageManager().getApplicationInfo(var0.getPackageName(), 128);
         if (var1 == null || var1.metaData == null) {
            return f;
         }

         f = var1.metaData.getString("com.amap.api.v2.apikey");
         if (f == null) {
            f = g(var0);
         }
      }

      return f;
   }
}
