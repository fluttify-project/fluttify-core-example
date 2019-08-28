package com.autonavi.amap.mapcore.animation;

import android.view.animation.Interpolator;
import com.amap.api.maps.model.animation.Animation;
import java.util.ArrayList;
import java.util.List;

public class GLAnimationSet extends GLAnimation {
   private static final int PROPERTY_FILL_AFTER_MASK = 1;
   private static final int PROPERTY_FILL_BEFORE_MASK = 2;
   private static final int PROPERTY_REPEAT_MODE_MASK = 4;
   private static final int PROPERTY_START_OFFSET_MASK = 8;
   private static final int PROPERTY_SHARE_INTERPOLATOR_MASK = 16;
   private static final int PROPERTY_DURATION_MASK = 32;
   private static final int PROPERTY_MORPH_MATRIX_MASK = 64;
   private static final int PROPERTY_CHANGE_BOUNDS_MASK = 128;
   private int mFlags = 0;
   private boolean mDirty;
   private boolean mHasAlpha;
   private ArrayList<GLAnimation> mAnimations = new ArrayList();
   private GLTransformation mTempTransformation = new GLTransformation();
   private long mLastEnd;

   public GLAnimationSet(boolean var1) {
      this.setFlag(16, var1);
      this.init();
   }

   public void initialize() {
      super.initialize();
      boolean var1 = (this.mFlags & 32) == 32;
      boolean var2 = (this.mFlags & 1) == 1;
      boolean var3 = (this.mFlags & 2) == 2;
      boolean var4 = (this.mFlags & 4) == 4;
      boolean var5 = (this.mFlags & 16) == 16;
      boolean var6 = (this.mFlags & 8) == 8;
      if (var5) {
         this.ensureInterpolator();
      }

      ArrayList var7 = this.mAnimations;
      int var8 = var7.size();
      long var9 = this.mDuration;
      boolean var11 = this.mFillAfter;
      boolean var12 = this.mFillBefore;
      int var13 = this.mRepeatMode;
      Interpolator var14 = this.mInterpolator;
      long var15 = this.mStartOffset;

      for(int var17 = 0; var17 < var8; ++var17) {
         GLAnimation var18 = (GLAnimation)var7.get(var17);
         if (var1) {
            var18.setDuration(var9);
         }

         if (var2) {
            var18.setFillAfter(var11);
         }

         if (var3) {
            var18.setFillBefore(var12);
         }

         if (var4) {
            var18.setRepeatMode(var13);
         }

         if (var5) {
            var18.setInterpolator(var14);
         }

         if (var6) {
            long var19 = var18.getStartOffset();
            var18.setStartOffset(var19 + var15);
         }

         var18.initialize();
      }

   }

   public GLAnimationSet clone() throws CloneNotSupportedException {
      GLAnimationSet var1 = (GLAnimationSet)super.clone();
      var1.mTempTransformation = new GLTransformation();
      var1.mAnimations = new ArrayList();
      int var2 = this.mAnimations.size();
      ArrayList var3 = this.mAnimations;

      for(int var4 = 0; var4 < var2; ++var4) {
         var1.mAnimations.add(((GLAnimation)var3.get(var4)).clone());
      }

      return var1;
   }

   private void setFlag(int var1, boolean var2) {
      if (var2) {
         this.mFlags |= var1;
      } else {
         this.mFlags &= ~var1;
      }

   }

   private void init() {
      this.mStartTime = 0L;
   }

   public void setFillAfter(boolean var1) {
      this.mFlags |= 1;
      super.setFillAfter(var1);
   }

   public void setFillBefore(boolean var1) {
      this.mFlags |= 2;
      super.setFillBefore(var1);
   }

   public void setRepeatMode(int var1) {
      this.mFlags |= 4;
      super.setRepeatMode(var1);
   }

   public void setStartOffset(long var1) {
      this.mFlags |= 8;
      super.setStartOffset(var1);
   }

   public boolean hasAlpha() {
      if (this.mDirty) {
         this.mDirty = this.mHasAlpha = false;
         int var1 = this.mAnimations.size();
         ArrayList var2 = this.mAnimations;

         for(int var3 = 0; var3 < var1; ++var3) {
            if (((GLAnimation)var2.get(var3)).hasAlpha()) {
               this.mHasAlpha = true;
               break;
            }
         }
      }

      return this.mHasAlpha;
   }

   public void setDuration(long var1) {
      this.mFlags |= 32;
      super.setDuration(var1);
      this.mLastEnd = this.mStartOffset + this.mDuration;
   }

