package com.autonavi.amap.mapcore.interfaces;

import android.os.RemoteException;
import com.amap.api.maps.model.BaseHoleOptions;
import com.amap.api.maps.model.LatLng;
import java.util.List;

public interface ICircle extends IOverlay {
   void setCenter(LatLng var1) throws RemoteException;

   LatLng getCenter() throws RemoteException;

   void setRadius(double var1) throws RemoteException;

   double getRadius() throws RemoteException;

   void setStrokeWidth(float var1) throws RemoteException;

   float getStrokeWidth() throws RemoteException;

   void setStrokeColor(int var1) throws RemoteException;

   int getStrokeColor() throws RemoteException;

   void setFillColor(int var1) throws RemoteException;

   int getFillColor() throws RemoteException;

   boolean contains(LatLng var1) throws RemoteException;

   void setHoleOptions(List<BaseHoleOptions> var1) throws RemoteException;

   List<BaseHoleOptions> getHoleOptions() throws RemoteException;

   int getDottedLineType();

   void setDottedLineType(int var1);
}
