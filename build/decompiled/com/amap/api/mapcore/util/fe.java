package com.amap.api.mapcore.util;

public class fe {
   public short[] a;
   public int b;
   public boolean c;

   public fe() {
      this(true, 16);
   }

   public fe(boolean var1, int var2) {
      this.c = var1;
      this.a = new short[var2];
   }

   public void a(short var1) {
      short[] var2 = this.a;
      if (this.b == var2.length) {
         var2 = this.d(Math.max(8, (int)((float)this.b * 1.75F)));
      }

      var2[this.b++] = var1;
   }

   public short a(int var1) {
      if (var1 >= this.b) {
         throw new IndexOutOfBoundsException("index can't be >= size: " + var1 + " >= " + this.b);
      } else {
         return this.a[var1];
      }
   }

   public short b(int var1) {
      if (var1 >= this.b) {
         throw new IndexOutOfBoundsException("index can't be >= size: " + var1 + " >= " + this.b);
      } else {
         short[] var2 = this.a;
         short var3 = var2[var1];
         --this.b;
         if (this.c) {
            System.arraycopy(var2, var1 + 1, var2, var1, this.b - var1);
         } else {
            var2[var1] = var2[this.b];
         }

         return var3;
      }
   }

   public void a() {
      this.b = 0;
   }

   public short[] c(int var1) {
      int var2 = this.b + var1;
      if (var2 > this.a.length) {
         this.d(Math.max(8, var2));
      }

      return this.a;
   }

   protected short[] d(int var1) {
      short[] var2 = new short[var1];
      short[] var3 = this.a;
      System.arraycopy(var3, 0, var2, 0, Math.min(this.b, var2.length));
      this.a = var2;
      return var2;
   }

   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof fe)) {
         return false;
      } else {
         fe var2 = (fe)var1;
         int var3 = this.b;
         if (var3 != var2.b) {
            return false;
         } else {
            for(int var4 = 0; var4 < var3; ++var4) {
               if (this.a[var4] != var2.a[var4]) {
                  return false;
               }
            }

            return true;
         }
      }
   }

   public String toString() {
      if (this.b == 0) {
         return "[]";
      } else {
         short[] var1 = this.a;
         StringBuilder var2 = new StringBuilder(32);
         var2.append('[');
         var2.append(var1[0]);

         for(int var3 = 1; var3 < this.b; ++var3) {
            var2.append(", ");
            var2.append(var1[var3]);
         }

         var2.append(']');
         return var2.toString();
      }
   }

   public int hashCode() {
      return 42;
   }
}
