package com.autonavi.amap.mapcore.interfaces;

import android.os.RemoteException;
import com.amap.api.maps.model.BitmapDescriptor;
import com.amap.api.maps.model.LatLng;
import com.amap.api.maps.model.PolylineOptions;
import java.util.List;

public interface IPolyline extends IOverlay {
   void setWidth(float var1) throws RemoteException;

   float getWidth() throws RemoteException;

   void setColor(int var1) throws RemoteException;

   int getColor() throws RemoteException;

   void setPoints(List<LatLng> var1) throws RemoteException;

   List<LatLng> getPoints() throws RemoteException;

   boolean isGeodesic();

   void setGeodesic(boolean var1) throws RemoteException;

   void setDottedLine(boolean var1);

   boolean isDottedLine();

   LatLng getNearestLatLng(LatLng var1);

   void setTransparency(float var1);

   void setCustomTexture(BitmapDescriptor var1);

   void setOptions(PolylineOptions var1);

   PolylineOptions getOptions();

   void setCustemTextureIndex(List<Integer> var1);

   void setShownRatio(float var1);

   void setShowRange(float var1, float var2);

   float getShownRatio();

   void setCustomTextureList(List<BitmapDescriptor> var1);
}
