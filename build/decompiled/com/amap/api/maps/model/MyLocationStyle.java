package com.amap.api.maps.model;

import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;

public class MyLocationStyle implements Parcelable {
   public static final MyLocationStyleCreator CREATOR = new MyLocationStyleCreator();
   public static final String ERROR_CODE = "errorCode";
   public static final String ERROR_INFO = "errorInfo";
   public static final String LOCATION_TYPE = "locationType";
   private BitmapDescriptor mMyLocationIcon;
   private float mAnchorU = 0.5F;
   private float mAnchorV = 0.5F;
   private int mRadiusFillColor = Color.argb(100, 0, 0, 180);
   private int mStrokeColor = Color.argb(255, 0, 0, 220);
   private float mStrokeWidth = 1.0F;
   private int mLocationType = 4;
   private long interval = 2000L;
   private boolean myLocationVisible = true;
   public static final int LOCATION_TYPE_SHOW = 0;
   public static final int LOCATION_TYPE_LOCATE = 1;
   public static final int LOCATION_TYPE_FOLLOW = 2;
   public static final int LOCATION_TYPE_MAP_ROTATE = 3;
   public static final int LOCATION_TYPE_LOCATION_ROTATE = 4;
   public static final int LOCATION_TYPE_LOCATION_ROTATE_NO_CENTER = 5;
   public static final int LOCATION_TYPE_FOLLOW_NO_CENTER = 6;
   public static final int LOCATION_TYPE_MAP_ROTATE_NO_CENTER = 7;

   public MyLocationStyle() {
   }

   public MyLocationStyle myLocationIcon(BitmapDescriptor var1) {
      this.mMyLocationIcon = var1;
      return this;
   }

   public MyLocationStyle anchor(float var1, float var2) {
      this.mAnchorU = var1;
      this.mAnchorV = var2;
      return this;
   }

   public MyLocationStyle radiusFillColor(int var1) {
      this.mRadiusFillColor = var1;
      return this;
   }

   public MyLocationStyle strokeColor(int var1) {
      this.mStrokeColor = var1;
      return this;
   }

   public MyLocationStyle strokeWidth(float var1) {
      this.mStrokeWidth = var1;
      return this;
   }

   public MyLocationStyle myLocationType(int var1) {
      this.mLocationType = var1;
      return this;
   }

   public MyLocationStyle interval(long var1) {
      this.interval = var1;
      return this;
   }

   public MyLocationStyle showMyLocation(boolean var1) {
      this.myLocationVisible = var1;
      return this;
   }

   public BitmapDescriptor getMyLocationIcon() {
      return this.mMyLocationIcon;
   }

   public float getAnchorU() {
      return this.mAnchorU;
   }

   public float getAnchorV() {
      return this.mAnchorV;
   }

   public int getRadiusFillColor() {
      return this.mRadiusFillColor;
   }

   public int getStrokeColor() {
      return this.mStrokeColor;
   }

   public float getStrokeWidth() {
      return this.mStrokeWidth;
   }

   public int getMyLocationType() {
      return this.mLocationType;
   }

   public long getInterval() {
      return this.interval;
   }

   public boolean isMyLocationShowing() {
      return this.myLocationVisible;
   }

   public int describeContents() {
      return 0;
   }

   public void writeToParcel(Parcel var1, int var2) {
      var1.writeParcelable(this.mMyLocationIcon, var2);
      var1.writeFloat(this.mAnchorU);
      var1.writeFloat(this.mAnchorV);
      var1.writeInt(this.mRadiusFillColor);
      var1.writeInt(this.mStrokeColor);
      var1.writeFloat(this.mStrokeWidth);
      var1.writeInt(this.mLocationType);
      var1.writeLong(this.interval);
      var1.writeBooleanArray(new boolean[]{this.myLocationVisible});
   }
}
