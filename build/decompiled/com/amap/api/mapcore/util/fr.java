package com.amap.api.mapcore.util;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

public class fr extends View {
   private Paint c = new Paint();
   public static final int a = Color.argb(255, 235, 235, 235);
   public static final int b = Color.argb(255, 21, 21, 21);

   public fr(Context var1) {
      super(var1);
      this.c.setAntiAlias(true);
      this.c.setColor(a);
   }

   public void a(int var1) {
      if (this.c != null) {
         this.c.setColor(var1);
      }

   }

   protected void onDraw(Canvas var1) {
      var1.drawRect(0.0F, 0.0F, (float)this.getWidth(), (float)this.getHeight(), this.c);
   }

   public void a(boolean var1) {
      if (var1) {
         this.setVisibility(0);
      } else {
         this.setVisibility(8);
      }

   }
}
