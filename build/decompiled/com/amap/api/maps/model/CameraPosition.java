package com.amap.api.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.amap.api.mapcore.util.fb;
import com.amap.api.mapcore.util.fi;

public final class CameraPosition implements Parcelable {
   private static final String CLASSNAME = "CameraPosition";
   public static final CameraPositionCreator CREATOR = new CameraPositionCreator();
   public final LatLng target;
   public final float zoom;
   public final float tilt;
   public final float bearing;
   public final boolean isAbroad;

   public CameraPosition(LatLng var1, float var2, float var3, float var4) {
      if (var1 == null) {
         Log.w("CameraPosition", "构建CameraPosition时,位置(target)不能为null");
      }

      this.target = var1;
      this.zoom = var2;
      this.tilt = var3;
      this.bearing = ((double)var4 <= 0.0D ? var4 % 360.0F + 360.0F : var4) % 360.0F;
      if (var1 != null) {
         this.isAbroad = !fb.a(var1.latitude, var1.longitude);
      } else {
         this.isAbroad = false;
      }

   }

   public void writeToParcel(Parcel var1, int var2) {
      var1.writeFloat(this.bearing);
      var1.writeFloat((float)this.target.latitude);
      var1.writeFloat((float)this.target.longitude);
      var1.writeFloat(this.tilt);
      var1.writeFloat(this.zoom);
   }

   public int describeContents() {
      return 0;
   }

   public int hashCode() {
      return super.hashCode();
   }

   public static final CameraPosition fromLatLngZoom(LatLng var0, float var1) {
      return new CameraPosition(var0, var1, 0.0F, 0.0F);
   }

   public static CameraPosition$Builder builder() {
      return new CameraPosition$Builder();
   }

   public static CameraPosition$Builder builder(CameraPosition var0) {
      return new CameraPosition$Builder(var0);
   }

   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof CameraPosition)) {
         return false;
      } else {
         CameraPosition var2 = (CameraPosition)var1;
         return this.target.equals(var2.target) && Float.floatToIntBits(this.zoom) == Float.floatToIntBits(var2.zoom) && Float.floatToIntBits(this.tilt) == Float.floatToIntBits(var2.tilt) && Float.floatToIntBits(this.bearing) == Float.floatToIntBits(var2.bearing);
      }
   }

   public String toString() {
      return fi.a(fi.a((String)"target", (Object)this.target), fi.a((String)"zoom", (Object)this.zoom), fi.a((String)"tilt", (Object)this.tilt), fi.a((String)"bearing", (Object)this.bearing));
   }
}
