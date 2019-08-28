package com.amap.api.maps.model;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

public final class ArcOptions extends BaseOptions implements Parcelable {
   public static final ArcOptionsCreator CREATOR = new ArcOptionsCreator();
   String a;
   private LatLng startpoint;
   private LatLng passedpoint;
   private LatLng endpoint;
   private float strokeWidth = 10.0F;
   private int strokeColor = -16777216;
   private float zIndex = 0.0F;
   private boolean isVisible = true;
   private final String type = "ArcOptions";

   public ArcOptions() {
   }

   public void writeToParcel(Parcel var1, int var2) {
      Bundle var3 = new Bundle();
      if (this.startpoint != null) {
         var3.putDouble("startlat", this.startpoint.latitude);
         var3.putDouble("startlng", this.startpoint.longitude);
      }

      if (this.passedpoint != null) {
         var3.putDouble("passedlat", this.passedpoint.latitude);
         var3.putDouble("passedlng", this.passedpoint.longitude);
      }

      if (this.endpoint != null) {
         var3.putDouble("endlat", this.endpoint.latitude);
         var3.putDouble("endlng", this.endpoint.longitude);
      }

      var1.writeBundle(var3);
      var1.writeFloat(this.strokeWidth);
      var1.writeInt(this.strokeColor);
      var1.writeFloat(this.zIndex);
      var1.writeByte((byte)(this.isVisible ? 1 : 0));
      var1.writeString(this.a);
   }

   public int describeContents() {
      return 0;
   }

   public ArcOptions point(LatLng var1, LatLng var2, LatLng var3) {
      this.startpoint = var1;
      this.passedpoint = var2;
      this.endpoint = var3;
      return this;
   }

   public ArcOptions strokeWidth(float var1) {
      this.strokeWidth = var1;
      return this;
   }

   public ArcOptions strokeColor(int var1) {
      this.strokeColor = var1;
      return this;
   }

   public ArcOptions zIndex(float var1) {
      this.zIndex = var1;
      return this;
   }

   public ArcOptions visible(boolean var1) {
      this.isVisible = var1;
      return this;
   }

   public float getStrokeWidth() {
      return this.strokeWidth;
   }

   public int getStrokeColor() {
      return this.strokeColor;
   }

   public float getZIndex() {
      return this.zIndex;
   }

   public boolean isVisible() {
      return this.isVisible;
   }

   public LatLng getStart() {
      return this.startpoint;
   }

   public LatLng getPassed() {
      return this.passedpoint;
   }

   public LatLng getEnd() {
      return this.endpoint;
   }
}
