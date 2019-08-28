package com.amap.api.mapcore.util;

import android.opengl.GLDebugHelper;
import android.util.Log;
import java.lang.ref.WeakReference;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import javax.microedition.khronos.opengles.GL;

class o$h {
   private WeakReference<o> f;
   EGL10 a;
   EGLDisplay b;
   EGLSurface c;
   EGLConfig d;
   EGLContext e;

   public o$h(WeakReference<o> var1) {
      this.f = var1;
   }

   public void a() {
      this.a = (EGL10)EGLContext.getEGL();
      this.b = this.a.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
      if (this.b == EGL10.EGL_NO_DISPLAY) {
         throw new RuntimeException("eglGetDisplay failed");
      } else {
         int[] var1 = new int[2];
         if (!this.a.eglInitialize(this.b, var1)) {
            throw new RuntimeException("eglInitialize failed");
         } else {
            o var2 = (o)this.f.get();
            if (var2 == null) {
               this.d = null;
               this.e = null;
            } else {
               this.d = o.b(var2).chooseConfig(this.a, this.b);
               this.e = o.c(var2).createContext(this.a, this.b, this.d);
            }

            if (this.e == null || this.e == EGL10.EGL_NO_CONTEXT) {
               this.e = null;
               this.a("createContext");
            }

            this.c = null;
         }
      }
   }

   public boolean b() {
      if (this.a == null) {
         throw new RuntimeException("egl not initialized");
      } else if (this.b == null) {
         throw new RuntimeException("eglDisplay not initialized");
      } else if (this.d == null) {
         throw new RuntimeException("mEglConfig not initialized");
      } else {
         this.g();
         o var1 = (o)this.f.get();
         if (var1 != null) {
            this.c = o.d(var1).a(this.a, this.b, this.d, var1.getSurfaceTexture());
         } else {
            this.c = null;
         }

         if (this.c != null && this.c != EGL10.EGL_NO_SURFACE) {
            if (!this.a.eglMakeCurrent(this.b, this.c, this.c, this.e)) {
               a("EGLHelper", "eglMakeCurrent", this.a.eglGetError());
               return false;
            } else {
               return true;
            }
         } else {
            int var2 = this.a.eglGetError();
            if (var2 == 12299) {
               Log.e("EglHelper", "createWindowSurface returned EGL_BAD_NATIVE_WINDOW.");
            }

            return false;
         }
      }
   }

   GL c() {
      GL var1 = this.e.getGL();
      o var2 = (o)this.f.get();
      if (var2 != null) {
         if (o.e(var2) != null) {
            var1 = o.e(var2).a(var1);
         }

         if ((o.f(var2) & 3) != 0) {
            int var3 = 0;
            o$l var4 = null;
            if ((o.f(var2) & 1) != 0) {
               var3 |= 1;
            }

            if ((o.f(var2) & 2) != 0) {
               var4 = new o$l();
            }

            var1 = GLDebugHelper.wrap(var1, var3, var4);
         }
      }

      return var1;
   }

   public int d() {
      return !this.a.eglSwapBuffers(this.b, this.c) ? this.a.eglGetError() : 12288;
   }

   public void e() {
      this.g();
   }

   private void g() {
      if (this.c != null && this.c != EGL10.EGL_NO_SURFACE) {
         this.a.eglMakeCurrent(this.b, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_CONTEXT);
         o var1 = (o)this.f.get();
         if (var1 != null) {
            o.d(var1).a(this.a, this.b, this.c);
         }

         this.c = null;
      }

   }

   public void f() {
      if (this.e != null) {
         o var1 = (o)this.f.get();
         if (var1 != null) {
            o.c(var1).destroyContext(this.a, this.b, this.e);
         }

         this.e = null;
      }

      if (this.b != null) {
         this.a.eglTerminate(this.b);
         this.b = null;
      }

   }

   private void a(String var1) {
      a(var1, this.a.eglGetError());
   }

   public static void a(String var0, int var1) {
      String var2 = b(var0, var1);
      throw new RuntimeException(var2);
   }

   public static void a(String var0, String var1, int var2) {
      Log.w(var0, b(var1, var2));
   }

   public static String b(String var0, int var1) {
      return var0 + " failed: " + var1;
   }
}
