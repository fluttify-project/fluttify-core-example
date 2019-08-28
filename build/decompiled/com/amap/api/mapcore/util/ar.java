package com.amap.api.mapcore.util;

import android.content.Context;
import android.graphics.PointF;
import android.view.MotionEvent;

public class ar extends ap {
   private static final PointF l = new PointF();
   private final ar$a m;
   private boolean n;
   private PointF o;
   private PointF p;
   private PointF q = new PointF();
   private PointF r = new PointF();

   public ar(Context var1, ar$a var2) {
      super(var1);
      this.m = var2;
   }

   protected void a(int var1, MotionEvent var2, int var3, int var4) {
      switch(var1) {
      case 2:
         if (this.n) {
            this.n = this.b(var2, var3, var4);
            if (!this.n) {
               this.f = this.m.b(this);
            }
         }
      case 3:
      case 4:
      default:
         break;
      case 5:
         this.a();
         this.g = MotionEvent.obtain(var2);
         this.k = 0L;
         this.a(var2);
         this.n = this.b(var2, var3, var4);
         if (!this.n) {
            this.f = this.m.b(this);
         }
         break;
      case 6:
         if (!this.n) {
            ;
         }
      }

   }

   protected void a(int var1, MotionEvent var2) {
      switch(var1) {
      case 2:
         this.a(var2);
         if (this.i / this.j > 0.67F) {
            boolean var3 = this.m.a(this);
            if (var3) {
               this.g.recycle();
               this.g = MotionEvent.obtain(var2);
            }
         }
         break;
      case 3:
         if (!this.n) {
            this.m.c(this);
         }

         this.a();
      case 4:
      case 5:
      default:
         break;
      case 6:
         this.a(var2);
         if (!this.n) {
            this.m.c(this);
         }

         this.a();
      }

   }

   protected void a() {
      super.a();
      this.n = false;
   }

   protected void a(MotionEvent var1) {
      super.a(var1);
      MotionEvent var2 = this.g;
      this.o = b(var1);
      this.p = b(var2);
      boolean var3 = this.g.getPointerCount() != var1.getPointerCount();
      this.r = var3 ? l : new PointF(this.o.x - this.p.x, this.o.y - this.p.y);
      this.q.x += this.r.x;
      this.q.y += this.r.y;
   }

   public PointF d() {
      return this.r;
   }
}
