package com.autonavi.amap.mapcore.interfaces;

import com.amap.api.maps.model.animation.Animation;
import com.amap.api.maps.model.animation.Animation$AnimationListener;

public interface IInfoWindowManager {
   void setInfoWindowAnimation(Animation var1, Animation$AnimationListener var2);

   void setInfoWindowAppearAnimation(Animation var1);

   void setInfoWindowBackColor(int var1);

   void setInfoWindowBackEnable(boolean var1);

   void setInfoWindowBackScale(float var1, float var2);

   void setInfoWindowDisappearAnimation(Animation var1);

   void setInfoWindowMovingAnimation(Animation var1);

   void startAnimation();
}
