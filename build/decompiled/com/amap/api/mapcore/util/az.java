package com.amap.api.mapcore.util;

import android.content.Context;
import android.os.Bundle;
import com.amap.api.maps.LocationSource;
import com.amap.api.maps.LocationSource$OnLocationChangedListener;
import com.autonavi.amap.mapcore.Inner_3dMap_location;
import com.autonavi.amap.mapcore.Inner_3dMap_locationListener;
import com.autonavi.amap.mapcore.Inner_3dMap_locationOption;
import com.autonavi.amap.mapcore.Inner_3dMap_locationOption$Inner_3dMap_Enum_LocationMode;

public class az implements LocationSource, Inner_3dMap_locationListener {
   private Bundle c = null;
   private LocationSource$OnLocationChangedListener d;
   private ga e;
   private Inner_3dMap_locationOption f;
   boolean a = false;
   long b = 2000L;
   private Context g;

   public az(Context var1) {
      this.g = var1;
   }

   public void activate(LocationSource$OnLocationChangedListener var1) {
      this.d = var1;
      if (this.e == null) {
         this.e = new ga(this.g);
         this.f = new Inner_3dMap_locationOption();
         this.e.a((Inner_3dMap_locationListener)this);
         this.f.setInterval(this.b);
         this.f.setOnceLocation(this.a);
         this.f.setLocationMode(Inner_3dMap_locationOption$Inner_3dMap_Enum_LocationMode.Hight_Accuracy);
         this.e.a(this.f);
         this.e.a();
      }

   }

   public void deactivate() {
      this.d = null;
      if (this.e != null) {
         this.e.b();
         this.e.c();
      }

      this.e = null;
   }

   public void onLocationChanged(Inner_3dMap_location var1) {
      try {
         if (this.d != null && var1 != null) {
            this.c = var1.getExtras();
            if (this.c == null) {
               this.c = new Bundle();
            }

            this.c.putInt("errorCode", var1.getErrorCode());
            this.c.putString("errorInfo", var1.getErrorInfo());
            this.c.putInt("locationType", var1.getLocationType());
            this.c.putFloat("Accuracy", var1.getAccuracy());
            this.c.putString("AdCode", var1.getAdCode());
            this.c.putString("Address", var1.getAddress());
            this.c.putString("AoiName", var1.getAoiName());
            this.c.putString("City", var1.getCity());
            this.c.putString("CityCode", var1.getCityCode());
            this.c.putString("Country", var1.getCountry());
            this.c.putString("District", var1.getDistrict());
            this.c.putString("Street", var1.getStreet());
            this.c.putString("StreetNum", var1.getStreetNum());
            this.c.putString("PoiName", var1.getPoiName());
            this.c.putString("Province", var1.getProvince());
            this.c.putFloat("Speed", var1.getSpeed());
            this.c.putString("Floor", var1.getFloor());
            this.c.putFloat("Bearing", var1.getBearing());
            this.c.putString("BuildingId", var1.getBuildingId());
            this.c.putDouble("Altitude", var1.getAltitude());
            var1.setExtras(this.c);
            this.d.onLocationChanged(var1);
         }
      } catch (Throwable var3) {
         var3.printStackTrace();
      }

   }

   public void a(long var1) {
      if (this.f != null && this.e != null && this.f.getInterval() != var1) {
         this.f.setInterval(var1);
         this.e.a(this.f);
      }

      this.b = var1;
   }

   public void a(int var1) {
      if (var1 != 1 && var1 != 0) {
         this.a(false);
      } else {
         this.a(true);
      }

   }

   private void a(boolean var1) {
      if (this.f != null && this.e != null) {
         this.e.c();
         this.e = new ga(this.g);
         this.e.a((Inner_3dMap_locationListener)this);
         this.f.setOnceLocation(var1);
         if (!var1) {
            this.f.setInterval(this.b);
         }

         this.e.a(this.f);
         this.e.a();
      }

      this.a = var1;
   }
}
