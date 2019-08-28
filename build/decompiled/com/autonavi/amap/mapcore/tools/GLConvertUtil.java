package com.autonavi.amap.mapcore.tools;

import java.io.ByteArrayOutputStream;

public class GLConvertUtil {
   public GLConvertUtil() {
   }

   public static int getInt(byte[] var0, int var1) {
      int var2 = var0[3 + var1] & 255;
      int var3 = var0[2 + var1] & 255;
      int var4 = var0[1 + var1] & 255;
      int var5 = var0[0 + var1] & 255;
      int var6 = (var2 << 24) + (var3 << 16) + (var4 << 8) + (var5 << 0);
      return var6;
   }

   public static long getLong(byte[] var0, int var1) {
      long var2 = (long)(var0[7 + var1] & 255);
      long var4 = (long)(var0[6 + var1] & 255);
      long var6 = (long)(var0[5 + var1] & 255);
      long var8 = (long)(var0[4 + var1] & 255);
      long var10 = (long)(var0[3 + var1] & 255);
      long var12 = (long)(var0[2 + var1] & 255);
      long var14 = (long)(var0[1 + var1] & 255);
      long var16 = (long)(var0[0 + var1] & 255);
      long var18 = (var2 << 56) + (var4 << 48) + (var6 << 40) + (var8 << 32) + (var10 << 24) + (var12 << 16) + (var14 << 8) + (var16 << 0);
      return var18;
   }

   public static int getInt2(byte[] var0, int var1) {
      int var2 = var0[0 + var1] & 255;
      int var3 = var0[1 + var1] & 255;
      int var4 = var0[2 + var1] & 255;
      int var5 = var0[3 + var1] & 255;
      int var6 = (var2 << 24) + (var3 << 16) + (var4 << 8) + (var5 << 0);
      return var6;
   }

   public static short getShort(byte[] var0, int var1) {
      int var2 = var0[var1 + 1] & 255;
      int var3 = var0[var1 + 0] & 255;
      short var4 = (short)((var2 << 8) + (var3 << 0));
      return var4;
   }

   public static int getUShort(byte[] var0, int var1) {
      int var2 = var0[var1 + 1] & 255;
      int var3 = var0[var1 + 0] & 255;
      int var4 = (var2 << 8) + (var3 << 0);
      return var4;
   }

   public static short getShort2(byte[] var0, int var1) {
      int var2 = var0[var1 + 0] & 255;
      int var3 = var0[var1 + 1] & 255;
      short var4 = (short)((var2 << 8) + (var3 << 0));
      return var4;
   }

   public static byte[] convertInt(int var0) {
      byte[] var1 = new byte[]{(byte)(var0 & 255), (byte)(var0 >> 8 & 255), (byte)(var0 >> 16 & 255), (byte)(var0 >> 24 & 255)};
      return var1;
   }

   public static byte[] convertShort(int var0) {
      byte[] var1 = new byte[]{(byte)(var0 & 255), (byte)(var0 >> 8 & 255)};
      return var1;
   }

   public static double convertDouble(byte[] var0, int var1) {
      long var2 = 0L;
      byte var4 = 8;

      for(int var5 = 0; var5 < var4; ++var5) {
         var2 += (long)(var0[var5 + var1] & 255) << 8 * var5;
      }

      return Double.longBitsToDouble(var2);
   }

   public static void writeInt(byte[] var0, int var1, int var2) {
      byte[] var3 = convertInt(var2);
      System.arraycopy(var3, 0, var0, var1, 4);
   }

   public static void writeShort(byte[] var0, int var1, short var2) {
      byte[] var3 = convertShort(var2);
      System.arraycopy(var3, 0, var0, var1, 2);
   }

   public static void moveArray(byte[] var0, int var1, byte[] var2, int var3, int var4) {
      byte[] var5 = new byte[var4];
      System.arraycopy(var0, var1, var5, 0, var4);
      System.arraycopy(var5, 0, var2, var3, var4);
   }

   public static byte[] get1BString(String var0) {
      try {
         ByteArrayOutputStream var1 = new ByteArrayOutputStream();
         byte[] var2 = var0.getBytes("UTF-8");
         byte[] var3 = new byte[]{(byte)var2.length};
         var1.write(var3);
         var1.write(var2);
         return var1.toByteArray();
      } catch (Exception var4) {
         var4.printStackTrace();
         return new byte[1];
      }
   }

   public static String getString(byte[] var0, int var1, int var2) {
      try {
         return new String(var0, var1, var2, "UTF-8");
      } catch (Exception var4) {
         return "";
      }
   }

   public static byte[] getSubBytes(byte[] var0, int var1, int var2) {
      byte[] var3 = new byte[var2];
      System.arraycopy(var0, var1, var3, 0, var2);
      return var3;
   }
}
