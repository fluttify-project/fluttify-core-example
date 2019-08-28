package com.amap.api.mapcore.util;

import android.annotation.SuppressLint;
import android.os.Build.VERSION;
import dalvik.system.PathClassLoader;
import java.io.File;
import java.util.List;

public final class la {
   private static int a = 0;

   @SuppressLint({"NewApi"})
   public static void a(PathClassLoader var0, File var1, List<File> var2) throws Throwable {
      if (!var2.isEmpty()) {
         if (VERSION.SDK_INT >= 23) {
            la$c.a(var0, var2, var1);
         } else if (VERSION.SDK_INT >= 19) {
            la$b.a(var0, var2, var1);
         } else {
            if (VERSION.SDK_INT < 14) {
               return;
            }

            la$a.a(var0, var2, var1);
         }

         a = var2.size();
         if (!((Boolean)kl.a(Class.forName("com.tencent.tinker.loader.TinkerTestDexLoad", true, var0), "isPatch").get((Object)null)).booleanValue()) {
            PathClassLoader var4 = var0;
            if (a > 0) {
               if (VERSION.SDK_INT >= 14) {
                  kl.a(kl.a((Object)var0, (String)"pathList").get(var0), "dexElements", a);
               } else {
                  kl.a(var0, "mPaths", a);
                  kl.a(var0, "mFiles", a);
                  kl.a(var0, "mZips", a);

                  try {
                     kl.a(var4, "mDexs", a);
                  } catch (Exception var3) {
                     ;
                  }
               }
            }

            throw new gt("CHECK_DEX_INSTALL_FAIL");
         }
      }

   }
}
