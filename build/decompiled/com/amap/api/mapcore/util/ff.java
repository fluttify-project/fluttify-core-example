package com.amap.api.mapcore.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

public class ff {
   public static void a(Context var0, String var1, String var2, Object var3) {
      String var4 = var3.getClass().getSimpleName();
      SharedPreferences var5 = var0.getSharedPreferences(var1, 0);
      Editor var6 = var5.edit();
      if ("String".equals(var4)) {
         var6.putString(var2, (String)var3);
      } else if ("Integer".equals(var4)) {
         var6.putInt(var2, ((Integer)var3).intValue());
      } else if ("Boolean".equals(var4)) {
         var6.putBoolean(var2, ((Boolean)var3).booleanValue());
      } else if ("Float".equals(var4)) {
         var6.putFloat(var2, ((Float)var3).floatValue());
      } else if ("Long".equals(var4)) {
         var6.putLong(var2, ((Long)var3).longValue());
      }

      var6.commit();
   }
}
