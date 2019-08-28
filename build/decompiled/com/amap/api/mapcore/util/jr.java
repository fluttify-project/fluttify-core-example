package com.amap.api.mapcore.util;

import android.content.Context;
import java.lang.ref.WeakReference;

public class jr {
   static int a = 1000;
   static boolean b = false;
   private static WeakReference<jn> d;
   static int c = 20;
   private static int e = 10;

   public jr() {
   }

   /** @deprecated */
   @Deprecated
   public static synchronized void a(int var0, boolean var1) {
      a = var0;
      b = var1;
   }

   public static synchronized void a(jq var0, Context var1) {
      ht.d().submit(new jr$1(var1, var0));
   }

   public static void a(Context var0) {
      ht.d().submit(new jr$2(var0));
   }
}
