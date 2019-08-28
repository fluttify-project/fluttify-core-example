package com.amap.api.mapcore.util;

import android.content.Context;
import java.util.Iterator;
import java.util.List;

public class id {
   private hy a;
   private Context b;

   public id(Context var1, boolean var2) {
      this.b = var1;
      this.a = this.a(this.b, var2);
   }

   private hy a(Context var1, boolean var2) {
      hy var3 = null;

      try {
         var3 = new hy(var1, hy.a(ic.class));
      } catch (Throwable var5) {
         if (!var2) {
            ht.c(var5, "sd", "gdb");
         }
      }

      return var3;
   }

   public void a(hf var1) {
      try {
         if (var1 == null) {
            return;
         }

         if (this.a == null) {
            this.a = this.a(this.b, false);
         }

         String var2 = hf.a(var1.a());
         List var3 = this.a.b(var2, hf.class);
         if (var3 != null && var3.size() != 0) {
            if (this.a(var3, var1)) {
               this.a.a((String)var2, (Object)var1);
            }
         } else {
            this.a.a((Object)var1);
         }
      } catch (Throwable var4) {
         ht.c(var4, "sd", "it");
      }

   }

   private boolean a(List<hf> var1, hf var2) {
      Iterator var3 = var1.iterator();

      hf var4;
      do {
         if (!var3.hasNext()) {
            return true;
         }

         var4 = (hf)var3.next();
      } while(!var4.equals(var2));

      return false;
   }

   public List<hf> a() {
      List var1 = null;

      try {
         String var2 = hf.h();
         var1 = this.a.a(var2, hf.class, true);
      } catch (Throwable var3) {
         var3.printStackTrace();
      }

      return var1;
   }
}
