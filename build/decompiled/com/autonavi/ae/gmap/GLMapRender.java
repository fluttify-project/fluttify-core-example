package com.autonavi.ae.gmap;

import android.opengl.GLSurfaceView.Renderer;
import android.os.Handler;
import android.os.HandlerThread;
import com.amap.api.mapcore.util.ht;
import com.autonavi.amap.mapcore.interfaces.IAMap;
import java.util.concurrent.atomic.AtomicLong;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

public class GLMapRender implements Renderer {
   public static final int NORMAL_TICK_COUNT = 2;
   public static final int ANIMATION_TICK_COUNT = 10;
   public static final int LONG_TICK_COUNT = 6;
   public static final int LONG_LONG_TICK_COUNT = 30;
   static final int RENDER_FPS_MAX = 60;
   public static final int RENDER_FPS_NAVI = 10;
   public static final int RENDER_FPS_NORMAL = 15;
   public static final int RENDER_FPS_ANIMATION = 30;
   public static final int RENDER_FPS_GESTURE_ACTION = 40;
   static final long RENDER_TIMMER_DIFF_MIN = 16L;
   private static final int MAP_RENDER_MSG_SURFACE_RENDER = 10;
   private static final int MAP_RENDER_MSG_RUNNABLE_ONGLTHREAD = 100;
   public IAMap mGLMapView;
   static final String TAG = "render";
   private int mTargetFrameDurationMillis = 66;
   private float mTargetRenderFPS = 15.0F;
   private volatile boolean mIsRendPause = false;
   public volatile boolean mSurfacedestoryed = false;
   private HandlerThread mGLRenderThread = null;
   private Handler mGLRenderHandler = null;
   private long mLastFrameTime = System.currentTimeMillis();
   private boolean mIsTrafficMode = false;
   private volatile AtomicLong mDrawFrameTickCount = new AtomicLong(6L);

   public GLMapRender(IAMap var1) {
      this.mGLMapView = var1;
   }

   public void setTrafficMode(boolean var1) {
      this.mIsTrafficMode = var1;
   }

   public void resetTickCount(int var1) {
      long var2 = this.mDrawFrameTickCount.get();
      if (!this.mIsRendPause && this.mGLRenderThread != null && this.mGLRenderHandler != null && this.mGLRenderThread.isAlive()) {
         if (var2 <= 0L) {
            this.mDrawFrameTickCount.set((long)var1);
            this.mGLRenderHandler.removeMessages(10);
            this.mGLRenderHandler.sendEmptyMessage(10);
         } else if (var2 < (long)var1) {
            this.mDrawFrameTickCount.set((long)var1);
         }
      } else if (var2 < (long)var1) {
         this.mDrawFrameTickCount.set((long)var1);
      }

   }

   public boolean isRenderPause() {
      return this.mIsRendPause;
   }

   public void setRenderFps(float var1) {
      if (this.mTargetRenderFPS != var1 && var1 > 0.0F) {
         this.mTargetFrameDurationMillis = (int)(1.0F / var1 * 1000.0F);
         this.mTargetRenderFPS = var1;
      }

   }

   public void sendToRenderEvent(Runnable var1) {
      if (this.mGLRenderHandler != null && this.mGLRenderThread != null && this.mGLRenderThread.isAlive()) {
         this.mGLRenderHandler.post(var1);
      }

   }

   public void renderPause() {
      if (this.mGLRenderHandler != null && this.mGLRenderThread != null && this.mGLRenderThread.isAlive()) {
         this.mGLRenderHandler.removeMessages(10);
      }

      this.mIsRendPause = true;
   }

   public void renderResume() {
      if (this.mGLRenderHandler != null && this.mGLRenderThread != null && this.mGLRenderThread.isAlive()) {
         this.mGLRenderHandler.removeMessages(10);
      }

      this.mIsRendPause = false;
      this.mDrawFrameTickCount.set(-1L);
      this.resetTickCount(30);
   }

   public void onAttachedToWindow() {
      if (this.mGLRenderThread == null) {
         this.mGLRenderThread = new HandlerThread(" AMapGlRenderThread");
         this.mGLRenderThread.start();
         this.mGLRenderHandler = new GLMapRender$1(this, this.mGLRenderThread.getLooper());
      }

   }

   public void onDetachedFromWindow() {
      if (this.mGLRenderThread != null) {
         this.mGLRenderThread.quit();
         this.mGLRenderThread = null;
         this.mGLRenderHandler = null;
      }

   }

   private void drawSingleFrame(GL10 var1) {
      try {
         this.mGLMapView.drawFrame(var1);
      } catch (Throwable var3) {
         var3.printStackTrace();
      }

   }

   public void onDrawFrame(GL10 var1) {
      if (this.mGLMapView != null) {
         try {
            this.mLastFrameTime = System.currentTimeMillis();
            this.drawSingleFrame(var1);
            long var2 = System.currentTimeMillis();
            long var4 = var2 - this.mLastFrameTime;
            this.mLastFrameTime = var2;
            long var6 = this.mDrawFrameTickCount.get();
            if (this.mGLMapView.getRenderMode() == 0 && this.mGLRenderHandler != null && this.mGLRenderThread != null && this.mGLRenderThread.isAlive()) {
               this.mDrawFrameTickCount.set(--var6);
               long var8 = 0L;
               if (var6 <= 0L) {
                  byte var10 = -5;
                  byte var11 = -7;
                  byte var12 = -9;
                  if (var6 > (long)var10) {
                     var8 = 60L;
                  } else if (var6 > (long)var11) {
                     var8 = 100L;
                  } else if (var6 > (long)var12) {
                     var8 = 250L;
                  } else {
                     if (this.mIsTrafficMode) {
                        var8 = 10000L;
                     } else {
                        var8 = 500L;
                     }

                     this.mDrawFrameTickCount.set(-9L);
                  }
               } else {
                  var8 = Math.max(16L, (long)this.mTargetFrameDurationMillis - var4);
               }

               if (var8 > 0L && this.mGLRenderHandler != null) {
                  this.mGLRenderHandler.removeMessages(10);
                  this.mGLRenderHandler.sendEmptyMessageDelayed(10, var8);
               }
            }
         } catch (Throwable var13) {
            ht.c(var13, "GLMapRender", "onDrawFrame");
         }

      }
   }

   public void onSurfaceChanged(GL10 var1, int var2, int var3) {
      if (this.mSurfacedestoryed) {
         this.onSurfaceCreated(var1, (EGLConfig)null);
      }

      this.mGLMapView.changeSurface(var1, var2, var3);
      this.resetTickCount(30);
   }

   public void onSurfaceCreated(GL10 var1, EGLConfig var2) {
      this.mIsRendPause = false;
      this.mSurfacedestoryed = false;
      this.mGLMapView.createSurface(var1, var2);
   }

   public void onSurfaceDestory() {
      this.mIsRendPause = true;
      if (this.mGLRenderHandler != null && this.mGLRenderThread != null) {
         this.mGLRenderHandler.removeCallbacksAndMessages((Object)null);
      }

      this.mGLMapView.destroySurface(1);
      this.mSurfacedestoryed = true;
   }
}
