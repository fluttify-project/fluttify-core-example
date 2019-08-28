package com.amap.api.mapcore.util;

import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;
import java.io.File;

public abstract class km {
   protected Context a;
   private String c;
   private hf d;
   protected lh b;
   private String e = null;
   private String f;
   private String g;
   private String h = null;
   private String i;
   private String j = null;
   private String k = null;
   private String l = null;
   private String m = null;

   public km(Context var1, hf var2) {
      this.a = var1;
      this.d = var2;
      this.b = new lh();
   }

   protected abstract String a();

   private String j() {
      if (TextUtils.isEmpty(this.c)) {
         this.c = this.a();
      }

      return this.c;
   }

   protected final String b() {
      if (!TextUtils.isEmpty(this.e)) {
         return this.e;
      } else {
         String var1 = this.d.a() + this.d.b();
         this.e = hc.b(var1);
         return this.e;
      }
   }

   protected final String c() {
      if (!TextUtils.isEmpty(this.f)) {
         return this.f;
      } else if (this.a == null) {
         return "";
      } else {
         File var1 = Environment.getExternalStorageDirectory();
         this.f = this.b.a(var1).b(this.j()).b(this.b()).a();
         return this.f;
      }
   }

   protected final String d() {
      if (!TextUtils.isEmpty(this.g)) {
         return this.g;
      } else if (this.a == null) {
         return "";
      } else {
         String var1 = this.a.getFilesDir().getAbsolutePath();
         this.g = this.b.a(var1).b(this.j()).b(this.b()).a();
         return this.g;
      }
   }

   public final String e() {
      if (!TextUtils.isEmpty(this.h)) {
         return this.h;
      } else if (this.a == null) {
         return "";
      } else {
         this.h = kl.a(this.a, hc.b("png" + this.b()));
         return this.h;
      }
   }

   public final String f() {
      if (!TextUtils.isEmpty(this.j)) {
         return this.j;
      } else {
         this.j = this.b.a(this.c()).b("m").a();
         return this.j;
      }
   }

   public final String g() {
      if (!TextUtils.isEmpty(this.k)) {
         return this.k;
      } else {
         this.k = this.b.a(this.d()).b("i").a();
         return this.k;
      }
   }

   public final String h() {
      if (!TextUtils.isEmpty(this.l)) {
         return this.l;
      } else {
         lh var10001 = this.b;
         String var10002;
         if (!TextUtils.isEmpty(this.i)) {
            var10002 = this.i;
         } else {
            this.i = this.b.a(this.c()).b("h").a();
            var10002 = this.i;
         }

         this.l = var10001.a(var10002).b(this.e()).a();
         return this.l;
      }
   }

   public final String i() {
      if (!TextUtils.isEmpty(this.m)) {
         return this.m;
      } else {
         this.m = this.b.a(this.f()).b(this.e()).a();
         return this.m;
      }
   }
}
