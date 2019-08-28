package com.amap.api.mapcore.util;

import android.content.Context;
import android.text.TextUtils;
import java.lang.reflect.Method;
import java.util.Map;

final class gz$1 implements Runnable {
   gz$1(Class var1, Context var2) {
      this.a = var1;
      this.b = var2;
   }

   public void run() {
      try {
         Method var1 = this.a.getMethod("getGetParams");
         Map var2 = (Map)var1.invoke(this.a);
         if (var2 == null) {
            return;
         }

         Method var3 = this.a.getMethod("getPostParam", String.class, String.class, String.class, String.class);
         String var4 = (String)var3.invoke(this.a, gz.h(this.b), gz.v(this.b), gz.m(this.b), gz.x(this.b));
         if (TextUtils.isEmpty(var4)) {
            return;
         }

         byte[] var5 = jd.a().a(new jc(var4.getBytes(), var2));
         Method var6 = this.a.getMethod("parseResult", Context.class, String.class);
         var6.invoke(this.a, this.b, new String(var5));
      } catch (Throwable var7) {
         ;
      }

   }
}
