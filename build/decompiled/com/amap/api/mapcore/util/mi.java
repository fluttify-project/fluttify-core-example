package com.amap.api.mapcore.util;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class mi {
   public static Object a(String var0, String var1) throws Exception {
      Class var2;
      Field var3;
      (var3 = (var2 = Class.forName(var0)).getField(var1)).setAccessible(true);
      return var3.get(var2);
   }

   public static int b(String var0, String var1) throws Exception {
      return ((Integer)a(var0, var1)).intValue();
   }

   public static Object a(Object var0, String var1, Object... var2) {
      Object var3 = null;

      try {
         Class var4 = var0.getClass();
         var3 = a(var0, var4, var1, var2);
      } catch (Throwable var5) {
         ;
      }

      return var3;
   }

   public static int b(Object var0, String var1, Object... var2) throws Exception {
      return ((Integer)a(var0, var1, var2)).intValue();
   }

   public static Object a(String var0, String var1, Object[] var2, Class<?>[] var3) throws Exception {
      return a(Class.forName(var0), var1, var2, var3);
   }

   public static Object a(Class<?> var0, String var1, Object[] var2, Class<?>[] var3) throws Exception {
      Method var4;
      if (!(var4 = var0.getDeclaredMethod(var1, var3)).isAccessible()) {
         var4.setAccessible(true);
      }

      return var4.invoke((Object)null, var2);
   }

   public static Object a(Object var0, Class<?> var1, String var2, Object... var3) throws Exception {
      Class[] var4 = new Class[var3.length];
      int var5 = 0;

      for(int var6 = var3.length; var5 < var6; ++var5) {
         var4[var5] = var3[var5].getClass();
         if (var4[var5] == Integer.class) {
            var4[var5] = Integer.TYPE;
         }

         if (var4[var5] == Boolean.class) {
            var4[var5] = Boolean.TYPE;
         }

         if (var4[var5] == Double.class) {
            var4[var5] = Double.TYPE;
         }
      }

      Method var10;
      if (!(var10 = var1.getDeclaredMethod(var2, var4)).isAccessible()) {
         var10.setAccessible(true);
      }

      Object var11 = null;

      try {
         var11 = var10.invoke(var0, var3);
      } catch (Throwable var8) {
         Throwable var9 = var8;

         try {
            if (var9 instanceof InvocationTargetException) {
               mg.a(((InvocationTargetException)var9).getTargetException(), "Reflect", "invokeMethod " + var2);
            }
         } catch (Throwable var7) {
            ;
         }
      }

      return var11;
   }
}
