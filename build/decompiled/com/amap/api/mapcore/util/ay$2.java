package com.amap.api.mapcore.util;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.amap.api.maps.AMap$CommonInfoWindowAdapter;
import com.amap.api.maps.InfoWindowParams;
import com.amap.api.maps.model.BasePointOverlay;

class ay$2 implements AMap$CommonInfoWindowAdapter {
   ay$2(ay var1) {
      this.a = var1;
   }

   public InfoWindowParams getInfoWindowParams(BasePointOverlay var1) {
      try {
         InfoWindowParams var2 = new InfoWindowParams();
         if (ay.a(this.a) == null) {
            ay.a(this.a, ex.a(this.a.c, "infowindow_bg.9.png"));
         }

         ay.a((ay)this.a, (View)(new LinearLayout(this.a.c)));
         ay.b(this.a).setBackground(ay.a(this.a));
         ay.a(this.a, new TextView(this.a.c));
         ay.c(this.a).setText("标题");
         ay.c(this.a).setTextColor(-16777216);
         ay.b(this.a, new TextView(this.a.c));
         ay.d(this.a).setTextColor(-16777216);
         ay.d(this.a).setText("内容");
         ((LinearLayout)ay.b(this.a)).setOrientation(1);
         ((LinearLayout)ay.b(this.a)).addView(ay.c(this.a));
         ((LinearLayout)ay.b(this.a)).addView(ay.d(this.a));
         var2.setInfoWindowType(2);
         var2.setInfoWindow(ay.b(this.a));
         return var2;
      } catch (Throwable var3) {
         ht.c(var3, "InfoWindowDelegate", "showInfoWindow decodeDrawableFromAsset");
         var3.printStackTrace();
         return null;
      }
   }
}
