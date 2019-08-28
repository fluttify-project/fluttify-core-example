package com.amap.api.mapcore.util;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class fu extends LinearLayout {
   Bitmap a;
   Bitmap b;
   Bitmap c;
   Bitmap d;
   Bitmap e;
   Bitmap f;
   ImageView g;
   u h;
   boolean i = false;

   public void a() {
      try {
         this.removeAllViews();
         if (this.a != null) {
            this.a.recycle();
         }

         if (this.b != null) {
            this.b.recycle();
         }

         if (this.b != null) {
            this.c.recycle();
         }

         this.a = null;
         this.b = null;
         this.c = null;
         if (this.d != null) {
            this.d.recycle();
            this.d = null;
         }

         if (this.e != null) {
            this.e.recycle();
            this.e = null;
         }

         if (this.f != null) {
            this.f.recycle();
            this.f = null;
         }
      } catch (Throwable var2) {
         ht.c(var2, "LocationView", "destroy");
         var2.printStackTrace();
      }

   }

   @SuppressLint({"ClickableViewAccessibility"})
   public fu(Context var1, u var2) {
      super(var1);
      this.h = var2;

      try {
         this.d = fi.a(var1, "location_selected.png");
         this.a = fi.a(this.d, n.a);
         this.e = fi.a(var1, "location_pressed.png");
         this.b = fi.a(this.e, n.a);
         this.f = fi.a(var1, "location_unselected.png");
         this.c = fi.a(this.f, n.a);
         this.g = new ImageView(var1);
         this.g.setImageBitmap(this.a);
         this.g.setClickable(true);
         this.g.setPadding(0, 20, 20, 0);
         this.g.setOnTouchListener(new fu$1(this));
         this.addView(this.g);
      } catch (Throwable var4) {
         ht.c(var4, "LocationView", "create");
         var4.printStackTrace();
      }

   }

   public void a(boolean var1) {
      this.i = var1;

      try {
         if (var1) {
            this.g.setImageBitmap(this.a);
         } else {
            this.g.setImageBitmap(this.c);
         }

         this.g.invalidate();
      } catch (Throwable var3) {
         ht.c(var3, "LocationView", "showSelect");
         var3.printStackTrace();
      }

   }
}
