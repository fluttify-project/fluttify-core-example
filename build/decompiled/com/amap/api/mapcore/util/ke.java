package com.amap.api.mapcore.util;

import android.content.Context;
import android.text.TextUtils;

public class ke extends kh {
   private Context b;
   private boolean c;
   private int d;
   private int e;

   public ke(Context var1, boolean var2, int var3, int var4) {
      this.b = var1;
      this.c = var2;
      this.d = var3;
      this.e = var4;
   }

   protected boolean a() {
      if (gz.r(this.b) == 1) {
         return true;
      } else if (!this.c) {
         return false;
      } else {
         String var1 = hr.a(this.b, "iKey");
         if (TextUtils.isEmpty(var1)) {
            return true;
         } else {
            String[] var2 = var1.split("\\|");
            if (var2 != null && var2.length >= 2) {
               String var3 = var2[0];
               String var4 = hg.a(System.currentTimeMillis(), "yyyyMMdd");
               if (var4.equals(var3)) {
                  int var5 = Integer.parseInt(var2[1]);
                  return var5 < this.e;
               } else {
                  return true;
               }
            } else {
               hr.b(this.b, "iKey");
               return true;
            }
         }
      }
   }

   public int b() {
      boolean var1 = false;
      int var2;
      if (gz.r(this.b) != 1 && this.d > 0) {
         var2 = this.d;
      } else {
         var2 = Integer.MAX_VALUE;
      }

      return this.a != null ? Math.max(var2, this.a.b()) : var2;
   }

   public void a(int var1) {
      if (gz.r(this.b) != 1) {
         String var2 = hg.a(System.currentTimeMillis(), "yyyyMMdd");
         String var3 = hr.a(this.b, "iKey");
         if (!TextUtils.isEmpty(var3)) {
            String[] var4 = var3.split("\\|");
            if (var4 != null && var4.length >= 2) {
               String var5 = var4[0];
               if (var2.equals(var5)) {
                  int var6 = Integer.parseInt(var4[1]);
                  var1 += var6;
               }
            } else {
               hr.b(this.b, "iKey");
            }
         }

         hr.a(this.b, "iKey", var2 + "|" + var1);
      }
   }
}
