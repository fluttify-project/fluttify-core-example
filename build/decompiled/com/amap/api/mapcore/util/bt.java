package com.amap.api.mapcore.util;

@hz(
   a = "update_item"
)
public class bt {
   @ia(
      a = "title",
      b = 6
   )
   protected String a = null;
   @ia(
      a = "url",
      b = 6
   )
   protected String b = null;
   @ia(
      a = "mAdcode",
      b = 6
   )
   protected String c = null;
   @ia(
      a = "fileName",
      b = 6
   )
   protected String d = null;
   @ia(
      a = "version",
      b = 6
   )
   protected String e = "";
   @ia(
      a = "lLocalLength",
      b = 5
   )
   protected long f = 0L;
   @ia(
      a = "lRemoteLength",
      b = 5
   )
   protected long g = 0L;
   @ia(
      a = "localPath",
      b = 6
   )
   protected String h;
   @ia(
      a = "isProvince",
      b = 2
   )
   protected int i = 0;
   @ia(
      a = "mCompleteCode",
      b = 2
   )
   protected int j;
   @ia(
      a = "mCityCode",
      b = 6
   )
   protected String k = "";
   @ia(
      a = "mState",
      b = 2
   )
   public int l;
   @ia(
      a = "mPinyin",
      b = 6
   )
   public String m = "";

   public bt() {
   }

   public String d() {
      return this.a;
   }

   public String e() {
      return this.e;
   }

   public String f() {
      return this.c;
   }

   public void c(String var1) {
      this.c = var1;
   }

   public String g() {
      return this.b;
   }

   public int h() {
      return this.j;
   }

   public void d(String var1) {
      this.k = var1;
   }

   public String i() {
      return this.m;
   }

   public static String e(String var0) {
      StringBuilder var1 = new StringBuilder();
      var1.append("mAdcode");
      var1.append("='");
      var1.append(var0);
      var1.append("'");
      return var1.toString();
   }

   public static String f(String var0) {
      StringBuilder var1 = new StringBuilder();
      var1.append("mPinyin");
      var1.append("='");
      var1.append(var0);
      var1.append("'");
      return var1.toString();
   }
}
