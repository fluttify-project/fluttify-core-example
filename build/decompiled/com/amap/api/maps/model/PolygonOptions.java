package com.amap.api.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public final class PolygonOptions extends BaseOptions implements Parcelable {
   public static final PolygonOptionsCreator CREATOR = new PolygonOptionsCreator();
   private final List<LatLng> points = new ArrayList();
   private float strokeWidth = 10.0F;
   private int strokeColor = -16777216;
   private int fillColor = -16777216;
   private float zIndex = 0.0F;
   private boolean isVisible = true;
   private List<BaseHoleOptions> holeOptions = new ArrayList();
   String a;
   private final String type = "PolygonOptions";
   private boolean isPointsUpdated = false;
   private boolean isHoleOptionsUpdated = false;
   private double[] pointList;

   public PolygonOptions() {
   }

   public int describeContents() {
      return 0;
   }

   public void writeToParcel(Parcel var1, int var2) {
      var1.writeTypedList(this.points);
      var1.writeFloat(this.strokeWidth);
      var1.writeInt(this.strokeColor);
      var1.writeInt(this.fillColor);
      var1.writeFloat(this.zIndex);
      var1.writeByte((byte)(this.isVisible ? 1 : 0));
      var1.writeString(this.a);
      var1.writeList(this.holeOptions);
   }

   public PolygonOptions add(LatLng var1) {
      try {
         this.points.add(var1);
         this.isPointsUpdated = true;
      } catch (Throwable var3) {
         var3.printStackTrace();
      }

      return this;
   }

   public PolygonOptions add(LatLng... var1) {
      try {
         this.points.addAll(Arrays.asList(var1));
         this.isPointsUpdated = true;
      } catch (Throwable var3) {
         var3.printStackTrace();
      }

      return this;
   }

   public PolygonOptions addAll(Iterable<LatLng> var1) {
      try {
         Iterator var2 = var1.iterator();

         while(var2.hasNext()) {
            LatLng var3 = (LatLng)var2.next();
            this.points.add(var3);
         }

         this.isPointsUpdated = true;
      } catch (Throwable var4) {
         var4.printStackTrace();
      }

      return this;
   }

   public void setPoints(List<LatLng> var1) {
      try {
         this.points.clear();
         this.points.addAll(var1);
         this.isPointsUpdated = true;
      } catch (Throwable var3) {
         var3.printStackTrace();
      }

   }

   public void setHoleOptions(List<BaseHoleOptions> var1) {
      try {
         this.holeOptions.clear();
         this.holeOptions.addAll(var1);
         this.isHoleOptionsUpdated = true;
      } catch (Throwable var3) {
         var3.printStackTrace();
      }

   }

   public PolygonOptions addHoles(BaseHoleOptions... var1) {
      try {
         this.holeOptions.addAll(Arrays.asList(var1));
         this.isHoleOptionsUpdated = true;
      } catch (Throwable var3) {
         var3.printStackTrace();
      }

      return this;
   }

   public PolygonOptions addHoles(Iterable<BaseHoleOptions> var1) {
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

   public PolygonOptions strokeWidth(float var1) {
      this.strokeWidth = var1;
      return this;
   }

   public PolygonOptions strokeColor(int var1) {
      this.strokeColor = var1;
      return this;
   }

   public PolygonOptions fillColor(int var1) {
      this.fillColor = var1;
      return this;
   }

   public PolygonOptions zIndex(float var1) {
      this.zIndex = var1;
      return this;
   }

   public PolygonOptions visible(boolean var1) {
      this.isVisible = var1;
      return this;
   }

   public List<LatLng> getPoints() {
      return this.points;
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

   public List<BaseHoleOptions> getHoleOptions() {
      return this.holeOptions;
   }
}
