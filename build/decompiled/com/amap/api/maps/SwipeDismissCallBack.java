package com.amap.api.maps;

import android.view.View;

public class SwipeDismissCallBack implements SwipeDismissTouchListener$DismissCallbacks {
   SwipeDismissView a;

   public SwipeDismissCallBack(SwipeDismissView var1) {
      this.a = var1;
   }

   public boolean canDismiss(Object var1) {
      return true;
   }

   public void onDismiss(View var1, Object var2) {
      if (this.a.onDismissCallback != null) {
         this.a.onDismissCallback.onDismiss();
      }

   }

   public void onNotifySwipe() {
      if (this.a.onDismissCallback != null) {
         this.a.onDismissCallback.onNotifySwipe();
      }

   }
}
