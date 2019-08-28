package com.autonavi.amap.mapcore;

import android.graphics.Point;
import com.autonavi.ae.gmap.maploader.Pools$SynchronizedPool;

public class IPoint extends Point implements Cloneable {
   private static final Pools$SynchronizedPool<IPoint> M_POOL = new Pools$SynchronizedPool(32);

   public static IPoint obtain() {
      IPoint var0 = (IPoint)M_POOL.acquire();
      if (var0 == null) {
         var0 = new IPoint();
      } else {
         var0.set(0, 0);
      }

      return var0;
   }

   public static IPoint obtain(int var0, int var1) {
      IPoint var2 = (IPoint)M_POOL.acquire();
      if (var2 == null) {
         var2 = new IPoint(var0, var1);
      } else {
         var2.set(var0, var1);
      }

      return var2;
   }

   public void recycle() {
      M_POOL.release(this);
   }

   public IPoint() {
   }

   public IPoint(int var1, int var2) {
      this.x = var1;
      this.y = var2;
   }

   public Object clone() {
      IPoint var1 = null;

      try {
         var1 = (IPoint)super.clone();
      } catch (CloneNotSupportedException var3) {
         var3.printStackTrace();
      }

      return var1;
   }
}
