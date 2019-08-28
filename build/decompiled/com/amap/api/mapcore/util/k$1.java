package com.amap.api.mapcore.util;

import android.text.TextUtils;
import com.autonavi.amap.mapcore.AMapEngineUtils;

class k$1 implements Runnable {
   k$1(k var1, String var2, String var3, boolean var4, String var5, String var6) {
      this.f = var1;
      this.a = var2;
      this.b = var3;
      this.c = var4;
      this.d = var5;
      this.e = var6;
   }

   public void run() {
      boolean var1;
      String var2;
      String var3;
      String var4;
      l$d var5;
      l var6;
      if (!TextUtils.isEmpty(this.a) && !TextUtils.isEmpty(this.b)) {
         var1 = this.c;
         var2 = AMapEngineUtils.LOGO_CUSTOM_ICON_DAY_NAME;
         var3 = this.b;
         var4 = this.a;
         if (var1) {
            var5 = new l$d(var3, var4, var2);
            var5.a("amap_web_logo", "md5_day");
            var6 = new l(k.a(this.f), var5, fi.e());
            var6.a();
         }

         if (this.f.a != null && this.f.a.get() != null) {
            ((u)this.f.a.get()).a(var2, var1, 0);
         }
      }

      if (!TextUtils.isEmpty(this.d) && !TextUtils.isEmpty(this.e)) {
         var1 = this.c;
         var2 = AMapEngineUtils.LOGO_CUSTOM_ICON_NIGHT_NAME;
         var3 = this.e;
         var4 = this.d;
         if (var1) {
            var5 = new l$d(var3, var4, var2);
            var5.a("amap_web_logo", "md5_night");
            var6 = new l(k.a(this.f), var5, fi.e());
            var6.a();
         }

         if (this.f.a != null && this.f.a.get() != null) {
            ((u)this.f.a.get()).a(var2, var1, 1);
         }
      }

   }
}
