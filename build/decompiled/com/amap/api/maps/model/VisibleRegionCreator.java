package com.amap.api.maps.model;

import android.os.BadParcelableException;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public class VisibleRegionCreator implements Creator<VisibleRegion> {
   public static final int CONTENT_DESCRIPTION = 0;

   public VisibleRegionCreator() {
   }

   public VisibleRegion createFromParcel(Parcel var1) {
      boolean var2 = false;
      LatLng var3 = null;
      LatLng var4 = null;
      LatLng var5 = null;
      LatLng var6 = null;
      LatLngBounds var7 = null;
      int var10 = var1.readInt();

      try {
         var3 = (LatLng)var1.readParcelable(LatLng.class.getClassLoader());
         var4 = (LatLng)var1.readParcelable(LatLng.class.getClassLoader());
         var5 = (LatLng)var1.readParcelable(LatLng.class.getClassLoader());
         var6 = (LatLng)var1.readParcelable(LatLng.class.getClassLoader());
         var7 = (LatLngBounds)var1.readParcelable(LatLngBounds.class.getClassLoader());
      } catch (BadParcelableException var9) {
         var9.printStackTrace();
      }

      return new VisibleRegion(var10, var3, var4, var5, var6, var7);
   }

   public VisibleRegion[] newArray(int var1) {
      return new VisibleRegion[var1];
   }

   static void a(VisibleRegion var0, Parcel var1, int var2) {
      var1.writeInt(var0.a());
      var1.writeParcelable(var0.nearLeft, var2);
      var1.writeParcelable(var0.nearRight, var2);
      var1.writeParcelable(var0.farLeft, var2);
      var1.writeParcelable(var0.farRight, var2);
      var1.writeParcelable(var0.latLngBounds, var2);
   }
}
