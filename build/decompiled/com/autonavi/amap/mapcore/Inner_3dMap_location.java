package com.autonavi.amap.mapcore;

import android.location.Location;
import com.amap.api.mapcore.util.mg;
import com.amap.api.mapcore.util.mk;
import org.json.JSONObject;

public class Inner_3dMap_location extends Location implements Cloneable {
   public static final int LOCATION_SUCCESS = 0;
   public static final int ERROR_CODE_INVALID_PARAMETER = 1;
   public static final int ERROR_CODE_FAILURE_WIFI_INFO = 2;
   public static final int ERROR_CODE_FAILURE_LOCATION_PARAMETER = 3;
   public static final int ERROR_CODE_FAILURE_CONNECTION = 4;
   public static final int ERROR_CODE_FAILURE_PARSER = 5;
   public static final int ERROR_CODE_FAILURE_LOCATION = 6;
   public static final int ERROR_CODE_FAILURE_AUTH = 7;
   public static final int ERROR_CODE_UNKNOWN = 8;
   public static final int ERROR_CODE_FAILURE_INIT = 9;
   public static final int ERROR_CODE_SERVICE_FAIL = 10;
   public static final int ERROR_CODE_FAILURE_CELL = 11;
   public static final int ERROR_CODE_FAILURE_LOCATION_PERMISSION = 12;
   public static final int ERROR_CODE_FAILURE_NOWIFIANDAP = 13;
   public static final int ERROR_CODE_FAILURE_NOENOUGHSATELLITES = 14;
   public static final int ERROR_CODE_FAILURE_SIMULATION_LOCATION = 15;
   public static final int LOCATION_TYPE_GPS = 1;
   public static final int LOCATION_TYPE_SAME_REQ = 2;
   /** @deprecated */
   public static final int LOCATION_TYPE_FAST = 3;
   public static final int LOCATION_TYPE_FIX_CACHE = 4;
   public static final int LOCATION_TYPE_WIFI = 5;
   public static final int LOCATION_TYPE_CELL = 6;
   public static final int LOCATION_TYPE_AMAP = 7;
   public static final int LOCATION_TYPE_OFFLINE = 8;
   public static final int GPS_ACCURACY_GOOD = 1;
   public static final int GPS_ACCURACY_BAD = 0;
   public static final int GPS_ACCURACY_UNKNOWN = -1;
   private String province = "";
   private String city = "";
   private String district = "";
   private String cityCode = "";
   private String adCode = "";
   private String address = "";
   private String poiName = "";
   private String country = "";
   private String road = "";
   private String street = "";
   private String number = "";
   private boolean isOffset = true;
   private int errorCode = 0;
   private String errorInfo = "success";
   private String locationDetail = "";
   private int locationType = 0;
   private double latitude = 0.0D;
   private double longitude = 0.0D;
   private int satellites = 0;
   private String aoiName = "";
   private int signalIntensity = -1;
   protected String buildingId = "";
   protected String floor = "";
   protected String desc = "";

   public int getGpsAccuracyStatus() {
      return this.signalIntensity;
   }

   public void setGpsAccuracyStatus(int var1) {
      this.signalIntensity = var1;
   }

   public Inner_3dMap_location(String var1) {
      super(var1);
   }

   public Inner_3dMap_location(Location var1) {
      super(var1);
      this.latitude = var1.getLatitude();
      this.longitude = var1.getLongitude();
   }

   public int getLocationType() {
      return this.locationType;
   }

   public void setLocationType(int var1) {
      this.locationType = var1;
   }

   public String getLocationDetail() {
      return this.locationDetail;
   }

   public void setLocationDetail(String var1) {
      this.locationDetail = var1;
   }

   public int getErrorCode() {
      return this.errorCode;
   }

   public void setErrorCode(int var1) {
      if (this.errorCode == 0) {
         this.errorInfo = mk.b(var1);
         this.errorCode = var1;
      }
   }

   public String getErrorInfo() {
      StringBuilder var1;
      (var1 = new StringBuilder()).append(this.errorInfo);
      if (this.errorCode != 0) {
         var1.append(" 请到http://lbs.amap.com/api/android-location-sdk/guide/utilities/errorcode/查看错误码说明");
         var1.append(",错误详细信息:" + this.locationDetail);
      }

      this.errorInfo = var1.toString();
      return this.errorInfo;
   }

   public void setErrorInfo(String var1) {
      this.errorInfo = var1;
   }

   public String getCountry() {
      return this.country;
   }

   public void setCountry(String var1) {
      this.country = var1;
   }

   /** @deprecated */
   public String getRoad() {
      return this.road;
   }

   /** @deprecated */
   public void setRoad(String var1) {
      this.road = var1;
   }

   public String getAddress() {
      return this.address;
   }

   public void setAddress(String var1) {
      this.address = var1;
   }

   public String getProvince() {
      return this.province;
   }

   public void setProvince(String var1) {
      this.province = var1;
   }

   public String getCity() {
      return this.city;
   }

   public void setCity(String var1) {
      this.city = var1;
   }

   public String getDistrict() {
      return this.district;
   }

   public void setDistrict(String var1) {
      this.district = var1;
   }

   public String getCityCode() {
      return this.cityCode;
   }

   public void setCityCode(String var1) {
      this.cityCode = var1;
   }

   public String getAdCode() {
      return this.adCode;
   }

   public void setAdCode(String var1) {
      this.adCode = var1;
   }

   public String getPoiName() {
      return this.poiName;
   }

   public void setPoiName(String var1) {
      this.poiName = var1;
   }

   public double getLatitude() {
      return this.latitude;
   }

   public void setLatitude(double var1) {
      this.latitude = var1;
   }

