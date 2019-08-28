package com.amap.api.mapcore.util;

import android.content.Context;
import android.graphics.PointF;
import android.view.MotionEvent;

public class av extends ap {
   private final av$a l;
   private boolean m;
   private static final PointF n = new PointF();
   private PointF o;
   private PointF p;
   private PointF q = new PointF();
   private PointF r = new PointF();

   public av(Context var1, av$a var2) {
      super(var1);
      this.l = var2;
   }

   protected void a(int var1, MotionEvent var2, int var3, int var4) {
      switch(var1) {
      case 5:
         this.a();
         this.g = MotionEvent.obtain(var2);
         this.k = 0L;
         this.a(var2);
         this.m = this.b(var2, var3, var4);
         if (!this.m) {
            this.f = this.l.b(this);
         }
      default:
      }
   }

   protected void a(int var1, MotionEvent var2) {
      switch(var1) {
      case 3:
         this.a();
         break;
      case 6:
         this.a(var2);
         if (!this.m) {
            this.l.a(this);
         }

         this.a();
      }

   }

   protected void a() {
      super.a();
      this.m = false;
      this.q.x = 0.0F;
      this.r.x = 0.0F;
      this.q.y = 0.0F;
      this.r.y = 0.0F;
   }

   protected void a(MotionEvent var1) {
      super.a(var1);
      MotionEvent var2 = this.g;
      this.o = b(var1);
      this.p = b(var2);
      boolean var3 = this.g.getPointerCount() != var1.getPointerCount();
      this.r = var3 ? n : new PointF(this.o.x - this.p.x, this.o.y - this.p.y);
      this.q.x += this.r.x;
      this.q.y += this.r.y;
   }

   public float d() {
      return this.q.x;
   }

   public float e() {
      return this.q.y;
   }
}
