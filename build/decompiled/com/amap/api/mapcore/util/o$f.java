package com.amap.api.mapcore.util;

import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;

public interface o$f {
   EGLContext createContext(EGL10 var1, EGLDisplay var2, EGLConfig var3);

   void destroyContext(EGL10 var1, EGLDisplay var2, EGLContext var3);
}
