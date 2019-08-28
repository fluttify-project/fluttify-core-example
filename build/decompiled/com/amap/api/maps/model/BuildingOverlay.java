package com.amap.api.maps.model;

import android.text.TextUtils;
import com.amap.api.mapcore.util.da;
import com.amap.api.maps.interfaces.IGlOverlayLayer;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

public class BuildingOverlay extends BaseOverlay {
   private da mDelegate;
   private BuildingOverlay$BuildingOverlayTotalOptions buildingOverlayTotalOptions = new BuildingOverlay$BuildingOverlayTotalOptions(this);
   private BuildingOverlayOptions mDefaultOptions;
   private List<BuildingOverlayOptions> optionList;
   private WeakReference<IGlOverlayLayer> glOverlayLayerRef;

   public BuildingOverlay(da var1) {
      this.mDelegate = var1;
   }

   public BuildingOverlay(IGlOverlayLayer var1) {
      this.glOverlayLayerRef = new WeakReference(var1);
      this.buildingOverlayTotalOptions.allOptionList = new ArrayList();

      try {
         if (this.mDefaultOptions == null) {
            this.mDefaultOptions = new BuildingOverlayOptions();
            this.mDefaultOptions.setVisible(true);
            ArrayList var2 = new ArrayList();
            var2.add(new LatLng(84.9D, -179.9D));
            var2.add(new LatLng(84.9D, 179.9D));
            var2.add(new LatLng(-84.9D, 179.9D));
            var2.add(new LatLng(-84.9D, -179.9D));
            this.mDefaultOptions.setBuildingLatlngs(var2);
            this.mDefaultOptions.setBuildingTopColor(-65536);
            this.mDefaultOptions.setBuildingSideColor(-12303292);
            this.mDefaultOptions.setVisible(true);
            this.mDefaultOptions.setZIndex(1.0F);
            this.buildingOverlayTotalOptions.allOptionList.add(this.mDefaultOptions);
            this.a(true);
         }
      } catch (Throwable var3) {
         ;
      }

   }

   public void setDefaultOptions(BuildingOverlayOptions var1) {
      if (this.mDelegate != null) {
         this.mDelegate.a(var1);
      } else if (var1 != null) {
         synchronized(this) {
            this.mDefaultOptions = var1;
         }

         this.a(true);
      }

   }

   public BuildingOverlayOptions getDefaultOptions() {
      return this.mDelegate != null ? this.mDelegate.d() : this.mDefaultOptions;
   }

   public void setCustomOptions(List<BuildingOverlayOptions> var1) {
      if (this.mDelegate != null) {
         this.mDelegate.a(var1);
      } else if (var1 != null && var1.size() > 0) {
         synchronized(this) {
            this.optionList = var1;
         }

         this.a(false);
      }

   }

   public List<BuildingOverlayOptions> getCustomOptions() {
      return this.mDelegate != null ? this.mDelegate.b() : this.optionList;
   }

   public void destroy() {
      try {
         if (this.mDelegate != null) {
            this.mDelegate.destroy();
         } else {
            IGlOverlayLayer var1 = (IGlOverlayLayer)this.glOverlayLayerRef.get();
            if (var1 != null) {
               var1.removeOverlay(this.overlayName);
            }
         }
      } catch (Throwable var2) {
         ;
      }

   }

   public String getId() {
      return this.mDelegate != null ? this.mDelegate.getId() : this.overlayName;
   }

   public void setZIndex(float var1) {
      if (this.mDelegate != null) {
         this.mDelegate.setZIndex(var1);
      } else {
         if (this.mDefaultOptions != null) {
            this.mDefaultOptions.setZIndex(var1);
         }

         if (this.buildingOverlayTotalOptions != null) {
            BuildingOverlay$BuildingOverlayTotalOptions.a(this.buildingOverlayTotalOptions, var1);
            this.a();
         }
      }

   }

   public float getZIndex() {
      if (this.mDelegate != null) {
         return this.mDelegate.getZIndex();
      } else {
         return this.buildingOverlayTotalOptions != null ? BuildingOverlay$BuildingOverlayTotalOptions.a(this.buildingOverlayTotalOptions) : 0.0F;
      }
   }

   public void setVisible(boolean var1) {
      if (this.mDelegate != null) {
         this.mDelegate.setVisible(var1);
      } else if (this.buildingOverlayTotalOptions != null) {
         this.buildingOverlayTotalOptions.isVisible = var1;
         this.a();
      }

   }

   public boolean isVisible() {
      if (this.mDelegate != null) {
         return this.mDelegate.isVisible();
      } else {
         return this.buildingOverlayTotalOptions != null ? this.buildingOverlayTotalOptions.isVisible : false;
      }
   }

   private void a(boolean var1) {
      try {
         synchronized(this) {
            if (var1) {
               this.buildingOverlayTotalOptions.allOptionList.set(0, this.mDefaultOptions);
            } else {
               this.buildingOverlayTotalOptions.allOptionList.removeAll(this.optionList);
               this.buildingOverlayTotalOptions.allOptionList.set(0, this.mDefaultOptions);
               this.buildingOverlayTotalOptions.allOptionList.addAll(this.optionList);
            }

            IGlOverlayLayer var3 = (IGlOverlayLayer)this.glOverlayLayerRef.get();
            if (var3 != null) {
               var3.updateOption(this.overlayName, this.buildingOverlayTotalOptions);
            }
         }
      } catch (Exception var6) {
         var6.printStackTrace();
      }

   }

   private void a() {
      try {
         IGlOverlayLayer var1 = (IGlOverlayLayer)this.glOverlayLayerRef.get();
         if (!TextUtils.isEmpty(this.overlayName) && var1 != null) {
            var1.updateOption(this.overlayName, this.buildingOverlayTotalOptions);
         }
      } catch (Throwable var2) {
         ;
      }

   }
}
