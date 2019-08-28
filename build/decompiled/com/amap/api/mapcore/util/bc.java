package com.amap.api.mapcore.util;

import android.graphics.Rect;
import android.opengl.Matrix;
import android.os.RemoteException;
import com.amap.api.maps.model.BitmapDescriptor;
import com.amap.api.maps.model.BitmapDescriptorFactory;
import com.amap.api.maps.model.MultiPointItem;
import com.amap.api.maps.model.MultiPointOverlayOptions;
import com.autonavi.amap.mapcore.IPoint;
import com.autonavi.amap.mapcore.MapConfig;
import com.autonavi.amap.mapcore.MapProjection;
import com.autonavi.amap.mapcore.interfaces.IMultiPointOverlay;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ThreadPoolExecutor.AbortPolicy;

public class bc implements IMultiPointOverlay {
   BitmapDescriptor a = BitmapDescriptorFactory.defaultMarker();
   BitmapDescriptor b = null;
   private String B;
   float c = 0.0F;
   float d = 0.0F;
   float e = 0.0F;
   float f = 0.5F;
   float g = 0.5F;
   List<MultiPointItem> h;
   be i = null;
   bb j = null;
   bb k = new bb(0, 1, 0, 1);
   List<MultiPointItem> l = new ArrayList();
   private float[] C = new float[]{-0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 0.5F, -0.5F, 0.0F, 0.0F, 1.0F, 0.0F};
   IPoint m;
   private boolean D = true;
   bd n;
   private static int E = 0;
   List<ba> o = new ArrayList();
   private ExecutorService F = null;
   private List<String> G = new ArrayList();
   private float[] H;
   float[] p;
   float[] q;
   float[] r;
   Rect s;
   bb t;
   bb u;
   int v;
   int w;
   float[] x;
   String y;
   String z;
   int A;

   public bc(MultiPointOverlayOptions var1, bd var2) {
      this.H = new float[ba.a * 3];
      this.p = new float[16];
      this.q = new float[4];
      this.r = new float[4];
      this.s = new Rect();
      this.t = null;
      this.u = null;
      this.v = 0;
      this.w = 0;
      this.x = new float[12];
      this.y = "precision highp float;\nattribute vec3 aVertex;//顶点数组,三维坐标\nuniform mat4 aMVPMatrix;//mvp矩阵\nvoid main(){\n  gl_Position = aMVPMatrix * vec4(aVertex, 1.0);\n}";
      this.z = "//有颜色 没有纹理\nprecision highp float;\nvoid main(){\n  gl_FragColor = vec4(0,0,1,1.0);\n}";
      this.A = -1;
      this.n = var2;
      this.a(var1);
      float[] var3 = this.a();
      ba var4 = new ba(var3, this);
      var4.a(var2.a());
      var4.a(this.b);
      this.o.add(var4);
   }

   private float[] a() {
      if (this.C == null) {
         return null;
      } else {
         float[] var1 = (float[])this.C.clone();
         float var2 = this.f - 0.5F;
         float var3 = this.g - 0.5F;
         var1[0] += var2;
         var1[1] -= var3;
         var1[6] += var2;
         var1[7] -= var3;
         var1[12] += var2;
         var1[13] -= var3;
         var1[18] += var2;
         var1[19] -= var3;
         return var1;
      }
   }

   private static String a(String var0) {
      ++E;
      return var0 + E;
   }

   private void a(MultiPointOverlayOptions var1) {
      if (var1 != null) {
         if (var1.getIcon() != null && var1.getIcon().getBitmap() != null && !var1.getIcon().getBitmap().isRecycled()) {
            this.b = var1.getIcon();
         } else {
            this.b = this.a;
         }

         this.f = var1.getAnchorU();
         this.g = var1.getAnchorV();
      }

   }

   public void addItems(List<MultiPointItem> var1) {
      try {
         if (var1 == null || var1.size() == 0) {
            return;
         }

         synchronized(this) {
            if (this.h == null) {
               this.h = new ArrayList();
            }

            this.h.clear();
            this.h.addAll(var1);
            int var3 = this.h.size();

            int var4;
            MultiPointItem var5;
            for(var4 = 0; var4 < var3; ++var4) {
               if (this.h == null) {
                  return;
               }

               var5 = (MultiPointItem)this.h.get(var4);
               if (var5 != null && var5.getLatLng() != null && var5.getIPoint() == null) {
                  IPoint var6 = new IPoint();
                  MapProjection.lonlat2Geo(var5.getLatLng().longitude, var5.getLatLng().latitude, var6);
                  var5.setIPoint(var6);
               }
            }

            if (this.i == null) {
               bb var10 = this.b();
               if (var10 != null) {
                  this.i = new be(var10);
               }
            }

            if (this.h != null) {
               var3 = this.h.size();

               for(var4 = 0; var4 < var3; ++var4) {
                  var5 = (MultiPointItem)this.h.get(var4);
                  if (var5 != null && var5.getIPoint() != null && this.i != null) {
                     this.i.a(var5);
                  }
               }
            }
         }

         this.d();
      } catch (Throwable var9) {
         ht.c(var9, "MultiPointOverlayDelegate", "addItems");
      }

   }

