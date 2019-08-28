package com.amap.api.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public class TileOverlayOptionsCreator implements Creator<TileOverlayOptions> {
   public static final int CONTENT_DESCRIPTION = 0;

   public TileOverlayOptionsCreator() {
   }

   public TileOverlayOptions createFromParcel(Parcel var1) {
      int var2 = var1.readInt();
      TileProvider var3 = (TileProvider)var1.readValue(TileProvider.class.getClassLoader());
      boolean var4 = var1.readByte() != 0;
      float var5 = var1.readFloat();
      int var6 = var1.readInt();
      int var7 = var1.readInt();
      String var8 = var1.readString();
      boolean var9 = var1.readByte() != 0;
      boolean var10 = var1.readByte() != 0;
      TileOverlayOptions var11 = new TileOverlayOptions(var2, (IBinder)null, var4, var5);
      if (var3 != null) {
         var11.tileProvider(var3);
      }

      var11.memCacheSize(var6);
      var11.diskCacheSize(var7);
      var11.diskCacheDir(var8);
      var11.memoryCacheEnabled(var9);
      var11.diskCacheEnabled(var10);
      return var11;
   }

   public TileOverlayOptions[] newArray(int var1) {
      return new TileOverlayOptions[var1];
   }
}
