package com.amap.api.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public class TileProjectionCreator implements Creator<TileProjection> {
   public TileProjectionCreator() {
   }

   public TileProjection createFromParcel(Parcel var1) {
      TileProjection var2 = new TileProjection(var1.readInt(), var1.readInt(), var1.readInt(), var1.readInt(), var1.readInt(), var1.readInt());
      return var2;
   }

   public TileProjection[] newArray(int var1) {
      return new TileProjection[var1];
   }
}
