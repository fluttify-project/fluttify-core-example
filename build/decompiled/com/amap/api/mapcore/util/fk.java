package com.amap.api.mapcore.util;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.graphics.BitmapFactory.Options;
import java.io.FileDescriptor;

public class fk extends fl {
   protected int a;
   protected int b;

   public fk(Context var1, int var2, int var3) {
      super(var1);
      this.a(var2, var3);
   }

   public void a(int var1, int var2) {
      this.a = var1;
      this.b = var2;
   }

   private Bitmap a(int var1) {
      return a(this.d, var1, this.a, this.b, this.a());
   }

   protected Bitmap a(Object var1) {
      return this.a(Integer.parseInt(String.valueOf(var1)));
   }

   public static Bitmap a(Resources var0, int var1, int var2, int var3, fm var4) {
      Options var5 = new Options();
      var5.inJustDecodeBounds = true;
      BitmapFactory.decodeResource(var0, var1, var5);
      var5.inSampleSize = a(var5, var2, var3);
      var5.inJustDecodeBounds = false;
      return BitmapFactory.decodeResource(var0, var1, var5);
   }

   public static Bitmap a(FileDescriptor var0, int var1, int var2, fm var3) {
      Options var4 = new Options();
      var4.inJustDecodeBounds = true;
      BitmapFactory.decodeFileDescriptor(var0, (Rect)null, var4);
      var4.inSampleSize = a(var4, var1, var2);
      var4.inJustDecodeBounds = false;
      return BitmapFactory.decodeFileDescriptor(var0, (Rect)null, var4);
   }

   public static int a(Options var0, int var1, int var2) {
      int var3 = var0.outHeight;
      int var4 = var0.outWidth;
      int var5 = 1;
      if (var3 > var2 || var4 > var1) {
         int var6 = Math.round((float)var3 / (float)var2);
         int var7 = Math.round((float)var4 / (float)var1);
         var5 = var6 < var7 ? var6 : var7;
         float var8 = (float)(var4 * var3);

         for(float var9 = (float)(var1 * var2 * 2); var8 / (float)(var5 * var5) > var9; ++var5) {
            ;
         }
      }

      return var5;
   }
}
