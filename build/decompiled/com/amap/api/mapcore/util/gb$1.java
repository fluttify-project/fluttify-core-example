package com.amap.api.mapcore.util;

import android.view.View;
import android.view.View.OnClickListener;
import com.amap.api.maps.offlinemap.OfflineMapCity;

class gb$1 implements OnClickListener {
   gb$1(gb var1, OfflineMapCity var2) {
      this.b = var1;
      this.a = var2;
   }

   public void onClick(View var1) {
      gb.a(this.b).a(this.a);
   }
}
