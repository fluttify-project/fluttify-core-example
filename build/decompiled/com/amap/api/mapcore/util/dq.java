package com.amap.api.mapcore.util;

import android.graphics.Color;
import android.graphics.Rect;
import android.opengl.GLES20;
import android.os.RemoteException;
import com.amap.api.maps.model.BaseHoleOptions;
import com.amap.api.maps.model.CircleHoleOptions;
import com.amap.api.maps.model.LatLng;
import com.amap.api.maps.model.LatLngBounds;
import com.amap.api.maps.model.LatLngBounds$Builder;
import com.amap.api.maps.model.PolygonHoleOptions;
import com.autonavi.ae.gmap.GLMapState;
import com.autonavi.amap.mapcore.FPoint;
import com.autonavi.amap.mapcore.IPoint;
import com.autonavi.amap.mapcore.MapConfig;
import com.autonavi.amap.mapcore.Rectangle;
import com.autonavi.amap.mapcore.interfaces.IOverlay;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class dq implements di {
   private u b;
   private float c = 0.0F;
   private boolean d = true;
   private String e;
   private float f;
   private int g;
   private int h;
   private List<LatLng> i;
   private List<IPoint> j = new Vector();
   private List<BaseHoleOptions> k = new Vector();
   private List<BaseHoleOptions> l;
   private FloatBuffer m;
   private FloatBuffer n;
   private int o = 0;
   private int p = 0;
   private boolean q = false;
   private float r = 0.0F;
   private Object s = new Object();
   Rect a = null;
   private float t = 0.0F;
   private dw$e u;
   private static float v = 4.0075016E7F;
   private static int w = 256;
   private static int x = 20;
   private int y;
   private int z;
   private FloatBuffer A;
   private FloatBuffer B;
   private static double C = 1.0E10D;

   public dq(u var1) {
      this.b = var1;

      try {
         this.e = this.getId();
      } catch (RemoteException var3) {
         ht.c(var3, "PolygonDelegateImp", "create");
         var3.printStackTrace();
      }

   }

   public void remove() throws RemoteException {
      this.b.a(this.getId());
      this.b.setRunLowFrame(false);
   }

   public String getId() throws RemoteException {
      if (this.e == null) {
         this.e = this.b.d("Polygon");
      }

      return this.e;
   }

   public void setPoints(List<LatLng> var1) throws RemoteException {
      Object var2 = this.s;
      synchronized(this.s) {
         this.i = var1;
         this.a(var1);
         this.b.setRunLowFrame(false);
         this.setHoleOptions(this.l);
      }
   }

   public List<LatLng> getPoints() throws RemoteException {
      return this.i;
   }

   public void setZIndex(float var1) throws RemoteException {
      this.c = var1;
      this.b.f();
      this.b.setRunLowFrame(false);
   }

   public float getZIndex() throws RemoteException {
      return this.c;
   }

   public void setVisible(boolean var1) throws RemoteException {
      this.d = var1;
      this.b.setRunLowFrame(false);
   }

   public boolean isVisible() throws RemoteException {
      return this.d;
   }

   public boolean equalsRemote(IOverlay var1) throws RemoteException {
      return this.equals(var1) || var1.getId().equals(this.getId());
   }

   private void a(List<LatLng> var1) throws RemoteException {
      LatLngBounds$Builder var3 = LatLngBounds.builder();
      if (this.a == null) {
         this.a = new Rect();
      }

      fi.a(this.a);
      this.j.clear();
      if (var1 != null) {
         LatLng var4 = null;
         Iterator var5 = var1.iterator();

         IPoint var7;
         while(var5.hasNext()) {
            LatLng var6 = (LatLng)var5.next();
            if (!var6.equals(var4)) {
               var7 = IPoint.obtain();
               this.b.a(var6.latitude, var6.longitude, var7);
               this.j.add(var7);
               fi.b(this.a, var7.x, var7.y);
               var3.include(var6);
               var4 = var6;
            }
         }

         int var8 = this.j.size();
         if (var8 > 1) {
            IPoint var9 = (IPoint)this.j.get(0);
            var7 = (IPoint)this.j.get(var8 - 1);
            if (var9.x == var7.x && var9.y == var7.y) {
               this.j.remove(var8 - 1);
            }
         }
      }

      this.a.sort();
      if (this.m != null) {
         this.m.clear();
      }

      if (this.n != null) {
         this.n.clear();
      }

      if (fi.a((List)this.j, 0, this.j.size())) {
         Collections.reverse(this.j);
      }

      this.o = 0;
      this.p = 0;
      this.b.setRunLowFrame(false);
   }

   public int hashCodeRemote() throws RemoteException {
      return super.hashCode();
   }

   public boolean a() {
      return this.b.getMapConfig().getGeoRectangle().isOverlap(this.a);
   }

   private void b() {
      if (this.b != null) {
         this.u = (dw$e)this.b.u(3);
      }

   }

   public void a(MapConfig var1) throws RemoteException {
      if (this.j != null && this.j.size() != 0) {
         Rectangle var2 = var1.getGeoRectangle();
         IPoint[] var3 = var2.getClipRect();
         List var4 = this.j;
         this.a(var2);
         boolean var5 = false;
         if (var5) {
            Object var6 = this.s;
            synchronized(this.s) {
               var4 = fi.a(var3, this.j, true);
            }
         }

         this.d();
         if (var4.size() > 2) {
            this.b(var4, var1.getSX(), var1.getSY());
            if (this.m != null && this.n != null && this.o > 0 && this.p > 0) {
               if (this.u == null || this.u.c()) {
                  this.b();
               }

               eq.a(this.u, this.g, this.h, this.m, this.f, this.n, this.o, this.p, this.b.x());
            }
         }

         this.e();
         this.q = true;
      }
   }

   private void d() throws RemoteException {
      MapConfig var1 = this.b.getMapConfig();
      if (this.k != null && this.k.size() > 0) {
         GLES20.glClearStencil(0);
         GLES20.glStencilMask(255);
         GLES20.glClear(1024);
         GLES20.glFlush();
         GLES20.glEnable(2960);
         GLES20.glColorMask(false, false, false, false);
         GLES20.glStencilFunc(512, 1, 255);
         GLES20.glStencilOp(7681, 7680, 7680);

         for(int var2 = 0; var2 < this.k.size(); ++var2) {
            BaseHoleOptions var3 = (BaseHoleOptions)this.k.get(var2);
            if (var3 instanceof PolygonHoleOptions) {
               PolygonHoleOptions var4 = (PolygonHoleOptions)var3;
               this.a(this.b(var4.getPoints()), var1.getSX(), var1.getSY());
            } else if (var3 instanceof CircleHoleOptions) {
               CircleHoleOptions var5 = (CircleHoleOptions)var3;
               this.b.f();
               this.a(var5);
            }

            if (this.A != null && this.y > 0) {
               if (this.u == null || this.u.c()) {
                  this.b();
               }

               if (var3 instanceof PolygonHoleOptions) {
                  eq.a(this.u, -1, this.h, this.A, this.f, this.B, this.y, this.z, this.b.x());
               } else if (var3 instanceof CircleHoleOptions) {
                  eq.a(this.u, Color.argb(200, 80, 1, 1), Color.argb(200, 1, 1, 1), this.A, 5.0F, this.y, this.b.x(), 0.0F, 0);
               }
            }
         }

         GLES20.glColorMask(true, true, true, true);
         GLES20.glStencilFunc(517, 1, 255);
         GLES20.glStencilMask(0);
      }

   }

   private void e() throws RemoteException {
      GLES20.glClearStencil(0);
      GLES20.glClear(1024);
      GLES20.glDisable(2960);
      MapConfig var1 = this.b.getMapConfig();
      if (this.k != null && this.k.size() > 0) {
         for(int var2 = 0; var2 < this.k.size(); ++var2) {
            BaseHoleOptions var3 = (BaseHoleOptions)this.k.get(var2);
            if (var3 instanceof PolygonHoleOptions) {
               PolygonHoleOptions var4 = (PolygonHoleOptions)var3;
               this.a(this.b(var4.getPoints()), var1.getSX(), var1.getSY());
            } else if (var3 instanceof CircleHoleOptions) {
               CircleHoleOptions var5 = (CircleHoleOptions)var3;
               this.b.f();
               this.a(var5);
            }

            if (this.A != null && this.y > 0) {
               if (this.u == null || this.u.c()) {
                  this.b();
               }

               if (var3 instanceof PolygonHoleOptions) {
                  eq.b(this.u, 0, this.h, this.A, this.f, this.B, this.y, this.z, this.b.x());
               } else if (var3 instanceof CircleHoleOptions) {
                  eq.b(this.u, 0, this.h, this.A, this.f, this.y, this.b.x(), 1.0F, -1);
               }
            }
         }
      }

   }

   private float a(double var1) {
      return (float)(Math.cos(var1 * 3.141592653589793D / 180.0D) * (double)v / (double)(w << x));
   }

   private double b(double var1) {
      return 1.0D / (double)this.a(var1);
   }

   public void a(CircleHoleOptions var1) throws RemoteException {
      if (var1.getCenter() != null) {
         IPoint var2 = IPoint.obtain();
         FPoint var3 = FPoint.obtain();
         GLMapState.lonlat2Geo(var1.getCenter().longitude, var1.getCenter().latitude, var2);
         float[] var4 = new float[1086];
         double var5 = this.b(var1.getCenter().latitude) * var1.getRadius();
         int var7 = this.b.getMapConfig().getSX();
         int var8 = this.b.getMapConfig().getSY();
         var3.x = (float)(var2.x - var7);
         var3.y = (float)(var2.y - var8);
         var4[0] = var3.x;
         var4[1] = var3.y;
         var4[2] = 0.0F;

         for(int var9 = 0; var9 < 361; ++var9) {
            double var10 = (double)var9 * 3.141592653589793D / 180.0D;
            double var12 = Math.sin(var10) * var5;
            double var14 = Math.cos(var10) * var5;
            int var16 = (int)((double)var2.x + var12);
            int var17 = (int)((double)var2.y + var14);
            var3.x = (float)(var16 - var7);
            var3.y = (float)(var17 - var8);
            var3.x = (float)(var16 - this.b.getMapConfig().getSX());
            var3.y = (float)(var17 - this.b.getMapConfig().getSY());
            var4[(var9 + 1) * 3] = var3.x;
            var4[(var9 + 1) * 3 + 1] = var3.y;
            var4[(var9 + 1) * 3 + 2] = 0.0F;
         }

         this.y = var4.length / 3;
         this.A = fi.a(var4);
         var2.recycle();
         var3.recycle();
      }

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
            if (C == 1.0E10D) {
               C = 1.0E8D;
            } else {
               C = 1.0E10D;
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

         this.y = var7.length;
         this.z = var15.length;
         this.A = fi.a(var6);
         this.B = fi.a(var16);
      }
   }

   private boolean a(Rectangle var1) {
      boolean var2 = false;
      this.t = this.b.g();
      this.f();
      byte var3 = 10;
      if (this.t <= (float)var3) {
         return false;
      } else {
         try {
            if (var1 != null) {
               return !var1.contains(this.a);
            } else {
               return var2;
            }
         } catch (Throwable var5) {
            return false;
         }
      }
   }

   private void b(List<IPoint> var1, int var2, int var3) throws RemoteException {
      this.f();
      ArrayList var4 = new ArrayList();
      int var5 = var1.size();
      if (var5 >= 2) {
         IPoint var6 = (IPoint)var1.get(0);
         var4.add(var6);

         int var7;
         for(var7 = 1; var7 < var5 - 1; ++var7) {
            IPoint var8 = (IPoint)var1.get(var7);
            if (this.a(var6, var8)) {
               var4.add(var8);
               var6 = var8;
            }
         }

         var4.add(var1.get(var5 - 1));
         var7 = var4.size() * 3;
         float[] var17 = new float[var7];
         IPoint[] var9 = new IPoint[var4.size()];
         int var10 = 0;

         for(Iterator var11 = var4.iterator(); var11.hasNext(); ++var10) {
            IPoint var12 = (IPoint)var11.next();
            var17[var10 * 3] = (float)(var12.x - var2);
            var17[var10 * 3 + 1] = (float)(var12.y - var3);
            var17[var10 * 3 + 2] = 0.0F;
            var9[var10] = var12;
         }

         IPoint[] var18 = a(var9);
         if (var18.length == 0) {
            if (C == 1.0E10D) {
               C = 1.0E8D;
            } else {
               C = 1.0E10D;
            }

            var18 = a(var9);
         }

         float[] var19 = new float[3 * var18.length];
         var10 = 0;
         IPoint[] var13 = var18;
         int var14 = var18.length;

         for(int var15 = 0; var15 < var14; ++var15) {
            IPoint var16 = var13[var15];
            var19[var10 * 3] = (float)(var16.x - var2);
            var19[var10 * 3 + 1] = (float)(var16.y - var3);
            var19[var10 * 3 + 2] = 0.0F;
            ++var10;
         }

         this.o = var9.length;
         this.p = var18.length;
         this.m = fi.a(var17);
         this.n = fi.a(var19);
      }
   }

   private List<IPoint> b(List<LatLng> var1) throws RemoteException {
      ArrayList var3 = new ArrayList();
      if (var1 != null) {
         LatLng var4 = null;
         Iterator var5 = var1.iterator();

         IPoint var7;
         while(var5.hasNext()) {
            LatLng var6 = (LatLng)var5.next();
            if (!var6.equals(var4)) {
               var7 = IPoint.obtain();
               this.b.a(var6.latitude, var6.longitude, var7);
               var3.add(var7);
               fi.b(this.a, var7.x, var7.y);
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

   private boolean a(IPoint var1, IPoint var2) {
      return (float)(var2.x - var1.x) >= this.r || (float)(var2.x - var1.x) <= -this.r || (float)(var2.y - var1.y) >= this.r || (float)(var2.y - var1.y) <= -this.r;
   }

   private void f() {
      float var1 = this.b.g();
      short var2 = 5000;
      if (this.j.size() > var2) {
         byte var3 = 12;
         if (var1 <= (float)var3) {
            float var4 = this.f / 2.0F + var1 / 2.0F;
            var4 = var4 <= 200.0F ? var4 : 200.0F;
            this.r = this.b.c().getMapLenWithWin((int)var4);
         } else {
            this.r = this.b.c().getMapLenWithWin(10);
         }
      } else {
         this.r = this.b.c().getMapLenWithWin(2);
      }

   }

   public void setStrokeWidth(float var1) throws RemoteException {
      this.f = var1;
      this.b.setRunLowFrame(false);
   }

   public float getStrokeWidth() throws RemoteException {
      return this.f;
   }

   public void setFillColor(int var1) throws RemoteException {
      this.g = var1;
      this.b.setRunLowFrame(false);
   }

   public int getFillColor() throws RemoteException {
      return this.g;
   }

   public void setStrokeColor(int var1) throws RemoteException {
      this.h = var1;
      this.b.setRunLowFrame(false);
   }

   public int getStrokeColor() throws RemoteException {
      return this.h;
   }

   public void setHoleOptions(List<BaseHoleOptions> var1) {
      try {
         this.l = var1;
         if (this.k == null) {
            this.k = new ArrayList();
         } else {
            this.k.clear();
         }

         if (var1 != null) {
            for(int var2 = 0; var2 < var1.size(); ++var2) {
               BaseHoleOptions var3 = (BaseHoleOptions)var1.get(var2);
               if (var3 instanceof PolygonHoleOptions) {
                  PolygonHoleOptions var4 = (PolygonHoleOptions)var3;
                  if (this.a(var4) && !fi.a(this.k, var4)) {
                     this.k.add(var4);
                  }
               } else if (var3 instanceof CircleHoleOptions) {
                  CircleHoleOptions var6 = (CircleHoleOptions)var3;
                  if (this.b(var6) && !fi.a(this.k, var6)) {
                     this.k.add(var6);
                  }
               }
            }
         } else {
            this.k.clear();
         }
      } catch (Throwable var5) {
         ht.c(var5, "PolygonDelegateImp", "setHoleOptions");
         var5.printStackTrace();
      }

      this.b.setRunLowFrame(false);
   }

   private boolean b(CircleHoleOptions var1) {
      try {
         boolean var2 = fi.b(this.getPoints(), var1);
         if (!var2 && this.contains(var1.getCenter())) {
            return true;
         }
      } catch (Throwable var3) {
         ht.c(var3, "PolygonDelegateImp", "isCircleInPolygon");
         var3.printStackTrace();
      }

      return false;
   }

   private boolean a(PolygonHoleOptions var1) {
      boolean var2 = true;

      try {
         List var3 = var1.getPoints();

         for(int var4 = 0; var4 < var3.size(); ++var4) {
            var2 = fi.a((LatLng)var3.get(var4), this.getPoints());
            if (!var2) {
               break;
            }
         }
      } catch (Throwable var5) {
         ht.c(var5, "PolygonDelegateImp", "isPolygonInPolygon");
         var5.printStackTrace();
      }

      return var2;
   }

   public List<BaseHoleOptions> getHoleOptions() {
      return this.k;
   }

   static IPoint[] a(IPoint[] var0) {
      int var1 = var0.length;
      double[] var2 = new double[var1 * 2];

      for(int var3 = 0; var3 < var1; ++var3) {
         var2[var3 * 2] = (double)var0[var3].x * C;
         var2[var3 * 2 + 1] = (double)var0[var3].y * C;
      }

      en var8 = new en();
      fe var4 = var8.a(var2);
      int var5 = var4.b;
      IPoint[] var6 = new IPoint[var5];

      for(int var7 = 0; var7 < var5; ++var7) {
         var6[var7] = new IPoint();
         var6[var7].x = (int)(var2[var4.a(var7) * 2] / C);
         var6[var7].y = (int)(var2[var4.a(var7) * 2 + 1] / C);
      }

      return var6;
   }

   public void destroy() {
      try {
         if (this.m != null) {
            this.m.clear();
            this.m = null;
         }

         if (this.n != null) {
            this.n = null;
         }

         if (this.A != null) {
            this.A.clear();
            this.A = null;
         }

         if (this.B != null) {
            this.B.clear();
            this.B = null;
         }

         if (this.k != null) {
            this.k.clear();
         }

         if (this.l != null) {
            this.l.clear();
         }

         this.k = null;
         this.l = null;
      } catch (Throwable var2) {
         ht.c(var2, "PolygonDelegateImp", "destroy");
         var2.printStackTrace();
      }

   }

   public boolean contains(LatLng var1) throws RemoteException {
      try {
         if (var1 == null) {
            return false;
         } else {
            if (this.k != null && this.k.size() > 0) {
               Iterator var2 = this.k.iterator();

               while(var2.hasNext()) {
                  BaseHoleOptions var3 = (BaseHoleOptions)var2.next();
                  if (fi.a(var3, var1)) {
                     return false;
                  }
               }
            }

            return fi.a(var1, this.getPoints());
         }
      } catch (Throwable var4) {
         ht.c(var4, "PolygonDelegateImp", "contains");
         var4.printStackTrace();
         return false;
      }
   }

   public boolean c() {
      return this.q;
   }

   public boolean isAboveMaskLayer() {
      return false;
   }

   public void setAboveMaskLayer(boolean var1) {
   }
}
