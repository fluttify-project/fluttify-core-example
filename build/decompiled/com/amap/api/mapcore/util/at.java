package com.amap.api.mapcore.util;

import android.content.Context;
import android.os.Build.VERSION;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.ViewConfiguration;

public class at {
   private final Context a;
   private final at$a b;
   private boolean c;
   private MotionEvent d;
   private MotionEvent e;
   private float f;
   private float g;
   private float h;
   private float i;
   private float j;
   private float k;
   private float l;
   private float m;
   private float n;
   private float o;
   private float p;
   private long q;
   private final float r;
   private float s;
   private float t;
   private boolean u;
   private boolean v;
   private int w;
   private int x;
   private boolean y;

   public MotionEvent a() {
      return this.e;
   }

   public at(Context var1, at$a var2) {
      ViewConfiguration var3 = ViewConfiguration.get(var1);
      this.a = var1;
      this.b = var2;
      this.r = (float)var3.getScaledEdgeSlop();
   }

   public boolean a(MotionEvent var1) {
      int var2 = var1.getAction() & 255;
      if (var2 == 0) {
         this.l();
      }

      boolean var3 = true;
      if (this.v) {
         var3 = false;
      } else {
         int var4;
         int var5;
         int var6;
         int var7;
         if (!this.c) {
            int var8;
            float var9;
            float var10;
            float var11;
            float var12;
            boolean var14;
            switch(var2) {
            case 0:
               this.w = var1.getPointerId(0);
               this.y = true;
               break;
            case 1:
               this.l();
               break;
            case 2:
               if (this.u) {
                  float var17 = this.r;
                  float var21 = this.s;
                  float var19 = this.t;
                  var7 = var1.findPointerIndex(this.w);
                  var8 = var1.findPointerIndex(this.x);
                  var9 = a(var1, var7);
                  var10 = b(var1, var7);
                  var11 = a(var1, var8);
                  var12 = b(var1, var8);
                  boolean var26 = var9 < var17 || var10 < var17 || var9 > var21 || var10 > var19;
                  var14 = var11 < var17 || var12 < var17 || var11 > var21 || var12 > var19;
                  int var27;
                  if (var26) {
                     var27 = this.a(var1, this.x, var7);
                     if (var27 >= 0) {
                        var7 = var27;
                        this.w = var1.getPointerId(var27);
                        a(var1, var27);
                        b(var1, var27);
                        var26 = false;
                     }
                  }

                  if (var14) {
                     var27 = this.a(var1, this.w, var8);
                     if (var27 >= 0) {
                        var8 = var27;
                        this.x = var1.getPointerId(var27);
                        a(var1, var27);
                        b(var1, var27);
                        var14 = false;
                     }
                  }

                  if (var26 && var14) {
                     this.f = -1.0F;
                     this.g = -1.0F;
                  } else if (var26) {
                     this.f = var1.getX(var8);
                     this.g = var1.getY(var8);
                  } else if (var14) {
                     this.f = var1.getX(var7);
                     this.g = var1.getY(var7);
                  } else {
                     this.u = false;
                     this.c = this.b.b(this);
                  }
               }
            case 3:
            case 4:
            default:
               break;
            case 5:
               DisplayMetrics var16 = this.a.getResources().getDisplayMetrics();
               this.s = (float)var16.widthPixels - this.r;
               this.t = (float)var16.heightPixels - this.r;
               if (this.d != null) {
                  this.d.recycle();
               }

               this.d = MotionEvent.obtain(var1);
               this.q = 0L;
               var5 = 0;
               var6 = 0;
               if (VERSION.SDK_INT >= 8) {
                  var6 = var1.getActionIndex();
                  var5 = var1.findPointerIndex(this.w);
                  this.x = var1.getPointerId(var6);
                  if (var5 < 0 || var5 == var6) {
                     var5 = this.a(var1, var5 == var6 ? -1 : this.x, var5);
                     this.w = var1.getPointerId(var5);
                  }
               } else if (var1.getPointerCount() > 0) {
                  var6 = var1.findPointerIndex(1);
                  var5 = var1.findPointerIndex(this.w);
                  this.x = var1.getPointerId(var6);
               }

               this.y = false;
               this.b(var1);
               float var20 = this.r;
               float var22 = this.s;
               var9 = this.t;
               var10 = a(var1, var5);
               var11 = b(var1, var5);
               var12 = a(var1, var6);
               float var13 = b(var1, var6);
               var14 = var10 < var20 || var11 < var20 || var10 > var22 || var11 > var9;
               boolean var15 = var12 < var20 || var13 < var20 || var12 > var22 || var13 > var9;
               if (var14 && var15) {
                  this.f = -1.0F;
                  this.g = -1.0F;
                  this.u = true;
               } else if (var14) {
                  this.f = var1.getX(var6);
                  this.g = var1.getY(var6);
                  this.u = true;
               } else if (var15) {
                  this.f = var1.getX(var5);
                  this.g = var1.getY(var5);
                  this.u = true;
               } else {
                  this.u = false;
                  this.c = this.b.b(this);
               }
               break;
            case 6:
               if (this.u) {
                  var4 = var1.getPointerCount();
                  var5 = 0;
                  if (VERSION.SDK_INT >= 8) {
                     var5 = var1.getActionIndex();
                  }

                  var7 = var1.getPointerId(var5);
                  if (var4 > 2) {
                     if (var7 == this.w) {
                        var8 = this.a(var1, this.x, var5);
                        if (var8 >= 0) {
                           this.w = var1.getPointerId(var8);
                        }
                     } else if (var7 == this.x) {
                        var8 = this.a(var1, this.w, var5);
                        if (var8 >= 0) {
                           this.x = var1.getPointerId(var8);
                        }
                     }
                  } else {
                     var8 = var1.findPointerIndex(var7 == this.w ? this.x : this.w);
                     if (var8 < 0) {
                        this.v = true;
                        if (this.c) {
                           this.b.c(this);
                        }

                        return false;
                     }

                     this.w = var1.getPointerId(var8);
                     this.y = true;
                     this.x = -1;
                     this.f = var1.getX(var8);
                     this.g = var1.getY(var8);
                  }
               }
            }
         } else {
            switch(var2) {
            case 1:
               this.l();
               break;
            case 2:
               this.b(var1);
               if (this.o / this.p > 0.67F) {
                  boolean var18 = this.b.a(this);
                  if (var18) {
                     this.d.recycle();
                     this.d = MotionEvent.obtain(var1);
                  }
               }
               break;
            case 3:
               this.b.c(this);
               this.l();
            case 4:
            default:
               break;
            case 5:
               this.b.c(this);
               var4 = this.w;
               var5 = this.x;
               this.l();
               this.d = MotionEvent.obtain(var1);
               this.w = this.y ? var4 : var5;
               if (VERSION.SDK_INT >= 8) {
                  this.x = var1.getPointerId(var1.getActionIndex());
               } else {
                  this.x = var1.getPointerId(1);
               }

               this.y = false;
               var6 = var1.findPointerIndex(this.w);
               if (var6 < 0 || this.w == this.x) {
                  var6 = this.a(var1, this.w == this.x ? -1 : this.x, var6);
                  this.w = var1.getPointerId(var6);
               }

               this.b(var1);
               this.c = this.b.b(this);
               break;
            case 6:
               var4 = var1.getPointerCount();
               var5 = 0;
               if (VERSION.SDK_INT >= 8) {
                  var5 = var1.getActionIndex();
               }

               var7 = var1.getPointerId(var5);
               boolean var24 = false;
               int var23;
               if (var4 > 2) {
                  if (var7 == this.w) {
                     var23 = this.a(var1, this.x, var5);
                     if (var23 >= 0) {
                        this.b.c(this);
                        this.w = var1.getPointerId(var23);
                        this.y = true;
                        this.d = MotionEvent.obtain(var1);
                        this.b(var1);
                        this.c = this.b.b(this);
                     } else {
                        var24 = true;
                     }
                  } else if (var7 == this.x) {
                     var23 = this.a(var1, this.w, var5);
                     if (var23 >= 0) {
                        this.b.c(this);
                        this.x = var1.getPointerId(var23);
                        this.y = false;
                        this.d = MotionEvent.obtain(var1);
                        this.b(var1);
                        this.c = this.b.b(this);
                     } else {
                        var24 = true;
                     }
                  }

                  this.d.recycle();
                  this.d = MotionEvent.obtain(var1);
                  this.b(var1);
               } else {
                  var24 = true;
               }

               if (var24) {
                  this.b(var1);
                  var23 = var7 == this.w ? this.x : this.w;
                  int var25 = var1.findPointerIndex(var23);
                  this.f = var1.getX(var25);
                  this.g = var1.getY(var25);
                  this.b.c(this);
                  this.l();
                  this.w = var23;
                  this.y = true;
               }
            }
         }
      }

      return var3;
   }

