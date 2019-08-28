package com.autonavi.amap.mapcore.interfaces;

import com.amap.api.maps.model.LatLng;
import com.amap.api.maps.model.MarkerOptions;

public interface IMarkerAction {
   float getAlpha();

   void setAlpha(float var1);

   int getDisplayLevel();

   MarkerOptions getOptions();

   boolean isClickable();

   boolean isInfoWindowAutoOverturn();

   boolean isInfoWindowEnable();

   void setInfoWindowEnable(boolean var1);

   void setMarkerOptions(MarkerOptions var1);

   void setAutoOverturnInfoWindow(boolean var1);

   void setClickable(boolean var1);

   void setDisplayLevel(int var1);

   void setFixingPointEnable(boolean var1);

   void setPositionNotUpdate(LatLng var1);

   void setRotateAngleNotUpdate(float var1);

   void setSnippet(String var1);

   void setTitle(String var1);
}
