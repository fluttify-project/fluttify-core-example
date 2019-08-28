package com.amap.api.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public class LatLngCreator implements Creator<LatLng> {
   public static final int CONTENT_DESCRIPTION = 0;

   public LatLngCreator() {
   }

   public LatLng createFromParcel(Parcel var1) {
      double var2 = var1.readDouble();
      double var4 = var1.readDouble();
      return new LatLng(var4, var2);
   }

   public LatLng[] newArray(int var1) {
      return new LatLng[var1];
   }
}
