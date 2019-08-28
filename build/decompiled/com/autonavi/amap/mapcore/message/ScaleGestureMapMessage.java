package com.autonavi.amap.mapcore.message;

import com.autonavi.ae.gmap.GLMapState;
import com.autonavi.ae.gmap.maploader.Pools$SynchronizedPool;
import com.autonavi.amap.mapcore.IPoint;

public class ScaleGestureMapMessage extends AbstractGestureMapMessage {
   public float scaleDelta = 0.0F;
   public int pivotX = 0;
   public int pivotY = 0;
   private static final Pools$SynchronizedPool<ScaleGestureMapMessage> M_POOL = new Pools$SynchronizedPool(256);

   public static ScaleGestureMapMessage obtain(int var0, float var1, int var2, int var3) {
      ScaleGestureMapMessage var4 = (ScaleGestureMapMessage)M_POOL.acquire();
      if (var4 == null) {
         var4 = new ScaleGestureMapMessage(var0, var1, var2, var3);
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
      this.scaleDelta = var2;
      this.pivotX = var3;
      this.pivotY = var4;
   }

   public ScaleGestureMapMessage(int var1, float var2, int var3, int var4) {
      super(var1);
      this.setParams(var1, var2, var3, var4);
   }

   public int getType() {
      return 1;
   }

   public void runCameraUpdate(GLMapState var1) {
      if (this.isUseAnchor) {
         this.setMapZoomer(var1);
      } else {
         int var2 = this.pivotX;
         int var3 = this.pivotY;
         if (this.isGestureScaleByMapCenter) {
            var2 = this.width >> 1;
            var3 = this.height >> 1;
         }

         IPoint var4 = null;
         IPoint var5 = null;
         if (var2 > 0 || var3 > 0) {
            var4 = IPoint.obtain();
            var5 = IPoint.obtain();
            this.win2geo(var1, var2, var3, var4);
            var1.setMapGeoCenter(var4.x, var4.y);
         }

         this.setMapZoomer(var1);
         if (var2 > 0 || var3 > 0) {
            this.win2geo(var1, var2, var3, var5);
            if (var4 != null) {
               var1.setMapGeoCenter(2 * var4.x - var5.x, 2 * var4.y - var5.y);
            }

            var1.recalculate();
         }

         if (var4 != null) {
            var4.recycle();
         }

         if (var5 != null) {
            var5.recycle();
         }

      }
   }

   private void setMapZoomer(GLMapState var1) {
      float var2 = this.scaleDelta;
      float var3 = var1.getMapZoomer() + var2;
      var1.setMapZoomer(var3);
      var1.recalculate();
   }
}
