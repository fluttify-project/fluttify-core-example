package com.amap.api.mapcore.util;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.lang.ref.WeakReference;

public class i extends Thread {
   private WeakReference<Context> a = null;
   private u b;
   private static int c = 0;
   private static int d = 3;
   private static long e = 30000L;
   private i$a f = null;
   private static boolean g = false;
   private Handler h = new i$1(this, Looper.getMainLooper());

   public i(Context var1, u var2) {
      if (var1 != null) {
         this.a = new WeakReference(var1);
      }

      this.b = var2;
      a();
   }

   public static void a() {
      c = 0;
      g = false;
   }

   public void run() {
      try {
         this.f();
      } catch (Throwable var2) {
         ht.c(var2, "AMapDelegateImpGLSurfaceView", "mVerfy");
         var2.printStackTrace();
      }

   }

   private void f() {
      if (!g) {
         for(int var1 = 0; var1 <= d; ++var1) {
            this.h.sendEmptyMessageDelayed(0, (long)(var1 + 1) * e);
         }
      }

   }

   public void interrupt() {
      this.b = null;
      this.a = null;
      if (this.h != null) {
         this.h.removeCallbacksAndMessages((Object)null);
      }

      this.h = null;
      this.f = null;
      a();
      super.interrupt();
   }
}
