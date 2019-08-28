package com.amap.api.mapcore.util;

import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLDisplay;

public class eq$a extends eo {
   private static int g = 4;
   protected int a;
   protected int b;
   protected int c;
   protected int d;
   protected int e;
   protected int f;
   private int[] h = new int[1];

   public eq$a(int var1, int var2, int var3, int var4, int var5, int var6) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = var4;
      this.e = var5;
      this.f = var6;
   }

   private int[] a(int var1, boolean var2) {
      byte var3 = 2;
      if (var1 == var3) {
         return new int[]{12324, this.a, 12323, this.b, 12322, this.c, 12321, this.d, 12325, this.e, 12326, this.f, 12338, var2 ? 1 : 0, 12352, g, 12344};
      } else {
         return var2 ? new int[]{12324, this.a, 12323, this.b, 12322, this.c, 12338, 1, 12344} : new int[]{12324, this.a, 12323, this.b, 12322, this.c, 12344};
      }
   }

   private eq$c a(EGL10 var1, EGLDisplay var2) {
      eq$c var3 = new eq$c((eq$1)null);
      var3.a = this.a(2, true);
      var1.eglChooseConfig(var2, var3.a, (EGLConfig[])null, 0, var3.b);
      if (var3.b[0] <= 0) {
         var3.a = this.a(2, false);
         var1.eglChooseConfig(var2, var3.a, (EGLConfig[])null, 0, var3.b);
         if (var3.b[0] <= 0) {
            return null;
         }
      }

      return var3;
   }

   public EGLConfig chooseConfig(EGL10 var1, EGLDisplay var2) {
      eq$c var3 = this.a(var1, var2);
      if (var3 != null && var3.a != null) {
         EGLConfig[] var4 = new EGLConfig[var3.b[0]];
         var1.eglChooseConfig(var2, var3.a, var4, var3.b[0], var3.b);
         EGLConfig var5 = this.a(var1, var2, var4);
         if (var5 == null) {
            this.a = 8;
            this.b = 8;
            this.c = 8;
            var3 = this.a(var1, var2);
            if (var3 != null && var3.a != null) {
               var4 = new EGLConfig[var3.b[0]];
               var1.eglChooseConfig(var2, var3.a, var4, var3.b[0], var3.b);
               var5 = this.a(var1, var2, var4);
            }
         }

         return var5;
      } else {
         return null;
      }
   }

   public EGLConfig a(EGL10 var1, EGLDisplay var2, EGLConfig[] var3) {
      EGLConfig[] var4 = var3;
      int var5 = var3.length;

      for(int var6 = 0; var6 < var5; ++var6) {
         EGLConfig var7 = var4[var6];
         int var8 = this.a(var1, var2, var7, 12325, 0);
         int var9 = this.a(var1, var2, var7, 12326, 0);
         if (var8 >= this.e && var9 >= this.f) {
            int var10 = this.a(var1, var2, var7, 12324, 0);
            int var11 = this.a(var1, var2, var7, 12323, 0);
            int var12 = this.a(var1, var2, var7, 12322, 0);
            int var13 = this.a(var1, var2, var7, 12321, 0);
            if (var10 == this.a && var11 == this.b && var12 == this.c && var13 == this.d) {
               return var7;
            }
         }
      }

      return null;
   }

   private int a(EGL10 var1, EGLDisplay var2, EGLConfig var3, int var4, int var5) {
      return var1.eglGetConfigAttrib(var2, var3, var4, this.h) ? this.h[0] : var5;
   }
}
