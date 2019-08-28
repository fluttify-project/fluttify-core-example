package com.amap.api.mapcore.util;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.Bitmap.Config;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.os.RemoteException;
import android.os.Build.VERSION;
import android.util.Log;
import android.view.animation.AnimationUtils;
import com.amap.api.maps.AMapException;
import com.amap.api.maps.model.BitmapDescriptor;
import com.amap.api.maps.model.BitmapDescriptorFactory;
import com.amap.api.maps.model.LatLng;
import com.amap.api.maps.model.MarkerOptions;
import com.amap.api.maps.model.animation.Animation;
import com.amap.api.maps.model.animation.Animation$AnimationListener;
import com.autonavi.ae.gmap.GLMapState;
import com.autonavi.amap.mapcore.DPoint;
import com.autonavi.amap.mapcore.FPoint;
import com.autonavi.amap.mapcore.IPoint;
import com.autonavi.amap.mapcore.Rectangle;
import com.autonavi.amap.mapcore.animation.GLAnimation;
import com.autonavi.amap.mapcore.animation.GLAnimationSet;
import com.autonavi.amap.mapcore.animation.GLTransformation;
import com.autonavi.amap.mapcore.animation.GLTranslateAnimation;
import com.autonavi.amap.mapcore.interfaces.IAnimation;
import com.autonavi.amap.mapcore.interfaces.IMarkerAction;
import com.autonavi.amap.mapcore.interfaces.IOverlayImage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class dm extends m implements dd, IAnimation, IMarkerAction {
   private static int i = 0;
   private boolean j;
   private float k;
   private boolean l = false;
   private boolean m = false;
   private boolean n = false;
   private float o = 0.0F;
   private float p = 0.0F;
   private boolean q = false;
   private int r = 0;
   private int s = 0;
   private int t = 0;
   private int u = 0;
   private int v;
   private int w;
   private FPoint x = FPoint.obtain();
   private float[] y = new float[]{-1.0F, -1.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, -1.0F, 1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 1.0F, 1.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F};
   private float z = 0.0F;
   private float A = 1.0F;
   private float B = 1.0F;
   private float C = 1.0F;
   private MarkerOptions D;
   private boolean E = false;
   private boolean F = true;
   private int G = 5;
   private boolean H = true;
   private boolean I = true;
   private boolean J = false;
   private boolean K = false;
   private boolean L = false;
   private boolean M = true;
   private FPoint N = FPoint.obtain();
   private Point O = new Point();
   private float P;
   private float Q;
   private int R = 0;
   private int S = 0;
   private ad T;
   private ad[] U = null;
   float[] a;
   float[] b;
   Rect c = new Rect(0, 0, 0, 0);
   private boolean V = false;
   private String W;
   private LatLng X;
   private LatLng Y;
   private String Z;
   private String aa;
   private float ab = 0.5F;
   private float ac = 1.0F;
   private boolean ad = false;
   private boolean ae = true;
   private aa af;
   private Object ag;
   private boolean ah = false;
   private List<BitmapDescriptor> ai = new CopyOnWriteArrayList();
   private boolean aj = false;
   private boolean ak = false;
   GLTransformation d = null;
   GLTransformation e = null;
   private boolean al = true;
   private int am = 0;
   private int an = 20;
   private boolean ao = false;
   private int ap;
   private int aq;
   private long ar = 0L;
   GLAnimation f;
   GLAnimation g;
   Object h = new Object();
   private float as = Float.MAX_VALUE;
   private float at = Float.MIN_VALUE;
   private float au = Float.MIN_VALUE;
   private float av = Float.MAX_VALUE;

   private static String a(String var0) {
      ++i;
      return var0 + i;
   }

   public void setRotateAngle(float var1) {
      this.D.rotateAngle(var1);
      this.p = var1;
      this.o = (-var1 % 360.0F + 360.0F) % 360.0F;
      this.n = true;
      this.s();
   }

   public void destroy(boolean var1) {
      try {
         this.V = true;
         if (var1) {
            this.remove();
         }

         if (this.af != null) {
            ad var2 = null;

            for(int var3 = 0; this.U != null && var3 < this.U.length; ++var3) {
               var2 = this.U[var3];
               if (var2 != null) {
                  this.af.a(var2);
                  this.af.c().c(var2.o());
               }
            }
         }

         for(int var5 = 0; this.ai != null && var5 < this.ai.size(); ++var5) {
            ((BitmapDescriptor)this.ai.get(var5)).recycle();
         }

         this.X = null;
         this.ag = null;
         this.U = null;
      } catch (Throwable var4) {
         ht.c(var4, "MarkerDelegateImp", "destroy");
         var4.printStackTrace();
         Log.d("destroy erro", "MarkerDelegateImp destroy");
      }

   }

   synchronized void m() {
      if (this.ai != null) {
         this.ai.clear();
      }

   }

   public synchronized void a(ArrayList<BitmapDescriptor> var1) {
      this.m();
      if (var1 != null) {
         Iterator var2 = var1.iterator();

         while(var2.hasNext()) {
            BitmapDescriptor var3 = (BitmapDescriptor)var2.next();
            if (var3 != null) {
               this.ai.add(var3);
            }
         }
      }

      if (this.ai.size() > 0) {
         this.R = ((BitmapDescriptor)this.ai.get(0)).getWidth();
         this.S = ((BitmapDescriptor)this.ai.get(0)).getHeight();
      } else {
         this.ai.add(BitmapDescriptorFactory.defaultMarker());
         this.R = ((BitmapDescriptor)this.ai.get(0)).getWidth();
         this.S = ((BitmapDescriptor)this.ai.get(0)).getHeight();
      }

   }

   public dm(MarkerOptions var1, aa var2) {
      this.af = var2;
      this.setMarkerOptions(var1);
   }

   public int n() {
      try {
         return this.R;
      } catch (Throwable var2) {
         return 0;
      }
   }

   public int o() {
      try {
         return this.S;
      } catch (Throwable var2) {
         return 0;
      }
   }

   public boolean p() {
      return this.af.c(this);
   }

   public Rect i() {
      if (this.y == null) {
         this.c.set(0, 0, 0, 0);
         return this.c;
      } else {
         try {
            GLMapState var1 = this.af.c().c();
            if (var1 == null) {
               return new Rect(0, 0, 0, 0);
            } else {
               int var2 = this.n();
               int var3 = this.o();
               FPoint var4 = FPoint.obtain();
               if (this.ao) {
                  var4.x = (float)this.ap;
                  var4.y = (float)this.aq;
               } else {
                  var1.p20ToScreenPoint(this.v, this.w, var4);
               }

               Matrix.setIdentityM(this.a, 0);
               Matrix.rotateM(this.a, 0, -this.o, 0.0F, 0.0F, 1.0F);
               if (this.q) {
                  Matrix.rotateM(this.a, 0, this.af.c().getMapConfig().getSC(), 1.0F, 0.0F, 0.0F);
                  Matrix.rotateM(this.a, 0, this.af.c().getMapConfig().getSR(), 0.0F, 0.0F, 1.0F);
               }

               float[] var5 = new float[4];
               this.b[0] = (float)(-var2) * this.ab;
               this.b[1] = (float)var3 * this.ac;
               this.b[2] = 0.0F;
               this.b[3] = 1.0F;
               Matrix.multiplyMV(var5, 0, this.a, 0, this.b, 0);
               this.c.set((int)(var4.x + var5[0]), (int)(var4.y - var5[1]), (int)(var4.x + var5[0]), (int)(var4.y - var5[1]));
               this.b[0] = (float)var2 * (1.0F - this.ab);
               this.b[1] = (float)var3 * this.ac;
               this.b[2] = 0.0F;
               this.b[3] = 1.0F;
               Matrix.multiplyMV(var5, 0, this.a, 0, this.b, 0);
               this.c.union((int)(var4.x + var5[0]), (int)(var4.y - var5[1]));
               this.b[0] = (float)var2 * (1.0F - this.ab);
               this.b[1] = (float)(-var3) * (1.0F - this.ac);
               this.b[2] = 0.0F;
               this.b[3] = 1.0F;
               Matrix.multiplyMV(var5, 0, this.a, 0, this.b, 0);
               this.c.union((int)(var4.x + var5[0]), (int)(var4.y - var5[1]));
               this.b[0] = (float)(-var2) * this.ab;
               this.b[1] = (float)(-var3) * (1.0F - this.ac);
               this.b[2] = 0.0F;
               this.b[3] = 1.0F;
               Matrix.multiplyMV(var5, 0, this.a, 0, this.b, 0);
               this.c.union((int)(var4.x + var5[0]), (int)(var4.y - var5[1]));
               this.t = (int)((float)this.c.centerX() - var4.x);
               this.u = (int)((float)this.c.top - var4.y);
               var4.recycle();
               return this.c;
            }
         } catch (Throwable var6) {
            ht.c(var6, "MarkerDelegateImp", "getRect");
            var6.printStackTrace();
            return new Rect(0, 0, 0, 0);
         }
      }
   }

   public boolean remove() {
      this.s();
      this.ae = false;
      boolean var1 = false;
      if (this.af != null) {
         var1 = this.af.a((dg)this);
      }

      return var1;
   }

   private void s() {
      if (this.af.c() != null) {
         this.af.c().setRunLowFrame(false);
      }

   }

   public LatLng getPosition() {
      if (this.ao && this.x != null) {
         DPoint var1 = DPoint.obtain();
         IPoint var2 = IPoint.obtain();
         this.q();
         if (this.af.c() == null) {
            return this.X;
         } else {
            this.af.c().a(this.x.x, this.x.y, var2);
            GLMapState.geo2LonLat(var2.x, var2.y, var1);
            LatLng var3 = new LatLng(var1.y, var1.x);
            var2.recycle();
            var1.recycle();
            return var3;
         }
      } else {
         return this.X;
      }
   }

   public String getId() {
      if (this.W == null) {
         this.W = a("Marker");
      }

      return this.W;
   }

   public void setPosition(LatLng var1) {
      if (var1 == null) {
         ht.c(new AMapException("非法坐标值 latlng is null"), "setPosition", "Marker");
      } else {
         this.X = var1;
         IPoint var2 = IPoint.obtain();
         if (this.aj) {
            try {
               double[] var3 = lk.a(var1.longitude, var1.latitude);
               this.Y = new LatLng(var3[1], var3[0]);
               GLMapState.lonlat2Geo(var3[0], var3[1], var2);
            } catch (Throwable var4) {
               this.Y = var1;
            }
         } else {
            GLMapState.lonlat2Geo(var1.longitude, var1.latitude, var2);
         }

         this.v = var2.x;
         this.w = var2.y;
         this.ao = false;
         this.q();
         this.s();
         this.n = true;
         var2.recycle();
      }
   }

   public void setTitle(String var1) {
      this.Z = var1;
      this.s();
      this.D.title(var1);
      es.a().a(this.X, this.Z, this.aa);
   }

   public String getTitle() {
      return this.Z;
   }

   public void setSnippet(String var1) {
      this.aa = var1;
      this.s();
      this.D.snippet(var1);
   }

   public String getSnippet() {
      return this.aa;
   }

   public void setDraggable(boolean var1) {
      this.ad = var1;
      this.D.draggable(var1);
      this.s();
   }

   public synchronized void setIcons(ArrayList<BitmapDescriptor> var1) {
      try {
         if (var1 == null || this.ai == null) {
            return;
         }

         this.j = false;
         this.a(var1);
         this.ak = false;
         this.l = false;
         this.J = false;
         this.s();
         this.n = true;
      } catch (Throwable var3) {
         ht.c(var3, "MarkerDelegateImp", "setIcons");
         var3.printStackTrace();
      }

   }

   public synchronized ArrayList<BitmapDescriptor> getIcons() {
      if (this.ai != null && this.ai.size() > 0) {
         ArrayList var1 = new ArrayList();
         Iterator var2 = this.ai.iterator();

         while(var2.hasNext()) {
            BitmapDescriptor var3 = (BitmapDescriptor)var2.next();
            var1.add(var3);
         }

         return var1;
      } else {
         return null;
      }
   }

   public void setIcon(BitmapDescriptor var1) {
      try {
         if (var1 == null || this.ai == null) {
            return;
         }

         synchronized(this) {
            this.j = false;
            this.ai.clear();
            this.ai.add(var1);
            this.J = false;
            this.ak = false;
            this.l = false;
            this.s();
            this.n = true;
            this.R = var1.getWidth();
            this.S = var1.getHeight();
         }
      } catch (Throwable var5) {
         ht.c(var5, "MarkerDelegateImp", "setIcon");
         var5.printStackTrace();
      }

   }

   private void t() {
      try {
         byte var1 = 0;
         int var3;
         if (this.T.a()) {
            this.y[var1 * 9 + 4] = this.T.d();
            this.y[var1 * 9 + 5] = this.T.c();
            var3 = var1 + 1;
            this.y[var3 * 9 + 4] = this.T.b();
            this.y[var3 * 9 + 5] = this.T.c();
            ++var3;
            this.y[var3 * 9 + 4] = this.T.b();
            this.y[var3 * 9 + 5] = this.T.e();
            ++var3;
            this.y[var3 * 9 + 4] = this.T.d();
            this.y[var3 * 9 + 5] = this.T.e();
         } else {
            this.y[var1 * 9 + 4] = this.T.g();
            this.y[var1 * 9 + 5] = this.T.i();
            var3 = var1 + 1;
            this.y[var3 * 9 + 4] = this.T.h();
            this.y[var3 * 9 + 5] = this.T.i();
            ++var3;
            this.y[var3 * 9 + 4] = this.T.h();
            this.y[var3 * 9 + 5] = this.T.f();
            ++var3;
            this.y[var3 * 9 + 4] = this.T.g();
            this.y[var3 * 9 + 5] = this.T.f();
         }
      } catch (Throwable var2) {
         var2.printStackTrace();
      }

   }

   public boolean isDraggable() {
      return this.ad;
   }

   public boolean isRemoved() {
      try {
         return !this.af.c(this);
      } catch (Throwable var2) {
         var2.printStackTrace();
         return false;
      }
   }

   public void showInfoWindow() {
      if (this.ae) {
         if (this.p()) {
            if (this.isInfoWindowEnable()) {
               this.af.a((m)this);
               this.s();
            }
         }
      }
   }

   public void hideInfoWindow() {
      if (this.isInfoWindowShown()) {
         this.af.b((dg)this);
         this.s();
         this.m = false;
      }

      this.n = false;
   }

   public void a(boolean var1) {
      this.m = var1;
      this.n = true;
   }

   public boolean isInfoWindowShown() {
      return this.m;
   }

   public void setVisible(boolean var1) {
      if (this.ae != var1) {
         this.D.visible(var1);
         this.ae = var1;
         if (!var1) {
            this.L = false;
            if (this.isInfoWindowShown()) {
               this.af.b((dg)this);
            }
         }

         this.s();
      }
   }

   public boolean isVisible() {
      return this.ae;
   }

   public void setAnchor(float var1, float var2) {
      if (this.ab != var1 || this.ac != var2) {
         this.D.anchor(var1, var2);
         this.ab = var1;
         this.ac = var2;
         this.n = true;
         this.s();
      }
   }

   public float getAnchorU() {
      return this.ab;
   }

   public float getAnchorV() {
      return this.ac;
   }

   public boolean equalsRemote(IOverlayImage var1) throws RemoteException {
      return this.equals(var1) || var1.getId().equals(this.getId());
   }

   public int hashCodeRemote() {
      return super.hashCode();
   }

   public boolean q() {
      try {
         if (this.af != null && this.af.c() != null && this.af.c().c() != null) {
            if (this.x == null) {
               this.x = FPoint.obtain();
            }

            if (this.ao) {
               IPoint var1 = IPoint.obtain();
               this.af.c().a(this.ap, this.aq, var1);
               this.v = var1.x;
               this.w = var1.y;
               var1.recycle();
               this.af.c().a(this.v, this.w, this.x);
            } else {
               this.af.c().a(this.v, this.w, this.x);
            }

            return true;
         } else {
            return false;
         }
      } catch (Throwable var2) {
         var2.printStackTrace();
         return false;
      }
   }

   private void a(u var1, float var2, int var3, int var4) throws RemoteException {
      int var5 = (int)(this.A * (float)var3);
      int var6 = (int)(this.B * (float)var4);
      float var7 = (float)var5 * var2;
      float var8 = (float)var6 * var2;
      float var9 = this.x.x;
      float var10 = this.x.y;
      float var11 = var1.getMapConfig().getSC();
      float var12 = this.o;
      int var14;
      if (this.ai != null && this.ai.size() > 0) {
         int var13;
         if (this.j) {
            var13 = this.U.length;
            var14 = (int)(this.o / this.k);
            if (var14 > var13) {
               var14 = 0;
            } else {
               var12 = this.o % this.k;
            }

            var14 = (var13 + var14) % var13;
            this.T = this.U[var14];
         } else {
            ++this.am;
            var13 = this.an * this.ai.size();
            if (this.am >= var13) {
               this.am = 0;
            }

            if (this.an == 0) {
               this.an = 1;
            }

            var14 = this.am / this.an;
            this.T = this.U[var14];
            if (!this.al) {
               this.s();
            }
         }
      }

      if (this.q) {
         var12 -= var1.getMapConfig().getSR();
         var11 = 0.0F;
      }

      float var15 = this.C;
      if (var15 < 0.0F) {
         var15 = 0.0F;
      }

      if (var15 > 1.0F) {
         var15 = 1.0F;
      }

      byte var16 = 0;
      this.y[var16 * 9 + 0] = var9 - var7 * this.ab;
      this.y[var16 * 9 + 1] = var10 + var8 * (1.0F - this.ac);
      this.y[var16 * 9 + 2] = var9;
      this.y[var16 * 9 + 3] = var10;
      this.y[var16 * 9 + 6] = var12;
      this.y[var16 * 9 + 7] = var11;
      this.y[var16 * 9 + 8] = var15;
      var14 = var16 + 1;
      this.y[var14 * 9 + 0] = var9 + var7 * (1.0F - this.ab);
      this.y[var14 * 9 + 1] = var10 + var8 * (1.0F - this.ac);
      this.y[var14 * 9 + 2] = var9;
      this.y[var14 * 9 + 3] = var10;
      this.y[var14 * 9 + 6] = var12;
      this.y[var14 * 9 + 7] = var11;
      this.y[var14 * 9 + 8] = var15;
      ++var14;
      this.y[var14 * 9 + 0] = var9 + var7 * (1.0F - this.ab);
      this.y[var14 * 9 + 1] = var10 - var8 * this.ac;
      this.y[var14 * 9 + 2] = var9;
      this.y[var14 * 9 + 3] = var10;
      this.y[var14 * 9 + 6] = var12;
      this.y[var14 * 9 + 7] = var11;
      this.y[var14 * 9 + 8] = var15;
      ++var14;
      this.y[var14 * 9 + 0] = var9 - var7 * this.ab;
      this.y[var14 * 9 + 1] = var10 - var8 * this.ac;
      this.y[var14 * 9 + 2] = var9;
      this.y[var14 * 9 + 3] = var10;
      this.y[var14 * 9 + 6] = var12;
      this.y[var14 * 9 + 7] = var11;
      this.y[var14 * 9 + 8] = var15;
   }

   public void a(u var1, float[] var2, int var3, float var4) {
      boolean var5 = this.V || this.X == null && !this.ao || this.ai == null;
      if (!var5) {
         try {
            if (!this.l) {
               this.ar = System.currentTimeMillis();
               this.l = true;
            }

            if (this.ao && this.I) {
               IPoint var6 = IPoint.obtain();
               var1.a(this.ap, this.aq, var6);
               this.v = var6.x;
               this.w = var6.y;
               var6.recycle();
            }

            this.x.x = (float)(this.v - var1.getMapConfig().getSX());
            if (this.x.x > 1.34217728E8F) {
               this.x.x -= 2.68435456E8F;
            } else if (this.x.x < -1.34217728E8F) {
               this.x.x += 2.68435456E8F;
            }

            this.x.y = (float)(this.w - var1.getMapConfig().getSY());
            int var10 = this.n();
            int var7 = this.o();
            this.u();
            this.a(var1, var4, var10, var7);
            if (!this.J || !this.al) {
               this.t();
               this.J = true;
            }

            this.a(var2, var3);
            if (this.n && this.isInfoWindowShown()) {
               this.af.c().j();
               short var8 = 1000;
               if (System.currentTimeMillis() - this.ar > (long)var8) {
                  this.n = false;
               }
            }
         } catch (Throwable var9) {
            ht.c(var9, "MarkerDelegateImp", "drawMarker");
         }

      }
   }

   private void a(float[] var1, int var2) {
      if (this.U != null && this.U.length > 0) {
         System.arraycopy(this.y, 0, var1, var2, this.y.length);
      }

   }

   public void a(u var1) {
      if (!this.ak) {
         synchronized(this) {
            try {
               int var4;
               if (this.U != null) {
                  ad[] var3 = this.U;
                  var4 = var3.length;

                  for(int var5 = 0; var5 < var4; ++var5) {
                     ad var6 = var3[var5];
                     if (var6 != null) {
                        this.af.a(var6);
                     }
                  }
               }

               this.U = null;
               if (this.ai != null) {
                  this.U = new ad[this.ai.size()];
                  int var14 = 0;
                  boolean var15 = false;
                  boolean var16 = VERSION.SDK_INT >= 12;

                  for(Iterator var17 = this.ai.iterator(); var17.hasNext(); ++var14) {
                     BitmapDescriptor var7 = (BitmapDescriptor)var17.next();
                     ad var8 = null;
                     var4 = 0;
                     if (var16) {
                        var8 = var1.a(var7);
                        if (var8 != null) {
                           var4 = var8.k();
                        }
                     }

                     if (var8 == null) {
                        var8 = new ad(var7, var4);
                     }

                     if (var4 == 0) {
                        Bitmap var9 = var7.getBitmap();
                        if (var9 != null && !var9.isRecycled()) {
                           this.R = var9.getWidth();
                           this.S = var9.getHeight();
                           var4 = this.af.c().e();
                           if (var4 == 0) {
                              var4 = this.v();
                              var8.a(var4);
                              if (var16) {
                                 var1.a(var8);
                              }

                              fi.b(var4, var9, false);
                           } else {
                              if (this.af.a(var9, var8)) {
                                 Bitmap var10 = this.a(var9);
                                 fi.a(var4, var10, (int)(var8.g() * 512.0F), (int)(var8.f() * 1024.0F));
                                 var8.a(var4);
                              } else {
                                 var4 = this.v();
                                 fi.b(var4, var9, false);
                                 var8.a(var4);
                              }

                              if (var16) {
                                 var1.a(var8);
                              }
                           }
                        }
                     }

                     var8.l();
                     this.U[var14] = var8;
                  }

                  if (this.ai.size() == 1) {
                     this.al = true;
                  } else {
                     this.al = false;
                  }

                  this.J = false;
                  this.ak = true;
               }
            } catch (Throwable var12) {
               ht.c(var12, "MarkerDelegateImp", "loadtexture");
               return;
            }

            this.q();
         }
      }

   }

   private void u() {
      if (!this.M && this.f != null && !this.f.hasEnded()) {
         this.s();
         Object var8 = this.h;
         synchronized(this.h) {
            if (this.e == null) {
               this.e = new GLTransformation();
               this.e.scaleX = (double)this.A;
               this.e.scaleY = (double)this.B;
               this.e.rotate = (double)this.o;
               this.e.x = (double)this.v;
               this.e.y = (double)this.w;
               this.e.alpha = (double)this.C;
            }

            if (this.d == null) {
               this.d = new GLTransformation();
            }

            this.d.clear();
            this.f.getTransformation(AnimationUtils.currentAnimationTimeMillis(), this.d);
            if (this.d != null) {
               if (!Double.isNaN(this.d.scaleX) && !Double.isNaN(this.d.scaleY)) {
                  this.A = (float)this.d.scaleX;
                  this.B = (float)this.d.scaleY;
               }

               if (!Double.isNaN(this.d.rotate)) {
                  this.setRotateAngle((float)this.d.rotate);
               }

               if (!Double.isNaN(this.d.x) && !Double.isNaN(this.d.y)) {
                  double var2 = this.d.x;
                  double var4 = this.d.y;
                  this.a(var2, var4);
               }

               if (!Double.isNaN(this.d.alpha)) {
                  this.C = (float)this.d.alpha;
               }
            }
         }

         this.n = true;
         this.al = false;
      } else {
         if (this.f != null && (this.d != null || this.e != null)) {
            if (this.d != null && !Double.isNaN(this.d.scaleX) && !Double.isNaN(this.d.scaleY)) {
               this.A = (float)this.d.scaleX;
               this.B = (float)this.d.scaleY;
            } else if (this.e != null && !Double.isNaN(this.e.scaleX) && !Double.isNaN(this.e.scaleY) && ((double)this.A != this.e.scaleX || (double)this.B != this.e.scaleY)) {
               this.A = (float)this.e.scaleX;
               this.B = (float)this.e.scaleY;
            }

            if (this.d != null && !Double.isNaN(this.d.rotate)) {
               this.setRotateAngle((float)this.d.rotate);
            } else if (this.e != null && !Double.isNaN(this.e.rotate) && (double)this.o != this.e.rotate) {
               this.setRotateAngle((float)this.e.rotate);
            }

            double var1;
            double var3;
            if (this.d != null && !Double.isNaN(this.d.x) && !Double.isNaN(this.d.y)) {
               var1 = this.d.x;
               var3 = this.d.y;
               this.a(var1, var3);
            } else if (this.e != null && !Double.isNaN(this.e.x) && !Double.isNaN(this.e.y) && ((double)this.v != this.e.x || (double)this.w != this.e.y)) {
               var1 = this.d.x;
               var3 = this.d.y;
               this.a(var1, var3);
            }

            if (this.d != null && !Double.isNaN(this.d.alpha)) {
               this.C = (float)this.d.alpha;
            } else if (this.e != null && !Double.isNaN(this.e.alpha) && (double)this.C != this.e.alpha) {
               this.C = (float)this.e.alpha;
            }
         }

         this.M = true;
         this.d = null;
         this.e = null;
         if (this.ai != null && this.ai.size() == 1) {
            this.al = true;
         }
      }

   }

   private void a(double var1, double var3) {
      if (this.ao) {
         IPoint var5 = IPoint.obtain();
         this.af.c().a((int)var1, (int)var3, var5);
         this.a(var5.x, var5.y);
         var5.recycle();
         this.ao = true;
      } else {
         this.a((int)var1, (int)var3);
      }

   }

   private int v() {
      int[] var1 = new int[]{0};
      GLES20.glGenTextures(1, var1, 0);
      return var1[0];
   }

   public boolean j() {
      return this.al;
   }

   public void setPeriod(int var1) {
      if (var1 <= 1) {
         this.an = 1;
      } else {
         this.an = var1;
      }

   }

   public void setObject(Object var1) {
      this.ag = var1;
   }

   public Object getObject() {
      return this.ag;
   }

   public void setPerspective(boolean var1) {
      this.ah = var1;
   }

   public boolean isPerspective() {
      return this.ah;
   }

   public int k() {
      try {
         return this.ai != null && this.ai.size() > 0 ? this.T.k() : 0;
      } catch (Throwable var2) {
         return 0;
      }
   }

   public int getPeriod() {
      return this.an;
   }

   public LatLng b() {
      try {
         if (this.ao) {
            DPoint var1 = DPoint.obtain();
            this.af.c().b(this.ap, this.aq, var1);
            LatLng var2 = new LatLng(var1.y, var1.y);
            var1.recycle();
            return var2;
         } else {
            return this.aj ? this.Y : this.X;
         }
      } catch (Throwable var3) {
         ht.c(var3, "MarkerDelegateImp", "getRealPosition");
         return null;
      }
   }

   public void set2Top() {
      this.af.a((dd)this);
   }

   public void setFlat(boolean var1) throws RemoteException {
      this.q = var1;
      this.s();
      this.D.setFlat(var1);
   }

   public boolean isFlat() {
      return this.q;
   }

   public float getRotateAngle() {
      this.s();
      return this.p;
   }

   public int c() {
      return this.r;
   }

   public int d() {
      return this.s;
   }

   public void setPositionByPixels(int var1, int var2) {
      this.ap = var1;
      this.aq = var2;
      this.ao = true;
      this.q();
      this.s();
      this.n = true;
   }

   public int e() {
      return this.t;
   }

   public int f() {
      return this.u;
   }

   public FPoint a() {
      return this.x;
   }

   public boolean g() {
      return this.ao;
   }

   public void setZIndex(float var1) {
      this.z = var1;
      this.D.zIndex(var1);
      if (this.L) {
         this.L = false;
         this.af.a();
      }

      this.af.f();
   }

   public float getZIndex() {
      return this.z;
   }

   public boolean h() {
      if (this.ao) {
         return true;
      } else {
         try {
            if (this.x != null) {
               if (!this.M) {
                  return true;
               }

               this.O.x = this.v;
               this.O.y = this.w;
               Rectangle var1 = this.af.c().getMapConfig().getGeoRectangle();
               if (var1.contains(this.v, this.w)) {
                  return true;
               }

               this.w();
               int var2 = (int)(this.A * this.P);
               int var3 = (int)(this.B * this.Q);
               int var4 = (int)((float)this.v - (float)var2 * this.ab);
               int var5 = (int)((float)this.w - (float)var3 * this.ac);
               if (var1.contains(var4, var5)) {
                  return true;
               }

               if (var1.isOverlap(var4, var5, var2, var3)) {
                  return true;
               }
            }
         } catch (Throwable var6) {
            ht.c(var6, "MarkerDelegateImp", "checkInBounds");
         }

         return false;
      }
   }

   public void setGeoPoint(IPoint var1) {
      this.ao = false;
      this.a(var1.x, var1.y);
   }

   private void a(int var1, int var2) {
      this.v = var1;
      this.w = var2;
      DPoint var3 = DPoint.obtain();
      GLMapState.geo2LonLat(this.v, this.w, var3);
      this.X = new LatLng(var3.y, var3.x, false);
      if (this.af != null && this.af.c() != null) {
         this.x.x = (float)(this.v - this.af.c().getMapConfig().getSX());
         this.x.y = (float)(this.w - this.af.c().getMapConfig().getSY());
      }

      var3.recycle();
      this.s();
   }

   public IPoint getGeoPoint() {
      IPoint var1 = IPoint.obtain();
      if (this.ao) {
         this.af.c().a(this.ap, this.aq, var1);
         return var1;
      } else {
         var1.set(this.v, this.w);
         return var1;
      }
   }

   public void setAnimation(Animation var1) {
      IAnimation var2 = this.r();
      if (var2 != null) {
         var2.setAnimation(var1 == null ? null : var1.glAnimation);
      }

   }

   public void setAnimation(GLAnimation var1) {
      if (var1 != null) {
         this.g = var1;
      }
   }

   public boolean startAnimation() {
      if (this.g != null) {
         Object var1 = this.h;
         synchronized(this.h) {
            if (this.g instanceof GLAnimationSet) {
               GLAnimationSet var2 = (GLAnimationSet)this.g;
               Iterator var3 = var2.getAnimations().iterator();

               while(var3.hasNext()) {
                  GLAnimation var4 = (GLAnimation)var3.next();
                  this.a(var4);
                  var4.setDuration(var2.getDuration());
               }
            } else {
               this.a(this.g);
            }

            this.M = false;
            this.f = this.g;
            this.f.start();
         }

         this.s();
      }

      return false;
   }

   private void a(GLAnimation var1) {
      if (var1 instanceof GLTranslateAnimation) {
         if (this.ao) {
            this.X = this.getPosition();
            this.setPosition(this.X);
            this.ao = true;
         }

         IPoint var2;
         if (this.ao) {
            ((GLTranslateAnimation)var1).mFromXDelta = (double)this.ap;
            ((GLTranslateAnimation)var1).mFromYDelta = (double)this.aq;
            var2 = IPoint.obtain();
            this.af.c().b(((GLTranslateAnimation)var1).mToYDelta, ((GLTranslateAnimation)var1).mToXDelta, var2);
            ((GLTranslateAnimation)var1).mToXDelta = (double)var2.x;
            ((GLTranslateAnimation)var1).mToYDelta = (double)var2.y;
            var2.recycle();
         } else {
            ((GLTranslateAnimation)var1).mFromXDelta = (double)this.v;
            ((GLTranslateAnimation)var1).mFromYDelta = (double)this.w;
            var2 = IPoint.obtain();
            GLMapState.lonlat2Geo(((GLTranslateAnimation)var1).mToXDelta, ((GLTranslateAnimation)var1).mToYDelta, var2);
            ((GLTranslateAnimation)var1).mToXDelta = (double)var2.x;
            ((GLTranslateAnimation)var1).mToYDelta = (double)var2.y;
            var2.recycle();
         }
      }

   }

   public void setAnimationListener(Animation$AnimationListener var1) {
      if (this.g != null) {
         this.g.setAnimationListener(var1);
      }

   }

   public IAnimation r() {
      return this;
   }

   public IMarkerAction getIMarkerAction() {
      return this;
   }

   public float getAlpha() {
      return this.C;
   }

   public void setAlpha(float var1) {
      this.C = var1;
      this.D.alpha(var1);
   }

   public int getDisplayLevel() {
      return this.G;
   }

   public MarkerOptions getOptions() {
      return this.D;
   }

   public void setMarkerOptions(MarkerOptions var1) {
      if (var1 != null) {
         this.D = var1;
         this.X = this.D.getPosition();
         IPoint var2 = IPoint.obtain();
         this.aj = this.D.isGps();
         if (this.D.getPosition() != null) {
            if (this.aj) {
               try {
                  double[] var3 = lk.a(this.D.getPosition().longitude, this.D.getPosition().latitude);
                  this.Y = new LatLng(var3[1], var3[0]);
                  GLMapState.lonlat2Geo(var3[0], var3[1], var2);
               } catch (Throwable var4) {
                  ht.c(var4, "MarkerDelegateImp", "create");
                  this.Y = this.D.getPosition();
               }
            } else {
               GLMapState.lonlat2Geo(this.X.longitude, this.X.latitude, var2);
            }
         }

         this.v = var2.x;
         this.w = var2.y;
         this.ab = this.D.getAnchorU();
         this.ac = this.D.getAnchorV();
         this.r = this.D.getInfoWindowOffsetX();
         this.s = this.D.getInfoWindowOffsetY();
         this.an = this.D.getPeriod();
         this.z = this.D.getZIndex();
         this.K = this.D.isBelowMaskLayer();
         this.q();
         this.a(this.D.getIcons());
         this.j = this.D.isRotatingMode();
         this.k = this.D.getAngleOffset();
         this.ae = this.D.isVisible();
         this.aa = this.D.getSnippet();
         this.Z = this.D.getTitle();
         this.ad = this.D.isDraggable();
         this.W = this.getId();
         this.ah = this.D.isPerspective();
         this.q = this.D.isFlat();
         this.K = this.D.isBelowMaskLayer();
         this.C = this.D.getAlpha();
         this.setRotateAngle(this.D.getRotateAngle());
         this.G = this.D.getDisplayLevel();
         this.E = this.D.isInfoWindowAutoOverturn();
         this.F = this.D.isInfoWindowEnable();
         this.a = new float[16];
         this.b = new float[4];
         var2.recycle();
         es.a().a(this.X, this.Z, this.aa);
      }
   }

   public boolean isClickable() {
      return this.H;
   }

   public boolean isInfoWindowAutoOverturn() {
      return this.E;
   }

   public boolean isInfoWindowEnable() {
      return this.F;
   }

   public void b(boolean var1) {
      this.L = var1;
   }

   public boolean l() {
      return this.L;
   }

   public void setInfoWindowEnable(boolean var1) {
      this.F = var1;
      if (!var1) {
         this.hideInfoWindow();
      }

      this.D.infoWindowEnable(var1);
   }

   public void setAutoOverturnInfoWindow(boolean var1) {
      this.E = var1;
      this.D.autoOverturnInfoWindow(var1);
   }

   public void setClickable(boolean var1) {
      this.H = var1;
   }

   public void setDisplayLevel(int var1) {
      this.G = var1;
      this.D.displayLevel(var1);
   }

   public void setFixingPointEnable(boolean var1) {
      this.I = var1;
      if (!var1) {
         boolean var2 = false;
         if (this.ao) {
            var2 = true;
         }

         this.X = this.getPosition();
         this.setPosition(this.X);
         if (var2) {
            this.ao = true;
         }
      } else if (this.ao && this.X != null) {
         FPoint var3 = FPoint.obtain();
         this.af.c().c().p20ToScreenPoint(this.v, this.w, var3);
         this.ap = (int)var3.x;
         this.aq = (int)var3.y;
         var3.recycle();
      }

   }

   public void setPositionNotUpdate(LatLng var1) {
      this.setPosition(var1);
   }

   public void setRotateAngleNotUpdate(float var1) {
   }

   public void setBelowMaskLayer(boolean var1) {
      this.K = var1;
   }

   private void w() {
      if (this.af.c() != null && this.af.c().getMapConfig() != null) {
         this.P = this.af.c().getMapConfig().getMapPerPixelUnitLength() * (float)this.n();
         this.Q = this.af.c().getMapConfig().getMapPerPixelUnitLength() * (float)this.o();
      }

   }

   private Bitmap a(Bitmap var1) {
      if (var1 == null) {
         return var1;
      } else {
         Config var2 = var1.getConfig();
         if (var2 != Config.ARGB_8888) {
            Bitmap var3 = var1.copy(Config.ARGB_8888, true);
            return var3;
         } else {
            return var1;
         }
      }
   }
}
