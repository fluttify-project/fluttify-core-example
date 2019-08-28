package com.amap.api.mapcore.util;

import android.text.TextUtils;

public class eb {
   int a;
   int[] b;
   int c;
   int d;
   String e;
   String f;
   String g;

   public eb(int var1, int[] var2, String var3, String var4, String var5) {
      this.a = var1;
      this.b = var2;
      this.e = var3;
      this.f = var4;
      this.g = var5;
      if (TextUtils.isEmpty(var3)) {
         var3 = var4;
      }

      this.c = -1000;
      if ("regions".equals(var3)) {
         this.c = 1001;
      } else if ("water".equals(var3)) {
         this.c = 1002;
      } else if ("buildings".equals(var3)) {
         this.c = 1003;
      } else if ("roads".equals(var3)) {
         this.c = 1004;
      } else if ("labels".equals(var3)) {
         this.c = 1005;
      } else if ("borders".equals(var3)) {
         this.c = 1006;
      }

      this.d = var1 * 1000 + var2.hashCode();
   }
}
