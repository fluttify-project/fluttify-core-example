package com.autonavi.amap.mapcore.interfaces;

import android.graphics.Point;
import android.graphics.PointF;
import android.os.RemoteException;
import com.amap.api.maps.model.AMapCameraInfo;
import com.amap.api.maps.model.LatLng;
import com.amap.api.maps.model.LatLngBounds;
import com.amap.api.maps.model.TileProjection;
import com.amap.api.maps.model.VisibleRegion;

public interface IProjection {
   LatLng fromScreenLocation(Point var1) throws RemoteException;

   Point toScreenLocation(LatLng var1) throws RemoteException;

   PointF toMapLocation(LatLng var1) throws RemoteException;

   VisibleRegion getVisibleRegion() throws RemoteException;

   float toMapLenWithWin(int var1) throws RemoteException;

   TileProjection fromBoundsToTile(LatLngBounds var1, int var2, int var3) throws RemoteException;

   LatLngBounds getMapBounds(LatLng var1, float var2) throws RemoteException;

   AMapCameraInfo getCameraInfo();
}
