package com.amap.api.mapcore.util;

import android.graphics.Bitmap;
import java.lang.ref.WeakReference;

class fm$1 extends eu<String, Bitmap> {
   fm$1(fm var1, int var2) {
      super(var2);
      this.a = var1;
   }

   protected void a(boolean var1, String var2, Bitmap var3, Bitmap var4) {
      if (fi.c() && fm.a(this.a) != null && var3 != null && !var3.isRecycled()) {
         fm.a(this.a).put(var2, new WeakReference(var3));
      }

   }

   protected int a(String var1, Bitmap var2) {
      int var3 = fm.a(var2);
      return var3 == 0 ? 1 : var3;
   }
}
