package com.amap.api.mapcore.util;

import android.animation.ValueAnimator;
import android.animation.Animator.AnimatorListener;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.graphics.Point;
import android.location.Location;
import android.os.RemoteException;
import com.amap.api.maps.model.BitmapDescriptor;
import com.amap.api.maps.model.BitmapDescriptorFactory;
import com.amap.api.maps.model.Circle;
import com.amap.api.maps.model.CircleOptions;
import com.amap.api.maps.model.LatLng;
import com.amap.api.maps.model.Marker;
import com.amap.api.maps.model.MarkerOptions;
import com.amap.api.maps.model.MyLocationStyle;
import com.autonavi.ae.gmap.GLMapState;
import com.autonavi.amap.mapcore.IPoint;

public class dn {
   private u e;
   private Marker f;
   private Circle g;
   private MyLocationStyle h = new MyLocationStyle();
   private LatLng i;
   private double j;
   private Context k;
   private ag l;
   private int m = 4;
   private boolean n = false;
   private boolean o = false;
   private boolean p = false;
   private boolean q = false;
   private boolean r = false;
   private boolean s = false;
   dn$a a = null;
   ValueAnimator b;
   AnimatorListener c = new dn$1(this);
   AnimatorUpdateListener d = new dn$2(this);

   public dn(u var1, Context var2) {
      this.k = var2.getApplicationContext();
      this.e = var1;
      this.l = new ag(this.k, var1);
      this.a(4, true);
   }

   public void a(MyLocationStyle var1) {
      try {
         this.h = var1;
         this.a(this.h.isMyLocationShowing());
         if (!this.h.isMyLocationShowing()) {
            this.l.a(false);
            this.m = this.h.getMyLocationType();
            return;
         }

         this.j();
         if (this.f == null && this.g == null) {
            return;
         }

         this.l.a(this.f);
         this.a(this.h.getMyLocationType());
      } catch (Throwable var3) {
         ht.c(var3, "MyLocationOverlay", "setMyLocationStyle");
         var3.printStackTrace();
      }

   }

   public MyLocationStyle a() {
      return this.h;
   }

   public void a(int var1) {
      this.a(var1, false);
   }

   private void a(int var1, boolean var2) {
      this.m = var1;
      this.n = false;
      this.p = false;
      this.o = false;
      this.r = false;
      this.s = false;
      switch(this.m) {
      case 0:
      case 6:
      default:
         break;
      case 1:
         this.o = true;
         this.p = true;
         this.q = true;
         break;
      case 2:
         this.o = true;
         this.q = true;
         break;
      case 3:
         this.o = true;
         this.s = true;
         break;
      case 4:
         this.o = true;
         this.r = true;
         break;
      case 5:
         this.r = true;
         break;
      case 7:
         this.s = true;
      }

      if (!this.r && !this.s) {
         if (this.f != null) {
            this.f.setFlat(false);
         }

         this.h();
         this.g();
         this.f();
      } else {
         if (this.s) {
            this.l.a(true);
            if (!var2) {
               try {
                  this.e.a(an.a(17.0F));
               } catch (Throwable var4) {
                  var4.printStackTrace();
               }
            }

            this.b(45.0F);
         } else {
            this.l.a(false);
         }

         this.l.a();
         if (this.f != null) {
            this.f.setFlat(true);
         }
      }

   }

   private void f() {
      this.l.b();
   }

   private void g() {
      this.b(0.0F);
   }

   private void h() {
      this.c(0.0F);
   }

   private void b(float var1) {
      if (this.e != null) {
         try {
            this.e.a(an.c(var1));
         } catch (Throwable var3) {
            var3.printStackTrace();
         }

      }
   }

   private void c(float var1) {
      if (this.e != null) {
         try {
            this.e.a(an.d(var1));
         } catch (Throwable var3) {
            var3.printStackTrace();
         }

      }
   }

   public void a(Location var1) {
      if (var1 != null) {
         this.a(this.h.isMyLocationShowing());
         if (this.h.isMyLocationShowing()) {
            this.i = new LatLng(var1.getLatitude(), var1.getLongitude());
            this.j = (double)var1.getAccuracy();
            if (this.f == null && this.g == null) {
               this.j();
            }

            if (this.g != null) {
               try {
                  if (this.j != -1.0D) {
                     this.g.setRadius(this.j);
                  }
               } catch (Throwable var3) {
                  ht.c(var3, "MyLocationOverlay", "setCentAndRadius");
                  var3.printStackTrace();
               }
            }

            this.d(var1.getBearing());
            if (!this.i.equals(this.f.getPosition())) {
               this.a(this.i);
            } else {
               this.i();
            }

         }
      }
   }

   private void d(float var1) {
      if (this.q) {
         var1 %= 360.0F;
         float var2 = 180.0F;
         float var3 = -180.0F;
         if (var1 > var2) {
            var1 -= 360.0F;
         } else if (var1 < var3) {
            var1 += 360.0F;
         }

         if (this.f != null) {
            this.f.setRotateAngle(-var1);
         }

      }
   }

