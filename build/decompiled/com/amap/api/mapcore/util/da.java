package com.amap.api.mapcore.util;

import com.amap.api.maps.model.BuildingOverlayOptions;
import java.util.List;

public interface da {
   String getId();

   void setZIndex(float var1);

   float getZIndex();

   void setVisible(boolean var1);

   boolean isVisible();

   void a(BuildingOverlayOptions var1);

   void a(List<BuildingOverlayOptions> var1);

   List<BuildingOverlayOptions> b();

   void destroy();

   BuildingOverlayOptions d();
}
