package com.amap.api.mapcore.util;

import android.content.Context;
import dalvik.system.PathClassLoader;
import java.io.File;
import java.util.ArrayList;

public class la$a {
   private iu a;
   private String b;
   private String c;

   public la$a(iu var1, String var2, String var3) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
   }

   public boolean a(Context var1, hf var2) {
      String var7 = this.b;
      iu var6 = this.a;
      boolean var10000;
      if (var6 == null) {
         var10000 = false;
      } else {
         if (!var6.g() && !kt.a(var2)) {
            (new lb()).a(var1, var2);
         }

         var10000 = !var6.i() ? false : (!var6.d(var1) ? false : (var6.g() && var6.h() ? var6.f().equals(hc.a(var7)) : false));
      }

      if (!var10000) {
         return false;
      } else if (kt.a(var2)) {
         return false;
      } else {
         iv.a().a(var1);
         iv.a().a(var2);
         if (iv.a().a(this.a.c().i(), this.a.c().j(), this.a.c().k())) {
            return false;
         } else if (!iu.a(var1, this.a, var2)) {
            return false;
         } else {
            kl.d(this.c);
            kl.f(this.c);
            ArrayList var11;
            (var11 = new ArrayList()).add(new File(this.b));
            File var3 = new File(this.c);
            var1.getApplicationContext();
            PathClassLoader var10 = (PathClassLoader)var1.getClassLoader();

            try {
               la.a(var10, var3, var11);
               return true;
            } catch (Throwable var9) {
               kl.a(var9, "di");
               return false;
            }
         }
      }
   }
}
