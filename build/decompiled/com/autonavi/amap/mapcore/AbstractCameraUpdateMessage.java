package com.autonavi.amap.mapcore;

import android.graphics.Point;
import com.amap.api.mapcore.util.fi;
import com.amap.api.maps.AMap$CancelableCallback;
import com.amap.api.maps.model.CameraPosition;
import com.amap.api.maps.model.LatLngBounds;
import com.autonavi.ae.gmap.GLMapEngine;
import com.autonavi.ae.gmap.GLMapState;

public abstract class AbstractCameraUpdateMessage {
   public AbstractCameraUpdateMessage$Type nowType;
   public float xPixel;
   public float yPixel;
   public float amount;
   public CameraPosition cameraPosition;
   public LatLngBounds bounds;
   public Point focus;
   public float zoom;
   public float tilt;
   public float bearing;
   public Point geoPoint;
   public boolean isUseAnchor;
   public int anchorX;
   public int anchorY;
   public boolean isChangeFinished;
   public MapConfig mapConfig;
   public int paddingLeft;
   public int paddingRight;
   public int paddingTop;
   public int paddingBottom;
   public AMap$CancelableCallback mCallback;
   public long mDuration;
   public int width;
   public int height;

   public AbstractCameraUpdateMessage() {
      this.nowType = AbstractCameraUpdateMessage$Type.none;
      this.focus = null;
      this.zoom = Float.NaN;
      this.tilt = Float.NaN;
      this.bearing = Float.NaN;
      this.isUseAnchor = false;
      this.mDuration = 250L;
   }

   public abstract void runCameraUpdate(GLMapState var1);

   protected void normalChange(GLMapState var1) {
      this.zoom = Float.isNaN(this.zoom) ? var1.getMapZoomer() : this.zoom;
      this.bearing = Float.isNaN(this.bearing) ? var1.getMapAngle() : this.bearing;
      this.tilt = Float.isNaN(this.tilt) ? var1.getCameraDegree() : this.tilt;
      this.zoom = fi.a(this.mapConfig, this.zoom);
      this.tilt = fi.a(this.tilt, this.zoom);
      this.bearing = (float)(((double)this.bearing % 360.0D + 360.0D) % 360.0D);
      if (this.focus != null && this.geoPoint == null) {
         this.geoPoint = this.getAnchorGeoPoint(var1, this.focus.x, this.focus.y);
      }

      if (!Float.isNaN(this.zoom)) {
         var1.setMapZoomer(this.zoom);
      }

      if (!Float.isNaN(this.bearing)) {
         var1.setMapAngle(this.bearing);
      }

      if (!Float.isNaN(this.tilt)) {
         var1.setCameraDegree(this.tilt);
      }

      if (this.focus != null) {
         this.changeCenterByAnchor(var1, this.geoPoint, this.focus.x, this.focus.y);
      } else {
         boolean var2 = this.geoPoint != null && (this.geoPoint.x != 0 || this.geoPoint.y != 0);
         if (var2) {
            var1.setMapGeoCenter(this.geoPoint.x, this.geoPoint.y);
         }
      }

   }

   protected void changeCenterByAnchor(GLMapState var1, Point var2) {
      this.changeCenterByAnchor(var1, var2, this.anchorX, this.anchorY);
   }

   protected void changeCenterByAnchor(GLMapState var1, Point var2, int var3, int var4) {
      var1.recalculate();
      Point var5 = this.getAnchorGeoPoint(var1, var3, var4);
      Point var6 = var1.getMapGeoCenter();
      var1.setMapGeoCenter(var6.x + var2.x - var5.x, var6.y + var2.y - var5.y);
   }

   protected Point getAnchorGeoPoint(GLMapState var1, int var2, int var3) {
      Point var4 = new Point();
      var1.screenToP20Point(var2, var3, var4);
      return var4;
   }

   public abstract void mergeCameraUpdateDelegate(AbstractCameraUpdateMessage var1);

   public void generateMapAnimation(GLMapEngine var1) {
      GLMapState var2 = var1.getNewMapState(1);
      this.runCameraUpdate(var2);
      Point var3 = var2.getMapGeoCenter();
      var1.addGroupAnimation(1, (int)this.mDuration, var2.getMapZoomer(), (int)var2.getMapAngle(), (int)var2.getCameraDegree(), var3.x, var3.y, this.mCallback);
      var2.recycle();
   }
}
