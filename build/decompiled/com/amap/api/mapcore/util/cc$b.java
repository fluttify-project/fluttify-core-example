package com.amap.api.mapcore.util;

class cc$b {
   private String a;
   private String b;
   private by c = null;
   private cc$a d = new cc$a();
   private String e;

   public cc$b(bz var1, by var2) {
      this.a = var1.B();
      this.b = var1.C();
      this.c = var2;
   }

   public void a(String var1) {
      if (var1.length() > 1) {
         this.e = var1;
      }

   }

   public String a() {
      return this.a;
   }

   public String b() {
      return this.b;
   }

   public String c() {
      return this.e;
   }

   public by d() {
      return this.c;
   }

   public cc$a e() {
      return this.d;
   }

   public void f() {
      this.d.a = true;
   }
}
