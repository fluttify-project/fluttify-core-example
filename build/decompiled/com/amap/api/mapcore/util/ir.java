package com.amap.api.mapcore.util;

import android.content.Context;
import android.text.TextUtils;
import dalvik.system.DexFile;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.security.PublicKey;
import java.security.cert.Certificate;
import java.util.Date;
import java.util.Map;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

class ir extends ip {
   private PublicKey i = null;

   ir(Context var1, hf var2, boolean var3) throws Exception {
      super(var1, var2, var3);
      String var4 = ig.b(var1, var2.a(), var2.b());
      String var5 = ig.a(var1);
      this.b(var4, var5);
      File var6 = new File(var4);
      il$a var7 = il.b().a(this.e);
      if (var7.b) {
         throw new Exception("file is downloading");
      } else {
         if (var3) {
            this.a(var4, var5 + File.separator + ig.a(var6.getName()));
            this.b(var1, var4, var5);
         }

      }
   }

   protected Class<?> findClass(String var1) throws ClassNotFoundException {
      Class var25;
      try {
         if (this.c == null) {
            throw new ClassNotFoundException(var1);
         }

         Class var2 = null;

         Map var3;
         try {
            var3 = this.b;
            synchronized(this.b) {
               var2 = (Class)this.b.get(var1);
            }
         } catch (Throwable var20) {
            in.a(var20, "dLoader", "findCl");
         }

         if (var2 != null) {
            var25 = var2;
            return var25;
         }

         if (this.g) {
            throw new ClassNotFoundException(var1);
         }

         this.h = true;
         var2 = this.c.loadClass(var1, this);
         DexFile var24 = this.c;
         synchronized(this.c) {
            this.c.notify();
         }

         this.h = false;
         if (var2 == null) {
            throw new ClassNotFoundException(var1);
         }

         try {
            var3 = this.b;
            synchronized(this.b) {
               this.b.put(var1, var2);
            }
         } catch (Throwable var17) {
            in.a(var17, "dLoader", "findCl");
         }

         var25 = var2;
      } catch (ClassNotFoundException var21) {
         throw var21;
      } catch (Throwable var22) {
         in.a(var22, "dLoader", "findCl");
         throw new ClassNotFoundException(var1);
      } finally {
         this.h = false;
      }

      return var25;
   }

   void a(String var1, String var2) throws Exception {
      il$a var3 = null;
      boolean var18 = false;

      label152: {
         try {
            var18 = true;
            if (this.c != null) {
               var18 = false;
               break label152;
            }

            var3 = il.b().a(this.e);
            if (var3 != null) {
               var3.a = true;
            }

            this.b();
            if (var3.b) {
               throw new Exception("file is downloading");
            }

            this.c = DexFile.loadDex(var1, var2, 0);
            var18 = false;
         } catch (Throwable var25) {
            in.a(var25, "dLoader", "loadFile");
            throw new Exception("load file fail");
         } finally {
            if (var18) {
               try {
                  if (var3 != null) {
                     var3.a = false;
                     synchronized(var3) {
                        var3.notify();
                     }
                  }
               } catch (Throwable var20) {
                  ;
               }

            }
         }

         try {
            if (var3 != null) {
               var3.a = false;
               synchronized(var3) {
                  var3.notify();
               }
            }
         } catch (Throwable var24) {
            ;
         }

         return;
      }

      try {
         if (var3 != null) {
            var3.a = false;
            synchronized(var3) {
               var3.notify();
            }
         }
      } catch (Throwable var22) {
         ;
      }

   }

   private void c() {
      if (this.i == null) {
         this.i = in.a();
      }
   }

   private void a(JarFile var1, JarEntry var2) throws IOException {
      InputStream var3 = null;

      try {
         var3 = var1.getInputStream(var2);
         byte[] var4 = new byte[8192];

         while(true) {
            if (var3.read(var4) > 0) {
               continue;
            }
         }
      } catch (Throwable var13) {
         in.a(var13, "DyLoader", "loadJa");
      } finally {
         try {
            in.a((Closeable)var3);
         } catch (Throwable var12) {
            var12.printStackTrace();
         }

      }

   }

