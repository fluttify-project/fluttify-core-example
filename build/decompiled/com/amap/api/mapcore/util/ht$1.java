package com.amap.api.mapcore.util;

import android.content.Context;
import android.os.Looper;

class ht$1 implements Runnable {
   ht$1(ht var1, Context var2, hf var3, boolean var4) {
      this.d = var1;
      this.a = var2;
      this.b = var3;
      this.c = var4;
   }

   public void run() {
      try {
         synchronized(Looper.getMainLooper()) {
            id var2 = new id(this.a, true);
            var2.a(this.b);
         }

         if (this.c) {
            hu.a(ht.a(this.d));
         }
      } catch (Throwable var5) {
         var5.printStackTrace();
      }

   }
}
