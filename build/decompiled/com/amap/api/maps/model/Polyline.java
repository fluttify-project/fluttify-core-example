package com.amap.api.maps.model;

import android.text.TextUtils;
import com.amap.api.mapcore.util.ht;
import com.amap.api.maps.interfaces.IGlOverlayLayer;
import com.autonavi.amap.mapcore.interfaces.IPolyline;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.List;

public class Polyline extends BaseOverlay {
   private IPolyline polylineDelegate;
   private PolylineOptions options;
   private WeakReference<IGlOverlayLayer> glOverlayLayerRef;

   public Polyline(IGlOverlayLayer var1, PolylineOptions var2) {
      this.glOverlayLayerRef = new WeakReference(var1);
      this.options = var2;
   }

   public Polyline(IGlOverlayLayer var1, PolylineOptions var2, String var3) {
      this.glOverlayLayerRef = new WeakReference(var1);
      this.options = var2;
      this.overlayName = var3;
   }

   public Polyline(IPolyline var1) {
      this.polylineDelegate = var1;
   }

   public void remove() {
      try {
         if (this.polylineDelegate != null) {
            this.polylineDelegate.remove();
         } else {
            IGlOverlayLayer var1 = (IGlOverlayLayer)this.glOverlayLayerRef.get();
            if (var1 != null) {
               var1.removeOverlay(this.overlayName);
            }

            BitmapDescriptor var2 = this.options.getCustomTexture();
            if (var2 != null) {
               var2.recycle();
            }

            if (this.options.getCustomTextureList() != null) {
               Iterator var3 = this.options.getCustomTextureList().iterator();

               while(var3.hasNext()) {
                  BitmapDescriptor var4 = (BitmapDescriptor)var3.next();
                  var4.recycle();
               }

               this.options.getCustomTextureList().clear();
            }

            this.options = null;
            this.overlayName = null;
         }
      } catch (Throwable var5) {
         var5.printStackTrace();
      }

   }

   public String getId() {
      try {
         return this.polylineDelegate != null ? this.polylineDelegate.getId() : this.overlayName;
      } catch (Throwable var2) {
         var2.printStackTrace();
         return null;
      }
   }

   public void setPoints(List<LatLng> var1) {
      try {
         if (this.polylineDelegate != null) {
            this.polylineDelegate.setPoints(var1);
         } else {
            synchronized(this) {
               if (this.options != null) {
                  this.options.setPoints(var1);
                  this.a();
               }
            }
         }
      } catch (Throwable var5) {
         var5.printStackTrace();
      }

   }

   public List<LatLng> getPoints() {
      try {
         if (this.polylineDelegate != null) {
            return this.polylineDelegate.getPoints();
         } else {
            return this.options != null ? this.options.getPoints() : null;
         }
      } catch (Throwable var2) {
         var2.printStackTrace();
         return null;
      }
   }

   public void setGeodesic(boolean var1) {
      try {
         if (this.polylineDelegate != null) {
            if (this.polylineDelegate.isGeodesic() != var1) {
               List var2 = this.getPoints();
               this.polylineDelegate.setGeodesic(var1);
               this.setPoints(var2);
            }
         } else if (this.options != null) {
            this.options.geodesic(var1);
            this.a();
         }
      } catch (Throwable var3) {
         var3.printStackTrace();
      }

   }

   public boolean isGeodesic() {
      if (this.polylineDelegate.isGeodesic()) {
         return true;
      } else {
         return this.options != null ? this.options.isGeodesic() : false;
      }
   }

   public void setDottedLine(boolean var1) {
      if (this.polylineDelegate != null) {
         this.polylineDelegate.setDottedLine(var1);
      } else if (this.options != null) {
         this.options.setDottedLine(var1);
         this.a();
      }

   }

   public boolean isDottedLine() {
      if (this.polylineDelegate != null) {
         return this.polylineDelegate.isDottedLine();
      } else {
         return this.options != null ? this.options.isDottedLine() : false;
      }
   }

