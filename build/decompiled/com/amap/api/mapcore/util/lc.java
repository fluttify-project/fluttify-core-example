package com.amap.api.mapcore.util;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

public final class lc {
   public lc() {
   }

   public final void a(hf var1) {
      Map var2 = Thread.getAllStackTraces();
      Iterator var6 = var2.keySet().iterator();
      ArrayList var3 = new ArrayList();

      while(var6.hasNext()) {
         Thread var4;
         String var5;
         String var8;
         if (!TextUtils.isEmpty(var5 = a(var4 = (Thread)var6.next())) && !TextUtils.isEmpty(var8 = a(var4.getStackTrace()))) {
            lc$a var9 = new lc$a(var5, var8);
            var3.add(var9);
         }
      }

      String var7;
      if (!TextUtils.isEmpty(var7 = lc$a.a(var3))) {
         ht.b(var1, var7, "SO_CRASH_CLS_NAME", "SO_CRASH_MHD_NAME");
      }
   }

   public static String a(Thread var0) {
      return var0 == null ? null : var0.getId() + " , " + var0.getName() + " , " + var0.getThreadGroup() + " , " + var0.getState();
   }

   private static String a(StackTraceElement[] var0) {
      if (var0 == null) {
         return "";
      } else {
         StringBuffer var1 = new StringBuffer();
         int var2 = (var0 = var0).length;

         for(int var3 = 0; var3 < var2; ++var3) {
            StackTraceElement var4 = var0[var3];
            var1.append(var4);
            var1.append("<br />");
         }

         return var1.toString();
      }
   }
}
