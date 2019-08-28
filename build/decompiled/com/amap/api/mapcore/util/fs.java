package com.amap.api.mapcore.util;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Bitmap.Config;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ImageView.ScaleType;

public class fs extends LinearLayout {
   Bitmap a;
   Bitmap b;
   Bitmap c;
   ImageView d;
   u e;
   Matrix f = new Matrix();

   public void a() {
      try {
         this.removeAllViews();
         if (this.a != null) {
            this.a.recycle();
         }

         if (this.b != null) {
            this.b.recycle();
         }

         if (this.c != null) {
            this.c.recycle();
         }

         if (this.f != null) {
            this.f.reset();
            this.f = null;
         }

         this.c = null;
         this.a = null;
         this.b = null;
      } catch (Throwable var2) {
         ht.c(var2, "CompassView", "destroy");
         var2.printStackTrace();
      }

   }

   public fs(Context var1, u var2) {
      super(var1);
      this.e = var2;

      try {
         this.c = fi.a(var1, "maps_dav_compass_needle_large.png");
         this.b = fi.a(this.c, n.a * 0.8F);
         this.c = fi.a(this.c, n.a * 0.7F);
         if (this.b == null || this.c == null) {
            return;
         }

         this.a = Bitmap.createBitmap(this.b.getWidth(), this.b.getHeight(), Config.ARGB_8888);
         Canvas var3 = new Canvas(this.a);
         Paint var4 = new Paint();
         var4.setAntiAlias(true);
         var4.setFilterBitmap(true);
         var3.drawBitmap(this.c, (float)(this.b.getWidth() - this.c.getWidth()) / 2.0F, (float)(this.b.getHeight() - this.c.getHeight()) / 2.0F, var4);
         this.d = new ImageView(var1);
         this.d.setScaleType(ScaleType.MATRIX);
         this.d.setImageBitmap(this.a);
         this.d.setClickable(true);
         this.b();
         this.d.setOnTouchListener(new fs$1(this));
         this.addView(this.d);
      } catch (Throwable var5) {
         ht.c(var5, "CompassView", "create");
         var5.printStackTrace();
      }

   }

   public void b() {
      try {
         if (this.e != null && this.d != null) {
            float var1 = this.e.o(1);
            float var2 = this.e.n(1);
            if (this.f == null) {
               this.f = new Matrix();
            }

            this.f.reset();
            this.f.postRotate(-var2, (float)this.d.getDrawable().getBounds().width() / 2.0F, (float)this.d.getDrawable().getBounds().height() / 2.0F);
            this.f.postScale(1.0F, (float)Math.cos((double)var1 * 3.141592653589793D / 180.0D), (float)this.d.getDrawable().getBounds().width() / 2.0F, (float)this.d.getDrawable().getBounds().height() / 2.0F);
            this.d.setImageMatrix(this.f);
         }
      } catch (Throwable var3) {
         ht.c(var3, "CompassView", "invalidateAngle");
         var3.printStackTrace();
      }

   }

   public void a(boolean var1) {
      if (var1) {
         this.setVisibility(0);
         this.b();
      } else {
         this.setVisibility(8);
      }

   }
}
