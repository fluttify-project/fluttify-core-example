package com.amap.api.mapcore.util;

import android.view.View;
import android.view.View.OnClickListener;
import com.amap.api.maps.AMapException;
import com.amap.api.maps.offlinemap.OfflineMapCity;

class gd$1 implements OnClickListener {
   gd$1(gd var1, gd$a var2, OfflineMapCity var3) {
      this.c = var1;
      this.a = var2;
      this.b = var3;
   }

   public void onClick(View var1) {
      this.a.d.setVisibility(8);
      this.a.c.setVisibility(0);
      this.a.c.setText("下载中");

      try {
         gd.a(this.c).downloadByCityName(this.b.getCity());
      } catch (AMapException var3) {
         var3.printStackTrace();
      }

   }
}
