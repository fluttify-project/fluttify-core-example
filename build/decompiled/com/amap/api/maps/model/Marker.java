package com.amap.api.maps.model;

import com.amap.api.maps.model.animation.Animation;
import com.amap.api.maps.model.animation.Animation$AnimationListener;
import com.autonavi.amap.mapcore.IPoint;
import com.autonavi.amap.mapcore.interfaces.IMarker;
import com.autonavi.amap.mapcore.interfaces.IMarkerAction;
import java.util.ArrayList;

public final class Marker extends BasePointOverlay {
   private IMarker markerDelegate;

   public Marker(IMarker var1) {
      this.markerDelegate = var1;
   }

   public void setPeriod(int var1) {
      try {
         this.markerDelegate.setPeriod(var1);
      } catch (Throwable var3) {
         var3.printStackTrace();
      }

   }

   public int getPeriod() {
      try {
         return this.markerDelegate.getPeriod();
      } catch (Throwable var2) {
         var2.printStackTrace();
         return 0;
      }
   }

   public void setIcons(ArrayList<BitmapDescriptor> var1) {
      try {
         this.markerDelegate.setIcons(var1);
      } catch (Throwable var3) {
         var3.printStackTrace();
      }

   }

   public ArrayList<BitmapDescriptor> getIcons() {
      try {
         return this.markerDelegate.getIcons();
      } catch (Throwable var2) {
         var2.printStackTrace();
         return null;
      }
   }

   public void remove() {
      try {
         this.markerDelegate.remove();
      } catch (Throwable var2) {
         var2.printStackTrace();
      }

   }

   public void destroy() {
      try {
         if (this.markerDelegate != null) {
            this.markerDelegate.destroy(true);
         }
      } catch (Throwable var2) {
         var2.printStackTrace();
      }

   }

   public String getId() {
      try {
         return this.markerDelegate.getId();
      } catch (Throwable var2) {
         var2.printStackTrace();
         return null;
      }
   }

   /** @deprecated */
   public void setPerspective(boolean var1) {
      try {
         this.markerDelegate.setPerspective(var1);
      } catch (Throwable var3) {
         var3.printStackTrace();
      }

   }

   /** @deprecated */
   public boolean isPerspective() {
      try {
         return this.markerDelegate.isPerspective();
      } catch (Throwable var2) {
         var2.printStackTrace();
         return false;
      }
   }

   public void setPosition(LatLng var1) {
      try {
         this.markerDelegate.setPosition(var1);
      } catch (Throwable var3) {
         var3.printStackTrace();
      }

   }

   public LatLng getPosition() {
      try {
         return this.markerDelegate.getPosition();
      } catch (Throwable var2) {
         var2.printStackTrace();
         return null;
      }
   }

   public void setTitle(String var1) {
      try {
         this.markerDelegate.setTitle(var1);
      } catch (Throwable var3) {
         var3.printStackTrace();
      }

   }

   public String getTitle() {
      try {
         return this.markerDelegate.getTitle();
      } catch (Throwable var2) {
         var2.printStackTrace();
         return null;
      }
   }

   public void setSnippet(String var1) {
      try {
         this.markerDelegate.setSnippet(var1);
      } catch (Throwable var3) {
         var3.printStackTrace();
      }

   }

   public String getSnippet() {
      try {
         return this.markerDelegate.getSnippet();
      } catch (Throwable var2) {
         var2.printStackTrace();
         return null;
      }
   }

   public void setIcon(BitmapDescriptor var1) {
      try {
         if (var1 != null) {
            this.markerDelegate.setIcon(var1);
         }
      } catch (Throwable var3) {
         var3.printStackTrace();
      }

   }

   public void setAnchor(float var1, float var2) {
      try {
         this.markerDelegate.setAnchor(var1, var2);
      } catch (Throwable var4) {
         var4.printStackTrace();
      }

   }

   public void setDraggable(boolean var1) {
      try {
         this.markerDelegate.setDraggable(var1);
      } catch (Throwable var3) {
         var3.printStackTrace();
      }

   }

   public boolean isDraggable() {
      return this.markerDelegate.isDraggable();
   }

   public void showInfoWindow() {
      try {
         this.markerDelegate.showInfoWindow();
      } catch (Throwable var2) {
         var2.printStackTrace();
      }

   }

   public void hideInfoWindow() {
      try {
         this.markerDelegate.hideInfoWindow();
      } catch (Throwable var2) {
         var2.printStackTrace();
      }

   }

   public boolean isInfoWindowShown() {
      return this.markerDelegate.isInfoWindowShown();
   }

   public void setVisible(boolean var1) {
      try {
         this.markerDelegate.setVisible(var1);
      } catch (Throwable var3) {
         var3.printStackTrace();
      }

   }

   public boolean isVisible() {
      try {
         return this.markerDelegate.isVisible();
      } catch (Throwable var2) {
         var2.printStackTrace();
         return false;
      }
   }

   public boolean equals(Object var1) {
      try {
         return var1 != null && var1 instanceof Marker ? this.markerDelegate.equalsRemote(((Marker)var1).markerDelegate) : false;
      } catch (Throwable var3) {
         var3.printStackTrace();
         return false;
      }
   }

