package com.amap.api.mapcore.util;

import android.graphics.Point;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.GestureDetector.OnDoubleTapListener;
import android.view.GestureDetector.OnGestureListener;
import com.autonavi.ae.gmap.gesture.EAMapPlatformGestureInfo;
import com.autonavi.amap.mapcore.message.AbstractGestureMapMessage;
import com.autonavi.amap.mapcore.message.ScaleGestureMapMessage;

class q$a implements OnDoubleTapListener, OnGestureListener {
   private int d;
   float a;
   private EAMapPlatformGestureInfo e;
   long b;

   private q$a(q var1) {
      this.c = var1;
      this.d = 0;
      this.a = 0.0F;
      this.e = new EAMapPlatformGestureInfo();
      this.b = 0L;
   }

   public boolean onDown(MotionEvent var1) {
      q.a(this.c, false);
      return true;
   }

   public boolean onFling(MotionEvent var1, MotionEvent var2, float var3, float var4) {
      if (this.c.d != null) {
         this.c.d.onFling(var3, var4);
      }

      try {
         if (!this.c.a.h().isScrollGesturesEnabled()) {
            return true;
         }
      } catch (Throwable var6) {
         ht.c(var6, "GLMapGestrureDetector", "onFling");
         var6.printStackTrace();
         return true;
      }

      if (q.a(this.c) <= 0 && q.b(this.c) <= 0 && q.c(this.c) == 0 && !q.d(this.c)) {
         this.e.mGestureState = 3;
         this.e.mGestureType = 3;
         this.e.mLocation = new float[]{var2.getX(), var2.getY()};
         int var5 = this.c.a.a(this.e);
         this.c.a.onFling();
         this.c.a.a().startMapSlidAnim(var5, new Point((int)var2.getX(), (int)var2.getY()), var3, var4);
      }

      return true;
   }

   public void onLongPress(MotionEvent var1) {
      if (q.e(this.c) == 1) {
         this.e.mGestureState = 3;
         this.e.mGestureType = 7;
         this.e.mLocation = new float[]{var1.getX(), var1.getY()};
         int var2 = this.c.a.a(this.e);
         this.c.a.a(var2, var1);
         if (this.c.d != null) {
            this.c.d.onLongPress(var1.getX(), var1.getY());
         }
      }

   }

   public boolean onScroll(MotionEvent var1, MotionEvent var2, float var3, float var4) {
      if (this.c.d != null) {
         this.c.d.onScroll(var3, var4);
      }

      return false;
   }

   public void onShowPress(MotionEvent var1) {
      try {
         this.e.mGestureState = 3;
         this.e.mGestureType = 7;
         this.e.mLocation = new float[]{var1.getX(), var1.getY()};
         int var2 = this.c.a.a(this.e);
         this.c.a.a().clearAnimations(var2, false);
      } catch (Throwable var3) {
         var3.printStackTrace();
      }

   }

   public boolean onSingleTapUp(MotionEvent var1) {
      return false;
   }

   public boolean onDoubleTap(MotionEvent var1) {
      this.c.c.setIsLongpressEnabled(false);
      this.d = var1.getPointerCount();
      if (this.c.d != null) {
         this.c.d.onDoubleTap(var1.getX(), var1.getY());
      }

      return false;
   }

   public boolean onDoubleTapEvent(MotionEvent var1) {
      boolean var2 = false;
      if (this.d < var1.getPointerCount()) {
         this.d = var1.getPointerCount();
      }

      int var3 = var1.getAction() & 255;
      if (this.d == 1) {
         try {
            if (!this.c.a.h().isZoomGesturesEnabled()) {
               return var2;
            }
         } catch (Throwable var8) {
            ht.c(var8, "GLMapGestrureDetector", "onDoubleTapEvent");
            var8.printStackTrace();
         }

         int var4;
         if (var3 == 0) {
            this.e.mGestureState = 1;
            this.e.mGestureType = 9;
            this.e.mLocation = new float[]{var1.getX(), var1.getY()};
            var4 = this.c.a.a(this.e);
            this.a = var1.getY();
            this.c.a.a(var4, (AbstractGestureMapMessage)ScaleGestureMapMessage.obtain(100, 1.0F, 0, 0));
            var2 = true;
            this.b = SystemClock.uptimeMillis();
         } else if (var3 == 2) {
            var2 = true;
            q.a(this.c, true);
            float var9 = this.a - var1.getY();
            byte var5 = 20;
            if (Math.abs(var9) >= (float)var5) {
               this.e.mGestureState = 2;
               this.e.mGestureType = 9;
               this.e.mLocation = new float[]{var1.getX(), var1.getY()};
               int var6 = this.c.a.a(this.e);
               float var7 = 4.0F * var9 / (float)this.c.a.getMapHeight();
               if (var9 > 0.0F) {
                  this.c.a.a(var6, (AbstractGestureMapMessage)ScaleGestureMapMessage.obtain(101, var7, 0, 0));
               } else {
                  this.c.a.a(var6, (AbstractGestureMapMessage)ScaleGestureMapMessage.obtain(101, var7, 0, 0));
               }

               this.a = var1.getY();
            }
         } else {
            this.e.mGestureState = 3;
            this.e.mGestureType = 9;
            this.e.mLocation = new float[]{var1.getX(), var1.getY()};
            var4 = this.c.a.a(this.e);
            var2 = true;
            this.c.c.setIsLongpressEnabled(true);
            this.c.a.a(var4, (AbstractGestureMapMessage)ScaleGestureMapMessage.obtain(102, 1.0F, 0, 0));
            if (var3 == 1) {
               this.c.a.a(var4, 3);
               long var10 = SystemClock.uptimeMillis() - this.b;
               short var11 = 200;
               if (!q.f(this.c) || var10 < (long)var11) {
                  return this.c.a.b(var4, var1);
               }

               q.a(this.c, false);
            } else {
               q.a(this.c, false);
            }
         }
      }

      return var2;
   }

   public boolean onSingleTapConfirmed(MotionEvent var1) {
      if (q.e(this.c) == 1) {
         this.e.mGestureState = 3;
         this.e.mGestureType = 8;
         this.e.mLocation = new float[]{var1.getX(), var1.getY()};
         int var2 = this.c.a.a(this.e);
         if (this.c.d != null) {
            try {
               this.c.d.onSingleTap(var1.getX(), var1.getY());
            } catch (Throwable var4) {
               var4.printStackTrace();
            }
         }

         return this.c.a.c(var2, var1);
      } else {
         return false;
      }
   }
}
