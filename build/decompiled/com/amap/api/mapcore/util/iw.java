package com.amap.api.mapcore.util;

import android.content.Context;
import android.text.TextUtils;
import java.lang.ref.WeakReference;

public class iw {
   private WeakReference<Context> a;
   private ks b;

   public static iw a() {
      return iw$a.a;
   }

   private iw() {
      this.b = new ks();
   }

   public boolean a(Context var1, hf var2, kr var3, String var4) {
      if (TextUtils.isEmpty(var4)) {
         return false;
      } else if (var2 != null && var3 != null && var1 != null) {
         if (!TextUtils.isEmpty(var2.c()) && !TextUtils.isEmpty(var2.b()) && !var2.b().equals(var2.c())) {
            if (!is.a(var2)) {
               a(var4);
               return false;
            } else if (!lj.b(var2.b(), var3.a())) {
               a(var4);
               return false;
            } else {
               this.a(var1);
               return this.b.a(this.a == null ? null : (Context)this.a.get(), var2, var3, var4);
            }
         } else {
            a(var4);
            return false;
         }
      } else {
         a(var4);
         return false;
      }
   }

   private static boolean a(String var0) {
      if (TextUtils.isEmpty(var0)) {
         return false;
      } else {
         try {
            System.loadLibrary(var0);
            return true;
         } catch (Throwable var1) {
            return false;
         }
      }
   }

   private void a(Context var1) {
      if (var1 != null && var1.getApplicationContext() != null) {
         this.a = null;
         this.a = new WeakReference(var1.getApplicationContext());
      }
   }
}
