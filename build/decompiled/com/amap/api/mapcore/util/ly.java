package com.amap.api.mapcore.util;

import java.util.Locale;

public final class ly {
   public int a = 0;
   public int b = 0;
   public int c = 0;
   public int d = 0;
   public int e = 0;
   public int f = 0;
   public int g = 0;
   public int h = 0;
   public int i = 0;
   public int j = -113;
   public int k = 0;
   public short l = 0;
   public long m = 0L;
   public boolean n = false;
   public boolean o = true;

   public ly(int var1, boolean var2) {
      this.k = var1;
      this.n = var2;
   }

   public final String toString() {
      String var1 = "unknown";
      switch(this.k) {
      case 1:
         var1 = String.format(Locale.CHINA, "GSM lac=%d, cid=%d, mnc=%s, valid=%b, sig=%d, age=%d, reg=%b", this.c, this.d, this.b, this.o, this.j, this.l, this.n);
         break;
      case 2:
         var1 = String.format(Locale.CHINA, "CDMA bid=%d, nid=%d, sid=%d, valid=%b, sig=%d, age=%d, reg=%b", this.i, this.h, this.g, this.o, this.j, this.l, this.n);
         break;
      case 3:
         var1 = String.format(Locale.CHINA, "LTE lac=%d, cid=%d, mnc=%s, valid=%b, sig=%d, age=%d, reg=%b", this.c, this.d, this.b, this.o, this.j, this.l, this.n);
         break;
      case 4:
         var1 = String.format(Locale.CHINA, "WCDMA lac=%d, cid=%d, mnc=%s, valid=%b, sig=%d, age=%d, reg=%b", this.c, this.d, this.b, this.o, this.j, this.l, this.n);
      }

      return var1;
   }

   public final boolean equals(Object var1) {
      if (var1 == null) {
         return false;
      } else if (var1 instanceof ly) {
         ly var2;
         switch((var2 = (ly)var1).k) {
         case 1:
            if (this.k != 1) {
               return false;
            } else {
               if (var2.c == this.c && var2.d == this.d && var2.b == this.b) {
                  return true;
               }

               return false;
            }
         case 2:
            if (this.k != 2) {
               return false;
            } else {
               if (var2.i == this.i && var2.h == this.h && var2.g == this.g) {
                  return true;
               }

               return false;
            }
         case 3:
            if (this.k != 3) {
               return false;
            } else {
               if (var2.c == this.c && var2.d == this.d && var2.b == this.b) {
                  return true;
               }

               return false;
            }
         case 4:
            if (this.k != 4) {
               return false;
            } else {
               if (var2.c == this.c && var2.d == this.d && var2.b == this.b) {
                  return true;
               }

               return false;
            }
         default:
            return false;
         }
      } else {
         return false;
      }
   }

   public final int hashCode() {
      int var1 = String.valueOf(this.k).hashCode();
      if (this.k == 2) {
         var1 += String.valueOf(this.i).hashCode() + String.valueOf(this.h).hashCode() + String.valueOf(this.g).hashCode();
      } else {
         var1 += String.valueOf(this.c).hashCode() + String.valueOf(this.d).hashCode() + String.valueOf(this.b).hashCode();
      }

      return var1;
   }

   public final int a() {
      return this.c;
   }

   public final int b() {
      return this.d;
   }

   public final int c() {
      return this.h;
   }

   public final int d() {
      return this.i;
   }

   public final int e() {
      return this.j;
   }
}
