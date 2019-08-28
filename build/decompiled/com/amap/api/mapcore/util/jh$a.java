package com.amap.api.mapcore.util;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

class jh$a extends Handler {
   private jh$a(Looper var1) {
      super(var1);
   }

   public jh$a() {
   }

   public void handleMessage(Message var1) {
      try {
         int var2 = var1.what;
         switch(var2) {
         case 0:
            jm var3 = (jm)var1.obj;
            jj var4 = var3.b;
            var4.a();
            break;
         case 1:
            jm var5 = (jm)var1.obj;
            jj var6 = var5.b;
            var6.a(var5.a);
            break;
         default:
            return;
         }
      } catch (Throwable var7) {
         var7.printStackTrace();
      }

   }
}
