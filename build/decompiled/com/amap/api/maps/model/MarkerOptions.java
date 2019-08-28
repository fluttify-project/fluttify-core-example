package com.amap.api.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

public final class MarkerOptions implements Parcelable {
   public static final MarkerOptionsCreator CREATOR = new MarkerOptionsCreator();
   private LatLng latLng;
   private String title;
   private String snippet;
   private float anchorU = 0.5F;
   private float anchorV = 1.0F;
   private float zIndex = 0.0F;
   private boolean isDraggable = false;
   private boolean isVisible = true;
   String a;
   private boolean perspective = false;
   private int offsetX = 0;
   private int offsetY = 0;
   private ArrayList<BitmapDescriptor> bitmapDescriptors = new ArrayList();
   private int period = 20;
   private boolean isGps = false;
   private boolean isFlat = false;
   private boolean isRotatingMode = false;
   private float angleOffset = 0.0F;
   float b = 1.0F;
   boolean c = false;
   boolean d = true;
   int e = 5;
   float f;
   private boolean isBelowMaskLayer;

   public MarkerOptions icons(ArrayList<BitmapDescriptor> var1) {
      if (var1 != null && var1.size() > 0) {
         this.bitmapDescriptors = var1;
         this.isRotatingMode = false;
      }

      return this;
   }

   public MarkerOptions rotatingIcons(ArrayList<BitmapDescriptor> var1, float var2) {
      if (var1 != null && var1.size() > 0) {
         this.bitmapDescriptors = var1;
         if (var2 != 0.0F) {
            this.angleOffset = var2;
         } else {
            this.angleOffset = 360.0F / (float)var1.size();
         }

         this.isRotatingMode = true;
      }

      return this;
   }

   protected MarkerOptions angleOffset(float var1) {
      this.angleOffset = var1;
      return this;
   }

   public float getAngleOffset() {
      return this.angleOffset;
   }

   protected MarkerOptions setRotatingMode(boolean var1) {
      this.isRotatingMode = var1;
      return this;
   }

   public boolean isRotatingMode() {
      return this.isRotatingMode;
   }

   public ArrayList<BitmapDescriptor> getIcons() {
      return this.bitmapDescriptors;
   }

   public MarkerOptions period(int var1) {
      if (var1 <= 1) {
         this.period = 1;
      } else {
         this.period = var1;
      }

      return this;
   }

   public int getPeriod() {
      return this.period;
   }

   /** @deprecated */
   public boolean isPerspective() {
      return this.perspective;
   }

   /** @deprecated */
   public MarkerOptions perspective(boolean var1) {
      this.perspective = var1;
      return this;
   }

   public MarkerOptions() {
   }

   public MarkerOptions position(LatLng var1) {
      this.latLng = var1;
      return this;
   }

   public MarkerOptions setFlat(boolean var1) {
      this.isFlat = var1;
      return this;
   }

   private void a() {
      if (this.bitmapDescriptors == null) {
         try {
            this.bitmapDescriptors = new ArrayList();
         } catch (Throwable var2) {
            var2.printStackTrace();
         }
      }

   }

   public MarkerOptions icon(BitmapDescriptor var1) {
      try {
         this.a();
         this.bitmapDescriptors.clear();
         this.bitmapDescriptors.add(var1);
         this.isRotatingMode = false;
      } catch (Throwable var3) {
         var3.printStackTrace();
      }

      return this;
   }

   public MarkerOptions anchor(float var1, float var2) {
      this.anchorU = var1;
      this.anchorV = var2;
      return this;
   }

   public MarkerOptions setInfoWindowOffset(int var1, int var2) {
      this.offsetX = var1;
      this.offsetY = var2;
      return this;
   }

   public MarkerOptions title(String var1) {
      this.title = var1;
      return this;
   }

   public MarkerOptions snippet(String var1) {
      this.snippet = var1;
      return this;
   }

   public MarkerOptions draggable(boolean var1) {
      this.isDraggable = var1;
      return this;
   }

   public MarkerOptions visible(boolean var1) {
      this.isVisible = var1;
      return this;
   }

   public MarkerOptions setGps(boolean var1) {
      this.isGps = var1;
      return this;
   }

   public LatLng getPosition() {
      return this.latLng;
   }

   public String getTitle() {
      return this.title;
   }

   public String getSnippet() {
      return this.snippet;
   }

   public BitmapDescriptor getIcon() {
      return this.bitmapDescriptors != null && this.bitmapDescriptors.size() != 0 ? (BitmapDescriptor)this.bitmapDescriptors.get(0) : null;
   }

   public float getAnchorU() {
      return this.anchorU;
   }

   public int getInfoWindowOffsetX() {
      return this.offsetX;
   }

   public int getInfoWindowOffsetY() {
      return this.offsetY;
   }

   public float getAnchorV() {
      return this.anchorV;
   }

   public boolean isDraggable() {
      return this.isDraggable;
   }

   public boolean isVisible() {
      return this.isVisible;
   }

   public boolean isGps() {
      return this.isGps;
   }

   public boolean isFlat() {
      return this.isFlat;
   }

   public MarkerOptions zIndex(float var1) {
      this.zIndex = var1;
      return this;
   }

   public float getZIndex() {
      return this.zIndex;
   }

   public MarkerOptions alpha(float var1) {
      this.b = var1;
      return this;
   }

   public float getAlpha() {
      return this.b;
   }

   public MarkerOptions autoOverturnInfoWindow(boolean var1) {
      this.c = var1;
      return this;
   }

   public boolean isInfoWindowAutoOverturn() {
      return this.c;
   }

   public MarkerOptions displayLevel(int var1) {
      this.e = var1;
      return this;
   }

   public int getDisplayLevel() {
      return this.e;
   }

   public MarkerOptions rotateAngle(float var1) {
      this.f = var1;
      return this;
   }

   public float getRotateAngle() {
      return this.f;
   }

   public MarkerOptions infoWindowEnable(boolean var1) {
      this.d = var1;
      return this;
   }

   public boolean isInfoWindowEnable() {
      return this.d;
   }

   public MarkerOptions belowMaskLayer(boolean var1) {
      this.isBelowMaskLayer = var1;
      return this;
   }

   public boolean isBelowMaskLayer() {
      return this.isBelowMaskLayer;
   }

   public int describeContents() {
      return 0;
   }

   public void writeToParcel(Parcel var1, int var2) {
      var1.writeParcelable(this.latLng, var2);
      var1.writeString(this.title);
      var1.writeString(this.snippet);
      var1.writeFloat(this.anchorU);
      var1.writeFloat(this.anchorV);
      var1.writeInt(this.offsetX);
      var1.writeInt(this.offsetY);
      var1.writeBooleanArray(new boolean[]{this.isVisible, this.isDraggable, this.isGps, this.isFlat, this.c, this.d, this.isBelowMaskLayer, this.isRotatingMode});
      var1.writeString(this.a);
      var1.writeInt(this.period);
      var1.writeList(this.bitmapDescriptors);
      var1.writeFloat(this.zIndex);
      var1.writeFloat(this.b);
      var1.writeInt(this.e);
      var1.writeFloat(this.f);
      var1.writeFloat(this.angleOffset);
      if (this.bitmapDescriptors != null && this.bitmapDescriptors.size() != 0) {
         var1.writeParcelable((Parcelable)this.bitmapDescriptors.get(0), var2);
      }

   }
}
