package com.amap.api.mapcore.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Build.VERSION;
import android.text.TextUtils;

public class ix {
   private String a;

   public ix(String var1) {
      if (TextUtils.isDigitsOnly(var1)) {
         var1 = "SPUtil";
      }

      this.a = hc.b(var1);
   }

   public void a(Context var1, String var2, boolean var3) {
      try {
         SharedPreferences var4 = var1.getSharedPreferences(this.a, 0);
         Editor var5 = var4.edit();
         var5.putBoolean(var2, var3);
         this.a(var5);
      } catch (Throwable var6) {
         ;
      }

   }

   private void a(Editor var1) {
      if (var1 != null) {
         if (VERSION.SDK_INT >= 9) {
            var1.apply();
         } else {
            var1.commit();
         }
      }
   }

   public boolean b(Context var1, String var2, boolean var3) {
      boolean var4 = false;
      if (var1 == null) {
         return var3;
      } else {
         try {
            SharedPreferences var5 = var1.getSharedPreferences(this.a, 0);
            var4 = var5.getBoolean(var2, var3);
         } catch (Throwable var6) {
            var4 = var3;
         }

         return var4;
      }
   }
}
