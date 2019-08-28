package com.autonavi.ae.gmap.gloverlay;

class BaseMapOverlay$1 implements Runnable {
   BaseMapOverlay$1(BaseMapOverlay var1) {
      this.this$0 = var1;
   }

   public void run() {
      if (this.this$0.getGLOverlay() != null) {
         if (null != this.this$0.mMapView && this.this$0.mMapView.isMaploaded()) {
            this.this$0.mMapView.removeEngineGLOverlay(this.this$0);
         }

         this.this$0.getGLOverlay().releaseInstance();
         this.this$0.mGLOverlay = null;
      }

   }
}
