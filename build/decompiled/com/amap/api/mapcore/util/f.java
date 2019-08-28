package com.amap.api.mapcore.util;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.GLSurfaceView.Renderer;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import com.autonavi.ae.gmap.GLMapRender;

public class f extends o implements v {
   private u b;
   private GLMapRender c;
   protected boolean a;

   public f(Context var1) {
      this(var1, (AttributeSet)null);
   }

   public f(Context var1, AttributeSet var2) {
      super(var1, var2);
      this.b = null;
      this.c = null;
      this.a = false;
      eq.a(this, 5, 6, 5, 0, 16, 8);
      this.b = new c(this, var1, var2);
   }

   public u a() {
      return this.b;
   }

   public boolean onTouchEvent(MotionEvent var1) {
      super.onTouchEvent(var1);

      try {
         return this.b.onTouchEvent(var1);
      } catch (Throwable var3) {
         var3.printStackTrace();
         return false;
      }
   }

   public SurfaceHolder getHolder() {
      return null;
   }

   public void a(eo var1) {
      super.a((o$e)var1);
   }

   public void a(ep var1) {
      super.a((o$f)var1);
   }

   public void b() {
      this.c();

      try {
         if (this.c != null) {
            this.c.onDetachedFromWindow();
         }
      } catch (Throwable var2) {
         var2.printStackTrace();
      }

      super.onDetachedFromWindow();
   }

   public void setRenderer(Renderer var1) {
      this.c = (GLMapRender)var1;
      super.setRenderer(var1);
   }

   public void c() {
      if (!this.c.mSurfacedestoryed) {
         this.queueEvent(new f$1(this));
         int var1 = 0;
         byte var2 = 20;

         while(!this.c.mSurfacedestoryed && var1++ < var2) {
            try {
               Thread.sleep(50L);
            } catch (InterruptedException var4) {
               ;
            }
         }
      }

      super.c();
   }

   public void d() {
      super.d();
   }

   public boolean onSurfaceTextureDestroyed(SurfaceTexture var1) {
      this.requestRender();

      try {
         Thread.sleep(100L);
      } catch (Throwable var3) {
         var3.printStackTrace();
      }

      return super.onSurfaceTextureDestroyed(var1);
   }

   protected void onWindowVisibilityChanged(int var1) {
      super.onWindowVisibilityChanged(var1);

      try {
         if (var1 != 8 && var1 != 4) {
            if (var1 == 0 && this.c != null) {
               this.c.renderResume();
            }
         } else {
            if (this.c != null) {
               this.c.renderPause();
               this.a = false;
            }

            this.requestRender();
         }
      } catch (Throwable var3) {
         var3.printStackTrace();
      }

   }

   protected void onAttachedToWindow() {
      super.onAttachedToWindow();

      try {
         if (this.c != null) {
            this.c.onAttachedToWindow();
         }
      } catch (Throwable var2) {
         var2.printStackTrace();
      }

      this.d();
   }

   protected void onDetachedFromWindow() {
   }
}
