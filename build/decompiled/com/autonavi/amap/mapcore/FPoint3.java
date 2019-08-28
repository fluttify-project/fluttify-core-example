package com.autonavi.amap.mapcore;

public class FPoint3 extends FPoint {
   public int colorIndex = -1;

   public FPoint3() {
   }

   public FPoint3(float var1, float var2, int var3) {
      super(var1, var2);
      this.colorIndex = var3;
   }

   public void setColorIndex(int var1) {
      this.colorIndex = var1;
   }
}
