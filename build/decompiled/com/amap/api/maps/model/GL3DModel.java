package com.amap.api.maps.model;

import com.amap.api.maps.model.animation.Animation;
import com.autonavi.amap.mapcore.IPoint;
import com.autonavi.amap.mapcore.interfaces.IglModel;

public class GL3DModel extends BasePointOverlay {
   private final IglModel mModel;

   public GL3DModel(IglModel var1) {
      this.mModel = var1;
   }

   public void setPosition(LatLng var1) {
      try {
         this.mModel.setPosition(var1);
      } catch (Exception var3) {
         var3.printStackTrace();
      }

   }

   public void setAngle(float var1) {
      try {
         this.mModel.setRotateAngle(var1);
      } catch (Exception var3) {
         var3.printStackTrace();
      }

   }

   public float getAngle() {
      try {
         return this.mModel.getRotateAngle();
      } catch (Exception var2) {
         var2.printStackTrace();
         return 0.0F;
      }
   }

   public LatLng getPosition() {
      try {
         return this.mModel.getPosition();
      } catch (Exception var2) {
         var2.printStackTrace();
         return null;
      }
   }

   public String getId() {
      try {
         return this.mModel.getId();
      } catch (Exception var2) {
         var2.printStackTrace();
         return "";
      }
   }

   public void setAnimation(Animation var1) {
      try {
         this.mModel.setAnimation(var1);
      } catch (Throwable var3) {
         var3.printStackTrace();
      }

   }

   public boolean startAnimation() {
      try {
         return this.mModel.startAnimation();
      } catch (Exception var2) {
         var2.printStackTrace();
         return false;
      }
   }

   public void setModelFixedLength(int var1) {
      try {
         this.mModel.setModelFixedLength(var1);
      } catch (Exception var3) {
         var3.printStackTrace();
      }

   }

   public void remove() {
      try {
         this.mModel.remove();
      } catch (Exception var2) {
         var2.printStackTrace();
      }

   }

   public boolean isVisible() {
      try {
         return this.mModel.isVisible();
      } catch (Exception var2) {
         var2.printStackTrace();
         return false;
      }
   }

   public void setVisible(boolean var1) {
      try {
         this.mModel.setVisible(var1);
      } catch (Exception var3) {
         var3.printStackTrace();
      }

   }

   public void setObject(Object var1) {
      try {
         this.mModel.setObject(var1);
      } catch (Exception var3) {
         var3.printStackTrace();
      }

   }

   public Object getObject() {
      return this.mModel != null ? this.mModel.getObject() : null;
   }

   public void setRotateAngle(float var1) {
      try {
         this.mModel.setRotateAngle(var1);
      } catch (Exception var3) {
         var3.printStackTrace();
      }

   }

   public float getRotateAngle() {
      try {
         return this.mModel.getRotateAngle();
      } catch (Exception var2) {
         var2.printStackTrace();
         return 0.0F;
      }
   }

   public void setZoomLimit(float var1) {
      if (this.mModel != null) {
         this.mModel.setZoomLimit(var1);
      }

   }

   public void destroy() {
      if (this.mModel != null) {
         this.mModel.destroy();
      }

   }

   public void setGeoPoint(IPoint var1) {
      if (this.mModel != null) {
         this.mModel.setGeoPoint(var1);
      }

   }

   public void setTitle(String var1) {
      if (this.mModel != null) {
         this.mModel.setTitle(var1);
      }

   }

   public String getTitle() {
      try {
         return this.mModel.getTitle();
      } catch (Exception var2) {
         var2.printStackTrace();
         return "";
      }
   }

   public String getSnippet() {
      try {
         return this.mModel.getSnippet();
      } catch (Exception var2) {
         var2.printStackTrace();
         return "";
      }
   }

   public void setSnippet(String var1) {
      if (this.mModel != null) {
         this.mModel.setSnippet(var1);
      }

   }

   public void showInfoWindow() {
      try {
         this.mModel.showInfoWindow();
      } catch (Throwable var2) {
         var2.printStackTrace();
      }

   }
}
