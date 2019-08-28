package com.amap.api.maps.model;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public final class CircleOptions extends BaseOptions implements Parcelable {
   public static final CircleOptionsCreator CREATOR = new CircleOptionsCreator();
   String a;
   private LatLng point = null;
   private double radius = 0.0D;
   private float strokeWidth = 10.0F;
   private int strokeColor = -16777216;
   private int fillColor = 0;
   private float zIndex = 0.0F;
   private boolean isVisible = true;
   private List<BaseHoleOptions> holeOptions = new ArrayList();
   private final String type = "CircleOptions";
   private boolean isCenterUpdated = false;
   private boolean isRadiusUpdated = false;
   private boolean isHoleOptionsUpdated = false;
   private int dottedLineType = -1;

   public CircleOptions() {
   }

   public void writeToParcel(Parcel var1, int var2) {
      Bundle var3 = new Bundle();
      if (this.point != null) {
         var3.putDouble("lat", this.point.latitude);
         var3.putDouble("lng", this.point.longitude);
      }

      var1.writeBundle(var3);
      var1.writeDouble(this.radius);
      var1.writeFloat(this.strokeWidth);
      var1.writeInt(this.strokeColor);
      var1.writeInt(this.fillColor);
      var1.writeFloat(this.zIndex);
      var1.writeByte((byte)(this.isVisible ? 1 : 0));
      var1.writeString(this.a);
      var1.writeList(this.holeOptions);
      var1.writeInt(this.dottedLineType);
   }

   public int describeContents() {
      return 0;
   }

   public CircleOptions center(LatLng var1) {
      this.point = var1;
      this.isCenterUpdated = true;
      return this;
   }

   public CircleOptions radius(double var1) {
      this.radius = var1;
      this.isRadiusUpdated = true;
      return this;
   }

   public CircleOptions strokeWidth(float var1) {
      this.strokeWidth = var1;
      return this;
   }

   public CircleOptions strokeColor(int var1) {
      this.strokeColor = var1;
      return this;
   }

   public CircleOptions fillColor(int var1) {
      this.fillColor = var1;
      return this;
   }

   public CircleOptions zIndex(float var1) {
      this.zIndex = var1;
      return this;
   }

   public CircleOptions visible(boolean var1) {
      this.isVisible = var1;
      return this;
   }

   public LatLng getCenter() {
      return this.point;
   }

   public double getRadius() {
      return this.radius;
   }

   public float getStrokeWidth() {
      return this.strokeWidth;
   }

   public int getStrokeColor() {
      return this.strokeColor;
   }

   public int getFillColor() {
      return this.fillColor;
   }

   public float getZIndex() {
      return this.zIndex;
   }

   public boolean isVisible() {
      return this.isVisible;
   }

   public CircleOptions addHoles(BaseHoleOptions... var1) {
      try {
         this.holeOptions.addAll(Arrays.asList(var1));
         this.isHoleOptionsUpdated = true;
      } catch (Throwable var3) {
         var3.printStackTrace();
      }

      return this;
   }

   public CircleOptions addHoles(Iterable<BaseHoleOptions> var1) {
      try {
         Iterator var2 = var1.iterator();

         while(var2.hasNext()) {
            BaseHoleOptions var3 = (BaseHoleOptions)var2.next();
            this.holeOptions.add(var3);
         }

         this.isHoleOptionsUpdated = true;
      } catch (Throwable var4) {
         var4.printStackTrace();
      }

      return this;
   }

   public List<BaseHoleOptions> getHoleOptions() {
      return this.holeOptions;
   }

   public CircleOptions setStrokeDottedLineType(int var1) {
      this.dottedLineType = var1;
      return this;
   }

   public int getStrokeDottedLineType() {
      return this.dottedLineType;
   }
}
