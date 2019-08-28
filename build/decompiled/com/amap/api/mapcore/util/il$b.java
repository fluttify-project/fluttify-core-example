package com.amap.api.mapcore.util;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

final class il$b implements ThreadFactory {
   private final AtomicInteger a = new AtomicInteger(1);

   il$b() {
   }

   public Thread newThread(Runnable var1) {
      return new Thread(var1, "amapD#" + this.a.getAndIncrement());
   }
}
