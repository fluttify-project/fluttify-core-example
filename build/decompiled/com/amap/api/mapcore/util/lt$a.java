package com.amap.api.mapcore.util;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

public final class lt$a extends Handler {
   public lt$a(lt var1, Looper var2) {
      super(var2);
      this.a = var1;
   }

   public final void handleMessage(Message var1) {
      switch(var1.what) {
      case 1:
         this.a.b();
      default:
      }
   }
}
