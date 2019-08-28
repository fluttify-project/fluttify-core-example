package com.amap.api.mapcore.util;

public class fw$a {
   private String a;
   private Object b;
   private Class<?>[] c;
   private Object[] d;

   public fw$a(Object var1, String var2, Object... var3) {
      this.b = var1;
      this.a = var2;
      if (var3 != null && var3.length > 0) {
         this.c = new Class[var3.length];

         int var4;
         for(var4 = 0; var4 < var3.length; ++var4) {
            this.c[var4] = var3[var4].getClass();
         }

         this.d = new Object[var3.length];

         for(var4 = 0; var4 < var3.length; ++var4) {
            this.d[var4] = var3[var4];
         }
      }

   }
}
