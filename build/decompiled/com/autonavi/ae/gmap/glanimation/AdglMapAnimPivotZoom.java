package com.autonavi.ae.gmap.glanimation;

import android.graphics.Point;
import android.os.SystemClock;
import com.autonavi.ae.gmap.GLMapState;
import com.autonavi.amap.mapcore.IPoint;

public class AdglMapAnimPivotZoom extends AbstractAdglAnimation {
   private boolean hasCheckParams;
   private float mapLevelTo;
   private int beginCenterGeoX;
   private int beginCenterGeoY;
   private int pivotGeoX;
   private int pivotGeoY;
   private boolean zoomCenter;
   private float winPivotX;
   private float winPivotY;
   AbstractAdglAnimationParam1V zoomParam = null;

   public void reset() {
      this.isOver = false;
      this.hasCheckParams = false;
      this.zoomCenter = true;
      this.mapLevelTo = 0.0F;
      this.beginCenterGeoX = 0;
      this.beginCenterGeoY = 0;
      this.pivotGeoX = 0;
      this.pivotGeoY = 0;
      this.winPivotX = 0.0F;
      this.winPivotY = 0.0F;
      if (this.zoomParam != null) {
         this.zoomParam.reset();
      }

   }

   public void commitAnimation(Object var1) {
      this.isOver = true;
      this.hasCheckParams = false;
      GLMapState var2 = (GLMapState)var1;
      if (var2 != null) {
         float var3 = var2.getMapZoomer();
         float var4 = this.mapLevelTo - var3;
         if ((double)Math.abs(var4) < 1.0E-6D) {
            this.isOver = true;
            this.hasCheckParams = true;
         } else {
            this.zoomParam.setFromValue(var3);
            this.zoomParam.setToValue(this.mapLevelTo);
            if (!this.zoomCenter) {
               IPoint var6 = IPoint.obtain();
               var2.getMapGeoCenter(var6);
               this.beginCenterGeoX = var6.x;
               this.beginCenterGeoY = var6.y;
               IPoint var7 = IPoint.obtain();
               var2.screenToP20Point((int)this.winPivotX, (int)this.winPivotY, var7);
               this.pivotGeoX = var7.x;
               this.pivotGeoY = var7.y;
               var6.recycle();
               var7.recycle();
            }

            this.hasCheckParams = true;
            this.isOver = false;
            this.startTime = SystemClock.uptimeMillis();
         }
      }
   }

   public AdglMapAnimPivotZoom(int var1) {
      this.reset();
      this.duration = var1;
   }

   public void setToMapZoomAndPivot(float var1, int var2, Point var3) {
      this.zoomParam = new AbstractAdglAnimationParam1V();
      this.zoomParam.setInterpolatorType(var2, 1.0F);
      if (var1 > 20.0F) {
         var1 = 20.0F;
      }

      if (var1 < 3.0F) {
         var1 = 3.0F;
      }

      this.mapLevelTo = var1;
      if (var3 != null) {
         this.winPivotX = (float)var3.x;
         this.winPivotY = (float)var3.y;
         this.zoomCenter = false;
      }

   }

   public void doAnimation(Object var1) {
      GLMapState var2 = (GLMapState)var1;
      if (var2 != null) {
         if (!this.hasCheckParams) {
            this.commitAnimation(var1);
         }

         if (!this.isOver) {
            long var3 = SystemClock.uptimeMillis();
            this.offsetTime = var3 - this.startTime;
            float var5 = (float)this.offsetTime / (float)this.duration;
            if (var5 > 1.0F) {
               var5 = 1.0F;
               this.isOver = true;
            }

            if (var5 >= 0.0F && var5 <= 1.0F) {
               this.zoomParam.setNormalizedTime(var5);
               float var6 = this.zoomParam.getCurValue();
               if (var6 > 20.0F) {
                  var6 = 20.0F;
                  this.isOver = true;
               }

               if (var6 < 3.0F) {
                  var6 = 3.0F;
                  this.isOver = true;
               }

               if (!this.zoomCenter) {
                  float var7 = var6 - this.zoomParam.getFromValue();
                  float var8 = (float)Math.pow(2.0D, (double)var7);
                  int var9 = (int)((float)(this.pivotGeoX - this.beginCenterGeoX) * (1.0F - 1.0F / var8));
                  int var10 = (int)((float)(this.pivotGeoY - this.beginCenterGeoY) * (1.0F - 1.0F / var8));
                  var2.setMapGeoCenter(this.beginCenterGeoX + var9, this.beginCenterGeoY + var10);
               }

               var2.setMapZoomer(var6);
            }

         }
      }
   }
}
