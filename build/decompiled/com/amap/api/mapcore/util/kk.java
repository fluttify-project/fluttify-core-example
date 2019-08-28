package com.amap.api.mapcore.util;

public abstract class kk implements Runnable {
   kk$a d;

   public kk() {
   }

   public final void run() {
      try {
         if (this.d != null) {
            this.d.a(this);
         }

         if (Thread.interrupted()) {
            return;
         }

         this.runTask();
         if (Thread.interrupted()) {
            return;
         }

         if (this.d != null) {
            this.d.b(this);
         }
      } catch (Throwable var2) {
         ht.c(var2, "ThreadTask", "run");
         var2.printStackTrace();
      }

   }

   public abstract void runTask();

   public final void cancelTask() {
      try {
         if (this.d != null) {
            this.d.c(this);
         }
      } catch (Throwable var2) {
         ht.c(var2, "ThreadTask", "cancelTask");
         var2.printStackTrace();
      }

   }
}
