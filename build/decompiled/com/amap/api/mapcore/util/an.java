package com.amap.api.mapcore.util;

import android.graphics.Point;
import com.amap.api.maps.model.CameraPosition;
import com.amap.api.maps.model.LatLng;
import com.amap.api.maps.model.LatLngBounds;
import com.autonavi.amap.mapcore.AbstractCameraUpdateMessage;
import com.autonavi.amap.mapcore.AbstractCameraUpdateMessage$Type;
import com.autonavi.amap.mapcore.VirtualEarthProjection;

public class an {
   public static AbstractCameraUpdateMessage a() {
      am var0 = new am();
      var0.nowType = AbstractCameraUpdateMessage$Type.zoomBy;
      var0.amount = 1.0F;
      return var0;
   }

   public static AbstractCameraUpdateMessage b() {
      am var0 = new am();
      var0.nowType = AbstractCameraUpdateMessage$Type.zoomBy;
      var0.amount = -1.0F;
      return var0;
   }

   public static AbstractCameraUpdateMessage a(float var0, float var1) {
      al var2 = new al();
      var2.nowType = AbstractCameraUpdateMessage$Type.scrollBy;
      var2.xPixel = var0;
      var2.yPixel = var1;
      return var2;
   }

   public static AbstractCameraUpdateMessage a(float var0) {
      ak var1 = new ak();
      var1.nowType = AbstractCameraUpdateMessage$Type.newCameraPosition;
      var1.zoom = var0;
      return var1;
   }

   public static AbstractCameraUpdateMessage b(float var0) {
      return a(var0, (Point)null);
   }

   public static AbstractCameraUpdateMessage a(float var0, Point var1) {
      am var2 = new am();
      var2.nowType = AbstractCameraUpdateMessage$Type.zoomBy;
      var2.amount = var0;
      var2.focus = var1;
      return var2;
   }

   public static AbstractCameraUpdateMessage a(CameraPosition var0) {
      ak var1 = new ak();
      var1.nowType = AbstractCameraUpdateMessage$Type.newCameraPosition;
      if (var0 != null && var0.target != null) {
         Point var2 = VirtualEarthProjection.latLongToPixels(var0.target.latitude, var0.target.longitude, 20);
         var1.geoPoint = var2;
         var1.zoom = var0.zoom;
         var1.bearing = var0.bearing;
         var1.tilt = var0.tilt;
         var1.cameraPosition = var0;
         return var1;
      } else {
         return var1;
      }
   }

   public static AbstractCameraUpdateMessage a(Point var0) {
      ak var1 = new ak();
      var1.nowType = AbstractCameraUpdateMessage$Type.newCameraPosition;
      var1.geoPoint = var0;
      return var1;
   }

   public static AbstractCameraUpdateMessage c(float var0) {
      ak var1 = new ak();
      var1.nowType = AbstractCameraUpdateMessage$Type.newCameraPosition;
      var1.tilt = var0;
      return var1;
   }

   public static AbstractCameraUpdateMessage d(float var0) {
      ak var1 = new ak();
      var1.nowType = AbstractCameraUpdateMessage$Type.newCameraPosition;
      var1.bearing = var0;
      return var1;
   }

   public static AbstractCameraUpdateMessage b(float var0, Point var1) {
      ak var2 = new ak();
      var2.nowType = AbstractCameraUpdateMessage$Type.newCameraPosition;
      var2.geoPoint = var1;
      var2.bearing = var0;
      return var2;
   }

   public static AbstractCameraUpdateMessage a(LatLng var0) {
      return a(CameraPosition.builder().target(var0).zoom(Float.NaN).bearing(Float.NaN).tilt(Float.NaN).build());
   }

   public static AbstractCameraUpdateMessage a(LatLng var0, float var1) {
      return a(CameraPosition.builder().target(var0).zoom(var1).bearing(Float.NaN).tilt(Float.NaN).build());
   }

   public static AbstractCameraUpdateMessage a(LatLngBounds var0, int var1) {
      aj var2 = new aj();
      var2.nowType = AbstractCameraUpdateMessage$Type.newLatLngBounds;
      var2.bounds = var0;
      var2.paddingLeft = var1;
      var2.paddingRight = var1;
      var2.paddingTop = var1;
      var2.paddingBottom = var1;
      return var2;
   }

   public static AbstractCameraUpdateMessage a(LatLngBounds var0, int var1, int var2, int var3) {
      aj var4 = new aj();
      var4.nowType = AbstractCameraUpdateMessage$Type.newLatLngBoundsWithSize;
      var4.bounds = var0;
      var4.paddingLeft = var3;
      var4.paddingRight = var3;
      var4.paddingTop = var3;
      var4.paddingBottom = var3;
      var4.width = var1;
      var4.height = var2;
      return var4;
   }

   public static AbstractCameraUpdateMessage a(LatLngBounds var0, int var1, int var2, int var3, int var4) {
      aj var5 = new aj();
      var5.nowType = AbstractCameraUpdateMessage$Type.newLatLngBounds;
      var5.bounds = var0;
      var5.paddingLeft = var1;
      var5.paddingRight = var2;
      var5.paddingTop = var3;
      var5.paddingBottom = var4;
      return var5;
   }

   public static AbstractCameraUpdateMessage c() {
      ak var0 = new ak();
      return var0;
   }
}
