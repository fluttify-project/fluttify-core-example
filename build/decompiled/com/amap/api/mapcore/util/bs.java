package com.amap.api.mapcore.util;

@hz(
   a = "update_item_file"
)
class bs {
   @ia(
      a = "mAdcode",
      b = 6
   )
   private String a = "";
   @ia(
      a = "file",
      b = 6
   )
   private String b = "";

   public bs() {
   }

   public bs(String var1, String var2) {
      this.a = var1;
      this.b = var2;
   }

   public String a() {
      return this.b;
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
