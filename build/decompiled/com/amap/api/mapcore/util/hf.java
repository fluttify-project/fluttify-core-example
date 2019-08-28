package com.amap.api.mapcore.util;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

@hz(
   a = "a"
)
public class hf {
   @ia(
      b = 6,
      a = "a1"
   )
   private String a;
   @ia(
      b = 6,
      a = "a2"
   )
   private String b;
   @ia(
      b = 2,
      a = "a6"
   )
   private int c;
   @ia(
      b = 6,
      a = "a3"
   )
   private String d;
   @ia(
      b = 6,
      a = "a4"
   )
   private String e;
   @ia(
      b = 6,
      a = "a5"
   )
   private String f;
   private String g;
   private String h;
   private String i;
   private String j;
   private String k;
   private String[] l;

   private hf() {
      this.c = 1;
      this.l = null;
   }

   private hf(hf$a var1) {
      this.c = 1;
      this.l = null;
      this.g = hf$a.a(var1);
      this.h = hf$a.b(var1);
      this.j = hf$a.c(var1);
      this.i = hf$a.d(var1);
      this.c = hf$a.e(var1) ? 1 : 0;
      this.k = hf$a.f(var1);
      this.l = hf$a.g(var1);
      this.b = hg.b(this.h);
      this.a = hg.b(this.j);
      this.d = hg.b(this.i);
      this.e = hg.b(this.a(this.l));
      this.f = hg.b(this.k);
   }

   public void a(boolean var1) {
      this.c = var1 ? 1 : 0;
   }

   public String a() {
      if (TextUtils.isEmpty(this.j) && !TextUtils.isEmpty(this.a)) {
         this.j = hg.c(this.a);
      }

      return this.j;
   }

   public String b() {
      return this.g;
   }

   public String c() {
      if (TextUtils.isEmpty(this.h) && !TextUtils.isEmpty(this.b)) {
         this.h = hg.c(this.b);
      }

      return this.h;
   }

   public String d() {
      if (TextUtils.isEmpty(this.i) && !TextUtils.isEmpty(this.d)) {
         this.i = hg.c(this.d);
      }

      return this.i;
   }

   public String e() {
      if (TextUtils.isEmpty(this.k) && !TextUtils.isEmpty(this.f)) {
         this.k = hg.c(this.f);
      }

      if (TextUtils.isEmpty(this.k)) {
         this.k = "standard";
      }

      return this.k;
   }

   public boolean f() {
      return this.c == 1;
   }

   public String[] g() {
      if ((this.l == null || this.l.length == 0) && !TextUtils.isEmpty(this.e)) {
         this.l = this.b(hg.c(this.e));
      }

      return (String[])this.l.clone();
   }

   private String[] b(String var1) {
      try {
         String[] var2 = var1.split(";");
         return var2;
      } catch (Throwable var3) {
         var3.printStackTrace();
         return null;
      }
   }

   private String a(String[] var1) {
      try {
         if (var1 == null) {
            return null;
         } else {
            StringBuilder var2 = new StringBuilder();
            String[] var3 = var1;
            int var4 = var1.length;

            for(int var5 = 0; var5 < var4; ++var5) {
               String var6 = var3[var5];
               var2.append(var6).append(";");
            }

            return var2.toString();
         }
      } catch (Throwable var7) {
         var7.printStackTrace();
         return null;
      }
   }

   public static String a(String var0) {
      HashMap var1 = new HashMap();
      var1.put("a1", hg.b(var0));
      return hy.a((Map)var1);
   }

   public static String h() {
      return "a6=1";
   }

   public boolean equals(Object var1) {
      if (var1 == null) {
         return false;
      } else if (var1 == this) {
         return true;
      } else if (this.getClass() != var1.getClass()) {
         return false;
      } else {
         hf var2 = (hf)var1;
         return this.hashCode() == var2.hashCode();
      }
   }

   public int hashCode() {
      hp var1 = new hp();
      var1.a((Object)this.j).a((Object)this.g).a((Object)this.h).a((Object[])this.l);
      return var1.a();
   }
}
