package com.autonavi.amap.mapcore.animation;

import com.amap.api.maps.model.LatLng;

public class GLEmergeAnimation extends GLAnimation {
   public LatLng mStartPoint;

   public GLEmergeAnimation(LatLng var1) {
      this.mStartPoint = var1;
   }

   protected void applyTransformation(float var1, GLTransformation var2) {
   }
}