   public double getLongitude() {
      return this.longitude;
   }

   public void setLongitude(double var1) {
      this.longitude = var1;
   }

   public int getSatellites() {
      return this.satellites;
   }

   public void setSatellites(int var1) {
      this.satellites = var1;
   }

   public String getStreet() {
      return this.street;
   }

   public void setStreet(String var1) {
      this.street = var1;
   }

   public String getStreetNum() {
      return this.number;
   }

   public void setNumber(String var1) {
      this.number = var1;
   }

   public void setOffset(boolean var1) {
      this.isOffset = var1;
   }

   public boolean isOffset() {
      return this.isOffset;
   }

   public String getAoiName() {
      return this.aoiName;
   }

   public void setAoiName(String var1) {
      this.aoiName = var1;
   }

   public String getBuildingId() {
      return this.buildingId;
   }

   public void setBuildingId(String var1) {
      this.buildingId = var1;
   }

   public String getFloor() {
      return this.floor;
   }

   public void setFloor(String var1) {
      this.floor = var1;
   }

   public String toString() {
      StringBuffer var1 = new StringBuffer();

      try {
         var1.append("latitude=" + this.latitude + "#");
         var1.append("longitude=" + this.longitude + "#");
         var1.append("province=" + this.province + "#");
         var1.append("city=" + this.city + "#");
         var1.append("district=" + this.district + "#");
         var1.append("cityCode=" + this.cityCode + "#");
         var1.append("adCode=" + this.adCode + "#");
         var1.append("address=" + this.address + "#");
         var1.append("country=" + this.country + "#");
         var1.append("road=" + this.road + "#");
         var1.append("poiName=" + this.poiName + "#");
         var1.append("street=" + this.street + "#");
         var1.append("streetNum=" + this.number + "#");
         var1.append("aoiName=" + this.aoiName + "#");
         var1.append("poiid=" + this.buildingId + "#");
         var1.append("floor=" + this.floor + "#");
         var1.append("errorCode=" + this.errorCode + "#");
         var1.append("errorInfo=" + this.errorInfo + "#");
         var1.append("locationDetail=" + this.locationDetail + "#");
         var1.append("locationType=" + this.locationType);
      } catch (Throwable var2) {
         ;
      }

      return var1.toString();
   }

   public String toStr() {
      return this.toStr(1);
   }

   public String toStr(int var1) {
      JSONObject var4;
      try {
         var4 = this.toJson(var1);
      } catch (Throwable var3) {
         var4 = null;
         mg.a(var3, "AMapLocation", "toStr part2");
      }

      return var4 == null ? null : var4.toString();
   }

   public float getAccuracy() {
      return super.getAccuracy();
   }

   public float getBearing() {
      return super.getBearing();
   }

   public double getAltitude() {
      return super.getAltitude();
   }

   public float getSpeed() {
      return super.getSpeed();
   }

   public String getProvider() {
      return super.getProvider();
   }

   protected JSONObject toJson(int var1) {
      JSONObject var2;
      try {
         var2 = new JSONObject();
         switch(var1) {
         case 1:
            try {
               var2.put("altitude", this.getAltitude());
               var2.put("speed", (double)this.getSpeed());
               var2.put("bearing", (double)this.getBearing());
            } catch (Throwable var3) {
               ;
            }

            var2.put("citycode", this.cityCode);
            var2.put("desc", this.desc);
            var2.put("adcode", this.adCode);
            var2.put("country", this.country);
            var2.put("province", this.province);
            var2.put("city", this.city);
            var2.put("district", this.district);
            var2.put("road", this.road);
            var2.put("street", this.street);
            var2.put("number", this.number);
            var2.put("poiname", this.poiName);
            var2.put("errorCode", this.errorCode);
            var2.put("errorInfo", this.errorInfo);
            var2.put("locationType", this.locationType);
            var2.put("locationDetail", this.locationDetail);
            var2.put("aoiname", this.aoiName);
            var2.put("address", this.address);
            var2.put("poiid", this.buildingId);
            var2.put("floor", this.floor);
         case 2:
            var2.put("time", this.getTime());
         case 3:
            var2.put("provider", this.getProvider());
            var2.put("lon", this.getLongitude());
            var2.put("lat", this.getLatitude());
            var2.put("accuracy", (double)this.getAccuracy());
            var2.put("isOffset", this.isOffset);
         }
      } catch (Throwable var4) {
         var2 = null;
         mg.a(var4, "AmapLoc", "toStr");
      }

      return var2;
   }

   public Inner_3dMap_location clone() {
      try {
         super.clone();
      } catch (Throwable var2) {
         ;
      }

      Inner_3dMap_location var1;
      (var1 = new Inner_3dMap_location(this)).setProvince(this.province);
      var1.setCity(this.city);
      var1.setDistrict(this.district);
      var1.setCityCode(this.cityCode);
      var1.setAdCode(this.adCode);
      var1.setAddress(this.address);
      var1.setPoiName(this.poiName);
      var1.setCountry(this.country);
      var1.setRoad(this.road);
      var1.setStreet(this.street);
      var1.setNumber(this.number);
      var1.setOffset(this.isOffset);
      var1.setErrorCode(this.errorCode);
      var1.setErrorInfo(this.errorInfo);
      var1.setLocationDetail(this.locationDetail);
      var1.setLocationType(this.locationType);
      var1.setLatitude(this.latitude);
      var1.setLongitude(this.longitude);
      var1.setSatellites(this.satellites);
      var1.setAoiName(this.aoiName);
      var1.setBuildingId(this.buildingId);
      var1.setFloor(this.floor);
      var1.setGpsAccuracyStatus(this.signalIntensity);
      var1.setExtras(this.getExtras());
      return var1;
   }
}
