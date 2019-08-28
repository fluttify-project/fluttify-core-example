package com.amap.api.maps.model;

public class MultiPointOverlayOptions {
   private BitmapDescriptor bitmapDescriptor;
   private float anchorU = 0.5F;
   private float anchorV = 0.5F;

   public MultiPointOverlayOptions() {
   }

   public MultiPointOverlayOptions anchor(float var1, float var2) {
      this.anchorU = var1;
      this.anchorV = var2;
      return this;
   }

   public float getAnchorU() {
      return this.anchorU;
   }

   public float getAnchorV() {
      return this.anchorV;
   }

   public MultiPointOverlayOptions icon(BitmapDescriptor var1) {
      this.bitmapDescriptor = var1;
      return this;
   }

   public BitmapDescriptor getIcon() {
      return this.bitmapDescriptor;
   }
}
