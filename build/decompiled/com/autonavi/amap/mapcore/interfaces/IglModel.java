package com.autonavi.amap.mapcore.interfaces;

import com.amap.api.maps.model.LatLng;
import com.amap.api.maps.model.animation.Animation;
import com.autonavi.amap.mapcore.IPoint;

public interface IglModel {
   String getTitle();

   String getSnippet();

   String getId();

   void setPosition(LatLng var1);

   void setRotateAngle(float var1);

   float getRotateAngle();

   LatLng getPosition();

   void setAnimation(Animation var1);

   boolean startAnimation();

   boolean remove();

   void setVisible(boolean var1);

   boolean isVisible();

   void setObject(Object var1);

   Object getObject();

   void setZoomLimit(float var1);

   void destroy();

   void setGeoPoint(IPoint var1);

   void showInfoWindow();

   void setTitle(String var1);

   void setSnippet(String var1);

   void setModelFixedLength(int var1);
}
