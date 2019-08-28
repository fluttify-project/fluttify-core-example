package com.autonavi.amap.mapcore.interfaces;

import android.os.RemoteException;

public interface IArc extends IOverlay {
   void setStrokeWidth(float var1) throws RemoteException;

   float getStrokeWidth() throws RemoteException;

   void setStrokeColor(int var1) throws RemoteException;

   int getStrokeColor() throws RemoteException;
}
