package com.autonavi.amap.mapcore.interfaces;

import com.autonavi.ae.gmap.GLMapState;

public interface IAMapListener {
   void afterDrawFrame(int var1, GLMapState var2);

   void afterDrawLabel(int var1, GLMapState var2);

   void beforeDrawLabel(int var1, GLMapState var2);

   void afterRendererOver(int var1, GLMapState var2);

   void afterAnimation();
}
