package com.amap.api.mapcore.util;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

class iy$a$a extends FilterOutputStream {
   private iy$a$a(iy$a var1, OutputStream var2) {
      super(var2);
      this.a = var1;
   }

   public void write(int var1) {
      try {
         this.out.write(var1);
      } catch (IOException var3) {
         iy$a.a(this.a, true);
      }

   }

   public void write(byte[] var1, int var2, int var3) {
      try {
         this.out.write(var1, var2, var3);
      } catch (IOException var5) {
         iy$a.a(this.a, true);
      }

   }

   public void close() {
      try {
         this.out.close();
      } catch (IOException var2) {
         iy$a.a(this.a, true);
      }

   }

   public void flush() {
      try {
         this.out.flush();
      } catch (IOException var2) {
         iy$a.a(this.a, true);
      }

   }
}
