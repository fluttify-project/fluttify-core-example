package com.autonavi.amap.mapcore.message;

import com.autonavi.ae.gmap.GLMapState;
import com.autonavi.ae.gmap.maploader.Pools$SynchronizedPool;
import com.autonavi.amap.mapcore.IPoint;

public class MoveGestureMapMessage extends AbstractGestureMapMessage {
   public float touchDeltaX = 0.0F;
   public float touchDeltaY = 0.0F;
   static int newCount = 0;
   private static final Pools$SynchronizedPool<MoveGestureMapMessage> M_POOL = new Pools$SynchronizedPool(1024);

   public static synchronized MoveGestureMapMessage obtain(int var0, float var1, float var2) {
      MoveGestureMapMessage var3 = (MoveGestureMapMessage)M_POOL.acquire();
      if (var3 == null) {
         var3 = new MoveGestureMapMessage(var0, var1, var2);
      } else {
         var3.reset();
         var3.setParams(var0, var1, var2);
      }

      return var3;
   }

   public void recycle() {
      M_POOL.release(this);
   }

   public static void destory() {
      M_POOL.destory();
   }

   private void setParams(int var1, float var2, float var3) {
      this.setState(var1);
      this.touchDeltaX = var2;
      this.touchDeltaY = var3;
   }

   public MoveGestureMapMessage(int var1, float var2, float var3) {
      super(var1);
      this.touchDeltaX = var2;
      this.touchDeltaY = var3;
      ++newCount;
   }

   public int getType() {
      return 0;
   }

   public void runCameraUpdate(GLMapState var1) {
      int var2 = (int)this.touchDeltaX;
      int var3 = (int)this.touchDeltaY;
      float var4 = (float)(this.width >> 1);
      float var5 = (float)(this.height >> 1);
      if (this.isUseAnchor) {
         var4 = (float)this.anchorX;
         var5 = (float)this.anchorY;
      }

      int var6 = (int)(var4 - (float)var2);
      int var7 = (int)(var5 - (float)var3);
      IPoint var8 = IPoint.obtain();
      this.win2geo(var1, var6, var7, var8);
      var1.setMapGeoCenter(var8.x, var8.y);
      var1.recalculate();
      var8.recycle();
   }
}
