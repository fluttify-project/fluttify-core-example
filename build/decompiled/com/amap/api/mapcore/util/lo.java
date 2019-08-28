package com.amap.api.mapcore.util;

import android.text.TextUtils;

public final class lo {
   private static lo b = null;
   private ls c = null;
   private long d = 0L;
   private long e = 0L;
   long a = 0L;

   private lo() {
   }

   public static synchronized lo a() {
      if (b == null) {
         b = new lo();
      }

      return b;
   }

   public final ls a(ls var1) {
      if (mk.b() - this.a > 30000L) {
         this.c = var1;
         this.a = mk.b();
         return this.c;
      } else {
         this.a = mk.b();
         if (lw.a(this.c) && lw.a(var1)) {
            if (var1.getTime() == this.c.getTime() && var1.getAccuracy() < 300.0F) {
               return var1;
            } else if (var1.getProvider().equalsIgnoreCase("gps")) {
               this.d = mk.b();
               this.c = var1;
               return this.c;
            } else if (var1.c() != this.c.c()) {
               this.d = mk.b();
               this.c = var1;
               return this.c;
            } else if (!var1.getBuildingId().equals(this.c.getBuildingId()) && !TextUtils.isEmpty(var1.getBuildingId())) {
               this.d = mk.b();
               this.c = var1;
               return this.c;
            } else {
               double[] var2;
               (var2 = new double[4])[0] = var1.getLatitude();
               var2[1] = var1.getLongitude();
               var2[2] = this.c.getLatitude();
               var2[3] = this.c.getLongitude();
               float var10 = mk.a(var2);
               float var3 = this.c.getAccuracy();
               float var4;
               float var5 = (var4 = var1.getAccuracy()) - var3;
               long var6;
               long var8 = (var6 = mk.b()) - this.d;
               if ((var3 >= 101.0F || var4 <= 299.0F) && (var3 <= 299.0F || var4 <= 299.0F)) {
                  if (var4 < 101.0F && var3 > 299.0F) {
                     this.d = var6;
                     this.c = var1;
                     this.e = 0L;
                     return this.c;
                  } else {
                     if (var4 <= 299.0F) {
                        this.e = 0L;
                     }

                     if (var10 < 10.0F && (double)var10 > 0.1D && var4 > 5.0F) {
                        if (var5 >= -300.0F) {
                           return this.c;
                        } else if (var3 / var4 >= 2.0F) {
                           this.d = var6;
                           this.c = var1;
                           return this.c;
                        } else {
                           return this.c;
                        }
                     } else if (var5 >= 300.0F) {
                        if (var8 >= 30000L) {
                           this.d = mk.b();
                           this.c = var1;
                           return this.c;
                        } else {
                           return this.c;
                        }
                     } else {
                        this.d = mk.b();
                        this.c = var1;
                        return this.c;
                     }
                  }
               } else {
                  if (this.e == 0L) {
                     this.e = var6;
                  } else if (var6 - this.e > 30000L) {
                     this.d = var6;
                     this.c = var1;
                     this.e = 0L;
                     return this.c;
                  }

                  return this.c;
               }
            }
         } else {
            this.d = mk.b();
            this.c = var1;
            return this.c;
         }
      }
   }

   public static ls b(ls var0) {
      return var0;
   }
}
