package com.amap.api.maps.model;

import android.util.Log;
import com.amap.api.maps.AMapException;
import java.util.Collection;

public class HeatmapTileProvider$Builder {
   private Collection<WeightedLatLng> data;
   private int radius = 12;
   private Gradient gradient;
   private double opacity;

   public HeatmapTileProvider$Builder() {
      this.gradient = HeatmapTileProvider.DEFAULT_GRADIENT;
      this.opacity = 0.6D;
   }

   public HeatmapTileProvider$Builder data(Collection<LatLng> var1) {
      return this.weightedData(HeatmapTileProvider.b(var1));
   }

   public HeatmapTileProvider$Builder weightedData(Collection<WeightedLatLng> var1) {
      this.data = var1;
      return this;
   }

   public HeatmapTileProvider$Builder radius(int var1) {
      this.radius = Math.max(10, Math.min(var1, 50));
      return this;
   }

   public HeatmapTileProvider$Builder gradient(Gradient var1) {
      this.gradient = var1;
      return this;
   }

   public HeatmapTileProvider$Builder transparency(double var1) {
      this.opacity = Math.max(0.0D, Math.min(var1, 1.0D));
      return this;
   }

   public HeatmapTileProvider build() {
      if (this.data != null && this.data.size() != 0) {
         try {
            return new HeatmapTileProvider(this, (HeatmapTileProvider$1)null);
         } catch (Throwable var2) {
            var2.printStackTrace();
            return null;
         }
      } else {
         try {
            throw new AMapException("No input points.");
         } catch (AMapException var3) {
            Log.e("amap", var3.getErrorMessage());
            var3.printStackTrace();
            return null;
         }
      }
   }
}
