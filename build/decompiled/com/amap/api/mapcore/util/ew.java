package com.amap.api.mapcore.util;

import java.nio.FloatBuffer;
import java.nio.ShortBuffer;

public class ew extends fp<ew$a> {
   private ew$a b;

   public ew() {
   }

   public ew$a a(int var1) {
      ew$a var2 = (ew$a)this.a;
      if (var2 == null) {
         var2 = new ew$a();
      } else {
         this.a = var2.f;
         var2.f = null;
      }

      if (var2.e < var1) {
         var2.a(var1);
      }

      this.b = (ew$a)fq.a(this.b, var2);
      return var2;
   }

   public void a() {
      this.b = (ew$a)this.b(this.b);
   }

   public ShortBuffer b(int var1) {
      ew$a var2 = this.a(var1 * 2);
      if (var2.b == null) {
         var2.a.clear();
         var2.b = var2.a.asShortBuffer();
      } else {
         var2.b.clear();
      }

      return var2.b;
   }

   public FloatBuffer c(int var1) {
      ew$a var2 = this.a(var1 * 4);
      if (var2.c == null) {
         var2.a.clear();
         var2.c = var2.a.asFloatBuffer();
      } else {
         var2.c.clear();
      }

      var2.c.clear();
      return var2.c;
   }
}
