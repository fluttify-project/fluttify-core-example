package com.amap.api.maps;

import android.animation.ValueAnimator;
import android.animation.Animator.AnimatorListener;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.View.OnTouchListener;
import android.view.ViewGroup.LayoutParams;

public class SwipeDismissTouchListener implements OnTouchListener {
   public static final int MIN_VIEW_WIDTH = 2;
   public static final int A_HALF = 2;
   public static final int ONE_THIRD = 3;
   private int a;
   private int b;
   private int c;
   private long d;
   private View e;
   private SwipeDismissTouchListener$DismissCallbacks f;
   private int g = 1;
   private float h;
   private float i;
   private boolean j;
   private int k;
   private Object l;
   private VelocityTracker m;
   private float n;
   private boolean o;
   private boolean p;

   public SwipeDismissTouchListener(View var1, Object var2, SwipeDismissTouchListener$DismissCallbacks var3) {
      ViewConfiguration var4 = ViewConfiguration.get(var1.getContext());
      this.a = var4.getScaledTouchSlop();
      this.b = var4.getScaledMinimumFlingVelocity() * 16;
      this.c = var4.getScaledMaximumFlingVelocity();
      this.d = (long)var1.getContext().getResources().getInteger(17694720);
      this.e = var1;
      this.l = var2;
      this.f = var3;
   }

   public boolean onTouch(View var1, MotionEvent var2) {
      var2.offsetLocation(this.n, 0.0F);
      if (this.g < 2) {
         this.g = this.e.getWidth();
      }

      float var3;
      float var4;
      switch(var2.getActionMasked()) {
      case 0:
         this.h = var2.getRawX();
         this.i = var2.getRawY();
         if (this.f.canDismiss(this.l)) {
            this.o = false;
            this.m = VelocityTracker.obtain();
            this.m.addMovement(var2);
         }

         return true;
      case 1:
         if (this.m != null) {
            var3 = var2.getRawX() - this.h;
            this.m.addMovement(var2);
            this.m.computeCurrentVelocity(1000);
            var4 = this.m.getXVelocity();
            float var9 = Math.abs(var4);
            float var6 = Math.abs(this.m.getYVelocity());
            boolean var7 = false;
            boolean var8 = false;
            if (Math.abs(var3) > (float)(this.g / 2) && this.j) {
               var7 = true;
               var8 = var3 > 0.0F;
            } else if ((float)this.b <= var9 && var9 <= (float)this.c && var6 < var9 && this.j) {
               var7 = var4 < 0.0F == var3 < 0.0F;
               var8 = this.m.getXVelocity() > 0.0F;
            }

            if (var7) {
               this.e.animate().translationX(var8 ? (float)this.g : (float)(-this.g)).alpha(0.0F).setDuration(50L).setListener(new SwipeDismissTouchListener$1(this));
            } else if (this.j) {
               this.e.animate().translationX(0.0F).alpha(1.0F).setDuration(this.d).setListener((AnimatorListener)null);
            }

            this.m.recycle();
            this.m = null;
            this.n = 0.0F;
            this.h = 0.0F;
            this.i = 0.0F;
            this.j = false;
         }
         break;
      case 2:
         if (this.m != null) {
            this.m.addMovement(var2);
            var3 = var2.getRawX() - this.h;
            var4 = var2.getRawY() - this.i;
            if (Math.abs(var3) > (float)this.a && Math.abs(var4) < Math.abs(var3) / 2.0F) {
               this.j = true;
               this.k = var3 > 0.0F ? this.a : -this.a;
               this.e.getParent().requestDisallowInterceptTouchEvent(true);
               if (!this.o) {
                  this.o = true;
                  this.f.onNotifySwipe();
               }

               if (Math.abs(var3) > (float)(this.g / 3)) {
                  if (!this.p) {
                     this.p = true;
                     this.f.onNotifySwipe();
                  }
               } else {
                  this.p = false;
               }

               MotionEvent var5 = MotionEvent.obtain(var2);
               var5.setAction(3 | var2.getActionIndex() << 8);
               this.e.onTouchEvent(var5);
               var5.recycle();
            }

            if (this.j) {
               this.n = var3;
               this.e.setTranslationX(var3 - (float)this.k);
               this.e.setAlpha(Math.max(0.0F, Math.min(1.0F, 1.0F - 2.0F * Math.abs(var3) / (float)this.g)));
               return true;
            }
         }
         break;
      case 3:
         if (this.m != null) {
            this.e.animate().translationX(0.0F).alpha(1.0F).setDuration(this.d).setListener((AnimatorListener)null);
            this.m.recycle();
            this.m = null;
            this.n = 0.0F;
            this.h = 0.0F;
            this.i = 0.0F;
            this.j = false;
         }
      }

      return false;
   }

   private void a() {
      this.f.onDismiss(this.e, this.l);
      LayoutParams var1 = this.e.getLayoutParams();
      int var2 = this.e.getHeight();
      ValueAnimator var3 = ValueAnimator.ofInt(new int[]{var2, 1}).setDuration(this.d);
      var3.addListener(new SwipeDismissTouchListener$2(this, var1, var2));
      var3.addUpdateListener(new SwipeDismissTouchListener$3(this, var1));
      var3.start();
   }
}
