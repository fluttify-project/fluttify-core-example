package com.amap.api.mapcore.util;

public abstract class kh {
   kh a;

   public kh() {
   }

   public kh(kh var1) {
      this.a = var1;
   }

   public boolean c() {
      boolean var1 = this.d();
      return !var1 ? false : this.a();
   }

   private boolean d() {
      return this.a != null ? this.a.c() : true;
   }

   public void a(boolean var1) {
      if (this.a != null) {
         this.a.a(var1);
      }

   }

   protected abstract boolean a();

   public int b() {
      int var1 = Integer.MAX_VALUE;
      if (this.a != null) {
         var1 = this.a.b();
      }

      return Math.min(Integer.MAX_VALUE, var1);
   }

   public void a(int var1) {
      if (this.a != null) {
         this.a.a(var1);
      }

   }
}
