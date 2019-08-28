package com.amap.api.mapcore.util;

import android.content.Context;
import android.text.TextUtils;
import java.util.Iterator;

public final class le {
   private volatile ld a = null;
   private String b = "";

   public le() {
   }

   private String a() {
      if (!TextUtils.isEmpty(this.b)) {
         return this.b;
      } else {
         this.b = hc.b("ROLL_BACK_KEY");
         return this.b;
      }
   }

   public final boolean a(Context var1, String var2, String var3) {
      if (var1 == null) {
         return false;
      } else {
         if (this.a == null) {
            this.a = ld.a(kl.a(var1, this.a(), "i"));
         }

         ld var4 = this.a;
         var3 = var3;
         var2 = var2;
         if (var4 != null && var4.a() != null && var4.a().size() != 0) {
            Iterator var7 = var4.a().iterator();

            while(var7.hasNext()) {
               ld$a var8 = (ld$a)var7.next();
               String var6 = var8.a();
               if (!TextUtils.isEmpty(var2) && !TextUtils.isEmpty(var6) ? var2.trim().equalsIgnoreCase(var6.trim()) : false) {
                  var6 = var8.b();
                  if (lj.b(var3, var6)) {
                     return true;
                  }
               }
            }

            return false;
         } else {
            return false;
         }
      }
   }

   public final void b(Context var1, String var2, String var3) {
      if (this.a == null) {
         this.a = ld.a(kl.a(var1, this.a(), "i"));
      }

      this.a.a(var2, var3);
      kl.a(var1, this.a(), "i", this.a.b());
   }
}
