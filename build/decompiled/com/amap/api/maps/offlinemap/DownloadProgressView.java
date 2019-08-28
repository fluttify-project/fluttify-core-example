package com.amap.api.maps.offlinemap;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Paint.Align;
import android.graphics.Paint.FontMetrics;
import android.graphics.Paint.Style;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import com.amap.api.mapcore.util.a$a;

public class DownloadProgressView extends View {
   private String a;
   private int b = -65536;
   private int c = -65536;
   private float d = 0.0F;
   private float e = 0.6F;
   private TextPaint f;
   private TextPaint g;
   private float h;
   private float i;

   public DownloadProgressView(Context var1) {
      super(var1);
      this.a((AttributeSet)null, 0);
   }

   public DownloadProgressView(Context var1, AttributeSet var2) {
      super(var1, var2);
      this.a(var2, 0);
   }

   public DownloadProgressView(Context var1, AttributeSet var2, int var3) {
      super(var1, var2, var3);
      this.a(var2, var3);
   }

   private void a(AttributeSet var1, int var2) {
      TypedArray var3 = this.getContext().obtainStyledAttributes(var1, a$a.a, var2, 0);
      this.a = var3.getString(0);
      this.b = var3.getColor(3, this.b);
      this.d = var3.getDimension(1, this.d);
      this.c = var3.getColor(2, this.c);
      var3.recycle();
      this.f = new TextPaint();
      this.f.setFlags(1);
      this.f.setTextAlign(Align.RIGHT);
      this.g = new TextPaint();
      this.g.setStyle(Style.FILL);
      this.a();
   }

   private void a() {
      this.f.setTextSize(this.d);
      this.f.setColor(this.b);
      this.g.setColor(this.c);
      this.h = this.f.measureText(this.a);
      FontMetrics var1 = this.f.getFontMetrics();
      this.i = var1.bottom;
   }

   protected void onDraw(Canvas var1) {
      super.onDraw(var1);
      int var2 = this.getPaddingLeft();
      int var3 = this.getPaddingTop();
      int var4 = this.getPaddingRight();
      int var5 = this.getPaddingBottom();
      int var6 = this.getWidth() - var2 - var4;
      int var7 = this.getHeight() - var3 - var5;
      double var8 = (double)((float)var7 * 0.8F);
      double var10 = (double)((float)var6 * this.e);
      double var12 = var8 - 3.0D;
      String var14 = (int)(this.e * 100.0F) + "%";
      var1.drawRect(new Rect(0, (int)var8, (int)((float)var6 * this.e), var7), this.g);
      var1.drawText(var14, (float)((int)var10), (float)((int)var12), this.f);
   }

   public void setProgress(int var1) {
      byte var2 = 100;
      if (var1 <= var2 && var1 >= 0) {
         this.e = (float)var1 / 100.0F;
         this.invalidate();
      }
   }
}
