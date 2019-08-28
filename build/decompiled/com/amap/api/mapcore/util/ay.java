package com.amap.api.mapcore.util;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import com.amap.api.maps.AMap$CommonInfoWindowAdapter;
import com.amap.api.maps.AMap$ImageInfoWindowAdapter;
import com.amap.api.maps.AMap$InfoWindowAdapter;
import com.amap.api.maps.AMap$MultiPositionInfoWindowAdapter;
import com.amap.api.maps.InfoWindowParams;
import com.amap.api.maps.model.BasePointOverlay;
import com.amap.api.maps.model.Marker;

public class ay {
   AMap$InfoWindowAdapter a = null;
   AMap$CommonInfoWindowAdapter b = null;
   private boolean d = true;
   private View e;
   private TextView f;
   private TextView g;
   private Drawable h = null;
   Context c;
   private ax i;
   private ax j;
   private AMap$InfoWindowAdapter k = new ay$1(this);
   private AMap$CommonInfoWindowAdapter l = new ay$2(this);

   public ay(Context var1) {
      this.c = var1;
   }

   public void a(ax var1) {
      synchronized(this) {
         this.i = var1;
         if (this.i != null) {
            this.i.a(this);
         }

      }
   }

   public void b(ax var1) {
      synchronized(this) {
         this.j = var1;
         if (this.j != null) {
            this.j.a(this);
         }

      }
   }

   public synchronized boolean a() {
      return this.d;
   }

   public void a(String var1, String var2) {
      if (this.f != null) {
         this.f.requestLayout();
         this.f.setText(var1);
      }

      if (this.g != null) {
         this.g.requestLayout();
         this.g.setText(var2);
      }

      if (this.e != null) {
         this.e.requestLayout();
      }

   }

   public synchronized void a(AMap$InfoWindowAdapter var1) {
      this.a = var1;
      this.b = null;
      if (this.a == null) {
         this.a = this.k;
         this.d = true;
      } else {
         this.d = false;
      }

      if (this.j != null) {
         this.j.a_();
      }

      if (this.i != null) {
         this.i.a_();
      }

   }

   public synchronized void a(AMap$CommonInfoWindowAdapter var1) {
      this.b = var1;
      this.a = null;
      if (this.b == null) {
         this.b = this.l;
         this.d = true;
      } else {
         this.d = false;
      }

      if (this.j != null) {
         this.j.a_();
      }

      if (this.i != null) {
         this.i.a_();
      }

   }

   public void b() {
      this.c = null;
      this.e = null;
      this.f = null;
      this.g = null;
      synchronized(this) {
         fi.a(this.h);
         this.h = null;
         this.k = null;
         this.a = null;
      }

      this.b = null;
      this.i = null;
      this.j = null;
   }

   public View a(BasePointOverlay var1) {
      if (this.a != null) {
         return this.a.getInfoWindow((Marker)var1);
      } else {
         InfoWindowParams var2;
         if (this.b != null) {
            var2 = this.b.getInfoWindowParams(var1);
            if (var2 != null) {
               return var2.getInfoWindow();
            }
         }

         var2 = this.l.getInfoWindowParams(var1);
         return var2 != null ? var2.getInfoWindow() : null;
      }
   }

   public View b(BasePointOverlay var1) {
      if (this.a != null) {
         return this.a.getInfoContents((Marker)var1);
      } else {
         InfoWindowParams var2;
         if (this.b != null) {
            var2 = this.b.getInfoWindowParams(var1);
            if (var2 != null) {
               return var2.getInfoContents();
            }
         }

         var2 = this.l.getInfoWindowParams(var1);
         return var2 != null ? var2.getInfoContents() : null;
      }
   }

   public View a(Marker var1) {
      return this.a != null && this.a instanceof AMap$MultiPositionInfoWindowAdapter ? ((AMap$MultiPositionInfoWindowAdapter)this.a).getInfoWindowClick(var1) : null;
   }

   public View b(Marker var1) {
      return this.a != null && this.a instanceof AMap$MultiPositionInfoWindowAdapter ? ((AMap$MultiPositionInfoWindowAdapter)this.a).getOverturnInfoWindow(var1) : null;
   }

   public View c(Marker var1) {
      return this.a != null && this.a instanceof AMap$MultiPositionInfoWindowAdapter ? ((AMap$MultiPositionInfoWindowAdapter)this.a).getOverturnInfoWindowClick(var1) : null;
   }

   public long c(BasePointOverlay var1) {
      if (this.a != null && this.a instanceof AMap$ImageInfoWindowAdapter) {
         return ((AMap$ImageInfoWindowAdapter)this.a).getInfoWindowUpdateTime();
      } else {
         if (this.b != null) {
            InfoWindowParams var2 = this.b.getInfoWindowParams(var1);
            if (var2 != null) {
               return var2.getInfoWindowUpdateTime();
            }
         }

         return 0L;
      }
   }

   public void c() {
      ax var1 = this.d();
      if (var1 != null) {
         var1.b();
      }

   }

   public synchronized ax d() {
      if (this.a != null) {
         if (this.a instanceof AMap$ImageInfoWindowAdapter) {
            return this.j;
         }

         if (this.a instanceof AMap$MultiPositionInfoWindowAdapter) {
            return this.j;
         }
      }

      if (this.b != null) {
         int var1 = this.b.getInfoWindowParams((BasePointOverlay)null).getInfoWindowType();
         if (var1 == 1) {
            return this.j;
         }
      }

      return this.i;
   }

   public boolean a(MotionEvent var1) {
      ax var2 = this.d();
      return var2 != null ? var2.a(var1) : false;
   }

   public void e() {
      ax var1 = this.d();
      if (var1 != null) {
         var1.a_();
      }

   }

   public void a(m var1) throws RemoteException {
      ax var2 = this.d();
      if (var2 != null) {
         var2.a(var1);
      }

   }

   public Drawable f() {
      if (this.h == null) {
         try {
            this.h = ex.a(this.c, "infowindow_bg.9.png");
         } catch (Exception var2) {
            var2.printStackTrace();
         }
      }

      return this.h;
   }
}
