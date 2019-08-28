package com.amap.api.mapcore.util;

import java.io.Serializable;
import java.util.Comparator;

class ah$a implements Serializable, Comparator<Object> {
   ah$a() {
   }

   public int compare(Object var1, Object var2) {
      dl var3 = (dl)var1;
      dl var4 = (dl)var2;

      try {
         if (var3 != null && var4 != null) {
            return Float.compare(var3.getZIndex(), var4.getZIndex());
         }
      } catch (Throwable var6) {
         ht.c(var6, "TileOverlayView", "compare");
         var6.printStackTrace();
      }

      return 0;
   }
}
