package com.amap.api.mapcore.util;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ThreadPoolExecutor.AbortPolicy;

public class fh {
   private BlockingQueue<Runnable> a = new LinkedBlockingQueue();
   private ExecutorService b = null;
   private static volatile fh c;

   public static fh a() {
      if (c == null) {
         Class var0 = fh.class;
         synchronized(fh.class) {
            if (c == null) {
               c = new fh();
            }
         }
      }

      return c;
   }

   public static void b() {
      if (c != null) {
         try {
            c.b.shutdownNow();
         } catch (Throwable var1) {
            var1.printStackTrace();
         }

         c.b = null;
         c = null;
      }

   }

   private fh() {
      int var1 = Runtime.getRuntime().availableProcessors();
      byte var2 = 1;
      TimeUnit var3 = TimeUnit.SECONDS;
      this.b = new ThreadPoolExecutor(var1, var1 * 2, (long)var2, var3, this.a, new ev("AMapThreadUtil"), new AbortPolicy());
   }

   public void a(Runnable var1) {
      if (this.b != null) {
         try {
            this.b.execute(var1);
         } catch (Throwable var3) {
            var3.printStackTrace();
         }
      }

   }
}
