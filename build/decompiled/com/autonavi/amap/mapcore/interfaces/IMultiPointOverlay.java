package com.autonavi.amap.mapcore.interfaces;

import android.os.RemoteException;
import com.amap.api.maps.model.MultiPointItem;
import com.autonavi.amap.mapcore.IPoint;
import com.autonavi.amap.mapcore.MapConfig;
import java.util.List;

public interface IMultiPointOverlay {
   void addItems(List<MultiPointItem> var1);

   void addItem(MultiPointItem var1);

   void destroy(boolean var1);

   void setVisible(boolean var1);

   void draw(MapConfig var1, float[] var2, float[] var3);

   MultiPointItem onClick(IPoint var1);

   void setAnchor(float var1, float var2);

   String getId() throws RemoteException;

   void remove(boolean var1);
}