   public void addItem(MultiPointItem var1) {
      this.d();
   }

   private bb b() {
      if (this.h != null && this.h.size() != 0) {
         Iterator var1 = this.h.iterator();
         MultiPointItem var2 = (MultiPointItem)var1.next();
         int var3 = var2.getIPoint().x;
         int var4 = var2.getIPoint().x;
         int var5 = var2.getIPoint().y;
         int var6 = var2.getIPoint().y;

         while(var1.hasNext()) {
            MultiPointItem var7 = (MultiPointItem)var1.next();
            int var8 = var7.getIPoint().x;
            int var9 = var7.getIPoint().y;
            if (var8 < var3) {
               var3 = var8;
            }

            if (var8 > var4) {
               var4 = var8;
            }

            if (var9 < var5) {
               var5 = var9;
            }

            if (var9 > var6) {
               var6 = var9;
            }
         }

         return new bb(var3, var4, var5, var6);
      } else {
         return null;
      }
   }

   public void draw(MapConfig var1, float[] var2, float[] var3) {
      try {
         if (!this.D) {
            return;
         }

         this.c();
         if (this.o.size() < 1) {
            return;
         }

         if (this.i == null) {
            return;
         }

         if (var1 == null) {
            return;
         }

         float var4 = var1.getSR();
         float var5 = var1.getSC();
         if (var1.getChangeRatio() != 1.0D || this.l.size() == 0) {
            List var6 = this.l;
            synchronized(this.l) {
               this.a(var1);
               this.l.clear();
               this.c = var1.getMapPerPixelUnitLength();
               this.d = this.c * (float)this.b.getWidth();
               this.e = this.c * (float)this.b.getHeight();
               double var7 = (double)(this.d * this.e * 16.0F);
               this.a(this.d, this.e, var4, var5);
               this.i.a(this.j, this.l, var7);
            }
         }

         int var18 = 0;
         if (this.m == null) {
            this.m = new IPoint();
         }

         if (this.m != null && var1 != null) {
            this.m.x = var1.getSX();
            this.m.y = var1.getSY();
         }

         ba var19 = (ba)this.o.get(0);
         List var8 = this.l;
         synchronized(this.l) {
            Iterator var9 = this.l.iterator();

            while(var9.hasNext()) {
               MultiPointItem var10 = (MultiPointItem)var9.next();
               IPoint var11 = var10.getIPoint();
               if (var11 != null) {
                  int var12 = var11.x - this.m.x;
                  int var13 = var11.y - this.m.y;
                  if (var19 != null && var19.b()) {
                     if (!var19.d() && this.n != null) {
                        var19.a(this.n.a());
                     }

                     this.H[0 + var18 * 3] = (float)var12;
                     this.H[1 + var18 * 3] = (float)var13;
                     this.H[2 + var18 * 3] = 0.0F;
                     ++var18;
                     if (var18 >= ba.a) {
                        var19.a(var2, var3, this.H, this.d, this.e, var4, var5, var18);
                        var18 = 0;
                     }
                  }
               }
            }
         }

         if (var18 > 0) {
            var19.a(var2, var3, this.H, this.d, this.e, var4, var5, var18);
            boolean var20 = false;
         }
      } catch (Throwable var17) {
         ht.c(var17, "MultiPointOverlayDelegate", "draw");
      }

   }

   private void c() {
      if (this.F == null) {
         LinkedBlockingQueue var1 = new LinkedBlockingQueue();
         byte var2 = 1;
         byte var3 = 1;
         TimeUnit var4 = TimeUnit.SECONDS;
         ev var5 = new ev("MultiPointOverlay");
         this.F = new ThreadPoolExecutor(var2, var2 * 2, (long)var3, var4, var1, var5, new AbortPolicy());
      }

      Iterator var6 = this.o.iterator();

      while(var6.hasNext()) {
         ba var7 = (ba)var6.next();
         if (var7 != null && !var7.b()) {
            String var8 = var7.hashCode() + "";
            if (!this.G.contains(var8)) {
               this.G.add(var8);
               this.F.execute(new bc$1(this, var7, var8));
            }
         }
      }

   }

   private void a(MapConfig var1) {
      if (var1 != null) {
         Rect var2 = var1.getGeoRectangle().getRect();
         if (this.j == null) {
            this.j = new bb(var2.left, var2.right, var2.top, var2.bottom);
         } else {
            this.j.a(var2.left, var2.right, var2.top, var2.bottom);
         }
      }

   }

