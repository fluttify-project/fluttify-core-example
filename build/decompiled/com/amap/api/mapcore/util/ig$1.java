package com.amap.api.mapcore.util;

import android.content.Context;
import java.util.Iterator;
import java.util.List;

final class ig$1 implements Runnable {
   ig$1(Context var1, String var2, String var3) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
   }

   public void run() {
      try {
         hy var1 = new hy(this.a, ii.a());
         List var2 = var1.b(ij.a(this.b), ij.class);
         if (var2 != null && var2.size() > 0) {
            Iterator var3 = var2.iterator();

            while(var3.hasNext()) {
               ij var4 = (ij)var3.next();
               String var5 = var4.d();
               if (!this.c.equalsIgnoreCase(var5)) {
                  String var6 = var4.a();
                  ig.b(this.a, var1, var6);
               }
            }
         }
      } catch (Throwable var7) {
         in.a(var7, "FileManager", "clearUnSuitableV");
      }

   }
}
