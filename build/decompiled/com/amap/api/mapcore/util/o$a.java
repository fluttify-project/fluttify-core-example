package com.amap.api.mapcore.util;

import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLDisplay;

abstract class o$a implements o$e {
   protected int[] a;

   public o$a(o var1, int[] var2) {
      this.b = var1;
      this.a = this.a(var2);
   }

   public EGLConfig chooseConfig(EGL10 var1, EGLDisplay var2) {
      int[] var3 = new int[1];
      if (!var1.eglChooseConfig(var2, this.a, (EGLConfig[])null, 0, var3)) {
         throw new IllegalArgumentException("eglChooseConfig failed");
      } else {
         int var4 = var3[0];
         if (var4 <= 0) {
            throw new IllegalArgumentException("No configs match configSpec");
         } else {
            EGLConfig[] var5 = new EGLConfig[var4];
            if (!var1.eglChooseConfig(var2, this.a, var5, var4, var3)) {
               throw new IllegalArgumentException("eglChooseConfig#2 failed");
            } else {
               EGLConfig var6 = this.a(var1, var2, var5);
               if (var6 == null) {
                  throw new IllegalArgumentException("No config chosen");
               } else {
                  return var6;
               }
            }
         }
      }
   }

   abstract EGLConfig a(EGL10 var1, EGLDisplay var2, EGLConfig[] var3);

   private int[] a(int[] var1) {
      if (o.a(this.b) != 2 && o.a(this.b) != 3) {
         return var1;
      } else {
         int var2 = var1.length;
         int[] var3 = new int[var2 + 2];
         System.arraycopy(var1, 0, var3, 0, var2 - 1);
         var3[var2 - 1] = 12352;
         if (o.a(this.b) == 2) {
            var3[var2] = 4;
         } else {
            var3[var2] = 64;
         }

         var3[var2 + 1] = 12344;
         return var3;
      }
   }
}
