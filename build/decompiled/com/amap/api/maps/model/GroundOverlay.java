package com.amap.api.maps.model;

import android.text.TextUtils;
import com.amap.api.maps.interfaces.IGlOverlayLayer;
import com.autonavi.amap.mapcore.interfaces.IGroundOverlay;
import java.lang.ref.WeakReference;

public final class GroundOverlay extends BaseOverlay {
   private IGroundOverlay iGroundOverlayDelegate;
   private String overlayName;
   private GroundOverlayOptions options;
   private WeakReference<IGlOverlayLayer> glOverlayLayerRef;
   private LatLng point;
   private float width;
   private float high;

   public GroundOverlay(IGroundOverlay var1) {
      this.iGroundOverlayDelegate = var1;
   }

   public GroundOverlay(IGlOverlayLayer var1, GroundOverlayOptions var2) {
      this.glOverlayLayerRef = new WeakReference(var1);
      this.options = var2;
      this.overlayName = "";
   }

   public void remove() {
      try {
         if (this.iGroundOverlayDelegate != null) {
            this.iGroundOverlayDelegate.remove();
         } else {
            IGlOverlayLayer var1 = (IGlOverlayLayer)this.glOverlayLayerRef.get();
            if (var1 != null) {
               var1.removeOverlay(this.overlayName);
            }

            if (this.options != null && this.options.getImage() != null) {
               this.options.getImage().recycle();
            }
         }
      } catch (Throwable var2) {
         var2.printStackTrace();
      }

   }

   public String getId() {
      try {
         return this.iGroundOverlayDelegate != null ? this.iGroundOverlayDelegate.getId() : this.overlayName;
      } catch (Throwable var2) {
         var2.printStackTrace();
         return null;
      }
   }

   public void setPosition(LatLng var1) {
      try {
         if (this.iGroundOverlayDelegate != null) {
            this.iGroundOverlayDelegate.setPosition(var1);
         } else if (this.options != null && var1 != null) {
            float var2 = this.width > 0.0F ? this.width : this.options.getWidth();
            float var3 = this.high > 0.0F ? this.high : this.options.getHeight();
            if (var2 == 0.0F) {
               this.point = var1;
            } else if (var3 == 0.0F) {
               this.options.position(var1, var2);
               this.a();
            } else if (var3 > 0.0F) {
               this.options.position(var1, var2, var3);
               this.a();
            }
         }
      } catch (Throwable var4) {
         var4.printStackTrace();
      }

   }

   public LatLng getPosition() {
      try {
         if (this.iGroundOverlayDelegate != null) {
            return this.iGroundOverlayDelegate.getPosition();
         } else {
            return this.options != null ? this.options.getLocation() : null;
         }
      } catch (Throwable var2) {
         var2.printStackTrace();
         return null;
      }
   }

   public void setDimensions(float var1) {
      try {
         if (this.iGroundOverlayDelegate != null) {
            this.iGroundOverlayDelegate.setDimensions(var1);
         } else if (this.options != null) {
            LatLng var2 = this.point != null ? this.point : this.options.getLocation();
            if (var2 == null) {
               this.width = var1;
            } else {
               this.options.position(var2, var1);
               this.a();
            }
         }
      } catch (Throwable var3) {
         var3.printStackTrace();
      }

   }

   public void setImage(BitmapDescriptor var1) {
      try {
         if (this.iGroundOverlayDelegate != null) {
            this.iGroundOverlayDelegate.setImage(var1);
         } else if (this.options != null) {
            this.options.image(var1);
            this.a();
         }
      } catch (Throwable var3) {
         var3.printStackTrace();
      }

   }

   public void setDimensions(float var1, float var2) {
      try {
         if (this.iGroundOverlayDelegate != null) {
            this.iGroundOverlayDelegate.setDimensions(var1, var2);
         } else if (this.options != null) {
            LatLng var3 = this.point != null ? this.point : this.options.getLocation();
            if (var3 == null) {
               this.width = var1;
               this.high = var2;
            } else {
               this.options.position(this.options.getLocation(), var1, var2);
               this.a();
            }
         }
      } catch (Throwable var4) {
         var4.printStackTrace();
      }

   }

   public float getWidth() {
      try {
         if (this.iGroundOverlayDelegate != null) {
            return this.iGroundOverlayDelegate.getWidth();
         } else {
            return this.options != null ? this.options.getWidth() : 0.0F;
         }
      } catch (Throwable var2) {
         var2.printStackTrace();
         return 0.0F;
      }
   }

