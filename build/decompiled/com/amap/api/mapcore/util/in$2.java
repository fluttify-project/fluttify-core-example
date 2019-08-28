package com.amap.api.mapcore.util;

import android.content.Context;

final class in$2 implements Runnable {
   in$2(Context var1, hf var2) {
      this.a = var1;
      this.b = var2;
   }

   public void run() {
      try {
         ig.a(this.a, this.b);
      } catch (Throwable var2) {
         ;
      }

   }
}
