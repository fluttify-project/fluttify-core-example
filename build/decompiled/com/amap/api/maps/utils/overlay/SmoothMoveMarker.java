package com.amap.api.maps.utils.overlay;

import com.amap.api.maps.AMap;
import com.amap.api.maps.AMapUtils;
import com.amap.api.maps.model.BitmapDescriptor;
import com.amap.api.maps.model.CameraPosition;
import com.amap.api.maps.model.LatLng;
import com.amap.api.maps.model.Marker;
import com.amap.api.maps.model.MarkerOptions;
import com.amap.api.maps.model.animation.Animation;
import com.autonavi.amap.mapcore.IPoint;
import com.autonavi.amap.mapcore.MapProjection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/** @deprecated */
public class SmoothMoveMarker {
   public static final float MIN_OFFSET_DISTANCE = 5.0F;
   private AMap mAMap;
   private long duration = 10000L;
   private long mStepDuration = 20L;
   private LinkedList<LatLng> points = new LinkedList();
   private LinkedList<Double> eachDistance = new LinkedList();
   private double totalDistance = 0.0D;
   private double remainDistance = 0.0D;
   private ExecutorService mThreadPools;
   private Object mLock = new Object();
   private Marker marker = null;
   private BitmapDescriptor descriptor;
   private int index = 0;
   private boolean useDefaultDescriptor = false;
   AtomicBoolean exitFlag = new AtomicBoolean(false);
   private SmoothMoveMarker$MoveListener moveListener;
   private SmoothMoveMarker$a moveStatus;
   private long pauseMillis;
   private long mAnimationBeginTime;

   public SmoothMoveMarker(AMap var1) {
      this.moveStatus = SmoothMoveMarker$a.a;
      this.mAnimationBeginTime = System.currentTimeMillis();
      this.mAMap = var1;
      this.mThreadPools = new ThreadPoolExecutor(1, 2, 5L, TimeUnit.SECONDS, new SynchronousQueue(), new SmoothMoveMarker$b((SmoothMoveMarker$1)null));
   }

   public void setPoints(List<LatLng> var1) {
      Object var2 = this.mLock;
      synchronized(this.mLock) {
         try {
            if (var1 == null || var1.size() < 2) {
               return;
            }

            this.stopMove();
            this.points.clear();
            Iterator var3 = var1.iterator();

            while(var3.hasNext()) {
               LatLng var4 = (LatLng)var3.next();
               if (var4 != null) {
                  this.points.add(var4);
               }
            }

            this.eachDistance.clear();
            this.totalDistance = 0.0D;

            for(int var9 = 0; var9 < this.points.size() - 1; ++var9) {
               double var11 = (double)AMapUtils.calculateLineDistance((LatLng)this.points.get(var9), (LatLng)this.points.get(var9 + 1));
               this.eachDistance.add(var11);
               this.totalDistance += var11;
            }

            this.remainDistance = this.totalDistance;
            LatLng var10 = (LatLng)this.points.get(0);
            if (this.marker != null) {
               this.marker.setPosition(var10);
               this.checkMarkerIcon();
            } else {
               if (this.descriptor == null) {
                  this.useDefaultDescriptor = true;
               }

               this.marker = this.mAMap.addMarker((new MarkerOptions()).belowMaskLayer(true).position(var10).icon(this.descriptor).title("").anchor(0.5F, 0.5F));
            }

            this.reset();
         } catch (Throwable var7) {
            var7.printStackTrace();
         }

      }
   }

   private void reset() {
      try {
         if (this.moveStatus == SmoothMoveMarker$a.c || this.moveStatus == SmoothMoveMarker$a.d) {
            this.exitFlag.set(true);
            this.mThreadPools.awaitTermination(this.mStepDuration + 20L, TimeUnit.MILLISECONDS);
            if (this.marker != null) {
               this.marker.setAnimation((Animation)null);
            }

            this.moveStatus = SmoothMoveMarker$a.a;
         }
      } catch (InterruptedException var2) {
         var2.printStackTrace();
      }

   }

   private void checkMarkerIcon() {
      if (this.useDefaultDescriptor) {
         if (this.descriptor == null) {
            this.useDefaultDescriptor = true;
         } else {
            this.marker.setIcon(this.descriptor);
            this.useDefaultDescriptor = false;
         }
      }

   }

   public void setTotalDuration(int var1) {
      this.duration = (long)(var1 * 1000);
   }

   public void startSmoothMove() {
      if (this.moveStatus == SmoothMoveMarker$a.d) {
         this.moveStatus = SmoothMoveMarker$a.c;
         long var1 = System.currentTimeMillis() - this.pauseMillis;
         this.mAnimationBeginTime += var1;
      } else {
         if (this.moveStatus == SmoothMoveMarker$a.a || this.moveStatus == SmoothMoveMarker$a.e) {
            if (this.points.size() < 1) {
               return;
            }

            this.index = 0;

            try {
               this.mThreadPools.execute(new SmoothMoveMarker$c(this, (SmoothMoveMarker$1)null));
            } catch (Throwable var3) {
               var3.printStackTrace();
            }
         }

      }
   }

