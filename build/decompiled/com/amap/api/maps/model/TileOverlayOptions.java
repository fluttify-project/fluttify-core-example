package com.amap.api.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

public final class TileOverlayOptions implements Parcelable {
   public static final TileOverlayOptionsCreator CREATOR = new TileOverlayOptionsCreator();
   private final int mVersionCode;
   private TileProvider mTileProvider;
   private boolean mVisible = true;
   private float mZIndex;
   private int memCacheSize = 5242880;
   private long diskCacheSize = 20971520L;
   private String diskCacheDir = null;
   private boolean memoryCacheEnabled = true;
   private boolean diskCacheEnabled = true;

   public TileOverlayOptions() {
      this.mVersionCode = 1;
   }

   TileOverlayOptions(int var1, IBinder var2, boolean var3, float var4) {
      this.mVersionCode = var1;
      this.mVisible = var3;
      this.mZIndex = var4;
   }

   public int describeContents() {
      return 0;
   }

   public void writeToParcel(Parcel var1, int var2) {
      var1.writeInt(this.mVersionCode);
      var1.writeValue(this.mTileProvider);
      var1.writeByte((byte)(this.mVisible ? 1 : 0));
      var1.writeFloat(this.mZIndex);
      var1.writeInt(this.memCacheSize);
      var1.writeLong(this.diskCacheSize);
      var1.writeString(this.diskCacheDir);
      var1.writeByte((byte)(this.memoryCacheEnabled ? 1 : 0));
      var1.writeByte((byte)(this.diskCacheEnabled ? 1 : 0));
   }

   public TileOverlayOptions tileProvider(TileProvider var1) {
      this.mTileProvider = var1;
      return this;
   }

   public TileOverlayOptions zIndex(float var1) {
      this.mZIndex = var1;
      return this;
   }

   public TileOverlayOptions visible(boolean var1) {
      this.mVisible = var1;
      return this;
   }

   public TileOverlayOptions memCacheSize(int var1) {
      this.memCacheSize = var1;
      return this;
   }

   public TileOverlayOptions diskCacheSize(int var1) {
      this.diskCacheSize = (long)(var1 * 1024);
      return this;
   }

   public TileOverlayOptions diskCacheDir(String var1) {
      this.diskCacheDir = var1;
      return this;
   }

   public TileOverlayOptions memoryCacheEnabled(boolean var1) {
      this.memoryCacheEnabled = var1;
      return this;
   }

   public TileOverlayOptions diskCacheEnabled(boolean var1) {
      this.diskCacheEnabled = var1;
      return this;
   }

   public TileProvider getTileProvider() {
      return this.mTileProvider;
   }

   public float getZIndex() {
      return this.mZIndex;
   }

   public boolean isVisible() {
      return this.mVisible;
   }

   public int getMemCacheSize() {
      return this.memCacheSize;
   }

   public long getDiskCacheSize() {
      return this.diskCacheSize;
   }

   public String getDiskCacheDir() {
      return this.diskCacheDir;
   }

   public boolean getMemoryCacheEnabled() {
      return this.memoryCacheEnabled;
   }

   public boolean getDiskCacheEnabled() {
      return this.diskCacheEnabled;
   }
}
