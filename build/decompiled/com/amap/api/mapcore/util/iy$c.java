package com.amap.api.mapcore.util;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

final class iy$c {
   private final String b;
   private final long[] c;
   private boolean d;
   private iy$a e;
   private long f;

   private iy$c(iy var1, String var2) {
      this.a = var1;
      this.b = var2;
      this.c = new long[iy.e(var1)];
   }

   public String a() throws IOException {
      StringBuilder var1 = new StringBuilder();
      long[] var2 = this.c;
      int var3 = var2.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         long var5 = var2[var4];
         var1.append(' ').append(var5);
      }

      return var1.toString();
   }

   private void a(String[] var1) throws IOException {
      if (var1.length != iy.e(this.a)) {
         throw this.b(var1);
      } else {
         try {
            for(int var2 = 0; var2 < var1.length; ++var2) {
               this.c[var2] = Long.parseLong(var1[var2]);
            }

         } catch (NumberFormatException var3) {
            throw this.b(var1);
         }
      }
   }

   private IOException b(String[] var1) throws IOException {
      throw new IOException("unexpected journal line: " + Arrays.toString(var1));
   }

   public File a(int var1) {
      return new File(iy.f(this.a), this.b + "." + var1);
   }

   public File b(int var1) {
      return new File(iy.f(this.a), this.b + "." + var1 + ".tmp");
   }
}
