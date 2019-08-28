package com.amap.api.mapcore.util;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class mb {
   private static final char[] a = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
   private static final byte[] b = new byte[]{0, 1, 1, 2, 3, 5, 8, 13, 8, 7, 6, 5, 4, 3, 2, 1};
   private static final IvParameterSpec c;

   public static byte[] a(byte[] var0) {
      try {
         byte[] var6 = new byte[16];
         byte[] var3 = new byte[var0.length - 16];
         System.arraycopy(var0, 0, var6, 0, 16);
         System.arraycopy(var0, 16, var3, 0, var0.length - 16);
         SecretKeySpec var1 = new SecretKeySpec(var6, "AES");
         Cipher var7 = Cipher.getInstance("AES/CBC/PKCS5Padding");
         IvParameterSpec var4 = new IvParameterSpec(hg.c());
         var7.init(2, var1, var4);
         return var7.doFinal(var3);
      } catch (Throwable var5) {
         int var2 = 0;
         if (var0 != null) {
            var2 = var0.length;
         }

         mg.a(var5, "Encrypt", "decryptRsponse length = " + var2);
         return null;
      }
   }

   static {
      c = new IvParameterSpec(b);
   }
}
