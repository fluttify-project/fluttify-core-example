package com.amap.api.mapcore.util;

import android.content.Context;
import android.os.Build;
import java.io.ByteArrayOutputStream;

public class jz extends kb {
   public static int a = 13;
   public static int b = 6;
   private Context e;

   public jz(Context var1, kb var2) {
      super(var2);
      this.e = var1;
   }

   protected byte[] a(byte[] var1) {
      byte[] var2 = this.a(this.e);
      byte[] var3 = new byte[var2.length + var1.length];
      System.arraycopy(var2, 0, var3, 0, var2.length);
      System.arraycopy(var1, 0, var3, var2.length, var1.length);
      return var3;
   }

   private byte[] a(Context var1) {
      ByteArrayOutputStream var2 = new ByteArrayOutputStream();
      byte[] var3 = new byte[0];

      try {
         hg.a(var2, "1.2." + a + "." + b);
         hg.a(var2, "Android");
         hg.a(var2, gz.v(var1));
         hg.a(var2, gz.m(var1));
         hg.a(var2, gz.h(var1));
         hg.a(var2, Build.MANUFACTURER);
         hg.a(var2, Build.MODEL);
         hg.a(var2, Build.DEVICE);
         hg.a(var2, gz.x(var1));
         hg.a(var2, gu.c(var1));
         hg.a(var2, gu.d(var1));
         hg.a(var2, gu.f(var1));
         var2.write(new byte[]{0});
         var3 = var2.toByteArray();
      } catch (Throwable var14) {
         ht.c(var14, "sm", "gh");
      } finally {
         try {
            var2.close();
         } catch (Throwable var13) {
            var13.printStackTrace();
         }

      }

      return var3;
   }
}
