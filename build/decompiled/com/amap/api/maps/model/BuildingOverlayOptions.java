package com.amap.api.maps.model;

import android.graphics.Point;
import com.autonavi.amap.mapcore.VirtualEarthProjection;
import java.util.ArrayList;
import java.util.List;

public class BuildingOverlayOptions extends BaseOptions {
   private int buildingHeight = -1;
   private int buildingHeightScale = 1;
   private int buildingTopColor = -7829368;
   private int buildingSideColor = -7829368;
   private boolean isVisible = true;
   private float zindex;
   private List<LatLng> buildingLatlngs = new ArrayList();
   private int[] buildingLatlngsPoints;

   public BuildingOverlayOptions() {
   }

   public float getZIndex() {
      return this.zindex;
   }

   public void setZIndex(float var1) {
      this.zindex = var1;
   }

   public void setVisible(boolean var1) {
      this.isVisible = var1;
   }

   public boolean isVisible() {
      return this.isVisible;
   }

   public BuildingOverlayOptions setBuildingHeightScale(int var1) {
      this.buildingHeightScale = var1;
      return this;
   }

   public int getBuildingHeightScale() {
      return this.buildingHeightScale;
   }

   public BuildingOverlayOptions setBuildingTopColor(int var1) {
      this.buildingTopColor = var1;
      return this;
   }

   public BuildingOverlayOptions setBuildingSideColor(int var1) {
      this.buildingSideColor = var1;
      return this;
   }

   public int getBuildingSideColor() {
      return this.buildingSideColor;
   }

   public int getBuildingTopColor() {
      return this.buildingTopColor;
   }

   public BuildingOverlayOptions setBuildingHeight(int var1) {
      this.buildingHeight = var1;
      return this;
   }

   public int getBuildingHeight() {
      return this.buildingHeight;
   }

   public List<LatLng> getBuildingLatlngs() {
      return this.buildingLatlngs;
   }

   public int[] getPoints() {
      if (this.buildingLatlngs != null && this.buildingLatlngs.size() > 0) {
         int[] var1 = new int[this.buildingLatlngs.size() * 2];
         int var2 = 0;

         for(int var3 = 0; var3 < this.buildingLatlngs.size(); ++var3) {
            LatLng var4 = (LatLng)this.buildingLatlngs.get(var3);
            Point var5 = VirtualEarthProjection.latLongToPixels(var4.latitude, var4.longitude, 20);
            var1[var2++] = var5.x;
            var1[var2++] = var5.y;
         }

         return var1;
      } else {
         return new int[0];
      }
   }

   public BuildingOverlayOptions setBuildingLatlngs(List<LatLng> var1) {
      this.buildingLatlngs = var1;
      if (var1 != null && var1.size() > 0) {
         this.buildingLatlngsPoints = new int[var1.size() * 2];
         int var2 = 0;

         for(int var3 = 0; var3 < var1.size(); ++var3) {
            LatLng var4 = (LatLng)var1.get(var3);
            Point var5 = VirtualEarthProjection.latLongToPixels(var4.latitude, var4.longitude, 20);
            this.buildingLatlngsPoints[var2++] = var5.x;
            this.buildingLatlngsPoints[var2++] = var5.y;
         }
      }

      return this;
   }
}
