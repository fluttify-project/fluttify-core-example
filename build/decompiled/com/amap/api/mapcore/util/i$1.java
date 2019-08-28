package com.amap.api.mapcore.util;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;

class i$1 extends Handler {
   i$1(i var1, Looper var2) {
      super(var2);
      this.a = var1;
   }

   public void handleMessage(Message var1) {
      super.handleMessage(var1);
      if (!i.b()) {
         if (i.a(this.a) == null) {
            i.a(this.a, new i$a(i.b(this.a), i.c(this.a) == null ? null : (Context)i.c(this.a).get()));
         }

         fh.a().a(i.a(this.a));
      }
   }
}
