package com.amap.api.mapcore.util;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

public final class jb {
   public static final Charset a = Charset.forName("US-ASCII");
   static final Charset b = Charset.forName("UTF-8");

   static void a(File var0) throws IOException {
      File[] var1 = var0.listFiles();
      if (var1 == null) {
         throw new IOException("not a readable directory: " + var0);
      } else {
         File[] var2 = var1;
         int var3 = var1.length;

         for(int var4 = 0; var4 < var3; ++var4) {
            File var5 = var2[var4];
            if (var5.isDirectory()) {
               a(var5);
            }

            if (!var5.delete()) {
               throw new IOException("failed to delete file: " + var5);
            }
         }

      }
   }

   static void a(Closeable var0) {
      if (var0 != null) {
         try {
            var0.close();
         } catch (RuntimeException var2) {
            throw var2;
         } catch (Exception var3) {
            ;
         }
      }

   }
}
