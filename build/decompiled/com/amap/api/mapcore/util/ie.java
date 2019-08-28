package com.amap.api.mapcore.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import java.io.Closeable;
import java.io.File;
import java.io.RandomAccessFile;

public class ie implements jf$a {
   protected if a;
   private jf f;
   protected hf b;
   protected String c;
   protected RandomAccessFile d;
   protected Context e;

   public ie(Context var1, if var2, hf var3) {
      try {
         this.e = var1.getApplicationContext();
         this.b = var3;
         if (var2 == null) {
            return;
         }

         this.a = var2;
         this.f = new jf(new iq(this.a));
         this.c = ig.a(var1, this.a.b);
      } catch (Throwable var5) {
         in.a(var5, "dDownLoad", "DexDownLoad()");
      }

   }

   public void a() {
      try {
         il.b().a().submit(new ie$a(this, 0));
      } catch (Throwable var2) {
         in.a(var2, "dDownLoad", "startDownload()");
      }

   }

   boolean b() {
      boolean var1 = this.a != null && this.a.d();

      try {
         if (!hg.b(this.e) && in.a(this.b, this.a) && in.a(this.a) && in.a(this.e, var1) && !in.a(this.e, this.a, this.b) && in.a(this.e, this.b, this.a)) {
            ig.b(this.e, this.b.a());
            return true;
         } else {
            return false;
         }
      } catch (Throwable var3) {
         in.a(var3, "dDownLoad", "isNeedDownload()");
         return false;
      }
   }

   public void onDownload(byte[] var1, long var2) {
      try {
         if (this.d == null) {
            File var4 = new File(this.c);
            File var5 = var4.getParentFile();
            if (!var5.exists()) {
               var5.mkdirs();
            }

            this.d = new RandomAccessFile(var4, "rw");
         }

         this.d.seek(var2);
         this.d.write(var1);
      } catch (Throwable var6) {
         in.a(var6, "dDownLoad", "onDownload()");
      }

   }

   public void onException(Throwable var1) {
      try {
         in.a((Closeable)this.d);
      } catch (Throwable var3) {
         var3.printStackTrace();
      }

   }

   public void onFinish() {
      try {
         if (this.d == null) {
            return;
         }

         in.a((Closeable)this.d);
         String var1 = this.a.b();
         if (in.b(this.c, var1)) {
            this.a(var1);
            js var2 = new js(this.e, this.b.a(), this.b.b(), "O008");
            String var3 = "{\"param_int_first\":1}";
            var2.a(var3);
            jt.a(var2, this.e);
         } else {
            try {
               File var6 = new File(this.c);
               var6.delete();
            } catch (Throwable var4) {
               in.a(var4, "dDownLoad", "onFinish");
            }
         }
      } catch (Throwable var5) {
         in.a(var5, "dDownLoad", "onFinish()");
      }

   }

   public void onStop() {
   }

   private void a(String var1) {
      String var2 = this.a.c();
      hy var3 = new hy(this.e, ii.a());
      ij var4 = (new ij$a(this.a.b, var1, this.a.c, var2, this.a.e)).a("copy").a();
      ig$a.a(var3, var4, ij.a(this.a.b, this.a.c, var2, this.a.e));
      this.a(this.e, this.a.c);

      try {
         il.b().a().submit(new ie$a(this, var3, 2));
      } catch (Throwable var6) {
         in.a(var6, "dDownLoad", "onFinish1");
      }

   }

   private void a(Context var1, String var2) {
      try {
         SharedPreferences var3 = var1.getSharedPreferences(var2, 0);
         Editor var4 = var3.edit();
         var4.clear();
         var4.commit();
      } catch (Throwable var5) {
         in.a(var5, "dDownLoad", "clearMarker()");
      }

   }
}
