package com.autonavi.amap.mapcore.interfaces;

import android.os.RemoteException;
import com.amap.api.maps.model.BaseHoleOptions;
import com.amap.api.maps.model.LatLng;
import java.util.List;

public interface IPolygon extends IOverlay {
   void setStrokeWidth(float var1) throws RemoteException;

   float getStrokeWidth() throws RemoteException;

   void setFillColor(int var1) throws RemoteException;

   int getFillColor() throws RemoteException;

   void setStrokeColor(int var1) throws RemoteException;

   void setPoints(List<LatLng> var1) throws RemoteException;

   List<LatLng> getPoints() throws RemoteException;

   int getStrokeColor() throws RemoteException;

   boolean contains(LatLng var1) throws RemoteException;

   void setHoleOptions(List<BaseHoleOptions> var1) throws RemoteException;

   List<BaseHoleOptions> getHoleOptions() throws RemoteException;
}
