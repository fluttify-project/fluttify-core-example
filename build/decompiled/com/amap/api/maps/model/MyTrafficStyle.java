package com.amap.api.maps.model;

public class MyTrafficStyle {
   private int smoothColor = -16735735;
   private int slowColor = -35576;
   private int congestedColor = -1441006;
   private int seriousCongestedColor = -7208950;
   private float ratio = 0.8F;
   private int trafficRoadBackgroundColor = -1;

   public MyTrafficStyle() {
   }

   public int getSmoothColor() {
      return this.smoothColor;
   }

   public void setSmoothColor(int var1) {
      this.smoothColor = var1;
   }

   public int getSlowColor() {
      return this.slowColor;
   }

   public void setSlowColor(int var1) {
      this.slowColor = var1;
   }

   public int getCongestedColor() {
      return this.congestedColor;
   }

   public void setCongestedColor(int var1) {
      this.congestedColor = var1;
   }

   public int getSeriousCongestedColor() {
      return this.seriousCongestedColor;
   }

   public void setSeriousCongestedColor(int var1) {
      this.seriousCongestedColor = var1;
   }

   public float getRatio() {
      return this.ratio;
   }

   public void setRatio(float var1) {
      this.ratio = var1;
   }

   public int getTrafficRoadBackgroundColor() {
      return this.trafficRoadBackgroundColor;
   }

   public void setTrafficRoadBackgroundColor(int var1) {
      this.trafficRoadBackgroundColor = var1;
   }
}
