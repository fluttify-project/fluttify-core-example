package com.amap.api.maps.model;

import com.amap.api.maps.model.animation.Animation;
import com.autonavi.amap.mapcore.IPoint;

public abstract class BasePointOverlay {
   public BasePointOverlay() {
   }

   public abstract LatLng getPosition();

   public abstract String getId();

   public abstract void setPosition(LatLng var1);

   public abstract void setTitle(String var1);

   public abstract String getTitle();

   public abstract String getSnippet();

   public abstract void setSnippet(String var1);

   public abstract void setVisible(boolean var1);

   public abstract boolean isVisible();

   public abstract void setObject(Object var1);

   public abstract Object getObject();

   public abstract void setRotateAngle(float var1);

   public abstract float getRotateAngle();

   public abstract void setAnimation(Animation var1);

   public abstract void setGeoPoint(IPoint var1);

   public abstract void destroy();

   public abstract void remove();

   public abstract boolean startAnimation();

   public abstract void showInfoWindow();
}
