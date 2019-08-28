package com.amap.api.mapcore.util;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

final class ei$1 implements ThreadFactory {
   private final AtomicInteger a = new AtomicInteger(1);

   ei$1() {
   }

   public Thread newThread(Runnable var1) {
      return new Thread(var1, "AbstractAsyncTask #" + this.a.getAndIncrement());
   }
}
