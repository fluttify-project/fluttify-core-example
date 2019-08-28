package com.amap.api.mapcore.util;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.opengl.Matrix;
import android.os.RemoteException;
import android.view.animation.AnimationUtils;
import com.amap.api.maps.model.BitmapDescriptor;
import com.amap.api.maps.model.GL3DModelOptions;
import com.amap.api.maps.model.LatLng;
import com.amap.api.maps.model.animation.Animation;
import com.autonavi.ae.gmap.GLMapState;
import com.autonavi.amap.mapcore.DPoint;
import com.autonavi.amap.mapcore.FPoint;
import com.autonavi.amap.mapcore.IPoint;
import com.autonavi.amap.mapcore.Rectangle;
import com.autonavi.amap.mapcore.animation.GLAnimation;
import com.autonavi.amap.mapcore.animation.GLAnimationSet;
import com.autonavi.amap.mapcore.animation.GLTransformation;
import com.autonavi.amap.mapcore.animation.GLTranslateAnimation;
import com.autonavi.amap.mapcore.interfaces.IglModel;
import java.util.Iterator;
import java.util.List;

public class cx extends m implements IglModel {
   private boolean e = true;
   private String f;
   private float[] g = new float[16];
   private r h;
   private BitmapDescriptor i;
   private u j;
   private int k;
   private int l;
   private LatLng m;
   private GLAnimation n;
   private boolean o = true;
   private boolean p = true;
   private Bitmap q;
   private dw$b r;
   private float s;
   private Object t;
   private float u = 18.0F;
   private float v = -1.0F;
   private float w = 0.0F;
   private boolean x = false;
   private p y;
   private int z;
   private boolean A = false;
   private boolean B = false;
   private FPoint C = FPoint.obtain();
   float[] a = new float[16];
   float[] b = new float[16];
   Rect c = new Rect(0, 0, 0, 0);
   private int D = 0;
   private int E = 0;
   private float F = 0.5F;
   private float G = 0.5F;
   private String H;
   private String I;
   float d = 1.0F;
   private float J = -1.0F;

   public cx(p var1, GL3DModelOptions var2, u var3) {
      if (var2 != null && var3 != null) {
         this.y = var1;
         this.j = var3;
         this.i = var2.getBitmapDescriptor();
         List var4 = var2.getTextrue();
         List var5 = var2.getVertext();
         this.m = var2.getLatLng();
         this.s = var2.getAngle();
         this.setModelFixedLength(var2.getModelFixedLength());
         if (this.m != null) {
            IPoint var6 = IPoint.obtain();
            GLMapState.lonlat2Geo(this.m.longitude, this.m.latitude, var6);
            this.k = var6.x;
            this.l = var6.y;
         }

         if (var4 != null && var4.size() > 0 && var5 != null && var5.size() > 0 & this.i != null) {
            this.h = new r(var5, var4);
            this.h.a(this.s);
         }

         this.a = new float[16];
         this.b = new float[4];
      }
   }

   public void j() {
      try {
         if (this.h != null) {
            if (this.r == null) {
               this.r = (dw$b)this.j.u(5);
            }

            if (this.v == -1.0F) {
               this.v = this.j.v((int)this.u);
            }

            if (this.e) {
               this.z = this.a(this.i.getBitmap());
               this.h.a(this.z);
               this.e = false;
            }

            this.o();
            int var1 = this.k - this.j.getMapConfig().getSX();
            this.C.x = (float)var1;
            int var2 = this.l - this.j.getMapConfig().getSY();
            this.C.y = (float)var2;
            Matrix.setIdentityM(this.g, 0);
            Matrix.multiplyMM(this.g, 0, this.j.getProjectionMatrix(), 0, this.j.getViewMatrix(), 0);
            Matrix.translateM(this.g, 0, (float)var1, (float)var2, 0.0F);
            if (this.x) {
               this.d = this.n();
            } else {
               this.d = this.m();
            }

            Matrix.scaleM(this.g, 0, this.d, this.d, this.d);
            this.h.a(this.r, this.g);
            if (this.B) {
               this.j.j();
               this.B = false;
            }
         }
      } catch (Exception var3) {
         var3.printStackTrace();
      }

   }

   private float m() {
      float var1 = this.j.getMapConfig().getMapPerPixelUnitLength();
      float var2 = this.j.getMapConfig().getSZ();
      if (var2 >= this.u) {
         this.J = var1;
         return var1 / this.J;
      } else {
         return var1 / this.v;
      }
   }

