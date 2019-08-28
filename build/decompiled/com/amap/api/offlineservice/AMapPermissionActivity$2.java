package com.amap.api.offlineservice;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class AMapPermissionActivity$2 implements OnClickListener {
   AMapPermissionActivity$2(AMapPermissionActivity var1) {
      this.a = var1;
   }

   public void onClick(DialogInterface var1, int var2) {
      try {
         AMapPermissionActivity.a(this.a);
      } catch (Throwable var4) {
         var4.printStackTrace();
      }

   }
}
