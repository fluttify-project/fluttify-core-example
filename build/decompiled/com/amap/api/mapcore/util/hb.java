package com.amap.api.mapcore.util;

import android.content.Context;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Build.VERSION;
import android.text.TextUtils;

public class hb {
   private volatile hb$b a = new hb$b((hb$1)null);
   private ix b = new ix("HttpsDecisionUtil");

   public static hb a() {
      return hb$a.a;
   }

   public hb() {
   }

   public void a(Context var1) {
      if (this.a == null) {
         this.a = new hb$b((hb$1)null);
      }

      this.a.a(this.c(var1));
      this.a.a(var1);
   }

   public void b(Context var1) {
      this.d(var1);
   }

   public void a(boolean var1) {
      if (this.a == null) {
         this.a = new hb$b((hb$1)null);
      }

      this.a.b(var1);
   }

   void a(Context var1, boolean var2) {
      if (this.a == null) {
         this.a = new hb$b((hb$1)null);
      }

      this.b(var1, var2);
      this.a.a(var2);
   }

   public boolean b() {
      if (this.a == null) {
         this.a = new hb$b((hb$1)null);
      }

      return this.a.a();
   }

   private void b(Context var1, boolean var2) {
      this.b.a(var1, "isTargetRequired", var2);
   }

   private boolean c(Context var1) {
      return this.b.b(var1, "isTargetRequired", true);
   }

   private void d(Context var1) {
      this.b.a(var1, "isTargetRequired", true);
   }

   public static String a(String var0) {
      if (!TextUtils.isEmpty(var0) && !var0.startsWith("https")) {
         try {
            Builder var1 = Uri.parse(var0).buildUpon();
            var1.scheme("https");
            return var1.build().toString();
         } catch (Throwable var2) {
            return var0;
         }
      } else {
         return var0;
      }
   }

   public static boolean c() {
      return VERSION.SDK_INT == 19;
   }

   public boolean b(boolean var1) {
      if (c()) {
         return false;
      } else {
         boolean var2 = var1 || this.b();
         return var2;
      }
   }
}
