package com.amap.api.mapcore.util;

import android.opengl.GLES20;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.amap.api.maps.interfaces.IGlOverlayLayer;
import com.amap.api.maps.model.ArcOptions;
import com.amap.api.maps.model.BitmapDescriptor;
import com.amap.api.maps.model.CircleOptions;
import com.amap.api.maps.model.GroundOverlayOptions;
import com.amap.api.maps.model.LatLng;
import com.amap.api.maps.model.NavigateArrowOptions;
import com.amap.api.maps.model.PolygonOptions;
import com.amap.api.maps.model.PolylineOptions;
import com.amap.api.maps.model.particle.ParticleOverlayOptions;
import com.autonavi.amap.mapcore.MapConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class s implements IGlOverlayLayer {
   u a;
   private dw c;
   private int d = 0;
   private List<df> e = new Vector(500);
   private List<ad> f = new ArrayList();
   private int[] g = new int[1];
   private Handler h = new Handler(Looper.getMainLooper());
   private Runnable i = new s$1(this);
   s$a b = new s$a();

   public synchronized String a(String var1) {
      ++this.d;
      return var1 + this.d;
   }

   public da a() throws RemoteException {
      cv var1 = new cv(this);
      var1.a(this.c);
      this.a((df)var1);
      return var1;
   }

   public dw b() {
      return this.c;
   }

   public s(u var1) {
      this.a = var1;
   }

   public void a(dw var1) {
      this.c = var1;
   }

   public synchronized void b(String var1) {
      try {
         if (var1 != null && var1.trim().length() != 0) {
            df var2 = null;
            Iterator var3 = this.e.iterator();

            while(var3.hasNext()) {
               df var4 = (df)var3.next();
               if (var1.equals(var4.getId())) {
                  var2 = var4;
                  break;
               }
            }

            this.e.clear();
            if (var2 != null) {
               this.e.add(var2);
            }
         } else {
            this.e.clear();
            this.c();
         }
      } catch (Throwable var5) {
         ht.c(var5, "GlOverlayLayer", "clear");
         var5.printStackTrace();
         Log.d("amapApi", "GlOverlayLayer clear erro" + var5.getMessage());
      }

   }

   public synchronized void c() {
      this.d = 0;
   }

   public synchronized void d() {
      try {
         df var2;
         for(Iterator var1 = this.e.iterator(); var1.hasNext(); var2 = null) {
            var2 = (df)var1.next();
            var2.destroy();
         }

         this.b((String)null);
      } catch (Throwable var3) {
         ht.c(var3, "GlOverlayLayer", "destory");
         var3.printStackTrace();
         Log.d("amapApi", "GlOverlayLayer destory erro" + var3.getMessage());
      }

   }

   synchronized df c(String var1) throws RemoteException {
      Iterator var2 = this.e.iterator();

      df var3;
      do {
         if (!var2.hasNext()) {
            return null;
         }

         var3 = (df)var2.next();
      } while(var3 == null || !var3.getId().equals(var1));

      return var3;
   }

   public synchronized dj a(PolylineOptions var1) throws RemoteException {
      if (var1 == null) {
         return null;
      } else {
         dr var2 = new dr(this, var1);
         if (this.c != null) {
            var2.a(this.c);
         }

         this.a((df)var2);
         return var2;
      }
   }

   public synchronized de a(NavigateArrowOptions var1) throws RemoteException {
      if (var1 == null) {
         return null;
      } else {
         do var2 = new do(this.a);
         var2.setTopColor(var1.getTopColor());
         var2.setSideColor(var1.getSideColor());
         var2.setPoints(var1.getPoints());
         var2.setVisible(var1.isVisible());
         var2.setWidth(var1.getWidth());
         var2.setZIndex(var1.getZIndex());
         var2.set3DModel(var1.is3DModel());
         this.a((df)var2);
         return var2;
      }
   }

   public synchronized di a(PolygonOptions var1) throws RemoteException {
      if (var1 == null) {
         return null;
      } else {
         dq var2 = new dq(this.a);
         var2.setFillColor(var1.getFillColor());
         var2.setPoints(var1.getPoints());
         var2.setHoleOptions(var1.getHoleOptions());
         var2.setVisible(var1.isVisible());
         var2.setStrokeWidth(var1.getStrokeWidth());
         var2.setZIndex(var1.getZIndex());
         var2.setStrokeColor(var1.getStrokeColor());
         this.a((df)var2);
         return var2;
      }
   }

   public synchronized db a(CircleOptions var1) throws RemoteException {
      if (var1 == null) {
         return null;
      } else {
         cw var2 = new cw(this.a);
         var2.setFillColor(var1.getFillColor());
         var2.setCenter(var1.getCenter());
         var2.setVisible(var1.isVisible());
         var2.setHoleOptions(var1.getHoleOptions());
         var2.setStrokeWidth(var1.getStrokeWidth());
         var2.setZIndex(var1.getZIndex());
         var2.setStrokeColor(var1.getStrokeColor());
         var2.setRadius(var1.getRadius());
         var2.setDottedLineType(var1.getStrokeDottedLineType());
         this.a((df)var2);
         return var2;
      }
   }

   public synchronized cz a(ArcOptions var1) throws RemoteException {
      if (var1 == null) {
         return null;
      } else {
         cu var2 = new cu(this.a);
         var2.setStrokeColor(var1.getStrokeColor());
         var2.a(var1.getStart());
         var2.b(var1.getPassed());
         var2.c(var1.getEnd());
         var2.setVisible(var1.isVisible());
         var2.setStrokeWidth(var1.getStrokeWidth());
         var2.setZIndex(var1.getZIndex());
         this.a((df)var2);
         return var2;
      }
   }

   public synchronized dc a(GroundOverlayOptions var1) throws RemoteException {
      if (var1 == null) {
         return null;
      } else {
         cy var2 = new cy(this.a, this);
         var2.a(var1.getAnchorU(), var1.getAnchorV());
         var2.setDimensions(var1.getWidth(), var1.getHeight());
         var2.setImage(var1.getImage());
         var2.setPosition(var1.getLocation());
         var2.setPositionFromBounds(var1.getBounds());
         var2.setBearing(var1.getBearing());
         var2.setTransparency(var1.getTransparency());
         var2.setVisible(var1.isVisible());
         var2.setZIndex(var1.getZIndex());
         this.a((df)var2);
         return var2;
      }
   }

   public synchronized dh a(ParticleOverlayOptions var1) throws RemoteException {
      if (var1 == null) {
         return null;
      } else {
         dp var2 = new dp(this);
         var2.a(var1);
         this.a((df)var2);
         return var2;
      }
   }

   private void a(df var1) throws RemoteException {
      this.e.add(var1);
      this.e();
   }

   public synchronized boolean removeOverlay(String var1) throws RemoteException {
      df var2 = this.c(var1);
      return var2 != null ? this.e.remove(var2) : false;
   }

   public synchronized void e() {
      this.h.removeCallbacks(this.i);
      this.h.postDelayed(this.i, 10L);
   }

   public synchronized void a(boolean var1, int var2) {
      try {
         this.f();
         MapConfig var3 = this.a.getMapConfig();
         if (var3 == null) {
            return;
         }

         int var4 = this.e.size();
         Iterator var5 = this.e.iterator();

         while(var5.hasNext()) {
            df var6 = (df)var5.next();
            if (var6.isVisible()) {
               if (var4 > 20) {
                  if (var6.a()) {
                     if (var1) {
                        if (var6.getZIndex() <= (float)var2) {
                           var6.a(var3);
                        }
                     } else if (var6.getZIndex() > (float)var2) {
                        var6.a(var3);
                     }
                  }
               } else if (var1) {
                  if (var6.getZIndex() <= (float)var2) {
                     var6.a(var3);
                  }
               } else if (var6.getZIndex() > (float)var2) {
                  var6.a(var3);
               }
            }
         }
      } catch (Throwable var7) {
         ht.c(var7, "GlOverlayLayer", "draw");
      }

   }

   public void f() {
      List var1 = this.f;
      synchronized(this.f) {
         for(int var3 = 0; var3 < this.f.size(); ++var3) {
            ad var2 = (ad)this.f.get(var3);
            if (var2 != null) {
               var2.m();
               if (var2.n() <= 0) {
                  this.g[0] = var2.k();
                  GLES20.glDeleteTextures(1, this.g, 0);
                  if (this.a != null) {
                     this.a.c(var2.o());
                  }
               }
            }
         }

         this.f.clear();
      }
   }

   public void a(ad var1) {
      List var2 = this.f;
      synchronized(this.f) {
         if (var1 != null) {
            this.f.add(var1);
         }

      }
   }

   public ad a(BitmapDescriptor var1) {
      if (this.a != null) {
         ad var2 = this.a.a(var1, true);
         return var2;
      } else {
         return null;
      }
   }

   public synchronized df a(LatLng var1) {
      Iterator var2 = this.e.iterator();

      df var3;
      do {
         if (!var2.hasNext()) {
            return null;
         }

         var3 = (df)var2.next();
      } while(var3 == null || !var3.c() || !(var3 instanceof dj) || !((dj)var3).a(var1));

      return var3;
   }

   public u g() {
      return this.a;
   }

   public float[] h() {
      return this.a != null ? this.a.x() : new float[16];
   }

   public void a(boolean var1) {
      if (this.a != null) {
         this.a.setRunLowFrame(var1);
      }

   }

   public void updateOption(String var1, Object var2) {
   }

   public int getCurrentParticleNum(String var1) {
      return 0;
   }

   public LatLng getNearestLatLng(PolylineOptions var1, LatLng var2) {
      return null;
   }

   public boolean IsPolygonContainsPoint(PolygonOptions var1, LatLng var2) {
      return false;
   }

   public void processPolygonHoleOption(PolygonOptions var1) {
   }

   public void prepareIcon(Object var1) {
   }

   public boolean IsCircleContainPoint(CircleOptions var1, LatLng var2) {
      return false;
   }

   public void processCircleHoleOption(CircleOptions var1) {
   }
}
