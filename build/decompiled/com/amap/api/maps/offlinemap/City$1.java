package com.amap.api.maps.offlinemap;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class City$1 implements Creator<City> {
   City$1() {
   }

   public City a(Parcel var1) {
      return new City(var1);
   }

   public City[] a(int var1) {
      return new City[var1];
   }
}
