package com.amap.api.mapcore.util;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.autonavi.amap.mapcore.Inner_3dMap_locationListener;
import com.autonavi.amap.mapcore.Inner_3dMap_locationOption;

public final class lq extends Handler {
   lp a = null;

   public lq(Looper var1, lp var2) {
      super(var1);
      this.a = var2;
   }

   public lq() {
   }

   public final void handleMessage(Message var1) {
      Inner_3dMap_locationListener var9;
      switch(var1.what) {
      case 1001:
         try {
            Inner_3dMap_locationOption var10 = (Inner_3dMap_locationOption)var1.obj;
            this.a.a(var10);
            return;
         } catch (Throwable var7) {
            mg.a(var7, "ClientActionHandler", "ACTION_SET_OPTION");
            return;
         }
      case 1002:
         try {
            var9 = (Inner_3dMap_locationListener)var1.obj;
            this.a.a(var9);
            return;
         } catch (Throwable var6) {
            mg.a(var6, "ClientActionHandler", "ACTION_SET_LISTENER");
            return;
         }
      case 1003:
         try {
            var9 = (Inner_3dMap_locationListener)var1.obj;
            this.a.b(var9);
            return;
         } catch (Throwable var5) {
            mg.a(var5, "ClientActionHandler", "ACTION_REMOVE_LISTENER");
            return;
         }
      case 1004:
         try {
            this.a.a();
            return;
         } catch (Throwable var4) {
            mg.a(var4, "ClientActionHandler", "ACTION_START_LOCATION");
            return;
         }
      case 1005:
         try {
            this.a.b();
            return;
         } catch (Throwable var3) {
            mg.a(var3, "ClientActionHandler", "ACTION_GET_LOCATION");
            return;
         }
      case 1006:
         try {
            this.a.c();
            return;
         } catch (Throwable var2) {
            mg.a(var2, "ClientActionHandler", "ACTION_STOP_LOCATION");
            return;
         }
      case 1007:
         try {
            this.a.d();
            return;
         } catch (Throwable var8) {
            mg.a(var8, "ClientActionHandler", "ACTION_DESTROY");
         }
      default:
      }
   }
}
