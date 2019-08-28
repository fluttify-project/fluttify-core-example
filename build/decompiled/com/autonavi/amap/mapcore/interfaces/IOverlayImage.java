package com.autonavi.amap.mapcore.interfaces;

import android.os.RemoteException;
import com.amap.api.maps.model.LatLng;

public interface IOverlayImage {
   boolean remove() throws RemoteException;

   void destroy(boolean var1);

   void setRotateAngle(float var1) throws RemoteException;

   float getRotateAngle();

   void setZIndex(float var1);

   float getZIndex();

   String getId() throws RemoteException;

   LatLng getPosition() throws RemoteException;

   void setPosition(LatLng var1) throws RemoteException;

   void setVisible(boolean var1) throws RemoteException;

   boolean isVisible() throws RemoteException;

   boolean equalsRemote(IOverlayImage var1) throws RemoteException;

   int hashCodeRemote();

   void setObject(Object var1);

   Object getObject();

   void setAnchor(float var1, float var2) throws RemoteException;

   float getAnchorU();

   float getAnchorV();
}
