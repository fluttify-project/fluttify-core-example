package com.amap.api.mapcore.util;

import android.content.Context;
import android.text.TextUtils;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/** @deprecated */
@Deprecated
public class he extends Thread implements jf$a {
   private jf h;
   protected he$a a;
   protected RandomAccessFile b;
   protected String c;
   protected String d;
   protected String e;
   protected Context f;
   private static String i = "sodownload";
   private static String j = "sofail";
   protected static boolean g = false;

   public he(Context var1, String var2, String var3, String var4) {
      this.f = var1;
      this.e = var4;
      this.c = a(var1, var2 + "temp.so");
      this.d = a(var1, "libwgs2gcj.so");
      this.a = new he$a(var3);
      this.h = new jf(this.a);
   }

   public static String a(Context var0, String var1) {
      String var2 = var0.getFilesDir().getAbsolutePath() + File.separator + "libso" + File.separator + var1;
      return var2;
   }

   public static void a(Context var0, Throwable var1) {
      if (var1 instanceof UnsatisfiedLinkError || var1 instanceof LinkageError) {
         g = true;

         try {
            File var2 = new File(a(var0, "libwgs2gcj.so"));
            if (var2.exists()) {
               var2.delete();
            }
         } catch (Throwable var3) {
            ;
         }
      }

   }

   private static String b(Context var0, String var1) {
      return a(var0, var1);
   }

   public void a() {
      if (this.a != null && !TextUtils.isEmpty(this.a.getURL()) && this.a.getURL().contains("libJni_wgs2gcj.so") && this.a.getURL().contains(hg.a(this.f))) {
         File var1 = new File(this.d);
         if (!var1.exists()) {
            this.start();
         }
      }
   }

   public void run() {
      try {
         File var1 = new File(b(this.f, "tempfile"));
         if (var1.exists()) {
            var1.delete();
         }

         this.h.a(this);
      } catch (Throwable var2) {
         ht.c(var2, "sdl", "run");
         this.b();
      }

   }

   public void onDownload(byte[] var1, long var2) {
      try {
         if (this.b == null) {
            File var4 = new File(this.c);
            File var5 = var4.getParentFile();
            if (!var5.exists()) {
               var5.mkdirs();
            }

            try {
               this.b = new RandomAccessFile(var4, "rw");
            } catch (FileNotFoundException var8) {
               ht.c(var8, "sdl", "oDd");
               this.b();
            }
         }

         if (this.b == null) {
            return;
         }

         try {
            this.b.seek(var2);
            this.b.write(var1);
         } catch (IOException var7) {
            this.b();
            ht.c(var7, "sdl", "oDd");
         }
      } catch (Throwable var9) {
         this.b();
         ht.c(var9, "sdl", "oDd");
      }

   }

   public void onStop() {
      this.b();
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
            var3.renameTo(new File(this.d));
         } else {
            this.b();
         }
      } catch (Throwable var4) {
         this.b();
         var2 = new File(this.d);
         if (var2.exists()) {
            var2.delete();
         }

         ht.c(var4, "sdl", "ofs");
      }

   }

   public void onException(Throwable var1) {
      try {
         if (this.b != null) {
            this.b.close();
         }

         this.b();
         File var2 = new File(b(this.f, "tempfile"));
         if (!var2.exists()) {
            try {
               File var3 = var2.getParentFile();
               if (!var3.exists()) {
                  var3.mkdir();
               }

               var2.createNewFile();
            } catch (Throwable var4) {
               ht.c(var4, "sdl", "oe");
            }
         }
      } catch (Throwable var5) {
         ht.c(var5, "sdl", "oe");
      }

   }

   protected void b() {
      File var1 = new File(this.c);
      if (var1.exists()) {
         var1.delete();
      }

   }
}
