package com.autonavi.amap.mapcore;

public class FPointBounds {
   private final int mVersionCode;
   public final FPoint southwest;
   public final FPoint northeast;

   FPointBounds(int var1, FPoint var2, FPoint var3) {
      this.mVersionCode = var1;
      this.southwest = var2;
      this.northeast = var3;
   }

   public FPointBounds(FPoint var1, FPoint var2) {
      this(1, var1, var2);
   }

   int getVersionCode() {
      return this.mVersionCode;
   }

   public static FPointBounds$Builder builder() {
      return new FPointBounds$Builder();
   }

   public boolean contains(FPoint var1) {
      return this.containsy((double)var1.y) && this.containsx((double)var1.x);
   }

   public boolean contains(FPointBounds var1) {
      boolean var2 = false;
      if (var1 == null) {
         return var2;
      } else {
         if (this.contains(var1.southwest) && this.contains(var1.northeast)) {
            var2 = true;
         }

         return var2;
      }
   }

   public boolean intersects(FPointBounds var1) {
      if (var1 == null) {
         return false;
      } else {
         return this.intersect(var1) || var1.intersect(this);
      }
   }

   private boolean intersect(FPointBounds var1) {
      if (var1 != null && var1.northeast != null && var1.southwest != null && this.northeast != null && this.southwest != null) {
         double var2 = (double)(var1.northeast.x + var1.southwest.x - this.northeast.x - this.southwest.x);
         double var4 = (double)(this.northeast.x - this.southwest.x + var1.northeast.x - this.southwest.x);
         double var6 = (double)(var1.northeast.y + var1.southwest.y - this.northeast.y - this.southwest.y);
         double var8 = (double)(this.northeast.y - this.southwest.y + var1.northeast.y - var1.southwest.y);
         return Math.abs(var2) < var4 && Math.abs(var6) < var8;
      } else {
         return false;
      }
   }

   private boolean containsy(double var1) {
      return (double)this.southwest.y <= var1 && var1 <= (double)this.northeast.y;
   }

   private boolean containsx(double var1) {
      if (this.southwest.x <= this.northeast.x) {
         return (double)this.southwest.x <= var1 && var1 <= (double)this.northeast.x;
      } else {
         return (double)this.southwest.x <= var1 || var1 <= (double)this.northeast.x;
      }
   }

   public int hashCode() {
      return super.hashCode();
   }

   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof FPointBounds)) {
         return false;
      } else {
         FPointBounds var2 = (FPointBounds)var1;
         return this.southwest.equals(var2.southwest) && this.northeast.equals(var2.northeast);
      }
   }

   public String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("southwest = (");
      var1.append(this.southwest.x);
      var1.append(",");
      var1.append(this.southwest.y);
      var1.append(") northeast = (");
      var1.append(this.northeast.x);
      var1.append(",");
      var1.append(this.northeast.y);
      var1.append(")");
      return var1.toString();
   }
}
