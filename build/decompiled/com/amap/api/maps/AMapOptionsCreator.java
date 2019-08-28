package com.amap.api.maps;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.amap.api.maps.model.CameraPosition;

public class AMapOptionsCreator implements Creator<AMapOptions> {
   public AMapOptionsCreator() {
   }

   public AMapOptions createFromParcel(Parcel var1) {
      AMapOptions var2 = new AMapOptions();
      CameraPosition var3 = (CameraPosition)var1.readParcelable(CameraPosition.class.getClassLoader());
      var2.mapType(var1.readInt());
      var2.camera(var3);
      boolean[] var4 = var1.createBooleanArray();
      byte var5 = 6;
      if (var4 != null && var4.length >= var5) {
         var2.rotateGesturesEnabled(var4[0]);
         var2.scrollGesturesEnabled(var4[1]);
         var2.tiltGesturesEnabled(var4[2]);
         var2.zoomGesturesEnabled(var4[3]);
         var2.zoomControlsEnabled(var4[4]);
         var2.zOrderOnTop(var4[5]);
         var2.compassEnabled(var4[6]);
         var2.scaleControlsEnabled(var4[7]);
      }

      return var2;
   }

   public AMapOptions[] newArray(int var1) {
      return new AMapOptions[var1];
   }
}
