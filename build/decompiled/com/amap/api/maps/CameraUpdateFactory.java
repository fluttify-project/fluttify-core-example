package com.amap.api.maps;

import android.graphics.Point;
import android.util.Log;
import com.amap.api.mapcore.util.an;
import com.amap.api.maps.model.CameraPosition;
import com.amap.api.maps.model.LatLng;
import com.amap.api.maps.model.LatLngBounds;
import com.autonavi.amap.mapcore.IPoint;
import com.autonavi.amap.mapcore.VirtualEarthProjection;

public final class CameraUpdateFactory {
   public CameraUpdateFactory() {
   }

   public static CameraUpdate zoomIn() {
      return new CameraUpdate(an.a());
   }

   public static CameraUpdate zoomOut() {
      return new CameraUpdate(an.b());
   }

   public static CameraUpdate scrollBy(float var0, float var1) {
      return new CameraUpdate(an.a(var0, var1));
   }

   public static CameraUpdate zoomTo(float var0) {
      return new CameraUpdate(an.a(var0));
   }

   public static CameraUpdate zoomBy(float var0) {
      return new CameraUpdate(an.b(var0));
   }

   public static CameraUpdate zoomBy(float var0, Point var1) {
      return new CameraUpdate(an.a(var0, var1));
   }

   public static CameraUpdate newCameraPosition(CameraPosition var0) {
      if (var0 == null) {
         Log.w("CameraUpdateFactory", "cameraPosition is null");
         return new CameraUpdate(an.c());
      } else {
         return new CameraUpdate(an.a(var0));
      }
   }

   public static CameraUpdate newLatLng(LatLng var0) {
      if (var0 == null) {
         Log.w("CameraUpdateFactory", "latLng is null");
         return new CameraUpdate(an.c());
      } else {
         return new CameraUpdate(an.a(var0));
      }
   }

   public static CameraUpdate newLatLngZoom(LatLng var0, float var1) {
      if (var0 == null) {
         Log.w("CameraUpdateFactory", "target is null");
         return new CameraUpdate(an.c());
      } else {
         return new CameraUpdate(an.a(var0, var1));
      }
   }

   public static CameraUpdate newLatLngBounds(LatLngBounds var0, int var1) {
      if (var0 == null) {
         Log.w("CameraUpdateFactory", "bounds is null");
         return new CameraUpdate(an.c());
      } else {
         return new CameraUpdate(an.a(var0, var1));
      }
   }

   public static CameraUpdate changeLatLng(LatLng var0) {
      if (var0 == null) {
         Log.w("CameraUpdateFactory", "target is null");
         return new CameraUpdate(an.c());
      } else {
         Point var1 = VirtualEarthProjection.latLongToPixels(var0.latitude, var0.longitude, 20);
         return new CameraUpdate(an.a(var1));
      }
   }

   public static CameraUpdate changeBearing(float var0) {
      return new CameraUpdate(an.d(var0 % 360.0F));
   }

   public static CameraUpdate changeBearingGeoCenter(float var0, IPoint var1) {
      if (var1 == null) {
         Log.w("CameraUpdateFactory", "geoPoint is null");
         return new CameraUpdate(an.c());
      } else {
         return new CameraUpdate(an.b(var0 % 360.0F, new Point(var1.x, var1.y)));
      }
   }

   public static CameraUpdate changeTilt(float var0) {
      return new CameraUpdate(an.c(var0));
   }

   public static CameraUpdate newLatLngBounds(LatLngBounds var0, int var1, int var2, int var3) {
      if (var0 == null) {
         Log.w("CameraUpdateFactory", "bounds is null");
         return new CameraUpdate(an.c());
      } else {
         return new CameraUpdate(an.a(var0, var1, var2, var3));
      }
   }

   public static CameraUpdate newLatLngBoundsRect(LatLngBounds var0, int var1, int var2, int var3, int var4) {
      if (var0 == null) {
         Log.w("CameraUpdateFactory", "bounds is null");
         return new CameraUpdate(an.c());
      } else {
         return new CameraUpdate(an.a(var0, var1, var2, var3, var4));
      }
   }
}
