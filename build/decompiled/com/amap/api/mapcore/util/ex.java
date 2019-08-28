package com.amap.api.mapcore.util;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.NinePatch;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.os.Build.VERSION;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ex {
   public static Drawable a(Context var0, String var1) throws Exception {
      Bitmap var2 = b(var0, var1);
      if (null == var2.getNinePatchChunk()) {
         BitmapDrawable var5 = new BitmapDrawable(var0.getResources(), var2);
         return var5;
      } else {
         Rect var3 = new Rect();
         a(var2.getNinePatchChunk(), var3);
         NinePatchDrawable var4 = new NinePatchDrawable(var0.getResources(), var2, var2.getNinePatchChunk(), var3, (String)null);
         return var4;
      }
   }

   private static Bitmap a(InputStream var0) throws Exception {
      Bitmap var1 = BitmapFactory.decodeStream(var0);
      byte[] var2 = a(var1);
      boolean var3 = NinePatch.isNinePatchChunk(var2);
      if (var3) {
         Bitmap var4 = Bitmap.createBitmap(var1, 1, 1, var1.getWidth() - 2, var1.getHeight() - 2);
         var1.recycle();
         var1 = null;
         if (VERSION.SDK_INT >= 28) {
            Method var5 = var4.getClass().getDeclaredMethod("setNinePatchChunk", byte[].class);
            var5.setAccessible(true);
            var5.invoke(var4, var2);
         } else {
            Field var6 = var4.getClass().getDeclaredField("mNinePatchChunk");
            var6.setAccessible(true);
            var6.set(var4, var2);
         }

         return var4;
      } else {
         return var1;
      }
   }

   private static Bitmap b(Context var0, String var1) throws Exception {
      InputStream var2 = fc.a(var0).open(var1);
      Bitmap var3 = a(var2);
      var2.close();
      return var3;
   }

   private static void a(byte[] var0, Rect var1) {
      var1.left = a((byte[])var0, 12);
      var1.right = a((byte[])var0, 16);
      var1.top = a((byte[])var0, 20);
      var1.bottom = a((byte[])var0, 24);
   }

   private static byte[] a(Bitmap var0) throws IOException {
      int var1 = var0.getWidth();
      int var2 = var0.getHeight();
      int var3 = 0;
      int var4 = 0;
      boolean var5 = false;
      boolean var6 = false;
      ByteArrayOutputStream var7 = new ByteArrayOutputStream();
      byte var8 = 32;

      int var9;
      for(var9 = 0; var9 < var8; ++var9) {
         var7.write(0);
      }

      int[] var17 = new int[var1 - 2];
      var0.getPixels(var17, 0, var1, 1, 0, var1 - 2, 1);
      boolean var10 = var17[0] == -16777216;
      boolean var11 = var17[var17.length - 1] == -16777216;
      int var12 = 0;
      int var13 = 0;

      int var14;
      for(var14 = var17.length; var13 < var14; ++var13) {
         if (var12 != var17[var13]) {
            ++var3;
            a((OutputStream)var7, var13);
            var12 = var17[var13];
         }
      }

      if (var11) {
         ++var3;
         a((OutputStream)var7, var17.length);
      }

      int var15 = var3 + 1;
      if (var10) {
         --var15;
      }

      if (var11) {
         --var15;
      }

      var17 = new int[var2 - 2];
      var0.getPixels(var17, 0, 1, 0, 1, 1, var2 - 2);
      var10 = var17[0] == -16777216;
      var11 = var17[var17.length - 1] == -16777216;
      var12 = 0;
      var13 = 0;

      for(var14 = var17.length; var13 < var14; ++var13) {
         if (var12 != var17[var13]) {
            ++var4;
            a((OutputStream)var7, var13);
            var12 = var17[var13];
         }
      }

      if (var11) {
         ++var4;
         a((OutputStream)var7, var17.length);
      }

      int var16 = var4 + 1;
      if (var10) {
         --var16;
      }

      if (var11) {
         --var16;
      }

      for(var9 = 0; var9 < var15 * var16; ++var9) {
         a((OutputStream)var7, 1);
      }

      byte[] var18 = var7.toByteArray();
      var18[0] = 1;
      var18[1] = (byte)var3;
      var18[2] = (byte)var4;
      var18[3] = (byte)(var15 * var16);
      a(var0, var18);
      return var18;
   }

   private static void a(Bitmap var0, byte[] var1) {
      int[] var2 = new int[var0.getWidth() - 2];
      var0.getPixels(var2, 0, var2.length, 1, var0.getHeight() - 1, var2.length, 1);

      int var3;
      for(var3 = 0; var3 < var2.length; ++var3) {
         if (-16777216 == var2[var3]) {
            a(var1, 12, var3);
            break;
         }
      }

      for(var3 = var2.length - 1; var3 >= 0; --var3) {
         if (-16777216 == var2[var3]) {
            a(var1, 16, var2.length - var3 - 2);
            break;
         }
      }

      var2 = new int[var0.getHeight() - 2];
      var0.getPixels(var2, 0, 1, var0.getWidth() - 1, 0, 1, var2.length);

      for(var3 = 0; var3 < var2.length; ++var3) {
         if (-16777216 == var2[var3]) {
            a(var1, 20, var3);
            break;
         }
      }

      for(var3 = var2.length - 1; var3 >= 0; --var3) {
         if (-16777216 == var2[var3]) {
            a(var1, 24, var2.length - var3 - 2);
            break;
         }
      }

   }

   private static void a(OutputStream var0, int var1) throws IOException {
      var0.write(var1 >> 0 & 255);
      var0.write(var1 >> 8 & 255);
      var0.write(var1 >> 16 & 255);
      var0.write(var1 >> 24 & 255);
   }

   private static void a(byte[] var0, int var1, int var2) {
      var0[var1 + 0] = (byte)(var2 >> 0);
      var0[var1 + 1] = (byte)(var2 >> 8);
      var0[var1 + 2] = (byte)(var2 >> 16);
      var0[var1 + 3] = (byte)(var2 >> 24);
   }

   private static int a(byte[] var0, int var1) {
      byte var2 = var0[var1 + 0];
      byte var3 = var0[var1 + 1];
      byte var4 = var0[var1 + 2];
      byte var5 = var0[var1 + 3];
      int var6 = var2 & 255 | var3 << 8 | var4 << 16 | var5 << 24;
      return var6;
   }
}
