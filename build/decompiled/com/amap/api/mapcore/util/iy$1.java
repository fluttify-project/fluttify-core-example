package com.amap.api.mapcore.util;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

final class iy$1 implements ThreadFactory {
   private final AtomicInteger a = new AtomicInteger(1);

   iy$1() {
   }

   public Thread newThread(Runnable var1) {
      return new Thread(var1, "disklrucache#" + this.a.getAndIncrement());
   }
}
