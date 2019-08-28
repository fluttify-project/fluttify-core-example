package com.autonavi.amap.mapcore;

public class AbstractNativeInstance {
   protected long nativeInstance = 0L;

   public AbstractNativeInstance() {
   }

   public final long getNativeInstance() {
      return this.nativeInstance;
   }

   protected void finalize() throws Throwable {
      super.finalize();
   }

   public void createNativeInstace() {
   }
}
