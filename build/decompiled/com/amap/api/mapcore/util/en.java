package com.amap.api.mapcore.util;

public class en {
   private final fe a = new fe();
   private short[] b;
   private double[] c;
   private int d;
   private final et e = new et();
   private final fe f = new fe();

   public en() {
   }

   public fe a(double[] var1) {
      return this.a(var1, 0, var1.length);
   }

   public fe a(double[] var1, int var2, int var3) {
      this.c = var1;
      int var4 = this.d = var3 / 2;
      int var5 = var2 / 2;
      fe var6 = this.a;
      var6.a();
      var6.c(var4);
      var6.b = var4;
      short[] var7 = this.b = var6.a;
      int var8 = 0;

      int var9;
      for(var9 = var4 - 1; var8 < var4; ++var8) {
         var7[var8] = (short)(var5 + var9 - var8);
      }

      et var11 = this.e;
      var11.a();
      var11.c(var4);
      var9 = 0;

      for(int var10 = var4; var9 < var10; ++var9) {
         var11.a(this.a(var9));
      }

      fe var12 = this.f;
      var12.a();
      var12.c(Math.max(0, var4 - 2) * 3);
      this.a();
      return var12;
   }

   private void a() {
      int[] var1 = this.e.a;

      byte var2;
      int var5;
      for(var2 = 3; this.d > var2; var1[var5] = this.a(var5)) {
         int var3 = this.b();
         this.c(var3);
         int var4 = this.d(var3);
         var5 = var3 == this.d ? 0 : var3;
         var1[var4] = this.a(var4);
      }

      if (this.d == var2) {
         fe var6 = this.f;
         short[] var7 = this.b;
         var6.a(var7[0]);
         var6.a(var7[1]);
         var6.a(var7[2]);
      }

   }

   private int a(int var1) {
      short[] var2 = this.b;
      int var3 = var2[this.d(var1)] * 2;
      int var4 = var2[var1] * 2;
      int var5 = var2[this.e(var1)] * 2;
      double[] var6 = this.c;
      return a(var6[var3], var6[var3 + 1], var6[var4], var6[var4 + 1], var6[var5], var6[var5 + 1]);
   }

   private int b() {
      int var1 = this.d;

      for(int var2 = 0; var2 < var1; ++var2) {
         if (this.b(var2)) {
            return var2;
         }
      }

      int[] var4 = this.e.a;

      for(int var3 = 0; var3 < var1; ++var3) {
         if (var4[var3] != -1) {
            return var3;
         }
      }

      return 0;
   }

   private boolean b(int var1) {
      int[] var2 = this.e.a;
      if (var2[var1] == -1) {
         return false;
      } else {
         int var3 = this.d(var1);
         int var4 = this.e(var1);
         short[] var5 = this.b;
         int var6 = var5[var3] * 2;
         int var7 = var5[var1] * 2;
         int var8 = var5[var4] * 2;
         double[] var9 = this.c;
         double var10 = var9[var6];
         double var12 = var9[var6 + 1];
         double var14 = var9[var7];
         double var16 = var9[var7 + 1];
         double var18 = var9[var8];
         double var20 = var9[var8 + 1];

         for(int var22 = this.e(var4); var22 != var3; var22 = this.e(var22)) {
            if (var2[var22] != 1) {
               int var23 = var5[var22] * 2;
               double var24 = var9[var23];
               double var26 = var9[var23 + 1];
               if (a(var18, var20, var10, var12, var24, var26) >= 0 && a(var10, var12, var14, var16, var24, var26) >= 0 && a(var14, var16, var18, var20, var24, var26) >= 0) {
                  return false;
               }
            }
         }

         return true;
      }
   }

   private void c(int var1) {
      short[] var2 = this.b;
      fe var3 = this.f;
      var3.a(var2[this.d(var1)]);
      var3.a(var2[var1]);
      var3.a(var2[this.e(var1)]);
      this.a.b(var1);
      this.e.b(var1);
      --this.d;
   }

   private int d(int var1) {
      return (var1 == 0 ? this.d : var1) - 1;
   }

   private int e(int var1) {
      return (var1 + 1) % this.d;
   }

   private static int a(double var0, double var2, double var4, double var6, double var8, double var10) {
      double var12 = var0 * (var10 - var6);
      var12 += var4 * (var2 - var10);
      var12 += var8 * (var6 - var2);
      return (int)Math.signum(var12);
   }
}
