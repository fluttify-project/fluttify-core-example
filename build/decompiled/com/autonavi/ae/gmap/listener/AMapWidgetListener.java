package com.autonavi.ae.gmap.listener;

public interface AMapWidgetListener {
   void invalidateScaleView();

   void invalidateCompassView();

   void invalidateZoomController(float var1);

   void setFrontViewVisibility(boolean var1);
}
