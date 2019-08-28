package com.amap.api.mapcore.util;

import android.content.Context;
import android.os.Build.VERSION;
import android.text.TextUtils;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.File;
import java.security.PublicKey;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.List;

public class in {
   private static boolean a(hy var0, if var1) {
      try {
         List var2 = ig$a.a(var0, var1.c, "used");
         if (var2 != null && var2.size() > 0) {
            ij var3 = (ij)var2.get(0);
            String var4 = var3.e();
            String var5 = var1.e;
            if (a(var4, var5) > 0) {
               return true;
            }
         }
      } catch (Throwable var6) {
         a(var6, "dDownLoad", "isUsed");
      }

      return false;
   }

   static boolean a(Context var0, if var1, hf var2) {
      hy var3 = new hy(var0, ii.a());
      if (a(var3, var1)) {
         return true;
      } else {
         ij var4 = ig$a.a(var3, var1.b);
         return var4 != null ? a(var0, var3, var4, var1, var2) : false;
      }
   }

   private static boolean a(Context var0, hy var1, ij var2, if var3, hf var4) {
      String var5 = var3.c;
      String var6 = var3.d;
      String var7 = var3.e;
      if ("errorstatus".equals(var2.f())) {
         a(var0, var1, var4);
         return true;
      } else {
         String var8 = ig.a(var0, var3.b);
         File var9 = new File(var8);
         if (!var9.exists()) {
            return false;
         } else {
            List var10 = var1.b(ij.a(ig.a(var0, var5, var6), var5, var6, var7), ij.class);
            if (var10 != null && var10.size() > 0) {
               return true;
            } else {
               ig.a(var0, var5, var4.b());

               try {
                  il.b().a().submit(new in$1(var0, var1, var4, var8, var7));
               } catch (Throwable var13) {
                  ;
               }

               return true;
            }
         }
      }
   }

   private static void a(Context var0, hy var1, hf var2) {
      try {
         File var3 = new File(ig.b(var0, var2.a(), var2.b()));
         if (!var3.exists()) {
            String var4 = ig.a(var0, var1, var2);
            if (TextUtils.isEmpty(var4)) {
               return;
            }

            il.b().a().submit(new in$2(var0, var2));
         }
      } catch (Throwable var5) {
         ;
      }

   }

   static boolean a(Context var0) {
      return gz.r(var0) == 1;
   }

   static boolean a(Context var0, boolean var1) {
      return var1 || a(var0);
   }

   static boolean a(if var0) {
      return VERSION.SDK_INT >= var0.h && VERSION.SDK_INT <= var0.g;
   }

   static boolean a(hf var0, if var1) {
      if (var0 == null) {
         return false;
      } else {
         return var0.a().equals(var1.c) && var0.b().equals(var1.d);
      }
   }

   static boolean a(Context var0, hf var1, if var2) {
      if (var2.e()) {
         return true;
      } else {
         return !hg.a(var0, var2.f());
      }
   }

