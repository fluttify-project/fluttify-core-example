package com.amap.api.mapcore.util;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class jv extends kb {
   ByteArrayOutputStream a = new ByteArrayOutputStream();

   public jv() {
   }

   public jv(kb var1) {
      super(var1);
   }

   protected byte[] a(byte[] var1) {
      byte[] var2 = this.a.toByteArray();

      try {
         this.a.close();
      } catch (IOException var4) {
         var4.printStackTrace();
      }

      this.a = new ByteArrayOutputStream();
      return var2;
   }

   public void b(byte[] var1) {
      try {
         this.a.write(var1);
      } catch (Throwable var3) {
         var3.printStackTrace();
      }

   }
}
