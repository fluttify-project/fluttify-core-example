package com.autonavi.ae.gmap.glanimation;

public abstract class AbstractAdglAnimation {
   public static final int INVALIDE_VALUE = -9999;
   public static final int INTERPOLATOR_LINEAR = 0;
   public static final int INTERPOLATOR_ACCELERATE = 1;
   public static final int INTERPOLATOR_DECELERATE = 2;
   public static final int INTERPOLATOR_ACCELERATE_DECELERATE = 3;
   public static final int INTERPOLATOR_BOUNCE = 4;
   public static final int INTERPOLATOR_OVERSHOOT = 5;
   public static final int INTERPOLATOR_DOUBLE_RAISE = 6;
   public static final int DEFAULT_DURATION = 250;
   protected int duration = 300;
   protected boolean isOver = false;
   protected long startTime = -1L;
   protected long offsetTime = 0L;

   public AbstractAdglAnimation() {
   }

   public boolean isOver() {
      return this.isOver;
   }

   public boolean isValid() {
      return true;
   }

   public abstract void doAnimation(Object var1);
}
