package com.autonavi.amap.mapcore.animation;

import android.content.Context;
import android.graphics.RectF;
import android.os.Handler;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.view.animation.Transformation;
import com.amap.api.maps.model.animation.Animation$AnimationListener;

public class GLAnimation implements Cloneable {
   public static final int INFINITE = -1;
   public static final int RESTART = 1;
   public static final int REVERSE = 2;
   public static final int START_ON_FIRST_FRAME = -1;
   public static final int ABSOLUTE = 0;
   public static final int RELATIVE_TO_SELF = 1;
   public static final int RELATIVE_TO_PARENT = 2;
   public static final int ZORDER_NORMAL = 0;
   public static final int ZORDER_TOP = 1;
   public static final int ZORDER_BOTTOM = -1;
   boolean mEnded = false;
   boolean mStarted = false;
   boolean mCycleFlip = false;
   boolean mInitialized = false;
   boolean mFillBefore = true;
   boolean mFillAfter = false;
   boolean mFillEnabled = false;
   long mStartTime = -1L;
   long mStartOffset;
   long mDuration = 500L;
   int mRepeatCount = 0;
   int mRepeated = 0;
   int mRepeatMode = 1;
   Interpolator mInterpolator;
   Animation$AnimationListener mListener;
   private int mZAdjustment;
   private int mBackgroundColor;
   private float mScaleFactor = 1.0F;
   private boolean mDetachWallpaper = false;
   private boolean mMore = true;
   private boolean mOneMoreTime = true;
   RectF mPreviousRegion = new RectF();
   RectF mRegion = new RectF();
   GLTransformation mPreviousTransformation = new GLTransformation();
   private Handler mListenerHandler;
   private Runnable mOnStart;
   private Runnable mOnEnd;

   public GLAnimation() {
      try {
         this.ensureInterpolator();
      } catch (Throwable var2) {
         var2.printStackTrace();
      }

   }

   public GLAnimation clone() throws CloneNotSupportedException {
      GLAnimation var1 = (GLAnimation)super.clone();
      var1.mPreviousRegion = new RectF();
      var1.mRegion = new RectF();
      var1.mPreviousTransformation = new GLTransformation();
      return var1;
   }

   public void reset() {
      this.mPreviousRegion.setEmpty();
      this.mPreviousTransformation.clear();
      this.mInitialized = false;
      this.mCycleFlip = false;
      this.mRepeated = 0;
      this.mMore = true;
      this.mOneMoreTime = true;
      this.mListenerHandler = null;
   }

   public void cancel() {
      if (this.mStarted && !this.mEnded) {
         this.fireAnimationEnd();
         this.mEnded = true;
      }

      this.mStartTime = Long.MIN_VALUE;
      this.mMore = this.mOneMoreTime = false;
   }

   public void detach() {
      if (this.mStarted && !this.mEnded) {
         this.mEnded = true;
         this.fireAnimationEnd();
      }

   }

   public boolean isInitialized() {
      return this.mInitialized;
   }

   public void initialize() {
      this.reset();
      this.mInitialized = true;
   }

   public void setListenerHandler(Handler var1) {
      if (this.mListenerHandler == null) {
         this.mOnStart = new GLAnimation$1(this);
         this.mOnEnd = new GLAnimation$2(this);
      }

      this.mListenerHandler = var1;
   }

   public void setInterpolator(Context var1, int var2) {
      this.setInterpolator(AnimationUtils.loadInterpolator(var1, var2));
   }

   public void setInterpolator(Interpolator var1) {
      this.mInterpolator = var1;
   }

   public void setStartOffset(long var1) {
      this.mStartOffset = var1;
   }

   public void setDuration(long var1) {
      if (var1 < 0L) {
         var1 = 0L;
      }

      this.mDuration = var1;
   }

