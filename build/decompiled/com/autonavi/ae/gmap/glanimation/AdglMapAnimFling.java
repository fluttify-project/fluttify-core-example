package com.autonavi.ae.gmap.glanimation;

import android.os.SystemClock;
import com.autonavi.ae.gmap.GLMapState;
import com.autonavi.amap.mapcore.IPoint;

public class AdglMapAnimFling extends AbstractAdglAnimation {
   private float velocityX;
   private float velocityY;
   private IPoint fromCenter;
   private AbstractAdglAnimationParam2V moveParam;
   private boolean hasCheckParams;
   private boolean needMove;
   private int screenCenterX;
   private int screenCenterY;
   private int lastMoveX;
   private int lastMoveY;

   public AdglMapAnimFling(int var1, int var2, int var3) {
      this.screenCenterX = var2;
      this.screenCenterY = var3;
      this.lastMoveX = var2;
      this.lastMoveY = var3;
      this.moveParam = null;
      this.reset();
      this.duration = var1;
   }

   public void reset() {
      if (this.moveParam != null) {
         this.moveParam.reset();
      }

      this.velocityX = 0.0F;
      this.velocityY = 0.0F;
      this.needMove = false;
      this.hasCheckParams = false;
   }

   public void setPositionAndVelocity(float var1, float var2) {
      this.moveParam = null;
      this.velocityX = var1;
      this.velocityY = var2;
      this.moveParam = new AbstractAdglAnimationParam2V();
      this.moveParam.setInterpolatorType(2, 1.2F);
      this.needMove = false;
      this.hasCheckParams = false;
   }

   public void commitAnimationold(Object var1) {
      GLMapState var2 = (GLMapState)var1;
      if (var2 != null) {
         this.hasCheckParams = false;
         this.isOver = true;
         float var3 = (float)Math.sqrt((double)(this.velocityX * this.velocityX + this.velocityY * this.velocityY));
         float var4 = var3 / 1000.0F;
         if (var4 >= 0.1F) {
            float var5 = 0.02F * var4;
            if (this.fromCenter == null) {
               this.fromCenter = IPoint.obtain();
            }

            var2.getMapGeoCenter(this.fromCenter);
            this.isOver = false;
            this.moveParam.setFromValue((double)this.screenCenterX, (double)this.screenCenterY);
            this.moveParam.setToValue((double)((float)this.screenCenterX - this.velocityX * var5), (double)((float)this.screenCenterY - this.velocityY * var5));
            this.needMove = this.moveParam.needToCaculate();
         }

         if (this.needMove) {
            ;
         }

         this.hasCheckParams = true;
         this.startTime = SystemClock.uptimeMillis();
      }
   }

   public void commitAnimation(Object var1) {
      GLMapState var2 = (GLMapState)var1;
      if (var2 != null) {
         this.hasCheckParams = false;
         this.isOver = true;
         int var3 = (int)(this.velocityX * (float)this.duration / 2000.0F);
         int var4 = (int)(this.velocityY * (float)this.duration / 2000.0F);
         if (Math.abs(var3) != 0 && Math.abs(var4) != 0) {
            if (this.fromCenter == null) {
               this.fromCenter = IPoint.obtain();
            }

            var2.getMapGeoCenter(this.fromCenter);
            this.isOver = false;
            this.moveParam.setFromValue((double)this.screenCenterX, (double)this.screenCenterY);
            this.moveParam.setToValue((double)(this.screenCenterX - var3), (double)(this.screenCenterY - var4));
            this.needMove = this.moveParam.needToCaculate();
         }

         if (this.needMove) {
            ;
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
            float var5 = (float)this.offsetTime / (float)this.duration;
            if (var5 > 1.0F) {
               var5 = 1.0F;
               this.isOver = true;
            }

            if (var5 >= 0.0F && var5 <= 1.0F && this.needMove) {
               this.moveParam.setNormalizedTime(var5);
               int var6 = (int)this.moveParam.getCurXValue();
               int var7 = (int)this.moveParam.getCurYValue();
               IPoint var8 = IPoint.obtain();
               var2.screenToP20Point(this.screenCenterX + var6 - this.lastMoveX, this.screenCenterY + var7 - this.lastMoveY, var8);
               var2.setMapGeoCenter(var8.x, var8.y);
               this.lastMoveX = var6;
               this.lastMoveY = var7;
               var8.recycle();
            }

         }
      }
   }
}
