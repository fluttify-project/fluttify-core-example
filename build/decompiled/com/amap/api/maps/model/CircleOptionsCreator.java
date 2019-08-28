package com.amap.api.maps.model;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.ArrayList;

public class CircleOptionsCreator implements Creator<CircleOptions> {
   public CircleOptionsCreator() {
   }

   public CircleOptions createFromParcel(Parcel var1) {
      CircleOptions var2 = new CircleOptions();
      Bundle var3 = var1.readBundle();
      LatLng var4 = new LatLng(var3.getDouble("lat"), var3.getDouble("lng"));
      var2.center(var4);
      var2.radius(var1.readDouble());
      var2.strokeWidth(var1.readFloat());
      var2.strokeColor(var1.readInt());
      var2.fillColor(var1.readInt());
      var2.zIndex(var1.readFloat());
      var2.visible(var1.readByte() == 1);
      var2.a = var1.readString();
      ArrayList var5 = new ArrayList();
      var1.readList(var5, BaseHoleOptions.class.getClassLoader());
      var2.addHoles((Iterable)var5);
      var2.setStrokeDottedLineType(var1.readInt());
      return var2;
   }

   public CircleOptions[] newArray(int var1) {
      return new CircleOptions[var1];
   }
}
