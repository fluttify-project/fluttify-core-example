package com.amap.api.mapcore.util;

import android.content.Context;
import android.text.TextUtils;
import dalvik.system.DexFile;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.RandomAccessFile;
import java.util.Iterator;
import java.util.List;

public class ig {
   static String a(String var0) {
      return var0 + ".o";
   }

   static String a(Context var0, String var1, String var2) {
      String var3 = gz.v(var0);
      return hc.b(var1 + var2 + var3) + ".jar";
   }

   static String b(Context var0, String var1, String var2) {
      return a(var0, a(var0, var1, var2));
   }

   public static String a(Context var0, String var1) {
      return a(var0) + File.separator + var1;
   }

   static String a(Context var0) {
      String var1 = var0.getFilesDir().getAbsolutePath() + File.separator + "pngex";
      return var1;
   }

   static void a(Context var0, hf var1) {
      try {
         il$a var2 = il.b().a(var1);
         if (var2 != null && var2.a) {
            synchronized(var2) {
               var2.wait();
            }
         }

         var2.b = true;
         String var3 = b(var0, var1.a(), var1.b());
         if (TextUtils.isEmpty(var3)) {
            return;
         }

         File var4 = new File(var3);
         File var5 = var4.getParentFile();
         if (!var4.exists()) {
            if (var5 != null && var5.exists()) {
               c(var0, var1.a(), var1.b());
            }

            return;
         }

         String var6 = a(var0, a(var4.getName()));
         DexFile var7 = DexFile.loadDex(var3, var6, 0);
         if (var7 != null) {
            var7.close();
            a(var0, var4, var6, var1);
         }

         var2.b = false;
      } catch (Throwable var9) {
         in.a(var9, "BaseLoader", "getInstanceByThread()");
      }

   }

   static void b(Context var0, String var1) {
      hy var2 = new hy(var0, ii.a());
      List var3 = ig$a.a(var2, var1, "copy");
      in.a(var3);
      if (var3 != null && var3.size() > 1) {
         int var4 = var3.size();

         for(int var5 = 1; var5 < var4; ++var5) {
            ij var6 = (ij)var3.get(var5);
            c(var0, var2, var6.a());
         }
      }

   }

   static void a(Context var0, hy var1, String var2) {
      c(var0, var1, a(var2));
      c(var0, var1, var2);
   }

   static void c(Context var0, String var1, String var2) {
      try {
         il.b().a().submit(new ig$1(var0, var1, var2));
      } catch (Throwable var4) {
         ;
      }

   }

   static void a(hy var0, Context var1, String var2) {
      List var3 = ig$a.a(var0, var2, "used");
      if (var3 != null && var3.size() > 0) {
         Iterator var4 = var3.iterator();

         while(var4.hasNext()) {
            ij var5 = (ij)var4.next();
            if (var5 != null && var5.c().equals(var2)) {
               a(var1, var0, var5.a());
               List var6 = var0.b(ij.a(var2, var5.e()), ij.class);
               if (var6 != null && var6.size() > 0) {
                  ij var7 = (ij)var6.get(0);
                  var7.c("errorstatus");
                  String var8 = ij.b(var7.a());
                  ig$a.a(var0, var7, var8);
                  String var9 = a(var1, var7.a());
                  File var10 = new File(var9);
                  if (var10.exists()) {
                     var10.delete();
                  }
               }
            }
         }
      }

   }

   static void a(Context var0, hy var1, hf var2, String var3, String var4) throws Throwable {
      FileInputStream var5 = null;
      RandomAccessFile var6 = null;
      il$a var7 = null;

      try {
         String var8 = var2.a();
         var7 = il.b().a(var2);
         if (var7 != null && var7.a) {
            synchronized(var7) {
               var7.wait();
            }
         }

         var7.b = true;
         String var9 = a(var0, var8, var2.b());
         a(var0, var1, var9);
         File var10 = new File(var3);
         var5 = new FileInputStream(var10);
         byte[] var11 = new byte[32];
         var5.read(var11);
         File var12 = new File(b(var0, var8, var2.b()));
         var6 = new RandomAccessFile(var12, "rw");
         byte[] var13 = new byte[1024];
         boolean var14 = true;

         int var35;
         for(int var15 = 0; (var35 = var5.read(var13)) > 0; var15 += var35) {
            if (var35 == 1024) {
               var6.seek((long)var15);
               var6.write(var13);
            } else {
               byte[] var16 = new byte[var35];
               System.arraycopy(var13, 0, var16, 0, var35);
               var6.seek((long)var15);
               var6.write(var16);
            }
         }

         String var36 = hc.a(var12.getAbsolutePath());
         ij var17 = (new ij$a(var9, var36, var8, var2.b(), var4)).a("used").a();
         ig$a.a(var1, var17, ij.b(var17.a()));
      } catch (Throwable var33) {
         throw var33;
      } finally {
         try {
            in.a((Closeable)var5);
         } catch (Throwable var31) {
            var31.printStackTrace();
         }

         try {
            in.a((Closeable)var6);
         } catch (Throwable var30) {
            var30.printStackTrace();
         }

         try {
            if (var7 != null) {
               var7.b = false;
            }
         } catch (Throwable var29) {
            ;
         }

      }
   }

   static String a(Context var0, hy var1, hf var2) {
      String var3 = null;
      String var4 = ij.b(var2.a(), "copy");
      List var5 = var1.b(var4, ij.class);
      if (var5 != null && var5.size() != 0) {
         in.a(var5);

         for(int var6 = 0; var6 < var5.size(); ++var6) {
            ij var7 = (ij)var5.get(var6);
            if (in.a(var0, var1, var7.a(), var2)) {
               try {
                  a(var0, var1, var2, a(var0, var7.a()), var7.e());
                  var3 = var7.e();
                  break;
               } catch (Throwable var9) {
                  in.a(var9, "FileManager", "loadAvailableD");
               }
            } else {
               c(var0, var1, var7.a());
            }
         }

         return var3;
      } else {
         return null;
      }
   }

   static void a(Context var0, File var1, hf var2) {
      File var3 = var1.getParentFile();
      if (!var1.exists() && var3 != null && var3.exists()) {
         c(var0, var2.a(), var2.b());
      }

   }

   private static void c(Context var0, hy var1, String var2) {
      String var3 = a(var0, var2);
      File var4 = new File(var3);
      if (var4.exists()) {
         var4.delete();
      }

      var1.a(ij.b(var2), ij.class);
   }

   private static void a(Context var0, File var1, String var2, hf var3) {
      String var4 = null;
      hy var5 = new hy(var0, ii.a());
      ij var6 = ig$a.a(var5, var1.getName());
      if (var6 != null) {
         var4 = var6.e();
      }

      File var7 = new File(var2);
      if (!TextUtils.isEmpty(var4) && var7.exists()) {
         String var8 = hc.a(var2);
         String var9 = var7.getName();
         String var10 = var3.a();
         String var11 = var3.b();
         ij var12 = (new ij$a(var9, var8, var10, var11, var4)).a("useod").a();
         ig$a.a(var5, var12, ij.b(var9));
      }

   }
}
