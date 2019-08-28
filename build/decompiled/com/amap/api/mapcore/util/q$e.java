package com.amap.api.mapcore.util;

import com.autonavi.ae.gmap.gesture.EAMapPlatformGestureInfo;

class q$e extends av$b {
   EAMapPlatformGestureInfo a;

   private q$e(q var1) {
      this.b = var1;
      this.a = new EAMapPlatformGestureInfo();
   }

   public void a(av var1) {
      try {
         if (!this.b.a.h().isZoomGesturesEnabled()) {
            return;
         }
      } catch (Throwable var4) {
         ht.c(var4, "GLMapGestrureDetector", "onZoomOut");
         var4.printStackTrace();
         return;
      }

      byte var2 = 10;
      if (Math.abs(var1.d()) <= (float)var2 && Math.abs(var1.e()) <= (float)var2 && var1.b() < 200L) {
         q.c(this.b, true);
         this.a.mGestureState = 2;
         this.a.mGestureType = 2;
         this.a.mLocation = new float[]{var1.c().getX(), var1.c().getY()};
         int var3 = this.b.a.a(this.a);
         this.b.a.a(var3, 4);
         this.b.a.c(var3);
      }

   }
}
