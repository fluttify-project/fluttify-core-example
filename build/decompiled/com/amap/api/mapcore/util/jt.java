package com.amap.api.mapcore.util;

import android.content.Context;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.Random;

public class jt {
   private static WeakReference<jn> a;

   public jt() {
   }

   public static synchronized void a(js var0, Context var1) {
      ht.d().submit(new jt$1(var1, var0));
   }

   private static void b(Context var0, byte[] var1) throws IOException {
      jn var2 = ju.a(a);
      ju.a(var0, var2, hr.h, 1000, 307200, "2");
      if (var2.e == null) {
         var2.e = new hm();
      }

      Random var3 = new Random();
      String var4 = Integer.toString(var3.nextInt(100)) + Long.toString(System.nanoTime());

      try {
         jo.a(var4, var1, var2);
      } catch (Throwable var6) {
         ht.c(var6, "stm", "wts");
      }

   }

   public static void a(Context var0) {
      ht.d().submit(new jt$2(var0));
   }
}
