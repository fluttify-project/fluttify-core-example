package com.amap.api.mapcore.util;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.GLSurfaceView.Renderer;
import android.util.AttributeSet;
import android.view.TextureView;
import android.view.TextureView.SurfaceTextureListener;
import java.lang.ref.WeakReference;

@SuppressLint({"NewApi"})
public class o extends TextureView implements SurfaceTextureListener {
   private static final o$j a = new o$j((o$1)null);
   private final WeakReference<o> b = new WeakReference(this);
   private o$i c;
   private Renderer d;
   private boolean e;
   private o$e f;
   private o$f g;
   private o$g h;
   private o$k i;
   private int j;
   private int k;
   private boolean l;

   public o(Context var1, AttributeSet var2) {
      super(var1, var2);
      this.a();
   }

   protected void finalize() throws Throwable {
      try {
         if (this.c != null) {
            this.c.h();
         }
      } finally {
         super.finalize();
      }

   }

   private void a() {
      this.setSurfaceTextureListener(this);
   }

   public void setRenderer(Renderer var1) {
      this.b();
      if (this.f == null) {
         this.f = new o$m(this, true);
      }

      if (this.g == null) {
         this.g = new o$c(this, (o$1)null);
      }

      if (this.h == null) {
         this.h = new o$d((o$1)null);
      }

      this.d = var1;
      this.c = new o$i(this.b);
      this.c.start();
   }

   public void a(o$f var1) {
      this.b();
      this.g = var1;
   }

   public void a(o$e var1) {
      this.b();
      this.f = var1;
   }

   public void setRenderMode(int var1) {
      this.c.a(var1);
   }

   public void requestRender() {
      this.c.c();
   }

   public int getRenderMode() {
      return this.c.b();
   }

   public void c() {
      this.c.f();
   }

   public void d() {
      this.c.g();
   }

   public void queueEvent(Runnable var1) {
      this.c.a(var1);
   }

   protected void onAttachedToWindow() {
      super.onAttachedToWindow();
      if (this.e && this.d != null) {
         int var1 = 1;
         if (this.c != null) {
            var1 = this.c.b();
         }

         this.c = new o$i(this.b);
         if (var1 != 1) {
            this.c.a(var1);
         }

         this.c.start();
      }

      this.e = false;
   }

   protected void onDetachedFromWindow() {
      if (this.c != null) {
         this.c.h();
      }

      this.e = true;
      super.onDetachedFromWindow();
   }

   private void b() {
      if (this.c != null) {
         throw new IllegalStateException("setRenderer has already been called for this instance.");
      }
   }

   public void onSurfaceTextureAvailable(SurfaceTexture var1, int var2, int var3) {
      this.c.d();
      this.onSurfaceTextureSizeChanged(var1, var2, var3);
   }

   public boolean onSurfaceTextureDestroyed(SurfaceTexture var1) {
      this.c.e();
      return true;
   }

   public void onSurfaceTextureSizeChanged(SurfaceTexture var1, int var2, int var3) {
      this.c.a(var2, var3);
   }

   public void onSurfaceTextureUpdated(SurfaceTexture var1) {
   }

   protected void onLayout(boolean var1, int var2, int var3, int var4, int var5) {
      this.onSurfaceTextureSizeChanged(this.getSurfaceTexture(), var4 - var2, var5 - var3);
      super.onLayout(var1, var2, var3, var4, var5);
   }
}
