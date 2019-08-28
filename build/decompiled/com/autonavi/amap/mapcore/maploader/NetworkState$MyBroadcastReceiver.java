package com.autonavi.amap.mapcore.maploader;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.lang.ref.WeakReference;

class NetworkState$MyBroadcastReceiver extends BroadcastReceiver {
   WeakReference<NetworkState$NetworkChangeListener> reference = null;

   public NetworkState$MyBroadcastReceiver(NetworkState$NetworkChangeListener var1) {
      WeakReference var2 = new WeakReference(var1);
      this.reference = var2;
   }

   public void onReceive(Context var1, Intent var2) {
      if (null != this.reference && this.reference.get() != null) {
         ((NetworkState$NetworkChangeListener)this.reference.get()).networkStateChanged(var1);
      }

   }
}
