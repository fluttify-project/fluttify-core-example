package com.amap.api.mapcore.util;

import android.text.TextUtils;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.CRC32;
import java.util.zip.CheckedInputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class cc {
   private cc$b a;

   public cc(bz var1, by var2) {
      this.a = new cc$b(var1, var2);
   }

   public void a() {
      if (this.a != null) {
         this.a.f();
      }

   }

   public void b() {
      if (this.a != null) {
         a(this.a);
      }

   }

   private static void a(cc$b var0) {
      if (var0 != null) {
         by var1 = var0.d();
         if (var1 != null) {
            var1.q();
         }

         String var2 = var0.a();
         String var3 = var0.b();
         if (!TextUtils.isEmpty(var2) && !TextUtils.isEmpty(var3)) {
            File var4 = new File(var2);
            if (!var4.exists()) {
               if (var0.e().a) {
                  if (var1 != null) {
                     var1.s();
                  }
               } else if (var1 != null) {
                  var1.r();
               }

            } else {
               File var5 = new File(var3);
               if (!var5.exists() && !var5.mkdirs()) {
                  ;
               }

               cc$1 var6 = new cc$1(var1);

               try {
                  if (var0.e().a && var1 != null) {
                     var1.s();
                  }

                  a(var4, var5, var6, var0);
                  if (var0.e().a) {
                     if (var1 != null) {
                        var1.s();
                     }
                  } else if (var1 != null) {
                     var1.b(var0.c());
                  }
               } catch (Throwable var8) {
                  if (var0.e().a) {
                     if (var1 != null) {
                        var1.s();
                     }
                  } else if (var1 != null) {
                     var1.r();
                  }
               }

            }
         } else {
            if (var0.e().a) {
               if (var1 != null) {
                  var1.s();
               }
            } else if (var1 != null) {
               var1.r();
            }

         }
      }
   }

   private static void a(File var0, File var1, cc$c var2, cc$b var3) throws Exception {
      StringBuffer var4 = new StringBuffer();
      cc$a var5 = var3.e();
      long var6 = 0L;
      FileInputStream var8;
      CheckedInputStream var9;
      ZipInputStream var10;
      if (var2 != null) {
         try {
            var8 = new FileInputStream(var0);
            var9 = new CheckedInputStream(var8, new CRC32());
            var10 = new ZipInputStream(var9);
            ZipEntry var11 = null;

            while((var11 = var10.getNextEntry()) != null) {
               if (var5 != null && var5.a) {
                  var10.closeEntry();
                  var10.close();
                  var9.close();
                  var8.close();
                  break;
               }

               if (!var11.isDirectory()) {
                  String var12 = var11.getName();
                  if (!a(var12)) {
                     var2.a();
                     break;
                  }

                  var4.append(var11.getName()).append(";");
               }

               long var15 = var11.getSize();
               var6 += var15;
               var10.closeEntry();
            }

            var3.a(var4.toString());
            var10.close();
            var9.close();
            var8.close();
         } catch (Exception var14) {
            var14.printStackTrace();
         }
      }

      var8 = new FileInputStream(var0);
      var9 = new CheckedInputStream(var8, new CRC32());
      var10 = new ZipInputStream(var9);
      a(var1, var10, var6, var2, var5);
      var10.close();
      var9.close();
      var8.close();
   }

   private static void a(File var0, ZipInputStream var1, long var2, cc$c var4, cc$a var5) throws Exception {
      ZipEntry var6 = null;
      int var7 = 0;

      for(boolean var8 = false; (var6 = var1.getNextEntry()) != null; var1.closeEntry()) {
         if (var5 != null && var5.a) {
            var1.closeEntry();
            return;
         }

         String var9 = var0.getPath() + File.separator + var6.getName();
         if (!a(var6.getName())) {
            if (var4 != null) {
               var4.a();
            }

            return;
         }

         File var10 = new File(var9);
         a(var10);
         if (var6.isDirectory()) {
            if (!var10.mkdirs()) {
               ;
            }
         } else {
            int var11 = a(var10, var1, (long)var7, var2, var4, var5);
            var7 += var11;
         }
      }

   }

   private static boolean a(String var0) {
      return !var0.contains("..") && !var0.contains("/") && !var0.contains("\\") && !var0.contains("%");
   }

   private static int a(File var0, ZipInputStream var1, long var2, long var4, cc$c var6, cc$a var7) throws Exception {
      int var8 = 0;
      BufferedOutputStream var9 = new BufferedOutputStream(new FileOutputStream(var0));
      byte[] var11 = new byte[1024];

      while(true) {
         long var12;
         do {
            do {
               do {
                  int var10;
                  if ((var10 = var1.read(var11, 0, 1024)) == -1) {
                     var9.close();
                     return var8;
                  }

                  if (var7 != null && var7.a) {
                     var9.close();
                     return var8;
                  }

                  var9.write(var11, 0, var10);
                  var8 += var10;
               } while(var4 <= 0L);
            } while(var6 == null);

            var12 = (var2 + (long)var8) * 100L / var4;
         } while(var7 != null && var7.a);

         var6.a(var12);
      }
   }

   private static void a(File var0) {
      File var1 = var0.getParentFile();
      if (!var1.exists()) {
         a(var1);
         if (!var1.mkdir()) {
            ;
         }
      }

   }
}
