package com.amap.api.maps;

import com.amap.api.maps.model.animation.Animation;
import com.amap.api.maps.model.animation.Animation$AnimationListener;
import com.autonavi.amap.mapcore.interfaces.IInfoWindowManager;

public class InfoWindowAnimationManager {
   IInfoWindowManager a = null;

   public InfoWindowAnimationManager(IInfoWindowManager var1) {
      this.a = var1;
   }

   public void setInfoWindowAnimation(Animation var1, Animation$AnimationListener var2) {
      this.a.setInfoWindowAnimation(var1, var2);
   }

   public void setInfoWindowAppearAnimation(Animation var1) {
      this.a.setInfoWindowAppearAnimation(var1);
   }

   public void setInfoWindowBackColor(int var1) {
      this.a.setInfoWindowBackColor(var1);
   }

   public void setInfoWindowBackEnable(boolean var1) {
      this.a.setInfoWindowBackEnable(var1);
   }

   public void setInfoWindowBackScale(float var1, float var2) {
      this.a.setInfoWindowBackScale(var1, var2);
   }

   public void setInfoWindowDisappearAnimation(Animation var1) {
      this.a.setInfoWindowDisappearAnimation(var1);
   }

   public void setInfoWindowMovingAnimation(Animation var1) {
      this.a.setInfoWindowMovingAnimation(var1);
   }

   public void startAnimation() {
      this.a.startAnimation();
   }
}
