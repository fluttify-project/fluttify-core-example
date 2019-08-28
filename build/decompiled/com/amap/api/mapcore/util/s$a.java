package com.amap.api.mapcore.util;

import java.io.Serializable;
import java.util.Comparator;

class s$a implements Serializable, Comparator<Object> {
   s$a() {
   }

   public int compare(Object var1, Object var2) {
      df var3 = (df)var1;
      df var4 = (df)var2;

      try {
         if (var3 != null && var4 != null) {
            if (var3.getZIndex() > var4.getZIndex()) {
               return 1;
            }

            if (var3.getZIndex() < var4.getZIndex()) {
               return -1;
            }
         }
      } catch (Throwable var6) {
         ht.c(var6, "GlOverlayLayer", "compare");
         var6.printStackTrace();
      }

      return 0;
   }
}
