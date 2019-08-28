package com.amap.api.mapcore.util;

import android.content.Context;
import com.amap.api.maps.AMapException;
import com.amap.api.maps.MapsInitializer;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

public class ca implements jf$a {
   cb a = null;
   long b = 0L;
   long c = 0L;
   long d;
   boolean e = true;
   private Context i;
   bv f;
   private cg j;
   private String k;
   private jl l;
   private bw m;
   long g = 0L;
   private boolean n = false;
   ca$a h;

   public ca(cb var1, String var2, Context var3, cg var4) throws IOException {
      this.f = bv.a(var3.getApplicationContext());
      this.a = var1;
      this.i = var3;
      this.k = var2;
      this.j = var4;
      this.d();
   }

   private void c() throws IOException {
      ch var1 = new ch(this.k);
      var1.setConnectionTimeout(1800000);
      var1.setSoTimeout(1800000);
      this.l = new jl(var1, this.b, this.c, MapsInitializer.getProtocol() == 2);
      this.m = new bw(this.a.b() + File.separator + this.a.c(), this.b);
   }

   private void d() {
      String var1 = this.a.b() + this.a.c();
      File var2 = new File(var1);
      if (var2.exists()) {
         this.e = false;
         this.b = var2.length();

         try {
            this.d = this.g();
            this.c = this.d;
         } catch (IOException var4) {
            if (this.j != null) {
               this.j.a(cg$a.c);
            }
         }
      } else {
         this.b = 0L;
         this.c = 0L;
      }

   }

   public void a() {
      try {
         boolean var1 = fi.d(this.i);
         if (!var1) {
            if (this.j != null) {
               this.j.a(cg$a.b);
            }

            return;
         }

         this.f();
         if (gw.a != 1) {
            if (this.j != null) {
               this.j.a(cg$a.a);
            }

            return;
         }

         if (!this.e()) {
            this.e = true;
         }

         if (this.e) {
            this.d = this.g();
            byte var2 = -2;
            if (this.d == -1L) {
               cd.a("File Length is not known!");
            } else if (this.d == (long)var2) {
               cd.a("File is not access!");
            } else {
               this.c = this.d;
            }

            this.b = 0L;
         }

         if (this.j != null) {
            this.j.n();
         }

         if (this.b >= this.c) {
            this.onFinish();
         } else {
            this.c();
            this.l.a(this);
         }
      } catch (AMapException var3) {
         ht.c(var3, "SiteFileFetch", "download");
         if (this.j != null) {
            this.j.a(cg$a.a);
         }
      } catch (IOException var4) {
         if (this.j != null) {
            this.j.a(cg$a.c);
         }
      }

   }

   private boolean e() {
      String var1 = this.a.b() + File.separator + this.a.c();
      File var2 = new File(var1);
      return var2.length() >= 10L;
   }

   private void f() throws AMapException {
      if (gw.a != 1) {
         byte var1 = 3;

         for(int var2 = 0; var2 < var1; ++var2) {
            try {
               boolean var3 = gw.a(this.i, fi.e());
               if (var3) {
                  break;
               }
            } catch (Throwable var4) {
               ht.c(var4, "SiteFileFetch", "authOffLineDownLoad");
               var4.printStackTrace();
            }
         }
      }

   }

   private long g() throws IOException {
      int var1 = -1;
      String var2 = this.a.a();
      Map var3 = null;

      try {
         var3 = jh.b().b(new ca$b(var2), MapsInitializer.getProtocol() == 2);
      } catch (gt var8) {
         var8.printStackTrace();
      }

      String var4 = "Content-Length";
      if (var3 != null) {
         Iterator var5 = var3.keySet().iterator();

         while(var5.hasNext()) {
            String var6 = (String)var5.next();
            if (var4.equalsIgnoreCase(var6)) {
               String var7 = (String)var3.get(var6);
               var1 = Integer.parseInt(var7);
            }
         }
      }

      return (long)var1;
   }

   private void h() {
      long var1 = System.currentTimeMillis();
      short var3 = 500;
      if (this.a != null && var1 - this.g > (long)var3) {
         this.i();
         this.g = var1;
         this.a(this.b);
      }

   }

   private void i() {
      this.f.a(this.a.e(), this.a.d(), this.d, this.b, this.c);
   }

   private void a(long var1) {
      if (this.d > 0L && this.j != null) {
         this.j.a(this.d, var1);
         this.g = System.currentTimeMillis();
      }

   }

   public void b() {
      if (this.l != null) {
         this.l.a();
      }

   }

   public void onStop() {
      if (!this.n) {
         if (this.j != null) {
            this.j.p();
         }

         this.i();
      }
   }

   public void onFinish() {
      this.h();
      if (this.j != null) {
         this.j.o();
      }

      if (this.m != null) {
         this.m.a();
      }

      if (this.h != null) {
         this.h.c();
      }

   }

   public void onException(Throwable var1) {
      this.n = true;
      this.b();
      if (this.j != null) {
         this.j.a(cg$a.b);
      }

      if (!(var1 instanceof IOException)) {
         if (this.m != null) {
            this.m.a();
         }

      }
   }

   public void onDownload(byte[] var1, long var2) {
      try {
         this.m.a(var1);
      } catch (IOException var5) {
         var5.printStackTrace();
         ht.c(var5, "fileAccessI", "fileAccessI.write(byte[] data)");
         if (this.j != null) {
            this.j.a(cg$a.c);
         }

         if (this.l != null) {
            this.l.a();
         }

         return;
      }

      this.b = var2;
      this.h();
   }

   public void a(ca$a var1) {
      this.h = var1;
   }
}
