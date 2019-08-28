package com.amap.api.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;

class b implements Creator<Tile> {
   b() {
   }

   public Tile a(Parcel var1) {
      int var2 = var1.readInt();
      int var3 = var1.readInt();
      int var4 = var1.readInt();
      byte[] var5 = var1.createByteArray();
      return new Tile(var2, var3, var4, var5);
   }

   public Tile[] a(int var1) {
      return new Tile[var1];
   }
}
