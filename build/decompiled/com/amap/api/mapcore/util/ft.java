package com.amap.api.mapcore.util;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.view.View.MeasureSpec;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.FrameLayout.LayoutParams;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class ft extends ScrollView {
   public static final String a = ft.class.getSimpleName();
   private Context c;
   private LinearLayout d;
   private int e = 0;
   private List<String> f;
   private int g = -1;
   private int h;
   private Bitmap i = null;
   private int j = Color.parseColor("#eeffffff");
   private int k = Color.parseColor("#44383838");
   private int l = 4;
   private int m = 1;
   private int n;
   int b = 1;
   private int o;
   private Runnable p;
   private int q = 50;
   private ft$a r;

   public ft(Context var1) {
      super(var1);
      this.a(var1);
   }

   private void a(Context var1) {
      this.c = var1;
      this.setVerticalScrollBarEnabled(false);

      try {
         if (this.i == null) {
            InputStream var2 = fc.a(var1).open("map_indoor_select.png");
            this.i = BitmapFactory.decodeStream(var2);
            var2.close();
         }
      } catch (Throwable var3) {
         ;
      }

      this.d = new LinearLayout(var1);
      this.d.setOrientation(1);
      this.addView(this.d);
      this.p = new ft$1(this);
   }

   public void a() {
      this.o = this.getScrollY();
      this.postDelayed(this.p, (long)this.q);
   }

   private void e() {
      if (this.f != null && this.f.size() != 0) {
         this.d.removeAllViews();
         this.n = this.m * 2 + 1;

         for(int var1 = this.f.size() - 1; var1 >= 0; --var1) {
            this.d.addView(this.b((String)this.f.get(var1)));
         }

         this.a(0);
      }
   }

   private TextView b(String var1) {
      TextView var2 = new TextView(this.c);
      var2.setLayoutParams(new LayoutParams(-1, -2));
      var2.setSingleLine(true);
      var2.setTextSize(2, 16.0F);
      var2.setText(var1);
      var2.setGravity(17);
      TextPaint var3 = var2.getPaint();
      var3.setFakeBoldText(true);
      int var4 = a(this.c, 8.0F);
      int var5 = a(this.c, 6.0F);
      var2.setPadding(var4, var5, var4, var5);
      if (0 == this.e) {
         this.e = a((View)var2);
         this.d.setLayoutParams(new LayoutParams(-2, this.e * this.n));
         this.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-2, this.e * this.n));
      }

      return var2;
   }

   private void a(int var1) {
      if (this.e != 0) {
         int var2 = var1 / this.e + this.m;
         int var3 = var1 % this.e;
         int var4 = var1 / this.e;
         if (var3 == 0) {
            var2 = var4 + this.m;
         } else {
            byte var5 = 2;
            if (var3 > this.e / var5) {
               var2 = var4 + this.m + 1;
            }
         }

         int var8 = this.d.getChildCount();

         for(int var6 = 0; var6 < var8; ++var6) {
            TextView var7 = (TextView)this.d.getChildAt(var6);
            if (null == var7) {
               return;
            }

            if (var2 == var6) {
               var7.setTextColor(Color.parseColor("#0288ce"));
            } else {
               var7.setTextColor(Color.parseColor("#bbbbbb"));
            }
         }

      }
   }

   public void a(String[] var1) {
      if (null == this.f) {
         this.f = new ArrayList();
      }

      this.f.clear();

      int var2;
      for(var2 = 0; var2 < var1.length; ++var2) {
         this.f.add(var1[var2]);
      }

      for(var2 = 0; var2 < this.m; ++var2) {
         this.f.add(0, "");
         this.f.add("");
      }

      this.e();
   }

   public void setBackgroundColor(int var1) {
      this.j = var1;
   }

   public void b() {
      if (this.i != null && !this.i.isRecycled()) {
         this.i.recycle();
         this.i = null;
      }

      if (this.r != null) {
         this.r = null;
      }

   }

   public void setBackgroundDrawable(Drawable var1) {
      if (this.h == 0) {
         try {
            WindowManager var2 = (WindowManager)this.c.getSystemService("window");
            if (var2 != null) {
               this.h = var2.getDefaultDisplay().getWidth();
            }
         } catch (Throwable var3) {
            var3.printStackTrace();
         }
      }

      ft$2 var4 = new ft$2(this);
      super.setBackgroundDrawable(var4);
   }

   private int[] f() {
      int[] var1 = null;
      if (null == var1) {
         var1 = new int[]{this.e * this.m, this.e * (this.m + 1)};
      }

      return var1;
   }

   protected void onSizeChanged(int var1, int var2, int var3, int var4) {
      super.onSizeChanged(var1, var2, var3, var4);
      this.h = var1;

      try {
         this.setBackgroundDrawable((Drawable)null);
      } catch (Throwable var6) {
         var6.printStackTrace();
      }

   }

   protected void onScrollChanged(int var1, int var2, int var3, int var4) {
      super.onScrollChanged(var1, var2, var3, var4);
      this.a(var2);
      if (var2 > var4) {
         this.g = 1;
      } else {
         this.g = 0;
      }

   }

   private void g() {
      if (null != this.r) {
         try {
            this.r.a(this.c());
         } catch (Throwable var2) {
            ;
         }
      }

   }

   public void a(String var1) {
      if (this.f != null && this.f.size() != 0) {
         int var2 = this.f.indexOf(var1);
         int var3 = this.f.size() - this.m - 1 - var2;
         this.b = var3 + this.m;
         this.post(new ft$3(this, var3));
      }
   }

   public int c() {
      if (this.f != null && this.f.size() != 0) {
         int var1 = this.f.size() - 1 - this.b - this.m;
         return Math.min(this.f.size() - 2 * this.m, Math.max(0, var1));
      } else {
         return 0;
      }
   }

   public void fling(int var1) {
      super.fling(var1 / 3);
   }

   public boolean onTouchEvent(MotionEvent var1) {
      if (var1.getAction() == 1) {
         this.a();
      }

      return super.onTouchEvent(var1);
   }

   public void a(ft$a var1) {
      this.r = var1;
   }

   public static int a(Context var0, float var1) {
      float var2 = var0.getResources().getDisplayMetrics().density;
      return (int)(var1 * var2 + 0.5F);
   }

   public static int a(View var0) {
      b(var0);
      return var0.getMeasuredHeight();
   }

   public static void b(View var0) {
      int var1 = MeasureSpec.makeMeasureSpec(0, 0);
      int var2 = MeasureSpec.makeMeasureSpec(536870911, Integer.MIN_VALUE);
      var0.measure(var1, var2);
   }

   public void a(boolean var1) {
      this.setVisibility(var1 ? 0 : 8);
   }

   public boolean d() {
      return this.getVisibility() == 0;
   }
}
