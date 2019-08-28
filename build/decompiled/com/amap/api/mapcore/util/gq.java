package com.amap.api.mapcore.util;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import com.amap.api.maps.CoordinateConverter;
import com.amap.api.maps.LocationSource$OnLocationChangedListener;
import com.amap.api.maps.model.LatLng;
import com.amap.api.trace.LBSTraceBase;
import com.amap.api.trace.TraceListener;
import com.amap.api.trace.TraceLocation;
import com.amap.api.trace.TraceStatusListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ThreadPoolExecutor.AbortPolicy;

public class gq implements LocationSource$OnLocationChangedListener, LBSTraceBase {
   private Context b;
   private CoordinateConverter c;
   private ExecutorService d;
   private ExecutorService e;
   private long f = 2000L;
   private int g = 5;
   private TraceStatusListener h;
   private az i;
   private List<TraceLocation> j = new ArrayList();
   private int k = 0;
   private int l = 0;
   private long m = 0L;
   private gq$c n;
   private TraceLocation o = null;
   private List<LatLng> p = new ArrayList();
   private List<LatLng> q = new ArrayList();
   private List<LatLng> r = new ArrayList();
   int a = Runtime.getRuntime().availableProcessors();
   private static final TimeUnit s;
   private BlockingQueue<Runnable> t = new LinkedBlockingQueue();
   private BlockingQueue<Runnable> u = new LinkedBlockingQueue();

   public gq(Context var1) {
      this.b = var1.getApplicationContext();
      this.c = new CoordinateConverter(this.b);
      this.n = new gq$c(Looper.getMainLooper());
      hb.a().a(this.b);
      this.d = new ThreadPoolExecutor(1, this.a * 2, 1L, s, this.t, new ev("AMapTraceManagerProcess"), new AbortPolicy());
      this.e = new ThreadPoolExecutor(1, this.a * 2, 1L, s, this.u, new ev("AMapTraceManagerRequest"), new AbortPolicy());
   }

   public void queryProcessedTrace(int var1, List<TraceLocation> var2, int var3, TraceListener var4) {
      try {
         gq$a var5 = new gq$a(this, var1, var2, var3, var4);
         this.d.execute(var5);
      } catch (Throwable var6) {
         var6.printStackTrace();
      }

   }

   public void setLocationInterval(long var1) {
      this.f = var1;
   }

   public void setTraceStatusInterval(int var1) {
      this.g = Math.max(var1, 2);
   }

   public void startTrace(TraceStatusListener var1) {
      if (this.b == null) {
         Log.w("LBSTraceClient", "Context need to be initialized");
      } else {
         this.m = System.currentTimeMillis();
         this.h = var1;
         if (this.i == null) {
            this.i = new az(this.b);
            this.i.a(this.f);
            this.i.activate(this);
         }

      }
   }

   public void onLocationChanged(Location var1) {
      if (this.h != null) {
         try {
            long var2 = System.currentTimeMillis();
            if (var2 - this.m >= 30000L && this.h != null) {
               this.h.onTraceStatus((List)null, (List)null, "定位超时");
            }

            this.m = System.currentTimeMillis();
            Bundle var4 = var1.getExtras();
            int var5 = var4.getInt("errorCode");
            if (var5 != 0) {
               Log.w("LBSTraceClient", "Locate failed [errorCode:\"" + var5 + "\"  errorInfo:" + var4.getString("errorInfo") + "\"]");
               return;
            }

            List var6 = this.j;
            synchronized(this.j) {
               TraceLocation var7 = new TraceLocation(var1.getLatitude(), var1.getLongitude(), var1.getSpeed(), var1.getBearing(), var1.getTime());
               if (this.a(this.o, var7)) {
                  return;
               }

               this.j.add(var7);
               this.o = var7;
               ++this.k;
               if (this.k == this.g) {
                  this.l += this.k;
                  this.a();
                  this.k = 0;
               }
            }
         } catch (Throwable var10) {
            var10.printStackTrace();
         }
      }

   }

   private boolean a(TraceLocation var1, TraceLocation var2) {
      if (var1 != null && var2 != null) {
         return var1.getLatitude() == var2.getLatitude() && var1.getLongitude() == var2.getLongitude();
      } else {
         return false;
      }
   }

   private void a() {
      int var1 = this.j.size();
      byte var2 = 0;
      if (var1 >= this.g) {
         if (var1 <= 50) {
            ArrayList var3 = new ArrayList(this.j);
            this.queryProcessedTrace(var2, var3, 1, new gq$b(this, var3));
         } else {
            int var6 = var1 - 50;
            if (var6 < 0) {
               return;
            }

            ArrayList var4 = new ArrayList(this.j.subList(var6 - this.g, var6));
            this.a((List)var4);
            ArrayList var5 = new ArrayList(this.j.subList(var6, var1));
            this.queryProcessedTrace(var6, var5, 1, new gq$b(this, var5));
         }

      }
   }

   private void a(List<TraceLocation> var1) {
      List var2 = this.r;
      synchronized(this.r) {
         if (var1 != null && var1.size() >= 1) {
            if (this.r.size() >= 1) {
               double var3 = 0.0D;
               TraceLocation var5 = null;
               Iterator var6 = var1.iterator();

               while(var6.hasNext()) {
                  TraceLocation var7 = (TraceLocation)var6.next();
                  if (var7 != null) {
                     if (var5 == null) {
                        var5 = var7;
                     } else {
                        double var8 = this.a(var5.getLatitude(), var5.getLongitude(), var7.getLatitude(), var7.getLongitude());
                        if (var8 <= 100.0D) {
                           var3 += var8;
                           var5 = var7;
                        }
                     }
                  }
               }

               double var15 = 0.0D;
               LatLng var16 = null;
               Iterator var9 = this.r.iterator();

               while(var9.hasNext()) {
                  LatLng var10 = (LatLng)var9.next();
                  if (var10 == null) {
                     var9.remove();
                  } else if (var16 == null) {
                     var16 = var10;
                     this.p.add(var10);
                     var9.remove();
                  } else {
                     double var11 = this.a(var16.latitude, var16.longitude, var10.latitude, var10.longitude);
                     var15 += var11;
                     var16 = var10;
                     if (var15 >= var3) {
                        break;
                     }

                     this.p.add(var10);
                     var9.remove();
                  }
               }

            }
         }
      }
   }

   private double a(double var1, double var3, double var5, double var7) {
      double var9 = var1 > var5 ? var1 - var5 : var5 - var1;
      double var11 = var3 > var7 ? var3 - var7 : var7 - var3;
      return Math.sqrt(var9 * var9 + var11 * var11);
   }

   public void stopTrace() {
      this.b();
      this.c();
   }

   private void b() {
      if (this.i != null) {
         this.i.deactivate();
         this.i = null;
      }

   }

   private void c() {
      this.t.clear();
      this.u.clear();
      if (this.j != null) {
         List var1 = this.j;
         synchronized(this.j) {
            if (this.j != null) {
               this.j.clear();
            }

            this.l = 0;
            this.k = 0;
            this.m = 0L;
            this.o = null;
         }
      }

   }

   public void destroy() {
      try {
         this.stopTrace();
         if (this.d != null && !this.d.isShutdown()) {
            this.d.shutdownNow();
            this.d = null;
         }

         if (this.e != null && !this.e.isShutdown()) {
            this.e.shutdownNow();
            this.e = null;
         }

         this.j = null;
         this.h = null;
      } catch (Throwable var2) {
         var2.printStackTrace();
      }

      this.b = null;
      this.c = null;
   }

   static {
      s = TimeUnit.SECONDS;
   }
}
