package com.amap.api.mapcore.util;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

class bw {
   RandomAccessFile a;

   public bw() throws IOException {
      this("", 0L);
   }

   public bw(String var1, long var2) throws IOException {
      File var4 = new File(var1);
      if (!var4.exists()) {
         if (!var4.getParentFile().exists()) {
            var4.getParentFile().mkdirs();
         }

         try {
            if (!var4.exists()) {
               var4.createNewFile();
            }
         } catch (IOException var6) {
            ht.c(var6, "FileAccessI", "create");
            var6.printStackTrace();
         }
      }

      this.a = new RandomAccessFile(var1, "rw");
      this.a.seek(var2);
   }

   public synchronized int a(byte[] var1) throws IOException {
      boolean var2 = true;
      this.a.write(var1);
      int var3 = var1.length;
      return var3;
   }

   public void a() {
      if (this.a != null) {
         try {
            this.a.close();
         } catch (IOException var2) {
            var2.printStackTrace();
         }

         this.a = null;
      }

   }
}
