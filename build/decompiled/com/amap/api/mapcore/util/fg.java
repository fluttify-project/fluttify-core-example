package com.amap.api.mapcore.util;

import android.content.Context;

public class fg {
   public static void a(Context var0, boolean var1) {
      try {
         String var2 = a(var1);
         js var3 = new js(var0, "3dmap", "6.9.2", "O001");
         var3.a(var2);
         jt.a(var3, var0);
      } catch (Throwable var4) {
         var4.printStackTrace();
      }

   }

   private static String a(boolean var0) {
      try {
         StringBuilder var1 = new StringBuilder();
         var1.append("{\"Quest\":").append(var0).append("}");
         return var1.toString();
      } catch (Throwable var2) {
         var2.printStackTrace();
         return null;
      }
   }
}
