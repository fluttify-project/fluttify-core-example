package com.amap.api.mapcore.util;

public class ij$a {
   private String a;
   private String b;
   private String c;
   private String d;
   private String e;
   private String f = "copy";

   public ij$a(String var1, String var2, String var3, String var4, String var5) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = var4;
      this.e = var5;
   }

   public ij$a a(String var1) {
      this.f = var1;
      return this;
   }

   public ij a() {
      return new ij(this);
   }
}
