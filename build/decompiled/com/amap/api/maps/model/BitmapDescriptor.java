package com.amap.api.maps.model;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Build.VERSION;

public final class BitmapDescriptor implements Parcelable, Cloneable {
   public static final BitmapDescriptorCreator CREATOR = new BitmapDescriptorCreator();
   int a = 0;
   int b = 0;
   Bitmap c;
   private String mId;

   BitmapDescriptor(Bitmap var1, String var2) {
      if (var1 != null) {
         this.a = var1.getWidth();
         this.b = var1.getHeight();
         if (var1.getConfig() == null) {
            this.c = var1.copy(Config.ARGB_8888, true);
         } else {
            this.c = var1.copy(var1.getConfig(), true);
         }

         this.mId = var2;
      }

   }

   private BitmapDescriptor(Bitmap var1, int var2, int var3, String var4) {
      this.a = var2;
      this.b = var3;
      this.c = var1;
      this.mId = var4;
   }

   public String getId() {
      return this.mId;
   }

   public BitmapDescriptor clone() {
      try {
         BitmapDescriptor var1 = new BitmapDescriptor(this.c.copy(this.c.getConfig(), true), this.a, this.b, this.mId);
         return var1;
      } catch (Throwable var2) {
         var2.printStackTrace();
         return null;
      }
   }

   public Bitmap getBitmap() {
      return this.c;
   }

   public int getWidth() {
      return this.a;
   }

   public int getHeight() {
      return this.b;
   }

   public int describeContents() {
      return 0;
   }

   public void writeToParcel(Parcel var1, int var2) {
      var1.writeString(this.mId);
      var1.writeParcelable(this.c, var2);
      var1.writeInt(this.a);
      var1.writeInt(this.b);
   }

   public void recycle() {
      if (this.c != null && !this.c.isRecycled()) {
         if (VERSION.SDK_INT <= 10) {
            this.c.recycle();
         }

         this.c = null;
      }

   }

   public boolean equals(Object var1) {
      if (this.c != null && !this.c.isRecycled()) {
         if (var1 == null) {
            return false;
         } else if (this == var1) {
            return true;
         } else if (this.getClass() != var1.getClass()) {
            return false;
         } else {
            BitmapDescriptor var2 = (BitmapDescriptor)var1;
            if (var2.c != null && !var2.c.isRecycled()) {
               if (this.a == var2.getWidth() && this.b == var2.getHeight()) {
                  try {
                     return this.c.sameAs(var2.c);
                  } catch (Throwable var4) {
                     return false;
                  }
               } else {
                  return false;
               }
            } else {
               return false;
            }
         }
      } else {
         return false;
      }
   }

   public int hashCode() {
      return super.hashCode();
   }
}
