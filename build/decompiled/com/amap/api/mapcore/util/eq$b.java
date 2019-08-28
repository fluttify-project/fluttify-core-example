package com.amap.api.mapcore.util;

import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;

public class eq$b extends ep {
   public eq$b() {
   }

   public EGLContext createContext(EGL10 var1, EGLDisplay var2, EGLConfig var3) {
      try {
         int[] var4 = new int[]{12440, 2, 12344};
         EGLContext var5 = var1.eglCreateContext(var2, var3, EGL10.EGL_NO_CONTEXT, var4);
         return var5;
      } catch (Throwable var6) {
         var6.printStackTrace();
         return null;
      }
   }

   public void destroyContext(EGL10 var1, EGLDisplay var2, EGLContext var3) {
      var1.eglDestroyContext(var2, var3);
   }
}