   private void i() {
      if (this.i != null) {
         if (this.o) {
            if (!this.p || !this.n) {
               this.n = true;

               try {
                  IPoint var1 = IPoint.obtain();
                  GLMapState.lonlat2Geo(this.i.longitude, this.i.latitude, var1);
                  this.e.b(an.a((Point)var1));
               } catch (Throwable var2) {
                  ht.c(var2, "MyLocationOverlay", "moveMapToLocation");
                  var2.printStackTrace();
               }

            }
         }
      }
   }

   private void j() {
      if (this.h == null) {
         this.h = new MyLocationStyle();
         this.h.myLocationIcon(BitmapDescriptorFactory.fromAsset("location_map_gps_locked.png"));
         this.l();
      } else {
         if (this.h.getMyLocationIcon() == null || this.h.getMyLocationIcon().getBitmap() == null) {
            this.h.myLocationIcon(BitmapDescriptorFactory.fromAsset("location_map_gps_locked.png"));
         }

         this.l();
      }

   }

   public void b() throws RemoteException {
      this.k();
      if (this.l != null) {
         this.f();
         this.l = null;
      }

   }

   private void k() {
      if (this.g != null) {
         try {
            this.e.a(this.g.getId());
         } catch (Throwable var2) {
            ht.c(var2, "MyLocationOverlay", "locationIconRemove");
            var2.printStackTrace();
         }

         this.g = null;
      }

      if (this.f != null) {
         this.f.remove();
         this.f = null;
         this.l.a((Marker)null);
      }

   }

   public void a(boolean var1) {
      if (this.g != null && this.g.isVisible() != var1) {
         this.g.setVisible(var1);
      }

      if (this.f != null && this.f.isVisible() != var1) {
         this.f.setVisible(var1);
      }

   }

   private void l() {
      try {
         if (this.g == null) {
            this.g = this.e.addCircle((new CircleOptions()).zIndex(1.0F));
         }

         if (this.g != null) {
            if (this.g.getStrokeWidth() != this.h.getStrokeWidth()) {
               this.g.setStrokeWidth(this.h.getStrokeWidth());
            }

            if (this.g.getFillColor() != this.h.getRadiusFillColor()) {
               this.g.setFillColor(this.h.getRadiusFillColor());
            }

            if (this.g.getStrokeColor() != this.h.getStrokeColor()) {
               this.g.setStrokeColor(this.h.getStrokeColor());
            }

            if (this.i != null) {
               this.g.setCenter(this.i);
            }

            this.g.setRadius(this.j);
            this.g.setVisible(true);
         }

         if (this.f == null) {
            this.f = this.e.addMarker((new MarkerOptions()).visible(false));
         }

         if (this.f != null) {
            if (this.f.getAnchorU() != this.h.getAnchorU() || this.f.getAnchorV() != this.h.getAnchorV()) {
               this.f.setAnchor(this.h.getAnchorU(), this.h.getAnchorV());
            }

            if (this.f.getIcons() != null && this.f.getIcons().size() != 0) {
               if (this.h.getMyLocationIcon() != null && !((BitmapDescriptor)this.f.getIcons().get(0)).equals(this.h.getMyLocationIcon())) {
                  this.f.setIcon(this.h.getMyLocationIcon());
               }
            } else {
               this.f.setIcon(this.h.getMyLocationIcon());
            }

            if (this.i != null) {
               this.f.setPosition(this.i);
               this.f.setVisible(true);
            }
         }

         this.i();
         this.l.a(this.f);
      } catch (Throwable var2) {
         ht.c(var2, "MyLocationOverlay", "myLocStyle");
         var2.printStackTrace();
      }

   }

   public void a(float var1) {
      if (this.f != null) {
         this.f.setRotateAngle(var1);
      }

   }

   public String c() {
      return this.f != null ? this.f.getId() : null;
   }

   public String d() throws RemoteException {
      return this.g != null ? this.g.getId() : null;
   }

   public void e() {
      this.g = null;
      this.f = null;
   }

   private void a(LatLng var1) {
      LatLng var2 = this.f.getPosition();
      if (var2 == null) {
         var2 = new LatLng(0.0D, 0.0D);
      }

      if (this.a == null) {
         this.a = new dn$a();
      }

      if (this.b == null) {
         this.b = ValueAnimator.ofObject(new dn$a(), new Object[]{var2, var1});
         this.b.addListener(this.c);
         this.b.addUpdateListener(this.d);
      } else {
         this.b.setObjectValues(new Object[]{var2, var1});
         this.b.setEvaluator(this.a);
      }

      if (var2.latitude == 0.0D && var2.longitude == 0.0D) {
         this.b.setDuration(1L);
      } else {
         this.b.setDuration(1000L);
      }

      this.b.start();
   }
}
