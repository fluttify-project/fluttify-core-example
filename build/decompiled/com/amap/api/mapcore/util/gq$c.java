package com.amap.api.mapcore.util;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.amap.api.trace.TraceListener;
import java.util.List;

class gq$c extends Handler {
   private TraceListener a;

   public gq$c(Looper var1) {
      super(var1);
   }

   public void a(TraceListener var1) {
      this.a = var1;
   }

   public void handleMessage(Message var1) {
      try {
         if (this.a == null) {
            return;
         }

         Bundle var2 = var1.getData();
         if (var2 == null) {
            return;
         }

         int var3 = var2.getInt("lineID");
         switch(var1.what) {
         case 100:
            List var4 = (List)var1.obj;
            this.a.onTraceProcessing(var3, var1.arg1, var4);
            break;
         case 101:
            List var5 = (List)var1.obj;
            this.a.onFinished(var3, var5, var1.arg1, var1.arg2);
            break;
         case 102:
            String var6 = (String)var1.obj;
            this.a.onRequestFailed(var3, var6);
         }
      } catch (Throwable var7) {
         var7.printStackTrace();
      }

   }
}
