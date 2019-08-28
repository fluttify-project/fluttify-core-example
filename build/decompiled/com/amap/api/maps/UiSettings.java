package com.amap.api.maps;

import com.autonavi.amap.mapcore.interfaces.IUiSettings;

public final class UiSettings {
   private final IUiSettings a;

   public UiSettings(IUiSettings var1) {
      this.a = var1;
   }

   public void setScaleControlsEnabled(boolean var1) {
      try {
         this.a.setScaleControlsEnabled(var1);
      } catch (Throwable var3) {
         var3.printStackTrace();
      }

   }

   public void setZoomControlsEnabled(boolean var1) {
      try {
         this.a.setZoomControlsEnabled(var1);
      } catch (Throwable var3) {
         var3.printStackTrace();
      }

   }

   public void setCompassEnabled(boolean var1) {
      try {
         this.a.setCompassEnabled(var1);
      } catch (Throwable var3) {
         var3.printStackTrace();
      }

   }

   public void setMyLocationButtonEnabled(boolean var1) {
      try {
         this.a.setMyLocationButtonEnabled(var1);
      } catch (Throwable var3) {
         var3.printStackTrace();
      }

   }

   public void setScrollGesturesEnabled(boolean var1) {
      try {
         this.a.setScrollGesturesEnabled(var1);
      } catch (Throwable var3) {
         var3.printStackTrace();
      }

   }

   public void setZoomGesturesEnabled(boolean var1) {
      try {
         this.a.setZoomGesturesEnabled(var1);
      } catch (Throwable var3) {
         var3.printStackTrace();
      }

   }

   public void setTiltGesturesEnabled(boolean var1) {
      try {
         this.a.setTiltGesturesEnabled(var1);
      } catch (Throwable var3) {
         var3.printStackTrace();
      }

   }

   public void setRotateGesturesEnabled(boolean var1) {
      try {
         this.a.setRotateGesturesEnabled(var1);
      } catch (Throwable var3) {
         var3.printStackTrace();
      }

   }

   public void setAllGesturesEnabled(boolean var1) {
      try {
         this.a.setAllGesturesEnabled(var1);
      } catch (Throwable var3) {
         var3.printStackTrace();
      }

   }

   public void setLogoPosition(int var1) {
      try {
         this.a.setLogoPosition(var1);
      } catch (Throwable var3) {
         var3.printStackTrace();
      }

   }

   public void setZoomPosition(int var1) {
      try {
         this.a.setZoomPosition(var1);
      } catch (Throwable var3) {
         var3.printStackTrace();
      }

   }

   public int getZoomPosition() {
      try {
         return this.a.getZoomPosition();
      } catch (Throwable var2) {
         var2.printStackTrace();
         return 2;
      }
   }

   public boolean isScaleControlsEnabled() {
      try {
         return this.a.isScaleControlsEnabled();
      } catch (Throwable var2) {
         var2.printStackTrace();
         return false;
      }
   }

   public boolean isZoomControlsEnabled() {
      try {
         return this.a.isZoomControlsEnabled();
      } catch (Throwable var2) {
         var2.printStackTrace();
         return true;
      }
   }

   public boolean isCompassEnabled() {
      try {
         return this.a.isCompassEnabled();
      } catch (Throwable var2) {
         var2.printStackTrace();
         return false;
      }
   }

   public boolean isMyLocationButtonEnabled() {
      try {
         return this.a.isMyLocationButtonEnabled();
      } catch (Throwable var2) {
         var2.printStackTrace();
         return false;
      }
   }

   public boolean isScrollGesturesEnabled() {
      try {
         return this.a.isScrollGesturesEnabled();
      } catch (Throwable var2) {
         var2.printStackTrace();
         return true;
      }
   }

   public boolean isZoomGesturesEnabled() {
      try {
         return this.a.isZoomGesturesEnabled();
      } catch (Throwable var2) {
         var2.printStackTrace();
         return true;
      }
   }

   public boolean isTiltGesturesEnabled() {
      try {
         return this.a.isTiltGesturesEnabled();
      } catch (Throwable var2) {
         var2.printStackTrace();
         return true;
      }
   }

   public boolean isRotateGesturesEnabled() {
      try {
         return this.a.isRotateGesturesEnabled();
      } catch (Throwable var2) {
         var2.printStackTrace();
         return true;
      }
   }

   public int getLogoPosition() {
      try {
         return this.a.getLogoPosition();
      } catch (Throwable var2) {
         var2.printStackTrace();
         return 0;
      }
   }

   public boolean isIndoorSwitchEnabled() {
      try {
         return this.a.isIndoorSwitchEnabled();
      } catch (Throwable var2) {
         var2.printStackTrace();
         return false;
      }
   }

   public void setIndoorSwitchEnabled(boolean var1) {
      try {
         this.a.setIndoorSwitchEnabled(var1);
      } catch (Throwable var3) {
         var3.printStackTrace();
      }

   }

   public final void setLogoMarginRate(int var1, float var2) {
      try {
         this.a.setLogoMarginRate(var1, var2);
      } catch (Throwable var4) {
         var4.printStackTrace();
      }

   }

   public float getLogoMarginRate(int var1) {
      try {
         return this.a.getLogoMarginRate(var1);
      } catch (Throwable var3) {
         var3.printStackTrace();
         return 0.0F;
      }
   }

   public final void setLogoLeftMargin(int var1) {
      try {
         this.a.setLogoLeftMargin(var1);
      } catch (Throwable var3) {
         var3.printStackTrace();
      }

   }

   public final void setLogoBottomMargin(int var1) {
      try {
         this.a.setLogoBottomMargin(var1);
      } catch (Throwable var3) {
         var3.printStackTrace();
      }

   }

   public void setZoomInByScreenCenter(boolean var1) {
      try {
         this.a.setZoomInByScreenCenter(var1);
      } catch (Throwable var3) {
         var3.printStackTrace();
      }

   }

   public void setGestureScaleByMapCenter(boolean var1) {
      try {
         this.a.setGestureScaleByMapCenter(var1);
      } catch (Throwable var3) {
         var3.printStackTrace();
      }

   }

   public boolean isGestureScaleByMapCenter() {
      try {
         return this.a.isGestureScaleByMapCenter();
      } catch (Throwable var2) {
         var2.printStackTrace();
         return false;
      }
   }

   protected void setLogoEnable(boolean var1) {
      try {
         this.a.setLogoEnable(var1);
      } catch (Throwable var3) {
         var3.printStackTrace();
      }

   }
}
