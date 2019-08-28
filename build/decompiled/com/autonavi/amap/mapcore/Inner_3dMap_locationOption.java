package com.autonavi.amap.mapcore;

import com.amap.api.mapcore.util.mg;

public class Inner_3dMap_locationOption implements Cloneable {
   private long interval = 2000L;
   private long httpTimeOut;
   private boolean isOnceLocation;
   private boolean isMockEnable;
   private boolean isNeedAddress;
   /** @deprecated */
   private boolean isWifiActiveScan;
   private boolean lastWifiActiveScan;
   private Inner_3dMap_locationOption$Inner_3dMap_Enum_LocationMode locationMode;
   private static Inner_3dMap_locationOption$Inner_3dMap_Enum_LocationProtocol locationProtocol;
   private boolean isKillProcess;
   private boolean isGpsFirst;
   private boolean isOffset;
   private boolean isLocationCacheEnable;
   private boolean isOnceLocationLatest;
   private boolean sensorEnable;
   private boolean isWifiScan;
   static String APIKEY;

   public Inner_3dMap_locationOption() {
      this.httpTimeOut = (long)mg.f;
      this.isOnceLocation = false;
      this.isMockEnable = false;
      this.isNeedAddress = true;
      this.isWifiActiveScan = true;
      this.lastWifiActiveScan = true;
      this.locationMode = Inner_3dMap_locationOption$Inner_3dMap_Enum_LocationMode.Hight_Accuracy;
      this.isKillProcess = false;
      this.isGpsFirst = false;
      this.isOffset = true;
      this.isLocationCacheEnable = true;
      this.isOnceLocationLatest = false;
      this.sensorEnable = false;
      this.isWifiScan = true;
   }

   public static String getAPIKEY() {
      return APIKEY;
   }

   public boolean isMockEnable() {
      return this.isMockEnable;
   }

   public void setMockEnable(boolean var1) {
      this.isMockEnable = var1;
   }

   public long getInterval() {
      return this.interval;
   }

   public Inner_3dMap_locationOption setInterval(long var1) {
      if (var1 <= 800L) {
         var1 = 800L;
      }

      this.interval = var1;
      return this;
   }

   public boolean isOnceLocation() {
      return this.isOnceLocationLatest ? true : this.isOnceLocation;
   }

   public Inner_3dMap_locationOption setOnceLocation(boolean var1) {
      this.isOnceLocation = var1;
      return this;
   }

   public boolean isNeedAddress() {
      return this.isNeedAddress;
   }

   public Inner_3dMap_locationOption setNeedAddress(boolean var1) {
      this.isNeedAddress = var1;
      return this;
   }

   /** @deprecated */
   public boolean isWifiActiveScan() {
      return this.isWifiActiveScan;
   }

   /** @deprecated */
   public void setWifiActiveScan(boolean var1) {
      this.isWifiActiveScan = var1;
      this.lastWifiActiveScan = var1;
   }

   public boolean isWifiScan() {
      return this.isWifiScan;
   }

   public void setWifiScan(boolean var1) {
      this.isWifiScan = var1;
      if (this.isWifiScan) {
         this.isWifiActiveScan = this.lastWifiActiveScan;
      } else {
         this.isWifiActiveScan = false;
      }
   }

   public Inner_3dMap_locationOption$Inner_3dMap_Enum_LocationMode getLocationMode() {
      return this.locationMode;
   }

   public Inner_3dMap_locationOption$Inner_3dMap_Enum_LocationProtocol getLocationProtocol() {
      return locationProtocol;
   }

   public Inner_3dMap_locationOption setLocationMode(Inner_3dMap_locationOption$Inner_3dMap_Enum_LocationMode var1) {
      this.locationMode = var1;
      return this;
   }

   public static void setLocationProtocol(Inner_3dMap_locationOption$Inner_3dMap_Enum_LocationProtocol var0) {
      locationProtocol = var0;
   }

   public boolean isKillProcess() {
      return this.isKillProcess;
   }

