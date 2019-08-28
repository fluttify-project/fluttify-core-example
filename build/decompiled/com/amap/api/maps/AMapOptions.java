package com.amap.api.maps;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.maps.model.CameraPosition;

public class AMapOptions implements Parcelable {
   public static final AMapOptionsCreator CREATOR = new AMapOptionsCreator();
   private int a = 1;
   private boolean b = true;
   private boolean c = true;
   private boolean d = true;
   private boolean e = true;
   private boolean f = true;
   private boolean g = false;
   private CameraPosition h;
   private boolean i = false;
   private boolean j = false;
   private int k = 0;
   public static final int LOGO_POSITION_BOTTOM_LEFT = 0;
   public static final int LOGO_POSITION_BOTTOM_CENTER = 1;
   public static final int LOGO_POSITION_BOTTOM_RIGHT = 2;
   public static final int ZOOM_POSITION_RIGHT_CENTER = 1;
   public static final int ZOOM_POSITION_RIGHT_BUTTOM = 2;
   public static final int LOGO_MARGIN_LEFT = 0;
   public static final int LOGO_MARGIN_RIGHT = 1;
   public static final int LOGO_MARGIN_BOTTOM = 2;

   public AMapOptions() {
   }

   public AMapOptions logoPosition(int var1) {
      this.k = var1;
      return this;
   }

   public AMapOptions zOrderOnTop(boolean var1) {
      this.g = var1;
      return this;
   }

   public AMapOptions mapType(int var1) {
      this.a = var1;
      return this;
   }

   public AMapOptions camera(CameraPosition var1) {
      this.h = var1;
      return this;
   }

   public AMapOptions scaleControlsEnabled(boolean var1) {
      this.j = var1;
      return this;
   }

   public AMapOptions zoomControlsEnabled(boolean var1) {
      this.f = var1;
      return this;
   }

   public AMapOptions compassEnabled(boolean var1) {
      this.i = var1;
      return this;
   }

   public AMapOptions scrollGesturesEnabled(boolean var1) {
      this.c = var1;
      return this;
   }

   public AMapOptions zoomGesturesEnabled(boolean var1) {
      this.e = var1;
      return this;
   }

   public AMapOptions tiltGesturesEnabled(boolean var1) {
      this.d = var1;
      return this;
   }

   public AMapOptions rotateGesturesEnabled(boolean var1) {
      this.b = var1;
      return this;
   }

   public int getLogoPosition() {
      return this.k;
   }

   public boolean getZOrderOnTop() {
      return this.g;
   }

   public int getMapType() {
      return this.a;
   }

   public CameraPosition getCamera() {
      return this.h;
   }

   public boolean getScaleControlsEnabled() {
      return this.j;
   }

   public boolean getZoomControlsEnabled() {
      return this.f;
   }

   public boolean getCompassEnabled() {
      return this.i;
   }

   public boolean getScrollGesturesEnabled() {
      return this.c;
   }

   public boolean getZoomGesturesEnabled() {
      return this.e;
   }

   public boolean getTiltGesturesEnabled() {
      return this.d;
   }

   public boolean getRotateGesturesEnabled() {
      return this.b;
   }

   public int describeContents() {
      return 0;
   }

   public void writeToParcel(Parcel var1, int var2) {
      var1.writeParcelable(this.h, var2);
      var1.writeInt(this.a);
      boolean[] var3 = new boolean[]{this.b, this.c, this.d, this.e, this.f, this.g, this.i, this.j};
      var1.writeBooleanArray(var3);
   }
}