   private float n() {
      float var1 = this.w;
      float var2 = this.j.getMapConfig().getMapPerPixelUnitLength();
      float var3 = var2 * var1;
      float var4 = var3 / this.h.a();
      return var4;
   }

   private int a(Bitmap var1) {
      if (var1 != null) {
         this.q = var1;
      }

      int[] var2 = new int[1];
      GLES20.glGenTextures(1, var2, 0);
      GLES20.glBindTexture(3553, var2[0]);
      GLES20.glTexParameterf(3553, 10241, 9728.0F);
      GLES20.glTexParameterf(3553, 10240, 9729.0F);
      GLES20.glTexParameterf(3553, 10242, 33071.0F);
      GLES20.glTexParameterf(3553, 10243, 33071.0F);
      GLUtils.texImage2D(3553, 0, this.q, 0);
      return var2[0];
   }

   public void setPosition(LatLng var1) {
      if (var1 != null) {
         this.m = var1;
         IPoint var2 = IPoint.obtain();
         GLMapState.lonlat2Geo(var1.longitude, var1.latitude, var2);
         this.k = var2.x;
         this.l = var2.y;
         var2.recycle();
      }

      this.B = true;
      this.j.requestRender();
   }

   public void setRotateAngle(float var1) {
      this.s = var1;
      if (this.h != null) {
         float var2 = this.j.getMapConfig().getSR();
         this.h.a(this.s - var2);
      }

      this.B = true;
   }

   public float getRotateAngle() {
      return 0.0F;
   }

   public LatLng getPosition() {
      return this.m;
   }

   public void setAnimation(Animation var1) {
      if (var1 != null) {
         this.n = var1.glAnimation;
      }
   }

   public boolean startAnimation() {
      if (this.n != null) {
         if (this.n instanceof GLAnimationSet) {
            GLAnimationSet var1 = (GLAnimationSet)this.n;
            Iterator var2 = var1.getAnimations().iterator();

            while(var2.hasNext()) {
               GLAnimation var3 = (GLAnimation)var2.next();
               this.a(var3);
               var3.setDuration(var1.getDuration());
            }
         } else {
            this.a(this.n);
         }

         this.o = false;
         this.n.start();
      }

      return false;
   }

   public boolean remove() {
      if (this.j != null) {
         this.j.b(this.f);
      }

      return true;
   }

   public void setVisible(boolean var1) {
      this.p = var1;
   }

   public boolean isVisible() {
      return this.p;
   }

   public void setObject(Object var1) {
      this.t = var1;
   }

   public Object getObject() {
      return this.t;
   }

   public void setZoomLimit(float var1) {
      this.u = var1;
      this.v = this.j.v((int)this.u);
   }

   public void destroy() {
      if (this.q != null) {
         this.q.recycle();
      }

      this.y.a(this.z);
      this.h.c();
   }

   public void setGeoPoint(IPoint var1) {
      if (var1 != null) {
         this.k = var1.x;
         this.l = var1.y;
         DPoint var2 = DPoint.obtain();
         GLMapState.geo2LonLat(this.k, this.l, var2);
         this.m = new LatLng(var2.y, var2.x, false);
         var2.recycle();
      }

      this.j.requestRender();
   }

   public void showInfoWindow() {
      try {
         this.j.a((m)this);
      } catch (RemoteException var2) {
         var2.printStackTrace();
      }

   }

   private void a(GLAnimation var1) {
      if (var1 instanceof GLTranslateAnimation) {
         ((GLTranslateAnimation)var1).mFromXDelta = (double)this.k;
         ((GLTranslateAnimation)var1).mFromYDelta = (double)this.l;
         IPoint var2 = IPoint.obtain();
         GLMapState.lonlat2Geo(((GLTranslateAnimation)var1).mToXDelta, ((GLTranslateAnimation)var1).mToYDelta, var2);
         ((GLTranslateAnimation)var1).mToXDelta = (double)var2.x;
         ((GLTranslateAnimation)var1).mToYDelta = (double)var2.y;
         var2.recycle();
      }

   }

   private void o() {
      if (!this.o && this.n != null && !this.n.hasEnded()) {
         this.p();
         GLTransformation var1 = new GLTransformation();
         this.n.getTransformation(AnimationUtils.currentAnimationTimeMillis(), var1);
         if (var1 != null && !Double.isNaN(var1.x) && !Double.isNaN(var1.y)) {
            double var2 = var1.x;
            double var4 = var1.y;
            this.k = (int)var2;
            this.l = (int)var4;
         }
      } else {
         this.o = true;
      }

   }

