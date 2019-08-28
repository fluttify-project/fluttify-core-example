package com.amap.api.mapcore.util;

import android.graphics.Bitmap;
import com.autonavi.amap.mapcore.IPoint;
import java.nio.FloatBuffer;

public class du$a implements Cloneable {
   public int a;
   public int b;
   public int c;
   public int d;
   public IPoint e;
   public int f = 0;
   public boolean g = false;
   public FloatBuffer h = null;
   public Bitmap i = null;
   public fl$a j = null;
   public int k = 0;
   private u l;
   private ah m;
   private fj n;

   public du$a(int var1, int var2, int var3, int var4, u var5, ah var6, fj var7) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = var4;
      this.l = var5;
      this.m = var6;
      this.n = var7;
   }

   public du$a(du$a var1) {
      this.a = var1.a;
      this.b = var1.b;
      this.c = var1.c;
      this.d = var1.d;
      this.e = var1.e;
      this.h = var1.h;
      this.k = 0;
      this.m = var1.m;
      this.l = var1.l;
      this.n = var1.n;
   }

   public du$a a() {
      du$a var1 = null;

      try {
         var1 = (du$a)super.clone();
         var1.a = this.a;
         var1.b = this.b;
         var1.c = this.c;
         var1.d = this.d;
         var1.e = (IPoint)this.e.clone();
         var1.h = this.h.asReadOnlyBuffer();
         this.k = 0;
      } catch (CloneNotSupportedException var3) {
         var3.printStackTrace();
      }

      return new du$a(this);
   }

   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof du$a)) {
         return false;
      } else {
         du$a var2 = (du$a)var1;
         return this.a == var2.a && this.b == var2.b && this.c == var2.c && this.d == var2.d;
      }
   }

   public int hashCode() {
      return this.a * 7 + this.b * 11 + this.c * 13 + this.d;
   }

   public String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append(this.a);
      var1.append("-");
      var1.append(this.b);
      var1.append("-");
      var1.append(this.c);
      var1.append("-");
      var1.append(this.d);
      return var1.toString();
   }

   public synchronized void a(Bitmap var1) {
      if (var1 != null && !var1.isRecycled()) {
         try {
            this.j = null;
            this.i = var1;
            this.l.setRunLowFrame(false);
         } catch (Throwable var3) {
            ht.c(var3, "TileOverlayDelegateImp", "setBitmap");
            var3.printStackTrace();
            if (this.k < 3) {
               ++this.k;
               if (this.n != null) {
                  this.n.a(true, this);
               }
            }
         }
      } else if (this.k < 3) {
         ++this.k;
         if (this.n != null) {
            this.n.a(true, this);
         }
      }

   }

   public void b() {
      try {
         fl.a(this);
         if (this.g) {
            this.m.a(this.f);
         }

         this.g = false;
         this.f = 0;
         if (this.i != null && !this.i.isRecycled()) {
            this.i.recycle();
         }

         this.i = null;
         if (this.h != null) {
            this.h.clear();
         }

         this.h = null;
         this.j = null;
         this.k = 0;
      } catch (Throwable var2) {
         var2.printStackTrace();
      }

   }
}
