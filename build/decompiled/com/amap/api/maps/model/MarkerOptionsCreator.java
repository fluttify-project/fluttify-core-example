package com.amap.api.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.ArrayList;

public class MarkerOptionsCreator implements Creator<MarkerOptions> {
   public MarkerOptionsCreator() {
   }

   public MarkerOptions createFromParcel(Parcel var1) {
      MarkerOptions var2 = new MarkerOptions();
      LatLng var3 = (LatLng)var1.readParcelable(LatLng.class.getClassLoader());
      var2.position(var3);
      var2.title(var1.readString());
      var2.snippet(var1.readString());
      var2.anchor(var1.readFloat(), var1.readFloat());
      var2.setInfoWindowOffset(var1.readInt(), var1.readInt());
      boolean[] var4 = new boolean[8];
      var1.readBooleanArray(var4);
      var2.visible(var4[0]);
      var2.draggable(var4[1]);
      var2.setGps(var4[2]);
      var2.setFlat(var4[3]);
      var2.autoOverturnInfoWindow(var4[4]);
      var2.infoWindowEnable(var4[5]);
      var2.belowMaskLayer(var4[6]);
      var2.setRotatingMode(var4[7]);
      var2.a = var1.readString();
      var2.period(var1.readInt());
      ArrayList var5 = var1.readArrayList(BitmapDescriptor.class.getClassLoader());
      var2.icons(var5);
      var2.zIndex(var1.readFloat());
      var2.alpha(var1.readFloat());
      var2.displayLevel(var1.readInt());
      var2.rotateAngle(var1.readFloat());
      BitmapDescriptor var6 = (BitmapDescriptor)var1.readParcelable(BitmapDescriptor.class.getClassLoader());
      if (var6 != null) {
         var2.icon(var6);
      }

      return var2;
   }

   public MarkerOptions[] newArray(int var1) {
      return new MarkerOptions[var1];
   }
}
