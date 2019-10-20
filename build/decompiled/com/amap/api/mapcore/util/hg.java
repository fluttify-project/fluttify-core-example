package com.amap.api.mapcore.util;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.zip.GZIPOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import org.json.JSONObject;

public class hg {
   private static final String[] b = new String[]{"arm64-v8a", "x86_64"};
   private static final String[] c = new String[]{"arm", "x86"};
   static String a;

   public static Method a(Class var0, String var1, Class... var2) {
      try {
         return var0.getDeclaredMethod(c(var1), var2);
      } catch (Throwable var4) {
         return null;
      }
   }

   public static String a(Context var0) {
      String var1 = "";
      Field var2;
      if (VERSION.SDK_INT >= 21 && VERSION.SDK_INT < 28) {
         try {
            var2 = null;
            ApplicationInfo var3 = var0.getApplicationInfo();
            var2 = Class.forName(ApplicationInfo.class.getName()).getDeclaredField("primaryCpuAbi");
            var2.setAccessible(true);
            var1 = (String)var2.get(var3);
         } catch (Throwable var10) {
            hq.a(var10, "ut", "gct");
         }
      }

      if (VERSION.SDK_INT >= 28) {
         try {
            var2 = null;
            var2 = Build.class.getDeclaredField("SUPPORTED_ABIS");
            String[] var11 = (String[])((String[])var2.get((Object)null));
            if (var11 != null && var11.length >= 1) {
               var1 = var11[0];
            }

            if (!TextUtils.isEmpty(var1) && Arrays.asList(b).contains(var1)) {
               ApplicationInfo var4 = var0.getApplicationInfo();
               String var5 = var4.nativeLibraryDir;
               if (!TextUtils.isEmpty(var5)) {
                  int var6 = var5.lastIndexOf(File.separator);
                  String var7 = var5.substring(var6 + 1);
                  if (Arrays.asList(c).contains(var7)) {
                     var2 = Build.class.getDeclaredField("SUPPORTED_32_BIT_ABIS");
                     String[] var8 = (String[])((String[])var2.get((Object)null));
                     if (var8 != null && var8.length >= 1) {
                        var1 = var8[0];
                     }
                  }
               }
            }
         } catch (Throwable var9) {
            hq.a(var9, "ut", "gct_p");
         }
      }

      if (TextUtils.isEmpty(var1)) {
         var1 = Build.CPU_ABI;
      }

      return var1;
   }

   public static boolean a(Context var0, String var1) {
      if (var0 == null) {
         return false;
      } else if (var0.checkCallingOrSelfPermission(var1) != 0) {
         return false;
      } else {
         if (VERSION.SDK_INT >= 23 && var0.getApplicationInfo().targetSdkVersion >= 23) {
            try {
               Method var2 = var0.getClass().getMethod("checkSelfPermission", String.class);
               Integer var3 = (Integer)var2.invoke(var0, var1);
               if (var3.intValue() != 0) {
                  return false;
               }
            } catch (Throwable var4) {
               ;
            }
         }

         return true;
      }
   }

   public static hf a() throws gt {
      return (new hf$a("collection", "1.0", "AMap_collection_1.0")).a(new String[]{"com.amap.api.collection"}).a();
   }

   public static hf b() throws gt {
      return (new hf$a("co", "1.0.0", "AMap_co_1.0.0")).a(new String[]{"com.amap.co", "com.amap.opensdk.co", "com.amap.location"}).a();
   }

   public static void a(ByteArrayOutputStream var0, String var1) {
      if (TextUtils.isEmpty(var1)) {
         try {
            var0.write(new byte[]{0});
         } catch (IOException var3) {
            var3.printStackTrace();
         }

      } else {
         int var2 = var1.length();
         if (var2 > 255) {
            var2 = 255;
         }

         a(var0, (byte)var2, a(var1));
      }
   }

   public static String a(byte[] var0) {
      if (var0 != null && var0.length != 0) {
         try {
            return new String(var0, "UTF-8");
         } catch (UnsupportedEncodingException var2) {
            return new String(var0);
         }
      } else {
         return "";
      }
   }

