package com.amap.api.mapcore.util;

import android.content.Context;

public class iv {
   private Context b;
   private hf c;
   private volatile le d = new le();
   volatile lc a = new lc();
   private ht$a e = new iv$1(this);

   public iv() {
   }

   public static iv a() {
      return iv$a.a;
   }

   public void a(Context var1) {
      if (var1 != null) {
         this.b = var1.getApplicationContext();
      }
   }

   public void a(hf var1) {
      this.c = var1;
   }

   public void a(String var1) {
      try {
         this.d.b(this.b, this.c.a(), this.c.c());
         this.a.a(this.c);
      } catch (Throwable var2) {
         ;
      }
   }

   public boolean a(String var1, String var2, String var3) {
      return this.d.a(this.b, var1, var3);
   }
}
