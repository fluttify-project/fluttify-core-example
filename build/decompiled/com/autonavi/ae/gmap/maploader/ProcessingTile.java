package com.autonavi.ae.gmap.maploader;

public class ProcessingTile {
   private static final Pools$SynchronizedPool<ProcessingTile> M_POOL = new Pools$SynchronizedPool(30);
   public String mKeyName;
   public long mCreateTime = 0L;

   public static ProcessingTile obtain(String var0) {
      ProcessingTile var1 = (ProcessingTile)M_POOL.acquire();
      if (var1 != null) {
         var1.setParams(var0);
      } else {
         var1 = new ProcessingTile(var0);
      }

      return var1;
   }

   public void recycle() {
      this.mKeyName = null;
      this.mCreateTime = 0L;
      M_POOL.release(this);
   }

   public ProcessingTile(String var1) {
      this.setParams(var1);
   }

   private void setParams(String var1) {
      this.mKeyName = var1;
      this.mCreateTime = System.currentTimeMillis() / 1000L;
   }
}
