package com.amap.api.mapcore.util;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.amap.api.maps.model.BasePointOverlay;
import com.amap.api.maps.model.GL3DModel;
import com.amap.api.maps.model.Marker;
import com.amap.api.maps.model.animation.Animation;
import com.amap.api.maps.model.animation.Animation$AnimationListener;
import com.autonavi.ae.gmap.GLMapState;
import com.autonavi.amap.mapcore.FPoint;
import com.autonavi.amap.mapcore.IPoint;
import com.autonavi.amap.mapcore.MapConfig;
import com.autonavi.amap.mapcore.animation.GLAnimation;
import com.autonavi.amap.mapcore.animation.GLTransformation;
import com.autonavi.amap.mapcore.interfaces.IInfoWindowManager;
import com.autonavi.amap.mapcore.interfaces.IMarker;
import com.autonavi.amap.mapcore.interfaces.IMarkerAction;
import com.autonavi.amap.mapcore.interfaces.IOverlay;
import java.nio.FloatBuffer;

public class ds implements ax, df, IInfoWindowManager {
   private Context g;
   private m h;
   private boolean i = false;
   private int j = 0;
   private int k = 0;
   private int l = 0;
   private int m = 0;
   private FPoint n;
   private FloatBuffer o = null;
   private String p;
   private boolean q = true;
   private FloatBuffer r;
   private float s = 0.5F;
   private float t = 1.0F;
   private boolean u;
   private Bitmap v;
   private Bitmap w;
   private Rect x = new Rect();
   private float y = 0.0F;
   private int z;
   private boolean A = true;
   private Bitmap B = null;
   private Bitmap C = null;
   private Bitmap D = null;
   private Bitmap E = null;
   private boolean F = false;
   u a = null;
   private boolean G = false;
   float[] b = new float[12];
   ds$a c;
   float[] d = new float[]{1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F};
   long e = 0L;
   private GLAnimation H;
   private GLAnimation I;
   private boolean J = false;
   private boolean K = true;
   ay f;

   public boolean d() {
      return this.A;
   }

   public void a(boolean var1) {
      this.A = var1;
   }

   public synchronized void a(Bitmap var1) {
      if (var1 != null && !var1.isRecycled()) {
         this.B = var1;
      }

   }

   private synchronized void c(Bitmap var1) {
      if (var1 != null && !var1.isRecycled()) {
         var1.recycle();
      }

   }

   private synchronized void d(Bitmap var1) {
      if (var1 != null && !var1.isRecycled()) {
         this.c(this.C);
         this.C = var1;
      }

   }

   private synchronized void e(Bitmap var1) {
      if (var1 != null && !var1.isRecycled()) {
         this.c(this.D);
         this.D = var1;
      }

   }

   private synchronized void f(Bitmap var1) {
      if (var1 != null && !var1.isRecycled()) {
         this.c(this.E);
         this.E = var1;
      }

   }

   private synchronized Bitmap k() {
      return this.B;
   }

   private synchronized Bitmap l() {
      return this.D;
   }

   public ds(u var1, Context var2) {
      this.g = var2;
      this.a = var1;
      this.p = this.getId();
   }

   public int e() {
      try {
         synchronized(this) {
            return this.v != null && !this.v.isRecycled() ? this.v.getWidth() : 0;
         }
      } catch (Throwable var4) {
         return 0;
      }
   }

   public int f() {
      try {
         return this.v != null && !this.v.isRecycled() ? this.v.getHeight() : 0;
      } catch (Throwable var2) {
         return 0;
      }
   }

   public String getId() {
      if (this.p == null) {
         this.p = "PopupOverlay";
      }

      return this.p;
   }

   public synchronized void b(Bitmap var1) {
      try {
         if (var1 == null || var1.isRecycled()) {
            return;
         }

         if (this.v != null && this.v.hashCode() == var1.hashCode()) {
            return;
         }

         if (this.v != null) {
            if (this.B == null && this.C == null && this.D == null && this.E == null) {
               this.c(this.w);
               this.w = this.v;
            } else if (!this.g(this.v)) {
               this.c(this.w);
               this.w = this.v;
            }
         }

         this.G = false;
         this.v = var1;
      } catch (Throwable var3) {
         ;
      }

   }

