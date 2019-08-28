package com.amap.api.mapcore.util;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.Paint.Style;
import android.view.View;
import com.autonavi.amap.mapcore.DPoint;
import com.autonavi.amap.mapcore.IPoint;
import com.autonavi.amap.mapcore.VirtualEarthProjection;

public class fx extends View {
   private String a = "";
   private int b = 0;
   private u c;
   private Paint d;
   private Paint e;
   private Rect f;
   private IPoint g;
   private float h = 0.0F;
   private final int[] i = new int[]{10000000, 5000000, 2000000, 1000000, 500000, 200000, 100000, 50000, 30000, 20000, 10000, 5000, 2000, 1000, 500, 200, 100, 50, 25, 10, 5};

   public void a() {
      this.d = null;
      this.e = null;
      this.f = null;
      this.a = null;
      this.g = null;
   }

   public fx(Context var1, u var2) {
      super(var1);
      this.c = var2;
      this.d = new Paint();
      this.f = new Rect();
      this.d.setAntiAlias(true);
      this.d.setColor(-16777216);
      this.d.setStrokeWidth(2.0F * n.a);
      this.d.setStyle(Style.STROKE);
      this.e = new Paint();
      this.e.setAntiAlias(true);
      this.e.setColor(-16777216);
      this.e.setTextSize(20.0F * n.a);
      this.h = (float)fc.a(var1, 1.0F);
      this.g = new IPoint();
   }

   protected void onDraw(Canvas var1) {
      if (this.a != null && !"".equals(this.a) && this.b != 0) {
         Point var2 = this.c.l();
         if (var2 != null) {
            this.e.getTextBounds(this.a, 0, this.a.length(), this.f);
            int var3 = var2.x;
            int var4 = var2.y - this.f.height() + 5;
            var1.drawText(this.a, (float)(var3 + (this.b - this.f.width()) / 2), (float)var4, this.e);
            var4 += this.f.height() - 5;
            var1.drawLine((float)var3, (float)var4 - 2.0F * this.h, (float)var3, (float)var4 + n.a, this.d);
            var1.drawLine((float)var3, (float)var4, (float)(var3 + this.b), (float)var4, this.d);
            var1.drawLine((float)(var3 + this.b), (float)var4 - 2.0F * this.h, (float)(var3 + this.b), (float)var4 + n.a, this.d);
         }
      }
   }

   public void a(String var1) {
      this.a = var1;
   }

   public void a(int var1) {
      this.b = var1;
   }

   public void a(boolean var1) {
      if (var1) {
         this.setVisibility(0);
         this.b();
      } else {
         this.a("");
         this.a(0);
         this.setVisibility(8);
      }

   }

   public void b() {
      if (this.c != null) {
         try {
            float var1 = this.c.a(1);
            this.c.a(1, (IPoint)this.g);
            if (this.g == null) {
               return;
            }

            DPoint var2 = VirtualEarthProjection.pixelsToLatLong((long)this.g.x, (long)this.g.y, 20);
            float var3 = this.c.t();
            double var4 = (double)((float)(Math.cos(var2.y * 3.141592653589793D / 180.0D) * 2.0D * 3.141592653589793D * 6378137.0D / (256.0D * Math.pow(2.0D, (double)var1))));
            int var6 = (int)((double)this.i[(int)var1] / (var4 * (double)var3));
            String var7 = fi.a(this.i[(int)var1]);
            this.a(var6);
            this.a(var7);
            var2.recycle();
            this.invalidate();
         } catch (Throwable var8) {
            ht.c(var8, "AMapDelegateImpGLSurfaceView", "changeScaleState");
            var8.printStackTrace();
         }

      }
   }
}
