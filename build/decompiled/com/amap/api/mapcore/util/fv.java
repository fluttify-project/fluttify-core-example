package com.amap.api.mapcore.util;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ListView;
import com.amap.api.maps.MapsInitializer;
import com.amap.api.maps.model.BasePointOverlay;
import com.amap.api.maps.model.CameraPosition;
import com.amap.api.maps.model.GL3DModel;
import com.amap.api.maps.model.Marker;
import com.autonavi.ae.gmap.GLMapState;
import com.autonavi.ae.gmap.listener.AMapWidgetListener;
import com.autonavi.amap.mapcore.FPoint;
import com.autonavi.amap.mapcore.IPoint;
import com.autonavi.amap.mapcore.MapConfig;

public class fv extends ViewGroup implements ax {
   private u c;
   private Context d;
   private fy e;
   private fu f;
   private fs g;
   private fx h;
   private fr i;
   private ft j;
   private fz k;
   private View l;
   private m m;
   private Drawable n = null;
   private boolean o = true;
   private View p;
   private boolean q;
   fw a;
   private boolean r = true;
   ay b;

   public fv(Context var1, u var2) {
      super(var1);

      try {
         this.c = var2;
         this.d = var1;
         this.a = new fw();
         this.i = new fr(var1);
         LayoutParams var3 = new LayoutParams(-1, -1);
         int var4 = 0;
         if (this.c.m() != null) {
            this.addView(this.c.m(), var4, var3);
            ++var4;
         }

         this.addView(this.i, var4, var3);
         if (!this.r) {
            this.a(var1);
         }
      } catch (Throwable var5) {
         var5.printStackTrace();
      }

   }

   private void a(Context var1) {
      this.e = new fy(var1, this.c);
      this.h = new fx(var1, this.c);
      this.j = new ft(var1);
      this.k = new fz(var1, this.c);
      this.f = new fu(var1, this.c);
      this.g = new fs(var1, this.c);
      LayoutParams var2 = new LayoutParams(-1, -1);
      this.addView(this.e, var2);
      this.addView(this.h, var2);
      LayoutParams var3 = new LayoutParams(-2, -2);
      this.addView(this.j, var3);
      fv$a var4 = new fv$a(-2, -2, new FPoint(0.0F, 0.0F), 0, 0, 83);
      this.addView(this.k, var4);
      fv$a var5 = new fv$a(-2, -2, FPoint.obtain(0.0F, 0.0F), 0, 0, 83);
      this.addView(this.f, var5);
      fv$a var6 = new fv$a(-2, -2, FPoint.obtain(0.0F, 0.0F), 0, 0, 51);
      this.addView(this.g, var6);
      this.g.setVisibility(8);
      fv$1 var7 = new fv$1(this);
      this.c.a((AMapWidgetListener)var7);

      try {
         if (!this.c.h().isMyLocationButtonEnabled()) {
            this.f.setVisibility(8);
         }
      } catch (Throwable var9) {
         ht.c(var9, "AMapDelegateImpGLSurfaceView", "locationView gone");
         var9.printStackTrace();
      }

   }

   public void a(Boolean var1) {
      if (this.j == null) {
         this.a.a(this, var1);
      } else {
         if (this.j != null) {
            if (!var1.booleanValue()) {
               return;
            }

            if (this.c.n()) {
               this.j.a(true);
            }
         }

      }
   }

   public void b(Boolean var1) {
      if (this.k == null) {
         this.a.a(this, var1);
      } else {
         this.k.a(var1.booleanValue());
      }
   }

   public void c(Boolean var1) {
      if (this.f == null) {
         this.a.a(this, var1);
      } else {
         if (var1.booleanValue()) {
            this.f.setVisibility(0);
         } else {
            this.f.setVisibility(8);
         }

      }
   }

   public void d(Boolean var1) {
      if (this.g == null) {
         this.a.a(this, var1);
      } else {
         this.g.a(var1.booleanValue());
      }
   }

   public void e(Boolean var1) {
      if (this.h == null) {
         this.a.a(this, var1);
      } else {
         this.h.a(var1.booleanValue());
      }
   }

   public void f(Boolean var1) {
      if (this.e == null) {
         this.a.a(this, var1);
      } else {
         this.e.setVisibility(var1.booleanValue() ? 0 : 8);
      }
   }

   public void a(String var1, Boolean var2, Integer var3) {
      if (this.e == null) {
         this.a.a(this, var1, var2, var3);
      } else if (!TextUtils.isEmpty(var1)) {
         this.e.a(var1, var3.intValue());
         this.e.b(var2.booleanValue());
      }
   }

