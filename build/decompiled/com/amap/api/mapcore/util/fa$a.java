package com.amap.api.mapcore.util;

class fa$a {
   private String a;
   private int b;
   private int c;

   public fa$a(String var1, int var2) {
      this.b = 1103515245;
      this.c = 12345;
      this.a = this.a(var1, var2, var1.length());
   }

   public fa$a() {
      this(11);
   }

   public fa$a(int var1) {
      this("ABCDEFGHIJKLMNOPQRSTUVWXYZ", var1);
   }

   public char a(int var1, boolean var2) {
      int var3 = this.a.length();
      int var4 = var2 ? var3 - var1 : var1;
      return this.a.charAt(var4);
   }

   public int a(char var1, boolean var2) {
      int var3 = this.a.length();
      int var4 = this.a.indexOf(var1);
      return var2 ? var3 - var4 : var4;
   }

   public int a(int var1) {
      long var2 = (long)var1;
      return (int)(var2 * (long)this.b + (long)this.c & 2147483647L);
   }

   public String a(String var1, int var2, int var3) {
      StringBuffer var4 = new StringBuffer(var1);
      int var8 = var1.length();

      for(int var9 = 0; var9 < var3; ++var9) {
         var2 = this.a(var2);
         int var6 = var2 % var8;
         var2 = this.a(var2);
         int var7 = var2 % var8;
         char var5 = var4.charAt(var6);
         var4.setCharAt(var6, var4.charAt(var7));
         var4.setCharAt(var7, var5);
      }

      return var4.toString();
   }

   public String a(boolean var1, int var2, String var3) {
      String var4 = null;
      StringBuilder var5 = new StringBuilder();
      int var7 = this.a.length();
      int var8 = var3.length();

      for(int var9 = 0; var9 < var8; ++var9) {
         int var6 = this.a(var3.charAt(var9), var1);
         if (var6 < 0) {
            break;
         }

         var6 = var6 + var2 + var9;
         var5.append(this.a(var6 % var7, var1));
      }

      if (var5.length() == var8) {
         var4 = var5.toString();
      }

      return var4;
   }

   public String a(int var1, String var2) {
      return this.a(false, var1, var2);
   }
}
