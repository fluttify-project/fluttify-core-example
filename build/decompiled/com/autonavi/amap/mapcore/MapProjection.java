package com.autonavi.amap.mapcore;

import android.graphics.Point;

public class MapProjection {
   public MapProjection() {
   }

   public static void lonlat2Geo(double var0, double var2, IPoint var4) {
      Point var5 = VirtualEarthProjection.latLongToPixels(var2, var0, 20);
      var4.x = var5.x;
      var4.y = var5.y;
   }

   public static void geo2LonLat(int var0, int var1, DPoint var2) {
      DPoint var3 = VirtualEarthProjection.pixelsToLatLong((long)var0, (long)var1, 20);
      var2.x = var3.x;
      var2.y = var3.y;
      var3.recycle();
   }
}
