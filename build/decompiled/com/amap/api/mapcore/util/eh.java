package com.amap.api.mapcore.util;

import com.amap.api.maps.MapsInitializer;
import java.util.Map;

public abstract class eh extends ji {
   protected boolean isPostFlag = true;

   public eh() {
   }

   protected byte[] makeHttpRequest() throws gt {
      int var1 = MapsInitializer.getProtocol();
      jh var2 = jh.a(false);
      byte[] var3 = null;
      if (var1 == 1) {
         if (this.isPostFlag) {
            var3 = var2.b(this);
         } else {
            var3 = var2.d(this);
         }
      } else if (var1 == 2) {
         if (this.isPostFlag) {
            var3 = var2.a(this);
         } else {
            var3 = var2.e(this);
         }
      }

      return var3;
   }

   public Map<String, String> getParams() {
      return null;
   }

   public Map<String, String> getRequestHead() {
      return null;
   }
}
