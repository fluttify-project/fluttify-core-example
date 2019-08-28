package com.amap.api.maps;

import android.graphics.Point;
import android.graphics.PointF;
import com.amap.api.maps.model.AMapCameraInfo;
import com.amap.api.maps.model.LatLng;
import com.amap.api.maps.model.LatLngBounds;
import com.amap.api.maps.model.TileProjection;
import com.amap.api.maps.model.VisibleRegion;
import com.autonavi.amap.mapcore.interfaces.IProjection;

public class Projection {
   private final IProjection a;

   public Projection(IProjection var1) {
      this.a = var1;
   }

   public LatLng fromScreenLocation(Point var1) {
      try {
         return this.a.fromScreenLocation(var1);
      } catch (Throwable var3) {
         var3.printStackTrace();
         return null;
      }
   }

   public Point toScreenLocation(LatLng var1) {
      try {
         return this.a.toScreenLocation(var1);
      } catch (Throwable var3) {
         var3.printStackTrace();
         return null;
      }
   }

   /** @deprecated */
   @Deprecated
   public PointF toMapLocation(LatLng var1) {
      try {
         return this.a.toMapLocation(var1);
      } catch (Throwable var3) {
         var3.printStackTrace();
         return null;
      }
   }

   public PointF toOpenGLLocation(LatLng var1) {
      try {
         return this.a.toMapLocation(var1);
      } catch (Throwable var3) {
         var3.printStackTrace();
         return null;
      }
   }

   public float toOpenGLWidth(int var1) {
      try {
         return this.a.toMapLenWithWin(var1);
      } catch (Throwable var3) {
         var3.printStackTrace();
         return 0.0F;
      }
   }

   public VisibleRegion getVisibleRegion() {
      try {
         return this.a.getVisibleRegion();
      } catch (Throwable var2) {
         var2.printStackTrace();
         return null;
      }
   }

   public TileProjection fromBoundsToTile(LatLngBounds var1, int var2, int var3) {
      try {
         return this.a.fromBoundsToTile(var1, var2, var3);
      } catch (Throwable var5) {
         var5.printStackTrace();
         return null;
      }
   }

   public LatLngBounds getMapBounds(LatLng var1, float var2) {
      try {
         return this.a.getMapBounds(var1, var2);
      } catch (Throwable var4) {
         var4.printStackTrace();
         return null;
      }
   }

   public AMapCameraInfo getCameraInfo() {
      try {
         return this.a.getCameraInfo();
      } catch (Throwable var2) {
         var2.printStackTrace();
         return null;
      }
   }
}
