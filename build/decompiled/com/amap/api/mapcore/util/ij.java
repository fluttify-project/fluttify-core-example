package com.amap.api.mapcore.util;

import java.util.HashMap;
import java.util.Map;

@hz(
   a = "file"
)
public class ij {
   @ia(
      a = "fname",
      b = 6
   )
   private String a;
   @ia(
      a = "md",
      b = 6
   )
   private String b;
   @ia(
      a = "sname",
      b = 6
   )
   private String c;
   @ia(
      a = "version",
      b = 6
   )
   private String d;
   @ia(
      a = "dversion",
      b = 6
   )
   private String e;
   @ia(
      a = "status",
      b = 6
   )
   private String f;

   public ij(ij$a var1) {
      this.a = ij$a.a(var1);
      this.b = ij$a.b(var1);
      this.c = ij$a.c(var1);
      this.d = ij$a.d(var1);
      this.e = ij$a.e(var1);
      this.f = ij$a.f(var1);
   }

   private ij() {
   }

   public static String a(String var0, String var1) {
      HashMap var2 = new HashMap();
      var2.put("sname", var0);
      var2.put("dversion", var1);
      return hy.a((Map)var2);
   }

   public static String b(String var0, String var1) {
      HashMap var2 = new HashMap();
      var2.put("sname", var0);
      var2.put("status", var1);
      return hy.a((Map)var2);
   }

   public static String a(String var0) {
      HashMap var1 = new HashMap();
      var1.put("sname", var0);
      return hy.a((Map)var1);
   }

   public static String b(String var0) {
      HashMap var1 = new HashMap();
      var1.put("fname", var0);
      return hy.a((Map)var1);
   }

   public static String a(String var0, String var1, String var2, String var3) {
      HashMap var4 = new HashMap();
      var4.put("fname", var0);
      var4.put("sname", var1);
      var4.put("dversion", var3);
      var4.put("version", var2);
      return hy.a((Map)var4);
   }

   public String a() {
      return this.a;
   }

   public String b() {
      return this.b;
   }

   public String c() {
      return this.c;
   }

   public String d() {
      return this.d;
   }

   public String e() {
      return this.e;
   }

   public String f() {
      return this.f;
   }

   public void c(String var1) {
      this.f = var1;
   }
}
