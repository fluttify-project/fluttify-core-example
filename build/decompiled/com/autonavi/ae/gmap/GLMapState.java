package com.autonavi.ae.gmap;

import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import com.autonavi.amap.mapcore.DPoint;
import com.autonavi.amap.mapcore.FPoint;
import com.autonavi.amap.mapcore.IPoint;
import com.autonavi.amap.mapcore.VirtualEarthProjection;

public class GLMapState {
   private long nativeStateInstance = 0L;
   private long nativeEngineInstance = 0L;
   private boolean isNewInstance = false;

   public GLMapState(int var1, long var2) {
      if (var2 != 0L) {
         this.nativeEngineInstance = var2;
         this.nativeStateInstance = nativeNewInstance(var1, var2);
         this.isNewInstance = true;
      }

   }

   public GLMapState(long var1, long var3) {
      if (var1 != 0L) {
         this.nativeEngineInstance = var1;
         this.nativeStateInstance = var3;
         this.isNewInstance = true;
      }

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

   public void screenToP20Point(int var1, int var2, Point var3) {
      if (this.nativeStateInstance != 0L) {
         nativeScreenToP20Point(this.nativeStateInstance, (float)var1, (float)var2, var3);
      }

   }

   public void p20ToScreenPoint(int var1, int var2, FPoint var3) {
      if (this.nativeStateInstance != 0L) {
         nativeP20ToScreenPoint(this.nativeStateInstance, var1, var2, 0, var3);
      }

   }

   public void getMapGeoCenter(IPoint var1) {
      nativeGetMapCenter(this.nativeStateInstance, var1);
   }

   public Point getMapGeoCenter() {
      Point var1 = new Point();
      nativeGetMapCenter(this.nativeStateInstance, var1);
      return var1;
   }

   public void setMapGeoCenter(int var1, int var2) {
      if (this.nativeStateInstance != 0L) {
         nativeSetMapCenter(this.nativeStateInstance, var1, var2);
      }

   }

   public void setCameraDegree(float var1) {
      if (this.nativeStateInstance != 0L) {
         nativeSetCameraDegree(this.nativeStateInstance, var1);
      }

   }

   public void setMapAngle(float var1) {
      if (this.nativeStateInstance != 0L) {
         nativeSetMapAngle(this.nativeStateInstance, var1);
      }

   }

   public void setMapZoomer(float var1) {
      if (this.nativeStateInstance != 0L) {
         nativeSetMapZoomer(this.nativeStateInstance, var1);
      }

   }

   public float getMapZoomer() {
      return this.nativeStateInstance != 0L ? nativeGetMapZoomer(this.nativeStateInstance) : 0.0F;
   }

   public float getCameraDegree() {
      return this.nativeStateInstance != 0L ? nativeGetCameraDegree(this.nativeStateInstance) : 0.0F;
   }

   public float getMapAngle() {
      return this.nativeStateInstance != 0L ? nativeGetMapAngle(this.nativeStateInstance) : 0.0F;
   }

   public void recalculate() {
      if (this.nativeStateInstance != 0L) {
         nativeRecalculate(this.nativeStateInstance);
      }

   }

   public void recycle() {
      if (this.nativeStateInstance != 0L && this.isNewInstance) {
         nativeStateDestroy(this.nativeStateInstance);
      }

      this.nativeStateInstance = 0L;
   }

   public void reset() {
      if (this.nativeStateInstance != 0L) {
         this.recycle();
      }

      if (this.nativeEngineInstance != 0L) {
         this.nativeStateInstance = nativeNewInstance(1, this.nativeEngineInstance);
      }

   }

   public float getMapLenWithWin(int var1) {
      return this.getGLUnitWithWin(var1);
   }

   public float getGLUnitWithWin(int var1) {
      return this.nativeStateInstance != 0L ? nativeGetGLUnitWithWin(this.nativeStateInstance, var1) : 0.0F;
   }

   public void getPixel20Bound(Rect var1, int var2, int var3) {
      if (this.nativeStateInstance != 0L) {
         nativeGetPixel20Bound(this.nativeStateInstance, var1, var2, var3);
      }

   }

   public long getNativeInstance() {
      return this.nativeStateInstance;
   }

   public void getViewMatrix(float[] var1) {
      byte var2 = 16;
      if (var1 != null && var1.length == var2) {
         nativeGetViewMatrix(this.nativeStateInstance, var1);
      }

   }

   public void getProjectionMatrix(float[] var1) {
      byte var2 = 16;
      if (var1 != null && var1.length == var2) {
         nativeGetProjectionMatrix(this.nativeStateInstance, var1);
      }

   }

   public float getSkyHeight() {
      return this.nativeStateInstance != 0L ? nativeGetSkyHeight(this.nativeStateInstance) : 0.0F;
   }

   public void setNativeMapengineState(int var1, long var2) {
      if (var2 != 0L && this.nativeStateInstance != 0L) {
         this.nativeEngineInstance = var2;
         nativeSetMapState(var1, var2, this.nativeStateInstance);
      }
   }

   public static float calMapZoomScalefactor(int var0, int var1, int var2) {
      return nativeCalMapZoomScalefactor(var0, var1, (float)var2);
   }

   public static native long nativeNewInstance(int var0, long var1);

   private static native void nativeSetMapState(int var0, long var1, long var3);

   public static native void nativeScreenToP20Point(long var0, float var2, float var3, Point var4);

   public static native void nativeP20ToScreenPoint(long var0, int var2, int var3, int var4, PointF var5);

   public static native void nativeSetMapCenter(long var0, int var2, int var3);

   public static native void nativeGetMapCenter(long var0, Point var2);

   public static native float nativeGetMapZoomer(long var0);

   public static native void nativeSetMapZoomer(long var0, float var2);

   public static native void nativeSetMapAngle(long var0, float var2);

   public static native float nativeGetCameraDegree(long var0);

   public static native float nativeGetMapAngle(long var0);

   public static native void nativeSetCameraDegree(long var0, float var2);

   public static native void nativeRecalculate(long var0);

   public static native void nativeStateDestroy(long var0);

   public static native void nativeGetViewMatrix(long var0, float[] var2);

   public static native void nativeGetProjectionMatrix(long var0, float[] var2);

   public static native float nativeGetSkyHeight(long var0);

   public static native float nativeGetGLUnitWithWin(long var0, int var2);

   public static native void nativeGetPixel20Bound(long var0, Rect var2, int var3, int var4);

   public static native float nativeCalMapZoomScalefactor(int var0, int var1, float var2);

   public String toString() {
      return "instance: " + this.nativeStateInstance + " center: " + this.getMapGeoCenter().x + " , " + this.getMapGeoCenter().y + " bearing:" + this.getCameraDegree() + "  tilt:" + this.getMapAngle() + "  zoom:" + this.getMapZoomer() + "  ";
   }
}
