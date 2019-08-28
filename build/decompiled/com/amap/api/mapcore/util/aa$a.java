package com.amap.api.mapcore.util;

import java.io.Serializable;
import java.util.Comparator;

class aa$a implements Serializable, Comparator<Object> {
   aa$a() {
   }

   public int compare(Object var1, Object var2) {
      dg var3 = (dg)var1;
      dg var4 = (dg)var2;

      try {
         if (var3 != null && var4 != null) {
            return Float.compare(var3.getZIndex(), var4.getZIndex());
         }
      } catch (Throwable var6) {
         ht.c(var6, "MapOverlayImageView", "compare");
         var6.printStackTrace();
      }

      return 0;
   }
}
