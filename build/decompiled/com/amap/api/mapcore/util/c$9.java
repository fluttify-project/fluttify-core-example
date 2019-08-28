package com.amap.api.mapcore.util;

import android.os.Message;
import android.view.MotionEvent;

class c$9 implements Runnable {
   c$9(c var1, MotionEvent var2) {
      this.b = var1;
      this.a = var2;
   }

   public void run() {
      Message var1 = Message.obtain();
      var1.what = 19;
      var1.arg1 = (int)this.a.getX();
      var1.arg2 = (int)this.a.getY();
      this.b.j.sendMessage(var1);
   }
}
