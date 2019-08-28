package com.amap.api.mapcore.util;

public abstract class cj implements cn {
   protected int a;
   protected bf b;

   public cj(int var1, bf var2) {
      this.a = var1;
      this.b = var2;
   }

   public int b() {
      return this.a;
   }

   public boolean a(cj var1) {
      return var1.b() == this.b();
   }

   public void b(cj var1) {
      cd.a(this.b() + " ==> " + var1.b() + "   " + this.getClass() + "==>" + var1.getClass());
   }

   public void c() {
      cd.a("Wrong call start()  State: " + this.b() + "  " + this.getClass());
   }

   public void d() {
      cd.a("Wrong call continueDownload()  State: " + this.b() + "  " + this.getClass());
   }

   public void e() {
      cd.a("Wrong call pause()  State: " + this.b() + "  " + this.getClass());
   }

   public void a() {
      cd.a("Wrong call delete()  State: " + this.b() + "  " + this.getClass());
   }

   public void a(int var1) {
      cd.a("Wrong call fail()  State: " + this.b() + "  " + this.getClass());
   }

   public void f() {
      cd.a("Wrong call hasNew()  State: " + this.b() + "  " + this.getClass());
   }

   public void g() {
      cd.a("Wrong call complete()  State: " + this.b() + "  " + this.getClass());
   }
}
