package com.autonavi.amap.mapcore.interfaces;

import android.os.RemoteException;
import com.amap.api.maps.model.BitmapDescriptor;
import com.amap.api.maps.model.LatLng;
import com.amap.api.maps.model.LatLngBounds;

public interface IGroundOverlay extends IOverlay {
   void setPosition(LatLng var1) throws RemoteException;

   LatLng getPosition() throws RemoteException;

   void setDimensions(float var1) throws RemoteException;

   void setDimensions(float var1, float var2) throws RemoteException;

   float getWidth() throws RemoteException;

   float getHeight() throws RemoteException;

   void setPositionFromBounds(LatLngBounds var1) throws RemoteException;

   LatLngBounds getBounds() throws RemoteException;

   void setBearing(float var1) throws RemoteException;

   float getBearing() throws RemoteException;

   void setTransparency(float var1) throws RemoteException;

   float getTransparency() throws RemoteException;

   void setImage(BitmapDescriptor var1) throws RemoteException;
}
