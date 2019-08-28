package com.amap.api.mapcore.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;

final class lu$a extends BroadcastReceiver {
   private lu$a(lu var1) {
      this.a = var1;
   }

   public final void onReceive(Context var1, Intent var2) {
      if (var1 != null && var2 != null) {
         try {
            String var4;
            if (!TextUtils.isEmpty(var4 = var2.getAction())) {
               if (var4.equals("android.net.wifi.SCAN_RESULTS")) {
                  if (lu.a(this.a) != null) {
                     lu.a(this.a).c();
                     return;
                  }
               } else if (var4.equals("android.net.wifi.WIFI_STATE_CHANGED") && lu.a(this.a) != null) {
                  lu.a(this.a).d();
               }

            }
         } catch (Throwable var3) {
            mg.a(var3, "MapNetLocation", "onReceive");
         }
      }
   }
}
