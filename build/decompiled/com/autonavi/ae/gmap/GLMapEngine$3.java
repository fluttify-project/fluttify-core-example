package com.autonavi.ae.gmap;

import com.amap.api.maps.AMap$CancelableCallback;

class GLMapEngine$3 implements Runnable {
   GLMapEngine$3(GLMapEngine var1, AMap$CancelableCallback var2) {
      this.this$0 = var1;
      this.val$cancelableCallback = var2;
   }

   public void run() {
      try {
         this.val$cancelableCallback.onFinish();
      } catch (Throwable var2) {
         var2.printStackTrace();
      }

   }
}
