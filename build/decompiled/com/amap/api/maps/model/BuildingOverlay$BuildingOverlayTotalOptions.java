package com.amap.api.maps.model;

import java.util.List;

public class BuildingOverlay$BuildingOverlayTotalOptions extends BaseOptions {
   public List<BuildingOverlayOptions> allOptionList;
   private final String type;
   public boolean isVisible;
   private float zIndex;

   protected BuildingOverlay$BuildingOverlayTotalOptions(BuildingOverlay var1) {
      this.a = var1;
      this.type = "BuildingOptions";
      this.isVisible = true;
      this.zIndex = 0.0F;
   }
}