   public void restrictDuration(long var1) {
      if (this.mStartOffset > var1) {
         this.mStartOffset = var1;
         this.mDuration = 0L;
         this.mRepeatCount = 0;
      } else {
         long var3 = this.mDuration + this.mStartOffset;
         if (var3 > var1) {
            this.mDuration = var1 - this.mStartOffset;
            var3 = var1;
         }

         if (this.mDuration <= 0L) {
            this.mDuration = 0L;
            this.mRepeatCount = 0;
         } else {
            if (this.mRepeatCount < 0 || (long)this.mRepeatCount > var1 || var3 * (long)this.mRepeatCount > var1) {
               this.mRepeatCount = (int)(var1 / var3) - 1;
               if (this.mRepeatCount < 0) {
                  this.mRepeatCount = 0;
               }
            }

         }
      }
   }

   public void scaleCurrentDuration(float var1) {
      this.mDuration = (long)((float)this.mDuration * var1);
      this.mStartOffset = (long)((float)this.mStartOffset * var1);
   }

   public void setStartTime(long var1) {
      this.mStartTime = var1;
      this.mStarted = this.mEnded = false;
      this.mCycleFlip = false;
      this.mRepeated = 0;
      this.mMore = true;
   }

   public void start() {
      this.setStartTime(-1L);
   }

   public void startNow() {
      this.setStartTime(AnimationUtils.currentAnimationTimeMillis());
   }

   public void setRepeatMode(int var1) {
      this.mRepeatMode = var1;
   }

   public void setRepeatCount(int var1) {
      if (var1 < 0) {
         var1 = -1;
      }

      this.mRepeatCount = var1;
   }

   public boolean isFillEnabled() {
      return this.mFillEnabled;
   }

   public void setFillEnabled(boolean var1) {
      this.mFillEnabled = var1;
   }

   public void setFillBefore(boolean var1) {
      this.mFillBefore = var1;
   }

   public void setFillAfter(boolean var1) {
      this.mFillAfter = var1;
   }

   public void setZAdjustment(int var1) {
      this.mZAdjustment = var1;
   }

   public void setBackgroundColor(int var1) {
      this.mBackgroundColor = var1;
   }

   protected float getScaleFactor() {
      return this.mScaleFactor;
   }

   public void setDetachWallpaper(boolean var1) {
      this.mDetachWallpaper = var1;
   }

   public Interpolator getInterpolator() {
      return this.mInterpolator;
   }

   public long getStartTime() {
      return this.mStartTime;
   }

   public long getDuration() {
      return this.mDuration;
   }

   public long getStartOffset() {
      return this.mStartOffset;
   }

   public int getRepeatMode() {
      return this.mRepeatMode;
   }

   public int getRepeatCount() {
      return this.mRepeatCount;
   }

   public boolean getFillBefore() {
      return this.mFillBefore;
   }

   public boolean getFillAfter() {
      return this.mFillAfter;
   }

   public int getZAdjustment() {
      return this.mZAdjustment;
   }

   public int getBackgroundColor() {
      return this.mBackgroundColor;
   }

   public boolean getDetachWallpaper() {
      return this.mDetachWallpaper;
   }

   public boolean willChangeTransformationMatrix() {
      return true;
   }

   public boolean willChangeBounds() {
      return true;
   }

   public void setAnimationListener(Animation$AnimationListener var1) {
      this.mListener = var1;
   }

   protected void ensureInterpolator() {
      if (this.mInterpolator == null) {
         this.mInterpolator = new AccelerateDecelerateInterpolator();
      }

   }

   public long computeDurationHint() {
      return (this.getStartOffset() + this.getDuration()) * (long)(this.getRepeatCount() + 1);
   }

