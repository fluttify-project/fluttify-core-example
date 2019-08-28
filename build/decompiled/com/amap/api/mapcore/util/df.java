package com.amap.api.mapcore.util;

import android.os.RemoteException;
import com.autonavi.amap.mapcore.MapConfig;
import com.autonavi.amap.mapcore.interfaces.IOverlay;

public interface df extends IOverlay {
   void a(MapConfig var1) throws RemoteException;

   boolean a();

   boolean c();
}
