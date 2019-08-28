package com.amap.api.mapcore.util;

import android.graphics.Point;
import com.autonavi.ae.gmap.GLMapState;
import com.autonavi.amap.mapcore.AbstractCameraUpdateMessage;

public class al extends AbstractCameraUpdateMessage {
   public al() {
   }

   public void runCameraUpdate(GLMapState var1) {
      float var2 = this.xPixel;
      float var3 = this.yPixel;
      var2 += (float)this.width / 2.0F;
      var3 += (float)this.height / 2.0F;
      Point var4 = new Point();
      this.a(var1, (int)var2, (int)var3, var4);
      var1.setMapGeoCenter(var4.x, var4.y);
   }

   public void mergeCameraUpdateDelegate(AbstractCameraUpdateMessage var1) {
   }

   public void a(GLMapState var1, int var2, int var3, Point var4) {
      var1.screenToP20Point(var2, var3, var4);
   }
}
