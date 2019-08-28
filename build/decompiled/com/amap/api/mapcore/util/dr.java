package com.amap.api.mapcore.util;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.opengl.GLES20;
import android.os.RemoteException;
import android.os.Build.VERSION;
import android.util.Log;
import com.amap.api.maps.AMapUtils;
import com.amap.api.maps.model.BitmapDescriptor;
import com.amap.api.maps.model.LatLng;
import com.amap.api.maps.model.LatLngBounds;
import com.amap.api.maps.model.LatLngBounds$Builder;
import com.amap.api.maps.model.PolylineOptions;
import com.amap.api.maps.model.PolylineOptions$LineCapType;
import com.amap.api.maps.model.PolylineOptions$LineJoinType;
import com.autonavi.amap.mapcore.AMapNativePolyline;
import com.autonavi.amap.mapcore.AMapNativeRenderer;
import com.autonavi.amap.mapcore.FPoint;
import com.autonavi.amap.mapcore.FPoint3;
import com.autonavi.amap.mapcore.FPointBounds;
import com.autonavi.amap.mapcore.FPointBounds$Builder;
import com.autonavi.amap.mapcore.IPoint;
import com.autonavi.amap.mapcore.MapConfig;
import com.autonavi.amap.mapcore.Rectangle;
import com.autonavi.amap.mapcore.interfaces.IOverlay;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class dr implements dj {
   private s e;
   private String f;
   private List<IPoint> g = new ArrayList();
   private List<FPoint> h = new ArrayList();
   private List<LatLng> i = new ArrayList();
   private List<BitmapDescriptor> j = new ArrayList();
   private List<ad> k = new ArrayList();
   private List<Integer> l = new ArrayList();
   private List<Integer> m = new ArrayList();
   private List<Integer> n = new ArrayList();
   private List<Integer> o = new ArrayList();
   private FloatBuffer p;
   private BitmapDescriptor q = null;
   private Object r = new Object();
   private boolean s = true;
   private boolean t = true;
   private boolean u = false;
   private boolean v = false;
   private boolean w = false;
   private boolean x = true;
   private boolean y = false;
   private boolean z = false;
   private boolean A = true;
   private int B = 0;
   private int C = 0;
   private int D = -16777216;
   private int E = 0;
   private int F = 0;
   private float G = 10.0F;
   private float H = 0.0F;
   private float I = 0.0F;
   private float J;
   private float K;
   private float L;
   private float M;
   private float N = 1.0F;
   private float O = 0.0F;
   private float[] P;
   private int[] Q;
   private int[] R;
   private boolean S = false;
   private FPointBounds T = null;
   Rect a = null;
   private PolylineOptions U;
   private int V = 0;
   private PolylineOptions$LineJoinType W;
   private PolylineOptions$LineCapType X;
   private dw Y;
   private long Z;
   private boolean aa;
   private float ab;
   private float ac;
   private float ad;
   private int ae;
   private List<IPoint> af;
   int b;
   ArrayList<FPoint> c;
   long d;

   public void a(boolean var1) {
      this.A = var1;
      this.e.g().setRunLowFrame(false);
   }

   public void setGeodesic(boolean var1) throws RemoteException {
      this.u = var1;
      this.e.g().setRunLowFrame(false);
   }

   public boolean isGeodesic() {
      return this.u;
   }

   public void setDottedLine(boolean var1) {
      if (this.B == 2 || this.B == 0) {
         this.v = var1;
         if (var1 && this.t) {
            this.B = 2;
         } else if (!var1 && this.t) {
            this.B = 0;
         }

         this.e.g().setRunLowFrame(false);
      }

   }

   public void a(int var1) {
      this.F = var1;
   }

   public boolean isDottedLine() {
      return this.v;
   }

   public dr(s var1, PolylineOptions var2) {
      this.W = PolylineOptions$LineJoinType.LineJoinBevel;
      this.X = PolylineOptions$LineCapType.LineCapRound;
      this.Z = 0L;
      this.aa = false;
      this.ab = -1.0F;
      this.ac = -1.0F;
      this.ad = -1.0F;
      this.ae = -1;
      this.af = new ArrayList();
      this.b = 0;
      this.c = new ArrayList();
      this.d = 0L;
      this.e = var1;
      this.setOptions(var2);

      try {
         this.f = this.getId();
      } catch (RemoteException var4) {
         ht.c(var4, "PolylineDelegateImp", "create");
         var4.printStackTrace();
      }

   }

   void a(List<LatLng> var1) throws RemoteException {
      boolean var2 = false;
      ArrayList var3 = new ArrayList();
      LatLngBounds$Builder var4 = LatLngBounds.builder();
      if (var1 != null) {
         LatLng var5 = null;
         Iterator var6 = var1.iterator();

         while(var6.hasNext()) {
            LatLng var7 = (LatLng)var6.next();
            IPoint var8;
            if (!this.u) {
               var8 = IPoint.obtain();
               this.e.g().a(var7.latitude, var7.longitude, var8);
               var3.add(var8);
               var4.include(var7);
            } else if (var5 != null) {
               if (Math.abs(var7.longitude - var5.longitude) < 0.01D) {
                  var8 = IPoint.obtain();
                  this.e.g().a(var5.latitude, var5.longitude, var8);
                  var3.add(var8);
                  var4.include(var5);
                  IPoint var9 = IPoint.obtain();
                  this.e.g().a(var7.latitude, var7.longitude, var9);
                  var3.add(var9);
                  var4.include(var7);
               } else {
                  this.a(var5, var7, var3, var4);
               }
            }

            var5 = var7;
            if (var7 != null) {
               if (!var2 && var7.longitude < -180.0D) {
                  var2 = true;
                  this.aa = true;
               }

               if (!this.aa && var7.longitude > 180.0D) {
                  this.aa = true;
               }
            }
         }
      }

      this.g = var3;
      this.E = 0;
      if (this.a == null) {
         this.a = new Rect();
      }

      fi.a(this.a);

      IPoint var11;
      for(Iterator var10 = this.g.iterator(); var10.hasNext(); fi.b(this.a, var11.x, var11.y)) {
         var11 = (IPoint)var10.next();
         if (var2) {
            var11.x += 268435456;
         }
      }

      this.a.sort();
      this.e.g().setRunLowFrame(false);
   }

   IPoint a(IPoint var1, IPoint var2, IPoint var3, double var4, int var6) {
      IPoint var7 = IPoint.obtain();
      double var8 = (double)(var2.x - var1.x);
      double var10 = (double)(var2.y - var1.y);
      double var12 = var10 * var10 / (var8 * var8) + 1.0D;
      var7.y = (int)((double)var6 * var4 / Math.sqrt(var12) + (double)var3.y);
      var7.x = (int)((double)(var3.y - var7.y) * var10 / var8 + (double)var3.x);
      return var7;
   }

   void a(List<IPoint> var1, List<IPoint> var2, double var3) {
      byte var5 = 3;
      if (var1.size() == var5) {
         float var6 = 1.0F;
         byte var7 = 10;

         for(int var8 = 0; var8 <= var7; var8 = (int)((float)var8 + var6)) {
            float var9 = (float)var8 / 10.0F;
            IPoint var10 = IPoint.obtain();
            double var11 = (1.0D - (double)var9) * (1.0D - (double)var9) * (double)((IPoint)var1.get(0)).x + (double)(2.0F * var9) * (1.0D - (double)var9) * (double)((IPoint)var1.get(1)).x * var3 + (double)(var9 * var9 * (float)((IPoint)var1.get(2)).x);
            double var13 = (1.0D - (double)var9) * (1.0D - (double)var9) * (double)((IPoint)var1.get(0)).y + (double)(2.0F * var9) * (1.0D - (double)var9) * (double)((IPoint)var1.get(1)).y * var3 + (double)(var9 * var9 * (float)((IPoint)var1.get(2)).y);
            double var15 = (1.0D - (double)var9) * (1.0D - (double)var9) + (double)(2.0F * var9) * (1.0D - (double)var9) * var3 + (double)(var9 * var9);
            double var17 = (1.0D - (double)var9) * (1.0D - (double)var9) + (double)(2.0F * var9) * (1.0D - (double)var9) * var3 + (double)(var9 * var9);
            var10.x = (int)(var11 / var15);
            var10.y = (int)(var13 / var17);
            var2.add(var10);
         }

      }
   }

   void a(LatLng var1, LatLng var2, List<IPoint> var3, LatLngBounds$Builder var4) {
      double var5 = Math.abs(var1.longitude - var2.longitude) * 3.141592653589793D / 180.0D;
      LatLng var7 = new LatLng((var2.latitude + var1.latitude) / 2.0D, (var2.longitude + var1.longitude) / 2.0D, false);
      var4.include(var1).include(var7).include(var2);
      int var8 = var7.latitude > 0.0D ? -1 : 1;
      IPoint var9 = IPoint.obtain();
      this.e.g().a(var1.latitude, var1.longitude, var9);
      IPoint var10 = IPoint.obtain();
      this.e.g().a(var2.latitude, var2.longitude, var10);
      IPoint var11 = IPoint.obtain();
      this.e.g().a(var7.latitude, var7.longitude, var11);
      double var12 = Math.cos(var5 * 0.5D);
      double var14 = Math.hypot((double)(var9.x - var10.x), (double)(var9.y - var10.y)) * 0.5D * Math.tan(var5 * 0.5D);
      IPoint var16 = this.a(var9, var10, var11, var14, var8);
      ArrayList var17 = new ArrayList();
      var17.add(var9);
      var17.add(var16);
      var17.add(var10);
      this.a(var17, var3, var12);
      var9.recycle();
      var16.recycle();
      var10.recycle();
   }

   public void remove() throws RemoteException {
      this.e.removeOverlay(this.getId());
      this.setVisible(false);
      this.e.g().setRunLowFrame(false);
   }

   public String getId() throws RemoteException {
      if (this.f == null) {
         this.f = this.e.a("Polyline");
      }

      return this.f;
   }

   public void setPoints(List<LatLng> var1) throws RemoteException {
      try {
         this.i = var1;
         Object var2 = this.r;
         synchronized(this.r) {
            this.a(var1);
         }

         this.x = true;
         this.e.g().setRunLowFrame(false);
         this.U.setPoints(var1);
      } catch (Throwable var5) {
         ht.c(var5, "PolylineDelegateImp", "setPoints");
         this.g.clear();
         var5.printStackTrace();
      }

   }

   public List<LatLng> getPoints() throws RemoteException {
      return this.i;
   }

   public void setWidth(float var1) throws RemoteException {
      this.G = var1;
      this.e.g().setRunLowFrame(false);
      this.U.width(var1);
   }

   public float getWidth() throws RemoteException {
      return this.G;
   }

   public void setColor(int var1) {
      if (this.B == 0 || this.B == 2) {
         this.D = var1;
         this.J = (float)Color.alpha(var1) / 255.0F;
         this.K = (float)Color.red(var1) / 255.0F;
         this.L = (float)Color.green(var1) / 255.0F;
         this.M = (float)Color.blue(var1) / 255.0F;
         if (this.t) {
            if (this.v) {
               this.B = 2;
            } else {
               this.B = 0;
            }
         }

         this.e.g().setRunLowFrame(false);
      }

      this.U.color(var1);
   }

   public int getColor() throws RemoteException {
      return this.D;
   }

   public void setZIndex(float var1) throws RemoteException {
      this.H = var1;
      this.e.e();
      this.e.g().setRunLowFrame(false);
      if (this.U != null) {
         this.U.zIndex(var1);
      }

   }

   public float getZIndex() throws RemoteException {
      return this.H;
   }

   public void setVisible(boolean var1) throws RemoteException {
      this.s = var1;
      this.e.g().setRunLowFrame(false);
      if (this.U != null) {
         this.U.visible(var1);
      }

   }

   public boolean isVisible() throws RemoteException {
      return this.s;
   }

   public boolean equalsRemote(IOverlay var1) throws RemoteException {
      return this.equals(var1) || var1.getId().equals(this.getId());
   }

   public int hashCodeRemote() throws RemoteException {
      return super.hashCode();
   }

   public boolean a() {
      if (this.aa) {
         return true;
      } else {
         Rectangle var1 = this.e.g().getMapConfig().getGeoRectangle();
         if (this.a != null && var1 != null) {
            return var1.isOverlap(this.a);
         } else {
            return true;
         }
      }
   }

   public boolean b() throws RemoteException {
      if (this.ab == -1.0F && this.ac == -1.0F && this.ad == -1.0F) {
         this.b(this.g);
      } else {
         this.b(this.af);
      }

      return true;
   }

   public boolean b(List<IPoint> var1) {
      Object var2 = this.r;
      synchronized(this.r) {
         FPointBounds$Builder var3 = new FPointBounds$Builder();
         this.h.clear();
         this.z = false;
         int var4 = 0;
         this.P = new float[3 * var1.size()];
         this.b = this.P.length;

         for(Iterator var5 = var1.iterator(); var5.hasNext(); ++var4) {
            IPoint var6 = (IPoint)var5.next();
            FPoint3 var7 = new FPoint3();
            this.e.g().a(var6.x, var6.y, (FPoint)var7);
            this.P[var4 * 3] = var7.x;
            this.P[var4 * 3 + 1] = var7.y;
            this.P[var4 * 3 + 2] = 0.0F;
            if (this.l != null) {
               List var8 = this.l;
               synchronized(this.l) {
                  if (this.l != null && this.l.size() > var4) {
                     if (this.ae <= 0) {
                        var7.setColorIndex(((Integer)this.l.get(var4)).intValue());
                     } else if (this.ae + var4 < this.l.size()) {
                        var7.setColorIndex(((Integer)this.l.get(this.ae + var4)).intValue());
                     }
                  } else if (this.m != null && this.m.size() > var4) {
                     if (this.ae <= 0) {
                        var7.setColorIndex(((Integer)this.m.get(var4)).intValue());
                     } else if (this.ae + var4 < this.m.size()) {
                        var7.setColorIndex(((Integer)this.m.get(this.ae + var4)).intValue());
                     }
                  }
               }
            }

            this.h.add(var7);
            var3.include(var7);
         }

         this.T = var3.build();
         if (!this.A) {
            this.p = fi.a(this.P);
         }

         this.E = var1.size();
         this.e();
         return true;
      }
   }

   private void e() {
      MapConfig var1 = this.e.g().getMapConfig();
      float var2 = var1.getMapPerPixelUnitLength();
      short var3 = 5000;
      if (this.E > var3) {
         byte var4 = 12;
         if (this.I <= (float)var4) {
            float var5 = this.G / 2.0F + this.I / 2.0F;
            var5 = var5 <= 200.0F ? var5 : 200.0F;
            this.O = var2 * var5;
         } else {
            this.O = var2 * 10.0F;
         }
      } else {
         this.O = var2 * 2.0F;
      }

   }

   private void d(List<FPoint> var1) throws RemoteException {
      this.c.clear();
      int var2 = var1.size();
      if (var2 >= 2) {
         FPoint var3 = (FPoint)var1.get(0);
         this.c.add(var3);

         int var4;
         for(var4 = 1; var4 < var2 - 1; ++var4) {
            FPoint var5 = (FPoint)var1.get(var4);
            if (var4 != 1 && !this.a(var3, var5)) {
               this.c.set(this.c.size() - 1, var5);
            } else {
               this.c.add(var5);
               var3 = var5;
            }
         }

         this.c.add(var1.get(var2 - 1));
         var4 = this.c.size() * 3;
         this.b = var4;
         if (this.P == null || this.P.length < this.b) {
            this.P = new float[var4];
         }

         if (this.B != 5 && this.B != 3 && this.B != 4) {
            int var14 = 0;

            for(Iterator var15 = this.c.iterator(); var15.hasNext(); ++var14) {
               FPoint var16 = (FPoint)var15.next();
               this.P[var14 * 3] = var16.x;
               this.P[var14 * 3 + 1] = var16.y;
               this.P[var14 * 3 + 2] = 0.0F;
            }
         } else {
            int[] var13 = new int[this.c.size()];
            ArrayList var6 = new ArrayList();
            int var7 = 0;
            boolean var8 = false;
            int var9 = 0;
            int var10 = 0;

            for(byte var11 = 3; var10 < var4 / var11; ++var10) {
               FPoint3 var12 = (FPoint3)this.c.get(var10);
               this.P[var10 * 3] = var12.x;
               this.P[var10 * 3 + 1] = var12.y;
               this.P[var10 * 3 + 2] = 0.0F;
               int var17 = var12.colorIndex;
               if (var10 == 0) {
                  var6.add(var17);
               } else {
                  if (var17 == var7) {
                     continue;
                  }

                  if (var17 == -1) {
                     var17 = var7;
                  }

                  var6.add(var17);
               }

               var13[var9] = var10;
               var7 = var17;
               ++var9;
            }

            this.Q = new int[var6.size()];
            System.arraycopy(var13, 0, this.Q, 0, this.Q.length);
            this.n = var6;
            this.o = var6;
         }

      }
   }

   private boolean a(FPoint var1, FPoint var2) {
      if (var1 instanceof FPoint3 && var2 instanceof FPoint3 && ((FPoint3)var1).colorIndex != ((FPoint3)var2).colorIndex) {
         return true;
      } else {
         return Math.abs(var2.x - var1.x) >= this.O || Math.abs(var2.y - var1.y) >= this.O;
      }
   }

   public void setCustomTexture(BitmapDescriptor var1) {
      long var2 = System.nanoTime();
      byte var4 = 16;
      if (var2 - this.d >= (long)var4) {
         this.d = var2;
         if (var1 != null) {
            synchronized(this) {
               if (!var1.equals(this.q)) {
                  this.t = false;
                  this.w = false;
                  this.B = 1;
                  this.q = var1;
                  this.e.g().setRunLowFrame(false);
                  if (this.U != null) {
                     this.U.setCustomTexture(var1);
                  }

               }
            }
         }
      }
   }

   public void a(MapConfig var1) throws RemoteException {
      if (this.Z == 0L) {
         this.Z = AMapNativePolyline.nativeCreate();
         if (this.Z != 0L && this.Y != null) {
            AMapNativePolyline.nativeSetGLShaderManager(this.Z, this.Y.a());
         }
      }

      List var2 = null;
      Object var3 = this.r;
      int var4;
      int var7;
      synchronized(this.r) {
         label188: {
            if (this.ab == -1.0F && this.ac == -1.0F && this.ad == -1.0F) {
               var2 = this.g;
            } else {
               var2 = this.af;
            }

            if (var2 != null && var2.size() != 0 && this.G > 0.0F) {
               if (this.e.g() == null) {
                  return;
               }

               var4 = var1.getSX();
               int var5 = var1.getSY();
               Rectangle var6 = var1.getGeoRectangle();
               var7 = var6.getBeyond180Mode();
               int var8 = this.h.size();
               int var9 = var2.size();
               int var10;
               if (var8 == var9) {
                  var10 = 0;

                  while(true) {
                     if (var10 >= var9) {
                        break label188;
                     }

                     IPoint var25 = (IPoint)var2.get(var10);
                     FPoint var26 = (FPoint)this.h.get(var10);
                     var26.x = (float)(var25.x - var4);
                     var26.y = (float)(var25.y - var5);
                     if (this.aa && (var7 < 0 || var1.getSX() < 134217728)) {
                        var26.x -= 2.68435456E8F;
                     }

                     ++var10;
                  }
               }

               this.h.clear();
               var10 = 0;
               int var11 = 0;

               while(true) {
                  if (var11 >= var9) {
                     break label188;
                  }

                  IPoint var12 = (IPoint)var2.get(var11);
                  FPoint3 var13 = new FPoint3();
                  if (this.l != null) {
                     List var14 = this.l;
                     synchronized(this.l) {
                        if (this.ae <= 0) {
                           if (this.l != null && this.l.size() > var10) {
                              var13.setColorIndex(((Integer)this.l.get(var10)).intValue());
                           }
                        } else if (this.l != null && this.l.size() > var10 + this.ae) {
                           var13.setColorIndex(((Integer)this.l.get(var10 + this.ae)).intValue());
                        }
                     }
                  }

                  var13.x = (float)(var12.x - var4);
                  var13.y = (float)(var12.y - var5);
                  if (this.aa && (var7 < 0 || var1.getSX() < 134217728)) {
                     var13.x -= 2.68435456E8F;
                  }

                  this.h.add(var13);
                  ++var10;
                  ++var11;
               }
            }

            return;
         }
      }

      if (this.x) {
         this.b();
         this.x = false;
      } else if (this.y) {
         var3 = this.r;
         synchronized(this.r) {
            var4 = this.h.size();
            List var23 = this.l;
            synchronized(this.l) {
               int var24 = this.l.size();

               for(var7 = 0; var7 < var4; ++var7) {
                  if (var24 > var7 && this.ae <= 0) {
                     ((FPoint3)this.h.get(var7)).setColorIndex(((Integer)this.l.get(var7)).intValue());
                  } else if (var24 > this.ae + var7 && this.ae > 0) {
                     ((FPoint3)this.h.get(var7)).setColorIndex(((Integer)this.l.get(this.ae + var7)).intValue());
                  }
               }
            }
         }
      }

      if (this.P != null && this.E > 0) {
         this.b(this.e.g().getMapConfig());
      }

      this.z = true;
   }

   private void b(MapConfig var1) {
      float var2 = this.e.g().c().getMapLenWithWin((int)this.G);
      switch(this.B) {
      case 0:
         this.f(var2, var1);
         break;
      case 1:
         if (this.A) {
            this.d(var2, var1);
         } else {
            this.f(var2, var1);
         }
         break;
      case 2:
         if (this.F == -1) {
            this.f(var2, var1);
         } else {
            this.e(var2, var1);
         }
         break;
      case 3:
         this.c(var2, var1);
         break;
      case 4:
         this.b(var2, var1);
         break;
      case 5:
         if (this.A) {
            this.a(var2, var1);
         } else {
            this.c(var2, var1);
         }
      }

   }

   private void a(float var1, MapConfig var2) {
      if (!this.w) {
         try {
            if (this.j != null) {
               this.R = new int[this.j.size()];
               int var3 = 0;
               boolean var4 = false;
               boolean var5 = VERSION.SDK_INT >= 12;
               this.f();

               for(Iterator var6 = this.j.iterator(); var6.hasNext(); ++var3) {
                  BitmapDescriptor var7 = (BitmapDescriptor)var6.next();
                  int var15 = this.a(var5, var7, false);
                  this.R[var3] = var15;
               }

               this.w = true;
            }
         } catch (Throwable var13) {
            ht.c(var13, "MarkerDelegateImp", "loadtexture");
            return;
         }
      }

      FPoint[] var14 = var2.getGeoRectangle().getClipMapRect();

      try {
         List var16 = this.h;
         Object var17;
         if (this.a(var14)) {
            var17 = this.r;
            synchronized(this.r) {
               var16 = fi.b(var14, this.h, false);
            }
         }

         if (var16.size() >= 2) {
            this.d(var16);
            var17 = null;
            List var19 = this.n;
            int[] var18;
            synchronized(this.n) {
               var18 = new int[this.n.size()];
               int var20 = 0;

               while(true) {
                  if (var20 >= var18.length) {
                     break;
                  }

                  int var8 = ((Integer)this.n.get(var20)).intValue();
                  if (var8 < 0) {
                     var8 = 0;
                  }

                  var18[var20] = this.R[var8];
                  ++var20;
               }
            }

            if (var18 != null & this.Q != null) {
               AMapNativeRenderer.nativeDrawLineByMultiTextureID(this.P, this.b, var1, var18, var18.length, this.Q, this.Q.length, 1.0F - this.N, this.e.h(), this.X.getTypeValue(), this.W.getTypeValue());
            }
         }
      } catch (Throwable var12) {
         var12.printStackTrace();
      }

   }

   private void f() {
      if (this.k != null) {
         Iterator var1 = this.k.iterator();

         while(var1.hasNext()) {
            ad var2 = (ad)var1.next();
            if (var2 != null && this.e != null) {
               this.e.a(var2);
            }
         }

         this.k.clear();
      }

   }

   private void a(ad var1) {
      if (var1 != null) {
         this.k.add(var1);
         var1.l();
      }

   }

   private int a(boolean var1, BitmapDescriptor var2, boolean var3) {
      if (var3) {
         this.f();
      }

      int var4 = 0;
      ad var5 = null;
      if (var1) {
         var5 = this.e.a(var2);
         if (var5 != null) {
            var4 = var5.k();
            this.a(var5);
            return var4;
         }
      }

      if (var5 == null) {
         var5 = new ad(var2, var4);
      }

      if (var4 == 0) {
         Bitmap var6 = var2.getBitmap();
         if (var6 != null && !var6.isRecycled()) {
            var4 = this.g();
            if (var1) {
               var5.a(var4);
               this.e.g().a(var5);
            }

            this.a(var5);
            fi.b(var4, var6, true);
         }
      }

      return var4;
   }

   private void b(float var1, MapConfig var2) {
      int[] var3 = new int[this.m.size()];

      for(int var4 = 0; var4 < this.m.size(); ++var4) {
         var3[var4] = ((Integer)this.m.get(var4)).intValue();
      }

      FPoint[] var11 = var2.getGeoRectangle().getClipMapRect();

      try {
         List var5 = this.h;
         if (this.a(var11)) {
            Object var6 = this.r;
            synchronized(this.r) {
               var5 = fi.b(var11, this.h, false);
            }
         }

         if (var5.size() >= 2) {
            this.d(var5);
            int[] var12 = new int[this.o.size()];

            for(int var7 = 0; var7 < var12.length; ++var7) {
               int var8 = ((Integer)this.o.get(var7)).intValue();
               var12[var7] = var8;
            }

            if (var12 != null & this.Q != null) {
               AMapNativeRenderer.nativeDrawGradientColorLine(this.P, this.b, var1, var12, var12.length, this.Q, this.Q.length, this.e.g().d(), this.e.h(), this.X.getTypeValue(), this.W.getTypeValue());
            }
         }
      } catch (Throwable var10) {
         var10.printStackTrace();
      }

   }

   private void c(float var1, MapConfig var2) {
      int[] var3 = new int[this.m.size()];

      for(int var4 = 0; var4 < this.m.size(); ++var4) {
         var3[var4] = ((Integer)this.m.get(var4)).intValue();
      }

      FPoint[] var11 = var2.getGeoRectangle().getClipMapRect();

      try {
         List var5 = this.h;
         if (this.a(var11)) {
            Object var6 = this.r;
            synchronized(this.r) {
               var5 = fi.b(var11, this.h, false);
            }
         }

         if (var5.size() >= 2) {
            this.d(var5);
            int[] var12 = new int[this.o.size()];

            for(int var7 = 0; var7 < var12.length; ++var7) {
               int var8 = ((Integer)this.o.get(var7)).intValue();
               var12[var7] = var8;
            }

            if (var12 != null & this.Q != null) {
               AMapNativeRenderer.nativeDrawLineByMultiColor(this.P, this.b, var1, this.e.g().d(), var12, var12.length, this.Q, this.Q.length, this.e.h(), this.X.getTypeValue(), this.W.getTypeValue());
            }
         }
      } catch (Throwable var10) {
         var10.printStackTrace();
      }

   }

   private void d(float var1, MapConfig var2) {
      if (!this.w) {
         synchronized(this) {
            try {
               if (this.q != null) {
                  byte var4 = 0;
                  boolean var5 = false;
                  boolean var6 = VERSION.SDK_INT >= 12;
                  int var15 = this.a(var6, this.q, true);
                  this.C = var15;
                  int var13 = var4 + 1;
                  this.w = true;
               }
            } catch (Throwable var11) {
               ht.c(var11, "MarkerDelegateImp", "loadtexture");
               return;
            }
         }
      }

      try {
         if (var2.getChangeRatio() == 1.0D && this.P != null) {
            ++this.V;
            if (this.V > 2) {
               AMapNativeRenderer.nativeDrawLineByTextureID(this.P, this.b, var1, this.C, this.K, this.L, this.M, this.J, 1.0F - this.N, false, false, false, this.e.h(), this.X.getTypeValue(), this.W.getTypeValue());
               return;
            }
         }

         this.V = 0;
         FPoint[] var3 = var2.getGeoRectangle().getClipMapRect();
         List var14 = this.h;
         if (this.a(var3)) {
            Object var16 = this.r;
            synchronized(this.r) {
               var14 = fi.a(var3, this.h, false);
            }
         }

         if (var14.size() >= 2) {
            this.d(var14);
            AMapNativeRenderer.nativeDrawLineByTextureID(this.P, this.b, var1, this.C, this.K, this.L, this.M, this.J, 1.0F - this.N, false, false, false, this.e.h(), this.X.getTypeValue(), this.W.getTypeValue());
         }
      } catch (Throwable var10) {
         ;
      }

   }

   private void e(float var1, MapConfig var2) {
      if (!this.w) {
         synchronized(this) {
            try {
               if (this.q != null) {
                  byte var4 = 0;
                  boolean var5 = false;
                  boolean var6 = VERSION.SDK_INT >= 12;
                  int var15 = this.a(var6, this.q, true);
                  this.C = var15;
                  int var13 = var4 + 1;
                  this.w = true;
               }
            } catch (Throwable var11) {
               ht.c(var11, "MarkerDelegateImp", "loadtexture");
               return;
            }
         }
      }

      try {
         List var3 = this.h;
         if (this.e.g() == null) {
            return;
         }

         if (var2.getChangeRatio() == 1.0D && this.P != null) {
            ++this.V;
            if (this.V > 2) {
               AMapNativeRenderer.nativeDrawLineByTextureID(this.P, this.b, var1, this.e.g().f(this.F), this.K, this.L, this.M, this.J, 0.0F, true, true, false, this.e.h(), this.X.getTypeValue(), this.W.getTypeValue());
               return;
            }
         }

         this.V = 0;
         FPoint[] var14 = var2.getGeoRectangle().getClipMapRect();
         if (this.a(var14)) {
            Object var16 = this.r;
            synchronized(this.r) {
               var3 = fi.a(var14, this.h, false);
            }
         }

         if (var3.size() >= 2) {
            this.d(var3);
            AMapNativeRenderer.nativeDrawLineByTextureID(this.P, this.b, var1, this.e.g().f(this.F), this.K, this.L, this.M, this.J, 0.0F, true, true, false, this.e.h(), this.X.getTypeValue(), this.W.getTypeValue());
         }
      } catch (Throwable var10) {
         ;
      }

   }

   private void f(float var1, MapConfig var2) {
      try {
         List var3 = this.h;
         if (this.e.g() == null) {
            return;
         }

         if (var2.getChangeRatio() == 1.0D && this.P != null) {
            ++this.V;
            if (this.V > 2) {
               if (this.Z != 0L && this.Y != null) {
                  AMapNativePolyline.nativeDrawLineByTextureID(this.Z, this.P, this.b, var1, this.e.g().d(), this.K, this.L, this.M, this.J, 0.0F, false, true, false, this.e.h(), this.X.getTypeValue(), this.W.getTypeValue());
               } else {
                  AMapNativeRenderer.nativeDrawLineByTextureID(this.P, this.b, var1, this.e.g().d(), this.K, this.L, this.M, this.J, 0.0F, false, true, false, this.e.h(), this.X.getTypeValue(), this.W.getTypeValue());
               }

               return;
            }
         }

         this.V = 0;
         FPoint[] var4 = var2.getGeoRectangle().getClipMapRect();
         if (this.a(var4)) {
            Object var5 = this.r;
            synchronized(this.r) {
               var3 = fi.a(var4, this.h, false);
            }
         }

         if (var3.size() >= 2) {
            this.d(var3);
            if (this.Z != 0L && this.Y != null) {
               AMapNativePolyline.nativeDrawLineByTextureID(this.Z, this.P, this.b, var1, this.e.g().d(), this.K, this.L, this.M, this.J, 0.0F, false, true, false, this.e.h(), this.X.getTypeValue(), this.W.getTypeValue());
            } else {
               AMapNativeRenderer.nativeDrawLineByTextureID(this.P, this.b, var1, this.e.g().d(), this.K, this.L, this.M, this.J, 0.0F, false, true, false, this.e.h(), this.X.getTypeValue(), this.W.getTypeValue());
            }
         }
      } catch (Throwable var8) {
         ;
      }

   }

   private int g() {
      int[] var1 = new int[]{0};
      GLES20.glGenTextures(1, var1, 0);
      return var1[0];
   }

   private boolean a(FPoint[] var1) {
      boolean var2 = false;
      this.I = this.e.g().g();
      byte var3 = 3;
      this.e();
      short var4 = 10000;
      if (this.g.size() > var4) {
         var3 = 7;
      }

      if (this.I <= (float)var3) {
         return false;
      } else {
         try {
            if (this.e.g() != null) {
               return !fi.a(this.T.northeast, var1) || !fi.a(this.T.southwest, var1);
            } else {
               return var2;
            }
         } catch (Throwable var6) {
            return false;
         }
      }
   }

   public void destroy() {
      try {
         this.remove();
         if (this.k != null && this.k.size() > 0) {
            int var2 = 0;

            while(true) {
               if (var2 >= this.k.size()) {
                  this.k.clear();
                  break;
               }

               ad var1 = (ad)this.k.get(var2);
               if (var1 != null) {
                  this.e.a(var1);
                  this.e.g().c(var1.o());
               }

               ++var2;
            }
         }

         if (this.P != null) {
            this.P = null;
         }

         if (this.p != null) {
            this.p.clear();
            this.p = null;
         }

         if (this.j != null && this.j.size() > 0) {
            Iterator var8 = this.j.iterator();

            while(var8.hasNext()) {
               BitmapDescriptor var10 = (BitmapDescriptor)var8.next();
               var10.recycle();
            }
         }

         synchronized(this) {
            if (this.q != null) {
               this.q.recycle();
            }
         }

         if (this.m != null) {
            this.m.clear();
            this.m = null;
         }

         if (this.l != null) {
            List var9 = this.l;
            synchronized(this.l) {
               this.l.clear();
               this.l = null;
            }
         }

         if (this.i != null) {
            this.i.clear();
            this.i = null;
         }

         this.U = null;
         if (this.Z != 0L) {
            AMapNativePolyline.nativeDestroy(this.Z);
         }
      } catch (Throwable var7) {
         ht.c(var7, "PolylineDelegateImp", "destroy");
         var7.printStackTrace();
         Log.d("destroy erro", "PolylineDelegateImp destroy");
      }

   }

   public boolean c() {
      return this.z;
   }

   public LatLng getNearestLatLng(LatLng var1) {
      if (var1 == null) {
         return null;
      } else if (this.i != null && this.i.size() != 0) {
         try {
            int var2 = 0;
            float var3 = 0.0F;
            float var4 = 0.0F;

            for(int var5 = 0; var5 < this.i.size(); ++var5) {
               if (var5 == 0) {
                  var3 = AMapUtils.calculateLineDistance(var1, (LatLng)this.i.get(var5));
               } else {
                  var4 = AMapUtils.calculateLineDistance(var1, (LatLng)this.i.get(var5));
                  if (var3 > var4) {
                     var3 = var4;
                     var2 = var5;
                  }
               }
            }

            return (LatLng)this.i.get(var2);
         } catch (Throwable var6) {
            ht.c(var6, "PolylineDelegateImp", "getNearestLatLng");
            var6.printStackTrace();
            return null;
         }
      } else {
         return null;
      }
   }

   public boolean a(LatLng var1) {
      float[] var2 = new float[this.P.length];
      System.arraycopy(this.P, 0, var2, 0, this.P.length);
      int var3 = var2.length / 3;
      byte var4 = 2;
      if (var3 < var4) {
         return false;
      } else {
         ArrayList var5 = null;

         try {
            var5 = this.h();
            if (var5 == null || var5.size() < 1) {
               return false;
            }
         } catch (Exception var16) {
            return false;
         }

         double var6 = (double)this.e.g().c().getMapLenWithWin((int)this.G / 4);
         double var8 = (double)this.e.g().c().getMapLenWithWin(5);
         FPoint var10 = this.b(var1);
         FPoint var11 = null;
         FPoint var12 = null;

         for(int var13 = 0; var13 < var5.size() - 1; ++var13) {
            if (var13 == 0) {
               var11 = (FPoint)var5.get(var13);
            } else {
               var11 = var12;
            }

            var12 = (FPoint)var5.get(var13 + 1);
            double var14 = this.a(var10, var11, var12);
            if (var8 + var6 - var14 >= 0.0D) {
               var5.clear();
               return true;
            }
         }

         var5.clear();
         return false;
      }
   }

   private ArrayList<FPoint> h() {
      ArrayList var1 = new ArrayList();

      for(int var2 = 0; var2 < this.P.length; ++var2) {
         float var3 = this.P[var2];
         ++var2;
         float var4 = this.P[var2];
         ++var2;
         FPoint var5 = FPoint.obtain(var3, var4);
         var1.add(var5);
      }

      return var1;
   }

   private double a(FPoint var1, FPoint var2, FPoint var3) {
      return this.a((double)var1.x, (double)var1.y, (double)var2.x, (double)var2.y, (double)var3.x, (double)var3.y);
   }

   private FPoint b(LatLng var1) {
      IPoint var2 = IPoint.obtain();
      this.e.g().a(var1.latitude, var1.longitude, var2);
      FPoint var3 = FPoint.obtain();
      this.e.g().a(var2.x, var2.y, var3);
      var2.recycle();
      return var3;
   }

   private double a(double var1, double var3, double var5, double var7, double var9, double var11) {
      double var13 = (var9 - var5) * (var1 - var5) + (var11 - var7) * (var3 - var7);
      if (var13 <= 0.0D) {
         return Math.sqrt((var1 - var5) * (var1 - var5) + (var3 - var7) * (var3 - var7));
      } else {
         double var15 = (var9 - var5) * (var9 - var5) + (var11 - var7) * (var11 - var7);
         if (var13 >= var15) {
            return Math.sqrt((var1 - var9) * (var1 - var9) + (var3 - var11) * (var3 - var11));
         } else {
            double var17 = var13 / var15;
            double var19 = var5 + (var9 - var5) * var17;
            double var21 = var7 + (var11 - var7) * var17;
            return Math.sqrt((var1 - var19) * (var1 - var19) + (var21 - var3) * (var21 - var3));
         }
      }
   }

   public void setTransparency(float var1) {
      this.N = (float)Math.min(1.0D, Math.max(0.0D, (double)var1));
      this.e.g().setRunLowFrame(false);
   }

   public void setCustomTextureList(List<BitmapDescriptor> var1) {
      this.e(var1);
      this.setCustemTextureIndex(this.U.getCustomTextureIndex());
      this.d();
   }

   private void e(List<BitmapDescriptor> var1) {
      if (var1 != null && var1.size() != 0) {
         if (var1.size() > 1) {
            this.t = false;
            this.B = 5;
            this.j = var1;
            this.e.g().setRunLowFrame(false);
         } else {
            this.setCustomTexture((BitmapDescriptor)var1.get(0));
         }

      }
   }

   public void setCustemTextureIndex(List<Integer> var1) {
      if (var1 != null && var1.size() != 0) {
         try {
            List var2 = this.l;
            synchronized(this.l) {
               this.l.clear();
               this.l.addAll(var1);
               this.n = this.f(var1);
               this.y = true;
            }
         } catch (Throwable var5) {
            var5.printStackTrace();
         }

      }
   }

   public void c(List<Integer> var1) {
      if (var1 != null && var1.size() != 0) {
         this.m = var1;
         if (var1.size() > 1) {
            this.t = false;
            this.o = this.f(var1);
            this.B = 3;
            this.e.g().setRunLowFrame(false);
         } else {
            this.setColor(((Integer)var1.get(0)).intValue());
         }

      }
   }

   public void b(boolean var1) {
      if (var1 && this.m != null && this.m.size() > 1) {
         this.B = 4;
         this.e.g().setRunLowFrame(false);
      }

   }

   private List<Integer> f(List<Integer> var1) {
      int[] var2 = new int[var1.size()];
      ArrayList var3 = new ArrayList();
      int var4 = 0;
      boolean var5 = false;
      int var6 = 0;

      for(int var7 = 0; var7 < var1.size(); ++var7) {
         int var8 = ((Integer)var1.get(var7)).intValue();
         if (var7 == 0) {
            var3.add(var8);
         } else {
            if (var8 == var4) {
               continue;
            }

            var3.add(var8);
         }

         var2[var6] = var7;
         var4 = var8;
         ++var6;
      }

      this.Q = new int[var3.size()];
      System.arraycopy(var2, 0, this.Q, 0, this.Q.length);
      return var3;
   }

   public void d() {
      this.w = false;
      this.C = 0;
      if (this.R != null) {
         Arrays.fill(this.R, 0);
      }

   }

   public void setAboveMaskLayer(boolean var1) {
      this.S = var1;
   }

   public boolean isAboveMaskLayer() {
      return this.S;
   }

   public void setOptions(PolylineOptions var1) {
      if (var1 != null) {
         this.U = var1;

         try {
            this.setColor(var1.getColor());
            this.setGeodesic(var1.isGeodesic());
            this.setDottedLine(var1.isDottedLine());
            this.a(var1.getDottedLineType());
            this.setAboveMaskLayer(var1.isAboveMaskLayer());
            this.setVisible(var1.isVisible());
            this.setWidth(var1.getWidth());
            this.setZIndex(var1.getZIndex());
            this.a(var1.isUseTexture());
            this.setTransparency(var1.getTransparency());
            this.a(var1.getLineCapType());
            this.a(var1.getLineJoinType());
            if (var1.getColorValues() != null) {
               this.c(var1.getColorValues());
               this.b(var1.isUseGradient());
            }

            if (var1.getCustomTexture() != null) {
               this.setCustomTexture(var1.getCustomTexture());
               this.d();
            }

            if (var1.getCustomTextureList() != null) {
               this.e(var1.getCustomTextureList());
               this.setCustemTextureIndex(var1.getCustomTextureIndex());
               this.d();
            }

            this.setPoints(var1.getPoints());
            this.setShownRatio(var1.getShownRatio());
            this.setShowRange(var1.getShownRangeBegin(), var1.getShownRangeEnd());
         } catch (RemoteException var3) {
            ht.c(var3, "PolylineDelegateImp", "setOptions");
            var3.printStackTrace();
         }

      }
   }

   public PolylineOptions getOptions() {
      return this.U;
   }

   public void a(PolylineOptions$LineJoinType var1) {
      this.W = var1;
   }

   public void a(PolylineOptions$LineCapType var1) {
      this.X = var1;
   }

   public void a(dw var1) {
      this.Y = var1;
   }

   public void setShownRatio(float var1) {
      this.ab = var1;
      Object var2 = this.r;
      synchronized(this.r) {
         int var3 = this.g.size();
         if (var3 < 2) {
            return;
         }

         float var4 = this.ab;
         if (var4 < 0.0F) {
            var4 = 0.0F;
         } else if (var4 >= (float)var3) {
            var4 = (float)(var3 - 1);
         }

         int var5;
         if (this.u) {
            var5 = this.i.size();
            if (var5 < 2) {
               return;
            }

            var4 = var4 / (float)(var5 - 1) * (float)(var3 - 1);
         }

         this.af.clear();
         var5 = (int)Math.floor((double)var4);
         IPoint var6 = null;
         int var7 = 0;

         while(var7 < var3) {
            IPoint var8 = (IPoint)this.g.get(var7);
            if (var7 <= var5) {
               this.af.add(var8);
               var6 = var8;
               ++var7;
            } else {
               float var9 = var4 - (float)var5;
               if (var1 != 0.0F && var6 != null) {
                  IPoint var10 = new IPoint();
                  var10.x = (int)((float)var6.x + (float)(var8.x - var6.x) * var9);
                  var10.y = (int)((float)var6.y + (float)(var8.y - var6.y) * var9);
                  this.af.add(var10);
               }
               break;
            }
         }
      }

      this.x = true;
      this.e.g().setRunLowFrame(false);
      this.U.setShownRatio(var1);
   }

   public float getShownRatio() {
      return this.ab;
   }

   public void setShowRange(float var1, float var2) {
      this.ac = var1;
      this.ad = var2;
      Object var3 = this.r;
      synchronized(this.r) {
         int var4 = this.g.size();
         if (var4 < 2) {
            return;
         }

         if (var1 > var2) {
            this.af.clear();
            Log.d("mapcore", "setShownRange return begin < end");
            return;
         }

         float var5 = var1;
         if (var1 >= 0.0F && !Float.isNaN(var1)) {
            if (var1 >= (float)var4) {
               var5 = (float)(var4 - 1);
            }
         } else {
            var5 = 0.0F;
         }

         float var6 = var2;
         if (var2 < 0.0F) {
            var6 = 0.0F;
         } else if (var2 >= (float)var4 || Float.isNaN(var2)) {
            var6 = (float)(var4 - 1);
         }

         int var7;
         if (this.u) {
            var7 = this.i.size();
            if (var7 < 2) {
               Log.d("mapcore", "setShownRatio return m_polylineOptions.m_latLngPoints.size() < MIN_POLYLINE_COUNT");
               return;
            }

            var5 = var5 / (float)(var7 - 1) * (float)(var4 - 1);
            var6 = var6 / (float)(var7 - 1) * (float)(var4 - 1);
         }

         this.af.clear();
         var7 = (int)Math.floor((double)var5);
         int var8 = (int)Math.floor((double)var6);
         double var9 = (double)(var5 - (float)var7);
         double var11 = (double)(var6 - (float)var8);
         IPoint var13 = null;
         IPoint var14 = null;
         int var15 = var7;

         while(true) {
            label106: {
               if (var15 < var4) {
                  IPoint var16 = (IPoint)this.g.get(var15);
                  if (var7 >= var15) {
                     var13 = var16;
                     var14 = var16;
                     break label106;
                  }

                  IPoint var17;
                  if (var7 < var15 && var7 == var15 - 1) {
                     var17 = new IPoint();
                     var17.x = (int)((double)var13.x + (double)(var16.x - var13.x) * var9);
                     var17.y = (int)((double)var13.y + (double)(var16.y - var13.y) * var9);
                     this.af.add(var17);
                     if (var8 != var7) {
                        this.af.add(var16);
                        var14 = var16;
                        break label106;
                     }

                     IPoint var18 = new IPoint();
                     var18.x = (int)((double)var13.x + (double)(var16.x - var13.x) * var11);
                     var18.y = (int)((double)var13.y + (double)(var16.y - var13.y) * var11);
                     this.af.add(var18);
                  } else {
                     if (var7 < var15 && var8 >= var15) {
                        this.af.add(var16);
                        var14 = var16;
                        break label106;
                     }

                     if (var8 >= var15) {
                        break label106;
                     }

                     var17 = new IPoint();
                     var17.x = (int)((double)var14.x + (double)(var16.x - var14.x) * var11);
                     var17.y = (int)((double)var14.y + (double)(var16.y - var14.y) * var11);
                     this.af.add(var17);
                  }
               }

               if (var7 >= 0) {
                  this.ae = var7;
               }
               break;
            }

            ++var15;
         }
      }

      this.x = true;
      this.e.g().setRunLowFrame(false);
      this.U.setShownRange(this.ac, this.ad);
   }
}
