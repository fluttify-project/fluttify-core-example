package com.amap.api.mapcore.util;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.amap.api.maps.AMap$InfoWindowAdapter;
import com.amap.api.maps.model.Marker;

class ay$1 implements AMap$InfoWindowAdapter {
   ay$1(ay var1) {
      this.a = var1;
   }

   public View getInfoWindow(Marker var1) {
      try {
         if (ay.a(this.a) == null) {
            ay.a(this.a, ex.a(this.a.c, "infowindow_bg.9.png"));
         }

         if (ay.b(this.a) == null) {
            ay.a((ay)this.a, (View)(new LinearLayout(this.a.c)));
            ay.b(this.a).setBackground(ay.a(this.a));
            ay.a(this.a, new TextView(this.a.c));
            ay.c(this.a).setText(var1.getTitle());
            ay.c(this.a).setTextColor(-16777216);
            ay.b(this.a, new TextView(this.a.c));
            ay.d(this.a).setTextColor(-16777216);
            ay.d(this.a).setText(var1.getSnippet());
            ((LinearLayout)ay.b(this.a)).setOrientation(1);
            ((LinearLayout)ay.b(this.a)).addView(ay.c(this.a));
            ((LinearLayout)ay.b(this.a)).addView(ay.d(this.a));
         }
      } catch (Throwable var3) {
         ht.c(var3, "InfoWindowDelegate", "showInfoWindow decodeDrawableFromAsset");
         var3.printStackTrace();
      }

      return ay.b(this.a);
   }

   public View getInfoContents(Marker var1) {
      return null;
   }
}
