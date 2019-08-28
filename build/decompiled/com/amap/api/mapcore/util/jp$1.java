package com.amap.api.mapcore.util;

import android.content.Context;

final class jp$1 implements Runnable {
   jp$1(String var1, Context var2) {
      this.a = var1;
      this.b = var2;
   }

   public void run() {
      Class var1 = jp.class;
      synchronized(jp.class) {
         try {
            byte[] var2 = hg.a(this.a);
            String var3 = hc.a(var2);
            jn var4 = ju.a(jp.a);
            ju.a(this.b, var4, hr.j, 50, 102400, "10");
            if (var4.e == null) {
               var4.e = new hj(new hn(new hl()));
            }

            String var5 = hg.a(System.currentTimeMillis(), "yyyyMMdd HH:mm:ss");
            String var6 = " \"timestamp\":\"" + var5 + "\",\"details\":" + this.a;
            jo.a(var3, hg.a(var6), var4);
         } catch (Throwable var8) {
            ht.c(var8, "mam", "ap");
         }

      }
   }
}
