package com.autonavi.ae.gmap.glanimation;

import android.os.SystemClock;
import com.autonavi.ae.gmap.GLMapState;
import com.autonavi.amap.mapcore.IPoint;

public class AdglMapAnimGroup extends AbstractAdglAnimation {
   public static final int CAMERA_MAX_DEGREE = 60;
   public static final int CAMERA_MIN_DEGREE = 0;
   public static final int MAXMAPLEVEL = 20;
   public static final int MINMAPLEVEL = 3;
   boolean hasCheckParams;
   boolean needZoom;
   boolean hasMidZoom;
   AbstractAdglAnimationParam1V zoomStartParam = null;
   AbstractAdglAnimationParam1V zoomEndParam = null;
   int midZoomDuration;
   int startZoomDuration;
   int endZoomDuration;
   public boolean needMove;
   AbstractAdglAnimationParam2V moveParam = null;
   boolean needRotateMap;
   AbstractAdglAnimationParam1V rotateMapParam = null;
   boolean needRotateCamera;
   AbstractAdglAnimationParam1V rotateCameraParam = null;

   public AdglMapAnimGroup(int var1) {
      this.reset();
      this.duration = var1;
   }

   public void setDuration(int var1) {
      this.duration = var1;
   }

   public void reset() {
      this.isOver = false;
      this.hasCheckParams = false;
      this.needZoom = false;
      this.needMove = false;
      this.moveParam = null;
      this.needRotateMap = false;
      this.rotateMapParam = null;
      this.hasMidZoom = false;
      this.duration = 0;
      if (this.rotateMapParam != null) {
         this.rotateMapParam.reset();
      }

      if (this.moveParam != null) {
         this.moveParam.reset();
      }

      if (this.zoomStartParam != null) {
         this.zoomStartParam.reset();
      }

      if (this.zoomEndParam != null) {
         this.zoomEndParam.reset();
      }

      if (this.rotateCameraParam != null) {
         this.rotateCameraParam.reset();
      }

   }

   public boolean isValid() {
      return this.needRotateCamera || this.needRotateMap || this.needMove || this.needZoom;
   }

   public void setToMapAngle(float var1, int var2) {
      var1 %= 360.0F;
      this.needRotateMap = true;
      if (this.rotateMapParam == null) {
         this.rotateMapParam = new AbstractAdglAnimationParam1V();
      }

      this.rotateMapParam.reset();
      this.rotateMapParam.setInterpolatorType(var2, 1.0F);
      this.rotateMapParam.setToValue(var1);
   }

   public void setToMapCenterGeo(int var1, int var2, int var3) {
      if (var1 > 0 && var2 > 0) {
         this.needMove = true;
         if (this.moveParam == null) {
            this.moveParam = new AbstractAdglAnimationParam2V();
         }

         this.moveParam.reset();
         this.moveParam.setInterpolatorType(var3, 1.0F);
         this.moveParam.setToValue((double)var1, (double)var2);
      }

   }

   public void setToMapLevel(float var1, int var2) {
      this.needZoom = true;
      this.midZoomDuration = 0;
      this.hasMidZoom = false;
      if (checkLevel(var1)) {
         this.initZoomStartParam(var1, var2);
      } else {
         this.needZoom = false;
      }

   }

   public void setToMapLevel(float var1, float var2, int var3) {
      this.needZoom = true;
      this.midZoomDuration = 0;
      this.hasMidZoom = false;
      if (var3 > 0 && var3 < this.duration) {
         this.midZoomDuration = var3;
      }

      if (checkLevel(var1) && checkLevel(var2)) {
         this.hasMidZoom = true;
         this.initZoomStartParam(var2, 0);
         this.initZoomEndParam(var2, var1, 0);
      } else if (checkLevel(var1)) {
         this.hasMidZoom = false;
         this.initZoomStartParam(var1, 0);
      } else if (checkLevel(var2)) {
         this.hasMidZoom = false;
         this.initZoomStartParam(var2, 0);
      } else {
         this.needZoom = false;
      }

   }

   public void setToCameraDegree(float var1, int var2) {
      this.needRotateCamera = false;
      if (var1 <= 60.0F && var1 >= 0.0F) {
         this.needRotateCamera = true;
         if (this.rotateCameraParam == null) {
            this.rotateCameraParam = new AbstractAdglAnimationParam1V();
         }

         this.rotateCameraParam.reset();
         this.rotateCameraParam.setInterpolatorType(var2, 1.0F);
         this.rotateCameraParam.setToValue(var1);
      }

   }

   public static boolean checkLevel(float var0) {
      return var0 >= 3.0F && var0 <= 20.0F;
   }

   private void initZoomStartParam(float var1, int var2) {
      if (this.zoomStartParam == null) {
         this.zoomStartParam = new AbstractAdglAnimationParam1V();
      }

      this.zoomStartParam.reset();
      this.zoomStartParam.setInterpolatorType(var2, 1.0F);
      this.zoomStartParam.setToValue(var1);
   }

   private void initZoomEndParam(float var1, float var2, int var3) {
      if (this.zoomEndParam == null) {
         this.zoomEndParam = new AbstractAdglAnimationParam1V();
      }

      this.zoomEndParam.reset();
      this.zoomEndParam.setInterpolatorType(var3, 1.0F);
      this.zoomEndParam.setToValue(var2);
      this.zoomEndParam.setFromValue(var1);
   }

