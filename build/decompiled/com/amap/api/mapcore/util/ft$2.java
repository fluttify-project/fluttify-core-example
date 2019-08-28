package com.amap.api.mapcore.util;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Paint.Style;
import android.graphics.drawable.Drawable;

class ft$2 extends Drawable {
   ft$2(ft var1) {
      this.a = var1;
   }

   public void draw(Canvas var1) {
      try {
         this.a(var1);
         this.b(var1);
         this.c(var1);
      } catch (Throwable var3) {
         ;
      }

   }

   private void a(Canvas var1) {
      var1.drawColor(ft.g(this.a));
   }

   private void b(Canvas var1) {
      Paint var2 = new Paint();
      Rect var3 = new Rect();
      Rect var4 = new Rect();
      var3.left = 0;
      var3.top = 0;
      var3.right = 0 + ft.h(this.a).getWidth();
      var3.bottom = 0 + ft.h(this.a).getHeight();
      var4.left = 0;
      var4.top = ft.i(this.a)[0];
      var4.right = 0 + ft.j(this.a);
      var4.bottom = ft.i(this.a)[1];
      var1.drawBitmap(ft.h(this.a), var3, var4, var2);
   }

   private void c(Canvas var1) {
      Paint var2 = new Paint();
      Rect var3 = var1.getClipBounds();
      var2.setColor(ft.k(this.a));
      var2.setStyle(Style.STROKE);
      var2.setStrokeWidth((float)ft.l(this.a));
      var1.drawRect(var3, var2);
   }

   public void setAlpha(int var1) {
   }

   public void setColorFilter(ColorFilter var1) {
   }

   public int getOpacity() {
      return 0;
   }
}
