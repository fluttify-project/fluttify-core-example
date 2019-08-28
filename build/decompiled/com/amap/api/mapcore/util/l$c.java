package com.amap.api.mapcore.util;

import android.text.TextUtils;

class l$c {
   protected String a;
   protected String b;

   public l$c(String var1, String var2) {
      this.a = var1;
      this.b = var2;
   }

   public String a() {
      return this.a;
   }

   public String b() {
      return this.b;
   }

   public boolean c() {
      return !TextUtils.isEmpty(this.a) && !TextUtils.isEmpty(this.b);
   }
}