   public static byte[] a(String var0) {
      if (TextUtils.isEmpty(var0)) {
         return new byte[0];
      } else {
         try {
            return var0.getBytes("UTF-8");
         } catch (UnsupportedEncodingException var2) {
            return var0.getBytes();
         }
      }
   }

   public static void a(ByteArrayOutputStream var0, byte var1, byte[] var2) {
      try {
         var0.write(new byte[]{var1});
         int var3 = var1 & 255;
         if (var3 < 255 && var3 > 0) {
            var0.write(var2);
         } else if (var3 == 255) {
            var0.write(var2, 0, 255);
         }
      } catch (IOException var4) {
         hq.a((Throwable)var4, "ut", "wFie");
      }

   }

   public static String b(String var0) {
      if (var0 == null) {
         return null;
      } else {
         byte[] var1 = a(var0);
         String var2 = ha.c(var1);
         String var3 = "";

         try {
            var3 = (char)(var2.length() % 26 + 65) + var2;
         } catch (Throwable var5) {
            var5.printStackTrace();
         }

         return var3;
      }
   }

   public static String c(String var0) {
      return var0.length() < 2 ? "" : ha.a(var0.substring(1));
   }

   public static boolean a(JSONObject var0, String var1) {
      return var0 != null && var0.has(var1);
   }

   public static byte[] c() {
      try {
         String var0 = "16,16,18,77,15,911,121,77,121,911,38,77,911,99,86,67,611,96,48,77,84,911,38,67,021,301,86,67,611,98,48,77,511,77,48,97,511,58,48,97,511,84,501,87,511,96,48,77,221,911,38,77,121,37,86,67,25,301,86,67,021,96,86,67,021,701,86,67,35,56,86,67,611,37,221,87";
         StringBuffer var1 = new StringBuffer(var0);
         String var2 = var1.reverse().toString();
         String[] var3 = var2.split(",");
         byte[] var4 = new byte[var3.length];

         for(int var5 = 0; var5 < var3.length; ++var5) {
            var4[var5] = Byte.parseByte(var3[var5]);
         }

         byte[] var12 = ha.b(new String(var4));
         String var6 = new String(var12);
         var1 = new StringBuffer(var6);
         String var7 = var1.reverse().toString();
         String[] var8 = var7.split(",");
         byte[] var9 = new byte[var8.length];

         for(int var10 = 0; var10 < var8.length; ++var10) {
            var9[var10] = Byte.parseByte(var8[var10]);
         }

         return var9;
      } catch (Throwable var11) {
         hq.a(var11, "ut", "gIV");
         return new byte[16];
      }
   }

   static String a(Map<String, String> var0) {
      if (var0 != null) {
         StringBuilder var1 = new StringBuilder();
         Iterator var2 = var0.entrySet().iterator();

         while(var2.hasNext()) {
            Entry var3 = (Entry)var2.next();
            if (var1.length() > 0) {
               var1.append("&");
            }

            var1.append((String)var3.getKey());
            var1.append("=");
            var1.append((String)var3.getValue());
         }

         return var1.toString();
      } else {
         return null;
      }
   }

   public static String a(Throwable var0) {
      StringWriter var1 = null;
      PrintWriter var2 = null;

      try {
         var1 = new StringWriter();
         var2 = new PrintWriter(var1);
         var0.printStackTrace(var2);

         for(Throwable var3 = var0.getCause(); var3 != null; var3 = var3.getCause()) {
            var3.printStackTrace(var2);
         }

         String var4 = var1.toString();
         String var5 = var4;
         return var5;
      } catch (Throwable var19) {
         var19.printStackTrace();
      } finally {
         if (var1 != null) {
            try {
               var1.close();
            } catch (Throwable var18) {
               var18.printStackTrace();
            }
         }

         if (var2 != null) {
            try {
               var2.close();
            } catch (Throwable var17) {
               var17.printStackTrace();
            }
         }

      }

      return null;
   }

