package com.amap.api.mapcore.util;

import android.content.Context;
import java.util.concurrent.RejectedExecutionException;

final class hr$1 implements Runnable {
   hr$1(Context var1) {
      this.a = var1;
   }

   public void run() {
      try {
         jp.a(this.a);
         hu.b(this.a);
         hu.d(this.a);
         hu.c(this.a);
         jt.a(this.a);
         jr.a(this.a);
      } catch (RejectedExecutionException var2) {
         return;
      } catch (Throwable var3) {
         ht.c(var3, "Lg", "proL");
      }

   }
}
