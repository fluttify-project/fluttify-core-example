package com.autonavi.ae.gmap.maploader;

public class Pools$SynchronizedPool<T> extends Pools$SimplePool<T> {
   private final Object mLock = new Object();

   public Pools$SynchronizedPool(int var1) {
      super(var1);
   }

   public T acquire() {
      Object var1 = this.mLock;
      synchronized(this.mLock) {
         return super.acquire();
      }
   }

   public boolean release(T var1) {
      Object var2 = this.mLock;
      synchronized(this.mLock) {
         return super.release(var1);
      }
   }
}
