package com.amap.api.mapcore.util;

import com.autonavi.amap.mapcore.IPoint;

public class bb {
   public int a;
   public int b;
   public int c;
   public int d;
   public int e;
   public int f;

   public bb(int var1, int var2, int var3, int var4) {
      this.a(var1, var2, var3, var4);
   }

   public void a(int var1, int var2, int var3, int var4) {
      this.a = var1;
      this.b = var3;
      this.c = var2;
      this.d = var4;
      this.e = (var1 + var2) / 2;
      this.f = (var3 + var4) / 2;
   }

   public boolean a(int var1, int var2) {
      return this.a <= var1 && var1 <= this.c && this.b <= var2 && var2 <= this.d;
   }

   public boolean a(IPoint var1) {
      return var1 == null ? false : this.a(var1.x, var1.y);
   }

   public boolean b(int var1, int var2, int var3, int var4) {
      return var1 < this.c && this.a < var2 && var3 < this.d && this.b < var4;
   }

   public boolean a(bb var1) {
      return var1 == null ? false : this.b(var1.a, var1.c, var1.b, var1.d);
   }
}