   private IPoint getCurPosition(long var1) {
      if (var1 > this.duration) {
         this.exitFlag.set(true);
         IPoint var17 = new IPoint();
         this.index = this.points.size() - 1;
         LatLng var4 = (LatLng)this.points.get(this.index);
         --this.index;
         this.index = Math.max(this.index, 0);
         this.remainDistance = 0.0D;
         MapProjection.lonlat2Geo(var4.longitude, var4.latitude, var17);
         if (this.moveListener != null) {
            this.moveListener.move(this.remainDistance);
         }

         return var17;
      } else {
         double var3 = (double)var1 * this.totalDistance / (double)this.duration;
         this.remainDistance = this.totalDistance - var3;
         int var5 = 0;
         double var6 = 1.0D;

         for(int var8 = 0; var8 < this.eachDistance.size(); ++var8) {
            double var9 = ((Double)this.eachDistance.get(var8)).doubleValue();
            if (var3 <= var9) {
               if (var9 > 0.0D) {
                  var6 = var3 / var9;
               }

               var5 = var8;
               break;
            }

            var3 -= var9;
         }

         if (var5 != this.index && this.moveListener != null) {
            this.moveListener.move(this.remainDistance);
         }

         this.index = var5;
         LatLng var18 = (LatLng)this.points.get(var5);
         LatLng var19 = (LatLng)this.points.get(var5 + 1);
         IPoint var10 = new IPoint();
         MapProjection.lonlat2Geo(var18.longitude, var18.latitude, var10);
         IPoint var11 = new IPoint();
         MapProjection.lonlat2Geo(var19.longitude, var19.latitude, var11);
         int var12 = var11.x - var10.x;
         int var13 = var11.y - var10.y;
         float var14 = AMapUtils.calculateLineDistance(var18, var19);
         if (var14 > 5.0F) {
            float var15 = this.getRotate(var10, var11);
            if (this.mAMap != null) {
               CameraPosition var16 = this.mAMap.getCameraPosition();
               if (var16 != null) {
                  this.marker.setRotateAngle(360.0F - var15 + var16.bearing);
               }
            }
         }

         return new IPoint((int)((double)var10.x + (double)var12 * var6), (int)((double)var10.y + (double)var13 * var6));
      }
   }

   private float getRotate(IPoint var1, IPoint var2) {
      if (var1 != null && var2 != null) {
         double var3 = (double)var2.y;
         double var5 = (double)var1.y;
         double var7 = (double)var1.x;
         double var9 = (double)var2.x;
         float var11 = (float)(Math.atan2(var9 - var7, var5 - var3) / 3.141592653589793D * 180.0D);
         return var11;
      } else {
         return 0.0F;
      }
   }

   public void stopMove() {
      if (this.moveStatus == SmoothMoveMarker$a.c) {
         this.moveStatus = SmoothMoveMarker$a.d;
         this.pauseMillis = System.currentTimeMillis();
      }

   }

   public Marker getMarker() {
      return this.marker;
   }

   public LatLng getPosition() {
      return this.marker == null ? null : this.marker.getPosition();
   }

   public int getIndex() {
      return this.index;
   }

   public void resetIndex() {
      this.index = 0;
   }

   public void destroy() {
      try {
         this.reset();
         this.mThreadPools.shutdownNow();
         if (this.descriptor != null) {
            this.descriptor.recycle();
         }

         if (this.marker != null) {
            this.marker.destroy();
            this.marker = null;
         }

         Object var1 = this.mLock;
         synchronized(this.mLock) {
            this.points.clear();
            this.eachDistance.clear();
         }
      } catch (Throwable var4) {
         var4.printStackTrace();
      }

   }

   public void removeMarker() {
      if (this.marker != null) {
         this.marker.remove();
         this.marker = null;
      }

      this.points.clear();
      this.eachDistance.clear();
   }

   public void setPosition(LatLng var1) {
      if (this.marker != null) {
         this.marker.setPosition(var1);
         this.checkMarkerIcon();
      } else {
         if (this.descriptor == null) {
            this.useDefaultDescriptor = true;
         }

         this.marker = this.mAMap.addMarker((new MarkerOptions()).belowMaskLayer(true).position(var1).icon(this.descriptor).title("").anchor(0.5F, 0.5F));
      }

   }

   public void setDescriptor(BitmapDescriptor var1) {
      if (this.descriptor != null) {
         this.descriptor.recycle();
      }

      this.descriptor = var1;
      if (this.marker != null) {
         this.marker.setIcon(var1);
      }

   }

   public void setRotate(float var1) {
      if (this.marker != null && this.mAMap != null && this.mAMap != null) {
         CameraPosition var2 = this.mAMap.getCameraPosition();
         if (var2 != null) {
            this.marker.setRotateAngle(360.0F - var1 + var2.bearing);
         }
      }

   }

   public void setVisible(boolean var1) {
      if (this.marker != null) {
         this.marker.setVisible(var1);
      }

   }

   public void setMoveListener(SmoothMoveMarker$MoveListener var1) {
      this.moveListener = var1;
   }
}
