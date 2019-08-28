package com.amap.api.maps.model;

public enum PolylineOptions$LineJoinType {
   LineJoinBevel(0),
   LineJoinMiter(1),
   LineJoinRound(2);

   private int type;

   private PolylineOptions$LineJoinType(int var3) {
      this.type = var3;
   }

   public int getTypeValue() {
      return this.type;
   }

   public static PolylineOptions$LineJoinType valueOf(int var0) {
      PolylineOptions$LineJoinType[] var1 = values();
      var0 = Math.max(0, Math.min(var0, var1.length));
      return var1[var0];
   }
}
