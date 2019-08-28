package com.amap.api.mapcore.util;

import com.amap.api.maps.offlinemap.OfflineMapCity;
import java.util.Comparator;

class gi$2 implements Comparator<OfflineMapCity> {
   gi$2(gi var1) {
      this.a = var1;
   }

   public int a(OfflineMapCity var1, OfflineMapCity var2) {
      char[] var3 = var1.getJianpin().toCharArray();
      char[] var4 = var2.getJianpin().toCharArray();
      if (var3[0] < var4[0]) {
         return 1;
      } else {
         return var3[1] < var4[1] ? 1 : 0;
      }
   }
}
