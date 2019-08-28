package com.amap.api.mapcore.util;

import android.graphics.Bitmap;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.Matrix;
import com.amap.api.maps.model.CrossOverlay$GenerateCrossImageListener;
import java.nio.FloatBuffer;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ThreadPoolExecutor.AbortPolicy;

public class ae {
   private final u c;
   private int d = 0;
   private int e = 0;
   private int f = 0;
   private BlockingQueue<Runnable> g = new LinkedBlockingQueue();
   private ExecutorService h = null;
   private boolean i = false;
   private boolean j = false;
   private int k = 0;
   private int l = 0;
   private int m = 0;
   private boolean n = false;
   private volatile EGLContext o;
   private volatile EGLConfig p;
   private EGLDisplay q;
   private EGLContext r;
   private EGLSurface s;
   private dw$f t;
   float[] a;
   float[] b;
   private FloatBuffer u;
   private FloatBuffer v;
   private ae$a w;
   private CrossOverlay$GenerateCrossImageListener x;

   public ae(u var1) {
      this.q = EGL14.EGL_NO_DISPLAY;
      this.r = EGL14.EGL_NO_CONTEXT;
      this.s = EGL14.EGL_NO_SURFACE;
      this.a = new float[]{1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F};
      this.b = new float[]{-1.0F, 1.0F, 0.0F, 1.0F, 1.0F, 0.0F, 1.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F};
      this.c = var1;
      this.j = false;
      int var2 = Runtime.getRuntime().availableProcessors();
      byte var3 = 1;
      TimeUnit var4 = TimeUnit.SECONDS;
      this.h = new ThreadPoolExecutor(var3, var2 * 2, (long)var3, var4, this.g, new ev("AMapPboRenderThread"), new AbortPolicy());
   }

   private void a(String var1) {
   }

   private void d() {
      this.q = EGL14.eglGetDisplay(0);
      if (this.q == EGL14.EGL_NO_DISPLAY) {
         this.a("eglGetDisplay failed");
      } else {
         int[] var1 = new int[2];
         if (!EGL14.eglInitialize(this.q, var1, 0, var1, 1)) {
            this.q = null;
            this.a("eglInitialize failed");
         } else {
            int[] var2 = new int[]{12440, 2, 12344};
            this.r = EGL14.eglCreateContext(this.q, this.p, this.o, var2, 0);
            if (this.r == EGL14.EGL_NO_CONTEXT) {
               this.a("eglCreateContext failed");
            } else {
               int[] var3 = new int[]{12375, this.e, 12374, this.f, 12344};
               this.s = EGL14.eglCreatePbufferSurface(this.q, this.p, var3, 0);
               if (this.s == EGL14.EGL_NO_SURFACE) {
                  this.a("eglCreatePbufferSurface failed");
               } else if (!EGL14.eglMakeCurrent(this.q, this.s, this.s, this.r)) {
                  this.a("eglMakeCurrent failed");
               } else {
                  GLES20.glFlush();
                  this.a("initOpenGL complete");
                  this.i = true;
               }
            }
         }
      }
   }

   public void a(int var1, int var2) {
      this.e = var1;
      this.f = var2;
      this.o = EGL14.eglGetCurrentContext();
      if (this.o == EGL14.EGL_NO_CONTEXT) {
         this.a("eglGetCurrentContext failed");
      } else {
         EGLDisplay var3 = EGL14.eglGetCurrentDisplay();
         if (var3 == EGL14.EGL_NO_DISPLAY) {
            this.a("sharedEglDisplay failed");
         } else {
            int[] var4 = new int[1];
            EGLConfig[] var5 = new EGLConfig[1];
            if (!EGL14.eglGetConfigs(var3, var5, 0, var5.length, var4, 0)) {
               this.a("eglGetConfigs failed");
            } else {
               this.p = var5[0];
               if (this.h != null && !this.h.isShutdown()) {
                  this.h.execute(new ae$1(this));
               }

            }
         }
      }
   }

   private void e() {
      if (this.c != null) {
         this.t = (dw$f)this.c.u(0);
      }

   }

   public void a() {
      if (this.h != null && !this.h.isShutdown()) {
         this.h.execute(new ae$2(this));
      }

   }

   private void f() {
      try {
         if (this.j) {
            return;
         }

         if (this.w == null) {
            this.a("renderTextureAndReadPixel failed textureHelper is null");
            return;
         }

         if (this.w != null) {
            this.d = this.w.getTextureID();
         }

         if (this.d <= 0) {
            this.a("renderTextureAndReadPixel failed mTextureID is <= 0 mTextureID " + this.d);
            return;
         }

         this.a("renderTextureAndReadPixel  mTextureID is  mTextureID " + this.d);
         if (this.t == null || this.t.c()) {
            this.e();
         }

         if (this.u == null) {
            this.u = fi.a(this.b);
         }

         if (this.v == null) {
            this.v = fi.a(new float[]{0.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F});
         }

         this.t.a();
         GLES20.glDisable(3042);
         GLES20.glBlendFunc(1, 771);
         GLES20.glBlendColor(1.0F, 1.0F, 1.0F, 1.0F);
         GLES20.glActiveTexture(33984);
         GLES20.glBindTexture(3553, this.d);
         GLES20.glEnableVertexAttribArray(this.t.b);
         GLES20.glVertexAttribPointer(this.t.b, 3, 5126, false, 12, this.u);
         GLES20.glEnableVertexAttribArray(this.t.c);
         GLES20.glVertexAttribPointer(this.t.c, 2, 5126, false, 8, this.v);
         Matrix.setIdentityM(this.a, 0);
         float var1 = 1.0F;
         Matrix.scaleM(this.a, 0, var1, var1, var1);
         GLES20.glUniformMatrix4fv(this.t.a, 1, false, this.a, 0);
         GLES20.glDrawArrays(6, 0, 4);
         GLES20.glDisableVertexAttribArray(this.t.b);
         GLES20.glDisableVertexAttribArray(this.t.c);
         GLES20.glBindTexture(3553, 0);
         GLES20.glUseProgram(0);
         GLES20.glDisable(3042);
         eq.a("drawTexure");
         GLES20.glFinish();
         ++this.k;
         if (this.k == 50) {
            this.g();
         }
      } catch (Throwable var2) {
         if (this.x != null) {
            this.x.onGenerateComplete((Bitmap)null, -1);
         }
      }

   }

   private void g() {
      if (this.x != null) {
         if (this.l == 0) {
            this.l = this.e;
         }

         if (this.m == 0) {
            this.m = this.f;
         }

         Bitmap var1 = fi.a(0, this.f - this.m, this.l, this.m);
         this.x.onGenerateComplete(var1, this.i ? 0 : -1);
         this.n = true;
      }

   }

   public void b() {
      this.j = true;
      if (this.v != null) {
         this.v.clear();
         this.v = null;
      }

      if (this.u != null) {
         this.u.clear();
         this.u = null;
      }

      this.w = null;
      this.h.shutdownNow();
   }

   public boolean c() {
      return this.j;
   }

   public void a(CrossOverlay$GenerateCrossImageListener var1) {
      this.x = var1;
   }

   public void a(ae$a var1) {
      this.w = var1;
   }

   public void b(int var1, int var2) {
      this.l = var1;
      this.m = var2;
   }
}
