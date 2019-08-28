package com.amap.api.maps.model;

import com.amap.api.mapcore.util.fi;
import com.autonavi.amap.mapcore.DPoint;

public class WeightedLatLng {
   public static final double DEFAULT_INTENSITY = 1.0D;
   private DPoint mPoint;
   public final double intensity;
   public final LatLng latLng;

   public WeightedLatLng(LatLng var1, double var2) {
      if (var1 == null) {
         throw new IllegalArgumentException("latLng can not null");
      } else {
         this.latLng = var1;
         this.mPoint = fi.a(var1);
         if (var2 >= 0.0D) {
            this.intensity = var2;
         } else {
            this.intensity = 1.0D;
         }

      }
   }

   public WeightedLatLng(LatLng var1) {
      this(var1, 1.0D);
   }

   protected DPoint getPoint() {
      return this.mPoint;
   }
}
