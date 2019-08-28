package com.amap.api.mapcore.util;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

class ei$c extends Handler {
   public ei$c(Looper var1) {
      super(var1);
   }

   public void handleMessage(Message var1) {
      if (var1.obj != null && var1.obj instanceof ei$b) {
         ei$b var2 = (ei$b)var1.obj;
         switch(var1.what) {
         case 1:
            ei.c(var2.a, var2.b[0]);
            break;
         case 2:
            var2.a.b(var2.b);
         }
      }

   }
}