   public Inner_3dMap_locationOption setKillProcess(boolean var1) {
      this.isKillProcess = var1;
      return this;
   }

   public boolean isGpsFirst() {
      return this.isGpsFirst;
   }

   public Inner_3dMap_locationOption setGpsFirst(boolean var1) {
      this.isGpsFirst = var1;
      return this;
   }

   public Inner_3dMap_locationOption clone() {
      try {
         super.clone();
      } catch (Throwable var1) {
         var1.printStackTrace();
      }

      return (new Inner_3dMap_locationOption()).clone(this);
   }

   public long getHttpTimeOut() {
      return this.httpTimeOut;
   }

   public void setHttpTimeOut(long var1) {
      this.httpTimeOut = var1;
   }

   public boolean isOffset() {
      return this.isOffset;
   }

   public Inner_3dMap_locationOption setOffset(boolean var1) {
      this.isOffset = var1;
      return this;
   }

   public boolean isLocationCacheEnable() {
      return this.isLocationCacheEnable;
   }

   public void setLocationCacheEnable(boolean var1) {
      this.isLocationCacheEnable = var1;
   }

   public boolean isOnceLocationLatest() {
      return this.isOnceLocationLatest;
   }

   public void setOnceLocationLatest(boolean var1) {
      this.isOnceLocationLatest = var1;
   }

   public boolean isSensorEnable() {
      return this.sensorEnable;
   }

   public void setSensorEnable(boolean var1) {
      this.sensorEnable = var1;
   }

   private Inner_3dMap_locationOption clone(Inner_3dMap_locationOption var1) {
      this.interval = var1.interval;
      this.isOnceLocation = var1.isOnceLocation;
      this.locationMode = var1.locationMode;
      this.isMockEnable = var1.isMockEnable;
      this.isKillProcess = var1.isKillProcess;
      this.isGpsFirst = var1.isGpsFirst;
      this.isNeedAddress = var1.isNeedAddress;
      this.isWifiActiveScan = var1.isWifiActiveScan;
      this.httpTimeOut = var1.httpTimeOut;
      this.isOffset = var1.isOffset;
      this.isLocationCacheEnable = var1.isLocationCacheEnable;
      this.isOnceLocationLatest = var1.isOnceLocationLatest;
      this.sensorEnable = var1.isSensorEnable();
      this.isWifiScan = var1.isWifiScan();
      return this;
   }

   public String toString() {
      StringBuilder var1;
      (var1 = new StringBuilder()).append("interval:").append(String.valueOf(this.interval)).append("#");
      var1.append("isOnceLocation:").append(String.valueOf(this.isOnceLocation)).append("#");
      var1.append("locationMode:").append(String.valueOf(this.locationMode)).append("#");
      var1.append("isMockEnable:").append(String.valueOf(this.isMockEnable)).append("#");
      var1.append("isKillProcess:").append(String.valueOf(this.isKillProcess)).append("#");
      var1.append("isGpsFirst:").append(String.valueOf(this.isGpsFirst)).append("#");
      var1.append("isNeedAddress:").append(String.valueOf(this.isNeedAddress)).append("#");
      var1.append("isWifiActiveScan:").append(String.valueOf(this.isWifiActiveScan)).append("#");
      var1.append("httpTimeOut:").append(String.valueOf(this.httpTimeOut)).append("#");
      var1.append("isOffset:").append(String.valueOf(this.isOffset)).append("#");
      var1.append("isLocationCacheEnable:").append(String.valueOf(this.isLocationCacheEnable)).append("#");
      var1.append("isLocationCacheEnable:").append(String.valueOf(this.isLocationCacheEnable)).append("#");
      var1.append("isOnceLocationLatest:").append(String.valueOf(this.isOnceLocationLatest)).append("#");
      var1.append("sensorEnable:").append(String.valueOf(this.sensorEnable)).append("#");
      return var1.toString();
   }

   static {
      locationProtocol = Inner_3dMap_locationOption$Inner_3dMap_Enum_LocationProtocol.HTTP;
      APIKEY = "";
   }
}
