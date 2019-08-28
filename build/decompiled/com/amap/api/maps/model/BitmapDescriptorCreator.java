package com.amap.api.maps.model;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public class BitmapDescriptorCreator implements Creator<BitmapDescriptor> {
   public BitmapDescriptorCreator() {
   }

   public BitmapDescriptor createFromParcel(Parcel var1) {
      BitmapDescriptor var2 = new BitmapDescriptor((Bitmap)null, var1.readString());
      var2.c = (Bitmap)var1.readParcelable(Bitmap.class.getClassLoader());
      var2.a = var1.readInt();
      var2.b = var1.readInt();
      return var2;
   }

   public BitmapDescriptor[] newArray(int var1) {
      return new BitmapDescriptor[var1];
   }
}
