package com.amap.api.mapcore.util;

import android.graphics.PointF;
import com.autonavi.ae.gmap.gesture.EAMapPlatformGestureInfo;
import com.autonavi.amap.mapcore.message.AbstractGestureMapMessage;
import com.autonavi.amap.mapcore.message.HoverGestureMapMessage;

class q$b implements ar$a {
   private EAMapPlatformGestureInfo b;

   private q$b(q var1) {
      this.a = var1;
      this.b = new EAMapPlatformGestureInfo();
   }

   public boolean a(ar var1) {
      this.b.mGestureState = 2;
      this.b.mGestureType = 6;
      this.b.mLocation = new float[]{var1.c().getX(), var1.c().getY()};

      try {
         if (!this.a.a.h().isTiltGesturesEnabled()) {
            return true;
         }
      } catch (Throwable var11) {
         ht.c(var11, "GLMapGestrureDetector", "onHove");
         var11.printStackTrace();
         return true;
      }

      int var2 = this.a.a.a(this.b);
      if (this.a.a.d(var2)) {
         return false;
      } else {
         byte var3 = 3;
         if (q.c(this.a) > var3) {
            return false;
         } else {
            float var4 = var1.d().x;
            float var5 = var1.d().y;
            if (!q.i(this.a)) {
               PointF var6 = var1.a(0);
               PointF var7 = var1.a(1);
               boolean var8 = false;
               boolean var9 = var6.y > 10.0F && var7.y > 10.0F || var6.y < -10.0F && var7.y < -10.0F;
               if (var9) {
                  var8 = true;
               }

               byte var10 = 10;
               if (var8 && Math.abs(var5) > (float)var10 && Math.abs(var4) < (float)var10) {
                  q.b(this.a, true);
               }
            }

            if (q.i(this.a)) {
               q.b(this.a, true);
               float var12 = var5 / 6.0F;
               if (Math.abs(var12) > 1.0F) {
                  this.a.a.a(var2, (AbstractGestureMapMessage)HoverGestureMapMessage.obtain(101, var12));
                  q.m(this.a);
                  return true;
               }
            }

            return true;
         }
      }
   }

   public boolean b(ar var1) {
      this.b.mGestureState = 1;
      this.b.mGestureType = 6;
      this.b.mLocation = new float[]{var1.c().getX(), var1.c().getY()};

      try {
         if (!this.a.a.h().isTiltGesturesEnabled()) {
            return true;
         }
      } catch (Throwable var3) {
         ht.c(var3, "GLMapGestrureDetector", "onHoveBegin");
         var3.printStackTrace();
         return true;
      }

      int var2 = this.a.a.a(this.b);
      if (this.a.a.d(var2)) {
         return false;
      } else {
         this.a.a.a(var2, (AbstractGestureMapMessage)HoverGestureMapMessage.obtain(100, this.a.a.o(var2)));
         return true;
      }
   }

   public void c(ar var1) {
      this.b.mGestureState = 3;
      this.b.mGestureType = 6;
      this.b.mLocation = new float[]{var1.c().getX(), var1.c().getY()};

      try {
         if (!this.a.a.h().isTiltGesturesEnabled()) {
            return;
         }
      } catch (Throwable var3) {
         ht.c(var3, "GLMapGestrureDetector", "onHoveEnd");
         var3.printStackTrace();
         return;
      }

      int var2 = this.a.a.a(this.b);
      if (!this.a.a.d(var2)) {
         if (this.a.a.o(var2) >= 0.0F && q.a(this.a) > 0) {
            this.a.a.a(var2, 7);
         }

         q.b(this.a, false);
         this.a.a.a(var2, (AbstractGestureMapMessage)HoverGestureMapMessage.obtain(102, this.a.a.o(var2)));
      }
   }
}