   private int a(MotionEvent var1, int var2, int var3) {
      int var4 = var1.getPointerCount();
      int var5 = var1.findPointerIndex(var2);
      int var6 = -1;

      for(int var7 = 0; var7 < var4; ++var7) {
         if (var7 != var3 && var7 != var5) {
            float var8 = this.r;
            float var9 = this.s;
            float var10 = this.t;
            float var11 = a(var1, var7);
            float var12 = b(var1, var7);
            if (var11 >= var8 && var12 >= var8 && var11 <= var9 && var12 <= var10) {
               var6 = var7;
               break;
            }
         }
      }

      return var6;
   }

   private static float a(MotionEvent var0, int var1) {
      if (var1 < 0) {
         return Float.MIN_VALUE;
      } else if (var1 == 0) {
         return var0.getRawX();
      } else {
         float var2 = var0.getRawX() - var0.getX();
         return var0.getX(var1) + var2;
      }
   }

   private static float b(MotionEvent var0, int var1) {
      if (var1 < 0) {
         return Float.MIN_VALUE;
      } else if (var1 == 0) {
         return var0.getRawY();
      } else {
         float var2 = var0.getRawY() - var0.getY();
         return var0.getY(var1) + var2;
      }
   }

   private void b(MotionEvent var1) {
      if (this.e != null) {
         this.e.recycle();
      }

      this.e = MotionEvent.obtain(var1);
      this.l = -1.0F;
      this.m = -1.0F;
      this.n = -1.0F;
      MotionEvent var2 = this.d;
      int var3 = var2.findPointerIndex(this.w);
      int var4 = var2.findPointerIndex(this.x);
      int var5 = var1.findPointerIndex(this.w);
      int var6 = var1.findPointerIndex(this.x);
      if (var3 >= 0 && var4 >= 0 && var5 >= 0 && var6 >= 0) {
         float var7 = var2.getX(var3);
         float var8 = var2.getY(var3);
         float var9 = var2.getX(var4);
         float var10 = var2.getY(var4);
         float var11 = var1.getX(var5);
         float var12 = var1.getY(var5);
         float var13 = var1.getX(var6);
         float var14 = var1.getY(var6);
         float var15 = var9 - var7;
         float var16 = var10 - var8;
         float var17 = var13 - var11;
         float var18 = var14 - var12;
         this.h = var15;
         this.i = var16;
         this.j = var17;
         this.k = var18;
         this.f = var11 + var17 * 0.5F;
         this.g = var12 + var18 * 0.5F;
         this.q = var1.getEventTime() - var2.getEventTime();
         this.o = var1.getPressure(var5) + var1.getPressure(var6);
         this.p = var2.getPressure(var3) + var2.getPressure(var4);
      } else {
         this.v = true;
         if (this.c) {
            this.b.c(this);
         }

      }
   }

   private void l() {
      if (this.d != null) {
         this.d.recycle();
         this.d = null;
      }

      if (this.e != null) {
         this.e.recycle();
         this.e = null;
      }

      this.u = false;
      this.c = false;
      this.w = -1;
      this.x = -1;
      this.v = false;
   }

   public float b() {
      return this.f;
   }

   public float c() {
      return this.g;
   }

   public float d() {
      if (this.l == -1.0F) {
         float var1 = this.j;
         float var2 = this.k;
         this.l = (float)Math.sqrt((double)(var1 * var1 + var2 * var2));
      }

      return this.l;
   }

   public float e() {
      return this.j;
   }

   public float f() {
      return this.k;
   }

   public float g() {
      if (this.m == -1.0F) {
         float var1 = this.h;
         float var2 = this.i;
         this.m = (float)Math.sqrt((double)(var1 * var1 + var2 * var2));
      }

      return this.m;
   }

   public float h() {
      return this.h;
   }

   public float i() {
      return this.i;
   }

   public float j() {
      if (this.n == -1.0F) {
         this.n = this.d() / this.g();
      }

      return this.n;
   }

   public long k() {
      return this.q;
   }
}
