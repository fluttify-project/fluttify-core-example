package com.autonavi.ae.gmap;

import com.amap.api.maps.AMap$CancelableCallback;

class GLMapEngine$2 implements Runnable {
   GLMapEngine$2(GLMapEngine var1, AMap$CancelableCallback var2) {
      this.this$0 = var1;
      this.val$cancelableCallback = var2;
   }

   public void run() {
      try {
         this.val$cancelableCallback.onCancel();
      } catch (Throwable var2) {
         var2.printStackTrace();
      }

   }
}
