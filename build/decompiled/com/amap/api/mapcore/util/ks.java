package com.amap.api.mapcore.util;

import android.content.Context;

public final class ks {
   private kl c;
   public static volatile boolean a = false;
   public static volatile hf b = null;

   public ks() {
   }

   private kl a(Context var1, hf var2, kr var3) {
      if (this.c == null) {
         this.c = new kl(var1, var2, var3);
      }

      return this.c;
   }

   public final boolean a(Context var1, hf var2, kr var3, String var4) {
      return this.b(var1, var2, var3, var4);
   }

   private boolean b(Context var1, hf var2, kr var3, String var4) {
      if (var2 == null) {
         return false;
      } else {
         try {
            kl var6;
            return (var6 = this.a(var1, var2, var3)) == null ? false : var6.b(var4);
         } catch (Throwable var5) {
            kl.a("SoManagerCore ex " + var5);
            return false;
         }
      }
   }
}
