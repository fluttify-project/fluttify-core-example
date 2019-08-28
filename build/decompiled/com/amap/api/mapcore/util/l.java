package com.amap.api.mapcore.util;

import android.content.Context;
import java.io.File;
import java.io.RandomAccessFile;

public class l implements jf$a {
   private final Context b;
   private RandomAccessFile c;
   private jl d;
   private String e;
   l$a a;

   public l(Context var1, l$a var2, hf var3) {
      this.b = var1.getApplicationContext();
      if (var2 != null) {
         this.a = var2;
         this.d = new jl(new l$b(var2));
         this.e = var2.c();
      }
   }

   public void a() {
      try {
         if (this.b() && this.d != null) {
            this.d.a(this);
         }
      } catch (Throwable var2) {
         ht.c(var2, "AuthTaskDownload", "startDownload()");
      }

   }

   private boolean b() {
      l$c var1 = this.a.e();
      if (var1 != null && var1.c()) {
         String var2 = ey.a(this.b, var1.a(), var1.b(), "");
         if (var2.equalsIgnoreCase(this.a.b())) {
            return false;
         }
      }

      return true;
   }

   public void onDownload(byte[] var1, long var2) {
      try {
         if (this.c == null) {
            File var4 = new File(this.e);
            File var5 = var4.getParentFile();
            if (!var5.exists()) {
               var5.mkdirs();
            }

            this.c = new RandomAccessFile(var4, "rw");
         }

         this.c.seek(var2);
         this.c.write(var1);
      } catch (Throwable var6) {
         ht.c(var6, "AuthTaskDownload", "onDownload()");
      }

   }

   public void onStop() {
   }

   public void onFinish() {
      try {
         if (this.c == null) {
            return;
         }

         try {
            this.c.close();
         } catch (Throwable var12) {
            ht.c(var12, "AuthTaskDownload", "onFinish3");
         }

         String var1 = this.a.b();
         String var2 = hc.a(this.e);
         if (var2 != null && var1.equalsIgnoreCase(var2)) {
            String var14 = this.a.d();

            try {
               bx var4 = new bx();
               File var5 = new File(this.e);
               long var6 = cd.a(var5);
               var4.a(var5, new File(var14), -1L, var6, (bx$a)null);
               l$c var8 = this.a.e();
               if (var8 != null && var8.c()) {
                  ey.a(this.b, var8.a(), var8.b(), (Object)var2);
               }

               File var9 = new File(this.e);
               var9.delete();
            } catch (Throwable var11) {
               ht.c(var11, "AuthTaskDownload", "onFinish1");
            }
         } else {
            try {
               File var3 = new File(this.e);
               var3.delete();
            } catch (Throwable var10) {
               ht.c(var10, "AuthTaskDownload", "onFinish");
            }
         }
      } catch (Throwable var13) {
         ht.c(var13, "AuthTaskDownload", "onFinish()");
      }

   }

   public void onException(Throwable var1) {
      try {
         if (this.c == null) {
            return;
         }

         this.c.close();
      } catch (Throwable var3) {
         ht.c(var3, "AuthTaskDownload", "onException()");
      }

   }
}
