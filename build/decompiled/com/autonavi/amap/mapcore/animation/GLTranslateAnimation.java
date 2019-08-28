package com.autonavi.amap.mapcore.animation;

import com.amap.api.maps.model.LatLng;

public class GLTranslateAnimation extends GLAnimation {
   public double mFromXDelta = 0.0D;
   public double mFromYDelta = 0.0D;
   public double mToXDelta = 0.0D;
   public double mToYDelta = 0.0D;
   public double mCurXDelta = 0.0D;
   public double mCurYDelta = 0.0D;

   public GLTranslateAnimation(LatLng var1) {
      this.mToXDelta = var1.longitude;
      this.mToYDelta = var1.latitude;
   }

   public void setFromPoint(LatLng var1) {
      this.mFromXDelta = var1.longitude;
      this.mFromYDelta = var1.latitude;
   }

   protected void applyTransformation(float var1, GLTransformation var2) {
      this.mCurXDelta = this.mFromXDelta;
      this.mCurYDelta = this.mFromYDelta;
      if (this.mFromXDelta != this.mToXDelta) {
         this.mCurXDelta = this.mFromXDelta + (this.mToXDelta - this.mFromXDelta) * (double)var1;
      }

      if (this.mFromYDelta != this.mToYDelta) {
         this.mCurYDelta = this.mFromYDelta + (this.mToYDelta - this.mFromYDelta) * (double)var1;
      }

      var2.x = this.mCurXDelta;
      var2.y = this.mCurYDelta;
   }
}
