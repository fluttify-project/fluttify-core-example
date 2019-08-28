package com.amap.api.maps.offlinemap;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.widget.ExpandableListView;
import android.widget.LinearLayout.LayoutParams;

public class DownLoadExpandListView extends ExpandableListView {
   public DownLoadExpandListView(Context var1) {
      super(var1);
   }

   public DownLoadExpandListView(Context var1, AttributeSet var2) {
      super(var1, var2);
      this.setLayoutParams(new LayoutParams(-1, -1));
   }

   protected void onMeasure(int var1, int var2) {
      int var3 = MeasureSpec.makeMeasureSpec(536870911, Integer.MIN_VALUE);
      super.onMeasure(var1, var3);
   }
}
