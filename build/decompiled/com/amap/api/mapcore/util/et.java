package com.amap.api.mapcore.util;

public class et {
   public int[] a;
   public int b;
   public boolean c;

   public et() {
      this(true, 16);
   }

   public et(boolean var1, int var2) {
      this.c = var1;
      this.a = new int[var2];
   }

   public void a(int var1) {
      int[] var2 = this.a;
      if (this.b == var2.length) {
         var2 = this.d(Math.max(8, (int)((float)this.b * 1.75F)));
      }

      var2[this.b++] = var1;
   }

   public int b(int var1) {
      if (var1 >= this.b) {
         throw new IndexOutOfBoundsException("index can't be >= size: " + var1 + " >= " + this.b);
      } else {
         int[] var2 = this.a;
         int var3 = var2[var1];
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

   public int[] c(int var1) {
      int var2 = this.b + var1;
      if (var2 > this.a.length) {
         this.d(Math.max(8, var2));
      }

      return this.a;
   }

   protected int[] d(int var1) {
      int[] var2 = new int[var1];
      int[] var3 = this.a;
      System.arraycopy(var3, 0, var2, 0, Math.min(this.b, var2.length));
      this.a = var2;
      return var2;
   }

   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof et)) {
         return false;
      } else {
         et var2 = (et)var1;
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
         int[] var1 = this.a;
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
