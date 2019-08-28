package com.autonavi.amap.mapcore.tools;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.AssetManager;
import android.text.TextUtils;
import android.util.TypedValue;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class GlMapUtil {
   public static final int AMAP_ENGINE_TYPE_DISPLAY_EXTERNAL_1 = 2;
   public static final int AMAP_ENGINE_TYPE_DISPLAY_EXTERNAL_1_EAGLE_EYE = 3;
   public static final int AMAP_ENGINE_TYPE_DISPLAY_EXTERNAL_2 = 4;
   public static final int AMAP_ENGINE_TYPE_DISPLAY_EXTERNAL_2_EAGLE_EYE = 5;
   public static final int AMAP_ENGINE_TYPE_DISPLAY_EXTERNAL_3 = 6;
   public static final int AMAP_ENGINE_TYPE_DISPLAY_EXTERNAL_3_EAGLE_EYE = 7;
   public static final int AN_ENGINE_ID_INVALID = -1;
   public static final int AN_ENGINE_ID_MAIN = 1;
   public static final int AN_ENGINE_ID_EAGLE_EYE = 2;
   public static final int AN_ENGINE_ID_DISPLAY_EXTERNAL_1 = 3;
   public static final int AN_ENGINE_ID_DISPLAY_EXTERNAL_1_EAGLE_EYE = 4;
   public static final int AN_ENGINE_ID_DISPLAY_EXTERNAL_2 = 5;
   public static final int AN_ENGINE_ID_DISPLAY_EXTERNAL_2_EAGLE_EYE = 6;
   public static final int AN_ENGINE_ID_DISPLAY_EXTERNAL_3 = 7;
   public static final int AN_ENGINE_ID_DISPLAY_EXTERNAL_3_EAGLE_EYE = 8;
   public static final int DEVICE_DISPLAY_DPI_LOW = 120;
   public static final int DEVICE_DISPLAY_DPI_NORMAL = 160;
   public static final int DEVICE_DISPLAY_DPI_MEDIAN = 240;
   public static final int DEVICE_DISPLAY_DPI_HIGH = 320;
   public static final int DEVICE_DISPLAY_DPI_XHIGH = 480;
   public static final int DEVICE_DISPLAY_DPI_XXHIGH = 640;

   public GlMapUtil() {
   }

   public static byte[] decodeAssetResData(Context var0, String var1) {
      AssetManager var2 = var0.getAssets();

      try {
         InputStream var3 = var2.open(var1);
         ByteArrayOutputStream var4 = new ByteArrayOutputStream();
         byte[] var5 = new byte[1024];
         boolean var6 = true;

         int var10;
         while((var10 = var3.read(var5)) > -1) {
            var4.write(var5, 0, var10);
         }

         byte[] var7 = var4.toByteArray();
         var4.close();
         var3.close();
         return var7;
      } catch (IOException var8) {
         return null;
      } catch (OutOfMemoryError var9) {
         return null;
      }
   }

   public static int dipToPixel(Context var0, int var1) {
      if (var0 == null) {
         return var1;
      } else {
         try {
            float var2 = TypedValue.applyDimension(1, (float)var1, var0.getResources().getDisplayMetrics());
            return (int)var2;
         } catch (Exception var3) {
            return var1;
         }
      }
   }

   public static int spToPixel(Context var0, int var1) {
      float var2 = TypedValue.applyDimension(2, (float)var1, var0.getResources().getDisplayMetrics());
      return (int)var2;
   }

   public static String getString(Context var0, int var1) {
      return var0.getResources().getString(var1);
   }

   public static boolean isAssic(String var0) {
      if (TextUtils.isEmpty(var0)) {
         return false;
      } else {
         char[] var1 = var0.toCharArray();

         for(int var2 = 0; var2 < var1.length; ++var2) {
            if (var1[var2] >= 256 || var1[var2] <= 0) {
               return false;
            }
         }

         return true;
      }
   }

   public static String getAppVersionName(Context var0) {
      try {
         PackageInfo var1 = var0.getPackageManager().getPackageInfo(var0.getPackageName(), 0);
         return var1.versionName;
      } catch (NameNotFoundException var2) {
         return "";
      }
   }
}
