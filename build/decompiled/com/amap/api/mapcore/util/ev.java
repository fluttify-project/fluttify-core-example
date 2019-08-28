package com.amap.api.mapcore.util;

import android.text.TextUtils;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public class ev implements ThreadFactory {
   private static final AtomicInteger a = new AtomicInteger(1);
   private final AtomicInteger b;
   private final String c;
   private final boolean d;
   private final ThreadGroup e;

   public ev() {
      this("amap-threadpool-" + a.getAndIncrement(), false);
   }

   public ev(String var1) {
      this(var1, false);
   }

   public ev(String var1, boolean var2) {
      this.b = new AtomicInteger(1);
      this.c = TextUtils.isEmpty(var1) ? "" : var1 + "-thread-";
      this.d = var2;
      SecurityManager var3 = System.getSecurityManager();
      this.e = var3 == null ? Thread.currentThread().getThreadGroup() : var3.getThreadGroup();
   }

   public Thread newThread(Runnable var1) {
      String var2 = this.c + this.b.getAndIncrement();
      Thread var3 = new Thread(this.e, var1, var2, 0L);
      var3.setDaemon(this.d);
      return var3;
   }
}
