package com.amap.api.mapcore.util;

import android.util.Log;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;

class o$c implements o$f {
   private o$c(o var1) {
      this.a = var1;
   }

   public EGLContext createContext(EGL10 var1, EGLDisplay var2, EGLConfig var3) {
      int[] var4 = new int[]{12440, o.a(this.a), 12344};
      return var1.eglCreateContext(var2, var3, EGL10.EGL_NO_CONTEXT, o.a(this.a) != 0 ? var4 : null);
   }

   public void destroyContext(EGL10 var1, EGLDisplay var2, EGLContext var3) {
      if (!var1.eglDestroyContext(var2, var3)) {
         Log.e("DefaultContextFactory", "display:" + var2 + " context: " + var3);
         o$h.a("eglDestroyContex", var1.eglGetError());
      }

   }
}
