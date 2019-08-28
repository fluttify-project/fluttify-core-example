package com.amap.api.mapcore.util;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.RemoteException;
import android.util.Log;
import android.view.MotionEvent;
import com.amap.api.maps.model.LatLngBounds;
import com.amap.api.maps.model.LatLngBounds$Builder;
import com.amap.api.maps.model.Marker;
import com.amap.api.maps.model.MarkerOptions;
import com.amap.api.maps.model.Text;
import com.amap.api.maps.model.TextOptions;
import com.autonavi.amap.mapcore.IPoint;
import com.autonavi.amap.mapcore.MapConfig;
import com.autonavi.amap.mapcore.interfaces.IMarker;
import java.nio.FloatBuffer;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class aa {
   u a;
   private List<dg> f = new ArrayList(500);
   private List<ad> g = new ArrayList();
   private List<dg> h = new ArrayList();
   private aa$a i = new aa$a();
   private boolean j = true;
   private IPoint k;
   private m l;
   private dd m;
   private fo n;
   private ew o;
   private FloatBuffer p;
   private HandlerThread q;
   private Handler r;
   private int[] s = new int[1];
   float[] b = new float[180000];
   public dw$d c;
   int d = 0;
   int e = 0;
   private Runnable t = new aa$2(this);

   public aa(Context var1, u var2) {
      this.a = var2;
      this.n = new fo(512, 1024);
      this.o = new ew();
      this.q = new HandlerThread("AMapZindexSortThread");
      this.q.start();
      this.r = new Handler(this.q.getLooper());
   }

   public Marker a(MarkerOptions var1) throws RemoteException {
      if (var1 == null) {
         return null;
      } else {
         dm var2 = new dm(var1, this);
         List var3 = this.f;
         synchronized(this.f) {
            this.d(var2);
            es.a(this.f.size());
            return new Marker(var2);
         }
      }
   }

   public ArrayList<Marker> a(ArrayList<MarkerOptions> var1, boolean var2) throws RemoteException {
      if (var1 != null && var1.size() != 0) {
         ArrayList var3 = new ArrayList();

         try {
            MarkerOptions var4 = null;
            if (var1.size() == 1 && (var4 = (MarkerOptions)var1.get(0)) != null) {
               var3.add(this.a(var4));
               if (var2 && var4.getPosition() != null) {
                  this.a.a(an.a(var4.getPosition(), 18.0F));
               }
            } else {
               LatLngBounds$Builder var5 = LatLngBounds.builder();

               for(int var6 = 0; var6 < var1.size(); ++var6) {
                  var4 = (MarkerOptions)var1.get(var6);
                  if (var1.get(var6) != null) {
                     var3.add(this.a(var4));
                     if (var4.getPosition() != null) {
                        var5.include(var4.getPosition());
                     }
                  }
               }

               if (var2 && var3.size() > 0) {
                  this.a.getMainHandler().postDelayed(new aa$1(this, var5), 50L);
               }
            }

            return var3;
         } catch (Throwable var7) {
            ht.c(var7, "AMapDelegateImpGLSurfaceView", "addMarkers");
            var7.printStackTrace();
            return var3;
         }
      } else {
         return null;
      }
   }

   public Text a(TextOptions var1) throws RemoteException {
      if (var1 == null) {
         return null;
      } else {
         List var2 = this.f;
         synchronized(this.f) {
            dt var3 = new dt(var1, this);
            this.d(var3);
            return new Text(var3);
         }
      }
   }

   private void d(dg var1) {
      try {
         this.f.add(var1);
         this.f();
      } catch (Throwable var3) {
         ht.c(var3, "MapOverlayImageView", "addMarker");
      }

   }

   public boolean a(dg var1) {
      List var2 = this.f;
      synchronized(this.f) {
         try {
            if (this.m != null && this.m.getId().equals(var1.getId())) {
               this.m = null;
            }

            this.b(var1);
         } catch (Throwable var5) {
            var5.printStackTrace();
         }

         return this.f.remove(var1);
      }
   }

   public void a(dd var1) {
      try {
         if (this.m != null) {
            if (var1 != null && var1.getId().equals(this.m.getId())) {
               return;
            }

            this.m.b(false);
         }

         if (!this.f.contains(var1)) {
            return;
         }

         if (var1 != null) {
            var1.b(true);
         }

         this.m = var1;
      } catch (Throwable var3) {
         ht.c(var3, "MapOverlayImageView", "set2Top");
      }

   }

   public void a() {
      this.m = null;
   }

   public void a(m var1) {
      if (this.k == null) {
         this.k = IPoint.obtain();
      }

      Rect var2 = var1.i();
      this.k = IPoint.obtain(var2.left + var2.width() / 2, var2.top);
      this.l = var1;

      try {
         this.a.a(this.l);
      } catch (Throwable var4) {
         ht.c(var4, "MapOverlayImageView", "showInfoWindow");
         var4.printStackTrace();
      }

   }

   public void b(dg var1) {
      try {
         if (var1.isInfoWindowShown()) {
            this.a.i();
            this.l = null;
         } else if (this.l != null && this.l.getId().equals(var1.getId())) {
            this.l = null;
         }
      } catch (Throwable var3) {
         var3.printStackTrace();
      }

   }

   private void j() {
      try {
         Collections.sort(this.f, this.i);
      } catch (Throwable var2) {
         ht.c(var2, "MapOverlayImageView", "changeOverlayIndex");
      }

   }

   public void a(boolean var1) {
      try {
         if (this.a == null) {
            return;
         }

         float var2 = this.a.getMapConfig().getMapPerPixelUnitLength();
         List var3 = this.f;
         synchronized(this.f) {
            this.h();
            if (this.f.size() == 0) {
               return;
            }

            this.h.clear();
            int var4 = this.f.size();

            int var6;
            for(var6 = 0; var6 < var4; ++var6) {
               dg var5 = (dg)this.f.get(var6);
               if (!var1) {
                  if (var5.getZIndex() == 2.14748365E9F) {
                     continue;
                  }
               } else if (var5.getZIndex() != 2.14748365E9F) {
                  continue;
               }

               if (var5.isVisible() && !var5.l()) {
                  this.j = var5.j();
                  if (var5.h() || var5.isInfoWindowShown()) {
                     try {
                        this.h.add(var5);
                     } catch (Throwable var17) {
                        var17.printStackTrace();
                     }
                  }
               }
            }

            if (this.m != null && this.m.isVisible()) {
               this.h.add(this.m);
            }

            var6 = this.h.size();
            int var7 = 0;
            boolean var8 = false;
            if (var6 > 0) {
               int var9 = 0;
               int var10 = 0;
               int var11 = 0;
               dg var12 = null;
               var4 = this.h.size();

               for(int var13 = 0; var13 < var4; ++var13) {
                  var12 = (dg)this.h.get(var13);
                  synchronized(var12) {
                     var12.a(this.a);
                     int var21;
                     if (var13 == 0) {
                        var7 = var12.k();
                     } else {
                        var21 = var12.k();
                        if (var21 != var7) {
                           this.a(var7, var9, var11, var10);
                           var9 = 0;
                           var10 = 0;
                           var11 = 0;
                           var7 = var21;
                        }
                     }

                     var12.a(this.a, this.b, var10, var2);
                     var21 = var12.k();
                     if (var21 != var7) {
                        this.a(var7, var9, var11, var10);
                        var11 = var10;
                        var9 = 0;
                        var10 = 0;
                        var7 = var21;
                     }

                     var10 += 36;
                     ++var9;
                     if (var9 == 5000) {
                        this.a(var7, var9, var11, var10);
                        var9 = 0;
                        var10 = 0;
                        var11 = 0;
                     }
                  }
               }

               if (var9 > 0) {
                  this.a(var7, var9, var11, var10);
                  boolean var22 = false;
                  boolean var23 = false;
                  boolean var24 = false;
               }
            }
         }
      } catch (Throwable var20) {
         var20.printStackTrace();
      }

   }

   private void a(int var1, int var2, int var3, int var4) {
      if (var2 != 0 && var1 != 0) {
         this.p = this.o.c(var2 * 36);
         this.p.put(this.b, var3, var4);
         this.p.flip();
         this.a(var2);
         this.a(var1, var4, var2, this.p, this.a.getMapConfig());
         this.o.a();
      }
   }

   private void a(int var1) {
      if (var1 > 5000) {
         var1 = 5000;
      }

      if (this.d == 0) {
         int[] var2 = new int[2];
         GLES20.glGenBuffers(2, var2, 0);
         this.d = var2[0];
         this.e = var2[1];
         ShortBuffer var3 = this.o.b(30000);
         short[] var4 = new short[30000];

         for(int var5 = 0; var5 < 5000; ++var5) {
            var4[6 * var5 + 0] = (short)(4 * var5 + 0);
            var4[6 * var5 + 1] = (short)(4 * var5 + 1);
            var4[6 * var5 + 2] = (short)(4 * var5 + 2);
            var4[6 * var5 + 3] = (short)(4 * var5 + 0);
            var4[6 * var5 + 4] = (short)(4 * var5 + 2);
            var4[6 * var5 + 5] = (short)(4 * var5 + 3);
         }

         var3.put(var4);
         var3.flip();
         GLES20.glBindBuffer(34963, this.e);
         GLES20.glBufferData(34963, 60000, var3, 35044);
         Object var6 = null;
      }

      GLES20.glBindBuffer(34962, this.d);
      GLES20.glBufferData(34962, var1 * 36 * 4, this.p, 35044);
   }

   private void k() {
      if (this.c == null && this.a != null) {
         this.c = (dw$d)this.a.u(1);
      }

   }

   private void a(int var1, int var2, int var3, FloatBuffer var4, MapConfig var5) {
      if (var1 != 0 && var4 != null && var3 != 0) {
         if (this.c == null || this.c.c()) {
            this.k();
         }

         this.c.a();
         GLES20.glUniform1f(this.c.h, var5.getSR());
         GLES20.glEnableVertexAttribArray(this.c.b);
         GLES20.glBindBuffer(34962, this.d);
         GLES20.glVertexAttribPointer(this.c.b, 4, 5126, false, 36, 0);
         GLES20.glEnable(3042);
         GLES20.glBlendFunc(1, 771);
         GLES20.glActiveTexture(33984);
         GLES20.glBindTexture(3553, var1);
         GLES20.glEnableVertexAttribArray(this.c.c);
         GLES20.glBindBuffer(34962, this.d);
         GLES20.glVertexAttribPointer(this.c.c, 2, 5126, false, 36, 16);
         GLES20.glEnableVertexAttribArray(this.c.g);
         GLES20.glBindBuffer(34962, this.d);
         GLES20.glVertexAttribPointer(this.c.g, 3, 5126, false, 36, 24);
         GLES20.glUniformMatrix4fv(this.c.a, 1, false, this.b(), 0);
         GLES20.glBindBuffer(34963, this.e);
         GLES20.glDrawElements(4, 6 * var3, 5123, 0);
         GLES20.glBindBuffer(34962, 0);
         GLES20.glBindBuffer(34963, 0);
         GLES20.glBindTexture(3553, 0);
         GLES20.glDisableVertexAttribArray(this.c.b);
         GLES20.glDisableVertexAttribArray(this.c.c);
         GLES20.glDisable(3042);
         GLES20.glUseProgram(0);
      }
   }

   public synchronized boolean a(Bitmap var1, ad var2) {
      byte var3 = 1;
      float var4 = 0.5F;
      fo$c var5 = this.n.a(var1.getWidth() + var3, var1.getHeight() + var3, var2.o());
      if (var5 != null) {
         var2.f((float)var5.a / (float)this.n.a());
         var2.e((float)var5.b / (float)this.n.b());
         var2.g((float)(var5.a + var5.c - var3) / (float)this.n.a());
         var2.h((float)(var5.b + var5.d - var3) / (float)this.n.b());
         var2.c(((float)var5.a + var4) / (float)this.n.a());
         var2.d(((float)var5.b + var4) / (float)this.n.b());
         var2.a(((float)(var5.a + var5.c - var3) - var4) / (float)this.n.a());
         var2.b(((float)(var5.b + var5.d - var3) - var4) / (float)this.n.b());
         var2.a(true);
         return true;
      } else {
         return false;
      }
   }

   public float[] b() {
      return this.a != null ? this.a.x() : new float[16];
   }

   public u c() {
      return this.a;
   }

   public m d() {
      return this.l;
   }

   public m a(MotionEvent var1) {
      List var2 = this.f;
      synchronized(this.f) {
         for(int var3 = this.f.size() - 1; var3 >= 0; --var3) {
            dg var4 = (dg)this.f.get(var3);
            if (var4 instanceof dm) {
               Rect var5 = var4.i();
               boolean var6 = fi.a(var5, (int)var1.getX(), (int)var1.getY());
               if (var6) {
                  this.l = (dm)var4;
                  return this.l;
               }
            }
         }

         return null;
      }
   }

   public boolean b(MotionEvent var1) throws RemoteException {
      List var2 = this.f;
      synchronized(this.f) {
         boolean var3 = false;
         Rect var4 = null;

         for(int var5 = this.f.size() - 1; var5 >= 0; --var5) {
            dg var6 = (dg)this.f.get(var5);
            if (var6 instanceof dm && var6.isVisible() && ((dm)var6).isClickable()) {
               var4 = var6.i();
               boolean var7 = fi.a(var4, (int)var1.getX(), (int)var1.getY());
               if (var7) {
                  var3 = var7;
                  this.k = IPoint.obtain(var4.left + var4.width() / 2, var4.top);
                  this.l = (dm)var6;
                  break;
               }
            }
         }

         return var3;
      }
   }

   public List<Marker> e() {
      List var1 = this.f;
      synchronized(this.f) {
         ArrayList var2 = new ArrayList();

         try {
            Iterator var3 = this.f.iterator();

            while(var3.hasNext()) {
               dg var4 = (dg)var3.next();
               if (var4 instanceof dm && var4.h()) {
                  var2.add(new Marker((IMarker)var4));
               }
            }
         } catch (Throwable var6) {
            ht.c(var6, "MapOverlayImageView", "getMapScreenMarkers");
            var6.printStackTrace();
         }

         return var2;
      }
   }

   public void f() {
      if (this.r != null) {
         this.r.removeCallbacks(this.t);
         this.r.postDelayed(this.t, 10L);
      }

   }

   public boolean c(dg var1) {
      List var2 = this.f;
      synchronized(this.f) {
         return this.f.contains(var1);
      }
   }

   protected int g() {
      List var1 = this.f;
      synchronized(this.f) {
         return this.f.size();
      }
   }

   public void a(String var1) {
      try {
         boolean var2 = var1 == null || var1.trim().length() == 0;
         this.l = null;
         this.k = null;
         this.m = null;
         List var3 = this.f;
         synchronized(this.f) {
            this.h.clear();
            if (var2) {
               this.f.clear();
            } else {
               dg var4 = null;
               dg var5 = null;
               int var6 = this.f.size();

               for(int var7 = 0; var7 < var6; ++var7) {
                  var5 = (dg)this.f.get(var7);
                  if (var1.equals(var5.getId())) {
                     var4 = var5;
                     break;
                  }
               }

               this.f.clear();
               if (var4 != null) {
                  this.f.add(var4);
                  if (var4.l() && var4 instanceof dd) {
                     this.m = (dd)var4;
                  }
               }
            }
         }
      } catch (Throwable var10) {
         ht.c(var10, "MapOverlayImageView", "clear");
         var10.printStackTrace();
      }

   }

   public void a(ad var1) {
      List var2 = this.g;
      synchronized(this.g) {
         if (var1 != null) {
            this.g.add(var1);
         }

      }
   }

   public void h() {
      List var1 = this.g;
      synchronized(this.g) {
         int var3 = this.a.e();

         for(int var4 = 0; var4 < this.g.size(); ++var4) {
            ad var2 = (ad)this.g.get(var4);
            if (var2 != null) {
               var2.m();
               if (var2.n() <= 0) {
                  if (var2.k() == var3) {
                     this.n.a(var2.o());
                  } else {
                     this.s[0] = var2.k();
                     GLES20.glDeleteTextures(1, this.s, 0);
                  }

                  if (this.a != null) {
                     this.a.c(var2.o());
                  }
               }
            }
         }

         this.g.clear();
      }
   }

   public void i() {
      try {
         Iterator var1 = this.f.iterator();

         while(var1.hasNext()) {
            dg var2 = (dg)var1.next();
            if (var2 != null) {
               var2.destroy(false);
            }
         }

         this.a((String)null);
         if (this.q != null) {
            this.q.quit();
         }

         this.r = null;
         this.a = null;
      } catch (Throwable var3) {
         ht.c(var3, "MapOverlayImageView", "destroy");
         var3.printStackTrace();
         Log.d("amapApi", "MapOverlayImageView clear erro" + var3.getMessage());
      }

   }
}
