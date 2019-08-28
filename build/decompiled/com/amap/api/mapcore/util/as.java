package com.amap.api.mapcore.util;

import android.content.Context;
import android.graphics.PointF;
import android.view.MotionEvent;

public class as extends aq {
   private static final PointF a = new PointF();
   private final as$a b;
   private PointF c;
   private PointF d;
   private PointF l = new PointF();
   private PointF m = new PointF();

   public as(Context var1, as$a var2) {
      super(var1);
      this.b = var2;
   }

   protected void a(int var1, MotionEvent var2, int var3, int var4) {
      switch(var1) {
      case 0:
         this.a();
         this.g = MotionEvent.obtain(var2);
         this.k = 0L;
         this.a(var2);
         break;
      case 2:
         this.f = this.b.b(this);
         break;
      case 5:
         if (this.g != null) {
            this.g.recycle();
         }

         this.g = MotionEvent.obtain(var2);
         this.a(var2);
      }

   }

   protected void a(int var1, MotionEvent var2) {
      switch(var1) {
      case 1:
      case 3:
         this.b.c(this);
         this.a();
         break;
      case 2:
         this.a(var2);
         if (this.i / this.j > 0.67F) {
            if (var2.getPointerCount() > 1) {
               return;
            }

            boolean var3 = this.b.a(this);
            if (var3) {
               this.g.recycle();
               this.g = MotionEvent.obtain(var2);
            }
         }
      }

   }

   protected void a(MotionEvent var1) {
      super.a(var1);
      MotionEvent var2 = this.g;
      this.c = b(var1);
      this.d = b(var2);
      boolean var3 = this.g.getPointerCount() != var1.getPointerCount();
      this.m = var3 ? a : new PointF(this.c.x - this.d.x, this.c.y - this.d.y);
      if (var3) {
         this.g.recycle();
         this.g = MotionEvent.obtain(var1);
      }

      this.l.x += this.m.x;
      this.l.y += this.m.y;
   }

   public PointF d() {
      return this.m;
   }
}