   public void commitAnimation(Object var1) {
      this.isOver = true;
      this.hasCheckParams = false;
      GLMapState var2 = (GLMapState)var1;
      if (var2 != null) {
         float var3;
         float var4;
         if (this.needZoom) {
            if (this.zoomStartParam == null) {
               this.hasCheckParams = true;
               return;
            }

            var3 = var2.getMapZoomer();
            this.zoomStartParam.setFromValue(var3);
            if (this.hasMidZoom) {
               var4 = this.zoomStartParam.getToValue() - var3;
               float var5 = this.zoomEndParam.getFromValue() - this.zoomEndParam.getToValue();
               if ((double)Math.abs(var4) >= 1.0E-6D && (double)Math.abs(var5) >= 1.0E-6D) {
                  this.zoomStartParam.needToCaculate();
                  this.zoomEndParam.needToCaculate();
               } else {
                  this.hasMidZoom = false;
                  this.zoomStartParam.setToValue(this.zoomEndParam.getToValue());
                  this.zoomStartParam.needToCaculate();
                  this.zoomEndParam = null;
               }
            }

            if (!this.hasMidZoom) {
               var4 = this.zoomStartParam.getFromValue() - this.zoomStartParam.getToValue();
               if ((double)Math.abs(var4) < 1.0E-6D) {
                  this.needZoom = false;
               }
            }

            if (this.needZoom) {
               if (this.hasMidZoom) {
                  this.startZoomDuration = this.duration - this.midZoomDuration >> 1;
                  this.endZoomDuration = this.startZoomDuration;
               } else {
                  this.startZoomDuration = this.duration;
               }
            }
         }

         if (this.needMove && this.moveParam != null) {
            IPoint var8 = IPoint.obtain();
            var2.getMapGeoCenter(var8);
            int var6 = var8.x;
            int var7 = var8.y;
            var8.recycle();
            this.moveParam.setFromValue((double)var6, (double)var7);
            this.needMove = this.moveParam.needToCaculate();
         }

         if (this.needRotateMap && this.rotateMapParam != null) {
            var3 = var2.getMapAngle();
            var4 = this.rotateMapParam.getToValue();
            if (var3 > 180.0F && var4 == 0.0F) {
               var4 = 360.0F;
            }

            int var9 = (int)var4 - (int)var3;
            if ((float)var9 > 180.0F) {
               var4 -= 360.0F;
            } else if ((float)var9 < -180.0F) {
               var4 += 360.0F;
            }

            this.rotateMapParam.setFromValue(var3);
            this.rotateMapParam.setToValue(var4);
            this.needRotateMap = this.rotateMapParam.needToCaculate();
         }

         if (this.needRotateCamera && this.rotateCameraParam != null) {
            var3 = var2.getCameraDegree();
            this.rotateCameraParam.setFromValue(var3);
            this.needRotateCamera = this.rotateCameraParam.needToCaculate();
         }

         if (!this.needMove && !this.needZoom && !this.needRotateMap && !this.needRotateCamera) {
            this.isOver = true;
         } else {
            this.isOver = false;
         }

         this.hasCheckParams = true;
         this.startTime = SystemClock.uptimeMillis();
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
            if ((float)this.duration == 0.0F) {
               this.isOver = true;
            } else {
               float var5 = (float)this.offsetTime / (float)this.duration;
               if (var5 > 1.0F) {
                  var5 = 1.0F;
                  this.isOver = true;
               } else if (var5 < 0.0F) {
                  this.isOver = true;
                  return;
               }

               float var6;
               if (this.needZoom) {
                  var6 = var2.getMapZoomer();
                  if (this.hasMidZoom) {
                     float var7 = 0.0F;
                     if (this.offsetTime <= (long)this.startZoomDuration) {
                        var7 = (float)this.offsetTime / (float)this.startZoomDuration;
                        this.zoomStartParam.setNormalizedTime(var7);
                        var6 = this.zoomStartParam.getCurValue();
                     } else if (this.offsetTime <= (long)(this.startZoomDuration + this.midZoomDuration)) {
                        var6 = this.zoomStartParam.getToValue();
                     } else {
                        var7 = (float)(this.offsetTime - (long)this.startZoomDuration - (long)this.midZoomDuration) / (float)this.endZoomDuration;
                        this.zoomEndParam.setNormalizedTime(var7);
                        var6 = this.zoomEndParam.getCurValue();
                     }

                     if (this.isOver) {
                        var6 = this.zoomEndParam.getToValue();
                     }
                  } else {
                     this.zoomStartParam.setNormalizedTime(var5);
                     var6 = this.zoomStartParam.getCurValue();
                  }

                  var2.setMapZoomer(var6);
               }

               if (this.moveParam != null && this.needMove) {
                  this.moveParam.setNormalizedTime(var5);
                  int var14 = (int)this.moveParam.getFromXValue();
                  int var13 = (int)this.moveParam.getFromYValue();
                  int var8 = (int)this.moveParam.getToXValue();
                  int var9 = (int)this.moveParam.getToYValue();
                  float var10 = this.moveParam.getCurMult();
                  int var11 = (int)((float)(var8 - var14) * var10);
                  int var12 = (int)((float)(var9 - var13) * var10);
                  var2.setMapGeoCenter(var14 + var11, var13 + var12);
               }

               if (this.rotateMapParam != null && this.needRotateMap) {
                  this.rotateMapParam.setNormalizedTime(var5);
                  var6 = this.rotateMapParam.getCurValue();
                  var2.setMapAngle((float)((int)var6));
               }

               if (this.rotateCameraParam != null && this.needRotateCamera) {
                  this.rotateCameraParam.setNormalizedTime(var5);
                  var6 = this.rotateCameraParam.getCurValue();
                  var2.setCameraDegree((float)((int)var6));
               }

            }
         }
      }
   }

   public boolean typeEqueal(AdglMapAnimGroup var1) {
      return this.needRotateCamera == var1.needRotateCamera && this.needRotateMap == var1.needRotateMap && this.needZoom == var1.needZoom && this.needMove == var1.needMove;
   }
}
