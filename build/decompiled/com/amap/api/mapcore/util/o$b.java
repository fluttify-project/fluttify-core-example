package com.amap.api.mapcore.util;

import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLDisplay;

class o$b extends o$a {
   private int[] j;
   protected int c;
   protected int d;
   protected int e;
   protected int f;
   protected int g;
   protected int h;

   public o$b(o var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      super(var1, new int[]{12324, var2, 12323, var3, 12322, var4, 12321, var5, 12325, var6, 12326, var7, 12344});
      this.i = var1;
      this.j = new int[1];
      this.c = var2;
      this.d = var3;
      this.e = var4;
      this.f = var5;
      this.g = var6;
      this.h = var7;
   }

   public EGLConfig a(EGL10 var1, EGLDisplay var2, EGLConfig[] var3) {
      EGLConfig[] var4 = var3;
      int var5 = var3.length;

      for(int var6 = 0; var6 < var5; ++var6) {
         EGLConfig var7 = var4[var6];
         int var8 = this.a(var1, var2, var7, 12325, 0);
         int var9 = this.a(var1, var2, var7, 12326, 0);
         if (var8 >= this.g && var9 >= this.h) {
            int var10 = this.a(var1, var2, var7, 12324, 0);
            int var11 = this.a(var1, var2, var7, 12323, 0);
            int var12 = this.a(var1, var2, var7, 12322, 0);
            int var13 = this.a(var1, var2, var7, 12321, 0);
            if (var10 == this.c && var11 == this.d && var12 == this.e && var13 == this.f) {
               return var7;
            }
         }
      }

      return null;
   }

   private int a(EGL10 var1, EGLDisplay var2, EGLConfig var3, int var4, int var5) {
      return var1.eglGetConfigAttrib(var2, var3, var4, this.j) ? this.j[0] : var5;
   }
}
