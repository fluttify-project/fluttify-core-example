package com.autonavi.amap.mapcore;

public interface Inner_3dMap_locationManagerBase {
   void setLocationOption(Inner_3dMap_locationOption var1);

   void setLocationListener(Inner_3dMap_locationListener var1);

   void startLocation();

   void stopLocation();

   void unRegisterLocationListener(Inner_3dMap_locationListener var1);

   Inner_3dMap_location getLastKnownLocation();

   void destroy();
}
