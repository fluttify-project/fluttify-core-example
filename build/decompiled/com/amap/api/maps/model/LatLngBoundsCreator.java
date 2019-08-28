package com.amap.api.maps.model;

import android.os.BadParcelableException;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public class LatLngBoundsCreator implements Creator<LatLngBounds> {
   public static final int CONTENT_DESCRIPTION = 0;

   public LatLngBoundsCreator() {
   }

   public LatLngBounds createFromParcel(Parcel var1) {
      boolean var2 = false;
      LatLng var3 = null;
      LatLng var4 = null;
      int var7 = var1.readInt();

      try {
         var3 = (LatLng)var1.readParcelable(LatLngBounds.class.getClassLoader());
         var4 = (LatLng)var1.readParcelable(LatLngBounds.class.getClassLoader());
      } catch (BadParcelableException var6) {
         var6.printStackTrace();
      }

      return new LatLngBounds(var7, var3, var4);
   }

   public LatLngBounds[] newArray(int var1) {
      return new LatLngBounds[var1];
   }

   static void a(LatLngBounds var0, Parcel var1, int var2) {
      var1.writeInt(var0.a());
      var1.writeParcelable(var0.southwest, var2);
      var1.writeParcelable(var0.northeast, var2);
   }
}
