package com.amap.api.mapcore.util;

import android.os.Looper;
import android.os.Message;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ThreadPoolExecutor.AbortPolicy;
import java.util.concurrent.ThreadPoolExecutor.DiscardOldestPolicy;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class ei<Params, Progress, Result> {
   private static final ThreadFactory d = new ei$1();
   private static final BlockingQueue<Runnable> e = new LinkedBlockingQueue(10);
   public static final Executor a;
   public static final Executor b;
   public static final Executor c;
   private static final ei$c f;
   private static volatile Executor g;
   private final ei$a<Params, Result> h;
   private final FutureTask<Result> i;
   private volatile ei$e j;
   private final AtomicBoolean k;
   private final AtomicBoolean l;

   public ei() {
      this.j = ei$e.a;
      this.k = new AtomicBoolean();
      this.l = new AtomicBoolean();
      this.h = new ei$2(this);
      this.i = new ei$3(this, this.h);
   }

   private void c(Result var1) {
      boolean var2 = this.l.get();
      if (!var2) {
         this.d(var1);
      }

   }

   private Result d(Result var1) {
      Message var2 = f.obtainMessage(1, new ei$b(this, new Object[]{var1}));
      var2.sendToTarget();
      return var1;
   }

   public final ei$e a() {
      return this.j;
   }

   protected abstract Result a(Params... var1);

   protected void b() {
   }

   protected void a(Result var1) {
   }

   protected void b(Progress... var1) {
   }

   protected void b(Result var1) {
      this.c();
   }

   protected void c() {
   }

   public final boolean d() {
      return this.k.get();
   }

   public final boolean a(boolean var1) {
      this.k.set(true);
      return this.i.cancel(var1);
   }

   public final ei<Params, Progress, Result> c(Params... var1) {
      return this.a(g, var1);
   }

   public final ei<Params, Progress, Result> a(Executor var1, Params... var2) {
      if (this.j != ei$e.a) {
         switch(ei$4.a[this.j.ordinal()]) {
         case 1:
            throw new IllegalStateException("Cannot execute task: the task is already running.");
         case 2:
            throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
         }
      }

      this.j = ei$e.b;
      this.b();
      this.h.b = var2;
      var1.execute(this.i);
      return this;
   }

   private void e(Result var1) {
      if (this.d()) {
         this.b(var1);
      } else {
         this.a(var1);
      }

      this.j = ei$e.c;
   }

   static {
      a = new ThreadPoolExecutor(5, 128, 1L, TimeUnit.SECONDS, e, d, new DiscardOldestPolicy());
      b = (Executor)(fi.c() ? new ei$d((ei$1)null) : new ThreadPoolExecutor(1, 2, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ev("AMapSERIAL_EXECUTOR"), new AbortPolicy()));
      c = new ThreadPoolExecutor(2, 2, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ev("AMapDUAL_THREAD_EXECUTOR"), new AbortPolicy());
      f = new ei$c(Looper.getMainLooper());
      g = b;
   }
}
