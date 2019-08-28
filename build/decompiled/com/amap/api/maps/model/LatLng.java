package com.amap.api.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.maps.AMapException;

public final class LatLng implements Parcelable, Cloneable {
   public static final LatLngCreator CREATOR = new LatLngCreator();
   public final double latitude;
   public final double longitude;

   public LatLng(double var1, double var3) {
      this(var1, var3, true);
   }

   public LatLng(double var1, double var3, boolean var5) {
      if (var5) {
         double var6 = -180.0D;
         double var8 = 180.0D;
         double var10 = -90.0D;
         double var12 = 90.0D;
         if (var6 <= var3 && var3 < var8) {
            this.longitude = var3;
         } else {
            this.longitude = ((var3 - 180.0D) % 360.0D + 360.0D) % 360.0D - 180.0D;
         }

         if (var1 < var10 || var1 > var12) {
            try {
               throw new AMapException("非法坐标值");
            } catch (AMapException var15) {
               var15.printStackTrace();
            }
         }

         this.latitude = Math.max(var10, Math.min(var12, var1));
      } else {
         this.latitude = var1;
         this.longitude = var3;
      }

   }

   public LatLng clone() {
      return new LatLng(this.latitude, this.longitude);
   }

   public int hashCode() {
      byte var1 = 31;
      byte var2 = 1;
      long var3 = Double.doubleToLongBits(this.latitude);
      int var5 = var1 * var2 + (int)(var3 ^ var3 >>> 32);
      var3 = Double.doubleToLongBits(this.longitude);
      var5 = var1 * var5 + (int)(var3 ^ var3 >>> 32);
      return var5;
   }

   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof LatLng)) {
         return false;
      } else {
         LatLng var2 = (LatLng)var1;
         return Double.doubleToLongBits(this.latitude) == Double.doubleToLongBits(var2.latitude) && Double.doubleToLongBits(this.longitude) == Double.doubleToLongBits(var2.longitude);
      }
   }

   public String toString() {
      return "lat/lng: (" + this.latitude + "," + this.longitude + ")";
   }

   public int describeContents() {
      return 0;
   }

   public void writeToParcel(Parcel var1, int var2) {
      var1.writeDouble(this.longitude);
      var1.writeDouble(this.latitude);
   }
}