   public static String b(Map<String, String> var0) {
      if (var0 != null && var0.size() != 0) {
         StringBuffer var1 = new StringBuffer();

         try {
            boolean var2 = true;
            Iterator var3 = var0.entrySet().iterator();

            while(var3.hasNext()) {
               Entry var4 = (Entry)var3.next();
               if (var2) {
                  var2 = false;
                  var1.append((String)var4.getKey()).append("=").append((String)var4.getValue());
               } else {
                  var1.append("&").append((String)var4.getKey()).append("=").append((String)var4.getValue());
               }
            }
         } catch (Throwable var5) {
            hq.a(var5, "ut", "abP");
         }

         return var1.toString();
      } else {
         return null;
      }
   }

   public static String c(Map<String, String> var0) {
      String var1 = a(var0);
      return d(var1);
   }

   public static String d(String var0) {
      try {
         if (TextUtils.isEmpty(var0)) {
            return "";
         }

         String[] var1 = var0.split("&");
         Arrays.sort(var1);
         StringBuffer var2 = new StringBuffer();
         String[] var3 = var1;
         int var4 = var1.length;

         for(int var5 = 0; var5 < var4; ++var5) {
            String var6 = var3[var5];
            var2.append(var6);
            var2.append("&");
         }

         String var8 = var2.toString();
         if (var8.length() > 1) {
            var8 = (String)var8.subSequence(0, var8.length() - 1);
            return var8;
         }
      } catch (Throwable var7) {
         hq.a(var7, "ut", "sPa");
      }

      return var0;
   }

   public static byte[] b(byte[] var0) {
      try {
         return h(var0);
      } catch (Throwable var2) {
         hq.a(var2, "ut", "gZp");
         return new byte[0];
      }
   }

   public static byte[] c(byte[] var0) {
      if (var0 != null && var0.length != 0) {
         byte[] var1 = null;
         ZipOutputStream var2 = null;
         ByteArrayOutputStream var3 = null;

         try {
            var3 = new ByteArrayOutputStream();
            var2 = new ZipOutputStream(var3);
            var2.putNextEntry(new ZipEntry("log"));
            var2.write(var0);
            var2.closeEntry();
            var2.finish();
            var1 = var3.toByteArray();
         } catch (Throwable var18) {
            hq.a(var18, "ut", "zp");
         } finally {
            if (var2 != null) {
               try {
                  var2.close();
               } catch (Throwable var17) {
                  hq.a(var17, "ut", "zp1");
               }
            }

            if (var3 != null) {
               try {
                  var3.close();
               } catch (Throwable var16) {
                  hq.a(var16, "ut", "zp2");
               }
            }

         }

         return var1;
      } else {
         return null;
      }
   }

