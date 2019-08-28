package com.autonavi.amap.mapcore.interfaces;

import android.os.RemoteException;

public interface IOverlay {
   void remove() throws RemoteException;

   String getId() throws RemoteException;

   void setZIndex(float var1) throws RemoteException;

   float getZIndex() throws RemoteException;

   void setVisible(boolean var1) throws RemoteException;

   boolean isVisible() throws RemoteException;

   boolean equalsRemote(IOverlay var1) throws RemoteException;

   int hashCodeRemote() throws RemoteException;

   void destroy();

   boolean isAboveMaskLayer();

   void setAboveMaskLayer(boolean var1);
}
