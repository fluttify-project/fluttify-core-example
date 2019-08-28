package com.amap.api.mapcore.util;

import android.content.Context;
import android.text.TextUtils;

public class kg extends kh {
   private int b;
   private long c;
   private String d;
   private Context e;

   public kg(Context var1, int var2, String var3, kh var4) {
      super(var4);
      this.b = var2;
      this.d = var3;
      this.e = var1;
   }

   protected boolean a() {
      if (this.c == 0L) {
         this.c = this.a(this.d);
      }

      long var1 = System.currentTimeMillis();
      return var1 - this.c >= (long)this.b;
   }

   public void a(boolean var1) {
      super.a(var1);
      if (var1) {
         this.a(this.d, System.currentTimeMillis());
      }

   }

   private void a(String var1, long var2) {
      this.c = var2;
      hr.a(this.e, var1, String.valueOf(var2));
   }

   private long a(String var1) {
      String var2 = hr.a(this.e, var1);
      if (TextUtils.isEmpty(var2)) {
         return 0L;
      } else {
         long var3 = Long.parseLong(var2);
         return var3;
      }
   }
}
