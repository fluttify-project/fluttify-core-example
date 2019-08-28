package com.amap.api.maps.offlinemap;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.widget.ExpandableListView;
import android.widget.LinearLayout.LayoutParams;

public class CityExpandView extends ExpandableListView {
   public CityExpandView(Context var1) {
      this(var1, (AttributeSet)null);
   }

   public CityExpandView(Context var1, AttributeSet var2) {
      super(var1, var2, -1);
      this.setLayoutParams(new LayoutParams(-1, -1));
   }

   protected void onMeasure(int var1, int var2) {
      long var3 = System.currentTimeMillis();
      int var5 = MeasureSpec.makeMeasureSpec(536870911, Integer.MIN_VALUE);
      super.onMeasure(var1, var5);
      long var6 = System.currentTimeMillis();
   }
}
