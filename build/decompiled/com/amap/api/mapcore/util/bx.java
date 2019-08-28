package com.amap.api.mapcore.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class bx {
   public bx() {
   }

   public long a(File var1, File var2, long var3, long var5, bx$a var7) {
      if (var3 == 0L) {
         if (var7 != null) {
            var7.a("", "", -1);
         }

         return 0L;
      } else {
         String var8 = var1.getAbsolutePath();
         String var9 = var2.getAbsolutePath();

         try {
            if (var1.isDirectory()) {
               if (!var2.exists() && !var2.mkdirs()) {
                  throw new IOException("Cannot create dir " + var2.getAbsolutePath());
               }

               String[] var10 = var1.list();
               if (var10 != null) {
                  for(int var11 = 0; var11 < var10.length; ++var11) {
                     var3 = this.a(new File(var1, var10[var11]), new File(new File(var2, var1.getName()), var10[var11]), var3, var5, var7);
                  }
               }
            } else {
               File var17 = var2.getParentFile();
               if (var17 != null && !var17.exists() && !var17.mkdirs()) {
                  throw new IOException("Cannot create dir " + var17.getAbsolutePath());
               }

               if (var7 != null && var3 <= 0L) {
                  var7.a(var8, var9);
               }

               FileInputStream var18 = new FileInputStream(var1);
               FileOutputStream var12 = new FileOutputStream(var2);
               byte[] var13 = new byte[1024];

               int var14;
               while((var14 = var18.read(var13)) > 0) {
                  var12.write(var13, 0, var14);
                  var3 += (long)var14;
                  if (var7 != null) {
                     float var15 = this.a(var3, var5);
                     var7.a(var8, var9, var15);
                  }
               }

               var18.close();
               var12.flush();
               var12.close();
               if (var7 != null && var3 >= var5 - 1L) {
                  var7.b(var8, var9);
               }
            }
         } catch (Exception var16) {
            var16.printStackTrace();
            if (var7 != null) {
               var7.a(var8, var9, -1);
            }
         }

         return var3;
      }
   }

   private float a(long var1, long var3) {
      return (float)var1 / (float)var3 * 100.0F;
   }
}
