package com.autonavi.amap.mapcore.animation;

class GLAnimation$1 implements Runnable {
   GLAnimation$1(GLAnimation var1) {
      this.this$0 = var1;
   }

   public void run() {
      if (this.this$0.mListener != null) {
         try {
            this.this$0.mListener.onAnimationStart();
         } catch (Throwable var2) {
            var2.printStackTrace();
         }
      }

   }
}