   public void addAnimation(Animation var1) {
      this.mAnimations.add(var1.glAnimation);
      boolean var2 = (this.mFlags & 64) == 0;
      if (var2 && var1.glAnimation.willChangeTransformationMatrix()) {
         this.mFlags |= 64;
      }

      boolean var3 = (this.mFlags & 128) == 0;
      if (var3 && var1.glAnimation.willChangeBounds()) {
         this.mFlags |= 128;
      }

      if ((this.mFlags & 32) == 32) {
         this.mLastEnd = this.mStartOffset + this.mDuration;
      } else if (this.mAnimations.size() == 1) {
         this.mDuration = var1.glAnimation.getStartOffset() + var1.glAnimation.getDuration();
         this.mLastEnd = this.mStartOffset + this.mDuration;
      } else {
         this.mLastEnd = Math.max(this.mLastEnd, var1.glAnimation.getStartOffset() + var1.glAnimation.getDuration());
         this.mDuration = this.mLastEnd - this.mStartOffset;
      }

      this.mDirty = true;
   }

   public void setStartTime(long var1) {
      super.setStartTime(var1);
      int var3 = this.mAnimations.size();
      ArrayList var4 = this.mAnimations;

      for(int var5 = 0; var5 < var3; ++var5) {
         GLAnimation var6 = (GLAnimation)var4.get(var5);
         var6.setStartTime(var1);
      }

   }

   public long getStartTime() {
      long var1 = Long.MAX_VALUE;
      int var3 = this.mAnimations.size();
      ArrayList var4 = this.mAnimations;

      for(int var5 = 0; var5 < var3; ++var5) {
         GLAnimation var6 = (GLAnimation)var4.get(var5);
         var1 = Math.min(var1, var6.getStartTime());
      }

      return var1;
   }

   public void restrictDuration(long var1) {
      super.restrictDuration(var1);
      ArrayList var3 = this.mAnimations;
      int var4 = var3.size();

      for(int var5 = 0; var5 < var4; ++var5) {
         ((GLAnimation)var3.get(var5)).restrictDuration(var1);
      }

   }

   public long getDuration() {
      ArrayList var1 = this.mAnimations;
      int var2 = var1.size();
      long var3 = 0L;
      boolean var5 = (this.mFlags & 32) == 32;
      if (var5) {
         var3 = this.mDuration;
      } else {
         for(int var6 = 0; var6 < var2; ++var6) {
            var3 = Math.max(var3, ((GLAnimation)var1.get(var6)).getDuration());
         }
      }

      return var3;
   }

   public long computeDurationHint() {
      long var1 = 0L;
      int var3 = this.mAnimations.size();
      ArrayList var4 = this.mAnimations;

      for(int var5 = var3 - 1; var5 >= 0; --var5) {
         long var6 = ((GLAnimation)var4.get(var5)).computeDurationHint();
         if (var6 > var1) {
            var1 = var6;
         }
      }

      return var1;
   }

   public boolean getTransformation(long var1, GLTransformation var3) {
      if (!this.mInitialized) {
         this.initialize();
      }

      int var4 = this.mAnimations.size();
      ArrayList var5 = this.mAnimations;
      GLTransformation var6 = this.mTempTransformation;
      boolean var7 = false;
      boolean var8 = false;
      boolean var9 = true;
      var3.clear();

      for(int var10 = var4 - 1; var10 >= 0; --var10) {
         GLAnimation var11 = (GLAnimation)var5.get(var10);
         var6.clear();
         var7 = var11.getTransformation(var1, var3, this.getScaleFactor()) || var7;
         var8 = var8 || var11.hasStarted();
         var9 = var11.hasEnded() && var9;
      }

      try {
         if (var8 && !this.mStarted) {
            if (this.mListener != null) {
               this.mListener.onAnimationStart();
            }

            this.mStarted = true;
         }

         if (var9 != this.mEnded) {
            if (this.mListener != null) {
               this.mListener.onAnimationEnd();
            }

            this.mEnded = var9;
         }
      } catch (Throwable var12) {
         var12.printStackTrace();
      }

      return var7;
   }

   public void scaleCurrentDuration(float var1) {
      ArrayList var2 = this.mAnimations;
      int var3 = var2.size();

      for(int var4 = 0; var4 < var3; ++var4) {
         ((GLAnimation)var2.get(var4)).scaleCurrentDuration(var1);
      }

   }

   public void reset() {
      super.reset();
   }

   public List<GLAnimation> getAnimations() {
      return this.mAnimations;
   }

   public boolean willChangeTransformationMatrix() {
      return (this.mFlags & 64) == 64;
   }

   public boolean willChangeBounds() {
      return (this.mFlags & 128) == 128;
   }

   public void cleanAnimation() {
      this.mAnimations.clear();
   }
}