   public boolean getTransformation(long var1, GLTransformation var3) {
      if (this.mStartTime == -1L) {
         this.mStartTime = var1;
      }

      long var4 = this.getStartOffset();
      long var6 = this.mDuration;
      float var8;
      if (var6 != 0L) {
         var8 = (float)(var1 - (this.mStartTime + var4)) / (float)var6;
      } else {
         var8 = var1 < this.mStartTime ? 0.0F : 1.0F;
      }

      boolean var9 = var8 >= 1.0F;
      this.mMore = !var9;
      if (!this.mFillEnabled) {
         var8 = Math.max(Math.min(var8, 1.0F), 0.0F);
      }

      boolean var10 = (var8 >= 0.0F || this.mFillBefore) && (var8 <= 1.0F || this.mFillAfter);
      if (var10) {
         if (!this.mStarted) {
            try {
               this.fireAnimationStart();
            } catch (Throwable var12) {
               var12.printStackTrace();
            }

            this.mStarted = true;
         }

         if (this.mFillEnabled) {
            var8 = Math.max(Math.min(var8, 1.0F), 0.0F);
         }

         if (this.mCycleFlip) {
            var8 = 1.0F - var8;
         }

         float var11 = this.mInterpolator.getInterpolation(var8);
         this.applyTransformation(var11, var3);
      }

      if (var9) {
         if (this.mRepeatCount == this.mRepeated) {
            if (!this.mEnded) {
               this.mEnded = true;
               this.fireAnimationEnd();
            }
         } else {
            if (this.mRepeatCount > 0) {
               ++this.mRepeated;
            }

            if (this.mRepeatMode == 2) {
               this.mCycleFlip = !this.mCycleFlip;
            }

            this.mStartTime = -1L;
            this.mMore = true;
            this.fireAnimationRepeat();
         }
      }

      if (!this.mMore && this.mOneMoreTime) {
         this.mOneMoreTime = false;
         return true;
      } else {
         return this.mMore;
      }
   }

   private void fireAnimationStart() {
      if (this.mListener != null) {
         if (this.mListenerHandler == null) {
            this.mListener.onAnimationStart();
         } else {
            this.mListenerHandler.postAtFrontOfQueue(this.mOnStart);
         }
      }

   }

   private void fireAnimationRepeat() {
   }

   private void fireAnimationEnd() {
      if (this.mListener != null) {
         if (this.mListenerHandler == null) {
            this.mListener.onAnimationEnd();
         } else {
            this.mListenerHandler.postAtFrontOfQueue(this.mOnEnd);
         }
      }

   }

   public boolean getTransformation(long var1, GLTransformation var3, float var4) {
      this.mScaleFactor = var4;
      return this.getTransformation(var1, var3);
   }

   protected boolean hasStarted() {
      return this.mStarted;
   }

   public boolean hasEnded() {
      return this.mEnded;
   }

   protected void applyTransformation(float var1, GLTransformation var2) {
   }

   protected float resolveSize(int var1, float var2, int var3, int var4) {
      switch(var1) {
      case 0:
         return var2;
      case 1:
         return (float)var3 * var2;
      case 2:
         return (float)var4 * var2;
      default:
         return var2;
      }
   }

   public void getInvalidateRegion(int var1, int var2, int var3, int var4, RectF var5, Transformation var6) {
      RectF var7 = this.mRegion;
      RectF var8 = this.mPreviousRegion;
      var5.set((float)var1, (float)var2, (float)var3, (float)var4);
      var6.getMatrix().mapRect(var5);
      var5.inset(-1.0F, -1.0F);
      var7.set(var5);
      var5.union(var8);
      var8.set(var7);
   }

   public void initializeInvalidateRegion(int var1, int var2, int var3, int var4) {
      RectF var5 = this.mPreviousRegion;
      var5.set((float)var1, (float)var2, (float)var3, (float)var4);
      var5.inset(-1.0F, -1.0F);
      if (this.mFillBefore) {
         GLTransformation var6 = this.mPreviousTransformation;
         this.applyTransformation(this.mInterpolator.getInterpolation(0.0F), var6);
      }

   }

   public boolean hasAlpha() {
      return false;
   }
}
