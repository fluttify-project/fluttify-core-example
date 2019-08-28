package com.amap.api.mapcore.util;

import android.content.Context;
import android.os.Build;
import android.os.Build.VERSION;
import android.text.TextUtils;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.cert.CertificateException;
import java.security.spec.InvalidKeySpecException;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

public class gx {
   public static String a(Context var0, String var1, String var2) {
      String var3 = null;

      try {
         String var4 = gu.e(var0);
         var3 = hc.b(var4 + ":" + var1.substring(0, var1.length() - 3) + ":" + var2);
      } catch (Throwable var5) {
         hq.a(var5, "CI", "Sco");
      }

      return var3;
   }

   public static String a() {
      String var0 = null;

      try {
         var0 = String.valueOf(System.currentTimeMillis());
         String var1 = "1";
         if (!gu.a()) {
            var1 = "0";
         }

         int var2 = var0.length();
         var0 = var0.substring(0, var2 - 2) + var1 + var0.substring(var2 - 1);
      } catch (Throwable var3) {
         hq.a(var3, "CI", "TS");
      }

      return var0;
   }

   public static String a(Context var0) {
      try {
         gx$a var1 = new gx$a((gx$1)null);
         String var2 = gu.c(var0);
         var1.d = var2;
         String var3 = gu.d(var0);
         var1.i = var3;
         return a(var0, var1);
      } catch (Throwable var4) {
         hq.a(var4, "CI", "IX");
         return null;
      }
   }

   public static byte[] a(Context var0, byte[] var1) throws CertificateException, InvalidKeySpecException, NoSuchAlgorithmException, NullPointerException, IOException, InvalidKeyException, NoSuchPaddingException, IllegalBlockSizeException, BadPaddingException {
      return ha.a(var1);
   }

   public static byte[] a(Context var0, boolean var1) {
      try {
         return b(var0, b(var0, var1));
      } catch (Throwable var3) {
         hq.a(var3, "CI", "gz");
         return null;
      }
   }

   public static String b(Context var0) {
      try {
         return a(var0, b(var0, false));
      } catch (Throwable var2) {
         hq.a(var2, "CI", "gCX");
         return null;
      }
   }

   public static byte[] b(Context var0, byte[] var1) throws CertificateException, InvalidKeySpecException, NoSuchAlgorithmException, NullPointerException, IOException, InvalidKeyException, NoSuchPaddingException, IllegalBlockSizeException, BadPaddingException {
      PublicKey var2 = null;
      var2 = hg.d();
      Object var3 = null;
      byte[] var6;
      if (var1.length > 117) {
         byte[] var4 = new byte[117];
         System.arraycopy(var1, 0, var4, 0, 117);
         byte[] var5 = ha.a(var4, (Key)var2);
         var6 = new byte[128 + var1.length - 117];
         System.arraycopy(var5, 0, var6, 0, 128);
         System.arraycopy(var1, 117, var6, 128, var1.length - 117);
      } else {
         var6 = ha.a(var1, (Key)var2);
      }

      return var6;
   }

   private static String a(Context var0, gx$a var1) {
      return ha.b(b(var0, var1));
   }

   private static byte[] b(Context var0, gx$a var1) {
      ByteArrayOutputStream var2 = null;

      try {
         var2 = new ByteArrayOutputStream();
         a(var2, var1.a);
         a(var2, var1.b);
         a(var2, var1.c);
         a(var2, var1.d);
         a(var2, var1.e);
         a(var2, var1.f);
         a(var2, var1.g);
         a(var2, var1.h);
         a(var2, var1.i);
         a(var2, var1.j);
         a(var2, var1.k);
         a(var2, var1.l);
         a(var2, var1.m);
         a(var2, var1.n);
         a(var2, var1.o);
         a(var2, var1.p);
         a(var2, var1.q);
         a(var2, var1.r);
         a(var2, var1.s);
         a(var2, var1.t);
         a(var2, var1.u);
         a(var2, var1.v);
         a(var2, var1.w);
         a(var2, var1.x);
         a(var2, var1.y);
         byte[] var3 = a(var0, var2);
         return var3;
      } catch (Throwable var13) {
         hq.a(var13, "CI", "gzx");
      } finally {
         if (var2 != null) {
            try {
               var2.close();
            } catch (Throwable var12) {
               var12.printStackTrace();
            }
         }

      }

      return null;
   }

   private static byte[] a(Context var0, ByteArrayOutputStream var1) throws CertificateException, NoSuchAlgorithmException, IOException, BadPaddingException, IllegalBlockSizeException, NoSuchPaddingException, InvalidKeyException, InvalidKeySpecException {
      byte[] var2 = var1.toByteArray();
      byte[] var3 = hg.b(var2);
      byte[] var4 = b(var0, var3);
      return var4;
   }

   public static void a(ByteArrayOutputStream var0, String var1) {
      if (!TextUtils.isEmpty(var1)) {
         int var2 = var1.getBytes().length;
         boolean var3 = false;
         byte var4;
         if (var2 > 255) {
            var4 = -1;
         } else {
            var4 = (byte)var1.getBytes().length;
         }

         hg.a(var0, var4, hg.a(var1));
      } else {
         hg.a(var0, (byte)0, new byte[0]);
      }

   }

   private static gx$a b(Context var0, boolean var1) {
      gx$a var2 = new gx$a((gx$1)null);
      String var3 = gz.v(var0);
      var2.a = var3;
      var2.b = gz.m(var0);
      String var4 = gz.h(var0);
      if (var4 == null) {
         var4 = "";
      }

      var2.c = var4;
      var2.d = gu.c(var0);
      var2.e = Build.MODEL;
      var2.f = Build.MANUFACTURER;
      var2.g = Build.DEVICE;
      var2.h = gu.b(var0);
      var2.i = gu.d(var0);
      var2.j = String.valueOf(VERSION.SDK_INT);
      var2.k = gz.x(var0);
      var2.l = gz.u(var0);
      var2.m = gz.r(var0) + "";
      var2.n = gz.q(var0) + "";
      var2.o = gz.z(var0);
      var2.p = gz.p(var0);
      if (var1) {
         var2.q = "";
      } else {
         var2.q = gz.l(var0);
      }

      if (var1) {
         var2.r = "";
      } else {
         var2.r = gz.k(var0);
      }

      if (var1) {
         var2.s = "";
         var2.t = "";
      } else {
         String[] var5 = gz.n(var0);
         var2.s = var5[0];
         var2.t = var5[1];
      }

      var2.w = gz.a();
      String var9 = gz.b(var0);
      if (!TextUtils.isEmpty(var9)) {
         var2.x = var9;
      } else {
         var2.x = "";
      }

      var2.y = "aid=" + gz.j(var0) + "|serial=" + gz.i(var0) + "|storage=" + gz.c() + "|ram=" + gz.y(var0) + "|arch=" + gz.d();
      String var6 = gz.a(var0);
      if (!TextUtils.isEmpty(var6)) {
         var2.y = var2.y + "|adiuExtras=" + var6;
      }

      String var7 = gz.a(var0, ",", true);
      if (!TextUtils.isEmpty(var7)) {
         var2.y = var2.y + "|multiImeis=" + var7;
      }

      String var8 = gz.w(var0);
      if (!TextUtils.isEmpty(var8)) {
         var2.y = var2.y + "|meid=" + var8;
      }

      return var2;
   }
}
