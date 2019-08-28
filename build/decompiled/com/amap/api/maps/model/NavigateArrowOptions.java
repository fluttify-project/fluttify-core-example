package com.amap.api.maps.model;

import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public final class NavigateArrowOptions extends BaseOptions implements Parcelable {
   public static final NavigateArrowOptionsCreator CREATOR = new NavigateArrowOptionsCreator();
   private final List<LatLng> points = new ArrayList();
   private float width = 10.0F;
   private int topColor = Color.argb(221, 87, 235, 204);
   private int sideColor = Color.argb(170, 0, 172, 146);
   private float zIndex = 0.0F;
   private boolean isVisible = true;
   private boolean is3DModel = false;
   String a;
   private final String type = "NavigateArrowOptions";
   private int arrowLineInnerResId = 111;
   private int arrowLineOuterResId = 222;
   private int arrowLineShadowResId = 333;

   public NavigateArrowOptions() {
   }

   public NavigateArrowOptions add(LatLng var1) {
      this.points.add(var1);
      return this;
   }

   public NavigateArrowOptions add(LatLng... var1) {
      this.points.addAll(Arrays.asList(var1));
      return this;
   }

   public NavigateArrowOptions addAll(Iterable<LatLng> var1) {
      Iterator var2 = var1.iterator();

      while(var2.hasNext()) {
         LatLng var3 = (LatLng)var2.next();
         this.points.add(var3);
      }

      return this;
   }

   public NavigateArrowOptions width(float var1) {
      this.width = var1;
      return this;
   }

   public NavigateArrowOptions topColor(int var1) {
      this.topColor = var1;
      return this;
   }

   public NavigateArrowOptions sideColor(int var1) {
      this.sideColor = var1;
      return this;
   }

   public NavigateArrowOptions zIndex(float var1) {
      this.zIndex = var1;
      return this;
   }

   public NavigateArrowOptions visible(boolean var1) {
      this.isVisible = var1;
      return this;
   }

   public NavigateArrowOptions set3DModel(boolean var1) {
      this.is3DModel = var1;
      return this;
   }

   public List<LatLng> getPoints() {
      return this.points;
   }

   public float getWidth() {
      return this.width;
   }

   public int getTopColor() {
      return this.topColor;
   }

   public int getSideColor() {
      return this.sideColor;
   }

   public float getZIndex() {
      return this.zIndex;
   }

   public boolean isVisible() {
      return this.isVisible;
   }

   public boolean is3DModel() {
      return this.is3DModel;
   }

   public int describeContents() {
      return 0;
   }

   public void writeToParcel(Parcel var1, int var2) {
      var1.writeTypedList(this.points);
      var1.writeFloat(this.width);
      var1.writeInt(this.topColor);
      var1.writeInt(this.sideColor);
      var1.writeFloat(this.zIndex);
      var1.writeByte((byte)(this.isVisible ? 1 : 0));
      var1.writeString(this.a);
      var1.writeByte((byte)(this.is3DModel ? 1 : 0));
   }

   public void setPoints(List<LatLng> var1) {
      if (var1 != null && this.points != var1) {
         try {
            this.points.clear();
            this.points.addAll(var1);
         } catch (Throwable var3) {
            var3.printStackTrace();
         }
      }

   }
}
