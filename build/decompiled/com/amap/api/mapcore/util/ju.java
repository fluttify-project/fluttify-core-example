package com.amap.api.mapcore.util;

import android.content.Context;
import java.io.InputStream;
import java.lang.ref.WeakReference;

public class ju {
   public static void a(Context var0, jn var1, String var2, int var3, int var4, String var5) {
      var1.a = hr.c(var0, var2);
      var1.d = var3;
      var1.b = (long)var4;
      var1.c = var5;
   }

   public static jn a(WeakReference<jn> var0) {
      if (var0 == null || var0.get() == null) {
         var0 = new WeakReference(new jn());
      }

      jn var1 = (jn)var0.get();
      return var1;
   }

   static byte[] a(iy var0, String var1, boolean var2) {
      iy$b var3 = null;
      InputStream var4 = null;
      byte[] var5 = new byte[0];

      byte[] var6;
      try {
         var3 = var0.a(var1);
         if (var3 == null) {
            var6 = var5;
            return var6;
         }

         var4 = var3.a(0);
         if (var4 != null) {
            var5 = new byte[var4.available()];
            var4.read(var5);
            if (var2) {
               var0.c(var1);
            }

            var6 = var5;
            return var6;
         }

         var6 = var5;
      } catch (Throwable var24) {
         ht.c(var24, "sui", "rdS");
         return var5;
      } finally {
         try {
            if (var4 != null) {
               var4.close();
            }
         } catch (Throwable var23) {
            var23.printStackTrace();
         }

         try {
            if (var3 != null) {
               var3.close();
            }
         } catch (Throwable var22) {
            var22.printStackTrace();
         }

      }

      return var6;
   }

   public static String a() {
      String var0 = null;
      var0 = hg.a(System.currentTimeMillis());
      return var0;
   }

   public static String a(Context var0, hf var1) {
      StringBuilder var2 = new StringBuilder();

      try {
         String var3 = gz.g(var0);
         var2.append("\"sim\":\"").append(var3).append("\",\"sdkversion\":\"").append(var1.c()).append("\",\"product\":\"").append(var1.a()).append("\",\"ed\":\"").append(var1.e()).append("\",\"nt\":\"").append(gz.e(var0)).append("\",\"np\":\"").append(gz.c(var0)).append("\",\"mnc\":\"").append(gz.d(var0)).append("\",\"ant\":\"").append(gz.f(var0)).append("\"");
      } catch (Throwable var4) {
         var4.printStackTrace();
      }

      return var2.toString();
   }

   public static String a(String var0, String var1, String var2, int var3, String var4, String var5) {
      StringBuffer var6 = new StringBuffer();
      var6.append(var1).append(",").append("\"timestamp\":\"");
      var6.append(var2);
      var6.append("\",\"et\":\"");
      var6.append(var3);
      var6.append("\",\"classname\":\"");
      var6.append(var4);
      var6.append("\",");
      var6.append("\"detail\":\"");
      var6.append(var5);
      var6.append("\"");
      return var6.toString();
   }
}
