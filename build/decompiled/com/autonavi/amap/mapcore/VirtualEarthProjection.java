package com.autonavi.amap.mapcore;

import android.graphics.Point;

public class VirtualEarthProjection {
   public static final int MAXZOOMLEVEL = 20;
   public static final int PIXELS_PER_TILE = 256;
   public static final double MIN_LATITUDE = -85.0511287798D;
   public static final double MAX_LATITUDE = 85.0511287798D;
   public static final double MIN_LONGITUDE = -360.0D;
   public static final double MAX_LONGITUDE = 360.0D;
   public static final int EARTH_RADIUS_IN_METERS = 6378137;
   public static final int TILE_SPLIT_LEVEL = 0;
   private static final int KMA_MAX_MAP_SIZE = 268435456;
   private static final double K_EARTH_CIRCLE = 4.0075016E7D;
   private static final double K_EARTH_CIRCLE_2 = 2.0037508E7D;
   public static final double EARTH_CIRCUMFERENCE_IN_METERS = 4.007501668557849E7D;

   public VirtualEarthProjection() {
   }

   public static double clip(double var0, double var2, double var4) {
      return Math.min(Math.max(var0, var2), var4);
   }

   public static Point latLongToPixels(int var0, int var1, int var2) {
      return latLongToPixels((double)var1 / 3600000.0D, (double)var0 / 3600000.0D, var2);
   }

   private static double radToDeg(double var0) {
      return var0 * 57.29577951308232D;
   }

   private static double degToRad(double var0) {
      return var0 * 0.017453292519943295D;
   }

   public static Point latLongToPixels(double var0, double var2, int var4) {
      Point var5 = new Point();
      var0 = clip(var0, -85.0511287798D, 85.0511287798D);
      var2 = clip(var2, -360.0D, 360.0D);
      double var6 = 0.14929106831550598D;
      double var8 = 6378137.0D * degToRad(var2);
      double var10 = Math.sin(degToRad(var0));
      double var12 = Math.log((1.0D + var10) / (1.0D - var10));
      double var14 = 6378137.0D * var12 / 2.0D;
      double var16 = (2.0037508E7D + var8) / var6;
      double var18 = (2.0037508E7D - var14) / var6;
      var5.x = (int)var16;
      var5.y = (int)var18;
      return var5;
   }

   public static DPoint pixelsToLatLong(long var0, long var2, int var4) {
      DPoint var5 = DPoint.obtain();
      double var6 = 0.14929106831550598D;
      double var8 = (double)var0 * var6 - 2.0037508E7D;
      double var10 = 2.0037508E7D - (double)var2 * var6;
      double var12 = var8 / 6378137.0D;
      var5.x = radToDeg(var12);
      double var14 = var10 / 6378137.0D;
      double var16 = Math.exp(var14 * 2.0D);
      double var18 = (var16 - 1.0D) / (1.0D + var16);
      var5.y = radToDeg(Math.asin(var18));
      return var5;
   }
}
