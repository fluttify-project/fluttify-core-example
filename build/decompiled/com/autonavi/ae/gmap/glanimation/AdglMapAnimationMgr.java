package com.autonavi.ae.gmap.glanimation;

import com.amap.api.maps.AMap$CancelableCallback;
import com.autonavi.ae.gmap.GLMapState;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AdglMapAnimationMgr {
   private List<AbstractAdglAnimation> list = Collections.synchronizedList(new ArrayList());
   private AMap$CancelableCallback mCancelCallback;
   private AdglMapAnimationMgr$MapAnimationListener mMapAnimationListener;

   public AdglMapAnimationMgr() {
   }

   public void setMapCoreListener() {
   }

   public synchronized void clearAnimations() {
      this.list.clear();
   }

   public synchronized int getAnimationsCount() {
      return this.list.size();
   }

   public synchronized void doAnimations(GLMapState var1) {
      if (var1 != null) {
         if (this.list.size() > 0) {
            AbstractAdglAnimation var2 = (AbstractAdglAnimation)this.list.get(0);
            if (var2 != null) {
               if (var2.isOver()) {
                  if (this.mMapAnimationListener != null) {
                     this.mMapAnimationListener.onMapAnimationFinish(this.mCancelCallback);
                  }

                  this.list.remove(var2);
               } else {
                  var2.doAnimation(var1);
               }

            }
         }
      }
   }

   public void addAnimation(AbstractAdglAnimation var1, AMap$CancelableCallback var2) {
      if (var1 != null) {
         List var3 = this.list;
         synchronized(this.list) {
            if (!var1.isOver() && this.list.size() > 0) {
               AbstractAdglAnimation var4 = (AbstractAdglAnimation)this.list.get(this.list.size() - 1);
               if (var4 != null && var1 instanceof AdglMapAnimGroup && var4 instanceof AdglMapAnimGroup && ((AdglMapAnimGroup)var1).typeEqueal((AdglMapAnimGroup)var4) && !((AdglMapAnimGroup)var1).needMove) {
                  this.list.remove(var4);
               }
            }

            this.list.add(var1);
            this.mCancelCallback = var2;
         }
      }
   }

   public AMap$CancelableCallback getCancelCallback() {
      return this.mCancelCallback;
   }

   public void setMapAnimationListener(AdglMapAnimationMgr$MapAnimationListener var1) {
      synchronized(this) {
         this.mMapAnimationListener = var1;
      }
   }
}
