package com.autonavi.ae.gmap;

import com.amap.api.maps.AMap$CancelableCallback;
import com.autonavi.ae.gmap.glanimation.AdglMapAnimationMgr$MapAnimationListener;

class GLMapEngine$5 implements AdglMapAnimationMgr$MapAnimationListener {
   GLMapEngine$5(GLMapEngine var1) {
      this.this$0 = var1;
   }

   public void onMapAnimationFinish(AMap$CancelableCallback var1) {
      GLMapEngine.access$200(this.this$0, var1);
   }
}
