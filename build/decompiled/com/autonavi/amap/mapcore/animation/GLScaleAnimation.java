package com.autonavi.amap.mapcore.animation;

public class GLScaleAnimation extends GLAnimation {
   private float mFromX;
   private float mToX;
   private float mFromY;
   private float mToY;
   private float mPivotX;
   private float mPivotY;

   public GLScaleAnimation(float var1, float var2, float var3, float var4) {
      this.mFromX = var1;
      this.mToX = var2;
      this.mFromY = var3;
      this.mToY = var4;
      this.mPivotX = 0.0F;
      this.mPivotY = 0.0F;
   }

   protected void applyTransformation(float var1, GLTransformation var2) {
      float var3 = 1.0F;
      float var4 = 1.0F;
      float var5 = 1.0F;
      if (this.mFromX != var5 || this.mToX != var5) {
         var3 = this.mFromX + (this.mToX - this.mFromX) * var1;
      }

      if (this.mFromY != var5 || this.mToY != var5) {
         var4 = this.mFromY + (this.mToY - this.mFromY) * var1;
      }

      if (this.mPivotX == 0.0F && this.mPivotY == 0.0F) {
         var2.scaleX = (double)var3;
         var2.scaleY = (double)var4;
      } else {
         var2.scaleX = (double)var3;
         var2.scaleY = (double)var4;
      }

   }
}
