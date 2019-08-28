package com.amap.api.maps.model;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class CircleHoleOptions extends BaseHoleOptions implements Parcelable {
   private LatLng point = null;
   private double radius = 0.0D;
   public static final Creator<CircleHoleOptions> CREATOR = new CircleHoleOptions$1();

   public CircleHoleOptions() {
      this.isPolygonHoleOptions = false;
   }

   public CircleHoleOptions center(LatLng var1) {
      this.point = var1;
      return this;
   }

   public CircleHoleOptions radius(double var1) {
      this.radius = var1;
      return this;
   }

   public LatLng getCenter() {
      return this.point;
   }

   public double getRadius() {
      return this.radius;
   }

   protected CircleHoleOptions(Parcel var1) {
      Bundle var2 = var1.readBundle();
      this.point = new LatLng(var2.getDouble("lat"), var2.getDouble("lng"));
      this.radius = var1.readDouble();
   }

   public int describeContents() {
      return 0;
   }

   public void writeToParcel(Parcel var1, int var2) {
      Bundle var3 = new Bundle();
      if (this.point != null) {
         var3.putDouble("lat", this.point.latitude);
         var3.putDouble("lng", this.point.longitude);
      }

      var1.writeBundle(var3);
      var1.writeDouble(this.radius);
   }
}
