package com.amap.api.mapcore.util;

import com.amap.api.maps.model.LatLng;

public abstract class m implements y {
   public m() {
   }

   public boolean isDraggable() {
      return false;
   }

   public boolean isInfoWindowAutoOverturn() {
      return false;
   }

   public abstract LatLng getPosition();

   public abstract String getId();

   public abstract String getTitle();

   public abstract String getSnippet();

   public abstract boolean isVisible();
}
