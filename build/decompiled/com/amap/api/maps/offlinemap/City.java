package com.amap.api.maps.offlinemap;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class City implements Parcelable {
   private String a = "";
   private String b = "";
   private String c;
   private String d;
   private String e = "";
   public static final Creator<City> CREATOR = new City$1();

   public City() {
   }

   public void setCity(String var1) {
      this.a = var1;
   }

   public String getCity() {
      return this.a;
   }

   public void setCode(String var1) {
      String var2 = "[]";
      if (var1 != null && !var2.equals(var1)) {
         this.b = var1;
      }

   }

   public String getCode() {
      return this.b;
   }

   public String getJianpin() {
      return this.c;
   }

   public void setJianpin(String var1) {
      this.c = var1;
   }

   public String getPinyin() {
      return this.d;
   }

   public void setPinyin(String var1) {
      this.d = var1;
   }

   public String getAdcode() {
      return this.e;
   }

   public void setAdcode(String var1) {
      this.e = var1;
   }

   public int describeContents() {
      return 0;
   }

   public void writeToParcel(Parcel var1, int var2) {
      var1.writeString(this.a);
      var1.writeString(this.b);
      var1.writeString(this.c);
      var1.writeString(this.d);
      var1.writeString(this.e);
   }

   public City(Parcel var1) {
      this.a = var1.readString();
      this.b = var1.readString();
      this.c = var1.readString();
      this.d = var1.readString();
      this.e = var1.readString();
   }
}
