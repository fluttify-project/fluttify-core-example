package com.amap.api.mapcore.util;

import android.util.Pair;
import com.autonavi.ae.gmap.GLMapState;
import com.autonavi.amap.mapcore.AbstractCameraUpdateMessage;
import com.autonavi.amap.mapcore.IPoint;
import com.autonavi.amap.mapcore.MapConfig;

public class aj extends AbstractCameraUpdateMessage {
   public aj() {
   }

   public void runCameraUpdate(GLMapState var1) {
      Pair var2 = fi.a((AbstractCameraUpdateMessage)this, (GLMapState)var1, (MapConfig)this.mapConfig);
      if (var2 != null) {
         var1.setMapZoomer(((Float)var2.first).floatValue());
         var1.setMapGeoCenter(((IPoint)var2.second).x, ((IPoint)var2.second).y);
         var1.setCameraDegree(0.0F);
         var1.setMapAngle(0.0F);
      }
   }

   public void mergeCameraUpdateDelegate(AbstractCameraUpdateMessage var1) {
   }
}
