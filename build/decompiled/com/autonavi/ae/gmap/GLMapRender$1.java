package com.autonavi.ae.gmap;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

class GLMapRender$1 extends Handler {
   GLMapRender$1(GLMapRender var1, Looper var2) {
      super(var2);
      this.this$0 = var1;
   }

   public void handleMessage(Message var1) {
      switch(var1.what) {
      case 10:
         if (!GLMapRender.access$000(this.this$0) && this.this$0.mGLMapView != null && this.this$0.mGLMapView.getRenderMode() == 0) {
            this.this$0.mGLMapView.requestRender();
         }
         break;
      case 100:
         Runnable var2 = (Runnable)var1.obj;
         var2.run();
      }

   }
}
