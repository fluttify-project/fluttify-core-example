package com.amap.api.maps.model;

import android.graphics.Bitmap;
import com.autonavi.ae.gmap.gloverlay.GLCrossVector$AVectorCrossAttr;

public class CrossOverlayOptions {
   GLCrossVector$AVectorCrossAttr a = null;
   private Bitmap bitmapDescriptor = null;

   public CrossOverlayOptions() {
   }

   public GLCrossVector$AVectorCrossAttr getAttribute() {
      return this.a;
   }

   public CrossOverlayOptions setAttribute(GLCrossVector$AVectorCrossAttr var1) {
      this.a = var1;
      return this;
   }

   public CrossOverlayOptions setRes(Bitmap var1) {
      this.bitmapDescriptor = var1;
      return this;
   }

   public Bitmap getRes() {
      return this.bitmapDescriptor;
   }
}
