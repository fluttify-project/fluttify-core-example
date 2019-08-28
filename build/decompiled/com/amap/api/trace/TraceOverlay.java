package com.amap.api.trace;

import com.amap.api.maps.AMap;
import com.amap.api.maps.CameraUpdateFactory;
import com.amap.api.maps.model.BitmapDescriptorFactory;
import com.amap.api.maps.model.LatLng;
import com.amap.api.maps.model.LatLngBounds;
import com.amap.api.maps.model.LatLngBounds$Builder;
import com.amap.api.maps.model.Polyline;
import com.amap.api.maps.model.PolylineOptions;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TraceOverlay {
   private Polyline a;
   private PolylineOptions b;
   private AMap c;
   private List<LatLng> d = new ArrayList();
   public static final int TRACE_STATUS_PROCESSING = 1;
   public static final int TRACE_STATUS_FINISH = 2;
   public static final int TRACE_STATUS_FAILURE = 3;
   public static final int TRACE_STATUS_PREPARE = 4;
   private int e = 4;
   private int f;
   private int g;

   public TraceOverlay(AMap var1, List<LatLng> var2) {
      this.c = var1;
      this.a();
      this.d = var2;
      this.b.addAll(var2);
      this.a = var1.addPolyline(this.b);
   }

   public TraceOverlay(AMap var1) {
      this.c = var1;
      this.a();
   }

   public void add(List<LatLng> var1) {
      if (var1 != null && var1.size() != 0) {
         this.d.addAll(var1);
         this.a();
         if (this.a == null) {
            this.a = this.c.addPolyline(this.b);
         }

         if (this.a != null) {
            this.a.setPoints(this.d);
         }

      }
   }

   public void remove() {
      if (this.a != null) {
         this.a.remove();
      }

   }

   public void setProperCamera(List<LatLng> var1) {
      LatLngBounds$Builder var2 = LatLngBounds.builder();
      if (var1 != null && var1.size() != 0) {
         Iterator var3 = var1.iterator();

         while(var3.hasNext()) {
            LatLng var4 = (LatLng)var3.next();
            var2.include(var4);
         }

         try {
            LatLngBounds var6 = var2.build();
            this.c.moveCamera(CameraUpdateFactory.newLatLngBounds(var6, 20));
         } catch (Throwable var5) {
            var5.printStackTrace();
         }

      }
   }

   public void zoopToSpan() {
      List var1 = this.b.getPoints();
      this.setProperCamera(var1);
   }

   private PolylineOptions a() {
      if (this.b == null) {
         this.b = new PolylineOptions();
         this.b.setCustomTexture(BitmapDescriptorFactory.fromAsset("tracelinetexture.png"));
         this.b.width(40.0F);
      }

      return this.b;
   }

   public int getTraceStatus() {
      return this.e;
   }

   public void setTraceStatus(int var1) {
      this.e = var1;
   }

   public int getDistance() {
      return this.f;
   }

   public void setDistance(int var1) {
      this.f = var1;
   }

   public int getWaitTime() {
      return this.g;
   }

   public void setWaitTime(int var1) {
      this.g = var1;
   }
}
