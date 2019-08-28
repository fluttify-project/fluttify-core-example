package com.amap.api.mapcore.util;

import java.lang.ref.WeakReference;
import java.util.List;

class du$b extends ei<Void, Void, List<du$a>> {
   private int d;
   private boolean e;
   private int f = 256;
   private int g = 256;
   private int h = 0;
   private WeakReference<u> i;
   private List<du$a> j;
   private boolean k;
   private WeakReference<ah> l;
   private WeakReference<fj> m;

   public du$b(boolean var1, u var2, int var3, int var4, int var5, List<du$a> var6, boolean var7, ah var8, fj var9) {
      this.e = var1;
      this.i = new WeakReference(var2);
      this.f = var3;
      this.g = var4;
      this.h = var5;
      this.j = var6;
      this.k = var7;
      this.l = new WeakReference(var8);
      this.m = new WeakReference(var9);
   }

   protected List<du$a> a(Void... var1) {
      try {
         u var4 = (u)this.i.get();
         if (var4 == null) {
            return null;
         } else {
            int var2 = var4.getMapWidth();
            int var3 = var4.getMapHeight();
            this.d = (int)var4.g();
            return var2 > 0 && var3 > 0 ? du.a(var4, this.d, this.f, this.g, this.h, (ah)this.l.get(), (fj)this.m.get()) : null;
         }
      } catch (Throwable var5) {
         var5.printStackTrace();
         return null;
      }
   }

   protected void a(List<du$a> var1) {
      if (var1 != null) {
         try {
            int var2 = var1.size();
            if (var2 <= 0) {
               return;
            }

            du.a((u)this.i.get(), var1, this.d, this.e, this.j, this.k, (ah)this.l.get(), (fj)this.m.get());
            var1.clear();
            var1 = null;
         } catch (Throwable var3) {
            var3.printStackTrace();
         }

      }
   }
}
