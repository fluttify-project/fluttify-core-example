package com.amap.api.mapcore.util;

import android.content.Context;
import android.text.TextUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.RandomAccessFile;

public class gy extends he {
   private boolean h = false;
   private boolean i = true;

   public gy(Context var1, String var2, String var3, String var4) {
      super(var1, var2, var3, var4);
   }

   public void a(boolean var1) {
      this.i = var1;
   }

   public void a() {
      if (this.a != null && !TextUtils.isEmpty(this.a.getURL()) && this.a.getURL().endsWith("png") && this.a.getURL().contains(hg.a(this.f))) {
         if (!hg.b(this.f)) {
            if (this.h || !hg.a(this.f, this.i)) {
               if (!g) {
                  File var1 = new File(this.d);
                  if (!var1.exists()) {
                     this.start();
                  }
               }
            }
         }
      }
   }

   public void onFinish() {
      File var2;
      try {
         if (this.b != null) {
            this.b.close();
         }

         String var1 = hc.a(this.c);
         if (var1 != null && var1.equalsIgnoreCase(this.e)) {
            var2 = new File(this.d);
            if (var2.exists()) {
               this.b();
               return;
            }

            File var3 = new File(this.c);
            if (var3 == null || !var3.exists()) {
               return;
            }

            this.a(var3, var2);
            this.b();
         } else {
            this.b();
         }
      } catch (Throwable var4) {
         this.b();
         var2 = new File(this.d);
         if (var2.exists()) {
            var2.delete();
         }

         hq.a(var4, "sdl", "ofs");
      }

   }

   private void a(File var1, File var2) {
      FileInputStream var3 = null;

      try {
         var3 = new FileInputStream(var1);
         byte[] var4 = new byte[32];
         var3.read(var4);
         RandomAccessFile var5 = new RandomAccessFile(var2, "rw");
         byte[] var6 = new byte[1024];
         boolean var7 = true;

         int var11;
         for(int var8 = 0; (var11 = var3.read(var6)) > 0; var8 += var11) {
            if (var11 == 1024) {
               var5.seek((long)var8);
               var5.write(var6);
            } else {
               byte[] var9 = new byte[var11];
               System.arraycopy(var6, 0, var9, 0, var11);
               var5.seek((long)var8);
               var5.write(var9);
            }
         }

         var3.close();
         var5.close();
         var1.delete();
      } catch (Throwable var10) {
         var10.printStackTrace();
      }

   }
}
