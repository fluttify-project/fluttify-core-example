package com.autonavi.ae.gmap.gloverlay;

import com.amap.api.mapcore.util.ht;

class CrossVectorOverlay$1 implements Runnable {
   CrossVectorOverlay$1(CrossVectorOverlay var1, int var2, int var3) {
      this.this$0 = var1;
      this.val$mapWidth = var2;
      this.val$mapHeight = var3;
   }

   public void run() {
      try {
         if (this.this$0.mGLOverlay != null && ((GLCrossVector)this.this$0.mGLOverlay).isVisible() && CrossVectorOverlay.access$000(this.this$0) != null && !CrossVectorOverlay.access$000(this.this$0).c()) {
            CrossVectorOverlay.access$000(this.this$0).a(this.val$mapWidth, this.val$mapHeight);
            CrossVectorOverlay.access$000(this.this$0).a();
         }
      } catch (Throwable var2) {
         ht.c(var2, "CrossVectorOverlay", "setData");
      }

   }
}
