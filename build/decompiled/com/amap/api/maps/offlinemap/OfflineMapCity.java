package com.amap.api.maps.offlinemap;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public class OfflineMapCity extends City {
   private String a = "";
   private long b = 0L;
   private int c = 6;
   private String d = "";
   private int e = 0;
   public static final Creator<OfflineMapCity> CREATOR = new OfflineMapCity$1();

   public OfflineMapCity() {
   }

   public String getUrl() {
      return this.a;
   }

   public void setUrl(String var1) {
      this.a = var1;
   }

   public long getSize() {
      return this.b;
   }

   public void setSize(long var1) {
      this.b = var1;
   }

   public int getState() {
      return this.c;
   }

   public void setState(int var1) {
      this.c = var1;
   }

   public String getVersion() {
      return this.d;
   }

   public void setVersion(String var1) {
      this.d = var1;
   }

   public int getcompleteCode() {
      return this.e;
   }

   public void setCompleteCode(int var1) {
      this.e = var1;
   }

   public int describeContents() {
      return 0;
   }

   public void writeToParcel(Parcel var1, int var2) {
      super.writeToParcel(var1, var2);
      var1.writeString(this.a);
      var1.writeLong(this.b);
      var1.writeInt(this.c);
      var1.writeString(this.d);
      var1.writeInt(this.e);
   }

   public OfflineMapCity(Parcel var1) {
      super(var1);
      this.a = var1.readString();
      this.b = var1.readLong();
      this.c = var1.readInt();
      this.d = var1.readString();
      this.e = var1.readInt();
   }
}
