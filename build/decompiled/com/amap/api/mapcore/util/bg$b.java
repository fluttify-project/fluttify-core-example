package com.amap.api.mapcore.util;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;

class bg$b extends Handler {
   public bg$b(bg var1, Looper var2) {
      super(var2);
      this.a = var1;
   }

   public void handleMessage(Message var1) {
      try {
         Bundle var2 = var1.getData();
         Object var3 = var1.obj;
         if (var3 instanceof bf) {
            bf var4 = (bf)var3;
            cd.a("OfflineMapHandler handleMessage CitObj  name: " + var4.getCity() + " complete: " + var4.getcompleteCode() + " status: " + var4.getState());
            if (bg.d(this.a) != null) {
               bg.d(this.a).a(var4);
            }
         } else {
            cd.a("Do not callback by CityObject! ");
         }
      } catch (Throwable var5) {
         var5.printStackTrace();
      }

   }
}
