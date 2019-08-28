package com.amap.api.mapcore.util;

import android.content.Context;
import java.lang.Thread.UncaughtExceptionHandler;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ht extends hq implements UncaughtExceptionHandler {
   private Context d;
   private static ExecutorService e;
   private static Set<Integer> f = Collections.synchronizedSet(new HashSet());
   private static WeakReference<Context> g;
   private static final ThreadFactory h = new ht$2();
   private List<ht$a> i;

   public static void a(Context var0) {
      try {
         if (var0 == null) {
            return;
         }

         g = new WeakReference(var0.getApplicationContext());
      } catch (Throwable var2) {
         ;
      }

   }

   public static synchronized ht a(Context var0, hf var1) throws gt {
      if (var1 == null) {
         throw new gt("sdk info is null");
      } else if (var1.a() != null && !"".equals(var1.a())) {
         try {
            hv var2 = new hv();
            var2.a(var0);
            if (!f.add(var1.hashCode())) {
               return (ht)hq.a;
            }

            if (hq.a == null) {
               hq.a = new ht(var0, var1);
            } else {
               hq.a.c = false;
            }

            hq.a.a(var0, var1, hq.a.c);
         } catch (Throwable var3) {
            var3.printStackTrace();
         }

         return (ht)hq.a;
      } else {
         throw new gt("sdk name is invalid");
      }
   }

   public static synchronized void b() {
      try {
         if (e != null) {
            e.shutdown();
         }

         iy.a();
      } catch (Throwable var2) {
         var2.printStackTrace();
      }

      try {
         if (hq.a != null && Thread.getDefaultUncaughtExceptionHandler() == hq.a && hq.a.b != null) {
            Thread.setDefaultUncaughtExceptionHandler(hq.a.b);
         }

         hq.a = null;
      } catch (Throwable var1) {
         var1.printStackTrace();
      }

   }

   protected void a(hf var1, String var2, String var3) {
      hu.b(var1, this.d, var3, var2);
   }

   protected void a(Throwable var1, int var2, String var3, String var4) {
      hu.a(this.d, var1, var2, var3, var4);
   }

   public void a(hf var1, String var2, String var3, String var4) {
      hu.a(this.d, var1, var2, 0, var3, var4);
   }

   public static void b(hf var0, String var1, String var2, String var3) {
      try {
         if (hq.a != null) {
            hq.a.a(var0, var1, var2, var3);
         }
      } catch (Throwable var5) {
         ;
      }

   }

   protected void a() {
      hr.b(this.d);
   }

   public void uncaughtException(Thread var1, Throwable var2) {
      this.a(var1, var2);
      if (var2 != null) {
         this.a(var2, 0, (String)null, (String)null);
         if (this.b != null) {
            try {
               Thread.setDefaultUncaughtExceptionHandler(this.b);
            } catch (Throwable var4) {
               ;
            }

            this.b.uncaughtException(var1, var2);
         }

      }
   }

   protected void a(Context var1, hf var2, boolean var3) {
      try {
         ExecutorService var4 = d();
         if (var4 == null || var4.isShutdown()) {
            return;
         }

         var4.submit(new ht$1(this, var1, var2, var3));
      } catch (RejectedExecutionException var5) {
         return;
      } catch (Throwable var6) {
         var6.printStackTrace();
      }

   }

   public void b(Throwable var1, String var2, String var3) {
      try {
         if (var1 == null) {
            return;
         }

         this.a(var1, 1, var2, var3);
      } catch (Throwable var5) {
         var5.printStackTrace();
      }

   }

   private ht(Context var1, hf var2) {
      this.d = var1;
      this.f();
   }

   private void f() {
      try {
         this.b = Thread.getDefaultUncaughtExceptionHandler();
         if (this.b == null) {
            Thread.setDefaultUncaughtExceptionHandler(this);
            this.c = true;
         } else {
            String var1 = this.b.toString();
            boolean var2 = var1.startsWith("com.amap.apis.utils.core.dynamiccore");
            if (var2 || var1.indexOf("com.amap.api") == -1 && var1.indexOf("com.loc") == -1) {
               Thread.setDefaultUncaughtExceptionHandler(this);
               this.c = true;
            } else {
               this.c = false;
            }
         }
      } catch (Throwable var3) {
         var3.printStackTrace();
      }

   }

   public static void c() {
      if (g != null && g.get() != null) {
         hr.b((Context)g.get());
      } else {
         if (hq.a != null) {
            hq.a.a();
         }

      }
   }

   public static void c(Throwable var0, String var1, String var2) {
      try {
         if (hq.a != null) {
            hq.a.a(var0, 1, var1, var2);
         }
      } catch (Throwable var4) {
         ;
      }

   }

   public static void a(hf var0, String var1, String var2, String var3, String var4) {
      try {
         if (hq.a != null) {
            StringBuilder var5 = new StringBuilder("path:");
            var5.append(var1).append(",type:").append(var2).append(",gsid:").append(var3).append(",code:").append(var4);
            hq.a.a(var0, var5.toString(), "networkError");
         }
      } catch (Throwable var6) {
         ;
      }

   }

   public static void b(hf var0, String var1, String var2) {
      try {
         if (hq.a != null) {
            hq.a.a(var0, var1, var2);
         }
      } catch (Throwable var4) {
         ;
      }

   }

   public static void a(hf var0, String var1, gt var2) {
      if (var2 != null) {
         a(var0, var1, var2.c(), var2.d(), var2.b());
      }

   }

   public static synchronized ExecutorService d() {
      try {
         if (e == null || e.isShutdown()) {
            e = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(256), h);
         }
      } catch (Throwable var1) {
         var1.printStackTrace();
      }

      return e;
   }

   /** @deprecated */
   public static synchronized ht e() {
      return (ht)hq.a;
   }

   private void a(Thread var1, Throwable var2) {
      try {
         for(int var3 = 0; var3 < this.i.size() && var3 < 10; ++var3) {
            ht$a var4 = (ht$a)this.i.get(var3);
            if (var4 != null) {
               var4.a(var1, var2);
            }
         }
      } catch (Throwable var5) {
         ;
      }

   }
}
