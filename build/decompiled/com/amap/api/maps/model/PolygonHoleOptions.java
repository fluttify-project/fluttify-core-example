package com.amap.api.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PolygonHoleOptions extends BaseHoleOptions implements Parcelable {
   private final List<LatLng> points;
   public static final Creator<PolygonHoleOptions> CREATOR = new PolygonHoleOptions$1();

   public PolygonHoleOptions() {
      this.points = new ArrayList();
      this.isPolygonHoleOptions = true;
   }

   protected PolygonHoleOptions(Parcel var1) {
      this.points = var1.createTypedArrayList(LatLng.CREATOR);
      this.isPolygonHoleOptions = true;
   }

   public PolygonHoleOptions addAll(Iterable<LatLng> var1) {
      try {
         Iterator var2 = var1.iterator();

         while(var2.hasNext()) {
            LatLng var3 = (LatLng)var2.next();
            this.points.add(var3);
         }
      } catch (Throwable var4) {
         var4.printStackTrace();
      }

      return this;
   }

   public List<LatLng> getPoints() {
      return this.points;
   }

   public int describeContents() {
      return 0;
   }

   public void writeToParcel(Parcel var1, int var2) {
      var1.writeTypedList(this.points);
   }
}
