package com.amap.api.mapcore.util;

import android.util.Log;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

class o$d implements o$g {
   private o$d() {
   }

   public EGLSurface a(EGL10 var1, EGLDisplay var2, EGLConfig var3, Object var4) {
      EGLSurface var5 = null;

      try {
         var5 = var1.eglCreateWindowSurface(var2, var3, var4, (int[])null);
      } catch (IllegalArgumentException var7) {
         Log.e("GLSurfaceView", "eglCreateWindowSurface", var7);
      }

      return var5;
   }

   public void a(EGL10 var1, EGLDisplay var2, EGLSurface var3) {
      var1.eglDestroySurface(var2, var3);
   }
}
