package com.amap.api.maps.model;

public class PoiPara {
   private LatLng center;
   private String keywords;

   public PoiPara() {
   }

   public LatLng getCenter() {
      return this.center;
   }

   public void setCenter(LatLng var1) {
      this.center = var1;
   }

   public String getKeywords() {
      return this.keywords;
   }

   public void setKeywords(String var1) {
      this.keywords = var1;
   }
}
