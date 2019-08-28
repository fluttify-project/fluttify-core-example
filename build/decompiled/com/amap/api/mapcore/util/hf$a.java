package com.amap.api.mapcore.util;

public class hf$a {
   private String a;
   private String b;
   private String c;
   private String d;
   private boolean e = true;
   private String f = "standard";
   private String[] g = null;

   public hf$a(String var1, String var2, String var3) {
      this.a = var2;
      this.b = var2;
      this.d = var3;
      this.c = var1;
   }

   public hf$a a(String[] var1) {
      if (var1 != null) {
         this.g = (String[])var1.clone();
      }

      return this;
   }

   public hf$a a(String var1) {
      this.b = var1;
      return this;
   }

   public hf a() throws gt {
      if (this.g == null) {
         throw new gt("sdk packages is null");
      } else {
         return new hf(this, (hf$1)null);
      }
   }
}
