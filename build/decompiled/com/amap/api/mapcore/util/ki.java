package com.amap.api.mapcore.util;

import android.content.Context;

public class ki extends kh {
   private Context b;
   private boolean c = false;

   public ki(Context var1, boolean var2) {
      this.b = var1;
      this.c = var2;
   }

   protected boolean a() {
      return gz.r(this.b) == 1 || this.c;
   }
}
