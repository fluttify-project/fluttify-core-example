package com.amap.api.mapcore.util;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.opengl.GLSurfaceView.Renderer;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.autonavi.ae.gmap.GLMapRender;

public class e extends GLSurfaceView implements v {
   private u b;
   private GLMapRender c;
   protected boolean a;

   public e(Context var1) {
      this(var1, (AttributeSet)null);
   }

   public e(Context var1, AttributeSet var2) {
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

   public void setRenderer(Renderer var1) {
      this.c = (GLMapRender)var1;
      super.setRenderer(var1);
   }

   public void a(eo var1) {
      super.setEGLConfigChooser(var1);
   }

   public void a(ep var1) {
      super.setEGLContextFactory(var1);
   }

   public void b() {
      this.onPause();

      try {
         if (this.c != null) {
            this.c.onDetachedFromWindow();
         }
      } catch (Throwable var2) {
         var2.printStackTrace();
      }

      super.onDetachedFromWindow();
   }

   public void onPause() {
      if (!this.c.mSurfacedestoryed) {
         this.queueEvent(new e$1(this));
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

      super.onPause();
   }

   public void onResume() {
      super.onResume();
   }

   protected void onWindowVisibilityChanged(int var1) {
      super.onWindowVisibilityChanged(var1);

      try {
         if (var1 != 8 && var1 != 4) {
            if (var1 == 0 && this.c != null) {
               this.c.renderResume();
            }
         } else if (this.c != null) {
            this.c.renderPause();
            this.a = false;
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

      this.onResume();
   }

   protected void onDetachedFromWindow() {
   }
}
