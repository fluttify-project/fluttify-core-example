package com.amap.api.mapcore.util;

import android.graphics.PointF;
import com.autonavi.ae.gmap.gesture.EAMapPlatformGestureInfo;
import com.autonavi.amap.mapcore.message.AbstractGestureMapMessage;
import com.autonavi.amap.mapcore.message.MoveGestureMapMessage;

class q$c implements as$a {
   private EAMapPlatformGestureInfo b;

   private q$c(q var1) {
      this.a = var1;
      this.b = new EAMapPlatformGestureInfo();
   }

   public boolean a(as var1) {
      if (q.i(this.a)) {
         return true;
      } else {
         try {
            if (!this.a.a.h().isScrollGesturesEnabled() || q.j(this.a)) {
               return true;
            }
         } catch (Throwable var5) {
            ht.c(var5, "GLMapGestrureDetector", "onMove");
            var5.printStackTrace();
            return true;
         }

         this.b.mGestureState = 2;
         this.b.mGestureType = 3;
         this.b.mLocation = new float[]{var1.c().getX(), var1.c().getY()};
         int var2 = this.a.a.a(this.b);
         PointF var3 = var1.d();
         float var4 = 1.0F;
         if (q.k(this.a) == 0) {
            var4 = 4.0F;
         }

         if (Math.abs(var3.x) <= var4 && Math.abs(var3.y) <= var4) {
            return false;
         } else {
            if (q.k(this.a) == 0) {
               this.a.a.a().clearAnimations(var2, false);
            }

            this.a.a.a(var2, (AbstractGestureMapMessage)MoveGestureMapMessage.obtain(101, var3.x, var3.y));
            q.l(this.a);
            return true;
         }
      }
   }

   public boolean b(as var1) {
      try {
         if (!this.a.a.h().isScrollGesturesEnabled()) {
            return true;
         }
      } catch (Throwable var3) {
         ht.c(var3, "GLMapGestrureDetector", "onMoveBegin");
         var3.printStackTrace();
         return true;
      }

      this.b.mGestureState = 1;
      this.b.mGestureType = 3;
      this.b.mLocation = new float[]{var1.c().getX(), var1.c().getY()};
      int var2 = this.a.a.a(this.b);
      this.a.a.a(var2, (AbstractGestureMapMessage)MoveGestureMapMessage.obtain(100, 0.0F, 0.0F));
      return true;
   }

   public void c(as var1) {
      try {
         if (!this.a.a.h().isScrollGesturesEnabled()) {
            return;
         }
      } catch (Throwable var3) {
         ht.c(var3, "GLMapGestrureDetector", "onMoveEnd");
         var3.printStackTrace();
         return;
      }

      this.b.mGestureState = 3;
      this.b.mGestureType = 3;
      this.b.mLocation = new float[]{var1.c().getX(), var1.c().getY()};
      int var2 = this.a.a.a(this.b);
      if (q.k(this.a) > 0) {
         this.a.a.a(var2, 5);
      }

      this.a.a.a(var2, (AbstractGestureMapMessage)MoveGestureMapMessage.obtain(102, 0.0F, 0.0F));
   }
}
