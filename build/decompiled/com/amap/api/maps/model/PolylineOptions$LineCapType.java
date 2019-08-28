package com.amap.api.maps.model;

public enum PolylineOptions$LineCapType {
   LineCapButt(0),
   LineCapSquare(1),
   LineCapArrow(2),
   LineCapRound(3);

   private int type;

   private PolylineOptions$LineCapType(int var3) {
      this.type = var3;
   }

   public static PolylineOptions$LineCapType valueOf(int var0) {
      PolylineOptions$LineCapType[] var1 = values();
      var0 = Math.max(0, Math.min(var0, var1.length));
      return var1[var0];
   }

   public int getTypeValue() {
      return this.type;
   }
}
