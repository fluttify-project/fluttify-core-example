package com.amap.api.mapcore.util;

import java.util.List;

public abstract class kz {
   public kz() {
   }

   protected abstract List<kz$a> a();

   protected abstract boolean b();

   public final int c() {
      if (!this.b()) {
         return 1004;
      } else {
         List var1;
         return (var1 = this.a()) != null && var1.size() != 0 ? this.a(var1) : 1001;
      }
   }

   private int a(List<kz$a> var1) {
      for(int var2 = 0; var2 < var1.size(); ++var2) {
         kz$a var3;
         if ((var3 = (kz$a)var1.get(var2)) == null) {
            return a(var1, var2);
         }

         try {
            if (var3.a() != 1000) {
               return a(var1, var2);
            }
         } catch (Throwable var4) {
            return a(var1, var2);
         }
      }

      return 1000;
   }

   private static int a(List<kz$a> var0, int var1) {
      for(int var2 = 0; var2 < var0.size() && var2 <= var1; ++var2) {
         kz$a var3;
         if ((var3 = (kz$a)var0.get(var2)) != null) {
            try {
               var3.b();
            } catch (Throwable var4) {
               ht.c(var4, "po", "s0");
            }
         }
      }

      return 1003;
   }
}
