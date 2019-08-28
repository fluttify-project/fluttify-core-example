package com.amap.api.offlineservice;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.content.Intent;
import android.net.Uri;
import android.os.Build.VERSION;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class AMapPermissionActivity extends Activity {
   protected String[] needPermissions = new String[]{"android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE", "android.permission.READ_PHONE_STATE"};
   private boolean a = true;

   public AMapPermissionActivity() {
   }

   protected void onResume() {
      try {
         super.onResume();
         if (VERSION.SDK_INT >= 23 && this.a) {
            this.a(this.needPermissions);
         }
      } catch (Throwable var2) {
         var2.printStackTrace();
      }

   }

   @TargetApi(23)
   private void a(String... var1) {
      try {
         if (VERSION.SDK_INT >= 23 && this.getApplicationInfo().targetSdkVersion >= 23) {
            List var2 = this.b(var1);
            if (null != var2 && var2.size() > 0) {
               try {
                  String[] var3 = (String[])var2.toArray(new String[var2.size()]);
                  Method var4 = this.getClass().getMethod("requestPermissions", String[].class, Integer.TYPE);
                  var4.invoke(this, var3, Integer.valueOf(0));
               } catch (Throwable var5) {
                  ;
               }
            }
         }
      } catch (Throwable var6) {
         var6.printStackTrace();
      }

   }

   @TargetApi(23)
   private List<String> b(String[] var1) {
      try {
         ArrayList var2 = new ArrayList();
         if (VERSION.SDK_INT >= 23 && this.getApplicationInfo().targetSdkVersion >= 23) {
            String[] var3 = var1;
            int var4 = var1.length;

            for(int var5 = 0; var5 < var4; ++var5) {
               String var6 = var3[var5];
               if (this.a(var6) != 0 || this.b(var6)) {
                  var2.add(var6);
               }
            }
         }

         return var2;
      } catch (Throwable var7) {
         var7.printStackTrace();
         return null;
      }
   }

   private int a(String var1) {
      try {
         Method var2 = this.getClass().getMethod("checkSelfPermission", String.class);
         Integer var3 = (Integer)var2.invoke(this, var1);
         return var3.intValue();
      } catch (Throwable var4) {
         return -1;
      }
   }

   private boolean b(String var1) {
      try {
         Method var2 = this.getClass().getMethod("shouldShowRequestPermissionRationale", String.class);
         Boolean var3 = (Boolean)var2.invoke(this, var1);
         return var3.booleanValue();
      } catch (Throwable var4) {
         return false;
      }
   }

   private boolean a(int[] var1) {
      try {
         int[] var2 = var1;
         int var3 = var1.length;

         for(int var4 = 0; var4 < var3; ++var4) {
            int var5 = var2[var4];
            if (var5 != 0) {
               return false;
            }
         }
      } catch (Throwable var6) {
         var6.printStackTrace();
      }

      return true;
   }

   @TargetApi(23)
   public void onRequestPermissionsResult(int var1, String[] var2, int[] var3) {
      try {
         if (VERSION.SDK_INT >= 23 && var1 == 0 && !this.a(var3)) {
            this.a();
            this.a = false;
         }
      } catch (Throwable var5) {
         var5.printStackTrace();
      }

   }

   private void a() {
      try {
         Builder var1 = new Builder(this);
         var1.setTitle("提示");
         var1.setMessage("当前应用缺少必要权限。\\n\\n请点击\\\"设置\\\"-\\\"权限\\\"-打开所需权限");
         var1.setNegativeButton("取消", new AMapPermissionActivity$1(this));
         var1.setPositiveButton("设置", new AMapPermissionActivity$2(this));
         var1.setCancelable(false);
         var1.show();
      } catch (Throwable var2) {
         var2.printStackTrace();
      }

   }

   private void b() {
      try {
         Intent var1 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
         var1.setData(Uri.parse("package:" + this.getPackageName()));
         this.startActivity(var1);
      } catch (Throwable var2) {
         var2.printStackTrace();
      }

   }
}
