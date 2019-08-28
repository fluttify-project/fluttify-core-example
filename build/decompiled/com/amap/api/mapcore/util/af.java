package com.amap.api.mapcore.util;

import android.graphics.Point;
import android.graphics.PointF;
import android.os.RemoteException;
import com.amap.api.maps.model.AMapCameraInfo;
import com.amap.api.maps.model.LatLng;
import com.amap.api.maps.model.LatLngBounds;
import com.amap.api.maps.model.TileProjection;
import com.amap.api.maps.model.VisibleRegion;
import com.autonavi.amap.mapcore.DPoint;
import com.autonavi.amap.mapcore.FPoint;
import com.autonavi.amap.mapcore.IPoint;

class af implements w {
   private u a;

   public af(u var1) {
      this.a = var1;
   }

   public LatLng fromScreenLocation(Point var1) throws RemoteException {
      if (var1 == null) {
         return null;
      } else {
         DPoint var2 = DPoint.obtain();
         this.a.b(var1.x, var1.y, var2);
         LatLng var3 = new LatLng(var2.y, var2.x);
         var2.recycle();
         return var3;
      }
   }

   public Point toScreenLocation(LatLng var1) throws RemoteException {
      if (var1 == null) {
         return null;
      } else {
         IPoint var2 = IPoint.obtain();
         this.a.b(var1.latitude, var1.longitude, var2);
         Point var3 = new Point(var2.x, var2.y);
         var2.recycle();
         return var3;
      }
   }

   public VisibleRegion getVisibleRegion() throws RemoteException {
      int var1 = this.a.getMapWidth();
      int var2 = this.a.getMapHeight();
      LatLng var3 = this.fromScreenLocation(new Point(0, 0));
      LatLng var4 = this.fromScreenLocation(new Point(var1, 0));
      LatLng var5 = this.fromScreenLocation(new Point(0, var2));
      LatLng var6 = this.fromScreenLocation(new Point(var1, var2));
      LatLngBounds var7 = LatLngBounds.builder().include(var5).include(var6).include(var3).include(var4).build();
      return new VisibleRegion(var5, var6, var3, var4, var7);
   }

   public PointF toMapLocation(LatLng var1) throws RemoteException {
      if (var1 == null) {
         return null;
      } else {
         FPoint var2 = FPoint.obtain();
         this.a.a(var1.latitude, var1.longitude, var2);
         PointF var3 = new PointF(var2.x, var2.y);
         var2.recycle();
         return var3;
      }
   }

   public float toMapLenWithWin(int var1) {
      return var1 <= 0 ? 0.0F : this.a.h(var1);
   }

   public TileProjection fromBoundsToTile(LatLngBounds var1, int var2, int var3) throws RemoteException {
      byte var4 = 20;
      if (var1 != null && var2 >= 0 && var2 <= var4 && var3 > 0) {
         IPoint var5 = IPoint.obtain();
         IPoint var6 = IPoint.obtain();
         this.a.a(var1.southwest.latitude, var1.southwest.longitude, var5);
         this.a.a(var1.northeast.latitude, var1.northeast.longitude, var6);
         int var7 = (var5.x >> 20 - var2) / var3;
         int var8 = (var5.y >> 20 - var2) / var3;
         int var9 = (var6.x >> 20 - var2) / var3;
         int var10 = (var6.y >> 20 - var2) / var3;
         int var11 = (var7 << 20 - var2) * var3;
         int var12 = (var10 << 20 - var2) * var3;
         int var13 = var5.x - var11 >> 20 - var2;
         int var14 = var6.y - var12 >> 20 - var2;
         var5.recycle();
         var6.recycle();
         return new TileProjection(var13, var14, var7, var9, var10, var8);
      } else {
         return null;
      }
   }

   public LatLngBounds getMapBounds(LatLng var1, float var2) throws RemoteException {
      return this.a != null && var1 != null ? this.a.a(var1, var2, 0.0F, 0.0F) : null;
   }

   public AMapCameraInfo getCameraInfo() {
      return this.a.getCamerInfo();
   }
}
