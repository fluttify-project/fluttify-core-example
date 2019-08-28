package com.amap.api.mapcore.util;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.os.RemoteException;
import android.os.Build.VERSION;
import com.amap.api.maps.model.BitmapDescriptor;
import com.amap.api.maps.model.particle.ColorGenerate;
import com.amap.api.maps.model.particle.ParticleEmissionModule;
import com.amap.api.maps.model.particle.ParticleOverLifeModule;
import com.amap.api.maps.model.particle.ParticleOverlayOptions;
import com.amap.api.maps.model.particle.ParticleShapeModule;
import com.amap.api.maps.model.particle.VelocityGenerate;
import com.autonavi.amap.mapcore.AMapNativeParticleSystem;
import com.autonavi.amap.mapcore.MapConfig;
import com.autonavi.amap.mapcore.interfaces.IOverlay;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class dp implements dh {
   private long d = 0L;
   private dw e;
   private s f;
   private boolean g = true;
   private float h = 1.0F;
   private String i;
   private BitmapDescriptor j;
   private boolean k = false;
   private List<ad> l = new ArrayList();
   private int m = 0;
   private ParticleOverlayOptions n = new ParticleOverlayOptions();
   private boolean o = false;
   float a = 1.0F;
   int b = 0;
   int c = 0;
   private float p = -1.0F;
   private float q = -1.0F;
   private float[] r = new float[16];
   private float[] s = new float[16];
   private float[] t = new float[16];

   public dp(s var1) {
      this.f = var1;
   }

   public void a(ParticleOverlayOptions var1) {
      synchronized(this) {
         if (var1 != null) {
            this.a(var1.getIcon());
            this.n.setMaxParticles(var1.getMaxParticles());
            this.n.setLoop(var1.isLoop());
            this.n.setDuration(var1.getDuration());
            this.n.setParticleLifeTime(var1.getParticleLifeTime());
            this.n.setParticleEmissionModule(var1.getParticleEmissionModule());
            this.n.setParticleShapeModule(var1.getParticleShapeModule());
            this.n.setParticleStartSpeed(var1.getParticleStartSpeed());
            this.n.setParticleStartColor(var1.getParticleStartColor());
            this.n.setParticleOverLifeModule(var1.getParticleOverLifeModule());
            this.n.setStartParticleSize(var1.getStartParticleW(), var1.getstartParticleH());
            this.n.zIndex(var1.getZIndex());
            this.h = this.n.getZIndex();
            this.n.setVisible(var1.isVisibile());
            this.g = this.n.isVisibile();
            this.o = true;
         }

      }
   }

   public void remove() throws RemoteException {
   }

   public String getId() throws RemoteException {
      if (this.i == null) {
         this.i = this.f.a("Particle");
      }

      return this.i;
   }

   public void setZIndex(float var1) throws RemoteException {
      this.h = var1;
   }

   public float getZIndex() throws RemoteException {
      return this.h;
   }

   public void setVisible(boolean var1) throws RemoteException {
      this.g = var1;
   }

   public boolean isVisible() throws RemoteException {
      return this.g;
   }

   public boolean equalsRemote(IOverlay var1) throws RemoteException {
      return false;
   }

   public int hashCodeRemote() throws RemoteException {
      return 0;
   }

   public void destroy() {
      ad var1;
      if (this.l != null && this.l.size() > 0) {
         for(int var2 = 0; var2 < this.l.size(); ++var2) {
            var1 = (ad)this.l.get(var2);
            if (var1 != null) {
               if (this.f != null) {
                  this.f.a(var1);
               }

               if (this.f.g() != null) {
                  this.f.g().c(var1.o());
               }
            }
         }

         this.l.clear();
      }

      if (this.j != null) {
         Bitmap var3 = this.j.getBitmap();
         if (var3 != null) {
            var3.recycle();
            var1 = null;
            this.j = null;
         }
      }

      if (this.d != 0L) {
         AMapNativeParticleSystem.nativeDestroy(this.d);
      }

   }

   public boolean isAboveMaskLayer() {
      return false;
   }

   public void setAboveMaskLayer(boolean var1) {
   }

   public void a(MapConfig var1) throws RemoteException {
      if (this.e == null) {
         this.e = this.f.b();
      }

      if (this.e != null) {
         if (this.d == 0L) {
            this.d = AMapNativeParticleSystem.nativeCreate();
            if (this.d != 0L && this.e != null) {
               AMapNativeParticleSystem.nativeSetGLShaderManager(this.d, this.e.a());
            }
         }

         if (this.d != 0L) {
            synchronized(this) {
               if (this.o) {
                  this.g();
                  this.o = false;
               }
            }

            this.m = this.d();
            if (this.m == 0) {
               return;
            }

            AMapNativeParticleSystem.nativeSetTextureId(this.d, this.m);
            if (this.f != null) {
               this.f.a(false);
            }

            if (this.b != var1.getMapWidth() || this.c != var1.getMapHeight()) {
               this.b = var1.getMapWidth();
               this.c = var1.getMapHeight();
               this.a = this.b > this.c ? (float)this.b / (float)this.c : (float)this.c / (float)this.b;
               if (this.b > this.c) {
                  this.p = -this.a;
                  this.q = 1.0F;
               } else {
                  this.p = -1.0F;
                  this.q = this.a;
               }

               Matrix.orthoM(this.r, 0, this.p, -this.p, -this.q, this.q, 3.0F, 7.0F);
               Matrix.setLookAtM(this.s, 0, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F);
            }

            Matrix.multiplyMM(this.t, 0, this.r, 0, this.s, 0);
            Matrix.translateM(this.t, 0, this.p, this.q, 0.0F);
            Matrix.scaleM(this.t, 0, Math.abs(2.0F * this.p) / (float)this.b, Math.abs(2.0F * this.q) / (float)this.c, 0.0F);
            AMapNativeParticleSystem.nativeRender(this.d, (float[])this.t.clone(), var1.getProjectionMatrix(), var1.getSX(), var1.getSY(), var1.getSZ(), (float)this.b, (float)this.c);
         }

      }
   }

   private int d() {
      if (!this.k) {
         boolean var1 = VERSION.SDK_INT >= 12;
         int var2 = this.a(var1, this.j);
         this.k = true;
         return var2;
      } else {
         return this.m;
      }
   }

   private void e() {
      if (this.l != null) {
         Iterator var1 = this.l.iterator();

         while(var1.hasNext()) {
            ad var2 = (ad)var1.next();
            if (var2 != null && this.f != null) {
               this.f.a(var2);
            }
         }

         this.l.clear();
      }

   }

   private void a(ad var1) {
      if (var1 != null) {
         this.l.add(var1);
         var1.l();
      }

   }

   private int a(boolean var1, BitmapDescriptor var2) {
      this.e();
      int var3 = 0;
      ad var4 = null;
      if (var1) {
         var4 = this.f.a(var2);
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
            var3 = this.f();
            var4.a(var3);
            if (var1) {
               this.f.g().a(var4);
            }

            this.a(var4);
            fi.b(var3, var5, true);
         }
      }

      return var3;
   }

   private int f() {
      int[] var1 = new int[]{0};
      GLES20.glGenTextures(1, var1, 0);
      return var1[0];
   }

   public void a(BitmapDescriptor var1) {
      if (var1 != null) {
         synchronized(this) {
            if (!var1.equals(this.j)) {
               this.k = false;
               this.j = var1;
            }
         }
      }
   }

   public boolean a() {
      return true;
   }

   public boolean c() {
      return false;
   }

   private void g() {
      if (this.d != 0L) {
         this.a(this.n.getMaxParticles());
         this.a(this.n.getDuration());
         this.a(this.n.isLoop());
         this.b(true);
         this.b(this.n.getParticleLifeTime());
         this.a(this.n.getParticleStartSpeed());
         if (this.n.getParticleEmissionModule() != null) {
            this.a(this.n.getParticleEmissionModule());
         }

         if (this.n.getParticleShapeModule() != null) {
            this.a(this.n.getParticleShapeModule());
         }

         if (this.n.getParticleStartColor() != null) {
            this.a(this.n.getParticleStartColor());
         }

         if (this.n.getParticleOverLifeModule() != null) {
            this.a(this.n.getParticleOverLifeModule());
         }

         this.a(this.n.getStartParticleW(), this.n.getstartParticleH());
      }

   }

   public void a(int var1, int var2) {
      if (this.n != null) {
         this.n.setStartParticleSize(var1, var2);
      }

      if (this.d != 0L) {
         AMapNativeParticleSystem.setStartParticleSize(this.d, (float)var1, (float)var2);
      }

   }

   public void a(int var1) {
      if (this.n != null) {
         this.n.setMaxParticles(var1);
      }

      if (this.d != 0L) {
         AMapNativeParticleSystem.setMaxParticles(this.d, var1);
      } else if (this.n != null) {
         synchronized(this) {
            this.o = true;
         }
      }

   }

   public void a(long var1) {
      if (this.n != null) {
         this.n.setDuration(var1);
      }

      if (this.d != 0L) {
         AMapNativeParticleSystem.setDuration(this.d, var1);
      } else if (this.n != null) {
         synchronized(this) {
            this.o = true;
         }
      }

   }

   public void b(long var1) {
      if (this.n != null) {
         this.n.setParticleLifeTime(var1);
      }

      if (this.d != 0L) {
         AMapNativeParticleSystem.setParticleLifeTime(this.d, var1);
      } else if (this.n != null) {
         synchronized(this) {
            this.o = true;
         }
      }

   }

   public void a(VelocityGenerate var1) {
      if (this.n != null) {
         this.n.setParticleStartSpeed(var1);
      }

      if (this.d != 0L && var1 != null) {
         if (var1.getNativeInstance() == 0L) {
            var1.createNativeInstace();
         }

         AMapNativeParticleSystem.setParticleStartSpeed(this.d, var1.getNativeInstance());
      } else if (this.n != null) {
         synchronized(this) {
            this.o = true;
         }
      }

   }

   public void a(boolean var1) {
      if (this.n != null) {
         this.n.setLoop(var1);
      }

      if (this.d != 0L) {
         AMapNativeParticleSystem.setLoop(this.d, var1);
      } else if (this.n != null) {
         synchronized(this) {
            this.o = true;
         }
      }

   }

   public void a(ParticleShapeModule var1) {
      if (this.n != null) {
         this.n.setParticleShapeModule(var1);
      }

      if (this.d != 0L && var1 != null) {
         if (var1.getNativeInstance() == 0L) {
            var1.createNativeInstace();
         }

         AMapNativeParticleSystem.setParticleShapeModule(this.d, var1.getNativeInstance());
      } else if (this.n != null) {
         synchronized(this) {
            this.o = true;
         }
      }

   }

   public void a(ParticleEmissionModule var1) {
      if (this.n != null) {
         this.n.setParticleEmissionModule(var1);
      }

      if (this.d != 0L && var1 != null) {
         if (var1.getNativeInstance() == 0L) {
            var1.createNativeInstace();
         }

         AMapNativeParticleSystem.setParticleEmission(this.d, var1.getNativeInstance());
      } else if (this.n != null) {
         synchronized(this) {
            this.o = true;
         }
      }

   }

   public int b() {
      int var1 = 0;
      if (this.d != 0L) {
         var1 = AMapNativeParticleSystem.getCurrentParticleNum(this.d);
      }

      return var1;
   }

   public void a(ParticleOverLifeModule var1) {
      if (this.n != null) {
         this.n.setParticleOverLifeModule(var1);
      }

      if (this.d != 0L && var1 != null) {
         if (var1.getNativeInstance() == 0L) {
            var1.createNativeInstace();
         }

         AMapNativeParticleSystem.setParticleOverLifeModule(this.d, var1.getNativeInstance());
      } else if (this.n != null) {
         synchronized(this) {
            this.o = true;
         }
      }

   }

   public void b(boolean var1) {
      if (this.d != 0L) {
         AMapNativeParticleSystem.setPreWram(this.d, var1);
      }

   }

   public void a(ColorGenerate var1) {
      if (this.n != null) {
         this.n.setParticleStartColor(var1);
      }

      if (this.d != 0L && var1 != null) {
         if (var1.getNativeInstance() == 0L) {
            var1.createNativeInstace();
         }

         AMapNativeParticleSystem.setStartColor(this.d, var1.getNativeInstance());
      } else if (this.n != null) {
         synchronized(this) {
            this.o = true;
         }
      }

   }
}
