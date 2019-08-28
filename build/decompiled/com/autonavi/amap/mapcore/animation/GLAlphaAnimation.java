package com.autonavi.amap.mapcore.animation;

public class GLAlphaAnimation extends GLAnimation {
   public float mFromAlpha = 0.0F;
   public float mToAlpha = 1.0F;
   public float mCurAlpha = 0.0F;

   public GLAlphaAnimation(float var1, float var2) {
      this.mFromAlpha = var1;
      this.mToAlpha = var2;
   }

   protected void applyTransformation(float var1, GLTransformation var2) {
      float var3 = this.mFromAlpha;
      this.mCurAlpha = var3 + (this.mToAlpha - var3) * var1;
      var2.alpha = (double)this.mCurAlpha;
   }
}
