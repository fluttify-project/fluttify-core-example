package com.amap.api.maps.model;

import android.os.Parcel;
import android.os.Parcelable;

public class TileProjection implements Parcelable {
   public static final TileProjection CREATOR = new TileProjection(0, 0, 0, 0, 0, 0);
   public final int offsetX;
   public final int offsetY;
   public final int minX;
   public final int maxX;
   public final int minY;
   public final int maxY;

   public TileProjection(int var1, int var2, int var3, int var4, int var5, int var6) {
      this.offsetX = var1;
      this.offsetY = var2;
      this.minX = var3;
      this.maxX = var4;
      this.minY = var5;
      this.maxY = var6;
   }

   public int describeContents() {
      return 0;
   }

   public void writeToParcel(Parcel var1, int var2) {
      var1.writeInt(this.offsetX);
      var1.writeInt(this.offsetY);
      var1.writeInt(this.minX);
      var1.writeInt(this.maxX);
      var1.writeInt(this.maxX);
      var1.writeInt(this.maxY);
   }
}
