package com.amap.api.mapcore.util;

import android.content.Context;
import java.io.File;
import java.lang.reflect.Constructor;

public class ik {
   public static <T> T a(Context var0, hf var1, String var2, Class var3, Class[] var4, Object[] var5) throws gt {
      ip var6 = b(var0, var1);
      Object var7 = a(var6, var2, var4, var5);
      if (var7 != null) {
         return var7;
      } else {
         var7 = a(var3, var4, var5);
         if (var7 != null) {
            return var7;
         } else {
            throw new gt("获取对象错误");
         }
      }
   }

   public static void a(Context var0, String var1) {
      try {
         il.b().a().submit(new ik$1(var0, var1));
      } catch (Throwable var3) {
         in.a(var3, "InstanceFactory", "rollBack");
      }

   }

   public static boolean a(Context var0, hf var1) {
      try {
         String var2 = ig.a(var0);
         File var3 = new File(var2);
         if (!var3.exists()) {
            return false;
         } else {
            String var4 = ig.b(var0, var1.a(), var1.b());
            File var5 = new File(var4);
            if (var5.exists()) {
               return true;
            } else {
               ig.a(var0, var5, var1);
               return false;
            }
         }
      } catch (Throwable var6) {
         in.a(var6, "IFactory", "isdowned");
         return false;
      }
   }

   public static Class a(Context var0, hf var1, String var2) {
      ip var3 = b(var0, var1);

      try {
         if (a(var3)) {
            Class var4 = var3.loadClass(var2);
            return var4;
         } else {
            return null;
         }
      } catch (Throwable var5) {
         in.a(var5, "InstanceFactory", "loadpn");
         return null;
      }
   }

   private static ip b(Context var0, hf var1) {
      ip var2 = null;

      try {
         if (var0 == null) {
            return null;
         }

         if (a(var0, var1)) {
            var2 = il.b().a(var0, var1);
         }
      } catch (Throwable var4) {
         in.a(var4, "IFactory", "gIns1");
      }

      return var2;
   }

   private static boolean a(ip var0) {
      return var0 != null && var0.a() && var0.d;
   }

   private static <T> T a(ip var0, String var1, Class[] var2, Object[] var3) {
      try {
         if (a(var0)) {
            Class var4 = var0.loadClass(var1);
            if (var4 != null) {
               Constructor var5 = var4.getDeclaredConstructor(var2);
               var5.setAccessible(true);
               Object var6 = var5.newInstance(var3);
               return var6;
            }
         }
      } catch (Throwable var7) {
         in.a(var7, "IFactory", "getWrap");
      }

      return null;
   }

   private static <T> T a(Class var0, Class[] var1, Object[] var2) {
      try {
         if (var0 == null) {
            return null;
         } else {
            Constructor var3 = var0.getDeclaredConstructor(var1);
            var3.setAccessible(true);
            Object var4 = var3.newInstance(var2);
            return var4;
         }
      } catch (Throwable var5) {
         in.a(var5, "IFactory", "gIns2()");
         return null;
      }
   }
}
