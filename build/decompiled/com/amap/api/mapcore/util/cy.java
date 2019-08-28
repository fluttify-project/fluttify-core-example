package com.amap.api.mapcore.util;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.os.RemoteException;
import android.os.Build.VERSION;
import android.util.Log;
import com.amap.api.maps.model.BitmapDescriptor;
import com.amap.api.maps.model.LatLng;
import com.amap.api.maps.model.LatLngBounds;
import com.autonavi.ae.gmap.GLMapState;
import com.autonavi.amap.mapcore.DPoint;
import com.autonavi.amap.mapcore.IPoint;
import com.autonavi.amap.mapcore.MapConfig;
import com.autonavi.amap.mapcore.interfaces.IOverlay;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class cy implements dc {
   private u c;
   private BitmapDescriptor d;
   private LatLng e;
   private float f;
   private float g;
   private LatLngBounds h;
   private float i;
   private float j;
   private boolean k;
   private float l;
   private float m;
   private float n;
   private float o;
   private String p;
   private FloatBuffer q;
   private FloatBuffer r;
   private int s;
   private boolean t;
   private boolean u;
   private List<ad> v;
   private s w;
   float[] a;
   dw$c b;

   public cy(u var1, s var2) {
      this(var1);
      this.w = var2;
   }

   private cy(u var1) {
      this.k = true;
      this.l = 0.0F;
      this.m = 1.0F;
      this.n = 0.5F;
      this.o = 0.5F;
      this.q = null;
      this.t = false;
      this.u = false;
      this.v = new ArrayList();
      this.a = null;
      this.c = var1;

      try {
         this.p = this.getId();
      } catch (RemoteException var3) {
         ht.c(var3, "GroundOverlayDelegateImp", "create");
         var3.printStackTrace();
      }

   }

   public void remove() throws RemoteException {
      this.c.a(this.getId());
      this.c.setRunLowFrame(false);
   }

   public String getId() throws RemoteException {
      if (this.p == null) {
         this.p = this.c.d("GroundOverlay");
      }

      return this.p;
   }

   public void setZIndex(float var1) throws RemoteException {
      this.j = var1;
      this.c.f();
      this.c.setRunLowFrame(false);
   }

   public float getZIndex() throws RemoteException {
      return this.j;
   }

   public void setVisible(boolean var1) throws RemoteException {
      this.k = var1;
      this.c.setRunLowFrame(false);
   }

   public boolean isVisible() throws RemoteException {
      return this.k;
   }

   public boolean equalsRemote(IOverlay var1) throws RemoteException {
      return this.equals(var1) || var1.getId().equals(this.getId());
   }

   public int hashCodeRemote() throws RemoteException {
      return super.hashCode();
   }

   public boolean b() throws RemoteException {
      synchronized(this) {
         if (this.a != null) {
            return false;
         }
      }

      this.u = false;
      if (this.e == null) {
         this.e();
      } else if (this.h == null) {
         this.d();
      } else {
         this.f();
      }

      return true;
   }

   private void d() {
      if (this.e != null) {
         double var1 = (double)this.f / (6371000.79D * Math.cos(this.e.latitude * 0.01745329251994329D) * 0.01745329251994329D);
         double var3 = (double)this.g / 111194.94043265979D;

         try {
            this.h = new LatLngBounds(new LatLng(this.e.latitude - (double)(1.0F - this.o) * var3, this.e.longitude - (double)this.n * var1), new LatLng(this.e.latitude + (double)this.o * var3, this.e.longitude + (double)(1.0F - this.n) * var1));
         } catch (Throwable var6) {
            var6.printStackTrace();
         }

         this.f();
      }
   }

   private synchronized void e() {
      if (this.h != null) {
         LatLng var1 = this.h.southwest;
         LatLng var2 = this.h.northeast;
         this.e = new LatLng(var1.latitude + (double)(1.0F - this.o) * (var2.latitude - var1.latitude), var1.longitude + (double)this.n * (var2.longitude - var1.longitude));
         this.f = (float)(6371000.79D * Math.cos(this.e.latitude * 0.01745329251994329D) * (var2.longitude - var1.longitude) * 0.01745329251994329D);
         this.g = (float)(6371000.79D * (var2.latitude - var1.latitude) * 0.01745329251994329D);
         this.f();
      }
   }

   private synchronized void f() {
      if (this.h != null) {
         this.a = new float[16];
         IPoint var1 = IPoint.obtain();
         IPoint var2 = IPoint.obtain();
         IPoint var3 = IPoint.obtain();
         IPoint var4 = IPoint.obtain();
         GLMapState.lonlat2Geo(this.h.southwest.longitude, this.h.southwest.latitude, var1);
         GLMapState.lonlat2Geo(this.h.northeast.longitude, this.h.southwest.latitude, var2);
         GLMapState.lonlat2Geo(this.h.northeast.longitude, this.h.northeast.latitude, var3);
         GLMapState.lonlat2Geo(this.h.southwest.longitude, this.h.northeast.latitude, var4);
         if (this.i != 0.0F) {
            double var5 = (double)(var2.x - var1.x);
            double var7 = (double)(var2.y - var3.y);
            DPoint var9 = DPoint.obtain();
            var9.x = (double)var1.x + var5 * (double)this.n;
            var9.y = (double)var1.y - var7 * (double)(1.0F - this.o);
            this.a(var9, 0.0D, 0.0D, var5, var7, var1);
            this.a(var9, var5, 0.0D, var5, var7, var2);
            this.a(var9, var5, var7, var5, var7, var3);
            this.a(var9, 0.0D, var7, var5, var7, var4);
            var9.recycle();
         }

         this.a[0] = (float)(var1.x / 10000);
         this.a[1] = (float)(var1.y / 10000);
         this.a[2] = (float)(var1.x % 10000);
         this.a[3] = (float)(var1.y % 10000);
         this.a[4] = (float)(var2.x / 10000);
         this.a[5] = (float)(var2.y / 10000);
         this.a[6] = (float)(var2.x % 10000);
         this.a[7] = (float)(var2.y % 10000);
         this.a[8] = (float)(var3.x / 10000);
         this.a[9] = (float)(var3.y / 10000);
         this.a[10] = (float)(var3.x % 10000);
         this.a[11] = (float)(var3.y % 10000);
         this.a[12] = (float)(var4.x / 10000);
         this.a[13] = (float)(var4.y / 10000);
         this.a[14] = (float)(var4.x % 10000);
         this.a[15] = (float)(var4.y % 10000);
         if (this.q == null) {
            this.q = fi.a(this.a);
         } else {
            this.q = fi.a(this.a, this.q);
         }

         var4.recycle();
         var1.recycle();
         var2.recycle();
         var3.recycle();
      }
   }

   private void a(DPoint var1, double var2, double var4, double var6, double var8, IPoint var10) {
      double var11 = var2 - var6 * (double)this.n;
      double var13 = var8 * (double)(1.0F - this.o) - var4;
      double var15 = (double)(-this.i) * 0.01745329251994329D;
      var10.x = (int)(var1.x + var11 * Math.cos(var15) + var13 * Math.sin(var15));
      var10.y = (int)(var1.y + (var13 * Math.cos(var15) - var11 * Math.sin(var15)));
   }

   private void g() {
      if (this.d != null || this.d != null && this.d.getBitmap() != null) {
         int var1 = this.d.getWidth();
         int var2 = this.d.getHeight();
         int var3 = this.d.getBitmap().getHeight();
         int var4 = this.d.getBitmap().getWidth();
         float var5 = (float)var1 / (float)var4;
         float var6 = (float)var2 / (float)var3;
         this.r = fi.a(new float[]{0.0F, var6, var5, var6, var5, 0.0F, 0.0F, 0.0F});
      }
   }

   public void a(MapConfig var1) throws RemoteException {
      synchronized(this) {
         boolean var3 = !this.k || this.e == null && this.h == null || this.d == null;
         if (var3) {
            return;
         }
      }

      this.b();
      if (!this.t) {
         boolean var2 = VERSION.SDK_INT >= 12;
         this.s = this.a(var2, this.d);
         this.t = true;
      }

      if (this.f != 0.0F || this.g != 0.0F) {
         synchronized(this) {
            this.a(this.s, this.q, this.r);
         }

         this.u = true;
      }
   }

   private void h() {
      if (this.v != null) {
         Iterator var1 = this.v.iterator();

         while(var1.hasNext()) {
            ad var2 = (ad)var1.next();
            if (var2 != null && this.w != null) {
               this.w.a(var2);
            }
         }

         this.v.clear();
      }

   }

   private void a(ad var1) {
      if (var1 != null) {
         this.v.add(var1);
         var1.l();
      }

   }

   private int a(boolean var1, BitmapDescriptor var2) {
      this.h();
      int var3 = 0;
      ad var4 = null;
      if (var1) {
         var4 = this.w.a(var2);
         if (var4 != null) {
            var3 = var4.k();
            this.a(var4);
            return var3;
         }
      }

      if (var4 == null) {
         var4 = new ad(var2, var3);
      }

      if (var3 == 0) {
         Bitmap var5 = var2.getBitmap();
         if (var5 != null && !var5.isRecycled()) {
            var3 = this.i();
            var4.a(var3);
            if (var1) {
               this.c.a(var4);
            }

            this.a(var4);
            fi.b(var3, var5, true);
         }
      }

      return var3;
   }

   private int i() {
      int[] var1 = new int[]{0};
      GLES20.glGenTextures(1, var1, 0);
      return var1[0];
   }

   public void destroy() {
      try {
         this.remove();
         ad var1;
         if (this.v != null && this.v.size() > 0) {
            int var2 = 0;

            while(true) {
               if (var2 >= this.v.size()) {
                  this.v.clear();
                  break;
               }

               var1 = (ad)this.v.get(var2);
               if (var1 != null) {
                  if (this.w != null) {
                     this.w.a(var1);
                  }

                  if (this.c != null) {
                     this.c.c(var1.o());
                  }
               }

               ++var2;
            }
         }

         if (this.d != null) {
            Bitmap var6 = this.d.getBitmap();
            if (var6 != null) {
               var6.recycle();
               var1 = null;
               this.d = null;
            }
         }

         if (this.r != null) {
            this.r.clear();
            this.r = null;
         }

         synchronized(this) {
            if (this.q != null) {
               this.q.clear();
               this.q = null;
            }

            this.h = null;
         }

         this.e = null;
      } catch (Throwable var5) {
         ht.c(var5, "GroundOverlayDelegateImp", "destroy");
         var5.printStackTrace();
      }

   }

   public boolean a() {
      return true;
   }

   public void setPosition(LatLng var1) throws RemoteException {
      this.e = var1;
      this.d();
      this.c.setRunLowFrame(false);
   }

   public LatLng getPosition() throws RemoteException {
      return this.e;
   }

   public void setDimensions(float var1) throws RemoteException {
      if (var1 <= 0.0F) {
         Log.w("GroundOverlayDelegateImp", "Width must be non-negative");
      }

      if (this.t && this.f != var1) {
         this.f = var1;
         this.g = var1;
         this.d();
      } else {
         this.f = var1;
         this.g = var1;
      }

      this.c.setRunLowFrame(false);
   }

   public void setDimensions(float var1, float var2) throws RemoteException {
      if (var1 <= 0.0F || var2 <= 0.0F) {
         Log.w("GroundOverlayDelegateImp", "Width and Height must be non-negative");
      }

      if (this.t && this.f != var1 && this.g != var2) {
         this.f = var1;
         this.g = var2;
         this.d();
      } else {
         this.f = var1;
         this.g = var2;
      }

      this.c.setRunLowFrame(false);
   }

   public float getWidth() throws RemoteException {
      return this.f;
   }

   public float getHeight() throws RemoteException {
      return this.g;
   }

   public void setPositionFromBounds(LatLngBounds var1) throws RemoteException {
      if (var1 != null) {
         this.h = var1;
         this.e();
         this.c.setRunLowFrame(false);
      }
   }

   public LatLngBounds getBounds() throws RemoteException {
      return this.h;
   }

   public void setBearing(float var1) throws RemoteException {
      float var2 = (var1 % 360.0F + 360.0F) % 360.0F;
      double var3 = 1.0E-7D;
      if ((double)Math.abs(this.i - var2) > var3) {
         this.i = var2;
         this.f();
      }

      this.c.setRunLowFrame(false);
   }

   public float getBearing() throws RemoteException {
      return this.i;
   }

   public void setTransparency(float var1) throws RemoteException {
      this.l = (float)Math.min(1.0D, Math.max(0.0D, (double)var1));
      this.m = 1.0F - var1;
      this.c.setRunLowFrame(false);
   }

   public float getTransparency() throws RemoteException {
      return this.l;
   }

   public void setImage(BitmapDescriptor var1) throws RemoteException {
      if (var1 != null && var1.getBitmap() != null && !var1.getBitmap().isRecycled()) {
         this.d = var1;
         this.g();
         if (this.t) {
            this.t = false;
         }

         this.c.setRunLowFrame(false);
      }
   }

   public void a(float var1, float var2) throws RemoteException {
      this.n = var1;
      this.o = var2;
      this.c.setRunLowFrame(false);
   }

   public boolean c() {
      return this.u;
   }

   public boolean isAboveMaskLayer() {
      return false;
   }

   public void setAboveMaskLayer(boolean var1) {
   }

   private void j() {
      if (this.c != null) {
         this.b = (dw$c)this.c.u(2);
      }

   }

   private void a(int var1, FloatBuffer var2, FloatBuffer var3) {
      if (var2 != null && var3 != null) {
         if (this.b == null || this.b.c()) {
            this.j();
         }

         this.b.a();
         GLES20.glEnable(3042);
         GLES20.glBlendFunc(1, 771);
         GLES20.glBlendColor(1.0F * this.m, 1.0F * this.m, 1.0F * this.m, this.m);
         GLES20.glActiveTexture(33984);
         GLES20.glBindTexture(3553, var1);
         GLES20.glEnableVertexAttribArray(this.b.b);
         GLES20.glVertexAttribPointer(this.b.b, 4, 5126, false, 16, var2);
         GLES20.glEnableVertexAttribArray(this.b.c);
         GLES20.glVertexAttribPointer(this.b.c, 2, 5126, false, 8, var3);
         GLES20.glUniform4f(this.b.g, (float)(this.c.getMapConfig().getSX() / 10000), (float)(this.c.getMapConfig().getSY() / 10000), (float)(this.c.getMapConfig().getSX() % 10000), (float)(this.c.getMapConfig().getSY() % 10000));
         GLES20.glUniform4f(this.b.h, 1.0F * this.m, 1.0F * this.m, 1.0F * this.m, this.m);
         GLES20.glUniformMatrix4fv(this.b.a, 1, false, this.c.x(), 0);
         GLES20.glDrawArrays(6, 0, 4);
         GLES20.glBindTexture(3553, 0);
         GLES20.glDisableVertexAttribArray(this.b.b);
         GLES20.glDisableVertexAttribArray(this.b.c);
         GLES20.glDisable(3042);
         GLES20.glUseProgram(0);
      }
   }
}
