package com.amap.api.mapcore.util;

@hz(
   a = "update_item_download_info"
)
class br {
   @ia(
      a = "mAdcode",
      b = 6
   )
   private String a = "";
   @ia(
      a = "fileLength",
      b = 5
   )
   private long b = 0L;
   @ia(
      a = "splitter",
      b = 2
   )
   private int c = 0;
   @ia(
      a = "startPos",
      b = 5
   )
   private long d = 0L;
   @ia(
      a = "endPos",
      b = 5
   )
   private long e = 0L;

   public br() {
   }

   public br(String var1, long var2, int var4, long var5, long var7) {
      this.a = var1;
      this.b = var2;
      this.c = var4;
      this.d = var5;
      this.e = var7;
   }

   public static String a(String var0) {
      StringBuilder var1 = new StringBuilder();
      var1.append("mAdcode");
      var1.append("='");
      var1.append(var0);
      var1.append("'");
      return var1.toString();
   }
}
