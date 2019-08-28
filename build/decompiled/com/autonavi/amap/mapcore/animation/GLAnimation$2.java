package com.autonavi.amap.mapcore.animation;

class GLAnimation$2 implements Runnable {
   GLAnimation$2(GLAnimation var1) {
      this.this$0 = var1;
   }

   public void run() {
      if (this.this$0.mListener != null) {
         try {
            this.this$0.mListener.onAnimationEnd();
         } catch (Throwable var2) {
            var2.printStackTrace();
         }
      }

   }
}
