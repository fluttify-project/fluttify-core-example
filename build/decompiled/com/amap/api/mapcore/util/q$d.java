package com.amap.api.mapcore.util;

import android.graphics.Point;
import com.autonavi.ae.gmap.gesture.EAMapPlatformGestureInfo;
import com.autonavi.amap.mapcore.message.AbstractGestureMapMessage;
import com.autonavi.amap.mapcore.message.RotateGestureMapMessage;
import com.autonavi.amap.mapcore.message.ScaleGestureMapMessage;

class q$d extends au$a {
   private boolean b;
   private boolean c;
   private boolean d;
   private Point e;
   private float[] f;
   private float g;
   private float[] h;
   private float i;
   private EAMapPlatformGestureInfo j;

   private q$d(q var1) {
      this.a = var1;
      this.b = false;
      this.c = false;
      this.d = false;
      this.e = new Point();
      this.f = new float[10];
      this.g = 0.0F;
      this.h = new float[10];
      this.i = 0.0F;
      this.j = new EAMapPlatformGestureInfo();
   }

   public boolean a(au var1) {
      this.j.mGestureState = 2;
      this.j.mGestureType = 4;
      this.j.mLocation = new float[]{var1.a().getX(), var1.a().getY()};
      int var2 = this.a.a.a(this.j);
      boolean var3 = false;
      float var4 = var1.j();
      float var5 = (float)var1.k();
      boolean var6 = true;
      boolean var7 = true;
      int var17 = (int)var1.b();
      int var18 = (int)var1.c();
      float var8 = (float)Math.abs(var17 - this.e.x);
      float var9 = (float)Math.abs(var18 - this.e.y);
      this.e.x = var17;
      this.e.y = var18;
      float var10 = (float)Math.log((double)var4);
      float var11 = 0.2F;
      if (q.b(this.a) <= 0 && Math.abs(var10) > var11) {
         this.d = true;
      }

      float var14;
      try {
         if (this.a.a.h().isZoomGesturesEnabled()) {
            if (!this.b && 0.06F < Math.abs(var10)) {
               this.b = true;
            }

            if (this.b && 0.01F < Math.abs(var10)) {
               var3 = true;
               boolean var12 = (var8 > 2.0F || var9 > 2.0F) && Math.abs(var10) < 0.02F;
               if (!var12) {
                  float var13 = 0.0F;
                  if (var5 > var13) {
                     this.g = var10 / var5;
                     var14 = Math.abs(this.g);
                     this.f[q.b(this.a) % 10] = var14;
                     q.g(this.a);
                     this.a.a.a(var2, (AbstractGestureMapMessage)ScaleGestureMapMessage.obtain(101, var10, var17, var18));
                     if (var10 > 0.0F) {
                        this.a.a.a(var2, 1);
                     } else {
                        this.a.a.a(var2, 2);
                     }
                  }
               }
            }
         }
      } catch (Throwable var16) {
         ht.c(var16, "GLMapGestrureDetector", "onScaleRotate");
         var16.printStackTrace();
      }

      try {
         if (this.a.a.h().isRotateGesturesEnabled() && !this.a.a.e(var2) && !this.d) {
            float var19 = var1.l();
            if (!this.c && Math.abs(var19) >= 4.0F) {
               this.c = true;
            }

            if (this.c && 1.0F < Math.abs(var19)) {
               boolean var20 = (var8 > 4.0F || var9 > 4.0F) && Math.abs(var19) < 2.0F;
               if (!var20) {
                  this.i = var19 / var5;
                  var14 = Math.abs(this.i);
                  this.h[q.c(this.a) % 10] = var14;
                  q.h(this.a);
                  this.a.a.a(var2, (AbstractGestureMapMessage)RotateGestureMapMessage.obtain(101, var19, var17, var18));
                  var3 = true;
                  this.a.a.a(var2, 6);
               }
            }
         }
      } catch (Throwable var15) {
         ht.c(var15, "GLMapGestrureDetector", "onScaleRotate");
         var15.printStackTrace();
      }

      return var3;
   }

