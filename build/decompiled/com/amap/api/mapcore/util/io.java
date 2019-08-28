package com.amap.api.mapcore.util;

import android.text.TextUtils;
import java.util.regex.Pattern;

public class io {
   private static Pattern a = null;

   public static boolean a(String var0) {
      if (TextUtils.isEmpty(var0)) {
         return false;
      } else {
         if (a == null) {
            a = Pattern.compile("[\\d+\\.]+");
         }

         return a.matcher(var0).matches();
      }
   }
}
