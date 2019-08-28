package com.amap.api.mapcore.util;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;

public abstract class fl {
   private fm a;
   private fm$a b;
   private boolean e = false;
   protected boolean c = false;
   private final Object f = new Object();
   protected Resources d;
   private fl$c g = null;

   protected fl(Context var1) {
      this.d = var1.getResources();
   }

   public void a(boolean var1, du$a var2) {
      if (var2 != null) {
         try {
            Bitmap var3 = null;
            if (this.a != null) {
               StringBuilder var4 = new StringBuilder();
               var4.append(var2.a);
               var4.append("-");
               var4.append(var2.b);
               var4.append("-");
               var4.append(var2.c);
               var3 = this.a.a(var4.toString());
            }

            if (var3 != null) {
               var2.a(var3);
            } else {
               fl$a var6 = new fl$a(this, var2);
               var2.j = var6;
               var6.a(ei.c, new Boolean[]{var1});
            }
         } catch (Throwable var5) {
            var5.printStackTrace();
         }

      }
   }

   public void a(fm$a var1) {
      this.b = var1;
      this.a = fm.a(this.b);
      (new fl$b(this)).c(new Object[]{Integer.valueOf(1)});
   }

   protected abstract Bitmap a(Object var1);

   protected fm a() {
      return this.a;
   }

   public static void a(du$a var0) {
      fl$a var1 = c(var0);
      if (var1 != null) {
         var1.a(true);
      }

   }

   private static fl$a c(du$a var0) {
      return var0 != null ? var0.j : null;
   }

   public void a(boolean var1) {
      Object var2 = this.f;
      synchronized(this.f) {
         this.c = var1;
         if (!this.c) {
            try {
               this.f.notifyAll();
            } catch (Throwable var5) {
               var5.printStackTrace();
            }
         }

      }
   }

   protected void b() {
      if (this.a != null) {
         this.a.a();
      }

   }

   protected void c() {
      if (this.a != null) {
         this.a.b();
      }

   }

   protected void d() {
      if (this.a != null) {
         this.a.c();
      }

   }

   protected void b(boolean var1) {
      if (this.a != null) {
         this.a.a(var1);
         this.a = null;
      }

   }

   protected void e() {
      if (this.a != null) {
         this.a.a(false);
         this.a.a();
      }

   }

   public void f() {
      (new fl$b(this)).c(new Object[]{Integer.valueOf(0)});
   }

   public void c(boolean var1) {
      (new fl$b(this)).c(new Object[]{Integer.valueOf(3), var1});
   }

   public void a(fl$c var1) {
      this.g = var1;
   }

   public void a(String var1) {
      this.b.b(var1);
      (new fl$b(this)).c(new Object[]{Integer.valueOf(4)});
   }
}