   public void setWidth(float var1) {
      try {
         if (this.polylineDelegate != null) {
            this.polylineDelegate.setWidth(var1);
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
         if (this.polylineDelegate != null) {
            return this.polylineDelegate.getWidth();
         } else {
            return this.options != null ? this.options.getWidth() : 0.0F;
         }
      } catch (Throwable var2) {
         var2.printStackTrace();
         return 0.0F;
      }
   }

   public void setColor(int var1) {
      try {
         if (this.polylineDelegate != null) {
            this.polylineDelegate.setColor(var1);
         } else if (this.options != null) {
            this.options.color(var1);
            this.a();
         }
      } catch (Throwable var3) {
         var3.printStackTrace();
      }

   }

   public int getColor() {
      try {
         if (this.polylineDelegate != null) {
            return this.polylineDelegate.getColor();
         } else {
            return this.options != null ? this.options.getColor() : 0;
         }
      } catch (Throwable var2) {
         var2.printStackTrace();
         return 0;
      }
   }

   public void setZIndex(float var1) {
      try {
         if (this.polylineDelegate != null) {
            this.polylineDelegate.setZIndex(var1);
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
         if (this.polylineDelegate != null) {
            return this.polylineDelegate.getZIndex();
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
         if (this.polylineDelegate != null) {
            this.polylineDelegate.setVisible(var1);
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
         if (this.polylineDelegate != null) {
            return this.polylineDelegate.isVisible();
         } else {
            return this.options != null ? this.options.isVisible() : false;
         }
      } catch (Throwable var2) {
         var2.printStackTrace();
         return false;
      }
   }

   public boolean equals(Object var1) {
      if (!(var1 instanceof Polyline)) {
         return false;
      } else {
         try {
            if (this.polylineDelegate != null) {
               return this.polylineDelegate.equalsRemote(((Polyline)var1).polylineDelegate);
            } else {
               return super.equals(var1) || ((Polyline)var1).getId() == this.getId();
            }
         } catch (Throwable var3) {
            var3.printStackTrace();
            return false;
         }
      }
   }

   public int hashCode() {
      try {
         return this.polylineDelegate != null ? this.polylineDelegate.hashCodeRemote() : super.hashCode();
      } catch (Throwable var2) {
         var2.printStackTrace();
         return 0;
      }
   }

   public LatLng getNearestLatLng(LatLng var1) {
      if (this.polylineDelegate != null) {
         return this.polylineDelegate.getNearestLatLng(var1);
      } else {
         IGlOverlayLayer var2 = (IGlOverlayLayer)this.glOverlayLayerRef.get();
         return var2 != null ? var2.getNearestLatLng(this.options, var1) : null;
      }
   }

   public void setTransparency(float var1) {
      if (this.polylineDelegate != null) {
         this.polylineDelegate.setTransparency(var1);
      } else if (this.options != null) {
         this.options.transparency(var1);
         this.a();
      }

   }

   public void setAboveMaskLayer(boolean var1) {
      if (this.polylineDelegate != null) {
         this.polylineDelegate.setAboveMaskLayer(var1);
      } else if (this.options != null) {
         this.options.aboveMaskLayer(var1);
         this.a();
      }

   }

   public void setCustomTexture(BitmapDescriptor var1) {
      if (this.polylineDelegate != null) {
         this.polylineDelegate.setCustomTexture(var1);
      } else if (this.options != null) {
         this.options.setCustomTexture(var1);
         this.a();
      }

   }

   public void setOptions(PolylineOptions var1) {
      if (this.polylineDelegate != null) {
         this.polylineDelegate.setOptions(var1);
      } else {
         this.options = var1;
         this.a();
      }

   }

   public PolylineOptions getOptions() {
      return this.polylineDelegate != null ? this.polylineDelegate.getOptions() : this.options;
   }

   public void setCustemTextureIndex(List<Integer> var1) {
      if (this.polylineDelegate != null) {
         this.polylineDelegate.setCustemTextureIndex(var1);
      } else {
         synchronized(this) {
            if (this.options != null) {
               this.options.setCustomTextureIndex(var1);
               this.a();
            }
         }
      }

   }

   public void setShownRatio(float var1) {
      try {
         if (this.polylineDelegate != null) {
            this.polylineDelegate.setShownRatio(var1);
         } else if (this.options != null) {
            this.options.setShownRatio(var1);
            this.a();
         }
      } catch (Throwable var3) {
         var3.printStackTrace();
      }

   }

   public void setShownRange(float var1, float var2) {
      try {
         if (this.polylineDelegate != null) {
            this.polylineDelegate.setShowRange(var1, var2);
         } else if (this.options != null) {
            this.options.setShownRange(var1, var2);
            this.a();
         }
      } catch (Throwable var4) {
         var4.printStackTrace();
      }

   }

   public float getShownRatio() {
      try {
         if (this.polylineDelegate != null) {
            return this.polylineDelegate.getShownRatio();
         } else {
            return this.options != null ? this.options.getShownRatio() : -1.0F;
         }
      } catch (Throwable var2) {
         var2.printStackTrace();
         return -1.0F;
      }
   }

   private void a() {
      try {
         synchronized(this) {
            IGlOverlayLayer var2 = (IGlOverlayLayer)this.glOverlayLayerRef.get();
            if (!TextUtils.isEmpty(this.overlayName) && var2 != null) {
               this.setOptionPointList(this.options);
               if (var2 != null) {
                  var2.updateOption(this.overlayName, this.options);
               }
            }
         }
      } catch (Throwable var5) {
         ;
      }

   }

   public void setCustomTextureList(List<BitmapDescriptor> var1) {
      try {
         if (this.polylineDelegate != null) {
            this.polylineDelegate.setCustomTextureList(var1);
         } else {
            this.options.setCustomTextureList(var1);
            this.a();
         }
      } catch (Throwable var3) {
         var3.printStackTrace();
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
            PolylineOptions var5 = (PolylineOptions)var1;
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
         ht.c(var9, "Polyline", "setOptionPointList");
      }

   }
}
