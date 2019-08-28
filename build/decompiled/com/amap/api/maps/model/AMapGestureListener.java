package com.amap.api.maps.model;

public interface AMapGestureListener {
   void onDoubleTap(float var1, float var2);

   void onSingleTap(float var1, float var2);

   void onFling(float var1, float var2);

   void onScroll(float var1, float var2);

   void onLongPress(float var1, float var2);

   void onDown(float var1, float var2);

   void onUp(float var1, float var2);

   void onMapStable();
}