   public int hashCode() {
      return this.markerDelegate.hashCodeRemote();
   }

   public void setObject(Object var1) {
      this.markerDelegate.setObject(var1);
   }

   public Object getObject() {
      return this.markerDelegate.getObject();
   }

   public void setRotateAngle(float var1) {
      try {
         this.markerDelegate.setRotateAngle(var1);
      } catch (Throwable var3) {
         var3.printStackTrace();
      }

   }

   public float getRotateAngle() {
      return this.markerDelegate.getRotateAngle();
   }

   public void setToTop() {
      try {
         this.markerDelegate.set2Top();
      } catch (Throwable var2) {
         var2.printStackTrace();
      }

   }

   public void setGeoPoint(IPoint var1) {
      this.markerDelegate.setGeoPoint(var1);
   }

   public IPoint getGeoPoint() {
      return this.markerDelegate.getGeoPoint();
   }

   public void setFlat(boolean var1) {
      try {
         this.markerDelegate.setFlat(var1);
      } catch (Throwable var3) {
         var3.printStackTrace();
      }

   }

   public boolean isFlat() {
      return this.markerDelegate.isFlat();
   }

   public void setPositionByPixels(int var1, int var2) {
      this.markerDelegate.setPositionByPixels(var1, var2);
   }

   public void setZIndex(float var1) {
      this.markerDelegate.setZIndex(var1);
   }

   public float getZIndex() {
      return this.markerDelegate.getZIndex();
   }

   public void setAnimation(Animation var1) {
      try {
         this.markerDelegate.setAnimation(var1);
      } catch (Throwable var3) {
         ;
      }

   }

   public boolean startAnimation() {
      return this.markerDelegate.startAnimation();
   }

   public void setAnimationListener(Animation$AnimationListener var1) {
      this.markerDelegate.setAnimationListener(var1);
   }

   public float getAlpha() {
      IMarkerAction var1 = this.markerDelegate.getIMarkerAction();
      return var1 != null ? var1.getAlpha() : 1.0F;
   }

   public void setAlpha(float var1) {
      IMarkerAction var2 = this.markerDelegate.getIMarkerAction();
      if (var2 != null) {
         var2.setAlpha(var1);
      }

   }

   public int getDisplayLevel() {
      IMarkerAction var1 = this.markerDelegate.getIMarkerAction();
      return var1 != null ? var1.getDisplayLevel() : 5;
   }

   public MarkerOptions getOptions() {
      IMarkerAction var1 = this.markerDelegate.getIMarkerAction();
      return var1 != null ? var1.getOptions() : null;
   }

   public boolean isClickable() {
      IMarkerAction var1 = this.markerDelegate.getIMarkerAction();
      return var1 != null ? var1.isClickable() : false;
   }

   public boolean isInfoWindowAutoOverturn() {
      IMarkerAction var1 = this.markerDelegate.getIMarkerAction();
      return var1 != null ? var1.isInfoWindowAutoOverturn() : false;
   }

   public boolean isInfoWindowEnable() {
      IMarkerAction var1 = this.markerDelegate.getIMarkerAction();
      return var1 != null ? var1.isInfoWindowEnable() : false;
   }

   public void setInfoWindowEnable(boolean var1) {
      IMarkerAction var2 = this.markerDelegate.getIMarkerAction();
      if (var2 != null) {
         var2.setInfoWindowEnable(var1);
      }

   }

   public void setMarkerOptions(MarkerOptions var1) {
      IMarkerAction var2 = this.markerDelegate.getIMarkerAction();
      if (var2 != null) {
         var2.setMarkerOptions(var1);
      }

   }

   public void setAutoOverturnInfoWindow(boolean var1) {
      IMarkerAction var2 = this.markerDelegate.getIMarkerAction();
      if (var2 != null) {
         var2.setAutoOverturnInfoWindow(var1);
      }

   }

   public void setClickable(boolean var1) {
      IMarkerAction var2 = this.markerDelegate.getIMarkerAction();
      if (var2 != null) {
         var2.setClickable(var1);
      }

   }

   public void setDisplayLevel(int var1) {
      IMarkerAction var2 = this.markerDelegate.getIMarkerAction();
      if (var2 != null) {
         var2.setDisplayLevel(var1);
      }

   }

   public void setFixingPointEnable(boolean var1) {
      IMarkerAction var2 = this.markerDelegate.getIMarkerAction();
      if (var2 != null) {
         var2.setFixingPointEnable(var1);
      }

   }

   public boolean isRemoved() {
      return this.markerDelegate != null ? this.markerDelegate.isRemoved() : false;
   }

   public void setPositionNotUpdate(LatLng var1) {
      this.setPosition(var1);
   }

   public void setRotateAngleNotUpdate(float var1) {
      IMarkerAction var2 = this.markerDelegate.getIMarkerAction();
      if (var2 != null) {
         var2.setRotateAngleNotUpdate(var1);
      }

   }

   public void setBelowMaskLayer(boolean var1) {
      this.markerDelegate.setBelowMaskLayer(var1);
   }

   public float getAnchorU() {
      return this.markerDelegate.getAnchorU();
   }

   public float getAnchorV() {
      return this.markerDelegate.getAnchorV();
   }
}