   private boolean a(File var1, Certificate[] var2) {
      try {
         if (var2.length > 0) {
            int var3 = var2.length - 1;
            if (var3 >= 0) {
               var2[var3].verify(this.i);
               return true;
            }
         }
      } catch (Exception var4) {
         in.a((Throwable)var4, (String)"DyLoader", (String)"check");
      }

      return false;
   }

   private boolean a(File var1) {
      JarFile var2 = null;

      boolean var5;
      try {
         boolean var4;
         try {
            this.c();
            var2 = new JarFile(var1);
            JarEntry var3 = var2.getJarEntry("classes.dex");
            if (null == var3) {
               var4 = false;
               return var4;
            }

            this.a(var2, var3);
            Certificate[] var19 = var3.getCertificates();
            if (var19 != null) {
               var5 = this.a(var1, var19);
               return var5;
            }

            var5 = false;
         } catch (Throwable var17) {
            in.a(var17, "DyLoader", "verify");
            var4 = false;
            return var4;
         }
      } finally {
         try {
            if (var2 != null) {
               var2.close();
            }
         } catch (Throwable var16) {
            ;
         }

      }

      return var5;
   }

   private boolean a(hy var1, hf var2, String var3) {
      File var4 = new File(var3);
      return this.a(var4) ? in.a(var1, ig.a(this.a, var2.a(), var2.b()), var3, var2) : false;
   }

   private boolean a(hy var1, String var2, String var3) {
      String var4 = ig.a(this.a, var2);
      if (in.a(var1, var2, var4, this.e)) {
         return true;
      } else {
         ij var5 = ig$a.a(var1, var2);
         if (var5 != null) {
            return false;
         } else {
            if (!TextUtils.isEmpty(this.f)) {
               ij var6 = (new ij$a(var2, hc.a(var4), this.e.a(), this.e.b(), var3)).a("useod").a();
               ig$a.a(var1, var6, ij.b(var2));
            }

            return true;
         }
      }
   }

   private void b(String var1, String var2) throws Exception {
      if (TextUtils.isEmpty(var1) || TextUtils.isEmpty(var2)) {
         throw new Exception("dexPath or dexOutputDir is null.");
      }
   }

   private void b(Context var1, String var2, String var3) {
      try {
         il.b().a().submit(new ir$1(this, var1, var2, var3));
      } catch (Throwable var5) {
         ;
      }

   }

   private void a(hy var1, File var2) {
      ij var3 = ig$a.a(var1, var2.getName());
      if (var3 != null) {
         this.f = var3.e();
      }

   }

   private void b(hy var1, File var2) {
      this.d = false;
      ig.a(this.a, var1, var2.getName());
      String var3 = ig.a(this.a, var1, this.e);
      if (!TextUtils.isEmpty(var3)) {
         this.f = var3;
         ig.a(this.a, this.e);
      }

   }

   void a(Context var1, String var2, String var3) throws Exception {
      long var4 = (new Date()).getTime();

      try {
         hy var6 = new hy(var1, ii.a());
         File var7 = new File(var2);
         this.a(var6, var7);
         if (!this.a(var6, this.e, var7.getAbsolutePath())) {
            this.b(var6, var7);
         }

         if (!var7.exists()) {
            return;
         }

         String var8 = var3 + File.separator + ig.a(var7.getName());
         File var9 = new File(var8);
         if (var9.exists() && !this.a(var6, ig.a(var7.getName()), this.f)) {
            ig.a(this.a, this.e);
         }
      } catch (Throwable var10) {
         in.a(var10, "dLoader", "verifyD()");
      }

      long var11 = (new Date()).getTime();
   }
}
