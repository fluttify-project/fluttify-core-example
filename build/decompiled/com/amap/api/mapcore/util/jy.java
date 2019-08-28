package com.amap.api.mapcore.util;

public class jy extends kb {
   private StringBuilder a = new StringBuilder();
   private boolean b = true;

   public jy() {
   }

   public jy(kb var1) {
      super(var1);
   }

   protected byte[] a(byte[] var1) {
      byte[] var2 = hg.a(this.a.toString());
      this.c(var2);
      this.b = true;
      this.a.delete(0, this.a.length());
      return var2;
   }

   public void b(byte[] var1) {
      String var2 = hg.a(var1);
      if (this.b) {
         this.b = false;
      } else {
         this.a.append(",");
      }

      this.a.append("{\"log\":\"").append(var2).append("\"}");
   }
}