   private void a(float var1, float var2, float var3, float var4) {
      if (this.k == null) {
         this.k = new bb(0, 1, 0, 1);
      }

      this.s.set(0, 0, 0, 0);
      IPoint var5 = new IPoint();
      float var8 = this.f;
      float var9 = this.g;
      Matrix.setIdentityM(this.p, 0);
      Matrix.rotateM(this.p, 0, -var3, 0.0F, 0.0F, 1.0F);
      this.r[0] = 0.0F;
      this.r[1] = 0.0F;
      this.r[2] = 0.0F;
      this.r[3] = 0.0F;
      this.q[0] = -var1 * var8;
      this.q[1] = var2 * var9;
      this.q[2] = 0.0F;
      this.q[3] = 1.0F;
      Matrix.multiplyMV(this.r, 0, this.p, 0, this.q, 0);
      this.s.set((int)((float)var5.x + this.r[0]), (int)((float)var5.y - this.r[1]), (int)((float)var5.x + this.r[0]), (int)((float)var5.y - this.r[1]));
      this.q[0] = var1 * (1.0F - var8);
      this.q[1] = var2 * var9;
      this.q[2] = 0.0F;
      this.q[3] = 1.0F;
      Matrix.multiplyMV(this.r, 0, this.p, 0, this.q, 0);
      this.s.union((int)((float)var5.x + this.r[0]), (int)((float)var5.y - this.r[1]));
      this.q[0] = var1 * (1.0F - var8);
      this.q[1] = -var2 * (1.0F - var9);
      this.q[2] = 0.0F;
      this.q[3] = 1.0F;
      Matrix.multiplyMV(this.r, 0, this.p, 0, this.q, 0);
      this.s.union((int)((float)var5.x + this.r[0]), (int)((float)var5.y - this.r[1]));
      this.q[0] = -var1 * var8;
      this.q[1] = -var2 * (1.0F - var9);
      this.q[2] = 0.0F;
      this.q[3] = 1.0F;
      Matrix.multiplyMV(this.r, 0, this.p, 0, this.q, 0);
      this.s.union((int)((float)var5.x + this.r[0]), (int)((float)var5.y - this.r[1]));
      this.k.a(this.s.left, this.s.right, this.s.top, this.s.bottom);
   }

   public MultiPointItem onClick(IPoint var1) {
      if (this.D && this.i != null) {
         if (this.t == null) {
            this.t = new bb(0, 1, 0, 1);
         }

         int var2 = (int)(this.c * 8.0F);
         this.t.a(var1.x - var2, var1.x + var2, var1.y - var2, var1.y + var2);
         List var3 = this.l;
         synchronized(this.l) {
            int var4 = this.l.size();

            for(int var5 = var4 - 1; var5 >= 0; --var5) {
               MultiPointItem var6 = (MultiPointItem)this.l.get(var5);
               IPoint var7 = var6.getIPoint();
               if (var7 != null) {
                  if (this.k == null) {
                     return null;
                  }

                  if (this.u == null) {
                     this.u = new bb(0, 1, 0, 1);
                  }

                  this.u.a(var7.x + this.k.a, var7.x + this.k.c, var7.y + this.k.b, var7.y + this.k.d);
                  if (this.u.a(this.t)) {
                     return var6;
                  }
               }
            }

            return null;
         }
      } else {
         return null;
      }
   }

   public void setAnchor(float var1, float var2) {
      this.f = var1;
      this.g = var2;
      this.d();
   }

   public String getId() throws RemoteException {
      if (this.B == null) {
         this.B = a("MultiPointOverlay");
      }

      return this.B;
   }

   public void remove(boolean var1) {
      this.D = false;
      this.v = 0;
      this.w = 0;
      if (this.a != null) {
         this.a.recycle();
      }

      synchronized(this) {
         if (this.h != null) {
            this.h.clear();
            this.h = null;
         }
      }

      if (this.i != null) {
         this.i.a();
         this.i = null;
      }

      if (this.l != null) {
         this.l.clear();
      }

      if (this.F != null) {
         this.F.shutdownNow();
         this.F = null;
      }

      if (this.G != null) {
         this.G.clear();
      }

      if (this.o != null) {
         Iterator var2 = this.o.iterator();

         while(var2.hasNext()) {
            ba var3 = (ba)var2.next();
            if (var3 != null) {
               var3.c();
            }
         }

         this.o.clear();
      }

      if (var1 && this.n != null) {
         this.n.a(this);
         this.n.d();
      }

      this.n = null;
      this.C = null;
   }

   public void setVisible(boolean var1) {
      if (this.D != var1) {
         this.d();
      }

      this.D = var1;
   }

   private void d() {
      if (this.n != null) {
         this.n.d();
      }

   }

   public void destroy(boolean var1) {
      this.remove(var1);
      if (this.b != null) {
         this.b.recycle();
      }

   }
}