   static PublicKey a() {
      ByteArrayInputStream var0 = null;

      try {
         CertificateFactory var1 = CertificateFactory.getInstance("X.509");
         String var2 = "MIIDRzCCAi+gAwIBAgIEeuDbsDANBgkqhkiG9w0BAQsFADBTMQswCQYDVQQGEwJjbjELMAkGA1UECBMCYmoxCzAJBgNVBAcTAmJqMQ0wCwYDVQQKEwRvcGVuMQ4wDAYDVQQLEwVnYW9kZTELMAkGA1UEAxMCUWkwIBcNMTYwODAxMDE0ODMwWhgPMjA3MTA1MDUwMTQ4MzBaMFMxCzAJBgNVBAYTAmNuMQswCQYDVQQIEwJiajELMAkGA1UEBxMCYmoxDTALBgNVBAoTBG9wZW4xDjAMBgNVBAsTBWdhb2RlMQswCQYDVQQDEwJRaTCCASIwDQYJKoZIhvcNAQEBBQADggEPADCCAQoCggEBAKpL13mZm4q6AFP5csQE7130Lwq8m+HICy3rBARd9vbw5Cb1wFF96KdhC5P/aASlrPb+6MSyP1nE97p3ygKJWsgxExyvVuOvh1KUqOFuK15oY7JKTk6L4eLCbkBJZV2DLffpW0HGiRpmFG8LJR0sjNOoubSd5R/6XoBwyRglsyVHprjrK2qDRvT3Edgtfvxp4HnUzMsDD3CJRtgsaDw6ECyF7fhYKEz9I6OEEVsPlpbgzRmhSeFDL77/k1mhPve1ZyKGlPcxvSSdLSAlV0hzr5NKlujHll7BbouwDnr6l/0O44AzZ0V/ieft1iBkSLirnlm56uI/8jdh8ANrD1fW4ZUCAwEAAaMhMB8wHQYDVR0OBBYEFBzudtI5UKRvHGDV+VQRzItIj3PqMA0GCSqGSIb3DQEBCwUAA4IBAQBS2EGndgvIBnf7Ce4IhDbm7F5h4L+6TYGmT9acnQbEFY8oUoFblMDgg+cETT44jU/elwbJJVmKhj/WRQl+AdSALBAgDvxq1AcjlGg+c8H3pa2BWlrxNJP9MFLIEI5bA8m5og/Epjut50uemZ9ggoNmJeW0N/a6D8euhYJKOYngUQqDu6cwLj1Ec0ptwrNRbvRXXgzjfJMPE/ii4K/b8JZ+QN2d/bl7QEvKWBSzVueZifV659qAbMh6C9TCVstWWfV53Z3Vyt+duDNU5ed7aWao42Ppw4VHslrJW0V6BXDUhhzgXx28UWY78W7LmYGCtC8PfDId2+k4tPoTNPM6HHP5";
         byte[] var3 = ha.b(var2);
         var0 = new ByteArrayInputStream(var3);
         X509Certificate var4 = (X509Certificate)var1.generateCertificate(var0);
         PublicKey var5 = var4.getPublicKey();
         PublicKey var6 = var5;
         return var6;
      } catch (Throwable var16) {
         a(var16, "DyLoader", "init");
      } finally {
         try {
            a((Closeable)var0);
         } catch (Throwable var15) {
            var15.printStackTrace();
         }

      }

      return null;
   }

   public static int a(String var0, String var1) {
      try {
         String[] var2 = var0.split("\\.");
         String[] var3 = var1.split("\\.");
         int var4 = 0;
         int var5 = Math.min(var2.length, var3.length);

         int var6;
         for(var6 = 0; var4 < var5 && (var6 = var2[var4].length() - var3[var4].length()) == 0 && (var6 = var2[var4].compareTo(var3[var4])) == 0; ++var4) {
            ;
         }

         var6 = var6 != 0 ? var6 : var2.length - var3.length;
         return var6;
      } catch (Exception var7) {
         hq.a((Throwable)var7, "Utils", "compareVersion");
         return -1;
      }
   }

   static void a(List<ij> var0) {
      for(int var1 = 0; var1 < var0.size() - 1; ++var1) {
         for(int var2 = var1 + 1; var2 < var0.size(); ++var2) {
            ij var3 = (ij)var0.get(var1);
            ij var4 = (ij)var0.get(var2);
            String var5 = var3.e();
            String var6 = var4.e();
            if (a(var6, var5) > 0) {
               var0.set(var1, var4);
               var0.set(var2, var3);
            }
         }
      }

   }

   static boolean b(String var0, String var1) {
      String var2 = hc.a(var0);
      return var2 != null && var2.equalsIgnoreCase(var1);
   }

   static boolean a(Context var0, hy var1, String var2, hf var3) {
      return a(var1, var2, ig.a(var0, var2), var3);
   }

   static boolean a(hy var0, String var1, String var2, hf var3) {
      ij var4 = ig$a.a(var0, var1);
      if (var4 != null) {
         if (!var3.b().equals(var4.d())) {
            return false;
         }

         if (b(var2, var4.b())) {
            return true;
         }
      }

      return false;
   }

   public static void a(Throwable var0, String var1, String var2) {
      hq.a(var0, var1, var2);
   }

   public static void a(Closeable var0) {
      if (var0 != null) {
         try {
            var0.close();
         } catch (Throwable var2) {
            var2.printStackTrace();
         }
      }

   }
}
