package com.amap.api.mapcore.util;

import android.graphics.Color;
import android.graphics.Rect;
import android.os.RemoteException;
import android.util.Log;
import com.amap.api.maps.model.LatLng;
import com.autonavi.ae.gmap.gloverlay.GLOverlay$EAMapOverlayTpye;
import com.autonavi.amap.mapcore.AMapNativeRenderer;
import com.autonavi.amap.mapcore.DPoint;
import com.autonavi.amap.mapcore.IPoint;
import com.autonavi.amap.mapcore.MapConfig;
import com.autonavi.amap.mapcore.Rectangle;
import com.autonavi.amap.mapcore.interfaces.IOverlay;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class do implements de {
   private u k;
   private float l = 10.0F;
   private int m = -16777216;
   private int n = -16777216;
   private float o = 0.0F;
   private boolean p = true;
   private String q;
   private List<IPoint> r = new Vector();
   int[] a = null;
   int[] b = null;
   private int s = 0;
   private boolean t = false;
   private boolean u = false;
   private boolean v = false;
   private boolean w = false;
   private Object x = new Object();
   float c;
   float d;
   float e;
   float f;
   Rect g = null;
   boolean h = false;
   float[] i;
   int j = 0;
   private String y = null;
   private final int z = Color.argb(0, 0, 0, 0);
   private boolean A = true;

   public do(u var1) {
      this.k = var1;

      try {
         this.q = this.getId();
      } catch (RemoteException var3) {
         ht.c(var3, "NavigateArrowDelegateImp", "create");
         var3.printStackTrace();
      }

      this.h = false;
   }

   void a(List<LatLng> var1) throws RemoteException {
      Object var2 = this.x;
      synchronized(this.x) {
         this.r.clear();
         if (this.g == null) {
            this.g = new Rect();
         }

         fi.a(this.g);
         IPoint var7;
         if (var1 != null) {
            LatLng var4 = null;
            Iterator var5 = var1.iterator();

            while(var5.hasNext()) {
               LatLng var6 = (LatLng)var5.next();
               if (var6 != null && !var6.equals(var4)) {
                  var7 = IPoint.obtain();
                  this.k.a(var6.latitude, var6.longitude, var7);
                  this.r.add(var7);
                  fi.b(this.g, var7.x, var7.y);
                  var4 = var6;
               }
            }
         }

         this.s = 0;
         this.g.sort();
         int var10 = this.r.size();
         this.a = new int[var10];
         this.b = new int[var10];
         int var11 = 0;
         Iterator var12 = this.r.iterator();

         while(true) {
            if (!var12.hasNext()) {
               break;
            }

            var7 = (IPoint)var12.next();
            this.a[var11] = var7.x;
            this.b[var11] = var7.y;
            ++var11;
         }
      }

      this.k.setRunLowFrame(false);
   }

   public void remove() throws RemoteException {
      if (!this.h) {
         if (this.k != null && this.k.a() != null && this.y != null) {
            this.k.queueEvent(new do$1(this));
         }

         this.k.a(this.getId());
         this.k.setRunLowFrame(false);
         this.h = true;
      }
   }

   public String getId() throws RemoteException {
      if (this.q == null) {
         this.q = this.k.d("NavigateArrow");
      }

      return this.q;
   }

   public void setPoints(List<LatLng> var1) throws RemoteException {
      this.a(var1);
      this.A = true;
   }

   public List<LatLng> getPoints() throws RemoteException {
      return this.b();
   }

   private List<LatLng> b() throws RemoteException {
      if (this.r != null) {
         Object var1 = this.x;
         synchronized(this.x) {
            ArrayList var2 = new ArrayList();
            Iterator var3 = this.r.iterator();

            while(var3.hasNext()) {
               IPoint var4 = (IPoint)var3.next();
               if (var4 != null) {
                  DPoint var5 = DPoint.obtain();
                  this.k.a(var4.x, var4.y, var5);
                  var2.add(new LatLng(var5.y, var5.x));
                  var5.recycle();
               }
            }

            return var2;
         }
      } else {
         return null;
      }
   }

   public void setWidth(float var1) throws RemoteException {
      this.l = var1;
      this.k.setRunLowFrame(false);
      this.A = true;
   }

   public float getWidth() throws RemoteException {
      return this.l;
   }

   public void setTopColor(int var1) throws RemoteException {
      this.m = var1;
      this.c = (float)Color.alpha(var1) / 255.0F;
      this.d = (float)Color.red(var1) / 255.0F;
      this.e = (float)Color.green(var1) / 255.0F;
      this.f = (float)Color.blue(var1) / 255.0F;
      this.k.setRunLowFrame(false);
      this.A = true;
   }

   public int getTopColor() throws RemoteException {
      return this.m;
   }

   public void setSideColor(int var1) throws RemoteException {
      this.n = var1;
      this.k.setRunLowFrame(false);
      this.A = true;
   }

   public int getSideColor() throws RemoteException {
      return this.n;
   }

   public void setZIndex(float var1) throws RemoteException {
      this.o = var1;
      this.k.f();
      this.k.setRunLowFrame(false);
   }

   public float getZIndex() throws RemoteException {
      return this.o;
   }

   public void setVisible(boolean var1) throws RemoteException {
      this.p = var1;
      this.k.setRunLowFrame(false);
      this.A = true;
   }

   public boolean isVisible() throws RemoteException {
      if (!this.u) {
         return this.p;
      } else {
         return this.p || this.w;
      }
   }

   public boolean equalsRemote(IOverlay var1) throws RemoteException {
      return this.equals(var1) || var1.getId().equals(this.getId());
   }

   public int hashCodeRemote() throws RemoteException {
      return super.hashCode();
   }

   public boolean a() {
      if (this.g != null) {
         Rectangle var1 = this.k.getMapConfig().getGeoRectangle();
         return var1 != null && var1.isOverlap(this.g);
      } else {
         return false;
      }
   }

   public boolean b(MapConfig var1) throws RemoteException {
      Object var2 = this.x;
      synchronized(this.x) {
         int var3 = var1.getSX();
         int var4 = var1.getSY();
         this.t = false;
         int var5 = this.r.size();
         byte var6 = 3;
         if (this.i == null || this.i.length < var6 * var5) {
            this.i = new float[3 * var5];
         }

         this.j = 3 * var5;
         int var7 = 0;

         for(Iterator var8 = this.r.iterator(); var8.hasNext(); ++var7) {
            IPoint var9 = (IPoint)var8.next();
            this.i[var7 * 3] = (float)(var9.x - var3);
            this.i[var7 * 3 + 1] = (float)(var9.y - var4);
            this.i[var7 * 3 + 2] = 0.0F;
         }

         this.s = this.r.size();
         return true;
      }
   }

   public void a(MapConfig var1) throws RemoteException {
      if (!this.h) {
         if (this.r != null && this.r.size() != 0 && this.l > 0.0F) {
            if (!this.u) {
               if (this.y != null && this.v) {
                  this.k.a().updateNativeArrowOverlay(1, this.y, this.a, this.b, this.m, this.n, this.z, this.l, 111, 222, 333, false);
                  this.A = false;
               }

               this.b(this.k.getMapConfig());
               if (this.i != null && this.s > 0) {
                  float var2 = this.k.c().getMapLenWithWin((int)this.l);
                  AMapNativeRenderer.nativeDrawLineByTextureID(this.i, this.j, var2, this.k.d(), this.d, this.e, this.f, this.c, 0.0F, false, true, true, this.k.x(), 2, 0);
                  this.v = false;
                  this.w = false;
               }
            } else if (this.k != null && this.k.a() != null) {
               if (this.y == null) {
                  this.y = this.k.a().addNativeOverlay(1, GLOverlay$EAMapOverlayTpye.AMAPOVERLAY_ARROW.ordinal(), this.hashCode());
               }

               if (this.y != null && this.A) {
                  this.k.a().updateNativeArrowOverlay(1, this.y, this.a, this.b, this.m, this.n, this.z, this.l, 111, 222, 333, this.p);
                  this.v = true;
                  this.w = this.p;
                  this.A = false;
               }
            }

            this.t = true;
         }
      }
   }

   public void destroy() {
      try {
         this.remove();
         if (this.i != null) {
            this.i = null;
         }
      } catch (Throwable var2) {
         ht.c(var2, "NavigateArrowDelegateImp", "destroy");
         var2.printStackTrace();
         Log.d("destroy erro", "NavigateArrowDelegateImp destroy");
      }

   }

   public boolean c() {
      return this.t;
   }

   public boolean isAboveMaskLayer() {
      return false;
   }

   public void setAboveMaskLayer(boolean var1) {
   }

   public void set3DModel(boolean var1) {
      this.u = var1;
      this.w = this.p;
      this.A = true;
   }

   public boolean is3DModel() {
      return this.u;
   }
}
