package com.amap.api.mapcore.util;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.Bitmap.Config;
import android.graphics.Paint.Align;
import android.graphics.Paint.Cap;
import android.graphics.Paint.FontMetrics;
import android.opengl.GLES20;
import android.os.RemoteException;
import android.os.Build.VERSION;
import android.util.Log;
import com.amap.api.maps.model.BitmapDescriptor;
import com.amap.api.maps.model.BitmapDescriptorFactory;
import com.amap.api.maps.model.LatLng;
import com.amap.api.maps.model.TextOptions;
import com.autonavi.ae.gmap.GLMapState;
import com.autonavi.amap.mapcore.FPoint;
import com.autonavi.amap.mapcore.IPoint;
import com.autonavi.amap.mapcore.Rectangle;
import com.autonavi.amap.mapcore.interfaces.IOverlayImage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class dt implements dk {
   private static int a = 0;
   private float b = 0.0F;
   private float c = 0.0F;
   private int d = 4;
   private int e = 32;
   private FPoint f = FPoint.obtain();
   private int g;
   private BitmapDescriptor h;
   private int i;
   private int j;
   private String k;
   private LatLng l;
   private float m = 0.5F;
   private float n = 1.0F;
   private boolean o = true;
   private aa p;
   private Object q;
   private String r;
   private int s;
   private int t;
   private int u;
   private Typeface v;
   private float w;
   private Rect x = new Rect();
   private Paint y = new Paint();
   private int z;
   private int A;
   private boolean B = false;
   private List<ad> C = new ArrayList();
   private boolean D = false;
   private boolean E = false;
   private float[] F = new float[]{-1.0F, -1.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, -1.0F, 1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 1.0F, 1.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F};

   private static String a(String var0) {
      ++a;
      return var0 + a;
   }

   public void setRotateAngle(float var1) {
      this.c = var1;
      this.b = (-var1 % 360.0F + 360.0F) % 360.0F;
      this.c();
   }

   public void destroy(boolean var1) {
      try {
         this.D = true;
         if (var1) {
            this.remove();
         }

         if (this.C != null && this.C.size() > 0) {
            for(int var3 = 0; var3 < this.C.size(); ++var3) {
               ad var2 = (ad)this.C.get(var3);
               if (var2 != null && this.p != null) {
                  this.p.a(var2);
                  if (this.p.c() != null) {
                     this.p.c().c(var2.o());
                  }
               }
            }

            this.C.clear();
         }

         if (this.h != null) {
            this.h.recycle();
            this.h = null;
         }

         this.l = null;
         this.q = null;
      } catch (Throwable var4) {
         ht.c(var4, "TextDelegateImp", "destroy");
         var4.printStackTrace();
         Log.d("destroy erro", "TextDelegateImp destroy");
      }

   }

   public dt(TextOptions var1, aa var2) throws RemoteException {
      this.p = var2;
      if (var1.getPosition() != null) {
         this.l = var1.getPosition();
      }

      this.setAlign(var1.getAlignX(), var1.getAlignY());
      this.o = var1.isVisible();
      this.r = var1.getText();
      this.s = var1.getBackgroundColor();
      this.t = var1.getFontColor();
      this.u = var1.getFontSize();
      this.q = var1.getObject();
      this.w = var1.getZIndex();
      this.v = var1.getTypeface();
      this.k = this.getId();
      this.setRotateAngle(var1.getRotate());
      this.b();
      this.a();
   }

   private void b() {
      if (this.r != null && this.r.trim().length() > 0) {
         try {
            this.y.setTypeface(this.v);
            this.y.setSubpixelText(true);
            this.y.setAntiAlias(true);
            this.y.setStrokeWidth(5.0F);
            this.y.setStrokeCap(Cap.ROUND);
            this.y.setTextSize((float)this.u);
            this.y.setTextAlign(Align.CENTER);
            this.y.setColor(this.t);
            FontMetrics var1 = this.y.getFontMetrics();
            int var2 = (int)(var1.descent - var1.ascent);
            int var3 = (int)(((float)var2 - var1.bottom - var1.top) / 2.0F);
            this.y.getTextBounds(this.r, 0, this.r.length(), this.x);
            Bitmap var4 = Bitmap.createBitmap(this.x.width() + 6, var2, Config.ARGB_8888);
            Canvas var5 = new Canvas(var4);
            var5.drawColor(this.s);
            var5.drawText(this.r, (float)(this.x.centerX() + 3), (float)var3, this.y);
            this.h = BitmapDescriptorFactory.fromBitmap(var4);
            this.i = this.h.getWidth();
            this.j = this.h.getHeight();
         } catch (Throwable var6) {
            ht.c(var6, "TextDelegateImp", "initBitmap");
         }

      }
   }

   public synchronized boolean remove() {
      this.c();
      this.o = false;
      return this.p.a((dg)this);
   }

   private void c() {
      if (this.p.c() != null) {
         this.p.c().setRunLowFrame(false);
      }

   }

   public LatLng getPosition() {
      return this.l;
   }

   public String getId() {
      if (this.k == null) {
         this.k = a("Text");
      }

      return this.k;
   }

   public void setPosition(LatLng var1) {
      this.l = var1;
      this.a();
      this.c();
   }

   public boolean isInfoWindowShown() {
      return false;
   }

   public void setVisible(boolean var1) {
      if (this.o != var1) {
         this.o = var1;
         this.c();
      }
   }

   public boolean isVisible() {
      return this.o;
   }

   public void setZIndex(float var1) {
      this.w = var1;
      this.p.f();
   }

   public float getZIndex() {
      return this.w;
   }

   public void setAnchor(float var1, float var2) {
   }

   public float getAnchorU() {
      return this.m;
   }

   public float getAnchorV() {
      return this.n;
   }

   public boolean equalsRemote(IOverlayImage var1) throws RemoteException {
      return this.equals(var1) || var1.getId().equals(this.getId());
   }

   public int hashCodeRemote() {
      return super.hashCode();
   }

   public boolean a() {
      if (this.l == null) {
         return false;
      } else {
         IPoint var1 = IPoint.obtain();
         GLMapState.lonlat2Geo(this.l.longitude, this.l.latitude, var1);
         this.z = var1.x;
         this.A = var1.y;
         this.p.c().a(this.l.latitude, this.l.longitude, this.f);
         var1.recycle();
         return true;
      }
   }

   private void b(u var1, float[] var2, int var3, float var4) throws RemoteException {
      float var5 = var4 * (float)this.i;
      float var6 = var4 * (float)this.j;
      float var7 = this.f.x;
      float var8 = this.f.y;
      float var9 = var1.getMapConfig().getSC();
      byte var10 = 0;
      this.F[var10 * 9 + 0] = var7 - var5 * this.m;
      this.F[var10 * 9 + 1] = var8 + var6 * (1.0F - this.n);
      this.F[var10 * 9 + 2] = var7;
      this.F[var10 * 9 + 3] = var8;
      this.F[var10 * 9 + 6] = this.b;
      this.F[var10 * 9 + 7] = var9;
      int var11 = var10 + 1;
      this.F[var11 * 9 + 0] = var7 + var5 * (1.0F - this.m);
      this.F[var11 * 9 + 1] = var8 + var6 * (1.0F - this.n);
      this.F[var11 * 9 + 2] = var7;
      this.F[var11 * 9 + 3] = var8;
      this.F[var11 * 9 + 6] = this.b;
      this.F[var11 * 9 + 7] = var9;
      ++var11;
      this.F[var11 * 9 + 0] = var7 + var5 * (1.0F - this.m);
      this.F[var11 * 9 + 1] = var8 - var6 * this.n;
      this.F[var11 * 9 + 2] = var7;
      this.F[var11 * 9 + 3] = var8;
      this.F[var11 * 9 + 6] = this.b;
      this.F[var11 * 9 + 7] = var9;
      ++var11;
      this.F[var11 * 9 + 0] = var7 - var5 * this.m;
      this.F[var11 * 9 + 1] = var8 - var6 * this.n;
      this.F[var11 * 9 + 2] = var7;
      this.F[var11 * 9 + 3] = var8;
      this.F[var11 * 9 + 6] = this.b;
      this.F[var11 * 9 + 7] = var9;
      System.arraycopy(this.F, 0, var2, var3, this.F.length);
   }

   public void a(u var1, float[] var2, int var3, float var4) {
      if (this.o && !this.D && this.l != null && this.h != null) {
         this.f.x = (float)(this.z - var1.getMapConfig().getSX());
         this.f.y = (float)(this.A - var1.getMapConfig().getSY());

         try {
            this.b(var1, var2, var3, var4);
         } catch (Throwable var6) {
            ht.c(var6, "TextDelegateImp", "drawMarker");
         }

      }
   }

   public void a(u var1) {
      if (!this.E) {
         try {
            boolean var2 = VERSION.SDK_INT >= 12;
            this.g = this.a(var2, this.h);
            this.E = true;
         } catch (Throwable var3) {
            ht.c(var3, "TextDelegateImp", "loadtexture");
            var3.printStackTrace();
            return;
         }
      }

   }

   private void d() {
      if (this.C != null) {
         Iterator var1 = this.C.iterator();

         while(var1.hasNext()) {
            ad var2 = (ad)var1.next();
            if (var2 != null && this.p != null) {
               this.p.a(var2);
            }
         }

         this.C.clear();
      }

   }

   private void a(ad var1) {
      if (var1 != null) {
         this.C.add(var1);
         var1.l();
      }

   }

   private int a(boolean var1, BitmapDescriptor var2) {
      this.d();
      int var3 = 0;
      ad var4 = null;
      if (var1) {
         var4 = this.p.c().a(var2);
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
            var3 = this.e();
            var4.a(var3);
            if (var1) {
               this.p.c().a(var4);
            }

            this.a(var4);
            fi.b(var3, var5, true);
         }
      }

      return var3;
   }

   private int e() {
      int[] var1 = new int[]{0};
      GLES20.glGenTextures(1, var1, 0);
      return var1[0];
   }

   public boolean j() {
      return true;
   }

   public void setObject(Object var1) {
      this.q = var1;
   }

   public Object getObject() {
      return this.q;
   }

   public int k() {
      try {
         return this.g;
      } catch (Throwable var2) {
         return 0;
      }
   }

   public float getRotateAngle() {
      return this.c;
   }

   public Rect i() {
      return null;
   }

   public void setText(String var1) throws RemoteException {
      this.r = var1;
      this.f();
   }

   public String getText() throws RemoteException {
      return this.r;
   }

   public void setBackgroundColor(int var1) throws RemoteException {
      this.s = var1;
      this.f();
   }

   public int getBackgroundColor() throws RemoteException {
      return this.s;
   }

   public void setFontColor(int var1) throws RemoteException {
      this.t = var1;
      this.f();
   }

   public int getFontColor() throws RemoteException {
      return this.t;
   }

   public void setFontSize(int var1) throws RemoteException {
      this.u = var1;
      this.f();
   }

   public int getFontSize() throws RemoteException {
      return this.u;
   }

   public void setTypeface(Typeface var1) throws RemoteException {
      this.v = var1;
      this.f();
   }

   public Typeface getTypeface() throws RemoteException {
      return this.v;
   }

   public void setAlign(int var1, int var2) throws RemoteException {
      this.d = var1;
      switch(var1) {
      case 1:
         this.m = 0.0F;
         break;
      case 2:
         this.m = 1.0F;
         break;
      case 3:
      default:
         this.m = 0.5F;
         break;
      case 4:
         this.m = 0.5F;
      }

      this.e = var2;
      switch(var2) {
      case 8:
         this.n = 0.0F;
         break;
      case 16:
         this.n = 1.0F;
         break;
      case 32:
         this.n = 0.5F;
         break;
      default:
         this.n = 0.5F;
      }

      this.c();
   }

   public int getAlignX() throws RemoteException {
      return this.d;
   }

   public int getAlignY() {
      return this.e;
   }

   private synchronized void f() {
      this.b();
      this.E = false;
      this.c();
   }

   public boolean h() {
      Rectangle var1 = this.p.c().getMapConfig().getGeoRectangle();
      return var1 != null && var1.contains(this.z, this.A);
   }

   public void b(boolean var1) {
      this.B = var1;
   }

   public boolean l() {
      return this.B;
   }
}
