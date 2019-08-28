package com.amap.api.mapcore.util;

public class gs {
   private static byte[] a;
   private static byte[] b;
   private static int c;

   public static byte[] a(byte[] var0) {
      try {
         byte[] var1 = ha.b(a, var0, b);
         return var1;
      } catch (Throwable var2) {
         return new byte[0];
      }
   }

   public static byte[] b(byte[] var0) {
      try {
         return ha.a(a, var0, b);
      } catch (Exception var2) {
         return new byte[0];
      }
   }

   static {
      a = hv.a;
      b = hv.b;
      c = 6;
   }
}
