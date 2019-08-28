package com.amap.api.mapcore.util;

import android.content.Context;
import android.text.TextUtils;
import java.io.File;
import java.net.URLEncoder;

public class lh {
   private String a;

   public static boolean a(Context var0) {
      String var1 = "android.permission.WRITE_EXTERNAL_STORAGE";
      return (var0 = var0) != null && !TextUtils.isEmpty(var1) ? hg.a(var0, var1) : false;
   }

   public lh() {
   }

   public String a() {
      return this.a;
   }

   public lh a(String var1) {
      this.a = var1;
      return this;
   }

   public lh a(File var1) {
      if (var1 == null) {
         return this;
      } else {
         this.a = var1.getAbsolutePath();
         return this;
      }
   }

   public lh b(String var1) {
      this.a = this.a + File.separator + URLEncoder.encode(var1);
      return this;
   }
}
