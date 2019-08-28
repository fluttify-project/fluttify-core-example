package com.amap.api.mapcore.util;

import android.content.Context;
import com.autonavi.amap.mapcore.MapConfig;

class i$a$1 implements Runnable {
   i$a$1(i$a var1, u var2) {
      this.b = var1;
      this.a = var2;
   }

   public void run() {
      if (this.a != null && this.a.getMapConfig() != null) {
         MapConfig var1 = this.a.getMapConfig();
         var1.setProFunctionAuthEnable(false);
         if (var1.isUseProFunction()) {
            this.a.a(var1.isCustomStyleEnable(), true);
            this.a.w();
            ek.a(i$a.a(this.b) == null ? null : (Context)i$a.a(this.b).get());
         }
      }

   }
}
