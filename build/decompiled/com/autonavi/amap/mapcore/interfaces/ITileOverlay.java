package com.autonavi.amap.mapcore.interfaces;

public interface ITileOverlay {
   void remove();

   void destroy(boolean var1);

   void clearTileCache();

   String getId();

   void setZIndex(float var1);

   float getZIndex();

   void setVisible(boolean var1);

   boolean isVisible();

   boolean equalsRemote(ITileOverlay var1);

   int hashCodeRemote();
}
