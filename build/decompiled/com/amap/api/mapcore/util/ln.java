package com.amap.api.mapcore.util;

import com.amap.api.location.AMapLocation;
import com.amap.api.location.AMapLocationClient;
import com.amap.api.location.AMapLocationClientOption;
import com.amap.api.location.AMapLocationClientOption.AMapLocationMode;
import com.autonavi.amap.mapcore.Inner_3dMap_location;
import com.autonavi.amap.mapcore.Inner_3dMap_locationListener;
import com.autonavi.amap.mapcore.Inner_3dMap_locationOption;

public final class ln {
   public static Inner_3dMap_location a = null;
   ll b = null;

   public ln() {
   }

   public static void a(Object var0, Inner_3dMap_locationOption var1) {
      if (var0 != null) {
         AMapLocationClientOption var2 = a(var1);
         ((AMapLocationClient)var0).setLocationOption(var2);
      }
   }

   private static AMapLocationClientOption a(Inner_3dMap_locationOption var0) {
      AMapLocationClientOption var1;
      (var1 = new AMapLocationClientOption()).setInterval(var0.getInterval());
      AMapLocationMode var10000 = AMapLocationMode.Hight_Accuracy;
      AMapLocationMode var2;
      switch(ln$1.a[var0.getLocationMode().ordinal()]) {
      case 1:
         var2 = AMapLocationMode.Battery_Saving;
         break;
      case 2:
         var2 = AMapLocationMode.Device_Sensors;
         break;
      case 3:
         var2 = AMapLocationMode.Hight_Accuracy;
         break;
      default:
         var2 = AMapLocationMode.Hight_Accuracy;
      }

      var1.setLocationMode(var2);
      var1.setOnceLocation(var0.isOnceLocation());
      var1.setNeedAddress(var0.isNeedAddress());
      return var1;
   }

   public final void a(Object var1, Inner_3dMap_locationListener var2) {
      if (this.b == null) {
         this.b = new ll();
      }

      this.b.a(var2);
      ((AMapLocationClient)var1).setLocationListener(this.b);
   }

   public static Inner_3dMap_location a(AMapLocation var0) {
      Inner_3dMap_location var1 = new Inner_3dMap_location("");

      try {
         if (var0 != null) {
            var1.setLatitude(var0.getLatitude());
            var1.setLongitude(var0.getLongitude());
            var1.setAccuracy(var0.getAccuracy());
            var1.setBearing(var0.getBearing());
            var1.setAltitude(var0.getAltitude());
            var1.setProvider(var0.getProvider());
            var1.setSpeed(var0.getSpeed());
            var1.setTime(var0.getTime());
            var1.setErrorCode(var0.getErrorCode());
            var1.setErrorInfo(var0.getErrorInfo());
            var1.setLocationType(var0.getLocationType());
            var1.setLocationDetail(var0.getLocationDetail());
            var1.setProvince(var0.getProvince());
            var1.setCity(var0.getCity());
            var1.setCityCode(var0.getCityCode());
            var1.setCountry(var0.getCountry());
            var1.setDistrict(var0.getDistrict());
            var1.setAddress(var0.getAddress());
            var1.setAdCode(var0.getAdCode());
            var1.setExtras(var0.getExtras());
            var1.setRoad(var0.getRoad());
         }
      } catch (Throwable var2) {
         mg.a(var2, "Util", "converterLocation");
      }

      return var1;
   }
}
