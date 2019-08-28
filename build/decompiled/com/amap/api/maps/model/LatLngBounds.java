package com.amap.api.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.amap.api.mapcore.util.fi;

public final class LatLngBounds implements Parcelable {
   private static final String CLASSNAME = "LatLngBounds";
   public static final LatLngBoundsCreator CREATOR = new LatLngBoundsCreator();
   private final int mVersionCode;
   public final LatLng southwest;
   public final LatLng northeast;

   LatLngBounds(int var1, LatLng var2, LatLng var3) {
      boolean var4 = true;

      try {
         if (var2 == null) {
            throw new RuntimeRemoteException("null southwest");
         }

         if (var3 == null) {
            throw new RuntimeRemoteException("null northeast");
         }

         if (var3.latitude < var2.latitude) {
            throw new RuntimeRemoteException("southern latitude exceeds northern latitude (" + var2.latitude + " > " + var3.latitude + ")");
         }
      } catch (Throwable var6) {
         Log.e("LatLngBounds", "the structure parameters are illegal!");
         var6.printStackTrace();
         var4 = false;
      }

      this.mVersionCode = var4 ? var1 : 0;
      this.southwest = var4 ? var2 : null;
      this.northeast = var4 ? var3 : null;
   }

   public LatLngBounds(LatLng var1, LatLng var2) {
      this(1, var1, var2);
   }

   int a() {
      return this.mVersionCode;
   }

   public static LatLngBounds$Builder builder() {
      return new LatLngBounds$Builder();
   }

   public boolean contains(LatLng var1) {
      if (var1 == null) {
         return false;
      } else if (this.northeast != null && this.southwest != null) {
         return this.a(var1.latitude) && this.b(var1.longitude);
      } else {
         Log.e("LatLngBounds", "current LatLngBounds is invalid, please check the structure parameters are legal");
         return false;
      }
   }

   public boolean contains(LatLngBounds var1) {
      boolean var2 = false;
      if (var1 == null) {
         return var2;
      } else {
         if (this.contains(var1.southwest) && this.contains(var1.northeast)) {
            var2 = true;
         }

         return var2;
      }
   }

   public boolean intersects(LatLngBounds var1) {
      if (var1 == null) {
         return false;
      } else if (this.northeast != null && this.southwest != null) {
         return this.a(var1) || var1.a(this);
      } else {
         Log.e("LatLngBounds", "current LatLngBounds is invalid, please check the structure parameters are legal");
         return false;
      }
   }

   private boolean a(LatLngBounds var1) {
      if (var1 != null && var1.northeast != null && var1.southwest != null) {
         double var2 = var1.northeast.longitude + var1.southwest.longitude - this.northeast.longitude - this.southwest.longitude;
         double var4 = this.northeast.longitude - this.southwest.longitude + var1.northeast.longitude - this.southwest.longitude;
         double var6 = var1.northeast.latitude + var1.southwest.latitude - this.northeast.latitude - this.southwest.latitude;
         double var8 = this.northeast.latitude - this.southwest.latitude + var1.northeast.latitude - var1.southwest.latitude;
         return Math.abs(var2) < var4 && Math.abs(var6) < var8;
      } else {
         return false;
      }
   }

   public LatLngBounds including(LatLng var1) {
      if (var1 == null) {
         return this;
      } else if (this.northeast != null && this.southwest != null) {
         double var2 = Math.min(this.southwest.latitude, var1.latitude);
         double var4 = Math.max(this.northeast.latitude, var1.latitude);
         double var6 = this.northeast.longitude;
         double var8 = this.southwest.longitude;
         double var10 = var1.longitude;
         if (!this.b(var10)) {
            if (c(var8, var10) < d(var6, var10)) {
               var8 = var10;
            } else {
               var6 = var10;
            }
         }

         try {
            return new LatLngBounds(new LatLng(var2, var8, false), new LatLng(var4, var6, false));
         } catch (Throwable var13) {
            var13.printStackTrace();
            return this;
         }
      } else {
         Log.e("LatLngBounds", "current LatLngBounds is invalid, please check the structure parameters are legal");
         return this;
      }
   }

   private static double c(double var0, double var2) {
      return (var0 - var2 + 360.0D) % 360.0D;
   }

   private static double d(double var0, double var2) {
      return (var2 - var0 + 360.0D) % 360.0D;
   }

   private boolean a(double var1) {
      return this.southwest.latitude <= var1 && var1 <= this.northeast.latitude;
   }

   private boolean b(double var1) {
      if (this.southwest.longitude <= this.northeast.longitude) {
         return this.southwest.longitude <= var1 && var1 <= this.northeast.longitude;
      } else {
         return this.southwest.longitude <= var1 || var1 <= this.northeast.longitude;
      }
   }

   public int hashCode() {
      return fi.a(new Object[]{this.southwest, this.northeast});
   }

   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof LatLngBounds)) {
         return false;
      } else {
         LatLngBounds var2 = (LatLngBounds)var1;
         return this.southwest.equals(var2.southwest) && this.northeast.equals(var2.northeast);
      }
   }

   public String toString() {
      return fi.a(fi.a((String)"southwest", (Object)this.southwest), fi.a((String)"northeast", (Object)this.northeast));
   }

   public int describeContents() {
      return 0;
   }

   public void writeToParcel(Parcel var1, int var2) {
      LatLngBoundsCreator.a(this, var1, var2);
   }
}
