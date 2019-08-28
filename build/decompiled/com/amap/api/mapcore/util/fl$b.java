package com.amap.api.mapcore.util;

public class fl$b extends ei<Object, Void, Void> {
   protected fl$b(fl var1) {
      this.d = var1;
   }

   protected Void d(Object... var1) {
      try {
         switch(((Integer)var1[0]).intValue()) {
         case 0:
            this.d.c();
            break;
         case 1:
            this.d.b();
            break;
         case 2:
            this.d.d();
            break;
         case 3:
            this.d.b(((Boolean)var1[1]).booleanValue());
            break;
         case 4:
            this.d.e();
         }
      } catch (Throwable var3) {
         var3.printStackTrace();
      }

      return null;
   }
}
