package com.amap.api.mapcore.util;

import android.content.Context;
import android.graphics.PointF;
import android.os.Build.VERSION;
import android.view.MotionEvent;

public abstract class aq {
   protected final Context e;
   protected boolean f;
   protected MotionEvent g;
   protected MotionEvent h;
   protected float i;
   protected float j;
   protected long k;

   public aq(Context var1) {
      this.e = var1;
   }

   public boolean c(MotionEvent var1, int var2, int var3) {
      int var4 = var1.getAction() & 255;
      if (!this.f) {
         this.a(var4, var1, var2, var3);
      } else {
         this.a(var4, var1);
      }

      return true;
   }

   protected abstract void a(int var1, MotionEvent var2, int var3, int var4);

   protected abstract void a(int var1, MotionEvent var2);

   protected void a(MotionEvent var1) {
      MotionEvent var2 = this.g;
      if (this.h != null) {
         this.h.recycle();
         this.h = null;
      }

      this.h = MotionEvent.obtain(var1);
      this.k = var1.getEventTime() - var2.getEventTime();
      byte var3 = 8;
      if (VERSION.SDK_INT >= var3) {
         this.i = var1.getPressure(var1.getActionIndex());
         this.j = var2.getPressure(var2.getActionIndex());
      } else {
         this.i = var1.getPressure(0);
         this.j = var2.getPressure(0);
      }

   }

   protected void a() {
      if (this.g != null) {
         this.g.recycle();
         this.g = null;
      }

      if (this.h != null) {
         this.h.recycle();
         this.h = null;
      }

      this.f = false;
   }

   public long b() {
      return this.k;
   }

   public static PointF b(MotionEvent var0) {
      int var1 = var0.getPointerCount();
      float var2 = 0.0F;
      float var3 = 0.0F;

      for(int var4 = 0; var4 < var1; ++var4) {
         var2 += var0.getX(var4);
         var3 += var0.getY(var4);
      }

      return new PointF(var2 / (float)var1, var3 / (float)var1);
   }

   public MotionEvent c() {
      return this.h;
   }
}