   public void a(Float var1) {
      if (this.k == null) {
         this.a.a(this, var1);
      } else {
         if (this.k != null) {
            this.k.a(var1.floatValue());
         }

      }
   }

   public void a(Integer var1) {
      if (this.k == null) {
         this.a.a(this, var1);
      } else {
         if (this.k != null) {
            this.k.a(var1.intValue());
         }

      }
   }

   public void b(Integer var1) {
      if (this.e == null) {
         this.a.a(this, var1);
      } else {
         if (this.e != null) {
            this.e.a(var1.intValue());
            this.e.postInvalidate();
            this.o();
         }

      }
   }

   private void o() {
      if (this.h == null) {
         this.a.a(this);
      } else {
         if (this.h != null && this.h.getVisibility() == 0) {
            this.h.postInvalidate();
         }

      }
   }

   public void c(Integer var1) {
      if (this.e == null) {
         this.a.a(this, var1);
      } else {
         if (this.e != null) {
            this.e.b(var1.intValue());
            this.o();
         }

      }
   }

   public void d(Integer var1) {
      if (this.e == null) {
         this.a.a(this, var1);
      } else {
         if (this.e != null) {
            this.e.c(var1.intValue());
            this.o();
         }

      }
   }

   public float a(int var1) {
      if (this.e != null) {
         this.o();
         return this.e.d(var1);
      } else {
         return 0.0F;
      }
   }

   public void a(Integer var1, Float var2) {
      if (this.e != null) {
         this.a.a(this, var1, var2);
      } else {
         if (this.e != null) {
            this.e.a(var1.intValue(), var2.floatValue());
            this.o();
         }

      }
   }

   public void a(ay var1) {
      this.b = var1;
   }

   public Point c() {
      return this.e == null ? null : this.e.c();
   }

   public void g(Boolean var1) {
      if (this.e == null) {
         this.a.a(this, var1);
      } else {
         if (this.e != null && var1.booleanValue()) {
            this.e.a(true);
         } else if (this.e != null) {
            this.e.a(false);
         }

      }
   }

   public boolean d() {
      return this.e != null ? this.e.e() : false;
   }

   public void e() {
      if (this.e == null) {
         this.a.a(this);
      } else {
         if (this.e != null) {
            this.e.d();
         }

      }
   }

   public fr f() {
      return this.i;
   }

   public ft g() {
      return this.j;
   }

   public fu h() {
      return this.f;
   }

   public fy i() {
      return this.e;
   }

   public void a(CameraPosition var1) {
      if (this.e == null) {
         this.a.a(this, var1);
      } else if (this.c.h().isLogoEnable()) {
         if (MapsInitializer.isLoadWorldGridMap() && var1.zoom >= 7.0F && !fb.a(var1.target.latitude, var1.target.longitude)) {
            this.e.setVisibility(8);
         } else if (this.c.o() == -1) {
            this.e.setVisibility(0);
         }

      }
   }

   public void j() {
      if (this.k != null) {
         this.k.a();
      }

      if (this.h != null) {
         this.h.a();
      }

      if (this.e != null) {
         this.e.a();
      }

      if (this.f != null) {
         this.f.a();
      }

      if (this.g != null) {
         this.g.a();
      }

      if (this.j != null) {
         this.j.b();
      }

   }

   public void onLayout(boolean var1, int var2, int var3, int var4, int var5) {
      try {
         int var6 = this.getChildCount();

         for(int var7 = 0; var7 < var6; ++var7) {
            View var8 = this.getChildAt(var7);
            if (var8 != null) {
               if (var8.getLayoutParams() instanceof fv$a) {
                  fv$a var9 = (fv$a)var8.getLayoutParams();
                  this.a(var8, var9);
               } else {
                  this.a(var8, var8.getLayoutParams());
               }
            }
         }

         if (this.e != null) {
            this.e.d();
         }
      } catch (Throwable var10) {
         var10.printStackTrace();
      }

   }

   private void a(View var1, LayoutParams var2) {
      int[] var3 = new int[2];
      this.a(var1, var2.width, var2.height, var3);
      if (var1 instanceof ft) {
         this.a(var1, var3[0], var3[1], 20, this.c.l().y - 80 - var3[1], 51);
      } else {
         this.a(var1, var3[0], var3[1], 0, 0, 51);
      }

   }

