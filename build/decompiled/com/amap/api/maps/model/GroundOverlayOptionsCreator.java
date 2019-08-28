package com.amap.api.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public class GroundOverlayOptionsCreator implements Creator<GroundOverlayOptions> {
   public static final int CONTENT_DESCRIPTION = 0;

   public GroundOverlayOptionsCreator() {
   }

   public GroundOverlayOptions createFromParcel(Parcel var1) {
      int var2 = var1.readInt();
      BitmapDescriptor var3 = (BitmapDescriptor)var1.readParcelable(BitmapDescriptor.class.getClassLoader());
      LatLng var4 = (LatLng)var1.readParcelable(LatLng.class.getClassLoader());
      float var5 = var1.readFloat();
      float var6 = var1.readFloat();
      LatLngBounds var7 = (LatLngBounds)var1.readParcelable(LatLngBounds.class.getClassLoader());
      float var8 = var1.readFloat();
      float var9 = var1.readFloat();
      boolean var10 = var1.readByte() != 0;
      float var11 = var1.readFloat();
      float var12 = var1.readFloat();
      float var13 = var1.readFloat();
      GroundOverlayOptions var14 = new GroundOverlayOptions(var2, (IBinder)null, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13);
      var14.image(var3);
      return var14;
   }

   public GroundOverlayOptions[] newArray(int var1) {
      return new GroundOverlayOptions[var1];
   }
}
