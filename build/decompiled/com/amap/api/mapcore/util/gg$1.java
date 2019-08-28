package com.amap.api.mapcore.util;

import android.os.Handler;
import android.os.Message;

class gg$1 extends Handler {
   gg$1(gg var1) {
      this.a = var1;
   }

   public void handleMessage(Message var1) {
      super.handleMessage(var1);
      int var2 = var1.arg1;
      int var3 = var1.arg2;

      try {
         gg.a(this.a, var2, var3);
      } catch (Exception var5) {
         var5.printStackTrace();
      }

   }
}