   private void a(View var1, fv$a var2) {
      int[] var3 = new int[2];
      this.a(var1, var2.width, var2.height, var3);
      if (var1 instanceof fz) {
         this.a(var1, var3[0], var3[1], this.getWidth() - var3[0], this.getHeight(), var2.d);
      } else if (var1 instanceof fu) {
         this.a(var1, var3[0], var3[1], this.getWidth() - var3[0], var3[1], var2.d);
      } else if (var1 instanceof fs) {
         this.a(var1, var3[0], var3[1], 0, 0, var2.d);
      } else if (var2.a != null) {
         IPoint var4 = IPoint.obtain();
         MapConfig var5 = this.c.getMapConfig();
         GLMapState var6 = this.c.c();
         if (var5 != null && var6 != null) {
            FPoint var7 = FPoint.obtain();
            var6.p20ToScreenPoint(var5.getSX() + (int)var2.a.x, var5.getSY() + (int)var2.a.y, var7);
            var4.x = (int)var7.x;
            var4.y = (int)var7.y;
            var7.recycle();
         }

         var4.x += var2.b;
         var4.y += var2.c;
         this.a(var1, var3[0], var3[1], var4.x, var4.y, var2.d);
         var4.recycle();
      }

   }

   public void a(m var1) {
      try {
         if (var1 != null) {
            if (this.b == null || !this.b.a() || var1.getTitle() != null || var1.getSnippet() != null) {
               if (var1.isInfoWindowEnable()) {
                  if (this.m != null && !this.m.getId().equals(var1.getId())) {
                     this.a_();
                  }

                  if (this.b != null) {
                     this.m = var1;
                     var1.a(true);
                     this.q = true;
                  }

               }
            }
         }
      } catch (Throwable var3) {
         ;
      }
   }

   private View b(m var1) throws RemoteException {
      View var2 = null;
      if (var1 instanceof dm) {
         Marker var3 = new Marker((dm)var1);

         try {
            if (this.n == null) {
               this.n = ex.a(this.d, "infowindow_bg.9.png");
            }
         } catch (Throwable var6) {
            ht.c(var6, "MapOverlayViewGroup", "showInfoWindow decodeDrawableFromAsset");
            var6.printStackTrace();
         }

         try {
            if (this.q) {
               var2 = this.b.a((BasePointOverlay)var3);
               if (var2 == null) {
                  var2 = this.b.b((BasePointOverlay)var3);
               }

               this.p = var2;
               this.q = false;
            } else {
               var2 = this.p;
            }

            if (var2 == null) {
               if (!this.b.a()) {
                  return null;
               }

               var2 = this.b.a((BasePointOverlay)var3);
            }

            if (var2 != null && var2.getBackground() == null) {
               var2.setBackground(this.n);
            }
         } catch (Throwable var5) {
            ht.c(var5, "MapOverlayViewGroup", "getInfoWindow or getInfoContents");
            var5.printStackTrace();
         }
      } else {
         try {
            if (this.n == null) {
               this.n = ex.a(this.d, "infowindow_bg.9.png");
            }
         } catch (Throwable var7) {
            ht.c(var7, "MapOverlayViewGroup", "showInfoWindow decodeDrawableFromAsset");
            var7.printStackTrace();
         }

         try {
            GL3DModel var9 = new GL3DModel((cx)var1);
            if (this.q) {
               var2 = this.b.a((BasePointOverlay)var9);
               if (var2 == null) {
                  var2 = this.b.b((BasePointOverlay)var9);
               }

               this.p = var2;
               this.q = false;
            } else {
               var2 = this.p;
            }

            if (var2 == null) {
               if (!this.b.a()) {
                  return null;
               }

               var2 = this.b.a((BasePointOverlay)var9);
            }

            if (var2.getBackground() == null) {
               var2.setBackground(this.n);
            }

            return var2;
         } catch (Throwable var8) {
            ht.c(var8, "MapOverlayViewGroup", "getInfoWindow or getInfoContents");
            var8.printStackTrace();
         }
      }

      return var2;
   }

   public void b() {
      try {
         if (this.m != null && this.m.h()) {
            if (!this.o) {
               return;
            }

            int var1 = this.m.e() + this.m.c();
            int var2 = this.m.f() + this.m.d() + 2;
            View var3 = this.b(this.m);
            if (var3 == null) {
               return;
            }

            this.a(var3, var1, var2);
            if (this.l != null) {
               fv$a var4 = (fv$a)this.l.getLayoutParams();
               if (var4 != null) {
                  var4.a = this.m.a();
                  var4.b = var1;
                  var4.c = var2;
               }

               this.onLayout(false, 0, 0, 0, 0);
               if (this.b.a()) {
                  this.b.a(this.m.getTitle(), this.m.getSnippet());
               }

               if (this.l.getVisibility() == 8) {
                  this.l.setVisibility(0);
               }
            }
         } else if (this.l != null && this.l.getVisibility() == 0) {
            this.l.setVisibility(8);
         }
      } catch (Throwable var5) {
         ht.c(var5, "MapOverlayViewGroup", "redrawInfoWindow");
         var5.printStackTrace();
      }

   }

