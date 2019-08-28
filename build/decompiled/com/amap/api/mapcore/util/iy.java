package com.amap.api.mapcore.util;

import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class iy implements Closeable {
   static final Pattern a = Pattern.compile("[a-z0-9_-]{1,120}");
   private final File c;
   private final File d;
   private final File e;
   private final File f;
   private final int g;
   private long h;
   private final int i;
   private long j = 0L;
   private Writer k;
   private int l = 1000;
   private final LinkedHashMap<String, iy$c> m = new LinkedHashMap(0, 0.75F, true);
   private int n;
   private iz o;
   private long p = 0L;
   private static final ThreadFactory q = new iy$1();
   static ThreadPoolExecutor b;
   private final Callable<Void> r = new iy$2(this);
   private static final OutputStream s;

   public void a(int var1) {
      if (var1 < 10) {
         var1 = 10;
      } else if (var1 > 10000) {
         var1 = 10000;
      }

      this.l = var1;
   }

   public static void a() {
      if (b != null && !b.isShutdown()) {
         b.shutdown();
      }

   }

   public static ThreadPoolExecutor b() {
      try {
         if (b == null || b.isShutdown()) {
            b = new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(256), q);
         }
      } catch (Throwable var1) {
         var1.printStackTrace();
      }

      return b;
   }

   private iy(File var1, int var2, int var3, long var4) {
      this.c = var1;
      this.g = var2;
      this.d = new File(var1, "journal");
      this.e = new File(var1, "journal.tmp");
      this.f = new File(var1, "journal.bkp");
      this.i = var3;
      this.h = var4;
   }

   public static iy a(File var0, int var1, int var2, long var3) throws IOException {
      if (var3 <= 0L) {
         throw new IllegalArgumentException("maxSize <= 0");
      } else if (var2 <= 0) {
         throw new IllegalArgumentException("valueCount <= 0");
      } else {
         File var5 = new File(var0, "journal.bkp");
         if (var5.exists()) {
            File var6 = new File(var0, "journal");
            if (var6.exists()) {
               var5.delete();
            } else {
               a(var5, var6, false);
            }
         }

         iy var9 = new iy(var0, var1, var2, var3);
         if (var9.d.exists()) {
            try {
               var9.h();
               var9.i();
               var9.k = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(var9.d, true), jb.a));
               return var9;
            } catch (Throwable var8) {
               var9.f();
            }
         }

         var0.mkdirs();
         var9 = new iy(var0, var1, var2, var3);
         var9.j();
         return var9;
      }
   }

   private void h() throws IOException {
      ja var1 = new ja(new FileInputStream(this.d), jb.a);

      try {
         String var2 = var1.a();
         String var3 = var1.a();
         String var4 = var1.a();
         String var5 = var1.a();
         String var6 = var1.a();
         if ("libcore.io.DiskLruCache".equals(var2) && "1".equals(var3) && Integer.toString(this.g).equals(var4) && Integer.toString(this.i).equals(var5) && "".equals(var6)) {
            int var7 = 0;

            while(true) {
               try {
                  this.d(var1.a());
                  ++var7;
               } catch (EOFException var13) {
                  this.n = var7 - this.m.size();
                  return;
               }
            }
         } else {
            throw new IOException("unexpected journal header: [" + var2 + ", " + var3 + ", " + var5 + ", " + var6 + "]");
         }
      } finally {
         jb.a((Closeable)var1);
      }
   }

   private void d(String var1) throws IOException {
      int var2 = var1.indexOf(32);
      if (var2 == -1) {
         throw new IOException("unexpected journal line: " + var1);
      } else {
         int var3 = var2 + 1;
         int var4 = var1.indexOf(32, var3);
         String var5;
         if (var4 == -1) {
            var5 = var1.substring(var3);
            if (var2 == "REMOVE".length() && var1.startsWith("REMOVE")) {
               this.m.remove(var5);
               return;
            }
         } else {
            var5 = var1.substring(var3, var4);
         }

         iy$c var6 = (iy$c)this.m.get(var5);
         if (var6 == null) {
            var6 = new iy$c(this, var5, (iy$1)null);
            this.m.put(var5, var6);
         }

         if (var4 != -1 && var2 == "CLEAN".length() && var1.startsWith("CLEAN")) {
            String[] var7 = var1.substring(var4 + 1).split(" ");
            iy$c.a(var6, true);
            iy$c.a(var6, (iy$a)null);
            iy$c.a(var6, var7);
         } else if (var4 == -1 && var2 == "DIRTY".length() && var1.startsWith("DIRTY")) {
            iy$c.a(var6, new iy$a(this, var6, (iy$1)null));
         } else if (var4 != -1 || var2 != "READ".length() || !var1.startsWith("READ")) {
            throw new IOException("unexpected journal line: " + var1);
         }

      }
   }

   private void i() throws IOException {
      a(this.e);
      Iterator var1 = this.m.values().iterator();

      while(true) {
         while(var1.hasNext()) {
            iy$c var2 = (iy$c)var1.next();
            int var3;
            if (iy$c.a(var2) == null) {
               for(var3 = 0; var3 < this.i; ++var3) {
                  this.j += iy$c.b(var2)[var3];
               }
            } else {
               iy$c.a(var2, (iy$a)null);

               for(var3 = 0; var3 < this.i; ++var3) {
                  a(var2.a(var3));
                  a(var2.b(var3));
               }

               var1.remove();
            }
         }

         return;
      }
   }

   private synchronized void j() throws IOException {
      if (this.k != null) {
         this.k.close();
      }

      BufferedWriter var1 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.e), jb.a));

      try {
         var1.write("libcore.io.DiskLruCache");
         var1.write("\n");
         var1.write("1");
         var1.write("\n");
         var1.write(Integer.toString(this.g));
         var1.write("\n");
         var1.write(Integer.toString(this.i));
         var1.write("\n");
         var1.write("\n");
         Iterator var2 = this.m.values().iterator();

         while(var2.hasNext()) {
            iy$c var3 = (iy$c)var2.next();
            if (iy$c.a(var3) != null) {
               var1.write("DIRTY " + iy$c.c(var3) + '\n');
            } else {
               var1.write("CLEAN " + iy$c.c(var3) + var3.a() + '\n');
            }
         }
      } finally {
         var1.close();
      }

      if (this.d.exists()) {
         a(this.d, this.f, true);
      }

      a(this.e, this.d, false);
      this.f.delete();
      this.k = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.d, true), jb.a));
   }

   private static void a(File var0) throws IOException {
      if (var0.exists() && !var0.delete()) {
         throw new IOException();
      }
   }

   private static void a(File var0, File var1, boolean var2) throws IOException {
      if (var2) {
         a(var1);
      }

      if (!var0.renameTo(var1)) {
         throw new IOException();
      }
   }

   public synchronized iy$b a(String var1) throws IOException {
      this.l();
      this.e(var1);
      iy$c var2 = (iy$c)this.m.get(var1);
      if (var2 == null) {
         return null;
      } else if (!iy$c.d(var2)) {
         return null;
      } else {
         InputStream[] var3 = new InputStream[this.i];

         try {
            for(int var4 = 0; var4 < this.i; ++var4) {
               var3[var4] = new FileInputStream(var2.a(var4));
            }
         } catch (FileNotFoundException var6) {
            for(int var5 = 0; var5 < this.i && var3[var5] != null; ++var5) {
               jb.a((Closeable)var3[var5]);
            }

            return null;
         }

         ++this.n;
         this.k.append("READ " + var1 + '\n');
         if (this.k()) {
            b().submit(this.r);
         }

         return new iy$b(this, var1, iy$c.e(var2), var3, iy$c.b(var2), (iy$1)null);
      }
   }

   public iy$a b(String var1) throws IOException {
      return this.a(var1, -1L);
   }

   private synchronized iy$a a(String var1, long var2) throws IOException {
      this.l();
      this.e(var1);
      iy$c var4 = (iy$c)this.m.get(var1);
      if (var2 == -1L || var4 != null && iy$c.e(var4) == var2) {
         if (var4 == null) {
            var4 = new iy$c(this, var1, (iy$1)null);
            this.m.put(var1, var4);
         } else if (iy$c.a(var4) != null) {
            return null;
         }

         iy$a var5 = new iy$a(this, var4, (iy$1)null);
         iy$c.a(var4, var5);
         this.k.write("DIRTY " + var1 + '\n');
         this.k.flush();
         return var5;
      } else {
         return null;
      }
   }

   public File c() {
      return this.c;
   }

   private synchronized void a(iy$a var1, boolean var2) throws IOException {
      iy$c var3 = iy$a.a(var1);
      if (iy$c.a(var3) != var1) {
         throw new IllegalStateException();
      } else {
         int var4;
         if (var2 && !iy$c.d(var3)) {
            for(var4 = 0; var4 < this.i; ++var4) {
               if (!iy$a.b(var1)[var4]) {
                  var1.b();
                  throw new IllegalStateException("Newly created entry didn't create value for index " + var4);
               }

               if (!var3.b(var4).exists()) {
                  var1.b();
                  return;
               }
            }
         }

         for(var4 = 0; var4 < this.i; ++var4) {
            File var5 = var3.b(var4);
            if (var2) {
               if (var5.exists()) {
                  File var6 = var3.a(var4);
                  var5.renameTo(var6);
                  long var7 = iy$c.b(var3)[var4];
                  long var9 = var6.length();
                  iy$c.b(var3)[var4] = var9;
                  this.j = this.j - var7 + var9;
               }
            } else {
               a(var5);
            }
         }

         ++this.n;
         iy$c.a(var3, (iy$a)null);
         if (iy$c.d(var3) | var2) {
            iy$c.a(var3, true);
            this.k.write("CLEAN " + iy$c.c(var3) + var3.a() + '\n');
            if (var2) {
               iy$c.a(var3, (long)(this.p++));
            }
         } else {
            this.m.remove(iy$c.c(var3));
            this.k.write("REMOVE " + iy$c.c(var3) + '\n');
         }

         this.k.flush();
         if (this.j > this.h || this.k()) {
            b().submit(this.r);
         }

      }
   }

   private boolean k() {
      boolean var1 = true;
      return this.n >= 2000 && this.n >= this.m.size();
   }

   public synchronized boolean c(String var1) throws IOException {
      this.l();
      this.e(var1);
      iy$c var2 = (iy$c)this.m.get(var1);
      if (var2 != null && iy$c.a(var2) == null) {
         for(int var3 = 0; var3 < this.i; ++var3) {
            File var4 = var2.a(var3);
            if (var4.exists() && !var4.delete()) {
               throw new IOException("failed to delete " + var4);
            }

            this.j -= iy$c.b(var2)[var3];
            iy$c.b(var2)[var3] = 0L;
         }

         ++this.n;
         this.k.append("REMOVE " + var1 + '\n');
         this.m.remove(var1);
         if (this.k()) {
            b().submit(this.r);
         }

         return true;
      } else {
         return false;
      }
   }

   public synchronized boolean d() {
      return this.k == null;
   }

   private void l() {
      if (this.k == null) {
         throw new IllegalStateException("cache is closed");
      }
   }

   public synchronized void e() throws IOException {
      this.l();
      this.m();
      this.k.flush();
   }

   public synchronized void close() throws IOException {
      if (this.k != null) {
         Iterator var1 = (new ArrayList(this.m.values())).iterator();

         while(var1.hasNext()) {
            iy$c var2 = (iy$c)var1.next();
            if (iy$c.a(var2) != null) {
               iy$c.a(var2).b();
            }
         }

         this.m();
         this.k.close();
         this.k = null;
      }
   }

   private void m() throws IOException {
      while(this.j > this.h || this.m.size() > this.l) {
         Entry var1 = (Entry)this.m.entrySet().iterator().next();
         String var2 = (String)var1.getKey();
         this.c(var2);
         if (this.o != null) {
            this.o.a(var2);
         }
      }

   }

   public void f() throws IOException {
      this.close();
      jb.a(this.c);
   }

   private void e(String var1) {
      Matcher var2 = a.matcher(var1);
      if (!var2.matches()) {
         throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,120}: \"" + var1 + "\"");
      }
   }

   static {
      b = new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), q);
      s = new iy$3();
   }
}
