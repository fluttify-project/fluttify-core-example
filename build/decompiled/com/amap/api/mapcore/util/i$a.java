package com.amap.api.mapcore.util;

import android.content.Context;
import java.lang.ref.WeakReference;

class i$a implements Runnable {
   private WeakReference<u> a = null;
   private WeakReference<Context> b = null;
   private j c;

   public i$a(u var1, Context var2) {
      this.a = new WeakReference(var1);
      if (var2 != null) {
         this.b = new WeakReference(var2);
      }

   }

   public void run() {
      try {
         if (i.b()) {
            return;
         }

         if (this.c == null && this.b != null && this.b.get() != null) {
            this.c = new j((Context)this.b.get(), "");
         }

         i.c();
         if (i.d() > i.e()) {
            i.a(true);
            this.a();
            return;
         }

         if (this.c != null) {
            j$a var1 = (j$a)this.c.a();
            if (var1 != null) {
               if (!var1.d) {
                  this.a();
               }

               i.a(true);
               return;
            }
         }
      } catch (Throwable var2) {
         ht.c(var2, "authForPro", "loadConfigData_uploadException");
      }

   }

   private void a() {
      if (this.a != null && this.a.get() != null) {
         u var1 = (u)this.a.get();
         if (var1 != null && var1.getMapConfig() != null) {
            var1.queueEvent(new i$a$1(this, var1));
         }
      }

   }
}
