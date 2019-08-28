package com.amap.api.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public class MyLocationStyleCreator implements Creator<MyLocationStyle> {
   public MyLocationStyleCreator() {
   }

   public MyLocationStyle createFromParcel(Parcel var1) {
      MyLocationStyle var2 = new MyLocationStyle();
      BitmapDescriptor var3 = (BitmapDescriptor)var1.readParcelable(BitmapDescriptor.class.getClassLoader());
      var2.myLocationIcon(var3);
      var2.anchor(var1.readFloat(), var1.readFloat());
      var2.radiusFillColor(var1.readInt());
      var2.strokeColor(var1.readInt());
      var2.strokeWidth(var1.readFloat());
      var2.myLocationType(var1.readInt());
      var2.interval(var1.readLong());
      boolean[] var4 = new boolean[7];
      var1.readBooleanArray(var4);
      var2.showMyLocation(var4[0]);
      return var2;
   }

   public MyLocationStyle[] newArray(int var1) {
      return new MyLocationStyle[var1];
   }
}
