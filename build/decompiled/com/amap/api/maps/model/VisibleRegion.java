package com.amap.api.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.mapcore.util.fi;

public final class VisibleRegion implements Parcelable {
   public static final VisibleRegionCreator CREATOR = new VisibleRegionCreator();
   private final int mVersionCode;
   public final LatLng nearLeft;
   public final LatLng nearRight;
   public final LatLng farLeft;
   public final LatLng farRight;
   public final LatLngBounds latLngBounds;

   VisibleRegion(int var1, LatLng var2, LatLng var3, LatLng var4, LatLng var5, LatLngBounds var6) {
      this.mVersionCode = var1;
      this.nearLeft = var2;
      this.nearRight = var3;
      this.farLeft = var4;
      this.farRight = var5;
      this.latLngBounds = var6;
   }

   public VisibleRegion(LatLng var1, LatLng var2, LatLng var3, LatLng var4, LatLngBounds var5) {
      this(1, var1, var2, var3, var4, var5);
   }

   public void writeToParcel(Parcel var1, int var2) {
      VisibleRegionCreator.a(this, var1, var2);
   }

   public int describeContents() {
      return 0;
   }

   public int hashCode() {
      return fi.a(new Object[]{this.nearLeft, this.nearRight, this.farLeft, this.farRight, this.latLngBounds});
   }

   int a() {
      return this.mVersionCode;
   }

   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof VisibleRegion)) {
         return false;
      } else {
         VisibleRegion var2 = (VisibleRegion)var1;
         return this.nearLeft.equals(var2.nearLeft) && this.nearRight.equals(var2.nearRight) && this.farLeft.equals(var2.farLeft) && this.farRight.equals(var2.farRight) && this.latLngBounds.equals(var2.latLngBounds);
      }
   }

   public String toString() {
      return fi.a(fi.a((String)"nearLeft", (Object)this.nearLeft), fi.a((String)"nearRight", (Object)this.nearRight), fi.a((String)"farLeft", (Object)this.farLeft), fi.a((String)"farRight", (Object)this.farRight), fi.a((String)"latLngBounds", (Object)this.latLngBounds));
   }
}
