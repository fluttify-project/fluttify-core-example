package com.amap.api.mapcore.util;

import android.content.Context;

final class in$1 implements Runnable {
   in$1(Context var1, hy var2, hf var3, String var4, String var5) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = var4;
      this.e = var5;
   }

   public void run() {
      try {
         ig.a(this.a, this.b, this.c, this.d, this.e);
         ig.a(this.a, this.c);
      } catch (Throwable var2) {
         in.a(var2, "dDownLoad", "processDownloadedFile()");
      }

   }
}
