package com.amap.api.mapcore.util;

public class fq<T extends fq<T>> {
   public T f;

   public fq() {
   }

   public static <T extends fq<?>> T a(T var0, T var1) {
      if (var1.f != null) {
         throw new IllegalArgumentException("'item' is a list");
      } else {
         var1.f = var0;
         return var1;
      }
   }
}