   private void p() {
      if (this.j != null) {
         this.j.setRunLowFrame(false);
      }

   }

   public void a(String var1) {
      this.f = var1;
   }

   public FPoint a() {
      return this.C;
   }

   public LatLng b() {
      return null;
   }

   public void a(boolean var1) {
      this.A = var1;
      this.B = true;
   }

   public int k() {
      float var1 = this.j.getMapConfig().getMapPerPixelUnitLength();
      int var2 = (int)(this.h.b() * this.d / var1);
      return var2;
   }

   public int l() {
      float var1 = this.j.getMapConfig().getMapPerPixelUnitLength();
      int var2 = (int)(this.h.a() * this.d / var1);
      return var2;
   }

   public int c() {
      return 0;
   }

   public int d() {
      return 0;
   }

   public int e() {
      return this.D;
   }

   public int f() {
      return this.E;
   }

   public boolean g() {
      return false;
   }

   public boolean isInfoWindowEnable() {
      return true;
   }

   public String getId() {
      return this.f;
   }

   public boolean h() {
      Rectangle var1 = this.j.getMapConfig().getGeoRectangle();
      return var1.contains(this.k, this.l);
   }

   public void setTitle(String var1) {
      this.I = var1;
   }

   public void setSnippet(String var1) {
      this.H = var1;
   }

   public void setModelFixedLength(int var1) {
      if (var1 > 0) {
         this.w = (float)var1;
         this.x = true;
      } else {
         this.w = 0.0F;
         this.x = false;
      }

   }

   public String getTitle() {
      return this.I;
   }

   public String getSnippet() {
      return this.H;
   }

   public Rect i() {
      try {
         GLMapState var1 = this.j.c();
         int var2 = this.k();
         int var3 = this.l();
         FPoint var4 = FPoint.obtain();
         var1.p20ToScreenPoint(this.k, this.l, var4);
         Matrix.setIdentityM(this.a, 0);
         Matrix.rotateM(this.a, 0, -this.s, 0.0F, 0.0F, 1.0F);
         Matrix.rotateM(this.a, 0, this.j.getMapConfig().getSC(), 1.0F, 0.0F, 0.0F);
         Matrix.rotateM(this.a, 0, this.j.getMapConfig().getSR(), 0.0F, 0.0F, 1.0F);
         float[] var5 = new float[4];
         this.b[0] = (float)(-var2) * this.F;
         this.b[1] = (float)var3 * this.G;
         this.b[2] = 0.0F;
         this.b[3] = 1.0F;
         Matrix.multiplyMV(var5, 0, this.a, 0, this.b, 0);
         this.c.set((int)(var4.x + var5[0]), (int)(var4.y - var5[1]), (int)(var4.x + var5[0]), (int)(var4.y - var5[1]));
         this.b[0] = (float)var2 * (1.0F - this.F);
         this.b[1] = (float)var3 * this.G;
         this.b[2] = 0.0F;
         this.b[3] = 1.0F;
         Matrix.multiplyMV(var5, 0, this.a, 0, this.b, 0);
         this.c.union((int)(var4.x + var5[0]), (int)(var4.y - var5[1]));
         this.b[0] = (float)var2 * (1.0F - this.F);
         this.b[1] = (float)(-var3) * (1.0F - this.G);
         this.b[2] = 0.0F;
         this.b[3] = 1.0F;
         Matrix.multiplyMV(var5, 0, this.a, 0, this.b, 0);
         this.c.union((int)(var4.x + var5[0]), (int)(var4.y - var5[1]));
         this.b[0] = (float)(-var2) * this.F;
         this.b[1] = (float)(-var3) * (1.0F - this.G);
         this.b[2] = 0.0F;
         this.b[3] = 1.0F;
         Matrix.multiplyMV(var5, 0, this.a, 0, this.b, 0);
         this.c.union((int)(var4.x + var5[0]), (int)(var4.y - var5[1]));
         this.D = this.c.centerX() - (int)var4.x;
         this.E = this.c.top - (int)var4.y;
         var4.recycle();
         return this.c;
      } catch (Throwable var6) {
         ht.c(var6, "MarkerDelegateImp", "getRect");
         var6.printStackTrace();
         return new Rect(0, 0, 0, 0);
      }
   }
}
