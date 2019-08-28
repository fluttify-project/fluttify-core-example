package com.autonavi.amap.mapcore.interfaces;

import android.os.RemoteException;
import com.amap.api.maps.model.LatLng;
import java.util.List;

public interface INavigateArrow extends IOverlay {
   void setTopColor(int var1) throws RemoteException;

   void setSideColor(int var1) throws RemoteException;

   int getTopColor() throws RemoteException;

   int getSideColor() throws RemoteException;

   void setPoints(List<LatLng> var1) throws RemoteException;

   List<LatLng> getPoints() throws RemoteException;

   void setWidth(float var1) throws RemoteException;

   float getWidth() throws RemoteException;

   void set3DModel(boolean var1);

   boolean is3DModel();
}
