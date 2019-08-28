package com.amap.api.mapcore.util;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

class ei$d implements Executor {
   final ArrayDeque<Runnable> a;
   Runnable b;

   private ei$d() {
      this.a = new ArrayDeque();
   }

   public synchronized void execute(Runnable var1) {
      this.a.offer(new ei$d$1(this, var1));
      if (this.b == null) {
         this.a();
      }

   }

   protected synchronized void a() {
      if ((this.b = (Runnable)this.a.poll()) != null) {
         ei.a.execute(this.b);
      }

   }
}