   static PublicKey d() throws CertificateException, InvalidKeySpecException, NoSuchAlgorithmException, NullPointerException, IOException {
      String var0 = "MIICnjCCAgegAwIBAgIJAJ0Pdzos7ZfYMA0GCSqGSIb3DQEBBQUAMGgxCzAJBgNVBAYTAkNOMRMwEQYDVQQIDApTb21lLVN0YXRlMRAwDgYDVQQHDAdCZWlqaW5nMREwDwYDVQQKDAhBdXRvbmF2aTEfMB0GA1UEAwwWY29tLmF1dG9uYXZpLmFwaXNlcnZlcjAeFw0xMzA4MTUwNzU2NTVaFw0yMzA4MTMwNzU2NTVaMGgxCzAJBgNVBAYTAkNOMRMwEQYDVQQIDApTb21lLVN0YXRlMRAwDgYDVQQHDAdCZWlqaW5nMREwDwYDVQQKDAhBdXRvbmF2aTEfMB0GA1UEAwwWY29tLmF1dG9uYXZpLmFwaXNlcnZlcjCBnzANBgkqhkiG9w0BAQEFAAOBjQAwgYkCgYEA8eWAyHbFPoFPfdx5AD+D4nYFq4dbJ1p7SIKt19Oz1oivF/6H43v5Fo7s50pD1UF8+Qu4JoUQxlAgOt8OCyQ8DYdkaeB74XKb1wxkIYg/foUwN1CMHPZ9O9ehgna6K4EJXZxR7Y7XVZnbjHZIVn3VpPU/Rdr2v37LjTw+qrABJxMCAwEAAaNQME4wHQYDVR0OBBYEFOM/MLGP8xpVFuVd+3qZkw7uBvOTMB8GA1UdIwQYMBaAFOM/MLGP8xpVFuVd+3qZkw7uBvOTMAwGA1UdEwQFMAMBAf8wDQYJKoZIhvcNAQEFBQADgYEA4LY3g8aAD8JkxAOqUXDDyLuCCGOc2pTIhn0TwMNaVdH4hZlpTeC/wuRD5LJ0z3j+IQ0vLvuQA5uDjVyEOlBrvVIGwSem/1XGUo13DfzgAJ5k1161S5l+sFUo5TxpHOXr8Z5nqJMjieXmhnE/I99GFyHpQmw4cC6rhYUhdhtg+Zk=";
      ByteArrayInputStream var1 = null;
      Certificate var2 = null;
      KeyFactory var3 = null;

      PublicKey var6;
      try {
         var1 = new ByteArrayInputStream(ha.b(var0));
         CertificateFactory var4 = CertificateFactory.getInstance("X.509");
         var3 = KeyFactory.getInstance("RSA");
         var2 = var4.generateCertificate(var1);
         X509EncodedKeySpec var5;
         if (var2 == null || var3 == null) {
            var5 = null;
            return var5;
         }

         var5 = new X509EncodedKeySpec(var2.getPublicKey().getEncoded());
         var6 = var3.generatePublic(var5);
      } catch (Throwable var17) {
         var17.printStackTrace();
         return null;
      } finally {
         try {
            if (var1 != null) {
               var1.close();
            }
         } catch (Throwable var16) {
            var16.printStackTrace();
         }

      }

      return var6;
   }

   public static byte[] d(byte[] var0) {
      try {
         return h(var0);
      } catch (Throwable var2) {
         var2.printStackTrace();
         return new byte[0];
      }
   }

   static String e(byte[] var0) {
      try {
         return g(var0);
      } catch (Throwable var2) {
         hq.a(var2, "ut", "h2s");
         return null;
      }
   }

   static String f(byte[] var0) {
      try {
         return g(var0);
      } catch (Throwable var2) {
         var2.printStackTrace();
         return null;
      }
   }

   public static String g(byte[] var0) {
      StringBuilder var1 = new StringBuilder();
      if (var0 == null) {
         return null;
      } else {
         for(int var2 = 0; var2 < var0.length; ++var2) {
            String var3 = Integer.toHexString(var0[var2] & 255);
            if (var3.length() == 1) {
               var3 = '0' + var3;
            }

            var1.append(var3);
         }

         return var1.toString();
      }
   }

   public static byte[] e(String var0) {
      var0 = var0.length() % 2 != 0 ? "0" + var0 : var0;
      byte[] var1 = new byte[var0.length() / 2];

      for(int var2 = 0; var2 < var1.length; ++var2) {
         int var3 = var2 * 2;
         int var4 = Integer.parseInt(var0.substring(var3, var3 + 2), 16);
         var1[var2] = (byte)var4;
      }

      return var1;
   }

   private static byte[] h(byte[] var0) throws IOException, Throwable {
      Object var1 = null;
      ByteArrayOutputStream var2 = null;
      GZIPOutputStream var3 = null;
      if (var0 == null) {
         return null;
      } else {
         byte[] var18;
         try {
            var2 = new ByteArrayOutputStream();
            var3 = new GZIPOutputStream(var2);
            var3.write(var0);
            var3.finish();
            var18 = var2.toByteArray();
         } catch (Throwable var16) {
            throw var16;
         } finally {
            if (var3 != null) {
               try {
                  var3.close();
               } catch (Throwable var15) {
                  throw var15;
               }
            }

            if (var2 != null) {
               try {
                  var2.close();
               } catch (Throwable var14) {
                  throw var14;
               }
            }

         }

         return var18;
      }
   }

