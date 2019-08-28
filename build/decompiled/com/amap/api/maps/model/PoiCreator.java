package com.amap.api.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public class PoiCreator implements Creator<Poi> {
   public PoiCreator() {
   }

   public Poi createFromParcel(Parcel var1) {
      String var2 = var1.readString();
      LatLng var3 = (LatLng)var1.readParcelable(LatLng.class.getClassLoader());
      String var4 = var1.readString();
      return new Poi(var2, var3, var4);
   }

   public Poi[] newArray(int var1) {
      return new Poi[var1];
   }
}
