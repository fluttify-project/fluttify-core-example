package com.amap.api.mapcore.util;

import android.content.Context;
import java.io.File;
import java.io.FileOutputStream;

final class gu$1 implements Runnable {
   gu$1(Context var1, String var2) {
      this.a = var1;
      this.b = var2;
   }

   public void run() {
      FileOutputStream var1 = null;

      try {
         String var2 = hr.c(this.a, "k.store");
         File var3 = new File(var2);
         if (!var3.getParentFile().exists()) {
            var3.getParentFile().mkdirs();
         }

         var1 = new FileOutputStream(var3);
         byte[] var4 = hg.a(this.b);
         var1.write(var4);
      } catch (Throwable var14) {
         hq.a(var14, "AI", "stf");
      } finally {
         if (var1 != null) {
            try {
               var1.close();
            } catch (Throwable var13) {
               var13.printStackTrace();
            }
         }

      }

   }
}
