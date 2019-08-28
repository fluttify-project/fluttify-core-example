package com.amap.api.maps.model;

import android.text.TextUtils;
import com.amap.api.maps.interfaces.IGlOverlayLayer;
import com.autonavi.amap.mapcore.interfaces.ICircle;
import java.lang.ref.WeakReference;
import java.util.List;

public final class Circle extends BaseOverlay {
   private ICircle iCircleDel;
   private String overlayName = "";
   private CircleOptions options;
   WeakReference<IGlOverlayLayer> a;

   public Circle(ICircle var1) {
      this.iCircleDel = var1;
   }

   public Circle(IGlOverlayLayer var1, CircleOptions var2) {
      this.a = new WeakReference(var1);
      this.options = var2;
   }

   public void remove() {
      try {
         if (this.iCircleDel != null) {
            this.iCircleDel.remove();
         } else {
            IGlOverlayLayer var1 = (IGlOverlayLayer)this.a.get();
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
         return this.iCircleDel != null ? this.iCircleDel.getId() : this.overlayName;
      } catch (Throwable var2) {
         var2.printStackTrace();
         return null;
      }
   }

   public void setCenter(LatLng var1) {
      try {
         if (this.iCircleDel != null) {
            this.iCircleDel.setCenter(var1);
         } else if (this.options != null) {
            this.options.center(var1);
            this.a();
         }
      } catch (Throwable var3) {
         var3.printStackTrace();
      }

   }

   public LatLng getCenter() {
      try {
         if (this.iCircleDel != null) {
            return this.iCircleDel.getCenter();
         } else {
            return this.options != null ? this.options.getCenter() : null;
         }
      } catch (Throwable var2) {
         var2.printStackTrace();
         return null;
      }
   }

   public void setRadius(double var1) {
      try {
         if (this.iCircleDel != null) {
            this.iCircleDel.setRadius(var1);
         } else if (this.options != null) {
            this.options.radius(var1);
            this.a();
         }
      } catch (Throwable var4) {
         var4.printStackTrace();
      }

   }

   public double getRadius() {
      try {
         if (this.iCircleDel != null) {
            return this.iCircleDel.getRadius();
         } else {
            return this.options != null ? this.options.getRadius() : 0.0D;
         }
      } catch (Throwable var2) {
         var2.printStackTrace();
         return 0.0D;
      }
   }

   public void setStrokeWidth(float var1) {
      try {
         if (this.iCircleDel != null) {
            this.iCircleDel.setStrokeWidth(var1);
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
         if (this.iCircleDel != null) {
            return this.iCircleDel.getStrokeWidth();
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
         if (this.iCircleDel != null) {
            this.iCircleDel.setStrokeColor(var1);
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
         if (this.iCircleDel != null) {
            return this.iCircleDel.getStrokeColor();
         } else {
            return this.options != null ? this.options.getStrokeColor() : 0;
         }
      } catch (Throwable var2) {
         var2.printStackTrace();
         return 0;
      }
   }

   public void setFillColor(int var1) {
      try {
         if (this.iCircleDel != null) {
            this.iCircleDel.setFillColor(var1);
         } else if (this.options != null) {
            this.options.fillColor(var1);
            this.a();
         }
      } catch (Throwable var3) {
         var3.printStackTrace();
      }

   }

   public int getFillColor() {
      try {
         if (this.iCircleDel != null) {
            return this.iCircleDel.getFillColor();
         } else {
            return this.options != null ? this.options.getFillColor() : 0;
         }
      } catch (Throwable var2) {
         var2.printStackTrace();
         return 0;
      }
   }

   public void setZIndex(float var1) {
      try {
         if (this.iCircleDel != null) {
            this.iCircleDel.setZIndex(var1);
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
         if (this.iCircleDel != null) {
            return this.iCircleDel.getZIndex();
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
         if (this.iCircleDel != null) {
            this.iCircleDel.setVisible(var1);
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
         if (this.iCircleDel != null) {
            return this.iCircleDel.isVisible();
         } else {
            return this.options != null ? this.options.isVisible() : false;
         }
      } catch (Throwable var2) {
         var2.printStackTrace();
         return false;
      }
   }

   public boolean equals(Object var1) {
      if (var1 != null && var1 instanceof Circle) {
         try {
            if (this.iCircleDel != null) {
               return this.iCircleDel.equalsRemote(((Circle)var1).iCircleDel);
            } else {
               return super.equals(var1) || ((Circle)var1).getId() == this.getId();
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
         return this.iCircleDel != null ? this.iCircleDel.hashCodeRemote() : super.hashCode();
      } catch (Throwable var2) {
         var2.printStackTrace();
         return 0;
      }
   }

   public boolean contains(LatLng var1) {
      try {
         if (this.iCircleDel != null) {
            return this.iCircleDel.contains(var1);
         }

         IGlOverlayLayer var2 = (IGlOverlayLayer)this.a.get();
         if (var2 != null) {
            return var2.IsCircleContainPoint(this.options, var1);
         }
      } catch (Throwable var3) {
         var3.printStackTrace();
      }

      return false;
   }

   public void setHoleOptions(List<BaseHoleOptions> var1) {
      try {
         if (this.iCircleDel != null) {
            this.iCircleDel.setHoleOptions(var1);
         } else if (var1 != null) {
            synchronized(var1) {
               this.options.getHoleOptions().clear();
               this.options.addHoles((Iterable)var1);
               this.a();
            }
         }
      } catch (Throwable var5) {
         var5.printStackTrace();
      }

   }

   public List<BaseHoleOptions> getHoleOptions() {
      try {
         if (this.iCircleDel != null) {
            return this.iCircleDel.getHoleOptions();
         } else {
            return this.options != null ? this.options.getHoleOptions() : null;
         }
      } catch (Throwable var2) {
         var2.printStackTrace();
         return null;
      }
   }

   public void setStrokeDottedLineType(int var1) {
      try {
         if (this.iCircleDel != null) {
            this.iCircleDel.setDottedLineType(var1);
         } else if (this.options != null) {
            this.options.setStrokeDottedLineType(var1);
            this.a();
         }
      } catch (Throwable var3) {
         var3.printStackTrace();
      }

   }

   public int getStrokeDottedLineType() {
      try {
         if (this.iCircleDel != null) {
            return this.iCircleDel.getDottedLineType();
         } else {
            return this.options != null ? this.options.getStrokeDottedLineType() : -1;
         }
      } catch (Throwable var2) {
         var2.printStackTrace();
         return -1;
      }
   }

   private void a() {
      try {
         IGlOverlayLayer var1 = (IGlOverlayLayer)this.a.get();
         if (var1 != null) {
            var1.processCircleHoleOption(this.options);
         }

         if (!TextUtils.isEmpty(this.overlayName) && var1 != null) {
            var1.updateOption(this.overlayName, this.options);
         }
      } catch (Throwable var2) {
         ;
      }

   }
}
