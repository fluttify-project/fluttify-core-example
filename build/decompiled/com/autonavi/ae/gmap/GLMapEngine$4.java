package com.autonavi.ae.gmap;

class GLMapEngine$4 implements Runnable {
   GLMapEngine$4(GLMapEngine var1, boolean var2) {
      this.this$0 = var1;
      this.val$isConnected = var2;
   }

   public void run() {
      GLMapEngine.access$100(GLMapEngine.access$000(this.this$0), this.val$isConnected ? 1 : 0);
   }
}
