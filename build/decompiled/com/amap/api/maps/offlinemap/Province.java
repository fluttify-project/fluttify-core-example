package com.amap.api.maps.offlinemap;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class Province implements Parcelable {
   private String a = "";
   private String b;
   private String c;
   private String d = "";
   public static final Creator<Province> CREATOR = new Province$1();

   public Province() {
   }

   public String getProvinceName() {
      return this.a;
   }

   public String getJianpin() {
      return this.b;
   }

   public String getPinyin() {
      return this.c;
   }

   public void setProvinceName(String var1) {
      this.a = var1;
   }

   public void setJianpin(String var1) {
      this.b = var1;
   }

   public void setPinyin(String var1) {
      this.c = var1;
   }

   public void setProvinceCode(String var1) {
      this.d = var1;
   }

   public String getProvinceCode() {
      return this.d;
   }

   public int describeContents() {
      return 0;
   }

   public void writeToParcel(Parcel var1, int var2) {
      var1.writeString(this.a);
      var1.writeString(this.b);
      var1.writeString(this.c);
      var1.writeString(this.d);
   }

   public Province(Parcel var1) {
      this.a = var1.readString();
      this.b = var1.readString();
      this.c = var1.readString();
      this.d = var1.readString();
   }
}
