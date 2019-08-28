package com.amap.api.mapcore.util;

import android.os.RemoteException;
import com.amap.api.maps.model.BuildingOverlayOptions;
import com.amap.api.maps.model.LatLng;
import com.autonavi.amap.mapcore.AMapNativeBuildingRenderer;
import com.autonavi.amap.mapcore.MapConfig;
import com.autonavi.amap.mapcore.interfaces.IOverlay;
import java.util.ArrayList;
import java.util.List;

public class cv implements da, df {
   private s b;
   long a = -1L;
   private BuildingOverlayOptions c;
   private List<BuildingOverlayOptions> d = new ArrayList();
   private List<BuildingOverlayOptions> e;
   private boolean f = true;
   private String g;
   private float h;
   private boolean i;
   private dw j;

   public cv(s var1) {
      try {
         this.b = var1;
         if (this.c == null) {
            this.c = new BuildingOverlayOptions();
            this.c.setVisible(true);
            ArrayList var2 = new ArrayList();
            var2.add(new LatLng(84.9D, -179.9D));
            var2.add(new LatLng(84.9D, 179.9D));
            var2.add(new LatLng(-84.9D, 179.9D));
            var2.add(new LatLng(-84.9D, -179.9D));
            this.c.setBuildingLatlngs(var2);
            this.c.setBuildingTopColor(-65536);
            this.c.setBuildingSideColor(-12303292);
            this.c.setVisible(true);
            this.c.setZIndex(1.0F);
            this.d.add(this.c);
            this.a(true);
         }
      } catch (Exception var3) {
         var3.printStackTrace();
      }

   }

   public String getId() {
      if (this.g == null) {
         this.g = this.b.a("Building");
      }

      return this.g;
   }

   public void setZIndex(float var1) {
      try {
         this.h = var1;
         this.b.e();
         synchronized(this) {
            this.c.setZIndex(this.h);
         }

         this.a(true);
      } catch (Exception var5) {
         var5.printStackTrace();
      }

   }

   public float getZIndex() {
      return this.h;
   }

   public void setVisible(boolean var1) {
      this.f = var1;
   }

   public boolean isVisible() {
      return this.f;
   }

   public void a(BuildingOverlayOptions var1) {
      if (var1 != null) {
         synchronized(this) {
            this.c = var1;
         }

         this.a(true);
      }

   }

   public void a(List<BuildingOverlayOptions> var1) {
      if (var1 != null && var1.size() > 0) {
         synchronized(this) {
            this.e = var1;
         }

         this.a(false);
      }

   }

   public List<BuildingOverlayOptions> b() {
      return this.e;
   }

   public BuildingOverlayOptions d() {
      synchronized(this) {
         return this.c;
      }
   }

   private void a(boolean var1) {
      try {
         synchronized(this) {
            if (var1) {
               this.d.set(0, this.c);
            } else {
               this.d.removeAll(this.e);
               this.d.set(0, this.c);
               this.d.addAll(this.e);
            }

            this.i = true;
         }
      } catch (Exception var5) {
         var5.printStackTrace();
      }

   }

   public void destroy() {
      synchronized(this) {
         if (this.a != -1L) {
            AMapNativeBuildingRenderer.nativeDestory(this.a);
            if (this.d != null) {
               this.d.clear();
            }

            this.e = null;
            this.c = null;
            this.a = -1L;
         }

      }
   }

   public void a(MapConfig var1) throws RemoteException {
      try {
         if (var1 == null) {
            return;
         }

         if (this.a != -1L) {
            synchronized(this) {
               if (this.a != -1L) {
                  if (this.i) {
                     AMapNativeBuildingRenderer.nativeClearBuildingOptions(this.a);

                     for(int var3 = 0; var3 < this.d.size(); ++var3) {
                        BuildingOverlayOptions var4 = (BuildingOverlayOptions)this.d.get(var3);
                        AMapNativeBuildingRenderer.addBuildingOptions(this.a, var4);
                     }

                     this.i = false;
                  }

                  AMapNativeBuildingRenderer.render(this.a, var1.getViewMatrix(), var1.getProjectionMatrix(), var1.getSX(), var1.getSY(), var1.getSZ(), var1.getCurTileIds());
               }
            }
         } else {
            this.a = AMapNativeBuildingRenderer.nativeCreate();
            if (this.a != -1L && null != this.j) {
               AMapNativeBuildingRenderer.nativeSetGLShaderManager(this.a, this.j.a());
            }
         }
      } catch (Exception var7) {
         var7.printStackTrace();
      }

   }

   public boolean isAboveMaskLayer() {
      return false;
   }

   public void setAboveMaskLayer(boolean var1) {
   }

   public boolean a() {
      return true;
   }

   public boolean c() {
      return false;
   }

   public boolean equalsRemote(IOverlay var1) throws RemoteException {
      return false;
   }

   public int hashCodeRemote() throws RemoteException {
      return 0;
   }

   public void remove() throws RemoteException {
   }

   public void a(dw var1) {
      this.j = var1;
   }
}
