package com.amap.api.mapcore.util;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.LayoutInflater.Factory;

class gj$1 implements Factory {
   gj$1(gj var1) {
      this.a = var1;
   }

   public View onCreateView(String var1, Context var2, AttributeSet var3) {
      return gj.a(this.a, var1, var2, var3);
   }
}
