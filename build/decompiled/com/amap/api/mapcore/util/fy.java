package com.amap.api.mapcore.util;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Paint.Style;
import android.view.View;
import com.autonavi.amap.mapcore.AMapEngineUtils;
import java.io.File;
import java.io.InputStream;

public class fy extends View {
   private Bitmap a;
   private Bitmap b;
   private Bitmap c;
   private Bitmap d;
   private Bitmap e;
   private Bitmap f;
   private Paint g = new Paint();
   private boolean h = false;
   private int i = 0;
   private int j = 0;
   private int k = 0;
   private int l = 10;
   private int m = 0;
   private int n = 0;
   private int o = 10;
   private int p = 8;
   private boolean q = false;
   private boolean r = false;
   private Context s;
   private float t = 0.0F;
   private float u = 0.0F;
   private boolean v = true;

   public void a() {
      try {
         if (this.a != null) {
            this.a.recycle();
         }

         if (this.b != null) {
            this.b.recycle();
         }

         this.a = null;
         this.b = null;
         if (this.e != null) {
            this.e.recycle();
            this.e = null;
         }

         if (this.f != null) {
            this.f.recycle();
            this.f = null;
         }

         if (this.c != null) {
            this.c.recycle();
         }

         this.c = null;
         if (this.d != null) {
            this.d.recycle();
         }

         this.d = null;
         this.g = null;
      } catch (Throwable var2) {
         ht.c(var2, "WaterMarkerView", "destory");
         var2.printStackTrace();
      }

   }

   public fy(Context var1, u var2) {
      super(var1);
      InputStream var3 = null;
      InputStream var4 = null;

      try {
         this.s = var1.getApplicationContext();
         var3 = fc.a(var1).open("ap.data");
         this.e = BitmapFactory.decodeStream(var3);
         this.a = fi.a(this.e, com.amap.api.mapcore.util.n.a);
         var3.close();
         var4 = fc.a(var1).open("ap1.data");
         this.f = BitmapFactory.decodeStream(var4);
         this.b = fi.a(this.f, com.amap.api.mapcore.util.n.a);
         var4.close();
         this.j = this.b.getWidth();
         this.i = this.b.getHeight();
         this.g.setAntiAlias(true);
         this.g.setColor(-16777216);
         this.g.setStyle(Style.STROKE);
         AMapEngineUtils.LOGO_CUSTOM_ICON_DAY_NAME = var1.getFilesDir() + "/icon_web_day.data";
         AMapEngineUtils.LOGO_CUSTOM_ICON_NIGHT_NAME = var1.getFilesDir() + "/icon_web_night.data";
         fh.a().a(new fy$1(this));
      } catch (Throwable var19) {
         ht.c(var19, "WaterMarkerView", "create");
         var19.printStackTrace();
      } finally {
         if (var3 != null) {
            try {
               var3.close();
            } catch (Throwable var18) {
               var18.printStackTrace();
            }
         }

         if (var4 != null) {
            try {
               var4.close();
            } catch (Throwable var17) {
               var17.printStackTrace();
            }
         }

      }

   }

   public Bitmap b() {
      if (this.h) {
         return this.r && this.d != null ? this.d : this.b;
      } else {
         return this.r && this.c != null ? this.c : this.a;
      }
   }

   public void a(boolean var1) {
      try {
         this.h = var1;
         if (var1) {
            this.g.setColor(-1);
         } else {
            this.g.setColor(-16777216);
         }
      } catch (Throwable var3) {
         ht.c(var3, "WaterMarkerView", "changeBitmap");
         var3.printStackTrace();
      }

   }

   public Point c() {
      return new Point(this.l, this.m - 2);
   }

   public void a(int var1) {
      this.n = 0;
      this.k = var1;
      this.d();
   }

   public void b(int var1) {
      this.n = 1;
      this.p = var1;
      this.d();
   }

   public void c(int var1) {
      this.n = 1;
      this.o = var1;
      this.d();
   }

   public float d(int var1) {
      float var2 = 0.0F;
      switch(var1) {
      case 0:
         var2 = this.t;
         break;
      case 1:
         var2 = 1.0F - this.t;
         break;
      case 2:
         var2 = 1.0F - this.u;
      }

      return var2;
   }

   public void a(int var1, float var2) {
      this.n = 2;
      float var3 = Math.max(0.0F, Math.min(var2, 1.0F));
      switch(var1) {
      case 0:
         this.t = var3;
         this.v = true;
         break;
      case 1:
         this.t = 1.0F - var3;
         this.v = false;
         break;
      case 2:
         this.u = 1.0F - var3;
      }

      this.d();
   }

   public void d() {
      if (this.getWidth() != 0 && this.getHeight() != 0) {
         this.f();
         this.postInvalidate();
      }
   }

   public void onDraw(Canvas var1) {
      try {
         if (this.getWidth() == 0 || this.getHeight() == 0) {
            return;
         }

         if (this.b == null) {
            return;
         }

         if (!this.q) {
            this.f();
            this.q = true;
         }

         var1.drawBitmap(this.b(), (float)this.l, (float)this.m, this.g);
      } catch (Throwable var3) {
         ht.c(var3, "WaterMarkerView", "onDraw");
         var3.printStackTrace();
      }

   }

   private void f() {
      switch(this.n) {
      case 0:
         this.h();
      case 1:
      default:
         break;
      case 2:
         this.g();
      }

      this.l = this.o;
      this.m = this.getHeight() - this.p - this.i;
      if (this.l < 0) {
         this.l = 0;
      }

      if (this.m < 0) {
         this.m = 0;
      }

   }

   private void g() {
      if (this.v) {
         this.o = (int)((float)this.getWidth() * this.t);
      } else {
         this.o = (int)((float)this.getWidth() * this.t - (float)this.j);
      }

      this.p = (int)((float)this.getHeight() * this.u);
   }

   private void h() {
      if (this.k == 1) {
         this.o = (this.getWidth() - this.j) / 2;
      } else if (this.k == 2) {
         this.o = this.getWidth() - this.j - 10;
      } else {
         this.o = 10;
      }

      this.p = 8;
   }

   public void a(String var1, int var2) {
      try {
         if (!(new File(var1)).exists()) {
            return;
         }

         Bitmap var3;
         if (var2 == 0) {
            var3 = this.c;
            this.e = BitmapFactory.decodeFile(var1);
            this.c = fi.a(this.e, com.amap.api.mapcore.util.n.a);
            if (var3 != null && !var3.isRecycled()) {
               var3.recycle();
            }
         } else if (var2 == 1) {
            var3 = this.d;
            this.e = BitmapFactory.decodeFile(var1);
            this.d = fi.a(this.e, com.amap.api.mapcore.util.n.a);
            if (var3 != null && !var3.isRecycled()) {
               var3.recycle();
            }
         }
      } catch (Throwable var4) {
         ht.c(var4, "WaterMarkerView", "create");
         var4.printStackTrace();
      }

   }

   public void b(boolean var1) {
      if (this.r != var1) {
         this.r = var1;
         if (var1) {
            if (this.h) {
               if (this.d != null) {
                  this.j = this.d.getWidth();
                  this.i = this.d.getHeight();
               }
            } else if (this.c != null) {
               this.j = this.c.getWidth();
               this.i = this.c.getHeight();
            }
         } else {
            this.j = this.a.getWidth();
            this.i = this.a.getHeight();
         }
      }

   }

   public boolean e() {
      return this.h;
   }
}
