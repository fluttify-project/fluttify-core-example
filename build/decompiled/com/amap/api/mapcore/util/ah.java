package com.amap.api.mapcore.util;

import android.content.Context;
import android.os.RemoteException;
import com.amap.api.maps.MapsInitializer;
import com.amap.api.maps.model.CameraPosition;
import com.amap.api.maps.model.TileOverlay;
import com.amap.api.maps.model.TileOverlayOptions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ah {
   private u f;
   private Context g;
   List<dl> a = new ArrayList();
   ah$a b = new ah$a();
   List<Integer> c = new ArrayList();
   du d = null;
   float[] e = new float[16];

   public ah(Context var1, u var2) {
      this.f = var2;
      this.g = var1;
      el var3 = new el(256, 256, this.f.getMapConfig());
      TileOverlayOptions var4 = (new TileOverlayOptions()).tileProvider(var3);
      var4.memCacheSize(10485760);
      var4.diskCacheSize(20480);
      this.d = new du(var4, this, true);
   }

   public u a() {
      return this.f;
   }

   public void b() {
      try {
         Iterator var1 = this.c.iterator();

         while(var1.hasNext()) {
            Integer var2 = (Integer)var1.next();
            fi.b(var2.intValue());
         }

         this.c.clear();
         if (this.i() && this.d != null) {
            this.d.a();
         }

         List var8 = this.a;
         synchronized(this.a) {
            int var9 = this.a.size();
            dl var3 = null;

            for(int var4 = 0; var4 < var9; ++var4) {
               var3 = (dl)this.a.get(var4);
               if (var3.isVisible()) {
                  var3.a();
               }
            }
         }
      } catch (Throwable var7) {
         ;
      }

   }

   public void c() {
      List var1 = this.a;
      synchronized(this.a) {
         int var2 = this.a.size();
         dl var3 = null;

         for(int var4 = 0; var4 < var2; ++var4) {
            var3 = (dl)this.a.get(var4);
            if (var3 != null) {
               var3.destroy(true);
            }
         }

         this.a.clear();
      }
   }

   public void d() {
      List var1 = this.a;
      synchronized(this.a) {
         Collections.sort(this.a, this.b);
      }
   }

   public TileOverlay a(TileOverlayOptions var1) throws RemoteException {
      if (var1 != null && var1.getTileProvider() != null) {
         try {
            du var2 = new du(var1, this, false);
            this.a((dl)var2);
            var2.a(true);
            this.f.setRunLowFrame(false);
            return new TileOverlay(var2);
         } catch (Throwable var3) {
            var3.printStackTrace();
            return null;
         }
      } else {
         return null;
      }
   }

   public void a(dl var1) {
      List var2 = this.a;
      synchronized(this.a) {
         this.b(var1);
         this.a.add(var1);
      }

      this.d();
   }

   public boolean b(dl var1) {
      List var2 = this.a;
      synchronized(this.a) {
         return this.a.remove(var1);
      }
   }

   public void a(boolean var1) {
      try {
         if (this.i()) {
            CameraPosition var2 = this.f.getCameraPosition();
            if (var2 == null) {
               return;
            }

            if (var2.isAbroad && var2.zoom > 7.0F) {
               if (this.f.getMapType() == 1) {
                  if (this.d != null) {
                     this.d.a(var1);
                  }
               } else if (this.d != null) {
                  this.d.b();
               }
            } else if (this.d != null) {
               if (this.f.getMapConfig().getMapLanguage().equals("en")) {
                  this.d.a(var1);
               } else {
                  this.d.b();
               }
            }
         }

         List var9 = this.a;
         synchronized(this.a) {
            int var3 = this.a.size();
            dl var4 = null;

            for(int var5 = 0; var5 < var3; ++var5) {
               var4 = (dl)this.a.get(var5);
               if (var4 != null && var4.isVisible()) {
                  var4.a(var1);
               }
            }
         }
      } catch (Throwable var8) {
         ht.c(var8, "TileOverlayView", "refresh");
      }

   }

   private boolean i() {
      if (this.f == null) {
         return false;
      } else {
         return MapsInitializer.isLoadWorldGridMap() || this.f.getMapConfig().getMapLanguage().equals("en");
      }
   }

   public void b(boolean var1) {
      if (this.d != null) {
         this.d.b(var1);
      }

      List var2 = this.a;
      synchronized(this.a) {
         int var3 = this.a.size();
         dl var4 = null;

         for(int var5 = 0; var5 < var3; ++var5) {
            var4 = (dl)this.a.get(var5);
            if (var4 != null) {
               var4.b(var1);
            }
         }

      }
   }

   public Context e() {
      return this.g;
   }

   public void a(int var1) {
      this.c.add(var1);
   }

   public void f() {
      this.c();
      if (this.d != null) {
         this.d.c();
         this.d.destroy(false);
      }

      this.d = null;
   }

   public float[] g() {
      return this.f != null ? this.f.x() : this.e;
   }

   public void a(String var1) {
      if (this.d != null) {
         this.d.a(var1);
      }

   }

   public void h() {
      if (this.d != null) {
         this.d.clearTileCache();
         ey.a(this.g, "Map3DCache", "time", (Object)System.currentTimeMillis());
      }

      List var1 = this.a;
      synchronized(this.a) {
         int var2 = this.a.size();
         dl var3 = null;

         for(int var4 = 0; var4 < var2; ++var4) {
            var3 = (dl)this.a.get(var4);
            if (var3 != null) {
               var3.clearTileCache();
            }
         }

      }
   }
}
