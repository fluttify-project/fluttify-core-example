package com.amap.api.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.ArrayList;

public class PolylineOptionsCreator implements Creator<PolylineOptions> {
   public PolylineOptionsCreator() {
   }

   public PolylineOptions createFromParcel(Parcel var1) {
      PolylineOptions var2 = new PolylineOptions();
      ArrayList var3 = new ArrayList();
      var1.readTypedList(var3, LatLng.CREATOR);
      float var4 = var1.readFloat();
      int var5 = var1.readInt();
      int var6 = var1.readInt();
      float var7 = var1.readFloat();
      float var8 = var1.readFloat();
      var2.a = var1.readString();
      var2.lineCapType(PolylineOptions$LineCapType.valueOf(var1.readInt()));
      var2.lineJoinType(PolylineOptions$LineJoinType.valueOf(var1.readInt()));
      boolean[] var9 = new boolean[5];
      var1.readBooleanArray(var9);
      BitmapDescriptor var10 = (BitmapDescriptor)var1.readParcelable(BitmapDescriptor.class.getClassLoader());
      var2.addAll(var3);
      var2.width(var4);
      var2.color(var5);
      var2.setDottedLineType(var6);
      var2.zIndex(var7);
      var2.transparency(var8);
      var2.visible(var9[0]);
      var2.setDottedLine(var9[1]);
      var2.geodesic(var9[2]);
      var2.useGradient(var9[3]);
      var2.aboveMaskLayer(var9[4]);
      var2.setCustomTexture(var10);
      ArrayList var11 = var1.readArrayList(BitmapDescriptor.class.getClassLoader());
      var2.setCustomTextureList(var11);
      ArrayList var12 = var1.readArrayList(Integer.class.getClassLoader());
      var2.setCustomTextureIndex(var12);
      ArrayList var13 = var1.readArrayList(Integer.class.getClassLoader());
      var2.colorValues(var13);
      var2.setShownRatio(var1.readFloat());
      return var2;
   }

   public PolylineOptions[] newArray(int var1) {
      return new PolylineOptions[var1];
   }
}