   public float getHeight() {
      try {
         if (this.iGroundOverlayDelegate != null) {
            return this.iGroundOverlayDelegate.getHeight();
         } else {
            return this.options != null ? this.options.getHeight() : 0.0F;
         }
      } catch (Throwable var2) {
         var2.printStackTrace();
         return 0.0F;
      }
   }

   public void setPositionFromBounds(LatLngBounds var1) {
      try {
         if (this.iGroundOverlayDelegate != null) {
            this.iGroundOverlayDelegate.setPositionFromBounds(var1);
         } else if (this.options != null && var1 != null) {
            this.options.positionFromBounds(var1);
            this.a();
         }
      } catch (Throwable var3) {
         var3.printStackTrace();
      }

   }

   public LatLngBounds getBounds() {
      try {
         if (this.iGroundOverlayDelegate != null) {
            return this.iGroundOverlayDelegate.getBounds();
         } else {
            return this.options != null ? this.options.getBounds() : null;
         }
      } catch (Throwable var2) {
         var2.printStackTrace();
         return null;
      }
   }

   public void setBearing(float var1) {
      try {
         if (this.iGroundOverlayDelegate != null) {
            this.iGroundOverlayDelegate.setBearing(var1);
         } else if (this.options != null) {
            this.options.bearing(var1);
            this.a();
         }
      } catch (Throwable var3) {
         var3.printStackTrace();
      }

   }

   public float getBearing() {
      try {
         if (this.iGroundOverlayDelegate != null) {
            return this.iGroundOverlayDelegate.getBearing();
         } else {
            return this.options != null ? this.options.getBearing() : 0.0F;
         }
      } catch (Throwable var2) {
         var2.printStackTrace();
         return 0.0F;
      }
   }

   public void setZIndex(float var1) {
      try {
         if (this.iGroundOverlayDelegate != null) {
            this.iGroundOverlayDelegate.setZIndex(var1);
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
         if (this.iGroundOverlayDelegate != null) {
            return this.iGroundOverlayDelegate.getZIndex();
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
         if (this.iGroundOverlayDelegate != null) {
            this.iGroundOverlayDelegate.setVisible(var1);
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
         if (this.iGroundOverlayDelegate != null) {
            return this.iGroundOverlayDelegate.isVisible();
         } else {
            return this.options != null ? this.options.isVisible() : false;
         }
      } catch (Throwable var2) {
         var2.printStackTrace();
         return false;
      }
   }

   public void setTransparency(float var1) {
      try {
         if (this.iGroundOverlayDelegate != null) {
            this.iGroundOverlayDelegate.setTransparency(var1);
         } else if (this.options != null) {
            this.options.transparency(var1);
            this.a();
         }
      } catch (Throwable var3) {
         var3.printStackTrace();
      }

   }

   public float getTransparency() {
      try {
         if (this.iGroundOverlayDelegate != null) {
            return this.iGroundOverlayDelegate.getTransparency();
         } else {
            return this.options != null ? this.options.getTransparency() : 0.0F;
         }
      } catch (Throwable var2) {
         var2.printStackTrace();
         return 0.0F;
      }
   }

   public boolean equals(Object var1) {
      if (var1 != null && var1 instanceof GroundOverlay) {
         try {
            if (this.iGroundOverlayDelegate != null) {
               return this.iGroundOverlayDelegate.equalsRemote(((GroundOverlay)var1).iGroundOverlayDelegate);
            } else {
               return super.equals(var1) || ((GroundOverlay)var1).getId() == this.getId();
            }
         } catch (Throwable var3) {
            var3.printStackTrace();
            return false;
         }
      } else {
         return false;
      }
   }

   public void destroy() {
      try {
         if (this.iGroundOverlayDelegate != null) {
            this.iGroundOverlayDelegate.destroy();
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

   public int hashCode() {
      return this.iGroundOverlayDelegate != null ? this.iGroundOverlayDelegate.hashCode() : super.hashCode();
   }

   private void a() {
      IGlOverlayLayer var1 = (IGlOverlayLayer)this.glOverlayLayerRef.get();
      if (!TextUtils.isEmpty(this.overlayName) && var1 != null) {
         var1.updateOption(this.overlayName, this.options);
      }

   }
}
