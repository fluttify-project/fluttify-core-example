package com.amap.api.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.autonavi.ae.gmap.maploader.Pools$SynchronizedPool;

public final class Tile implements Parcelable {
   public static final b CREATOR = new b();
   private final int mVersionCode;
   public final int width;
   public final int height;
   public final byte[] data;
   private static final Pools$SynchronizedPool<Tile> M_POOL = new Pools$SynchronizedPool(18);

   public static Tile obtain(int var0, int var1, byte[] var2) {
      Tile var3 = (Tile)M_POOL.acquire();
      return var3 != null ? var3 : new Tile(var0, var1, var2);
   }

   public void recycle() {
      M_POOL.release(this);
   }

   Tile(int var1, int var2, int var3, byte[] var4) {
      this.mVersionCode = var1;
      this.width = var2;
      this.height = var3;
      this.data = var4;
   }

   public Tile(int var1, int var2, byte[] var3) {
      this(1, var1, var2, var3);
   }

   public int describeContents() {
      return 0;
   }

   public void writeToParcel(Parcel var1, int var2) {
      var1.writeInt(this.mVersionCode);
      var1.writeInt(this.width);
      var1.writeInt(this.height);
      var1.writeByteArray(this.data);
   }
}
