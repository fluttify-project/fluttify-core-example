package com.amap.api.maps.model.animation;

import android.view.animation.Interpolator;
import com.autonavi.amap.mapcore.animation.GLAnimation;

public abstract class Animation {
   public static final int FILL_MODE_FORWARDS = 0;
   public static final int FILL_MODE_BACKWARDS = 1;
   public static final int INFINITE = -1;
   public static final int RESTART = 1;
   public static final int REVERSE = 2;
   private int a = 0;
   public GLAnimation glAnimation = null;

   public Animation() {
      this.glAnimation = new GLAnimation();
   }

   public void setAnimationListener(Animation$AnimationListener var1) {
      this.glAnimation.setAnimationListener(var1);
   }

   public abstract void setDuration(long var1);

   public abstract void setInterpolator(Interpolator var1);

   public void setFillMode(int var1) {
      this.a = var1;
      if (this.a == 0) {
         this.b(true);
         this.c(false);
         this.a(false);
      } else {
         this.b(false);
         this.a(true);
         this.c(true);
      }

   }

   public int getFillMode() {
      return this.a;
   }

   private void a(boolean var1) {
      if (this.glAnimation != null) {
         this.glAnimation.setFillEnabled(var1);
      }

   }

   private void b(boolean var1) {
      if (this.glAnimation != null) {
         this.glAnimation.setFillAfter(var1);
      }

   }

   private void c(boolean var1) {
      if (this.glAnimation != null) {
         this.glAnimation.setFillBefore(var1);
      }

   }

   public void setRepeatCount(int var1) {
      if (this.glAnimation != null) {
         this.glAnimation.setRepeatCount(var1);
      }

   }

   public void setRepeatMode(int var1) {
      if (this.glAnimation != null) {
         this.glAnimation.setRepeatMode(var1);
      }

   }

   public int getRepeatMode() {
      return this.glAnimation != null ? this.glAnimation.getRepeatMode() : 1;
   }

   public int getRepeatCount() {
      return this.glAnimation != null ? this.glAnimation.getRepeatCount() : 0;
   }
}
