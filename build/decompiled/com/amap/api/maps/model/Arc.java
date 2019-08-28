package com.amap.api.maps.model;

import android.text.TextUtils;
import com.amap.api.maps.interfaces.IGlOverlayLayer;
import com.autonavi.amap.mapcore.interfaces.IArc;
import java.lang.ref.WeakReference;

public final class Arc extends BaseOverlay {
   private IArc iArcDel;
   private String overlayName;
   private ArcOptions options;
   private WeakReference<IGlOverlayLayer> glOverlayLayerRef;

   public Arc(IArc var1) {
      this.iArcDel = var1;
   }

   public Arc(IGlOverlayLayer var1, ArcOptions var2) {
      this.glOverlayLayerRef = new WeakReference(var1);
      this.options = var2;
      this.overlayName = "";
   }

   public void remove() {
      try {
         if (this.iArcDel != null) {
            this.iArcDel.remove();
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
         return this.iArcDel != null ? this.iArcDel.getId() : this.overlayName;
      } catch (Throwable var2) {
         var2.printStackTrace();
         return null;
      }
   }

   public void setStrokeWidth(float var1) {
      try {
         if (this.iArcDel != null) {
            this.iArcDel.setStrokeWidth(var1);
         } else if (this.options != null) {
            this.options.strokeWidth(var1);
            this.a();
         }
      } catch (Throwable var3) {
         var3.printStackTrace();
      }

   }

   public float getStrokeWidth() {
      try {
         if (this.iArcDel != null) {
            return this.iArcDel.getStrokeWidth();
         } else {
            return this.options != null ? this.options.getStrokeWidth() : 0.0F;
         }
      } catch (Throwable var2) {
         var2.printStackTrace();
         return 0.0F;
      }
   }

   public void setStrokeColor(int var1) {
      try {
         if (this.iArcDel != null) {
            this.iArcDel.setStrokeColor(var1);
         } else if (this.options != null) {
            this.options.strokeColor(var1);
            this.a();
         }
      } catch (Throwable var3) {
         var3.printStackTrace();
      }

   }

   public int getStrokeColor() {
      try {
         if (this.iArcDel != null) {
            return this.iArcDel.getStrokeColor();
         } else {
            return this.options != null ? this.options.getStrokeColor() : 0;
         }
      } catch (Throwable var2) {
         var2.printStackTrace();
         return 0;
      }
   }

   public void setZIndex(float var1) {
      try {
         if (this.iArcDel != null) {
            this.iArcDel.setZIndex(var1);
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
         if (this.iArcDel != null) {
            return this.iArcDel.getZIndex();
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
         if (this.iArcDel != null) {
            this.iArcDel.setVisible(var1);
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
         if (this.iArcDel != null) {
            return this.iArcDel.isVisible();
         } else {
            return this.options != null ? this.options.isVisible() : false;
         }
      } catch (Throwable var2) {
         var2.printStackTrace();
         return false;
      }
   }

   public boolean equals(Object var1) {
      if (var1 != null && var1 instanceof Arc) {
         try {
            if (this.iArcDel != null) {
               return this.iArcDel.equalsRemote(((Arc)var1).iArcDel);
            } else {
               return super.equals(var1) || ((Arc)var1).getId() == this.getId();
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
         return this.iArcDel != null ? this.iArcDel.hashCodeRemote() : super.hashCode();
      } catch (Throwable var2) {
         var2.printStackTrace();
         return 0;
      }
   }

   private void a() {
      try {
         IGlOverlayLayer var1 = (IGlOverlayLayer)this.glOverlayLayerRef.get();
         if (!TextUtils.isEmpty(this.overlayName) && var1 != null) {
            var1.updateOption(this.overlayName, this.options);
         }
      } catch (Throwable var2) {
         ;
      }

   }
}
