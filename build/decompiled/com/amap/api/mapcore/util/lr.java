package com.amap.api.mapcore.util;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.autonavi.amap.mapcore.Inner_3dMap_location;

public final class lr extends Handler {
   lp a = null;

   public lr(Looper var1, lp var2) {
      super(var1);
      this.a = var2;
   }

   public lr(lp var1) {
      this.a = var1;
   }

   public final void handleMessage(Message var1) {
      switch(var1.what) {
      case 1:
         try {
            if (this.a != null) {
               this.a.a((Inner_3dMap_location)var1.obj);
            }

            return;
         } catch (Throwable var2) {
            mg.a(var2, "ClientResultHandler", "RESULT_LOCATION_FINISH");
         }
      default:
      }
   }
}
