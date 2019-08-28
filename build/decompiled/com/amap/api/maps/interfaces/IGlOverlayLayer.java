package com.amap.api.maps.interfaces;

import android.os.RemoteException;
import com.amap.api.maps.model.CircleOptions;
import com.amap.api.maps.model.LatLng;
import com.amap.api.maps.model.PolygonOptions;
import com.amap.api.maps.model.PolylineOptions;

public interface IGlOverlayLayer {
   void updateOption(String var1, Object var2);

   boolean removeOverlay(String var1) throws RemoteException;

   void prepareIcon(Object var1);

   int getCurrentParticleNum(String var1);

   LatLng getNearestLatLng(PolylineOptions var1, LatLng var2);

   boolean IsPolygonContainsPoint(PolygonOptions var1, LatLng var2);

   void processPolygonHoleOption(PolygonOptions var1);

   boolean IsCircleContainPoint(CircleOptions var1, LatLng var2);

   void processCircleHoleOption(CircleOptions var1);
}
