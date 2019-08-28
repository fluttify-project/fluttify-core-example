package com.amap.api.mapcore.util;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.RelativeLayout.LayoutParams;

class gi$1 implements OnClickListener {
   gi$1(gi var1) {
      this.a = var1;
   }

   public void onClick(View var1) {
      try {
         gi.a(this.a).setText("");
         gi.b(this.a).setVisibility(8);
         this.a.a(false);
         LayoutParams var2 = (LayoutParams)gi.c(this.a).getLayoutParams();
         var2.leftMargin = this.a.a(95.0F);
         gi.c(this.a).setLayoutParams(var2);
         gi.a(this.a).setPadding(this.a.a(105.0F), 0, 0, 0);
      } catch (Exception var3) {
         var3.printStackTrace();
      }

   }
}
