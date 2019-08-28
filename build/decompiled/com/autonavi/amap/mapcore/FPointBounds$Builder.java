package com.autonavi.amap.mapcore;

public final class FPointBounds$Builder {
   private float mSouth = Float.POSITIVE_INFINITY;
   private float mNorth = Float.NEGATIVE_INFINITY;
   private float mWest = Float.POSITIVE_INFINITY;
   private float mEast = Float.NEGATIVE_INFINITY;

   public FPointBounds$Builder() {
   }

   public FPointBounds$Builder include(FPoint var1) {
      this.mSouth = Math.min(this.mSouth, var1.y);
      this.mNorth = Math.max(this.mNorth, var1.y);
      this.mWest = Math.min(this.mWest, var1.x);
      this.mEast = Math.max(this.mEast, var1.x);
      return this;
   }

   private boolean containsx(double var1) {
      if (this.mWest <= this.mEast) {
         return (double)this.mWest <= var1 && var1 <= (double)this.mEast;
      } else {
         return (double)this.mWest <= var1 || var1 <= (double)this.mEast;
      }
   }

   public FPointBounds build() {
      return new FPointBounds(FPoint.obtain(this.mWest, this.mSouth), FPoint.obtain(this.mEast, this.mNorth));
   }
}
