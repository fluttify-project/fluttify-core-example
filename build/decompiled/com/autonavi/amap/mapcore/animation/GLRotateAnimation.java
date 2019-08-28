package com.autonavi.amap.mapcore.animation;

public class GLRotateAnimation extends GLAnimation {
   private float mFromDegrees = 0.0F;
   private float mToDegrees = 1.0F;

   public GLRotateAnimation(float var1, float var2, float var3, float var4, float var5) {
      this.mFromDegrees = var1;
      this.mToDegrees = var2;
   }

   protected void applyTransformation(float var1, GLTransformation var2) {
      float var3 = this.mFromDegrees + (this.mToDegrees - this.mFromDegrees) * var1;
      var2.rotate = (double)var3;
   }
}
