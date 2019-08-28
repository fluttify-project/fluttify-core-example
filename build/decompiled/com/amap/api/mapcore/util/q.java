package com.amap.api.mapcore.util;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.GestureDetector;
import android.view.MotionEvent;
import com.amap.api.maps.model.AMapGestureListener;

public class q {
   u a;
   Context b;
   GestureDetector c;
   private au e;
   private as f;
   private ar g;
   private av h;
   private boolean i = false;
   private int j = 0;
   private int k = 0;
   private int l = 0;
   private int m = 0;
   private int n = 0;
   private boolean o = false;
   private boolean p = false;
   private boolean q = true;
   public AMapGestureListener d;
   private Handler r = new Handler(Looper.getMainLooper());

   public void a(AMapGestureListener var1) {
      this.d = var1;
   }

   public void a() {
      this.j = 0;
      this.l = 0;
      this.k = 0;
      this.m = 0;
      this.n = 0;
   }

   public q(u var1) {
      this.b = var1.v();
      this.a = var1;
      q$a var2 = new q$a(this, (q$1)null);
      this.c = new GestureDetector(this.b, var2, this.r);
      this.c.setOnDoubleTapListener(var2);
      this.e = new au(this.b, new q$d(this, (q$1)null));
      this.f = new as(this.b, new q$c(this, (q$1)null));
      this.g = new ar(this.b, new q$b(this, (q$1)null));
      this.h = new av(this.b, new q$e(this, (q$1)null));
   }

   public boolean a(MotionEvent var1) {
      boolean var2 = false;
      if (this.n < var1.getPointerCount()) {
         this.n = var1.getPointerCount();
      }

      if ((var1.getAction() & 255) == 0) {
         this.p = false;
         this.q = false;
      }

      if (var1.getAction() == 6 && var1.getPointerCount() > 0) {
         this.p = true;
      }

      byte var3 = 2;
      if (this.o && this.n >= var3) {
         this.o = false;
      }

      try {
         int[] var4 = new int[]{0, 0};
         if (this.a != null && this.a.m() != null) {
            this.a.m().getLocationOnScreen(var4);
         }

         if (this.d != null) {
            if (var1.getAction() == 0) {
               this.d.onDown(var1.getX(), var1.getY());
            } else if (var1.getAction() == 1) {
               this.d.onUp(var1.getX(), var1.getY());
            }
         }

         this.c.onTouchEvent(var1);
         var2 = this.g.c(var1, var4[0], var4[1]);
         if (!this.i || this.m <= 0) {
            this.h.c(var1, var4[0], var4[1]);
            if (!this.o) {
               this.e.a(var1);
               var2 = this.f.c(var1, var4[0], var4[1]);
            }
         }

         return var2;
      } catch (Throwable var5) {
         var5.printStackTrace();
         return false;
      }
   }

   public void b() {
      if (this.r != null) {
         this.r.removeCallbacks((Runnable)null);
         this.r = null;
      }

   }
}
