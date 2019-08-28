package com.amap.api.mapcore.util;

class ie$a implements Runnable {
   private int b;
   private hy c;
   private String d;

   ie$a(ie var1, int var2) {
      this.a = var1;
      this.b = var2;
   }

   ie$a(ie var1, hy var2, int var3) {
      this.a = var1;
      this.b = var3;
      this.c = var2;
   }

   public void run() {
      switch(this.b) {
      case 0:
         try {
            if (this.a.b()) {
               js var1 = new js(this.a.e, this.a.b.a(), this.a.b.b(), "O008");
               String var2 = "{\"param_int_first\":0}";
               var1.a(var2);
               jt.a(var1, this.a.e);
               ie.a(this.a).a(this.a);
            }
         } catch (Throwable var5) {
            in.a(var5, "dDownLoad", "run()");
         }
         break;
      case 1:
      case 2:
         try {
            ig.a(this.a.e, this.c, this.a.b, this.a.c, this.a.a.e);
            ig.a(this.a.e, this.a.b);
         } catch (Throwable var4) {
            in.a(var4, "dDownLoad", "onFinish2");
         }
         break;
      case 3:
         try {
            ig.a(this.a.e, this.c, this.a.b, this.a.c, this.d);
            ig.a(this.a.e, this.a.b);
         } catch (Throwable var3) {
            in.a(var3, "dDownLoad", "processDownloadedFile()");
         }
      }

   }
}