   public static String a(long var0) {
      String var2 = null;

      try {
         SimpleDateFormat var3 = new SimpleDateFormat("yyyyMMdd HH:mm:ss:SSS", Locale.CHINA);
         Date var4 = new Date(var0);
         var2 = var3.format(var4);
      } catch (Throwable var5) {
         var5.printStackTrace();
      }

      return var2;
   }

   public static String a(long var0, String var2) {
      String var3 = null;

      try {
         SimpleDateFormat var4 = new SimpleDateFormat(var2, Locale.CHINA);
         Date var5 = new Date(var0);
         var3 = var4.format(var5);
      } catch (Throwable var6) {
         var6.printStackTrace();
      }

      return var3;
   }

   public static boolean f(String var0) {
      if (TextUtils.isEmpty(var0)) {
         return false;
      } else {
         try {
            var0 = ha.a(var0);
            String var1 = Build.MODEL + VERSION.SDK_INT;
            return var0.contains(var1);
         } catch (Throwable var2) {
            return false;
         }
      }
   }

   public static void a(Context var0, String var1, String var2, JSONObject var3) {
      String var4 = "";
      String var5 = gu.e(var0);
      String var6 = hc.b(var5);
      String var7 = "";
      String var8 = "";
      String var9 = "";
      String var10 = gu.a(var0);
      String var11 = "";

      try {
         if (var3.has("info")) {
            var4 = var3.getString("info");
            var9 = "请在高德开放平台官网中搜索\"" + var4 + "\"相关内容进行解决";
         }

         if ("INVALID_USER_SCODE".equals(var4)) {
            if (var3.has("sec_code")) {
               var7 = var3.getString("sec_code");
            }

            if (var3.has("sec_code_debug")) {
               var8 = var3.getString("sec_code_debug");
            }

            if (var6.equals(var7) || var6.equals(var8)) {
               var9 = "请在高德开放平台官网中搜索\"请求内容过长导致业务调用失败\"相关内容进行解决";
            }
         } else if ("INVALID_USER_KEY".equals(var4)) {
            if (var3.has("key")) {
               var11 = var3.getString("key");
            }

            if (var11.length() > 0 && !var10.equals(var11)) {
               var9 = "请在高德开放平台官网上发起技术咨询工单—>账号与Key问题，咨询INVALID_USER_KEY如何解决";
            }
         }
      } catch (Throwable var13) {
         ;
      }

      h(a);
      h("                                   鉴权错误信息                                  ");
      h(a);
      g("SHA1Package:" + var5);
      g("key:" + var10);
      g("csid:" + var1);
      g("gsid:" + var2);
      g("json:" + var3.toString());
      h("                                                                               ");
      h(var9);
      h(a);
   }

   static void g(String var0) {
      if (var0.length() < 78) {
         StringBuilder var1 = new StringBuilder();
         var1.append("|").append(var0);

         for(int var2 = 0; var2 < 78 - var0.length(); ++var2) {
            var1.append(" ");
         }

         var1.append("|");
         h(var1.toString());
      } else {
         String var3 = var0.substring(0, 78);
         h("|" + var3 + "|");
         g(var0.substring(78));
      }

   }

   public static boolean a(Context var0, boolean var1) {
      return hw.a(var0, var1);
   }

   public static boolean b(Context var0) {
      PackageManager var1 = var0.getPackageManager();

      try {
         var1.getPackageInfo("com.android.vending", 0);
         return true;
      } catch (NameNotFoundException var3) {
         return false;
      }
   }

   private static void h(String var0) {
      Log.i("authErrLog", var0);
   }

   static {
      StringBuilder var0 = new StringBuilder();

      for(int var1 = 0; var1 < 80; ++var1) {
         var0.append("=");
      }

      a = var0.toString();
   }
}
