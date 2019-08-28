package com.amap.api.mapcore.util;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.cert.CertificateException;
import java.security.spec.InvalidKeySpecException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class ha {
   private static final char[] a = new char[]{'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/'};
   private static final byte[] b = new byte[128];

   public static byte[] a(byte[] var0) throws CertificateException, InvalidKeySpecException, NoSuchAlgorithmException, NullPointerException, IOException, InvalidKeyException, NoSuchPaddingException, IllegalBlockSizeException, BadPaddingException {
      KeyGenerator var1 = null;
      var1 = KeyGenerator.getInstance("AES");
      if (var1 == null) {
         return null;
      } else {
         var1.init(256);
         SecretKey var2 = var1.generateKey();
         byte[] var3 = var2.getEncoded();
         PublicKey var4 = null;
         Object var5 = null;
         Object var6 = null;
         Object var7 = null;
         var4 = hg.d();
         if (var4 == null) {
            return null;
         } else {
            byte[] var8 = a(var3, (Key)var4);
            byte[] var9 = a(var3, var0);
            byte[] var10 = new byte[var8.length + var9.length];
            System.arraycopy(var8, 0, var10, 0, var8.length);
            System.arraycopy(var9, 0, var10, var8.length, var9.length);
            return var10;
         }
      }
   }

   public static String b(byte[] var0) {
      try {
         return d(var0);
      } catch (Throwable var2) {
         hq.a(var2, "er", "e64");
         return null;
      }
   }

   public static String a(String var0) {
      return hg.a(b(var0));
   }

   public static String c(byte[] var0) {
      try {
         return d(var0);
      } catch (Throwable var2) {
         var2.printStackTrace();
         return null;
      }
   }

   static byte[] a(byte[] var0, byte[] var1) {
      try {
         return b(var0, var1);
      } catch (Throwable var3) {
         hq.a(var3, "er", "asEn");
         return null;
      }
   }

   public static byte[] a(byte[] var0, byte[] var1, byte[] var2) throws Exception {
      return d(var0, var1, var2);
   }

   private static byte[] b(byte[] var0, byte[] var1) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException {
      return c(var0, var1, hg.c());
   }

   public static byte[] b(byte[] var0, byte[] var1, byte[] var2) throws IllegalBlockSizeException, InvalidKeyException, BadPaddingException, NoSuchAlgorithmException, NoSuchPaddingException {
      return c(var0, var1, var2);
   }

   private static byte[] c(byte[] var0, byte[] var1, byte[] var2) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, BadPaddingException, IllegalBlockSizeException {
      Object var3 = null;
      IvParameterSpec var4 = new IvParameterSpec(var2);
      SecretKeySpec var5 = new SecretKeySpec(var0, "AES");
      Cipher var6 = Cipher.getInstance("AES/CBC/PKCS5Padding");

      try {
         var6.init(1, var5, var4);
      } catch (InvalidAlgorithmParameterException var8) {
         var8.printStackTrace();
      }

      byte[] var9 = var6.doFinal(var1);
      return var9;
   }

   private static byte[] d(byte[] var0, byte[] var1, byte[] var2) throws Exception {
      IvParameterSpec var3 = new IvParameterSpec(var2);
      SecretKeySpec var4 = new SecretKeySpec(var0, "AES");
      Cipher var5 = Cipher.getInstance("AES/CBC/PKCS5Padding");
      var5.init(2, var4, var3);
      return var5.doFinal(var1);
   }

   static byte[] a(byte[] var0, Key var1) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException {
      Cipher var2 = Cipher.getInstance(hg.c(ho.a));
      var2.init(1, var1);
      return var2.doFinal(var0);
   }

   public static byte[] b(String var0) {
      if (var0 == null) {
         return new byte[0];
      } else {
         byte[] var1 = hg.a(var0);
         int var2 = var1.length;
         ByteArrayOutputStream var3 = new ByteArrayOutputStream(var2);
         int var4 = 0;

         while(var4 < var2) {
            byte var5;
            do {
               var5 = b[var1[var4++]];
            } while(var4 < var2 && var5 == -1);

            if (var5 == -1) {
               break;
            }

            byte var6;
            do {
               var6 = b[var1[var4++]];
            } while(var4 < var2 && var6 == -1);

            if (var6 == -1) {
               break;
            }

            var3.write(var5 << 2 | (var6 & 48) >>> 4);

            byte var7;
            do {
               if (var4 == var2) {
                  return var3.toByteArray();
               }

               var7 = var1[var4++];
               if (var7 == 61) {
                  return var3.toByteArray();
               }

               var7 = b[var7];
            } while(var4 < var2 && var7 == -1);

            if (var7 == -1) {
               break;
            }

            var3.write((var6 & 15) << 4 | (var7 & 60) >>> 2);

            byte var8;
            do {
               if (var4 == var2) {
                  return var3.toByteArray();
               }

               var8 = var1[var4++];
               if (var8 == 61) {
                  return var3.toByteArray();
               }

               var8 = b[var8];
            } while(var4 < var2 && var8 == -1);

            if (var8 == -1) {
               break;
            }

            var3.write((var7 & 3) << 6 | var8);
         }

         return var3.toByteArray();
      }
   }

   private static String d(byte[] var0) {
      StringBuffer var1 = new StringBuffer();
      int var2 = var0.length;
      int var3 = 0;

      while(var3 < var2) {
         int var4 = var0[var3++] & 255;
         if (var3 == var2) {
            var1.append(a[var4 >>> 2]);
            var1.append(a[(var4 & 3) << 4]);
            var1.append("==");
            break;
         }

         int var5 = var0[var3++] & 255;
         if (var3 == var2) {
            var1.append(a[var4 >>> 2]);
            var1.append(a[(var4 & 3) << 4 | (var5 & 240) >>> 4]);
            var1.append(a[(var5 & 15) << 2]);
            var1.append("=");
            break;
         }

         int var6 = var0[var3++] & 255;
         var1.append(a[var4 >>> 2]);
         var1.append(a[(var4 & 3) << 4 | (var5 & 240) >>> 4]);
         var1.append(a[(var5 & 15) << 2 | (var6 & 192) >>> 6]);
         var1.append(a[var6 & 63]);
      }

      return var1.toString();
   }

   static {
      int var0;
      for(var0 = 0; var0 < 128; ++var0) {
         b[var0] = -1;
      }

      for(var0 = 65; var0 <= 90; ++var0) {
         b[var0] = (byte)(var0 - 65);
      }

      for(var0 = 97; var0 <= 122; ++var0) {
         b[var0] = (byte)(var0 - 97 + 26);
      }

      for(var0 = 48; var0 <= 57; ++var0) {
         b[var0] = (byte)(var0 - 48 + 52);
      }

      b[43] = 62;
      b[47] = 63;
   }
}