   public boolean b(au var1) {
      this.j.mGestureState = 1;
      this.j.mGestureType = 4;
      this.j.mLocation = new float[]{var1.a().getX(), var1.a().getY()};
      int var2 = this.a.a.a(this.j);
      int var3 = (int)var1.b();
      int var4 = (int)var1.c();
      this.d = false;
      this.e.x = var3;
      this.e.y = var4;
      this.b = false;
      this.c = false;
      this.a.a.a(var2, (AbstractGestureMapMessage)ScaleGestureMapMessage.obtain(100, 1.0F, var3, var4));

      try {
         if (this.a.a.h().isRotateGesturesEnabled() && !this.a.a.e(var2)) {
            this.a.a.a(var2, (AbstractGestureMapMessage)RotateGestureMapMessage.obtain(100, this.a.a.n(var2), var3, var4));
         }
      } catch (Throwable var6) {
         ht.c(var6, "GLMapGestrureDetector", "onScaleRotateBegin");
         var6.printStackTrace();
      }

      return true;
   }

   public void c(au var1) {
      this.j.mGestureState = 3;
      this.j.mGestureType = 4;
      this.j.mLocation = new float[]{var1.a().getX(), var1.a().getY()};
      int var2 = this.a.a.a(this.j);
      this.d = false;
      this.a.a.a(var2, (AbstractGestureMapMessage)ScaleGestureMapMessage.obtain(102, 1.0F, 0, 0));
      float var3 = -9999.0F;
      float var4 = -9999.0F;
      float var5;
      int var6;
      int var7;
      if (q.b(this.a) > 0) {
         var5 = 0.0F;
         var6 = q.b(this.a) > 10 ? 10 : q.b(this.a);

         for(var7 = 0; var7 < 10; ++var7) {
            var5 += this.f[var7];
            this.f[var7] = 0.0F;
         }

         var5 /= (float)var6;
         if (0.004F <= var5) {
            var5 *= 300.0F;
            float var10 = 1.5F;
            if (var5 >= var10) {
               var5 = 1.5F;
            }

            if (this.g < 0.0F) {
               var5 = -var5;
            }

            var3 = this.a.a.a(var2) + var5;
         }

         this.g = 0.0F;
      }

      if (!this.a.a.e(var2)) {
         try {
            if (this.a.a.h().isRotateGesturesEnabled()) {
               this.a.a.a(var2, (AbstractGestureMapMessage)RotateGestureMapMessage.obtain(102, this.a.a.n(var2), 0, 0));
            }
         } catch (Throwable var9) {
            ht.c(var9, "GLMapGestrureDetector", "onScaleRotateEnd");
            var9.printStackTrace();
         }

         if (q.c(this.a) > 0) {
            this.a.a.a(var2, 6);
            var5 = 0.0F;
            var6 = q.c(this.a) > 10 ? 10 : q.c(this.a);

            for(var7 = 0; var7 < 10; ++var7) {
               var5 += this.h[var7];
               this.h[var7] = 0.0F;
            }

            var5 /= (float)var6;
            if (0.1F <= var5) {
               var5 *= 200.0F;
               var7 = (int)this.a.a.n(var2);
               var7 %= 360;
               float var8 = 60.0F;
               if (var5 >= var8) {
                  var5 = var8;
               }

               if (this.i < 0.0F) {
                  var5 = -var5;
               }

               var7 = (int)((float)var7 + var5);
               var7 %= 360;
               var4 = (float)var7;
            }
         }

         this.g = 0.0F;
      }

      boolean var11 = var3 != -9999.0F || var4 != -9999.0F;
      if (var11) {
         this.a.a.a().startPivotZoomRotateAnim(var2, this.e, var3, (int)var4, 500);
      }

   }
}
