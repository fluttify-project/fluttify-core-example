package com.amap.api.mapcore.util;

import android.os.RemoteException;
import com.amap.api.maps.AMap$OnMultiPointClickListener;
import com.amap.api.maps.model.MultiPointItem;
import com.amap.api.maps.model.MultiPointOverlayOptions;
import com.autonavi.amap.mapcore.IPoint;
import com.autonavi.amap.mapcore.MapConfig;
import com.autonavi.amap.mapcore.interfaces.IMultiPointOverlay;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class bd {
   private List<IMultiPointOverlay> b = new ArrayList();
   private AMap$OnMultiPointClickListener c;
   private u d;
   dw a;

   public bd(u var1) {
      this.d = var1;
   }

   public dw a() {
      this.a = this.d.y();
      return this.a;
   }

   public synchronized void b() {
      this.c = null;

      try {
         List var1 = this.b;
         synchronized(this.b) {
            IMultiPointOverlay var3;
            for(Iterator var2 = this.b.iterator(); var2.hasNext(); var3 = null) {
               var3 = (IMultiPointOverlay)var2.next();
               var3.destroy(false);
            }

            this.b.clear();
         }
      } catch (Throwable var6) {
         ht.c(var6, "MultiPointOverlayManagerLayer", "destory");
         var6.printStackTrace();
      }

   }

   public synchronized void c() {
      try {
         List var1 = this.b;
         synchronized(this.b) {
            this.b.clear();
         }
      } catch (Throwable var4) {
         ht.c(var4, "MultiPointOverlayManagerLayer", "clear");
         var4.printStackTrace();
      }

   }

   public synchronized IMultiPointOverlay a(MultiPointOverlayOptions var1) throws RemoteException {
      if (var1 == null) {
         return null;
      } else {
         bc var2 = new bc(var1, this);
         this.a((IMultiPointOverlay)var2);
         return var2;
      }
   }

   private void a(IMultiPointOverlay var1) throws RemoteException {
      List var2 = this.b;
      synchronized(this.b) {
         this.b.add(var1);
      }
   }

   public void a(MapConfig var1, float[] var2, float[] var3) {
      try {
         List var4 = this.b;
         synchronized(this.b) {
            Iterator var5 = this.b.iterator();

            while(var5.hasNext()) {
               IMultiPointOverlay var6 = (IMultiPointOverlay)var5.next();
               var6.draw(var1, var2, var3);
            }
         }
      } catch (Throwable var9) {
         ht.c(var9, "MultiPointOverlayManagerLayer", "draw");
         var9.printStackTrace();
      }

   }

   public boolean a(IPoint var1) {
      boolean var2 = false;
      if (this.c == null) {
         return var2;
      } else {
         List var3 = this.b;
         synchronized(this.b) {
            Iterator var4 = this.b.iterator();

            while(var4.hasNext()) {
               IMultiPointOverlay var5 = (IMultiPointOverlay)var4.next();
               if (var5 != null) {
                  MultiPointItem var6 = var5.onClick(var1);
                  if (var6 != null) {
                     if (this.c != null) {
                        var2 = this.c.onPointClick(var6);
                     }

                     return var2;
                  }
               }
            }

            return var2;
         }
      }
   }

   public void a(AMap$OnMultiPointClickListener var1) {
      this.c = var1;
   }

   public void d() {
      if (this.d != null) {
         this.d.setRunLowFrame(false);
      }

   }

   public void a(bc var1) {
      this.b.remove(var1);
   }
}
