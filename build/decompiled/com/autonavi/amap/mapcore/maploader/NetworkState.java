package com.autonavi.amap.mapcore.maploader;

import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

public class NetworkState {
   private boolean isNetReceiverRegistered = false;
   private NetworkState$NetworkChangeListener mNetworkListener;
   private NetworkState$MyBroadcastReceiver netChangeReceiver = null;

   public NetworkState() {
   }

   public void setNetworkListener(NetworkState$NetworkChangeListener var1) {
      this.mNetworkListener = var1;
   }

   public void registerNetChangeReceiver(Context var1, boolean var2) {
      if (var2) {
         if (!this.isNetReceiverRegistered) {
            IntentFilter var3 = new IntentFilter();
            var3.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            if (this.netChangeReceiver == null) {
               this.netChangeReceiver = new NetworkState$MyBroadcastReceiver(this.mNetworkListener);
            }

            var1.registerReceiver(this.netChangeReceiver, var3);
         }
      } else if (this.isNetReceiverRegistered && this.netChangeReceiver != null) {
         var1.unregisterReceiver(this.netChangeReceiver);
         this.netChangeReceiver = null;
      }

      this.isNetReceiverRegistered = var2;
   }

   public static boolean isNetworkConnected(Context var0) {
      NetworkInfo var1 = getActiveNetworkInfo(var0);
      return null != var1 && var1.isConnected();
   }

   public static NetworkInfo getActiveNetworkInfo(Context var0) {
      try {
         ConnectivityManager var1 = (ConnectivityManager)var0.getSystemService("connectivity");
         if (var1 == null) {
            return null;
         } else {
            NetworkInfo var2 = var1.getActiveNetworkInfo();
            if (var2 != null && var2.isConnected()) {
               return var2;
            } else {
               NetworkInfo[] var3 = var1.getAllNetworkInfo();
               if (var3 == null) {
                  return null;
               } else {
                  for(int var4 = 0; var4 < var3.length; ++var4) {
                     if (var3[var4] != null && var3[var4].isConnected()) {
                        var2 = var3[var4];
                        break;
                     }
                  }

                  return var2;
               }
            }
         }
      } catch (Exception var5) {
         var5.printStackTrace();
         return null;
      }
   }
}
