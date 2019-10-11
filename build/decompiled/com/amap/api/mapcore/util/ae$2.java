package com.amap.api.mapcore.util;

import android.graphics.Bitmap;
import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.GLES20;

class ae$2 implements Runnable {
   ae$2(ae var1) {
      this.a = var1;
   }

   public void run() {
      try {
         ae.a(this.a, false);
         if (ae.b(this.a)) {
            return;
         }

         int var1 = 0;
         ae.a(this.a, 0);

         while(true) {
            if (ae.b(this.a) || ae.c(this.a) >= 5 || var1 >= 50) {
               return;
            }

            ++var1;

            try {
               Thread.sleep(16L);
            } catch (InterruptedException var7) {
               var7.printStackTrace();
            }

            if (!ae.d(this.a)) {
               if (ae.e(this.a) != null) {
                  ae.e(this.a).onGenerateComplete((Bitmap)null, -1);
               }
               break;
            }

            GLES20.glViewport(0, 0, ae.f(this.a), ae.g(this.a));
            GLES20.glClear(16640);
            ae.h(this.a);
         }
      } finally {
         if (!ae.i(this.a)) {
            ae.a(this.a, true);
            if (ae.e(this.a) != null) {
               ae.e(this.a).onGenerateComplete((Bitmap)null, -1);
            }
         }

         if (ae.j(this.a) != EGL14.EGL_NO_CONTEXT) {
            EGL14.eglDestroyContext(ae.k(this.a), ae.j(this.a));
            EGL14.eglDestroySurface(ae.k(this.a), ae.l(this.a));
            ae.a(this.a, (EGLContext)null);
         }

         if (ae.k(this.a) != EGL14.EGL_NO_DISPLAY) {
            EGL14.eglTerminate(ae.k(this.a));
            ae.a(this.a, (EGLDisplay)null);
         }

         ae.a(this.a, EGL14.EGL_NO_CONTEXT);
         ae.a(this.a, EGL14.EGL_NO_DISPLAY);
      }

   }
}
