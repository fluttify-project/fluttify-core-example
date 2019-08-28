package com.amap.api.mapcore.util;

import android.content.Context;
import android.util.Log;

public class ek {
   static String a;

   public static void a() {
      String var0 = "自6.6.0开始使用新版样式，旧版样式无法在新版接口setCustomMapStyle(CustomMapStyleOptions options)中使用，请到官网(lbs.amap.com)更新新版样式文件";
      b(a);
      b(var0);
      b(a);
   }

   public static void a(Context var0) {
      String var1 = "鉴权失败，当前key没有自定义纹理和在线拉去样式的使用权限，自定义纹理和在线拉去样式相关内容，将不会呈现！";
      b(a);
      if (var0 != null) {
         a("key:" + gu.f(var0));
      }

      b(var1);
      b(a);
   }

   static void a(String var0) {
      byte var1 = 78;
      if (var0.length() < var1) {
         StringBuilder var2 = new StringBuilder();
         var2.append("|").append(var0);

         for(int var3 = 0; var3 < var1 - var0.length(); ++var3) {
            var2.append(" ");
         }

         var2.append("|");
         b(var2.toString());
      } else {
         String var4 = var0.substring(0, 78);
         b("|" + var4 + "|");
         a(var0.substring(78));
      }

   }

   private static void b(String var0) {
      Log.i("authErrLog", var0);
   }

   static {
      StringBuilder var0 = new StringBuilder();

      for(int var1 = 0; var1 < 80; ++var1) {
         var0.append("=");
      }

      a = var0.toString();
   }
}
