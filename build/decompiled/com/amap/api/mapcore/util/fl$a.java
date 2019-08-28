package com.amap.api.mapcore.util;

import android.graphics.Bitmap;
import java.lang.ref.WeakReference;

public class fl$a extends ei<Boolean, Void, Bitmap> {
   private final WeakReference<du$a> e;

   public fl$a(fl var1, du$a var2) {
      this.d = var1;
      this.e = new WeakReference(var2);
   }

   protected Bitmap a(Boolean... var1) {
      try {
         boolean var2 = var1[0].booleanValue();
         du$a var3 = (du$a)this.e.get();
         if (var3 == null) {
            return null;
         } else {
            StringBuilder var4 = new StringBuilder();
            var4.append(var3.a);
            var4.append("-");
            var4.append(var3.b);
            var4.append("-");
            var4.append(var3.c);
            String var5 = var4.toString();
            Bitmap var6 = null;
            synchronized(fl.a(this.d)) {
               while(this.d.c && !this.d()) {
                  fl.a(this.d).wait();
               }
            }

            if (fl.b(this.d) != null && !this.d() && this.e() != null && !fl.c(this.d)) {
               var6 = fl.b(this.d).b(var5);
            }

            if (var2 && var6 == null && !this.d() && this.e() != null && !fl.c(this.d)) {
               Class var7 = fl.class;
               synchronized(fl.class) {
                  var6 = this.d.a((Object)var3);
               }
            }

            if (var6 != null && fl.b(this.d) != null) {
               fl.b(this.d).a(var5, var6);
            }

            return var6;
         }
      } catch (Throwable var12) {
         var12.printStackTrace();
         return null;
      }
   }

   protected void a(Bitmap var1) {
      try {
         if (this.d() || fl.c(this.d)) {
            var1 = null;
         }

         du$a var2 = this.e();
         if (var1 != null && !var1.isRecycled() && var2 != null) {
            var2.a(var1);
            if (fl.d(this.d) != null) {
               fl.d(this.d).a();
            }
         }
      } catch (Throwable var3) {
         var3.printStackTrace();
      }

   }

   protected void b(Bitmap var1) {
      super.b((Object)var1);
      synchronized(fl.a(this.d)) {
         try {
            fl.a(this.d).notifyAll();
         } catch (Throwable var5) {
            var5.printStackTrace();
         }

      }
   }

   private du$a e() {
      du$a var1 = (du$a)this.e.get();
      fl$a var2 = fl.b(var1);
      return this == var2 ? var1 : null;
   }
}
