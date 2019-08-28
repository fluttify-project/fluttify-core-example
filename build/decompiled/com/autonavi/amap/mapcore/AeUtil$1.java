package com.autonavi.amap.mapcore;

import android.content.Context;
import com.amap.api.mapcore.util.kk;

final class AeUtil$1 extends kk {
   AeUtil$1(String var1, Context var2) {
      this.val$currentPath = var1;
      this.val$context = var2;
   }

   public void runTask() {
      AeUtil.access$000(this.val$currentPath, this.val$context);
   }
}
