package com.amap.api.mapcore.util;

import android.content.Context;

public class au extends at {
   public au(Context var1, au$a var2) {
      super(var1, var2);
   }

   public float l() {
      double var1 = Math.atan2((double)this.i(), (double)this.h()) - Math.atan2((double)this.f(), (double)this.e());
      return (float)(var1 * 180.0D / 3.141592653589793D);
   }
}
