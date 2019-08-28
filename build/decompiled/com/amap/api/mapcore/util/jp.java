package com.amap.api.mapcore.util;

import android.content.Context;
import android.text.TextUtils;
import java.lang.ref.WeakReference;

public class jp {
   static WeakReference<jn> a;

   public jp() {
   }

   public static void a(String var0, Context var1) {
      ht.d().submit(new jp$1(var0, var1));
   }

   public static void a(Context var0) {
      ht.d().submit(new jp$2(var0));
   }

   private static String c(Context var0) {
      String var1 = "";
      var1 = gz.v(var0);
      if (!TextUtils.isEmpty(var1)) {
         return var1;
      } else {
         var1 = gz.h(var0);
         if (!TextUtils.isEmpty(var1)) {
            return var1;
         } else {
            var1 = gz.m(var0);
            if (!TextUtils.isEmpty(var1)) {
               return var1;
            } else {
               var1 = gz.b(var0);
               return var1;
            }
         }
      }
   }
}
