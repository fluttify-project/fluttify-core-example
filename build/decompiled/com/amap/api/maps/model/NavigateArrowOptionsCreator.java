package com.amap.api.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.ArrayList;

public class NavigateArrowOptionsCreator implements Creator<NavigateArrowOptions> {
   public NavigateArrowOptionsCreator() {
   }

   public NavigateArrowOptions createFromParcel(Parcel var1) {
      NavigateArrowOptions var2 = new NavigateArrowOptions();
      ArrayList var3 = new ArrayList();
      var1.readTypedList(var3, LatLng.CREATOR);
      float var4 = var1.readFloat();
      int var5 = var1.readInt();
      int var6 = var1.readInt();
      float var7 = var1.readFloat();
      byte var8 = var1.readByte();
      boolean var9 = var8 == 1;
      var8 = var1.readByte();
      boolean var10 = var8 == 1;
      var2.addAll(var3);
      var2.width(var4);
      var2.topColor(var5);
      var2.sideColor(var6);
      var2.zIndex(var7);
      var2.visible(var9);
      var2.a = var1.readString();
      var2.set3DModel(var10);
      return var2;
   }

   public NavigateArrowOptions[] newArray(int var1) {
      return new NavigateArrowOptions[var1];
   }
}