   private void a(View var1, int var2, int var3) throws RemoteException {
      if (var1 != null) {
         if (this.l != null) {
            if (var1 == this.l) {
               return;
            }

            this.l.clearFocus();
            this.removeView(this.l);
         }

         this.l = var1;
         LayoutParams var4 = null;
         var4 = this.l.getLayoutParams();
         this.l.setDrawingCacheEnabled(true);
         this.l.setDrawingCacheQuality(0);
         Rect var5 = this.m.i();
         int var6 = -2;
         int var7 = -2;
         if (var4 != null) {
            var6 = var4.width;
            var7 = var4.height;
         }

         fv$a var8 = new fv$a(var6, var7, this.m.a(), var2, var3, 81);
         this.addView(this.l, var8);
      }
   }

   public void a_() {
      if (this.c != null && this.c.getMainHandler() != null) {
         this.c.getMainHandler().post(new fv$2(this));
         if (this.m != null) {
            this.m.a(false);
         }

         this.m = null;
      }

   }

   private void a(View var1, int var2, int var3, int[] var4) {
      if (var1 instanceof ListView) {
         View var5 = (View)var1.getParent();
         if (var5 != null) {
            var4[0] = var5.getWidth();
            var4[1] = var5.getHeight();
         }
      }

      if (var2 <= 0 || var3 <= 0) {
         var1.measure(0, 0);
      }

      if (var2 == -2) {
         var4[0] = var1.getMeasuredWidth();
      } else if (var2 == -1) {
         var4[0] = this.getMeasuredWidth();
      } else {
         var4[0] = var2;
      }

      if (var3 == -2) {
         var4[1] = var1.getMeasuredHeight();
      } else if (var3 == -1) {
         var4[1] = this.getMeasuredHeight();
      } else {
         var4[1] = var3;
      }

   }

   private void a(View var1, int var2, int var3, int var4, int var5, int var6) {
      boolean var7 = true;
      boolean var8 = true;
      int var9 = var6 & 7;
      int var10 = var6 & 112;
      if (var9 == 5) {
         var4 -= var2;
      } else if (var9 == 1) {
         var4 -= var2 / 2;
      }

      if (var10 == 80) {
         var5 -= var3;
      } else if (var10 == 17) {
         var5 -= var3 / 2;
      } else if (var10 == 16) {
         var5 = var5 / 2 - var3 / 2;
      }

      var1.layout(var4, var5, var4 + var2, var5 + var3);
      if (var1 instanceof v) {
         this.c.b(var2, var3);
      }

   }

   public void k() {
      this.a_();
      fi.a(this.n);
      this.j();
      this.removeAllViews();
      this.p = null;
   }

   public boolean a(MotionEvent var1) {
      if (this.l != null && this.m != null) {
         Rect var2 = new Rect(this.l.getLeft(), this.l.getTop(), this.l.getRight(), this.l.getBottom());
         return fi.a(var2, (int)var1.getX(), (int)var1.getY());
      } else {
         return false;
      }
   }

   public void a(Canvas var1) {
      if (this.l != null && this.m != null) {
         Bitmap var2 = this.l.getDrawingCache(true);
         if (var2 != null) {
            int var3 = this.l.getLeft();
            int var4 = this.l.getTop();
            var1.drawBitmap(var2, (float)var3, (float)var4, new Paint());
         }
      }

   }

   public void l() {
   }

   public void a(ft$a var1) {
      if (this.j == null) {
         this.a.a(this, var1);
      } else {
         this.j.a(var1);
         Log.d("MapOverlayViewGroup", "setOnIndoorFloorSwitchListener");
      }

   }

   public void m() {
      if (this.g == null) {
         this.a.a(this);
      } else {
         this.g.b();
      }

   }

   public void h(Boolean var1) {
      if (this.f == null) {
         this.a.a(this, var1);
      } else {
         this.f.a(var1.booleanValue());
      }

   }

   public void i(Boolean var1) {
      if (this.j == null) {
         this.a.a(this, var1);
      } else {
         this.j.a(var1.booleanValue());
      }

   }

   public void j(Boolean var1) {
      if (this.e == null) {
         this.a.a(this, var1);
      } else {
         int var2 = var1.booleanValue() ? 4 : 4;
         this.e.setVisibility(var2);
      }

   }

   public void n() {
      if (this.r && this.d != null) {
         this.a(this.d);
         if (this.a != null) {
            this.a.a();
         }
      }

   }
}
