package com.amap.api.mapcore.util;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.ImageView;
import android.widget.LinearLayout;

class fz extends LinearLayout {
   private Bitmap a;
   private Bitmap b;
   private Bitmap c;
   private Bitmap d;
   private Bitmap e;
   private Bitmap f;
   private Bitmap g;
   private Bitmap h;
   private Bitmap i;
   private Bitmap j;
   private Bitmap k;
   private Bitmap l;
   private ImageView m;
   private ImageView n;
   private u o;

   public void a() {
      try {
         this.removeAllViews();
         this.a.recycle();
         this.b.recycle();
         this.c.recycle();
         this.d.recycle();
         this.e.recycle();
         this.f.recycle();
         this.a = null;
         this.b = null;
         this.c = null;
         this.d = null;
         this.e = null;
         this.f = null;
         if (this.g != null) {
            this.g.recycle();
            this.g = null;
         }

         if (this.h != null) {
            this.h.recycle();
            this.h = null;
         }

         if (this.i != null) {
            this.i.recycle();
            this.i = null;
         }

         if (this.j != null) {
            this.j.recycle();
            this.g = null;
         }

         if (this.k != null) {
            this.k.recycle();
            this.k = null;
         }

         if (this.l != null) {
            this.l.recycle();
            this.l = null;
         }

         this.m = null;
         this.n = null;
      } catch (Throwable var2) {
         ht.c(var2, "ZoomControllerView", "destory");
         var2.printStackTrace();
      }

   }

   public fz(Context var1, u var2) {
      super(var1);
      this.o = var2;

      try {
         this.g = fi.a(var1, "zoomin_selected.png");
         this.a = fi.a(this.g, com.amap.api.mapcore.util.n.a);
         this.h = fi.a(var1, "zoomin_unselected.png");
         this.b = fi.a(this.h, com.amap.api.mapcore.util.n.a);
         this.i = fi.a(var1, "zoomout_selected.png");
         this.c = fi.a(this.i, com.amap.api.mapcore.util.n.a);
         this.j = fi.a(var1, "zoomout_unselected.png");
         this.d = fi.a(this.j, com.amap.api.mapcore.util.n.a);
         this.k = fi.a(var1, "zoomin_pressed.png");
         this.e = fi.a(this.k, com.amap.api.mapcore.util.n.a);
         this.l = fi.a(var1, "zoomout_pressed.png");
         this.f = fi.a(this.l, com.amap.api.mapcore.util.n.a);
         this.m = new ImageView(var1);
         this.m.setImageBitmap(this.a);
         this.m.setClickable(true);
         this.n = new ImageView(var1);
         this.n.setImageBitmap(this.c);
         this.n.setClickable(true);
         this.m.setOnTouchListener(new fz$1(this));
         this.n.setOnTouchListener(new fz$2(this));
         this.m.setPadding(0, 0, 20, -2);
         this.n.setPadding(0, 0, 20, 20);
         this.setOrientation(1);
         this.addView(this.m);
         this.addView(this.n);
      } catch (Throwable var4) {
         ht.c(var4, "ZoomControllerView", "create");
         var4.printStackTrace();
      }

   }

   public void a(float var1) {
      try {
         if (var1 < this.o.getMaxZoomLevel() && var1 > this.o.getMinZoomLevel()) {
            this.m.setImageBitmap(this.a);
            this.n.setImageBitmap(this.c);
         } else if (var1 == this.o.getMinZoomLevel()) {
            this.n.setImageBitmap(this.d);
            this.m.setImageBitmap(this.a);
         } else if (var1 == this.o.getMaxZoomLevel()) {
            this.m.setImageBitmap(this.b);
            this.n.setImageBitmap(this.c);
         }
      } catch (Throwable var3) {
         ht.c(var3, "ZoomControllerView", "setZoomBitmap");
         var3.printStackTrace();
      }

   }

   public void a(int var1) {
      try {
         fv$a var2 = (fv$a)this.getLayoutParams();
         if (var1 == 1) {
            var2.d = 16;
         } else if (var1 == 2) {
            var2.d = 80;
         }

         this.setLayoutParams(var2);
      } catch (Throwable var3) {
         ht.c(var3, "ZoomControllerView", "setZoomPosition");
         var3.printStackTrace();
      }

   }

   public void a(boolean var1) {
      if (var1) {
         this.setVisibility(0);
      } else {
         this.setVisibility(8);
      }

   }
}
