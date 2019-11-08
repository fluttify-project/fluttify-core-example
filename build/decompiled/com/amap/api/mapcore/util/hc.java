package com.amap.api.mapcore.util;

import android.text.TextUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class hc {
   public static String a(String var0) {
      FileInputStream var1 = null;

      File var2;
      try {
         MessageDigest var3;
         try {
            if (!TextUtils.isEmpty(var0)) {
               var2 = new File(var0);
               if (var2.isFile() && var2.exists()) {
                  var3 = null;
                  byte[] var4 = new byte[2048];
                  var3 = MessageDigest.getInstance("MD5");
                  var1 = new FileInputStream(var2);

                  int var5;
                  while((var5 = var1.read(var4)) != -1) {
                     var3.update(var4, 0, var5);
                  }

                  byte[] var6 = var3.digest();
                  String var7 = hg.e(var6);
                  return var7;
               }

               var3 = null;
               return var3;
            }

            var2 = null;
         } catch (Throwable var19) {
            hq.a(var19, "MD5", "gfm");
            var3 = null;
            return var3;
         }
      } finally {
         try {
            if (var1 != null) {
               var1.close();
            }
         } catch (IOException var18) {
            hq.a((Throwable)var18, "MD5", "gfm");
         }

      }

      return var2;
   }

   public static String b(String var0) {
      if (var0 == null) {
         return null;
      } else {
         byte[] var1 = d(var0);
         return hg.e(var1);
      }
   }

   public static String a(byte[] var0) {
      byte[] var1 = b(var0);
      return hg.e(var1);
   }

   public static String c(String var0) {
      byte[] var1 = e(var0);
      return hg.f(var1);
   }

   public static byte[] a(byte[] var0, String var1) {
      MessageDigest var2 = null;
      byte[] var3 = null;

      try {
         var2 = MessageDigest.getInstance(var1);
         var2.update(var0);
         var3 = var2.digest();
      } catch (Throwable var5) {
         hq.a(var5, "MD5", "gmb");
      }

      return var3;
   }

   private static byte[] b(byte[] var0) {
      return a(var0, "MD5");
   }

   public static byte[] d(String var0) {
      try {
         return f(var0);
      } catch (Throwable var2) {
         hq.a(var2, "MD5", "gmb");
         return new byte[0];
      }
   }

   private static byte[] e(String var0) {
      try {
         return f(var0);
      } catch (Throwable var2) {
         var2.printStackTrace();
         return new byte[0];
      }
   }

   private static byte[] f(String var0) throws NoSuchAlgorithmException, UnsupportedEncodingException {
      MessageDigest var1 = null;
      Object var2 = null;
      if (var0 == null) {
         return null;
      } else {
         var1 = MessageDigest.getInstance("MD5");
         var1.update(hg.a(var0));
         byte[] var3 = var1.digest();
         return var3;
      }
   }
}
