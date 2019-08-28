package com.amap.api.maps;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;

@SuppressLint({"ViewConstructor"})
public class SwipeDismissView extends RelativeLayout {
   protected WearMapView$OnDismissCallback onDismissCallback = null;

   public void setCallback(WearMapView$OnDismissCallback var1) {
      this.onDismissCallback = var1;
   }

   public SwipeDismissView(Context var1, View var2) {
      super(var1);
      this.setOnTouchListener(var2);
   }

   public SwipeDismissView(Context var1, AttributeSet var2, View var3) {
      super(var1, var2);
      this.setOnTouchListener(var3);
   }

   public SwipeDismissView(Context var1, AttributeSet var2, int var3, View var4) {
      super(var1, var2, var3);
      this.setOnTouchListener(var4);
   }

   protected void setOnTouchListener(View var1) {
      SwipeDismissTouchListener var2 = new SwipeDismissTouchListener(var1, new Object(), new SwipeDismissCallBack(this));
      this.setOnTouchListener(var2);
   }
}
