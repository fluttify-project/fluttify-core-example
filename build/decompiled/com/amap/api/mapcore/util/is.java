package com.amap.api.mapcore.util;

import android.content.Context;
import android.text.TextUtils;
import java.lang.reflect.Constructor;

public class is {
   private volatile int a = -1;

   public is() {
   }

   public static is a() {
      return is$a.a;
   }

   public static boolean a(hf var0) {
      return kt.a(var0);
   }

   public void a(Context var1, hf var2, boolean var3) {
      iu var4;
      (var4 = iu.a(var1)).a(var3);
      var4.b(var1);
   }

   public boolean a(Context var1, hf var2) {
      if (var1 == null) {
         return false;
      } else {
         return !a(var2) ? false : iu.a(var1).e();
      }
   }

   public void a(Context var1, hf var2, it var3, boolean var4) {
      if (var3 != null) {
         iu var7;
         if var8;
         boolean var10000;
         label84: {
            boolean var5 = var3.e();
            boolean var6 = var3.f();
            var7 = iu.a(var1);
            var8 = new if(var3.b(), var3.c(), "", var4);
            if (var7 != null) {
               boolean var14 = false;
               if (var5 != var7.g()) {
                  var14 = true;
                  var7.b(var5);
               }

               if (var6 != var7.h()) {
                  var14 = true;
                  var7.c(var6);
               }

               if (var14) {
                  var7.b(var1);
               }

               if (var2 == null) {
                  var10000 = false;
               } else if (!var7.g()) {
                  d(var1, var2);
                  var10000 = false;
               } else {
                  var10000 = !var7.h() ? false : (!var2.b().equals(var2.c()) ? false : (var8 != null && var8.h() ? (lj.b(var8.j(), var2.b()) && lj.a(var8.k(), var2.b()) > 0 ? var7 == null || !var7.d(var1) || lj.a(var8.k(), var7.c().k()) > 0 : false) : false));
               }

               if (!var10000) {
                  var10000 = false;
                  break label84;
               }
            }

            var10000 = true;
         }

         if (var10000) {
            if (!TextUtils.isEmpty(var3.b()) && !TextUtils.isEmpty(var3.d())) {
               if (!kt.a(var2)) {
                  iv.a().a(var1);
                  iv.a().a(var2);
                  if (!iv.a().a(var8.i(), var8.j(), var8.k())) {
                     ku var15 = new ku(var3.b(), var3.a(var1), "", var4);
                     kr var17 = new kr(var8.i(), var8.j(), var8.k(), var3.b(var1));
                     iu var16;
                     (var16 = new iu(var15, var17, var3.a(var1), false, var3.e(), var3.f(), var3.g())).a(var7.e());
                     (new kt(var1, var8, var16, var3.a())).a();
                  }
               }
            }
         }
      }
   }

   public boolean b(Context var1, hf var2) {
      if (this.a == 1) {
         return false;
      } else {
         boolean var3;
         if (!(var3 = this.c(var1, var2))) {
            this.a = 1;
         }

         return var3;
      }
   }

   public boolean c(Context var1, hf var2) {
      iu var3;
      if ((var3 = iu.a(var1)) != null && var3.c() != null) {
         boolean var10000;
         if (var2 != null && var3 != null) {
            if (!TextUtils.isEmpty(var2.c()) && !TextUtils.isEmpty(var2.b())) {
               if (!var2.b().equals(var2.c())) {
                  var10000 = false;
               } else if (var3 != null && var3.d(var1)) {
                  if (!var3.g()) {
                     d(var1, var2);
                     var10000 = false;
                  } else {
                     var10000 = !var3.h() ? false : (!TextUtils.isEmpty(var3.c().j()) && !TextUtils.isEmpty(var3.c().k()) ? (lj.a(var2.b(), var3.c().j()) != 0 ? false : lj.a(var2.b(), var3.c().k()) < 0) : false);
                  }
               } else {
                  var10000 = false;
               }
            } else {
               var10000 = false;
            }
         } else {
            var10000 = false;
         }

         if (!var10000) {
            return false;
         } else {
            kn var4 = new kn(var1, var2);
            return (new la$a(var3, var4.j(), var4.k())).a(var1, var2);
         }
      } else {
         return false;
      }
   }

   private static void d(Context var0, hf var1) {
      (new lb()).a(var0, var1);
   }

   public <T> T a(Context var1, hf var2, String var3, Class var4, Class[] var5, Object[] var6) throws gt {
      try {
         Class var8;
         if ((var8 = var1.getClassLoader().loadClass(var3)) != null) {
            Constructor var9;
            (var9 = var8.getDeclaredConstructor(var5)).setAccessible(true);
            return var9.newInstance(var6);
         }
      } catch (Throwable var7) {
         kl.a(var7, "tt");
      }

      return null;
   }
}
