package com.amap.api.mapcore.util;

import android.app.Dialog;
import android.content.Context;
import android.view.Window;
import android.view.WindowManager.LayoutParams;

abstract class gf extends Dialog {
   public gf(Context var1) {
      super(var1);
      this.b();
   }

   protected void b() {
      Window var1 = this.getWindow();
      if (var1 != null) {
         var1.requestFeature(1);
         this.a();
         var1.getDecorView().setPadding(0, 0, 0, 0);
         LayoutParams var2 = null;
         var2 = var1.getAttributes();
         if (var2 != null) {
            var2.width = -1;
            var2.height = -2;
            var2.gravity = 80;
         }

         var1.setAttributes(var2);
         var1.setBackgroundDrawableResource(17170445);
      }

   }

   protected abstract void a();
}
