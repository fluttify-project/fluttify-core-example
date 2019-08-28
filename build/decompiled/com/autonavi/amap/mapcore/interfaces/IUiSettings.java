package com.autonavi.amap.mapcore.interfaces;

import android.os.RemoteException;

public interface IUiSettings {
   boolean isIndoorSwitchEnabled() throws RemoteException;

   void setIndoorSwitchEnabled(boolean var1) throws RemoteException;

   void setScaleControlsEnabled(boolean var1) throws RemoteException;

   void setZoomControlsEnabled(boolean var1) throws RemoteException;

   void setCompassEnabled(boolean var1) throws RemoteException;

   void setMyLocationButtonEnabled(boolean var1) throws RemoteException;

   void setScrollGesturesEnabled(boolean var1) throws RemoteException;

   void setZoomGesturesEnabled(boolean var1) throws RemoteException;

   void setTiltGesturesEnabled(boolean var1) throws RemoteException;

   void setRotateGesturesEnabled(boolean var1) throws RemoteException;

   void setAllGesturesEnabled(boolean var1) throws RemoteException;

   void setLogoPosition(int var1) throws RemoteException;

   void setZoomPosition(int var1) throws RemoteException;

   boolean isScaleControlsEnabled() throws RemoteException;

   boolean isZoomControlsEnabled() throws RemoteException;

   boolean isCompassEnabled() throws RemoteException;

   boolean isMyLocationButtonEnabled() throws RemoteException;

   boolean isScrollGesturesEnabled() throws RemoteException;

   boolean isZoomGesturesEnabled() throws RemoteException;

   boolean isTiltGesturesEnabled() throws RemoteException;

   boolean isRotateGesturesEnabled() throws RemoteException;

   int getLogoPosition() throws RemoteException;

   int getZoomPosition() throws RemoteException;

   void setZoomInByScreenCenter(boolean var1) throws RemoteException;

   boolean isZoomInByScreenCenter() throws RemoteException;

   void setLogoBottomMargin(int var1) throws RemoteException;

   void setLogoLeftMargin(int var1) throws RemoteException;

   float getLogoMarginRate(int var1) throws RemoteException;

   void setLogoMarginRate(int var1, float var2) throws RemoteException;

   void setGestureScaleByMapCenter(boolean var1) throws RemoteException;

   boolean isGestureScaleByMapCenter() throws RemoteException;

   void setLogoEnable(boolean var1);

   void requestRefreshLogo();

   boolean isLogoEnable();
}
