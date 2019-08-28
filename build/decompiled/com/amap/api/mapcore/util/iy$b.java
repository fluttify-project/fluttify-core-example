package com.amap.api.mapcore.util;

import java.io.Closeable;
import java.io.InputStream;

public final class iy$b implements Closeable {
   private final String b;
   private final long c;
   private final InputStream[] d;
   private final long[] e;

   private iy$b(iy var1, String var2, long var3, InputStream[] var5, long[] var6) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = var5;
      this.e = var6;
   }

   public InputStream a(int var1) {
      return this.d[var1];
   }

   public void close() {
      InputStream[] var1 = this.d;
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         InputStream var4 = var1[var3];
         jb.a((Closeable)var4);
      }

   }
}
