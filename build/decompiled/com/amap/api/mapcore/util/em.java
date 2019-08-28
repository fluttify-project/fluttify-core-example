package com.amap.api.mapcore.util;

import com.autonavi.amap.mapcore.DPoint;

public class em {
   public final double a;
   public final double b;
   public final double c;
   public final double d;
   public final double e;
   public final double f;

   public em(double var1, double var3, double var5, double var7) {
      this.a = var1;
      this.b = var5;
      this.c = var3;
      this.d = var7;
      this.e = (var1 + var3) / 2.0D;
      this.f = (var5 + var7) / 2.0D;
   }

   public boolean a(double var1, double var3) {
      return this.a <= var1 && var1 <= this.c && this.b <= var3 && var3 <= this.d;
   }

   public boolean a(DPoint var1) {
      return this.a(var1.x, var1.y);
   }

   public boolean a(double var1, double var3, double var5, double var7) {
      return var1 < this.c && this.a < var3 && var5 < this.d && this.b < var7;
   }

   public boolean a(em var1) {
      return this.a(var1.a, var1.c, var1.b, var1.d);
   }

   public boolean b(em var1) {
      return var1.a >= this.a && var1.c <= this.c && var1.b >= this.b && var1.d <= this.d;
   }
}
