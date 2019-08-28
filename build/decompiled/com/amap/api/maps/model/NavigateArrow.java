package com.amap.api.maps.model;

import android.text.TextUtils;
import com.amap.api.maps.interfaces.IGlOverlayLayer;
import com.autonavi.amap.mapcore.interfaces.INavigateArrow;
import java.lang.ref.WeakReference;
import java.util.List;

public class NavigateArrow extends BaseOverlay {
   private INavigateArrow navigateArrowDelegate;
   private String overlayName = "";
   private NavigateArrowOptions options;
   private WeakReference<IGlOverlayLayer> glOverlayLayerRef;

   public NavigateArrow(INavigateArrow var1) {
      this.navigateArrowDelegate = var1;
   }

   public NavigateArrow(IGlOverlayLayer var1, NavigateArrowOptions var2) {
      this.glOverlayLayerRef = new WeakReference(var1);
      this.options = var2;
   }

   public void remove() {
      try {
         if (this.navigateArrowDelegate != null) {
            this.navigateArrowDelegate.remove();
         } else {
            IGlOverlayLayer var1 = (IGlOverlayLayer)this.glOverlayLayerRef.get();
            if (var1 != null) {
               var1.removeOverlay(this.overlayName);
            }
         }
      } catch (Throwable var2) {
         var2.printStackTrace();
      }

   }

   public String getId() {
      try {
         return this.navigateArrowDelegate != null ? this.navigateArrowDelegate.getId() : this.overlayName;
      } catch (Throwable var2) {
         var2.printStackTrace();
         return null;
      }
   }

   public void setPoints(List<LatLng> var1) {
      try {
         if (this.navigateArrowDelegate != null) {
            this.navigateArrowDelegate.setPoints(var1);
         } else if (this.options != null) {
            this.a();
         }
      } catch (Throwable var3) {
         var3.printStackTrace();
      }

   }

   public List<LatLng> getPoints() {
      try {
         if (this.navigateArrowDelegate != null) {
            return this.navigateArrowDelegate.getPoints();
         } else {
            return this.options != null ? this.options.getPoints() : null;
         }
      } catch (Throwable var2) {
         var2.printStackTrace();
         return null;
      }
   }

   public void setWidth(float var1) {
      try {
         if (this.navigateArrowDelegate != null) {
            this.navigateArrowDelegate.setWidth(var1);
         } else if (this.options != null) {
            this.options.width(var1);
            this.a();
         }
      } catch (Throwable var3) {
         var3.printStackTrace();
      }

   }

   public float getWidth() {
      try {
         if (this.navigateArrowDelegate != null) {
            return this.navigateArrowDelegate.getWidth();
         } else {
            return this.options != null ? this.options.getWidth() : 0.0F;
         }
      } catch (Throwable var2) {
         var2.printStackTrace();
         return 0.0F;
      }
   }

   public void setTopColor(int var1) {
      try {
         if (this.navigateArrowDelegate != null) {
            this.navigateArrowDelegate.setTopColor(var1);
         } else if (this.options != null) {
            this.options.topColor(var1);
            this.a();
         }
      } catch (Throwable var3) {
         var3.printStackTrace();
      }

   }

   public int getTopColor() {
      try {
         if (this.navigateArrowDelegate != null) {
            return this.navigateArrowDelegate.getTopColor();
         } else {
            return this.options != null ? this.options.getTopColor() : 0;
         }
      } catch (Throwable var2) {
         var2.printStackTrace();
         return 0;
      }
   }

   public void setSideColor(int var1) {
      try {
         if (this.navigateArrowDelegate != null) {
            this.navigateArrowDelegate.setSideColor(var1);
         } else if (this.options != null) {
            this.options.sideColor(var1);
            this.a();
         }
      } catch (Throwable var3) {
         var3.printStackTrace();
      }

   }

   /** @deprecated */
   @Deprecated
   public int getSideColor() {
      try {
         if (this.navigateArrowDelegate != null) {
            return this.navigateArrowDelegate.getSideColor();
         } else {
            return this.options != null ? this.options.getSideColor() : 0;
         }
      } catch (Throwable var2) {
         var2.printStackTrace();
         return 0;
      }
   }

   public void setZIndex(float var1) {
      try {
         if (this.navigateArrowDelegate != null) {
            this.navigateArrowDelegate.setZIndex(var1);
         } else if (this.options != null) {
            this.options.zIndex(var1);
            this.a();
         }
      } catch (Throwable var3) {
         var3.printStackTrace();
      }

   }

   public float getZIndex() {
      try {
         if (this.navigateArrowDelegate != null) {
            return this.navigateArrowDelegate.getZIndex();
         } else {
            return this.options != null ? this.options.getZIndex() : 0.0F;
         }
      } catch (Throwable var2) {
         var2.printStackTrace();
         return 0.0F;
      }
   }

   public void setVisible(boolean var1) {
      try {
         if (this.navigateArrowDelegate != null) {
            this.navigateArrowDelegate.setVisible(var1);
         } else if (this.options != null) {
            this.options.visible(var1);
            this.a();
         }
      } catch (Throwable var3) {
         var3.printStackTrace();
      }

   }

   public boolean isVisible() {
      try {
         if (this.navigateArrowDelegate != null) {
            return this.navigateArrowDelegate.isVisible();
         } else {
            return this.options != null ? this.options.isVisible() : false;
         }
      } catch (Throwable var2) {
         var2.printStackTrace();
         return false;
      }
   }

   public void set3DModel(boolean var1) {
      try {
         if (this.navigateArrowDelegate != null) {
            this.navigateArrowDelegate.set3DModel(var1);
         } else if (this.options != null) {
            this.options.set3DModel(var1);
            this.a();
         }
      } catch (Throwable var3) {
         var3.printStackTrace();
      }

   }

   public boolean is3DModel() {
      try {
         if (this.navigateArrowDelegate != null) {
            return this.navigateArrowDelegate.is3DModel();
         } else {
            return this.options != null ? this.options.is3DModel() : false;
         }
      } catch (Throwable var2) {
         var2.printStackTrace();
         return false;
      }
   }

   public boolean equals(Object var1) {
      if (var1 != null && var1 instanceof NavigateArrow) {
         try {
            if (this.navigateArrowDelegate != null) {
               return this.navigateArrowDelegate.equalsRemote(((NavigateArrow)var1).navigateArrowDelegate);
            } else {
               return super.equals(var1) || ((NavigateArrow)var1).getId() == this.getId();
            }
         } catch (Throwable var3) {
            var3.printStackTrace();
            return false;
         }
      } else {
         return false;
      }
   }

   public int hashCode() {
      try {
         return this.navigateArrowDelegate != null ? this.navigateArrowDelegate.hashCodeRemote() : super.hashCode();
      } catch (Throwable var2) {
         var2.printStackTrace();
         return 0;
      }
   }

   private void a() {
      IGlOverlayLayer var1 = (IGlOverlayLayer)this.glOverlayLayerRef.get();
      if (!TextUtils.isEmpty(this.overlayName) && var1 != null) {
         var1.updateOption(this.overlayName, this.options);
      }

   }
}
