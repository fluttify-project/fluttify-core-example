package com.amap.api.mapcore.util;

import android.os.HandlerThread;

final class lz$a extends HandlerThread {
   public lz$a(lz var1, String var2) {
      super(var2);
      this.a = var1;
   }

   protected final void onLooperPrepared() {
      try {
         super.onLooperPrepared();
         synchronized(lz.a(this.a)) {
            if (!lz.b(this.a)) {
               lz.c(this.a);
            }

         }
      } catch (Throwable var4) {
         ;
      }
   }

   public final void run() {
      try {
         super.run();
      } catch (Throwable var2) {
         try {
            this.a.c.listen(this.a.g, 0);
            this.a.g = null;
            this.quit();
         } catch (Throwable var1) {
            ;
         }
      }
   }
}
