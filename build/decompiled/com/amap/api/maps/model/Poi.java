package com.amap.api.maps.model;

import android.os.Parcel;
import android.os.Parcelable;

public class Poi implements Parcelable {
   public static final PoiCreator CREATOR = new PoiCreator();
   private final String name;
   private final LatLng coordinate;
   private final String poiid;

   public Poi(String var1, LatLng var2, String var3) {
      this.name = var1;
      this.coordinate = var2;
      this.poiid = var3;
   }

   public String getName() {
      return this.name;
   }

   public LatLng getCoordinate() {
      return this.coordinate;
   }

   public String getPoiId() {
      return this.poiid;
   }

   public int describeContents() {
      return 0;
   }

   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && var1 instanceof Poi) {
         Poi var2 = (Poi)var1;
         return var2.getName().equals(this.name) && var2.getCoordinate().equals(this.coordinate) && var2.getPoiId().equals(this.poiid);
      } else {
         return false;
      }
   }

   public String toString() {
      return "poiid " + this.poiid + " name:" + this.name + "  coordinate:" + this.coordinate.toString();
   }

   public void writeToParcel(Parcel var1, int var2) {
      var1.writeString(this.name);
      var1.writeParcelable(this.coordinate, var2);
      var1.writeString(this.poiid);
   }

   public int hashCode() {
      return super.hashCode();
   }
}
