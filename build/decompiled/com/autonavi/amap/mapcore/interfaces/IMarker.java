package com.autonavi.amap.mapcore.interfaces;

import android.os.RemoteException;
import com.amap.api.maps.model.BitmapDescriptor;
import com.amap.api.maps.model.animation.Animation;
import com.amap.api.maps.model.animation.Animation$AnimationListener;
import com.autonavi.amap.mapcore.IPoint;
import java.util.ArrayList;

public interface IMarker extends IOverlayImage {
   void setPeriod(int var1) throws RemoteException;

   int getPeriod() throws RemoteException;

   void setIcons(ArrayList<BitmapDescriptor> var1) throws RemoteException;

   ArrayList<BitmapDescriptor> getIcons() throws RemoteException;

   void set2Top() throws RemoteException;

   void setFlat(boolean var1) throws RemoteException;

   boolean isFlat();

   /** @deprecated */
   void setPerspective(boolean var1) throws RemoteException;

   /** @deprecated */
   boolean isPerspective() throws RemoteException;

   void setTitle(String var1) throws RemoteException;

   String getTitle() throws RemoteException;

   void setIcon(BitmapDescriptor var1) throws RemoteException;

   void setSnippet(String var1) throws RemoteException;

   String getSnippet() throws RemoteException;

   void setDraggable(boolean var1) throws RemoteException;

   boolean isDraggable();

   boolean isRemoved();

   void showInfoWindow() throws RemoteException;

   void hideInfoWindow() throws RemoteException;

   boolean isInfoWindowShown();

   void setGeoPoint(IPoint var1);

   IPoint getGeoPoint();

   IMarkerAction getIMarkerAction();

   void setPositionByPixels(int var1, int var2);

   void setBelowMaskLayer(boolean var1);

   void setAnimation(Animation var1);

   boolean startAnimation();

   void setAnimationListener(Animation$AnimationListener var1);
}
