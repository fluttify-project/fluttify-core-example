package com.amap.api.mapcore.util;

import android.os.Handler;
import com.amap.api.maps.CoordinateConverter$CoordType;
import com.amap.api.maps.model.LatLng;
import com.amap.api.trace.TraceListener;
import com.amap.api.trace.TraceLocation;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class gq$a implements Runnable {
   private List<TraceLocation> b;
   private int c;
   private int d;
   private List<TraceLocation> e;
   private String f;
   private TraceListener g;

   public gq$a(gq var1, int var2, List var3, int var4, TraceListener var5) {
      this.a = var1;
      this.b = new ArrayList();
      this.c = var4;
      this.d = var2;
      this.e = var3;
      this.f = fa.a();
      this.g = var5;
   }

   public void run() {
      try {
         gq.g(this.a).a(this.g);
         int var1 = 0;
         boolean var2 = false;
         int var13 = this.a();
         if (this.e == null || this.e.size() < 2) {
            gr.a().a((Handler)gq.g(this.a), this.d, (String)"轨迹点太少或距离太近,轨迹纠偏失败");
            return;
         }

         Iterator var3 = this.e.iterator();

         while(var3.hasNext()) {
            TraceLocation var4 = (TraceLocation)var3.next();
            TraceLocation var5 = var4.copy();
            if (var5 != null && var5.getLatitude() > 0.0D && var5.getLongitude() > 0.0D) {
               this.b.add(var5);
            }
         }

         int var14 = this.b.size();
         int var15 = 500;
         int var16 = (var14 - 2) / var15;
         gr.a().a(this.f, this.d, var16, var13);

         while(var1 <= var16) {
            if (var1 == var16) {
               var15 = this.b.size();
            }

            ArrayList var6 = new ArrayList();

            for(int var7 = 0; var7 < var15; ++var7) {
               TraceLocation var8 = (TraceLocation)this.b.remove(0);
               if (var8 != null) {
                  if (this.c != 1) {
                     if (this.c == 3) {
                        gq.h(this.a).from(CoordinateConverter$CoordType.BAIDU);
                     } else if (this.c == 2) {
                        gq.h(this.a).from(CoordinateConverter$CoordType.GPS);
                     }

                     LatLng var9 = new LatLng(var8.getLatitude(), var8.getLongitude());
                     gq.h(this.a).coord(var9);
                     LatLng var10 = gq.h(this.a).convert();
                     if (var10 != null) {
                        var8.setLatitude(var10.latitude);
                        var8.setLongitude(var10.longitude);
                     }
                  }

                  var6.add(var8);
               }
            }

            if (var6.size() >= 2 && var6.size() <= 500) {
               gp var17 = new gp(gq.i(this.a), gq.g(this.a), var6, this.c, this.f, this.d, var1);
               gq.j(this.a).execute(var17);
               ++var1;

               try {
                  Thread.sleep(50L);
               } catch (InterruptedException var11) {
                  var11.printStackTrace();
               }
            }
         }
      } catch (Throwable var12) {
         var12.printStackTrace();
      }

   }

   private int a() {
      int var1 = 0;
      if (this.e != null && this.e.size() != 0) {
         ArrayList var2 = new ArrayList();
         Iterator var3 = this.e.iterator();

         while(var3.hasNext()) {
            TraceLocation var4 = (TraceLocation)var3.next();
            if (var4 != null) {
               if ((double)var4.getSpeed() < 0.01D) {
                  var2.add(var4);
               } else {
                  var1 += this.a(var2);
                  var2.clear();
               }
            }
         }

         return var1;
      } else {
         return var1;
      }
   }

   private int a(List<TraceLocation> var1) {
      byte var2 = 0;
      int var3 = var1.size();
      if (var3 <= 1) {
         return 0;
      } else {
         TraceLocation var4 = (TraceLocation)var1.get(0);
         TraceLocation var5 = (TraceLocation)var1.get(var3 - 1);
         if (var4 != null && var5 != null) {
            int var6;
            if (var4 != null && var5 != null) {
               var6 = (int)((var5.getTime() - var4.getTime()) / 1000L);
            } else {
               var6 = 0;
            }

            return var6;
         } else {
            return var2;
         }
      }
   }
}
