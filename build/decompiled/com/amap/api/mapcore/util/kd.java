package com.amap.api.mapcore.util;

import java.io.File;

public class kd extends kh {
   private int b;
   private String c;

   public kd(int var1, String var2, kh var3) {
      super(var3);
      this.b = var1;
      this.c = var2;
   }

   protected boolean a() {
      return this.a(this.c) >= this.b;
   }

   public int a(String var1) {
      int var2 = 0;

      try {
         File var3 = new File(var1);
         if (!var3.exists()) {
            return 0;
         }

         var2 = var3.list().length;
      } catch (Throwable var4) {
         ht.c(var4, "fus", "gfn");
      }

      return var2;
   }
}
