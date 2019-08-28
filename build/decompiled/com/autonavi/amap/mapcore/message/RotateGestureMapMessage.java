package com.autonavi.amap.mapcore.message;

import com.autonavi.ae.gmap.GLMapState;
import com.autonavi.ae.gmap.maploader.Pools$SynchronizedPool;
import com.autonavi.amap.mapcore.IPoint;

public class RotateGestureMapMessage extends AbstractGestureMapMessage {
   public int pivotX = 0;
   public int pivotY = 0;
   public float angleDelta = 0.0F;
   private static final Pools$SynchronizedPool<RotateGestureMapMessage> M_POOL = new Pools$SynchronizedPool(256);

   public static RotateGestureMapMessage obtain(int var0, float var1, int var2, int var3) {
      RotateGestureMapMessage var4 = (RotateGestureMapMessage)M_POOL.acquire();
      if (var4 == null) {
         var4 = new RotateGestureMapMessage(var0, var1, var2, var3);
      } else {
         var4.reset();
         var4.setParams(var0, var1, var2, var3);
      }

      return var4;
   }

   public void recycle() {
      M_POOL.release(this);
   }

   public static void destory() {
      M_POOL.destory();
   }

   private void setParams(int var1, float var2, int var3, int var4) {
      this.setState(var1);
      this.angleDelta = var2;
      this.pivotX = var3;
      this.pivotY = var4;
   }

   public RotateGestureMapMessage(int var1, float var2, int var3, int var4) {
      super(var1);
      this.setParams(var1, var2, var3, var4);
      this.angleDelta = var2;
      this.pivotX = var3;
      this.pivotY = var4;
   }

   public int getType() {
      return 2;
   }

   public void runCameraUpdate(GLMapState var1) {
      float var2 = this.angleDelta;
      float var3 = var1.getMapAngle() + var2;
      if (this.isGestureScaleByMapCenter) {
         var1.setMapAngle(var3);
         var1.recalculate();
      } else {
         int var4 = this.pivotX;
         int var5 = this.pivotY;
         if (this.isUseAnchor) {
            var4 = this.anchorX;
            var5 = this.anchorY;
         }

         IPoint var6 = null;
         IPoint var7 = null;
         if (var4 > 0 || var5 > 0) {
            var6 = IPoint.obtain();
            var7 = IPoint.obtain();
            this.win2geo(var1, var4, var5, var6);
            var1.setMapGeoCenter(var6.x, var6.y);
         }

         var1.setMapAngle(var3);
         var1.recalculate();
         if (var4 > 0 || var5 > 0) {
            this.win2geo(var1, var4, var5, var7);
            if (var6 != null) {
               var1.setMapGeoCenter(2 * var6.x - var7.x, 2 * var6.y - var7.y);
            }

            var1.recalculate();
         }

         if (var6 != null) {
            var6.recycle();
         }

         if (var7 != null) {
            var7.recycle();
         }

      }
   }
}
