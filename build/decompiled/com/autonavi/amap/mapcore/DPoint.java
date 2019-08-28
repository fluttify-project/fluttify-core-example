package com.autonavi.amap.mapcore;

import com.autonavi.ae.gmap.maploader.Pools$SynchronizedPool;

public class DPoint {
   private static final Pools$SynchronizedPool<DPoint> M_POOL = new Pools$SynchronizedPool(32);
   public double x;
   public double y;

   public static DPoint obtain() {
      DPoint var0 = (DPoint)M_POOL.acquire();
      if (var0 == null) {
         var0 = new DPoint();
      } else {
         var0.set(0.0D, 0.0D);
      }

      return var0;
   }

   public static DPoint obtain(double var0, double var2) {
      DPoint var4 = (DPoint)M_POOL.acquire();
      if (var4 == null) {
         var4 = new DPoint(var0, var2);
      } else {
         var4.set(var0, var2);
      }

      return var4;
   }

   public void recycle() {
      M_POOL.release(this);
   }

   public DPoint() {
   }

   public DPoint(double var1, double var3) {
      this.x = var1;
      this.y = var3;
   }

   private void set(double var1, double var3) {
      this.x = var1;
      this.y = var3;
   }
}
