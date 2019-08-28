package com.amap.api.maps.model;

import android.graphics.Bitmap;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;

public final class GroundOverlayOptions extends BaseOptions implements Parcelable {
   private static final String CLASSNAME = "GroundOverlayOptions";
   public static final GroundOverlayOptionsCreator CREATOR = new GroundOverlayOptionsCreator();
   public static final float NO_DIMENSION = -1.0F;
   private final int mVersionCode;
   private BitmapDescriptor bitmapDescriptor;
   private LatLng latLng;
   private float width;
   private float height;
   private LatLngBounds latlngBounds;
   private float bearing;
   private float zIndex = 0.0F;
   private boolean isVisible = true;
   private float transparency = 0.0F;
   private float anchorU = 0.5F;
   private float anchorV = 0.5F;
   private final double NF_PI = 0.01745329251994329D;
   private final double R = 6371000.79D;
   private LatLng southwest;
   private LatLng northeast;
   private final String type = "GroundOverlayOptions";
   private String bitmapSymbol;

   GroundOverlayOptions(int var1, IBinder var2, LatLng var3, float var4, float var5, LatLngBounds var6, float var7, float var8, boolean var9, float var10, float var11, float var12) {
      this.mVersionCode = var1;
      this.bitmapDescriptor = BitmapDescriptorFactory.fromBitmap((Bitmap)null);
      this.latLng = var3;
      this.width = var4;
      this.height = var5;
      this.latlngBounds = var6;
      this.bearing = var7;
      this.zIndex = var8;
      this.isVisible = var9;
      this.transparency = var10;
      this.anchorU = var11;
      this.anchorV = var12;
      this.southwest = var6.southwest;
      this.northeast = var6.northeast;
   }

   public GroundOverlayOptions() {
      this.mVersionCode = 1;
   }

   public GroundOverlayOptions image(BitmapDescriptor var1) {
      this.bitmapDescriptor = var1;
      if (this.bitmapDescriptor != null) {
         this.bitmapSymbol = this.bitmapDescriptor.getId();
      }

      return this;
   }

   public GroundOverlayOptions anchor(float var1, float var2) {
      this.anchorU = var1;
      this.anchorV = var2;
      if (this.latlngBounds != null) {
         this.a();
      } else if (this.latLng != null) {
         this.b();
      }

      return this;
   }

   public GroundOverlayOptions position(LatLng var1, float var2) {
      if (this.latlngBounds != null) {
         Log.w("GroundOverlayOptions", "Position has already been set using positionFromBounds");
      }

      if (var1 == null) {
         Log.w("GroundOverlayOptions", "Location must be specified");
      }

      if (var2 <= 0.0F) {
         Log.w("GroundOverlayOptions", "Width must be non-negative");
      }

      return this.a(var1, var2, var2);
   }

   public GroundOverlayOptions position(LatLng var1, float var2, float var3) {
      if (this.latlngBounds != null) {
         Log.w("GroundOverlayOptions", "Position has already been set using positionFromBounds");
      }

      if (var1 == null) {
         Log.w("GroundOverlayOptions", "Location must be specified");
      }

      if (var2 <= 0.0F || var3 <= 0.0F) {
         Log.w("GroundOverlayOptions", "Width and Height must be non-negative");
      }

      return this.a(var1, var2, var3);
   }

   private GroundOverlayOptions a(LatLng var1, float var2, float var3) {
      this.latLng = var1;
      this.width = var2;
      this.height = var3;
      this.b();
      return this;
   }

   public GroundOverlayOptions positionFromBounds(LatLngBounds var1) {
      this.latlngBounds = var1;
      this.southwest = var1.southwest;
      this.northeast = var1.northeast;
      this.a();
      return this;
   }

   public GroundOverlayOptions bearing(float var1) {
      this.bearing = var1;
      return this;
   }

   public GroundOverlayOptions zIndex(float var1) {
      this.zIndex = var1;
      return this;
   }

   public GroundOverlayOptions visible(boolean var1) {
      this.isVisible = var1;
      return this;
   }

   public GroundOverlayOptions transparency(float var1) {
      if (var1 < 0.0F) {
         Log.w("GroundOverlayOptions", "Transparency must be in the range [0..1]");
         var1 = 0.0F;
      }

      this.transparency = var1;
      return this;
   }

   public BitmapDescriptor getImage() {
      return this.bitmapDescriptor;
   }

   public LatLng getLocation() {
      return this.latLng;
   }

   public float getWidth() {
      return this.width;
   }

   public float getHeight() {
      return this.height;
   }

   public LatLngBounds getBounds() {
      return this.latlngBounds;
   }

   public float getBearing() {
      return this.bearing;
   }

   public float getZIndex() {
      return this.zIndex;
   }

   public float getTransparency() {
      return this.transparency;
   }

   public float getAnchorU() {
      return this.anchorU;
   }

   public float getAnchorV() {
      return this.anchorV;
   }

   public boolean isVisible() {
      return this.isVisible;
   }

   public int describeContents() {
      return 0;
   }

   public void writeToParcel(Parcel var1, int var2) {
      var1.writeInt(this.mVersionCode);
      var1.writeParcelable(this.bitmapDescriptor, var2);
      var1.writeParcelable(this.latLng, var2);
      var1.writeFloat(this.width);
      var1.writeFloat(this.height);
      var1.writeParcelable(this.latlngBounds, var2);
      var1.writeFloat(this.bearing);
      var1.writeFloat(this.zIndex);
      var1.writeByte((byte)(this.isVisible ? 1 : 0));
      var1.writeFloat(this.transparency);
      var1.writeFloat(this.anchorU);
      var1.writeFloat(this.anchorV);
   }

   private void a() {
      if (this.southwest != null && this.northeast != null) {
         this.latLng = new LatLng(this.southwest.latitude + (double)(1.0F - this.anchorV) * (this.northeast.latitude - this.southwest.latitude), this.southwest.longitude + (double)this.anchorU * (this.northeast.longitude - this.southwest.longitude));
         this.width = (float)(6371000.79D * Math.cos(this.latLng.latitude * 0.01745329251994329D) * (this.northeast.longitude - this.southwest.longitude) * 0.01745329251994329D);
         this.height = (float)(6371000.79D * (this.northeast.latitude - this.southwest.latitude) * 0.01745329251994329D);
      }
   }

   private void b() {
      if (this.latLng != null) {
         double var1 = (double)this.width / (6371000.79D * Math.cos(this.latLng.latitude * 0.01745329251994329D) * 0.01745329251994329D);
         double var3 = (double)this.height / 111194.94043265979D;

         try {
            this.latlngBounds = new LatLngBounds(new LatLng(this.latLng.latitude - (double)(1.0F - this.anchorV) * var3, this.latLng.longitude - (double)this.anchorU * var1), new LatLng(this.latLng.latitude + (double)this.anchorV * var3, this.latLng.longitude + (double)(1.0F - this.anchorU) * var1));
            this.southwest = this.latlngBounds.southwest;
            this.northeast = this.latlngBounds.northeast;
         } catch (Throwable var6) {
            var6.printStackTrace();
         }

      }
   }
}
