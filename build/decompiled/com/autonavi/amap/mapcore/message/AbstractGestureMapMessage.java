package com.autonavi.amap.mapcore.message;

import com.autonavi.ae.gmap.AbstractMapMessage;
import com.autonavi.ae.gmap.GLMapState;
import com.autonavi.amap.mapcore.IPoint;

public abstract class AbstractGestureMapMessage extends AbstractMapMessage {
   public int width = 0;
   public int height = 0;
   public boolean isGestureScaleByMapCenter = false;
   public boolean isUseAnchor = false;
   public int anchorX;
   public int anchorY;
   private int state = 0;

   public abstract int getType();

   public AbstractGestureMapMessage(int var1) {
      this.state = var1;
   }

   public void setState(int var1) {
      this.state = var1;
   }

   public void reset() {
      this.width = 0;
      this.height = 0;
      this.state = 0;
      this.isGestureScaleByMapCenter = false;
      this.isUseAnchor = false;
      this.anchorX = 0;
      this.anchorY = 0;
   }

   public abstract void runCameraUpdate(GLMapState var1);

   protected void win2geo(GLMapState var1, int var2, int var3, IPoint var4) {
      var1.screenToP20Point(var2, var3, var4);
   }

   protected IPoint getAnchorGeoPoint(GLMapState var1, int var2, int var3) {
      IPoint var4 = IPoint.obtain();
      var1.screenToP20Point(var2, var3, var4);
      return var4;
   }

   public int getMapGestureState() {
      return this.state;
   }
}
