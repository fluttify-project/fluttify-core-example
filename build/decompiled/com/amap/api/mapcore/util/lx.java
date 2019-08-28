package com.amap.api.mapcore.util;

import java.util.ArrayList;
import java.util.HashMap;

public final class lx {
   private HashMap<Long, ly> a = new HashMap();
   private long b = 0L;

   public lx() {
   }

   public final long a(ly var1) {
      if (var1 != null && var1.o) {
         long var3 = 0L;
         HashMap var5 = this.a;
         switch(var1.k) {
         case 1:
         case 3:
         case 4:
            var3 = a(var1.a(), var1.b());
            break;
         case 2:
            var3 = a(var1.c(), var1.d());
         }

         ly var2;
         if ((var2 = (ly)var5.get(var3)) == null) {
            var1.m = mk.b();
            var5.put(var3, var1);
            return 0L;
         } else if (var2.e() != var1.e()) {
            var1.m = mk.b();
            var5.put(var3, var1);
            return 0L;
         } else {
            var1.m = var2.m;
            var5.put(var3, var1);
            return (mk.b() - var2.m) / 1000L;
         }
      } else {
         return 0L;
      }
   }

   public final void a(ArrayList<? extends ly> var1) {
      if (var1 != null) {
         long var2 = mk.b();
         if (this.b > 0L && var2 - this.b < 60000L) {
            return;
         }

         HashMap var4 = this.a;
         long var7 = 0L;
         int var9 = 0;

         ly var5;
         int var10;
         for(var10 = var1.size(); var9 < var10; ++var9) {
            if ((var5 = (ly)var1.get(var9)).o) {
               switch(var5.k) {
               case 1:
               case 3:
               case 4:
                  var7 = a(var5.c, var5.d);
                  break;
               case 2:
                  var7 = a(var5.h, var5.i);
               }

               ly var6;
               if ((var6 = (ly)var4.get(var7)) != null) {
                  if (var6.e() == var5.e()) {
                     var5.m = var6.m;
                  } else {
                     var5.m = var2;
                  }
               }
            }
         }

         var4.clear();
         var9 = 0;

         for(var10 = var1.size(); var9 < var10; ++var9) {
            if ((var5 = (ly)var1.get(var9)).o) {
               switch(var5.k) {
               case 1:
               case 3:
               case 4:
                  var7 = a(var5.a(), var5.b());
                  break;
               case 2:
                  var7 = a(var5.c(), var5.d());
               }

               var4.put(var7, var5);
            }
         }

         this.b = var2;
      }

   }

   public final void a() {
      this.a.clear();
      this.b = 0L;
   }

   private static long a(int var0, int var1) {
      return ((long)var0 & 65535L) << 32 | (long)var1 & 65535L;
   }
}
