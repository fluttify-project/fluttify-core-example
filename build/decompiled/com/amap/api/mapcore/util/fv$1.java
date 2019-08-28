package com.amap.api.mapcore.util;

import com.autonavi.ae.gmap.listener.AMapWidgetListener;

class fv$1 implements AMapWidgetListener {
   fv$1(fv var1) {
      this.a = var1;
   }

   public void invalidateScaleView() {
      if (fv.a(this.a) != null) {
         fv.a(this.a).post(new fv$1$1(this));
      }
   }

   public void invalidateCompassView() {
      if (fv.b(this.a) != null) {
         fv.b(this.a).post(new fv$1$2(this));
      }
   }

   public void invalidateZoomController(float var1) {
      if (fv.c(this.a) != null) {
         fv.c(this.a).post(new fv$1$3(this, var1));
      }
   }

   public void setFrontViewVisibility(boolean var1) {
   }
}
