package com.amap.api.mapcore.util;

import android.content.Context;
import android.content.res.AssetManager;
import java.io.File;
import java.lang.reflect.Method;

public class fc {
   private static boolean a = false;

   public static AssetManager a(Context var0) {
      if (var0 == null) {
         return null;
      } else {
         AssetManager var1 = var0.getAssets();
         if (a) {
            try {
               Method var2 = var1.getClass().getDeclaredMethod("addAssetPath", String.class);
               var2.invoke(var1, "/system/framework/amap.jar");
            } catch (Throwable var3) {
               ht.c(var3, "ResourcesUtil", "getSelfAssets");
            }
         }

         return var1;
      }
   }

   public static int a(Context var0, float var1) {
      float var2 = var0.getResources().getDisplayMetrics().density;
      return (int)(var1 * var2 + 0.5F);
   }

   static {
      File var0 = new File("/system/framework/amap.jar");
      a = var0.exists();
   }
}
