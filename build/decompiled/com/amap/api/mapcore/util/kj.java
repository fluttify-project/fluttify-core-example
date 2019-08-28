package com.amap.api.mapcore.util;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class kj {
   private static kj a = null;
   private ExecutorService b;
   private ConcurrentHashMap<kk, Future<?>> c = new ConcurrentHashMap();
   private kk$a d = new kj$1(this);

   public static synchronized kj a(int var0) {
      if (a == null) {
         a = new kj(var0);
      }

      return a;
   }

   public static kj b(int var0) {
      return new kj(var0);
   }

   private kj(int var1) {
      try {
         this.b = new ThreadPoolExecutor(var1, var1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(256));
      } catch (Throwable var3) {
         ht.c(var3, "TPool", "ThreadPool");
         var3.printStackTrace();
      }

   }

   public void a(kk var1) throws gt {
      try {
         if (!this.b(var1)) {
            if (this.b != null && !this.b.isShutdown()) {
               var1.d = this.d;
               Future var2 = null;

               try {
                  var2 = this.b.submit(var1);
               } catch (RejectedExecutionException var4) {
                  return;
               }

               if (var2 != null) {
                  this.a(var1, var2);
               }
            }
         }
      } catch (Throwable var5) {
         var5.printStackTrace();
         ht.c(var5, "TPool", "addTask");
         throw new gt("thread pool has exception");
      }
   }

   public static synchronized void a() {
      try {
         if (a != null) {
            a.b();
            a = null;
         }
      } catch (Throwable var1) {
         ht.c(var1, "TPool", "onDestroy");
         var1.printStackTrace();
      }

   }

   private void b() {
      try {
         Iterator var1 = this.c.entrySet().iterator();

         while(var1.hasNext()) {
            Entry var2 = (Entry)var1.next();
            kk var3 = (kk)var2.getKey();
            Future var4 = (Future)this.c.get(var3);

            try {
               if (var4 != null) {
                  var4.cancel(true);
               }
            } catch (Exception var6) {
               var6.printStackTrace();
            }
         }

         this.c.clear();
         this.b.shutdown();
      } catch (Throwable var7) {
         ht.c(var7, "TPool", "destroy");
         var7.printStackTrace();
      }

   }

   private synchronized boolean b(kk var1) {
      boolean var2 = false;

      try {
         var2 = this.c.containsKey(var1);
      } catch (Throwable var4) {
         ht.c(var4, "TPool", "contain");
         var4.printStackTrace();
      }

      return var2;
   }

   private synchronized void a(kk var1, Future<?> var2) {
      try {
         this.c.put(var1, var2);
      } catch (Throwable var4) {
         ht.c(var4, "TPool", "addQueue");
         var4.printStackTrace();
      }

   }

   private synchronized void a(kk var1, boolean var2) {
      try {
         Future var3 = (Future)this.c.remove(var1);
         if (var2 && var3 != null) {
            var3.cancel(true);
         }
      } catch (Throwable var4) {
         ht.c(var4, "TPool", "removeQueue");
         var4.printStackTrace();
      }

   }
}
