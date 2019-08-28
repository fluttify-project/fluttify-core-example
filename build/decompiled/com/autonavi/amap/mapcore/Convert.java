package com.autonavi.amap.mapcore;

import java.io.ByteArrayOutputStream;

public class Convert {
   public Convert() {
   }

   public static int getInt(byte[] var0, int var1) {
      int var2 = var0[3 + var1] & 255;
      int var3 = var0[2 + var1] & 255;
      int var4 = var0[1 + var1] & 255;
      int var5 = var0[0 + var1] & 255;
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

   public static boolean getBit(byte var0, int var1) {
      int var2 = var0 << 32 - var1;
      var2 >>>= 32 - var1;
      var2 >>>= var1 - 1;
      return var2 > 0;
   }

   public static byte[] copyString(byte[] var0, int var1, int var2) {
      byte[] var3 = new byte[var2];
      System.arraycopy(var0, var1, var3, 0, var2);
      return var3;
   }

   public static byte[] covertBytes(byte var0) {
      byte[] var1 = new byte[]{var0};
      return var1;
   }

   public static byte[] convertInt(int var0) {
      byte[] var1 = new byte[]{(byte)(var0 & 255), (byte)(var0 >> 8 & 255), (byte)(var0 >> 16 & 255), (byte)(var0 >> 24 & 255)};
      return var1;
   }

   public static int getNum(byte var0, int var1, int var2) {
      int var3 = var0 << 32 - var2 - 1;
      var3 >>>= 32 - var2 - 1;
      var3 >>>= var1;
      return var3;
   }

   public static int getNum(short var0, int var1, int var2) {
      int var3 = var0 << 32 - var2;
      var3 >>>= 32 - var2;
      var3 >>>= var1 - 1;
      return var3;
   }

   public static byte[] convertShort(int var0) {
      byte[] var1 = new byte[]{(byte)(var0 & 255), (byte)(var0 >> 8 & 255)};
      return var1;
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

   public static byte[] get2BString(String var0) {
      try {
         ByteArrayOutputStream var1 = new ByteArrayOutputStream();
         byte[] var2 = var0.getBytes("UTF-8");
         var1.write(convertShort(var2.length));
         var1.write(var2);
         return var1.toByteArray();
      } catch (Exception var3) {
         var3.printStackTrace();
         return new byte[1];
      }
   }

   public static double convertDouble(byte[] var0, int var1) {
      long var2 = 0L;
      byte var4 = 8;

      for(int var5 = 0; var5 < var4; ++var5) {
         var2 += (long)(var0[var5 + var1] & 255) << 8 * var5;
      }

      return Double.longBitsToDouble(var2);
   }

   public static byte[] getDouble(double var0) {
      byte[] var2 = new byte[8];
      long var3 = Double.doubleToLongBits(var0);
      String var5 = Long.toHexString(var3);
      byte var7 = 8;

      for(int var8 = 0; var8 < var7; ++var8) {
         String var6 = var5.substring(2 * var8, 2 * var8 + 2);
         var2[7 - var8] = (byte)Integer.parseInt(var6, 16);
      }

      return var2;
   }

   public static void convert1bString(byte[] var0, int var1, ConvertString var2) {
      try {
         var2.byteLength = var0[var1];
         var2.value = new String(var0, var1 + 1, var2.byteLength, "UTF-8");
      } catch (Exception var4) {
         var4.printStackTrace();
         var2.byteLength = 0;
         var2.value = "";
      }

   }

   public static void convert2bString(byte[] var0, int var1, ConvertString var2) {
      try {
         var2.byteLength = getShort(var0, var1);
         var2.value = new String(var0, var1 + 2, var2.byteLength, "UTF-8");
      } catch (Exception var4) {
         var4.printStackTrace();
         var2.byteLength = 0;
         var2.value = "";
      }

   }

   public static final String bytesToHexString(byte[] var0) {
      StringBuffer var1 = new StringBuffer(var0.length);

      for(int var3 = 0; var3 < var0.length; ++var3) {
         String var2 = Integer.toHexString(255 & var0[var3]);
         if (var2.length() < 2) {
            var1.append(0);
         }

         var1.append(var2.toUpperCase());
      }

      return var1.toString();
   }
}
