package com.amap.api.mapcore.util;

import com.amap.api.maps.model.LatLng;
import com.amap.api.trace.TraceListener;
import com.amap.api.trace.TraceLocation;
import java.util.ArrayList;
import java.util.List;

class gq$b implements TraceListener {
   private final List<TraceLocation> b;

   public gq$b(gq var1, List var2) {
      this.a = var1;
      this.b = var2;
   }

   public void onRequestFailed(int var1, String var2) {
      ArrayList var3 = new ArrayList();
      if (gq.a(this.a) != null) {
         var3.addAll(gq.a(this.a));
      }

      if (this.b != null) {
         int var4 = this.b.size();
         if (this.b.size() > gq.b(this.a)) {
            for(int var5 = var4 - gq.b(this.a); var5 < var4; ++var5) {
               TraceLocation var6 = (TraceLocation)this.b.get(var5);
               if (var6 != null) {
                  var3.add(new LatLng(var6.getLatitude(), var6.getLongitude()));
               }
            }
         }
      }

      this.a(var1, var3);
   }

   public void onTraceProcessing(int var1, int var2, List<LatLng> var3) {
   }

   public void onFinished(int var1, List<LatLng> var2, int var3, int var4) {
      this.a(var1, var2);
   }

   private void a(int var1, List<LatLng> var2) {
      try {
         synchronized(gq.a(this.a)) {
            gq.a(this.a).clear();
            gq.a(this.a).addAll(var2);
         }

         gq.c(this.a).clear();
         if (var1 == 0) {
            gq.c(this.a).addAll(gq.a(this.a));
         } else {
            gq.c(this.a).addAll(gq.d(this.a));
            gq.c(this.a).addAll(gq.a(this.a));
         }

         gq.f(this.a).onTraceStatus(gq.e(this.a), gq.c(this.a), "纠偏成功");
      } catch (Throwable var6) {
         var6.printStackTrace();
      }

   }
}
