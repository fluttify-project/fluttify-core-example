package com.amap.api.maps.model;

import android.util.Log;

public final class LatLngBounds$Builder {
   private double mSouth = Double.POSITIVE_INFINITY;
   private double mNorth = Double.NEGATIVE_INFINITY;
   private double mWest = Double.NaN;
   private double mEast = Double.NaN;

   public LatLngBounds$Builder() {
   }

   public LatLngBounds$Builder include(LatLng var1) {
      if (var1 == null) {
         return this;
      } else {
         this.mSouth = Math.min(this.mSouth, var1.latitude);
         this.mNorth = Math.max(this.mNorth, var1.latitude);
         double var2 = var1.longitude;
         if (Double.isNaN(this.mWest)) {
            this.mWest = var2;
            this.mEast = var2;
         } else if (!this.a(var2)) {
            if (LatLngBounds.a(this.mWest, var2) < LatLngBounds.b(this.mEast, var2)) {
               this.mWest = var2;
            } else {
               this.mEast = var2;
            }
         }

         return this;
      }
   }

   private boolean a(double var1) {
      if (this.mWest <= this.mEast) {
         return this.mWest <= var1 && var1 <= this.mEast;
      } else {
         return this.mWest <= var1 || var1 <= this.mEast;
      }
   }

   public LatLngBounds build() {
      if (Double.isNaN(this.mWest)) {
         Log.w("LatLngBounds", "no included points");
         return null;
      } else {
         if (this.mWest > this.mEast) {
            double var1 = this.mWest;
            this.mWest = this.mEast;
            this.mEast = var1;
         }

         if (this.mSouth > this.mNorth) {
            double var3 = this.mSouth;
            this.mSouth = this.mNorth;
            this.mNorth = var3;
         }

         return new LatLngBounds(new LatLng(this.mSouth, this.mWest, false), new LatLng(this.mNorth, this.mEast, false));
      }
   }
}
