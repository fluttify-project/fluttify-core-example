package com.amap.api.mapcore.util;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

final class ht$2 implements ThreadFactory {
   private final AtomicInteger a = new AtomicInteger(1);

   ht$2() {
   }

   public Thread newThread(Runnable var1) {
      return new Thread(var1, "pama#" + this.a.getAndIncrement());
   }
}
