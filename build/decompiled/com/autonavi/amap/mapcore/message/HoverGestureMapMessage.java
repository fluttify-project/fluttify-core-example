package com.autonavi.amap.mapcore.message;

import com.autonavi.ae.gmap.GLMapState;
import com.autonavi.ae.gmap.maploader.Pools$SynchronizedPool;

public class HoverGestureMapMessage extends AbstractGestureMapMessage {
   public float angleDelta = 0.0F;
   private static final Pools$SynchronizedPool<HoverGestureMapMessage> M_POOL = new Pools$SynchronizedPool(256);

   public static HoverGestureMapMessage obtain(int var0, float var1) {
      HoverGestureMapMessage var2 = (HoverGestureMapMessage)M_POOL.acquire();
      if (var2 == null) {
         var2 = new HoverGestureMapMessage(var0, var1);
      } else {
         var2.reset();
      }

      var2.setParams(var0, var1);
      return var2;
   }

   public void recycle() {
      M_POOL.release(this);
   }

   public static void destory() {
      M_POOL.destory();
   }

   private void setParams(int var1, float var2) {
      this.setState(var1);
      this.angleDelta = var2;
   }

   public HoverGestureMapMessage(int var1, float var2) {
      super(var1);
      this.angleDelta = var2;
   }

   public int getType() {
      return 3;
   }

   public void runCameraUpdate(GLMapState var1) {
      float var2 = var1.getCameraDegree() + this.angleDelta;
      if (var2 < 0.0F) {
         var2 = 0.0F;
      } else if (var2 > 80.0F) {
         var2 = 80.0F;
      } else if (var1.getCameraDegree() > 40.0F && var2 > 40.0F && var1.getCameraDegree() > var2) {
         var2 = 40.0F;
      }

      var1.setCameraDegree(var2);
      var1.recalculate();
   }
}
