package com.amap.api.mapcore.util;

import android.graphics.Color;
import android.os.RemoteException;
import android.util.Log;
import com.amap.api.maps.model.LatLng;
import com.autonavi.ae.gmap.GLMapState;
import com.autonavi.amap.mapcore.AMapNativeRenderer;
import com.autonavi.amap.mapcore.DPoint;
import com.autonavi.amap.mapcore.FPoint;
import com.autonavi.amap.mapcore.IPoint;
import com.autonavi.amap.mapcore.MapConfig;
import com.autonavi.amap.mapcore.interfaces.IOverlay;

public class cu implements cz {
   private LatLng e;
   private LatLng f;
   private LatLng g;
   private float h = 10.0F;
   private int i = -16777216;
   private float j = 0.0F;
   private boolean k = true;
   private String l;
   private u m;
   private float[] n;
   private int o = 0;
   private boolean p = false;
   private double q = 0.0D;
   private double r = 0.0D;
   private double s = 0.0D;
   float a;
   float b;
   float c;
   float d;

   public cu(u var1) {
      this.m = var1;

      try {
         this.l = this.getId();
      } catch (RemoteException var3) {
         ht.c(var3, "ArcDelegateImp", "create");
         var3.printStackTrace();
      }

   }

   public boolean a() {
      return true;
   }

   public void remove() throws RemoteException {
      this.m.a(this.getId());
      this.m.setRunLowFrame(false);
   }

   public String getId() throws RemoteException {
      if (this.l == null) {
         this.l = this.m.d("Arc");
      }

      return this.l;
   }

   public void setZIndex(float var1) throws RemoteException {
      this.j = var1;
      this.m.f();
      this.m.setRunLowFrame(false);
   }

   public float getZIndex() throws RemoteException {
      return this.j;
   }

   public void setVisible(boolean var1) throws RemoteException {
      this.k = var1;
      this.m.setRunLowFrame(false);
   }

   public boolean isVisible() throws RemoteException {
      return this.k;
   }

   public boolean equalsRemote(IOverlay var1) throws RemoteException {
      return this.equals(var1) || var1.getId().equals(this.getId());
   }

   public int hashCodeRemote() throws RemoteException {
      return 0;
   }

   public boolean b() throws RemoteException {
      if (this.e != null && this.f != null && this.g != null && this.k) {
         try {
            this.p = false;
            GLMapState var3 = this.m.c();
            FPoint[] var1;
            int var7;
            if (this.d()) {
               DPoint var11 = this.e();
               int var10 = (int)(Math.abs(this.s - this.r) * 180.0D / 3.141592653589793D);
               double var12 = (this.s - this.r) / (double)var10;
               var1 = new FPoint[var10 + 1];
               this.n = new float[3 * var1.length];

               for(var7 = 0; var7 <= var10; ++var7) {
                  if (var7 == var10) {
                     FPoint var8 = FPoint.obtain();
                     this.m.a(this.g.latitude, this.g.longitude, var8);
                     var1[var7] = var8;
                  } else {
                     var1[var7] = this.a(var3, this.r + (double)var7 * var12, var11.x, var11.y);
                  }

                  var1[var7] = this.a(var3, this.r + (double)var7 * var12, var11.x, var11.y);
                  this.n[var7 * 3] = var1[var7].x;
                  this.n[var7 * 3 + 1] = var1[var7].y;
                  this.n[var7 * 3 + 2] = 0.0F;
               }

               var11.recycle();
               this.o = var1.length;
               return true;
            } else {
               byte var2 = 3;
               var1 = new FPoint[var2];
               this.n = new float[var2 * var1.length];
               FPoint var4 = FPoint.obtain();
               this.m.a(this.e.latitude, this.e.longitude, var4);
               var1[0] = var4;
               FPoint var5 = FPoint.obtain();
               this.m.a(this.f.latitude, this.f.longitude, var5);
               var1[1] = var5;
               FPoint var6 = FPoint.obtain();
               this.m.a(this.g.latitude, this.g.longitude, var6);
               var1[2] = var6;

               for(var7 = 0; var7 < var2; ++var7) {
                  this.n[var7 * 3] = var1[var7].x;
                  this.n[var7 * 3 + 1] = var1[var7].y;
                  this.n[var7 * 3 + 2] = 0.0F;
               }

               this.o = var1.length;
               return true;
            }
         } catch (Throwable var9) {
            ht.c(var9, "ArcDelegateImp", "calMapFPoint");
            var9.printStackTrace();
            return false;
         }
      } else {
         return false;
      }
   }

   private FPoint a(GLMapState var1, double var2, double var4, double var6) {
      double var8 = Math.cos(var2) * this.q;
      double var10 = -Math.sin(var2) * this.q;
      int var12 = (int)(var4 + var8);
      int var13 = (int)(var6 + var10);
      FPoint var14 = FPoint.obtain();
      MapConfig var15 = this.m.getMapConfig();
      if (var15 != null) {
         var14.x = (float)(var12 - var15.getSX());
         var14.y = (float)(var13 - var15.getSY());
      }

      return var14;
   }