   private boolean g(Bitmap var1) {
      if (this.B != null && var1.hashCode() == this.B.hashCode()) {
         return true;
      } else if (this.D != null && var1.hashCode() == this.D.hashCode()) {
         return true;
      } else if (this.C != null && var1.hashCode() == this.C.hashCode()) {
         return true;
      } else {
         return this.E != null && var1.hashCode() == this.E.hashCode();
      }
   }

   public void setVisible(boolean var1) {
      if (!this.q && var1) {
         this.u = true;
      }

      this.q = var1;
   }

   public boolean isVisible() {
      return this.q;
   }

   public boolean equalsRemote(IOverlay var1) throws RemoteException {
      return this.equals(var1) || var1.getId().equals(this.getId());
   }

   public int hashCodeRemote() {
      return super.hashCode();
   }

   public boolean a(int var1, int var2) {
      GLMapState var3 = this.a.c();
      if (this.n != null && var3 != null) {
         IPoint var4 = IPoint.obtain();
         MapConfig var5 = this.a.getMapConfig();
         if (var5 != null && var3 != null) {
            FPoint var6 = FPoint.obtain();
            var3.p20ToScreenPoint(var5.getSX() + (int)this.n.x, var5.getSY() + (int)this.n.y, var6);
            var4.x = (int)var6.x;
            var4.y = (int)var6.y;
            var6.recycle();
         }

         int var14 = this.e();
         int var7 = this.f();
         int var8 = (int)((float)(var4.x + this.j) - (float)var14 * this.s);
         int var9 = (int)((float)(var4.y + this.k) + (float)var7 * (1.0F - this.t));
         var4.recycle();
         byte var10 = 2;
         if (var8 - var14 <= var1 && var8 >= -var14 * var10 && var9 >= -var7 * var10 && var9 - var7 <= var2) {
            if (this.v == null) {
               return false;
            } else {
               int var11 = this.v.getWidth();
               int var12 = this.v.getHeight();
               if (this.r == null) {
                  this.r = fi.a(new float[]{0.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F});
               }

               int var13 = (int)((double)(1.0F - this.y) * 0.5D * (double)var11);
               this.b[0] = (float)(var8 + var13);
               this.x.left = var8 + var13;
               this.b[1] = (float)(var2 - var9);
               this.b[2] = 0.0F;
               this.b[3] = (float)(var8 + var11 - var13);
               this.b[4] = (float)(var2 - var9);
               this.x.top = var9 - var12;
               this.b[5] = 0.0F;
               this.b[6] = (float)(var8 + var11 - var13);
               this.x.right = var8 + var11;
               this.b[7] = (float)(var2 - var9 + var12);
               this.x.bottom = var9;
               this.b[8] = 0.0F;
               this.b[9] = (float)(var8 + var13);
               this.b[10] = (float)(var2 - var9 + var12);
               this.b[11] = 0.0F;
               if (this.o == null) {
                  this.o = fi.a(this.b);
               } else {
                  this.o = fi.a(this.b, this.o);
               }

               return true;
            }
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   public void g() {
      this.c = new ds$a("texture.glsl");
   }

   private void a(int var1, FloatBuffer var2, FloatBuffer var3) {
      if (var2 != null && var3 != null && var1 != 0) {
         if (this.c == null) {
            this.g();
         }

         this.c.a();
         GLES20.glEnable(3042);
         GLES20.glBlendFunc(1, 771);
         GLES20.glBlendColor(1.0F, 1.0F, 1.0F, 1.0F);
         GLES20.glActiveTexture(33984);
         GLES20.glBindTexture(3553, var1);
         GLES20.glEnableVertexAttribArray(this.c.b);
         GLES20.glVertexAttribPointer(this.c.b, 3, 5126, false, 12, var2);
         GLES20.glEnableVertexAttribArray(this.c.c);
         GLES20.glVertexAttribPointer(this.c.c, 2, 5126, false, 8, var3);
         GLES20.glUniformMatrix4fv(this.c.a, 1, false, this.d, 0);
         GLES20.glDrawArrays(6, 0, 4);
         GLES20.glDisableVertexAttribArray(this.c.b);
         GLES20.glDisableVertexAttribArray(this.c.c);
         GLES20.glBindTexture(3553, 0);
         GLES20.glUseProgram(0);
         GLES20.glDisable(3042);
      }
   }

   public void b(int var1, int var2) {
      if (this.q && this.n != null && this.v != null) {
         this.h();
         if (this.v.isRecycled()) {
            ;
         }

         if (!this.G && !this.v.isRecycled()) {
            try {
               if (this.z != 0) {
                  GLES20.glDeleteTextures(1, new int[]{this.z}, 0);
               } else {
                  this.z = this.n();
               }

               synchronized(this) {
                  if (this.v != null && !this.v.isRecycled()) {
                     fi.b(this.z, this.v, false);
                     this.G = true;
                  }
               }
            } catch (Throwable var6) {
               ht.c(var6, "PopupOverlay", "drawMarker");
               var6.printStackTrace();
               return;
            }
         }

         this.m();
         if (this.a(var1, var2)) {
            Matrix.setIdentityM(this.d, 0);
            Matrix.orthoM(this.d, 0, 0.0F, (float)var1, 0.0F, (float)var2, 1.0F, -1.0F);
            this.a(this.z, this.o, this.r);
            if (this.u) {
               this.u = false;
               this.r();
            }
         }

      }
   }

   protected void h() {
      long var1 = 0L;
      synchronized(this) {
         if (this.f != null) {
            if (this.h instanceof dm) {
               Marker var4 = new Marker((IMarker)this.h);
               var1 = this.f.c((BasePointOverlay)var4);
            } else {
               GL3DModel var8 = new GL3DModel((cx)this.h);
               var1 = this.f.c((BasePointOverlay)var8);
            }

            if (var1 <= 0L) {
               var1 = Long.MAX_VALUE;
            } else if (var1 <= 100L) {
               var1 = 100L;
            }
         }
      }

      long var3 = System.currentTimeMillis();
      if (var3 - this.e > var1) {
         if (this.e != 0L) {
            try {
               this.a(this.h);
            } catch (RemoteException var6) {
               var6.printStackTrace();
            }
         }

         this.e = var3;
      }

   }

   private void m() {
      GLTransformation var1;
      if (!this.K && this.I != null && !this.I.hasEnded()) {
         this.J = true;
         var1 = new GLTransformation();
         this.I.getTransformation(AnimationUtils.currentAnimationTimeMillis(), var1);
         if (var1 != null && !Double.isNaN(var1.scaleX) && !Double.isNaN(var1.scaleY)) {
            this.y = (float)var1.scaleX;
         }
      } else if (this.H != null && !this.H.hasEnded()) {
         this.K = false;
         this.J = true;
         this.j = this.l;
         this.k = this.m;
         var1 = new GLTransformation();
         this.H.getTransformation(AnimationUtils.currentAnimationTimeMillis(), var1);
         if (var1 != null && !Double.isNaN(var1.scaleX) && !Double.isNaN(var1.scaleY)) {
            this.y = (float)var1.scaleX;
         }
      } else {
         this.y = 1.0F;
         this.J = false;
      }

   }

   public void setInfoWindowAnimation(Animation var1, Animation$AnimationListener var2) {
   }

   public void setInfoWindowAppearAnimation(Animation var1) {
      if (this.I != null && this.I.equals(var1.glAnimation)) {
         try {
            this.H = var1.glAnimation.clone();
         } catch (Throwable var3) {
            ht.c(var3, "PopupOverlay", "setInfoWindowDisappearAnimation");
         }
      } else {
         this.H = var1.glAnimation;
      }

   }

   public void setInfoWindowBackColor(int var1) {
   }

   public void setInfoWindowBackEnable(boolean var1) {
   }

   public void setInfoWindowBackScale(float var1, float var2) {
   }

   public void setInfoWindowDisappearAnimation(Animation var1) {
      if (this.H != null && this.H.equals(var1.glAnimation)) {
         try {
            this.I = var1.glAnimation.clone();
         } catch (Throwable var3) {
            ht.c(var3, "PopupOverlay", "setInfoWindowDisappearAnimation");
         }
      } else {
         this.I = var1.glAnimation;
      }

   }

   public void setInfoWindowMovingAnimation(Animation var1) {
   }

   public void startAnimation() {
   }

   private int n() {
      int[] var1 = new int[]{0};
      GLES20.glGenTextures(1, var1, 0);
      int var2 = var1[0];
      return var2;
   }

   public void c(int var1, int var2) throws RemoteException {
      if (this.J) {
         this.l = var1;
         this.m = var2;
      } else {
         this.j = var1;
         this.k = var2;
         this.l = var1;
         this.m = var2;
      }

   }

   public void setZIndex(float var1) {
   }

   public float getZIndex() {
      return 0.0F;
   }

   public boolean a() {
      return true;
   }

   public void remove() throws RemoteException {
   }

   private void b(boolean var1) {
      if (var1) {
         this.b(this.k());
      } else {
         this.b(this.l());
      }

   }

   private void c(boolean var1) {
      if (this.I != null) {
         this.K = false;
         this.J = true;
         this.I.startNow();
         this.I.setAnimationListener(new ds$1(this, var1));
      } else if (this.H != null) {
         this.J = true;
         this.H.startNow();
         this.b(var1);
      } else {
         this.b(var1);
      }

   }

   private void o() {
      if (this.A && this.v != null) {
         this.c(false);
      } else {
         this.b(this.l());
      }

      this.a(false);
   }

   private void p() {
      if (!this.A && this.v != null) {
         this.c(true);
      } else {
         this.b(this.k());
      }

      this.a(true);
   }

   public void destroy() {
      if (this.i) {
         try {
            this.remove();
            this.q();
            if (this.r != null) {
               this.r.clear();
               this.r = null;
            }

            if (this.o != null) {
               this.o.clear();
               this.o = null;
            }

            this.n = null;
            this.z = 0;
         } catch (Throwable var2) {
            ht.c(var2, "PopupOverlay", "realDestroy");
            var2.printStackTrace();
         }
      }

   }

   private synchronized void q() {
      if (this.v != null) {
         Bitmap var1 = this.v;
         if (var1 != null) {
            var1.recycle();
            var1 = null;
            this.v = null;
         }
      }

      if (this.w != null && !this.w.isRecycled()) {
         this.w.recycle();
         this.w = null;
      }

      if (this.B != null && !this.B.isRecycled()) {
         this.B.recycle();
      }

      if (this.C != null && !this.C.isRecycled()) {
         this.C.recycle();
      }

      if (this.D != null && !this.D.isRecycled()) {
         this.D.recycle();
      }

      if (this.E != null && !this.E.isRecycled()) {
         this.E.recycle();
      }

   }

   public boolean c() {
      return false;
   }

   public void a(MapConfig var1) throws RemoteException {
   }

   public void a(FPoint var1) {
      this.n = var1;
   }

   private void r() {
   }

   public boolean i() {
      return this.J;
   }

   public synchronized void a(m var1) throws RemoteException {
      if (var1 != null) {
         if (var1.isInfoWindowEnable()) {
            if (this.h != null && !this.h.getId().equals(var1.getId())) {
               this.a_();
            }

            if (this.f != null) {
               this.h = var1;
               var1.a(true);
               this.setVisible(true);
               this.j();
            }

            this.F = true;
         }
      }
   }

   protected void j() {
      try {
         Bitmap var2;
         View var3;
         if (this.h instanceof dm) {
            Marker var1 = new Marker((IMarker)this.h);
            if (this.f != null) {
               var2 = this.a(this.f.a((BasePointOverlay)var1));
               if (var2 == null) {
                  var3 = this.f.b((BasePointOverlay)var1);
                  if (var3 != null) {
                     if (var3.getBackground() == null) {
                        var3.setBackground(this.f.f());
                     }

                     var2 = this.a(var3);
                  }
               }

               this.a(var2);
               this.d(this.a(this.f.a(var1)));
               this.e(this.a(this.f.b(var1)));
               this.f(this.a(this.f.c(var1)));
            }
         } else if (this.f != null) {
            GL3DModel var5 = new GL3DModel((cx)this.h);
            var2 = this.a(this.f.a((BasePointOverlay)var5));
            if (var2 == null) {
               var3 = this.f.b((BasePointOverlay)var5);
               if (var3 != null) {
                  if (var3.getBackground() == null) {
                     var3.setBackground(this.f.f());
                  }

                  var2 = this.a(var3);
               }
            }

            this.a(var2);
         }
      } catch (Throwable var4) {
         ht.c(var4, "PopupOverlay", "getInfoWindow");
         var4.printStackTrace();
      }

   }

   private Bitmap a(View var1) {
      if (var1 == null) {
         return null;
      } else {
         if (var1 instanceof RelativeLayout && this.g != null) {
            LinearLayout var2 = new LinearLayout(this.g);
            var2.setOrientation(1);
            var2.addView((View)var1);
            var1 = var2;
         }

         ((View)var1).setDrawingCacheEnabled(true);
         ((View)var1).setDrawingCacheQuality(0);
         Bitmap var3 = fi.a((View)var1);
         return var3;
      }
   }

   private Rect s() {
      return new Rect(this.x.left, this.x.top, this.x.right, this.x.top + this.u());
   }

   private Rect t() {
      return new Rect(this.x.left, this.x.top, this.x.right, this.x.top + this.v());
   }

   private int u() {
      return this.B != null && !this.B.isRecycled() ? this.B.getHeight() : 0;
   }

   private int v() {
      return this.D != null && !this.D.isRecycled() ? this.D.getHeight() : 0;
   }

   public void b() {
      try {
         synchronized(this) {
            if (this.h == null || !this.h.h()) {
               this.setVisible(false);
               return;
            }
         }

         this.setVisible(true);
         Rect var1 = this.h.i();
         byte var2 = 2;
         int var3 = this.h.e() + this.h.c();
         int var4 = this.h.f() + this.h.d() + var2;
         if (this.h instanceof dm) {
            synchronized(this) {
               boolean var6 = !this.i() || this.v == null && (this.B != null || this.D != null);
               if (var6) {
                  IMarkerAction var7 = ((dm)this.h).getIMarkerAction();
                  if (var7 != null && !var7.isInfoWindowEnable()) {
                     this.setVisible(false);
                     return;
                  }

                  this.setVisible(true);
                  if (var7 != null && var7.isInfoWindowAutoOverturn()) {
                     Rect var9 = this.s();
                     Rect var10 = this.t();
                     if (this.d()) {
                        var10.offset(0, var1.height() + var9.height() + var2);
                     } else {
                        var9.offset(0, -(var1.height() + var9.height() + var2));
                     }

                     int var11 = this.a.a(var7, var9);
                     int var12 = this.a.a(var7, var10);
                     boolean var13 = var11 > 0 && (var12 == 0 || var12 > 0 && var11 < var12);
                     if (var13) {
                        var4 = this.h.f() + this.h.d() + var2 + var1.height() + var10.height();
                        this.o();
                     } else {
                        this.p();
                     }

                     this.a(this.h.a());
                     this.c(var3, var4);
                  } else {
                     this.a(this.h.a());
                     this.c(var3, var4);
                     this.p();
                  }
               }
            }
         } else if (!this.i() || this.v == null && (this.B != null || this.D != null)) {
            if (!this.h.isInfoWindowEnable()) {
               this.setVisible(false);
               return;
            }

            this.setVisible(true);
            this.a(this.h.a());
            this.c(var3, var4);
            this.p();
         }
      } catch (Throwable var17) {
         var17.printStackTrace();
      }

   }

   public boolean a(MotionEvent var1) {
      if (this.q && this.h != null && this.F) {
         return fi.a(this.x, (int)var1.getX(), (int)var1.getY());
      } else {
         return false;
      }
   }

   public synchronized void a_() {
      this.setVisible(false);
      this.q();
      this.F = false;
   }

   public boolean isAboveMaskLayer() {
      return false;
   }

   public void setAboveMaskLayer(boolean var1) {
   }

   public void a(ay var1) {
      synchronized(this) {
         this.f = var1;
      }
   }
}
