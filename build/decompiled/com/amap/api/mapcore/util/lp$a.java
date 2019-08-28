package com.amap.api.mapcore.util;

import android.os.HandlerThread;

final class lp$a extends HandlerThread {
   lp a;

   public lp$a(String var1, lp var2) {
      super(var1);
      this.a = var2;
   }

   protected final void onLooperPrepared() {
      try {
         this.a.h = new lt(this.a.a, this.a.d);
         super.onLooperPrepared();
      } catch (Throwable var1) {
         ;
      }
   }

   public final void run() {
      try {
         super.run();
      } catch (Throwable var1) {
         ;
      }
   }
}
