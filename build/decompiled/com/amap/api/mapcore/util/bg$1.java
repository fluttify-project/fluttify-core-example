package com.amap.api.mapcore.util;

class bg$1 implements Runnable {
   bg$1(bg var1, String var2) {
      this.b = var1;
      this.a = var2;
   }

   public void run() {
      bf var1 = bg.a(this.b, this.a);

      try {
         if (var1 != null) {
            if (var1.c().equals(var1.c) || var1.c().equals(var1.e)) {
               return;
            }

            String var2 = var1.getPinyin();
            if (var2.length() > 0) {
               String var3 = bg.a(this.b).d(var2);
               if (var3 == null) {
                  var3 = var1.getVersion();
               }

               if (bg.d.length() > 0 && var3 != null && bg.a(this.b, bg.d, var3)) {
                  var1.j();
               }
            }
         }

         bg.b(this.b);
         bi var25 = new bi(bg.c(this.b), bg.d);
         bh var26 = (bh)var25.c();
         if (bg.d(this.b) != null) {
            if (var26 == null) {
               return;
            }

            if (var26.a()) {
               this.b.b();
            }
         }
      } catch (Exception var23) {
         ;
      } finally {
         if (bg.d(this.b) != null) {
            bg var6 = this.b;
            synchronized(this.b) {
               try {
                  bg.d(this.b).b(var1);
               } catch (Throwable var21) {
                  ht.c(var21, "OfflineDownloadManager", "checkUpdatefinally");
               }
            }
         }

      }

   }
}
