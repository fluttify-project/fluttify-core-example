package com.amap.api.maps.model;

import com.autonavi.amap.mapcore.IPoint;

public class MultiPointItem {
   private LatLng latLng;
   private IPoint iPoint;
   private Object object;
   private String customerId = null;
   private String title;
   private String snippet;

   public MultiPointItem(LatLng var1) {
      this.latLng = var1;
   }

   public LatLng getLatLng() {
      return this.latLng;
   }

   public void setLatLng(LatLng var1) {
      this.latLng = var1;
   }

   public String getCustomerId() {
      return this.customerId;
   }

   public void setCustomerId(String var1) {
      this.customerId = var1;
   }

   public String getSnippet() {
      return this.snippet;
   }

   public void setSnippet(String var1) {
      this.snippet = var1;
   }

   public String getTitle() {
      return this.title;
   }

   public void setTitle(String var1) {
      this.title = var1;
   }

   public IPoint getIPoint() {
      return this.iPoint;
   }

   public void setIPoint(IPoint var1) {
      this.iPoint = var1;
   }

   public Object getObject() {
      return this.object;
   }

   public void setObject(Object var1) {
      this.object = var1;
   }

   public int hashCode() {
      return super.hashCode();
   }

   public boolean equals(Object var1) {
      if (var1 == null) {
         return false;
      } else if (var1 instanceof MultiPointItem) {
         return this.customerId != null && ((MultiPointItem)var1).getCustomerId() != null ? this.customerId.equals(((MultiPointItem)var1).getCustomerId()) : super.equals(var1);
      } else {
         return false;
      }
   }
}
