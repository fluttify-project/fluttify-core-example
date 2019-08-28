package com.amap.api.mapcore.util;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.ViewConfiguration;

public abstract class ap extends aq {
   private final float l;
   private float m;
   private float n;
   protected float a;
   protected float b;
   protected float c;
   protected float d;
   private float o;
   private float p;
   private float q = 0.0F;
   private float r = 0.0F;
   private float s = 0.0F;
   private float t = 0.0F;

   public ap(Context var1) {
      super(var1);
      ViewConfiguration var2 = ViewConfiguration.get(var1);
      this.l = (float)var2.getScaledEdgeSlop();
   }

   protected void a(MotionEvent var1) {
      super.a(var1);
      MotionEvent var2 = this.g;
      int var3 = this.g.getPointerCount();
      int var4 = var1.getPointerCount();
      if (var4 == 2 && var4 == var3) {
         this.o = -1.0F;
         this.p = -1.0F;
         float var5 = var2.getX(0);
         float var6 = var2.getY(0);
         float var7 = var2.getX(1);
         float var8 = var2.getY(1);
         float var9 = var7 - var5;
         float var10 = var8 - var6;
         this.a = var9;
         this.b = var10;
         float var11 = var1.getX(0);
         float var12 = var1.getY(0);
         float var13 = var1.getX(1);
         float var14 = var1.getY(1);
         float var15 = var13 - var11;
         float var16 = var14 - var12;
         this.c = var15;
         this.d = var16;
         this.q = var11 - var5;
         this.r = var12 - var6;
         this.s = var13 - var7;
         this.t = var14 - var8;
      }
   }

   public PointF a(int var1) {
      return var1 == 0 ? new PointF(this.q, this.r) : new PointF(this.s, this.t);
   }

   protected static float a(MotionEvent var0, int var1) {
      float var2 = var0.getX() - var0.getRawX();
      return var1 < var0.getPointerCount() ? var0.getX(var1) + var2 : 0.0F;
   }

   protected static float a(MotionEvent var0, int var1, int var2) {
      float var3 = (float)var2 + var0.getY() - var0.getRawY();
      return var1 < var0.getPointerCount() ? var0.getY(var1) + var3 : 0.0F;
   }

   protected boolean b(MotionEvent var1, int var2, int var3) {
      DisplayMetrics var4 = this.e.getResources().getDisplayMetrics();
      this.m = (float)var4.widthPixels - this.l;
      this.n = (float)var4.heightPixels - this.l;
      float var5 = this.l;
      float var6 = this.m;
      float var7 = this.n;
      float var8 = var1.getRawX();
      float var9 = var1.getRawY();
      float var10 = a(var1, 1);
      float var11 = a(var1, 1, var3);
      boolean var12 = var8 < var5 || var9 < var5 || var8 > var6 || var9 > var7;
      boolean var13 = var10 < var5 || var11 < var5 || var10 > var6 || var11 > var7;
      if (var12 && var13) {
         return true;
      } else if (var12) {
         return true;
      } else {
         return var13;
      }
   }
}
