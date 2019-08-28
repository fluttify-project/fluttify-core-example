package com.amap.api.mapcore.util;

public abstract class fp<T extends fq<?>> {
   protected T a;

   public fp() {
   }

   protected boolean a(T var1) {
      return true;
   }

   public T b(T var1) {
      if (var1 == null) {
         return null;
      } else {
         while(var1 != null) {
            fq var2 = var1.f;
            this.a(var1);
            var1.f = this.a;
            this.a = var1;
            var1 = var2;
         }

         return null;
      }
   }
}
