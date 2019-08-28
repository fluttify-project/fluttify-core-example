package com.amap.api.mapcore.util;

import com.autonavi.amap.mapcore.AMapEngineUtils;

class fy$1 implements Runnable {
   fy$1(fy var1) {
      this.a = var1;
   }

   public void run() {
      String var1 = "f3a1627fe912c49ecdcd4ab92a5d6bc8";
      String var2 = "61733cf36c9727db08c2ef727490c036";
      this.a.a(AMapEngineUtils.LOGO_CUSTOM_ICON_DAY_NAME, 0);
      this.a.a(AMapEngineUtils.LOGO_CUSTOM_ICON_NIGHT_NAME, 1);
      String var3 = ey.a(fy.a(this.a), "amap_web_logo", "md5_day", "");
      if ("".equals(var3)) {
         if (fy.b(this.a) != null && fy.c(this.a) != null) {
            String var4 = hc.a(AMapEngineUtils.LOGO_CUSTOM_ICON_DAY_NAME);
            ey.a(fy.a(this.a), "amap_web_logo", "md5_day", (Object)var4);
            var4 = hc.a(AMapEngineUtils.LOGO_CUSTOM_ICON_NIGHT_NAME);
            if (!"".equals(var4)) {
               ey.a(fy.a(this.a), "amap_web_logo", "md5_night", (Object)var4);
            }

            this.a.b(true);
         } else {
            ey.a(fy.a(this.a), "amap_web_logo", "md5_day", (Object)var1);
            ey.a(fy.a(this.a), "amap_web_logo", "md5_night", (Object)var2);
         }
      }

   }
}
