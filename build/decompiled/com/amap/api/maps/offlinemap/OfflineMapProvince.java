package com.amap.api.maps.offlinemap;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.ArrayList;
import java.util.Iterator;

public class OfflineMapProvince extends Province {
   private String a;
   private int b = 6;
   private long c;
   private String d;
   private int e = 0;
   private ArrayList<OfflineMapCity> f;
   public static final Creator<OfflineMapProvince> CREATOR = new OfflineMapProvince$1();

   public OfflineMapProvince() {
   }

   public String getUrl() {
      return this.a;
   }

   public void setUrl(String var1) {
      this.a = var1;
   }

   public int getState() {
      return this.b;
   }

   public void setState(int var1) {
      this.b = var1;
   }

   public long getSize() {
      return this.c;
   }

   public void setSize(long var1) {
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
      var1.writeInt(this.b);
      var1.writeLong(this.c);
      var1.writeString(this.d);
      var1.writeInt(this.e);
      var1.writeTypedList(this.f);
   }

   public ArrayList<OfflineMapCity> getCityList() {
      return this.f == null ? new ArrayList() : this.f;
   }

   public ArrayList<OfflineMapCity> getDownloadedCityList() {
      ArrayList var1 = new ArrayList();
      if (this.f == null) {
         return var1;
      } else {
         Iterator var2 = this.f.iterator();

         while(var2.hasNext()) {
            OfflineMapCity var3 = (OfflineMapCity)var2.next();
            int var4 = var3.getState();
            if (var4 != 6) {
               var1.add(var3);
            }
         }

         return var1;
      }
   }

   public void setCityList(ArrayList<OfflineMapCity> var1) {
      this.f = var1;
   }

   public OfflineMapProvince(Parcel var1) {
      super(var1);
      this.a = var1.readString();
      this.b = var1.readInt();
      this.c = var1.readLong();
      this.d = var1.readString();
      this.e = var1.readInt();
      this.f = var1.createTypedArrayList(OfflineMapCity.CREATOR);
   }
}
