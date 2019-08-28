package com.autonavi.ae.gmap.gloverlay;

public class GLOverlayTexture {
   public int mResId = 0;
   public int mWidth;
   public int mHeight;
   public int mResWidth;
   public int mResHeight;
   public float mAnchorXRatio;
   public float mAnchorYRatio;
   public int mAnchor;

   public GLOverlayTexture(int var1, int var2, int var3, int var4) {
      this.mResId = var1;
      this.mWidth = var3;
      this.mHeight = var4;
      this.mResWidth = var3;
      this.mResHeight = var4;
      this.mAnchor = var2;
   }

   public GLOverlayTexture(int var1, int var2, float var3, float var4, int var5, int var6) {
      this.mResId = var1;
      this.mWidth = var5;
      this.mHeight = var6;
      this.mResWidth = var5;
      this.mResHeight = var6;
      this.mAnchor = var2;
      this.mAnchorXRatio = var3;
      this.mAnchorYRatio = var4;
   }
}
