package com.amap.api.maps.model;

public class RoutePara {
   private int drivingRouteStyle = 0;
   private int transitRouteStyle = 0;
   private LatLng startPoint;
   private LatLng endPoint;
   private String startName;
   private String endName;

   public RoutePara() {
   }

   public int getDrivingRouteStyle() {
      return this.drivingRouteStyle;
   }

   public void setDrivingRouteStyle(int var1) {
      byte var2 = 9;
      if (var1 >= 0 && var1 < var2) {
         this.drivingRouteStyle = var1;
      }

   }

   public int getTransitRouteStyle() {
      return this.transitRouteStyle;
   }

   public void setTransitRouteStyle(int var1) {
      byte var2 = 6;
      if (var1 >= 0 && var1 < var2) {
         this.transitRouteStyle = var1;
      }

   }

   public LatLng getStartPoint() {
      return this.startPoint;
   }

   public void setStartPoint(LatLng var1) {
      this.startPoint = var1;
   }

   public LatLng getEndPoint() {
      return this.endPoint;
   }

   public void setEndPoint(LatLng var1) {
      this.endPoint = var1;
   }

   public String getEndName() {
      return this.endName;
   }

   public void setEndName(String var1) {
      this.endName = var1;
   }

   public String getStartName() {
      return this.startName;
   }

   public void setStartName(String var1) {
      this.startName = var1;
   }
}