   private boolean d() {
      double var1 = (this.e.latitude - this.f.latitude) * (this.f.longitude - this.g.longitude) * Math.pow(10.0D, 6.0D) - (this.e.longitude - this.f.longitude) * (this.f.latitude - this.g.latitude) * Math.pow(10.0D, 6.0D);
      double var3 = 1.0E-6D;
      return Math.abs(var1) >= var3;
   }

   private DPoint e() {
      IPoint var1 = IPoint.obtain();
      this.m.a(this.e.latitude, this.e.longitude, var1);
      IPoint var2 = IPoint.obtain();
      this.m.a(this.f.latitude, this.f.longitude, var2);
      IPoint var3 = IPoint.obtain();
      this.m.a(this.g.latitude, this.g.longitude, var3);
      double var4 = (double)var1.x;
      double var6 = (double)var1.y;
      double var8 = (double)var2.x;
      double var10 = (double)var2.y;
      double var12 = (double)var3.x;
      double var14 = (double)var3.y;
      double var16 = ((var14 - var6) * (var10 * var10 - var6 * var6 + var8 * var8 - var4 * var4) + (var10 - var6) * (var6 * var6 - var14 * var14 + var4 * var4 - var12 * var12)) / (2.0D * (var8 - var4) * (var14 - var6) - 2.0D * (var12 - var4) * (var10 - var6));
      double var18 = ((var12 - var4) * (var8 * var8 - var4 * var4 + var10 * var10 - var6 * var6) + (var8 - var4) * (var4 * var4 - var12 * var12 + var6 * var6 - var14 * var14)) / (2.0D * (var10 - var6) * (var12 - var4) - 2.0D * (var14 - var6) * (var8 - var4));
      this.q = Math.sqrt((var4 - var16) * (var4 - var16) + (var6 - var18) * (var6 - var18));
      this.r = this.a(var16, var18, var4, var6);
      double var20 = this.a(var16, var18, var8, var10);
      this.s = this.a(var16, var18, var12, var14);
      if (this.r < this.s) {
         if (var20 <= this.r || var20 >= this.s) {
            this.s -= 6.283185307179586D;
         }
      } else if (var20 <= this.s || var20 >= this.r) {
         this.s += 6.283185307179586D;
      }

      var1.recycle();
      var2.recycle();
      var3.recycle();
      return DPoint.obtain(var16, var18);
   }

   private double a(double var1, double var3, double var5, double var7) {
      double var9 = (var3 - var7) / this.q;
      var9 = Math.abs(var9) > 1.0D ? Math.signum(var9) : var9;
      double var11 = Math.asin(var9);
      if (var11 >= 0.0D) {
         if (var5 < var1) {
            var11 = 3.141592653589793D - Math.abs(var11);
         }
      } else if (var5 < var1) {
         var11 = 3.141592653589793D - var11;
      } else {
         var11 += 6.283185307179586D;
      }

      return var11;
   }

   public void a(MapConfig var1) throws RemoteException {
      if (this.e != null && this.f != null && this.g != null && this.k) {
         this.b();
         if (this.n != null && this.o > 0) {
            float var2 = this.m.c().getMapLenWithWin((int)this.h);
            float var3 = this.m.c().getMapLenWithWin(1);
            AMapNativeRenderer.nativeDrawLineByTextureID(this.n, this.n.length, var2, this.m.d(), this.b, this.c, this.d, this.a, 0.0F, false, true, false, this.m.x(), 3, 0);
         }

         this.p = true;
      }
   }

   public void setStrokeWidth(float var1) throws RemoteException {
      this.h = var1;
      this.m.setRunLowFrame(false);
   }

   public float getStrokeWidth() throws RemoteException {
      return this.h;
   }

   public void setStrokeColor(int var1) throws RemoteException {
      this.i = var1;
      this.a = (float)Color.alpha(var1) / 255.0F;
      this.b = (float)Color.red(var1) / 255.0F;
      this.c = (float)Color.green(var1) / 255.0F;
      this.d = (float)Color.blue(var1) / 255.0F;
      this.m.setRunLowFrame(false);
   }

   public int getStrokeColor() throws RemoteException {
      return this.i;
   }

   public void destroy() {
      try {
         this.e = null;
         this.f = null;
         this.g = null;
      } catch (Throwable var2) {
         ht.c(var2, "ArcDelegateImp", "destroy");
         var2.printStackTrace();
         Log.d("destroy erro", "ArcDelegateImp destroy");
      }

   }

   public boolean c() {
      return this.p;
   }

   public void a(LatLng var1) {
      this.e = var1;
   }

   public void b(LatLng var1) {
      this.f = var1;
   }

   public void c(LatLng var1) {
      this.g = var1;
   }

   public boolean isAboveMaskLayer() {
      return false;
   }

   public void setAboveMaskLayer(boolean var1) {
   }
}
