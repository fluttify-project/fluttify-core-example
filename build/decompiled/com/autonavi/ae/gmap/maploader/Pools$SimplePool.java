package com.autonavi.ae.gmap.maploader;

public class Pools$SimplePool<T> implements Pools$Pool<T> {
   private final Object[] mPool;
   private int mPoolSize;

   public Pools$SimplePool(int var1) {
      if (var1 <= 0) {
         throw new IllegalArgumentException("The max pool size must be > 0");
      } else {
         this.mPool = new Object[var1];
      }
   }

   public T acquire() {
      if (this.mPoolSize > 0) {
         int var1 = this.mPoolSize - 1;
         Object var2 = this.mPool[var1];
         this.mPool[var1] = null;
         --this.mPoolSize;
         return var2;
      } else {
         return null;
      }
   }

   public boolean release(T var1) {
      if (this.isInPool(var1)) {
         throw new IllegalStateException("Already in the pool!");
      } else if (this.mPoolSize < this.mPool.length) {
         this.mPool[this.mPoolSize] = var1;
         ++this.mPoolSize;
         return true;
      } else {
         return false;
      }
   }

   public void destory() {
      for(int var1 = 0; var1 < this.mPool.length; ++var1) {
         this.mPool[var1] = null;
      }

   }

   private boolean isInPool(T var1) {
      for(int var2 = 0; var2 < this.mPoolSize; ++var2) {
         if (this.mPool[var2] == var1) {
            return true;
         }
      }

      return false;
   }
}
