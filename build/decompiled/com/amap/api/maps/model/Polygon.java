package com.amap.api.maps.model;

import android.text.TextUtils;
import com.amap.api.mapcore.util.ht;
import com.amap.api.maps.interfaces.IGlOverlayLayer;
import com.autonavi.amap.mapcore.interfaces.IPolygon;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public final class Polygon extends BaseOverlay {
   private IPolygon polygonDelegate;
   private PolygonOptions options;
   private WeakReference<IGlOverlayLayer> glOverlayLayerRef;

   public Polygon(IPolygon var1) {
      this.polygonDelegate = var1;
   }

   public Polygon(IGlOverlayLayer var1, PolygonOptions var2) {
      this.glOverlayLayerRef = new WeakReference(var1);
      this.options = var2;
   }

   public void remove() {
      try {
         if (this.polygonDelegate != null) {
            this.polygonDelegate.remove();
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
         return this.polygonDelegate != null ? this.polygonDelegate.getId() : this.overlayName;
      } catch (Throwable var2) {
         var2.printStackTrace();
         return null;
      }
   }

   public void setPoints(List<LatLng> var1) {
      try {
         if (this.polygonDelegate != null) {
            this.polygonDelegate.setPoints(var1);
         } else {
            this.options.setPoints(var1);
            this.a();
         }
      } catch (Throwable var3) {
         var3.printStackTrace();
      }

   }

   public List<LatLng> getPoints() {
      try {
         if (this.polygonDelegate != null) {
            return this.polygonDelegate.getPoints();
         } else {
            return this.options != null ? this.options.getPoints() : null;
         }
      } catch (Throwable var2) {
         var2.printStackTrace();
         return null;
      }
   }

   public void setHoleOptions(List<BaseHoleOptions> var1) {
      try {
         if (this.polygonDelegate != null) {
            this.polygonDelegate.setHoleOptions((List)var1);
         } else {
            if (var1 == null) {
               var1 = new ArrayList();
            }

            this.options.setHoleOptions((List)var1);
            this.a();
         }
      } catch (Throwable var3) {
         var3.printStackTrace();
      }

   }

   public List<BaseHoleOptions> getHoleOptions() {
      try {
         if (this.polygonDelegate != null) {
            return this.polygonDelegate.getHoleOptions();
         } else {
            return this.options != null ? this.options.getHoleOptions() : null;
         }
      } catch (Throwable var2) {
         var2.printStackTrace();
         return null;
      }
   }

   public void setStrokeWidth(float var1) {
      try {
         if (this.polygonDelegate != null) {
            this.polygonDelegate.setStrokeWidth(var1);
         } else {
            this.options.strokeWidth(var1);
            this.a();
         }
      } catch (Throwable var3) {
         var3.printStackTrace();
      }

   }

   public float getStrokeWidth() {
      try {
         if (this.polygonDelegate != null) {
            return this.polygonDelegate.getStrokeWidth();
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
         if (this.polygonDelegate != null) {
            this.polygonDelegate.setStrokeColor(var1);
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
         if (this.polygonDelegate != null) {
            return this.polygonDelegate.getStrokeColor();
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
         if (this.polygonDelegate != null) {
            this.polygonDelegate.setFillColor(var1);
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
         if (this.polygonDelegate != null) {
            return this.polygonDelegate.getFillColor();
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
         if (this.polygonDelegate != null) {
            this.polygonDelegate.setZIndex(var1);
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
         if (this.polygonDelegate != null) {
            return this.polygonDelegate.getZIndex();
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
         if (this.polygonDelegate != null) {
            this.polygonDelegate.setVisible(var1);
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
         if (this.polygonDelegate != null) {
            return this.polygonDelegate.isVisible();
         } else {
            return this.options != null ? this.options.isVisible() : false;
         }
      } catch (Throwable var2) {
         var2.printStackTrace();
         return false;
      }
   }

   public boolean contains(LatLng var1) {
      try {
         if (this.polygonDelegate != null) {
            return this.polygonDelegate.contains(var1);
         } else {
            IGlOverlayLayer var2 = (IGlOverlayLayer)this.glOverlayLayerRef.get();
            return var2 != null ? var2.IsPolygonContainsPoint(this.options, var1) : false;
         }
      } catch (Throwable var3) {
         var3.printStackTrace();
         return false;
      }
   }

   public boolean equals(Object var1) {
      if (var1 != null && var1 instanceof Polygon) {
         try {
            if (this.polygonDelegate != null) {
               return this.polygonDelegate.equalsRemote(((Polygon)var1).polygonDelegate);
            } else {
               return super.equals(var1) || ((Polygon)var1).getId() == this.getId();
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
         return this.polygonDelegate != null ? this.polygonDelegate.hashCodeRemote() : super.hashCode();
      } catch (Throwable var2) {
         return super.hashCode();
      }
   }

   private void a() {
      try {
         IGlOverlayLayer var1 = (IGlOverlayLayer)this.glOverlayLayerRef.get();
         if (!TextUtils.isEmpty(this.overlayName) && var1 != null) {
            this.setOptionPointList(this.options);
            var1.processPolygonHoleOption(this.options);
            var1.updateOption(this.overlayName, this.options);
         }
      } catch (Throwable var2) {
         ;
      }

   }

   protected void setOptionPointList(Object var1) {
      try {
         Class var2 = var1.getClass();
         Field var3 = var2.getDeclaredField("isPointsUpdated");
         if (var3 == null) {
            return;
         }

         var3.setAccessible(true);
         boolean var4 = var3.getBoolean(var1);
         if (var4) {
            PolygonOptions var5 = (PolygonOptions)var1;
            List var6 = var5.getPoints();
            double[] var7 = new double[var6.size() * 2];

            for(int var8 = 0; var8 < var6.size(); ++var8) {
               var7[var8 * 2] = ((LatLng)var6.get(var8)).latitude;
               var7[var8 * 2 + 1] = ((LatLng)var6.get(var8)).longitude;
            }

            Field var10 = var2.getDeclaredField("pointList");
            if (var10 == null) {
               return;
            }

            var10.setAccessible(true);
            var10.set(var1, var7);
         }
      } catch (Throwable var9) {
         ht.c(var9, "Polygon", "setOptionPointList");
      }

   }
}
