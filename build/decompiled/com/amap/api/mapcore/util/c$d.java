package com.amap.api.mapcore.util;

import android.content.Context;
import com.amap.api.maps.AMap$OnCacheRemoveListener;
import com.amap.api.maps.MapsInitializer;
import com.autonavi.amap.mapcore.FileUtil;
import java.io.File;

class c$d implements Runnable {
   private Context b;
   private AMap$OnCacheRemoveListener c;

   public c$d(c var1, Context var2, AMap$OnCacheRemoveListener var3) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
   }

   public void run() {
      boolean var1 = true;

      try {
         Context var2 = this.b.getApplicationContext();
         String var3 = fi.c(var2);
         String var4 = fi.a(var2);
         File var5 = new File(var3);
         if (var5.exists()) {
            var1 = var1 && FileUtil.deleteFile(var5);
         }

         var1 = var1 && FileUtil.deleteFile(new File(var4));
         var1 = var1 && fi.e(var2);
         if (com.amap.api.mapcore.util.c.i(this.a) != null && !MapsInitializer.isTileOverlayClosed()) {
            com.amap.api.mapcore.util.c.i(this.a).h();
         }
      } catch (Throwable var15) {
         ht.c(var15, "AMapDelegateImp", "RemoveCacheRunnable");
         var1 = false;
      } finally {
         try {
            if (this.a.g != null && this.c != null) {
               this.c.onRemoveCacheFinish(var1);
            }
         } catch (Throwable var14) {
            var14.printStackTrace();
         }

      }

   }

   public boolean equals(Object var1) {
      return var1 instanceof c$d;
   }
}
