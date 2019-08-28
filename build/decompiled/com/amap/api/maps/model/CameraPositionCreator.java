package com.amap.api.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public class CameraPositionCreator implements Creator<CameraPosition> {
   public CameraPositionCreator() {
   }

   public CameraPosition createFromParcel(Parcel var1) {
      float var2 = var1.readFloat();
      float var3 = var1.readFloat();
      float var4 = var1.readFloat();
      float var5 = var1.readFloat();
      float var6 = var1.readFloat();
      return new CameraPosition(new LatLng((double)var3, (double)var4), var6, var5, var2);
   }

   public CameraPosition[] newArray(int var1) {
      return new CameraPosition[var1];
   }
}
