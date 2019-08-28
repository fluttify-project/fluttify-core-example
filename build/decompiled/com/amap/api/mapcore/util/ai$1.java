package com.amap.api.mapcore.util;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

class ai$1 extends Handler {
   ai$1(ai var1, Looper var2) {
      super(var2);
      this.a = var1;
   }

   public void handleMessage(Message var1) {
      if (var1 != null && ai.a(this.a) != null) {
         try {
            switch(var1.what) {
            case 0:
               ai.a(this.a).a(ai.b(this.a));
               break;
            case 1:
               ai.a(this.a).e(ai.c(this.a));
               break;
            case 2:
               ai.a(this.a).d(ai.d(this.a));
               break;
            case 3:
               ai.a(this.a).c(ai.e(this.a));
               break;
            case 4:
               ai.a(this.a).b(ai.f(this.a));
               break;
            case 5:
               ai.a(this.a).h(ai.g(this.a));
               break;
            case 6:
               ai.a(this.a).z();
            }
         } catch (Throwable var3) {
            ht.c(var3, "UiSettingsDelegateImp", "handleMessage");
         }

      }
   }
}
