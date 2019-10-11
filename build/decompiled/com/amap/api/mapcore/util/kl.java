package com.amap.api.mapcore.util;

import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.text.TextUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class kl {
   private kp a;
   private kr b;
   private hf c;
   private String d = "";
   private List<kq> e = new ArrayList();

   public static void a(Context var0, String var1, String var2, String var3) {
      if (var0 != null && !TextUtils.isEmpty(var2) && !TextUtils.isEmpty(var1)) {
         if (!TextUtils.isEmpty(var3)) {
            var3 = hg.g(gs.a(hg.a(var3)));
            Editor var4;
            (var4 = var0.getSharedPreferences(var1, 0).edit()).putString(var2, var3);
            var4.commit();
         }
      }
   }

   public static String a(Context var0, String var1, String var2) {
      return var0 != null && !TextUtils.isEmpty(var2) ? hg.a(gs.b(hg.e(var0.getSharedPreferences(var1, 0).getString(var2, "")))) : "";
   }

   public static void a(String var0) {
      if (!TextUtils.isEmpty(var0)) {
         ;
      }
   }

   public kl(Context var1, hf var2, kr var3) {
      this.c = var2;
      this.b = var3;
      this.a = new kp(var1, var2);
   }

   public boolean b(String var1) {
      try {
         return this.c == null ? false : this.i(var1);
      } catch (Throwable var2) {
         return false;
      }
   }

   private static String h(String var0) {
      if (TextUtils.isEmpty(var0)) {
         return "";
      } else {
         String var10000 = var0.startsWith("lib") ? var0 : "lib" + var0;
         var0 = var10000;
         return var10000.endsWith(".so") ? var0 : var0 + ".so";
      }
   }

   private boolean i(String var1) {
      try {
         if (this.c(var1)) {
            return true;
         }
      } catch (Throwable var3) {
         ;
      }

      try {
         System.loadLibrary(var1);
         return true;
      } catch (Throwable var2) {
         return false;
      }
   }

   public boolean c(String var1) {
      return this.j(var1) == 1000;
   }

   private int j(String var1) {
      String var2 = h(var1);
      String var4 = var1;
      kp var7 = this.a;
      String var10000;
      if (var7 != null && !TextUtils.isEmpty(var4)) {
         String var3 = h(var4);
         var10000 = var7.b(var3);
      } else {
         var10000 = "";
      }

      var1 = var10000;
      kq var8 = this.b.a(var2);
      File var9;
      if (!(var9 = new File(var1)).exists() || var9.isDirectory()) {
         return 1001;
      } else {
         this.e.add(var8);

         try {
            System.load(var1);
         } catch (Throwable var6) {
            return 1001;
         }

         try {
            this.a();
         } catch (Throwable var5) {
            ;
         }

         return 1000;
      }
   }

   public void a() {
      if (this.e != null && this.e.size() != 0) {
         boolean var10000 = ks.a;
      }
   }

   public static Field a(Object var0, String var1) throws NoSuchFieldException {
      Class var2 = var0.getClass();

      while(var2 != null) {
         try {
            Field var3;
            if (!(var3 = var2.getDeclaredField(var1)).isAccessible()) {
               var3.setAccessible(true);
            }

            return var3;
         } catch (NoSuchFieldException var4) {
            var2 = var2.getSuperclass();
         }
      }

      throw new NoSuchFieldException("Field " + var1 + " not found in " + var0.getClass());
   }

   public static Field a(Class<?> var0, String var1) throws NoSuchFieldException {
      Class var2 = var0;

      while(var2 != null) {
         try {
            Field var3;
            if (!(var3 = var2.getDeclaredField(var1)).isAccessible()) {
               var3.setAccessible(true);
            }

            return var3;
         } catch (NoSuchFieldException var4) {
            var2 = var2.getSuperclass();
         }
      }

      throw new NoSuchFieldException("Field " + var1 + " not found in " + var0);
   }

   public static Method a(Object var0, String var1, Class... var2) throws NoSuchMethodException {
      Class var3 = var0.getClass();

      while(var3 != null) {
         try {
            Method var4;
            if (!(var4 = var3.getDeclaredMethod(var1, var2)).isAccessible()) {
               var4.setAccessible(true);
            }

            return var4;
         } catch (NoSuchMethodException var5) {
            var3 = var3.getSuperclass();
         }
      }

      throw new NoSuchMethodException("Method " + var1 + " with parameters " + Arrays.asList(var2) + " not found in " + var0.getClass());
   }

   public static void a(Object var0, String var1, Object[] var2) throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
      Object[] var3;
      Field var5;
      Object[] var4 = (Object[])Array.newInstance((var3 = (Object[])(var5 = a(var0, var1)).get(var0)).getClass().getComponentType(), var3.length + var2.length);
      System.arraycopy(var2, 0, var4, 0, var2.length);
      System.arraycopy(var3, 0, var4, var2.length, var3.length);
      var5.set(var0, var4);
   }

   public static void a(Object var0, String var1, int var2) throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
      if (var2 > 0) {
         Object[] var3;
         int var4;
         Field var6;
         if ((var4 = (var3 = (Object[])(var6 = a(var0, var1)).get(var0)).length - var2) > 0) {
            Object[] var5 = (Object[])Array.newInstance(var3.getClass().getComponentType(), var4);
            System.arraycopy(var3, var2, var5, 0, var4);
            var6.set(var0, var5);
         }
      }
   }

   public static void d(String var0) {
      File var1;
      if ((var1 = new File(var0)).exists()) {
         a(var1);
      }
   }

   private static void a(File var0) {
      if (var0.isDirectory()) {
         File[] var2;
         if ((var2 = var0.listFiles()) != null) {
            for(int var1 = 0; var1 < var2.length; ++var1) {
               if (var2[var1].isDirectory()) {
                  a(var2[var1]);
               } else {
                  var2[var1].delete();
               }
            }

         }
      } else {
         var0.delete();
      }
   }

   public static void e(String var0) {
      File var1;
      if ((var1 = new File(var0)).exists()) {
         var1.delete();
      }
   }

   public static void f(String var0) {
      if (!TextUtils.isEmpty(var0)) {
         File var1;
         if (!(var1 = new File(var0)).exists() || !var1.isDirectory()) {
            if (!var1.exists()) {
               var1.mkdirs();
               return;
            }

            if (var1.exists() && !var1.isDirectory()) {
               var1.delete();
               var1.mkdirs();
            }
         }

      }
   }

   private static void b(File var0) throws IOException {
      if (!var0.exists() || !var0.isFile()) {
         if (!var0.exists()) {
            var0.createNewFile();
         } else {
            if (var0.exists() && !var0.isFile()) {
               var0.delete();
               var0.createNewFile();
            }

         }
      }
   }

   private static void k(String var0) throws IOException {
      if (!TextUtils.isEmpty(var0)) {
         File var1;
         f((var1 = new File(var0)).getParentFile().getAbsolutePath());
         b(var1);
      }
   }

   public static void a(String var0, String var1) {
      b(var0, var1);
      e(var0);
   }

   public static void b(String var0, String var1) {
      if (g(var0)) {
         FileInputStream var2 = null;
         FileOutputStream var3 = null;
         boolean var9 = false;

         label83: {
            try {
               var9 = true;
               File var15 = new File(var0);
               File var17;
               k((var17 = new File(var1)).getAbsolutePath());
               var2 = new FileInputStream(var15);
               var3 = new FileOutputStream(var17);
               byte[] var16 = new byte[1024];

               int var18;
               while((var18 = var2.read(var16)) > 0) {
                  var3.write(var16, 0, var18);
               }

               var3.flush();
               var9 = false;
               break label83;
            } catch (Throwable var13) {
               var9 = false;
            } finally {
               if (var9) {
                  try {
                     var2.close();
                     var3.close();
                  } catch (IOException var10) {
                     var10.printStackTrace();
                  }

               }
            }

            try {
               var2.close();
               var3.close();
               return;
            } catch (IOException var11) {
               var11.printStackTrace();
               return;
            }
         }

         try {
            var2.close();
            var3.close();
         } catch (IOException var12) {
            var12.printStackTrace();
         }
      }
   }

   public static void c(String var0, String var1) {
      String var2 = var1;
      var1 = var0;
      if (g(var0)) {
         FileInputStream var3 = null;
         FileOutputStream var4 = null;

         try {
            File var13 = new File(var1);
            File var15;
            k((var15 = new File(var2)).getAbsolutePath());
            var3 = new FileInputStream(var13);
            byte[] var14 = new byte[32];
            var3.read(var14);
            var4 = new FileOutputStream(var15);
            var14 = new byte[1024];

            int var16;
            while((var16 = var3.read(var14)) > 0) {
               var4.write(var14, 0, var16);
            }

            var4.flush();
         } catch (Throwable var11) {
            ;
         } finally {
            try {
               var3.close();
               var4.close();
            } catch (IOException var10) {
               var10.printStackTrace();
            }

         }
      }

      e(var0);
   }

   public static void a(String var0, String var1, String var2) {
      if (c(new File(var0))) {
         byte[] var3 = new byte[1024];

         try {
            FileInputStream var8 = new FileInputStream(var0);
            ZipInputStream var4;
            ZipEntry var5 = (var4 = new ZipInputStream(var8)).getNextEntry();

            while(true) {
               while(var5 != null) {
                  String var6;
                  String var9;
                  if (((var6 = var9 = var5.getName()) == null || !var6.equalsIgnoreCase("so.png")) && !ko.a(var9)) {
                     var4.closeEntry();
                     var5 = var4.getNextEntry();
                  } else {
                     var6 = var2;
                     if (ko.a(var9)) {
                        var6 = var1;
                     }

                     k(var6);
                     FileOutputStream var10 = new FileOutputStream(var6);

                     int var11;
                     while((var11 = var4.read(var3)) > 0) {
                        var10.write(var3, 0, var11);
                     }

                     var10.close();
                     var4.closeEntry();
                     var5 = var4.getNextEntry();
                  }
               }

               var4.closeEntry();
               var4.close();
               var8.close();
               return;
            }
         } catch (IOException var7) {
            var7.printStackTrace();
         }
      }
   }

   public static void a(String var0, kp var1) {
      if (c(new File(var0))) {
         FileInputStream var2 = null;
         byte[] var3 = new byte[1024];
         ZipInputStream var4 = null;

         try {
            var2 = new FileInputStream(var0);

            for(ZipEntry var14 = (var4 = new ZipInputStream(var2)).getNextEntry(); var14 != null; var14 = var4.getNextEntry()) {
               String var5;
               if ((var5 = var0 = var14.getName()) != null && var5.endsWith(".so")) {
                  File var15;
                  b(var15 = new File(var1.a(var0)));
                  (new File(var15.getParent())).mkdirs();
                  FileOutputStream var16 = new FileOutputStream(var15);

                  int var17;
                  while((var17 = var4.read(var3)) > 0) {
                     var16.write(var3, 0, var17);
                  }

                  var16.close();
               }

               var4.closeEntry();
            }

            var4.closeEntry();
            var4.close();
            var2.close();
            return;
         } catch (Throwable var12) {
            var12.printStackTrace();
         } finally {
            try {
               var4.closeEntry();
               var4.close();
               var2.close();
            } catch (Throwable var11) {
               ;
            }

         }

      }
   }

   public static boolean g(String var0) {
      return c(new File(var0));
   }

   private static boolean c(File var0) {
      return var0.exists();
   }

   public static boolean d(String var0, String var1) {
      if (!TextUtils.isEmpty(var0) && !TextUtils.isEmpty(var1)) {
         g(var1);
         var1 = hc.a(var1);
         return var0.equals(var1);
      } else {
         return false;
      }
   }

   public static String a(Context var0, String var1) {
      return var0 == null ? hc.b(var1) : hc.b(gz.v(var0) + var1);
   }

   public static void a(Throwable var0, String var1) {
      ht.c(var0, "po", var1);
   }
}
