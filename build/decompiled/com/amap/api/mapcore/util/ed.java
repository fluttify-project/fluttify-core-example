package com.amap.api.mapcore.util;

public enum ed {
   a("labels.text.fill", 0),
   b("labels.text.stroke", 1),
   c("geometry.stroke", 2),
   d("geometry.fill", 3),
   e("textFillColor", 0),
   f("textStrokeColor", 1),
   g("strokeColor", 2),
   h("fillColor", 3),
   i("color", 3),
   j("textureName", 3),
   k("backgroundColor", 4),
   l("visible", 5);

   private String m;
   private int n;

   private ed(String var3, int var4) {
      this.m = var3;
      this.n = var4;
   }

   public String a() {
      return this.m;
   }

   public static int a(String var0) {
      ed[] var1 = values();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         ed var4 = var1[var3];
         if (var4.a().equals(var0)) {
            return var4.n;
         }
      }

      return -1;
   }
}
