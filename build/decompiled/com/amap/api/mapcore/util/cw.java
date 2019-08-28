package com.amap.api.mapcore.util;

import android.opengl.GLES20;
import android.os.RemoteException;
import android.util.Log;
import com.amap.api.maps.AMapUtils;
import com.amap.api.maps.model.BaseHoleOptions;
import com.amap.api.maps.model.CircleHoleOptions;
import com.amap.api.maps.model.LatLng;
import com.amap.api.maps.model.PolygonHoleOptions;
import com.autonavi.ae.gmap.GLMapState;
import com.autonavi.amap.mapcore.FPoint;
import com.autonavi.amap.mapcore.IPoint;
import com.autonavi.amap.mapcore.MapConfig;
import com.autonavi.amap.mapcore.interfaces.IOverlay;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class cw implements db {
   private LatLng b = null;
   private double c = 0.0D;
   private float d = 10.0F;
   private int e = -16777216;
   private int f = 0;
   private float g = 0.0F;
   private boolean h = true;
   private String i;
   private u j;
   private FloatBuffer k;
   private int l = 0;
   private boolean m = false;
   private IPoint n = IPoint.obtain();
   private FPoint o = FPoint.obtain();
   private List<BaseHoleOptions> p;
   private List<BaseHoleOptions> q;
   private int r;
   private int s;
   private FloatBuffer t;
   private FloatBuffer u;
   private static Object v = new Object();
   private int w = -1;
   float a = 0.0F;
   private dw$e x;
   private static float y = 4.0075016E7F;
   private static int z = 256;
   private static int A = 20;
   private static double B = 1.0E10D;

   public cw(u var1) {
      this.j = var1;

      try {
         this.i = this.getId();
      } catch (RemoteException var3) {
         ht.c(var3, "CircleDelegateImp", "create");
         var3.printStackTrace();
      }

   }

   public boolean a() {
      return true;
   }

   public void remove() throws RemoteException {
      this.j.a(this.getId());
      this.j.setRunLowFrame(false);
   }

   public String getId() throws RemoteException {
      if (this.i == null) {
         this.i = this.j.d("Circle");
      }

      return this.i;
   }

   public void setZIndex(float var1) throws RemoteException {
      this.g = var1;
      this.j.f();
      this.j.setRunLowFrame(false);
   }

   public float getZIndex() throws RemoteException {
      return this.g;
   }

   public void setVisible(boolean var1) throws RemoteException {
      this.h = var1;
      this.j.setRunLowFrame(false);
   }

   public boolean isVisible() throws RemoteException {
      return this.h;
   }

   public boolean equalsRemote(IOverlay var1) throws RemoteException {
      return this.equals(var1) || var1.getId().equals(this.getId());
   }

   public int hashCodeRemote() throws RemoteException {
      return 0;
   }

   public int getDottedLineType() {
      return this.w;
   }

   public void setDottedLineType(int var1) {
      this.w = var1;
   }

   public boolean b() throws RemoteException {
      Object var1 = v;
      synchronized(v) {
         this.m = false;
         LatLng var2 = this.b;
         if (var2 != null) {
            float[] var3 = new float[1086];
            double var4 = this.b(this.b.latitude) * this.c;
            GLMapState var6 = this.j.c();
            this.o.x = (float)(this.n.x - this.j.getMapConfig().getSX());
            this.o.y = (float)(this.n.y - this.j.getMapConfig().getSY());
            var3[0] = this.o.x;
            var3[1] = this.o.y;
            var3[2] = 0.0F;

            for(int var7 = 0; var7 < 361; ++var7) {
               double var8 = (double)var7 * 3.141592653589793D / 180.0D;
               double var10 = Math.sin(var8) * var4;
               double var12 = Math.cos(var8) * var4;
               int var14 = (int)((double)this.n.x + var10);
               int var15 = (int)((double)this.n.y + var12);
               this.o.x = (float)(var14 - this.j.getMapConfig().getSX());
               this.o.y = (float)(var15 - this.j.getMapConfig().getSY());
               var3[(var7 + 1) * 3] = this.o.x;
               var3[(var7 + 1) * 3 + 1] = this.o.y;
               var3[(var7 + 1) * 3 + 2] = 0.0F;
            }

            this.l = var3.length / 3;
            this.k = fi.a(var3);
         }

         return true;
      }
   }

   private void e() {
      if (this.j != null) {
         this.x = (dw$e)this.j.u(3);
      }

   }

   public void a(MapConfig var1) throws RemoteException {
      if (this.b != null && this.c > 0.0D && this.h) {
         this.b();
         this.f();
         if (this.k != null && this.l > 0) {
            if (this.x == null || this.x.c()) {
               this.e();
            }

            this.a = this.j.getMapConfig().getMapPerPixelUnitLength();
            int var2 = this.j.f(this.w);
            eq.a(this.x, this.f, this.e, this.k, this.d, this.l, this.j.x(), this.a, var2);
         }

         this.g();
         this.m = true;
      }
   }

   void d() {
      this.l = 0;
      if (this.k != null) {
         this.k.clear();
      }

      this.j.setRunLowFrame(false);
      this.setHoleOptions(this.q);
   }

   public void setCenter(LatLng var1) throws RemoteException {
      Object var2 = v;
      synchronized(v) {
         if (var1 != null) {
            this.b = var1;
            GLMapState.lonlat2Geo(var1.longitude, var1.latitude, this.n);
            this.d();
         }

      }
   }

   public LatLng getCenter() throws RemoteException {
      return this.b;
   }

   public void setRadius(double var1) throws RemoteException {
      this.c = var1;
      this.d();
   }

   public double getRadius() throws RemoteException {
      return this.c;
   }

   public void setStrokeWidth(float var1) throws RemoteException {
      this.d = var1;
      this.j.setRunLowFrame(false);
   }

   public float getStrokeWidth() throws RemoteException {
      return this.d;
   }

   public void setStrokeColor(int var1) throws RemoteException {
      this.e = var1;
      this.j.setRunLowFrame(false);
   }

   public int getStrokeColor() throws RemoteException {
      return this.e;
   }

   public void setFillColor(int var1) throws RemoteException {
      this.f = var1;
      this.j.setRunLowFrame(false);
   }

   public int getFillColor() throws RemoteException {
      return this.f;
   }

   private float a(double var1) {
      return (float)(Math.cos(var1 * 3.141592653589793D / 180.0D) * (double)y / (double)(z << A));
   }

   private double b(double var1) {
      return 1.0D / (double)this.a(var1);
   }

   public void destroy() {
      try {
         this.b = null;
         if (this.k != null) {
            this.k.clear();
            this.k = null;
         }

         if (this.t != null) {
            this.t.clear();
            this.t = null;
         }

         if (this.u != null) {
            this.u.clear();
            this.u = null;
         }

         if (this.p != null) {
            this.p.clear();
         }

         if (this.q != null) {
            this.q.clear();
         }

         this.p = null;
         this.q = null;
      } catch (Throwable var2) {
         ht.c(var2, "CircleDelegateImp", "destroy");
         var2.printStackTrace();
         Log.d("destroy erro", "CircleDelegateImp destroy");
      }

   }

   public boolean contains(LatLng var1) throws RemoteException {
      if (this.p != null && this.p.size() > 0) {
         Iterator var2 = this.p.iterator();

         while(var2.hasNext()) {
            BaseHoleOptions var3 = (BaseHoleOptions)var2.next();
            if (fi.a(var3, var1)) {
               return false;
            }
         }
      }

      return this.c >= (double)AMapUtils.calculateLineDistance(this.b, var1);
   }

   public boolean c() {
      return this.m;
   }

   public boolean isAboveMaskLayer() {
      return false;
   }

   public void setAboveMaskLayer(boolean var1) {
   }

   public void setHoleOptions(List<BaseHoleOptions> var1) {
      try {
         this.q = var1;
         if (this.p == null) {
            this.p = new ArrayList();
         } else {
            this.p.clear();
         }

         if (var1 != null) {
            for(int var2 = 0; var2 < var1.size(); ++var2) {
               BaseHoleOptions var3 = (BaseHoleOptions)var1.get(var2);
               if (var3 instanceof PolygonHoleOptions) {
                  PolygonHoleOptions var4 = (PolygonHoleOptions)var3;
                  if (this.a(var4) && !fi.a(this.p, var4)) {
                     this.p.add(var4);
                  }
               } else if (var3 instanceof CircleHoleOptions) {
                  CircleHoleOptions var6 = (CircleHoleOptions)var3;
                  if (this.b(var6) && !fi.a(this.p, var6)) {
                     this.p.add(var6);
                  }
               }
            }
         }
      } catch (Throwable var5) {
         ht.c(var5, "PolygonDelegateImp", "setHoleOptions");
         var5.printStackTrace();
      }

   }

   public List<BaseHoleOptions> getHoleOptions() throws RemoteException {
      return this.p;
   }

   private boolean a(PolygonHoleOptions var1) {
      boolean var2 = true;

      try {
         List var3 = var1.getPoints();

         for(int var4 = 0; var4 < var3.size(); ++var4) {
            var2 = this.contains((LatLng)var3.get(var4));
            if (!var2) {
               break;
            }
         }
      } catch (Throwable var5) {
         ht.c(var5, "CircleDelegateImp", "isPolygonInCircle");
         var5.printStackTrace();
      }

      return var2;
   }

   private boolean b(CircleHoleOptions var1) {
      boolean var2 = true;

      try {
         float var3 = AMapUtils.calculateLineDistance(var1.getCenter(), this.getCenter());
         var2 = (double)var3 <= this.getRadius() - var1.getRadius();
      } catch (Throwable var4) {
         ht.c(var4, "CircleDelegateImp", "isCircleInCircle");
         var4.printStackTrace();
      }

      return var2;
   }

   private void f() throws RemoteException {
      MapConfig var1 = this.j.getMapConfig();
      if (this.p != null && this.p.size() > 0) {
         GLES20.glClearStencil(0);
         GLES20.glStencilMask(255);
         GLES20.glClear(1024);
         GLES20.glFlush();
         GLES20.glEnable(2960);
         GLES20.glColorMask(false, false, false, false);
         GLES20.glStencilFunc(512, 1, 255);
         GLES20.glStencilOp(7681, 7680, 7680);

         for(int var2 = 0; var2 < this.p.size(); ++var2) {
            BaseHoleOptions var3 = (BaseHoleOptions)this.p.get(var2);
            if (var3 instanceof PolygonHoleOptions) {
               PolygonHoleOptions var4 = (PolygonHoleOptions)var3;
               this.a(this.a(var4.getPoints()), var1.getSX(), var1.getSY());
            } else if (var3 instanceof CircleHoleOptions) {
               CircleHoleOptions var5 = (CircleHoleOptions)var3;
               this.j.f();
               this.a(var5);
            }

            if (this.t != null && this.r > 0) {
               if (this.x == null || this.x.c()) {
                  this.e();
               }

               if (var3 instanceof PolygonHoleOptions) {
                  eq.a(this.x, -1, this.f, this.t, this.getStrokeWidth(), this.u, this.r, this.s, this.j.x());
               } else if (var3 instanceof CircleHoleOptions) {
                  eq.a(this.x, -1, -1, this.t, 10.0F, this.r, this.j.x(), 0.0F, 0);
               }
            }
         }

         GLES20.glColorMask(true, true, true, true);
         GLES20.glStencilFunc(517, 1, 255);
         GLES20.glStencilMask(0);
      }

   }

   private void g() throws RemoteException {
      GLES20.glClearStencil(0);
      GLES20.glClear(1024);
      GLES20.glDisable(2960);
      MapConfig var1 = this.j.getMapConfig();
      if (this.p != null && this.p.size() > 0) {
         for(int var2 = 0; var2 < this.p.size(); ++var2) {
            BaseHoleOptions var3 = (BaseHoleOptions)this.p.get(var2);
            if (var3 instanceof PolygonHoleOptions) {
               PolygonHoleOptions var4 = (PolygonHoleOptions)var3;
               this.a(this.a(var4.getPoints()), var1.getSX(), var1.getSY());
            } else if (var3 instanceof CircleHoleOptions) {
               CircleHoleOptions var5 = (CircleHoleOptions)var3;
               this.j.f();
               this.a(var5);
            }

            if (this.t != null && this.r > 0) {
               if (this.x == null || this.x.c()) {
                  this.e();
               }

               byte var6 = -1;
               if (var3 instanceof PolygonHoleOptions) {
                  eq.b(this.x, 0, this.e, this.t, this.d, this.u, this.r, this.s, this.j.x());
               } else if (var3 instanceof CircleHoleOptions) {
                  eq.b(this.x, 0, this.e, this.t, this.d, this.r, this.j.x(), this.a, var6);
               }
            }
         }
      }

   }

   static IPoint[] a(IPoint[] var0) {
      int var1 = var0.length;
      double[] var2 = new double[var1 * 2];

      for(int var3 = 0; var3 < var1; ++var3) {
         var2[var3 * 2] = (double)var0[var3].x * B;
         var2[var3 * 2 + 1] = (double)var0[var3].y * B;
      }

      en var8 = new en();
      fe var4 = var8.a(var2);
      int var5 = var4.b;
      IPoint[] var6 = new IPoint[var5];

      for(int var7 = 0; var7 < var5; ++var7) {
         var6[var7] = new IPoint();
         var6[var7].x = (int)(var2[var4.a(var7) * 2] / B);
         var6[var7].y = (int)(var2[var4.a(var7) * 2 + 1] / B);
      }

      return var6;
   }

   private void a(List<IPoint> var1, int var2, int var3) throws RemoteException {
      int var4 = var1.size();
      if (var4 >= 2) {
         int var5 = var1.size() * 3;
         float[] var6 = new float[var5];
         IPoint[] var7 = new IPoint[var1.size()];
         int var8 = 0;

         for(Iterator var9 = var1.iterator(); var9.hasNext(); ++var8) {
            IPoint var10 = (IPoint)var9.next();
            var6[var8 * 3] = (float)(var10.x - var2);
            var6[var8 * 3 + 1] = (float)(var10.y - var3);
            var6[var8 * 3 + 2] = 0.0F;
            var7[var8] = var10;
         }

         IPoint[] var15 = a(var7);
         if (var15.length == 0) {
            if (B == 1.0E10D) {
               B = 1.0E8D;
            } else {
               B = 1.0E10D;
            }

            var15 = a(var7);
         }

         float[] var16 = new float[3 * var15.length];
         var8 = 0;
         IPoint[] var11 = var15;
         int var12 = var15.length;

         for(int var13 = 0; var13 < var12; ++var13) {
            IPoint var14 = var11[var13];
            var16[var8 * 3] = (float)(var14.x - var2);
            var16[var8 * 3 + 1] = (float)(var14.y - var3);
            var16[var8 * 3 + 2] = 0.0F;
            ++var8;
         }

         this.r = var7.length;
         this.s = var15.length;
         this.t = fi.a(var6);
         this.u = fi.a(var16);
      }
   }

   private List<IPoint> a(List<LatLng> var1) throws RemoteException {
      ArrayList var3 = new ArrayList();
      if (var1 != null) {
         LatLng var4 = null;
         Iterator var5 = var1.iterator();

         IPoint var7;
         while(var5.hasNext()) {
            LatLng var6 = (LatLng)var5.next();
            if (!var6.equals(var4)) {
               var7 = IPoint.obtain();
               this.j.a(var6.latitude, var6.longitude, var7);
               var3.add(var7);
               var4 = var6;
            }
         }

         int var8 = var3.size();
         if (var8 > 1) {
            IPoint var9 = (IPoint)var3.get(0);
            var7 = (IPoint)var3.get(var8 - 1);
            if (var9.x == var7.x && var9.y == var7.y) {
               var3.remove(var8 - 1);
            }
         }
      }

      if (fi.a((List)var3, 0, var3.size())) {
         Collections.reverse(var3);
      }

      return var3;
   }

   public void a(CircleHoleOptions var1) throws RemoteException {
      if (var1.getCenter() != null) {
         IPoint var2 = IPoint.obtain();
         FPoint var3 = FPoint.obtain();
         GLMapState.lonlat2Geo(var1.getCenter().longitude, var1.getCenter().latitude, var2);
         float[] var4 = new float[1086];
         double var5 = this.b(var1.getCenter().latitude) * var1.getRadius();
         var3.x = (float)(var2.x - this.j.getMapConfig().getSX());
         var3.y = (float)(var2.y - this.j.getMapConfig().getSY());
         var4[0] = var3.x;
         var4[1] = var3.y;
         var4[2] = 0.0F;

         for(int var7 = 0; var7 < 361; ++var7) {
            double var8 = (double)var7 * 3.141592653589793D / 180.0D;
            double var10 = Math.sin(var8) * var5;
            double var12 = Math.cos(var8) * var5;
            int var14 = (int)((double)var2.x + var10);
            int var15 = (int)((double)var2.y + var12);
            var3.x = (float)(var14 - this.j.getMapConfig().getSX());
            var3.y = (float)(var15 - this.j.getMapConfig().getSY());
            var4[(var7 + 1) * 3] = var3.x;
            var4[(var7 + 1) * 3 + 1] = var3.y;
            var4[(var7 + 1) * 3 + 2] = 0.0F;
         }

         this.r = var4.length / 3;
         this.t = fi.a(var4);
         var2.recycle();
         var3.recycle();
      }

   }
}
