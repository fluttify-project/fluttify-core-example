package com.amap.api.maps.model;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public class ArcOptionsCreator implements Creator<ArcOptions> {
   public ArcOptionsCreator() {
   }

   public ArcOptions createFromParcel(Parcel var1) {
      ArcOptions var2 = new ArcOptions();
      Bundle var3 = var1.readBundle();
      LatLng var4 = new LatLng(var3.getDouble("startlat"), var3.getDouble("startlng"));
      LatLng var5 = new LatLng(var3.getDouble("passedlat"), var3.getDouble("passedlng"));
      LatLng var6 = new LatLng(var3.getDouble("endlat"), var3.getDouble("endlng"));
      var2.point(var4, var5, var6);
      var2.strokeWidth(var1.readFloat());
      var2.strokeColor(var1.readInt());
      var2.zIndex(var1.readFloat());
      var2.visible(var1.readByte() == 1);
      var2.a = var1.readString();
      return var2;
   }

   public ArcOptions[] newArray(int var1) {
      return new ArcOptions[var1];
   }
}
