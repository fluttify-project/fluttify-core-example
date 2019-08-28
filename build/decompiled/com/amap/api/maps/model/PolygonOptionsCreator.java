package com.amap.api.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.ArrayList;

public class PolygonOptionsCreator implements Creator<PolygonOptions> {
   public static final int CONTENT_DESCRIPTION = 0;

   public PolygonOptionsCreator() {
   }

   public PolygonOptions createFromParcel(Parcel var1) {
      PolygonOptions var2 = new PolygonOptions();
      ArrayList var3 = new ArrayList();
      var1.readTypedList(var3, LatLng.CREATOR);
      float var4 = var1.readFloat();
      int var5 = var1.readInt();
      int var6 = var1.readInt();
      float var7 = var1.readFloat();
      byte var8 = var1.readByte();
      boolean var9 = var8 == 1;
      LatLng[] var10 = new LatLng[var3.size()];

      for(int var11 = 0; var11 < var3.size(); ++var11) {
         var10[var11] = (LatLng)var3.get(var11);
      }

      var2.add(var10);
      var2.strokeWidth(var4);
      var2.strokeColor(var5);
      var2.fillColor(var6);
      var2.zIndex(var7);
      var2.visible(var9);
      var2.a = var1.readString();
      ArrayList var12 = new ArrayList();
      var1.readList(var12, BaseHoleOptions.class.getClassLoader());
      var2.addHoles((Iterable)var12);
      return var2;
   }

   public PolygonOptions[] newArray(int var1) {
      return new PolygonOptions[var1];
   }
}
