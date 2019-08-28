package com.autonavi.amap.mapcore;

import android.graphics.PointF;
import com.autonavi.ae.gmap.maploader.Pools$SynchronizedPool;

public class FPoint extends PointF {
   private static final Pools$SynchronizedPool<FPoint> M_POOL = new Pools$SynchronizedPool(32);

   public static FPoint obtain() {
      FPoint var0 = (FPoint)M_POOL.acquire();
      if (var0 == null) {
         var0 = new FPoint();
      } else {
         var0.set(0.0F, 0.0F);
      }

      return var0;
   }

   public static FPoint obtain(float var0, float var1) {
      FPoint var2 = (FPoint)M_POOL.acquire();
      if (var2 == null) {
         var2 = new FPoint(var0, var1);
      } else {
         var2.set(var0, var1);
      }

      return var2;
   }

   public void recycle() {
      M_POOL.release(this);
   }

   public FPoint() {
   }

   public FPoint(float var1, float var2) {
      this.x = var1;
      this.y = var2;
   }

   public boolean equals(Object var1) {
      FPoint var2 = (FPoint)var1;
      if (var2 == null) {
         return false;
      } else {
         return this.x == var2.x && this.y == var2.y;
      }
   }

   public int hashCode() {
      boolean var1 = true;
      int var2 = 37 * Float.floatToIntBits(this.x);
      var2 = 37 * Float.floatToIntBits(this.y);
      return var2;
   }
}
